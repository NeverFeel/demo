package com.xinfuli.yy.demo.configuration;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.util.SerializationUtils;

import com.xinfuli.yy.demo.common.RedisProperties;

@Configuration
@EnableConfigurationProperties(RedisProperties.class)
public class RedisConfiguration {

	@Autowired
	private RedisProperties redisProperties;

	@Bean
	public JedisConnectionFactory redisConnectionFactory() {
		JedisConnectionFactory redisConnectionFactory = new JedisConnectionFactory();
		// Defaults
		redisConnectionFactory.setHostName(redisProperties.getHost());
		redisConnectionFactory.setPort(redisProperties.getPort());
		redisConnectionFactory.setDatabase(redisProperties.getDatabase());
		redisConnectionFactory.setPassword(redisProperties.getPassword());
		return redisConnectionFactory;
	}

	@Bean
	public RedisTemplate<String, Object> redisTemplate(
			RedisConnectionFactory factory) {
		RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(factory);
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setValueSerializer(new RedisSerializer<Object>() {
			public byte[] serialize(Object object)
					throws SerializationException {
				if (object == null) {
					return new byte[0];
				}
				if (!(object instanceof Serializable)) {
					throw new IllegalArgumentException(
							"RedisSerializer.serialize requires a Serializable payload "
									+ "but received an object of type ["
									+ object.getClass().getName() + "]");
				}
				return SerializationUtils.serialize((Serializable) object);
			}

			public Object deserialize(byte[] bytes)
					throws SerializationException {
				if (bytes == null || bytes.length == 0) {
                    return null;
                }
                return SerializationUtils.deserialize(bytes);
			}
		});

		return redisTemplate;
	}

}
