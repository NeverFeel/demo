package com.xinfuli.yy.demo.configuration;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

@Component
public class ExitConfiguration implements ExitCodeGenerator {

	/**
	 * 应用结束时返回特定的退出码
	 */
	@Override
	public int getExitCode() {
		System.out.println("exitCode:"+0);
		return 0;
	}

}
