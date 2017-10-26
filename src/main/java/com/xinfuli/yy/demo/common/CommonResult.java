package com.xinfuli.yy.demo.common;

public class CommonResult {
	
	private String status;//状态
	
	private String msg;//结果信息
	
	private Object data;//数据
	
	public CommonResult(Object data) {
		this.status = "200";
		this.msg = "OK";
		this.data = data;
	}

	public CommonResult(String status,String msg,Object data) {
		this.status = status;
		this.msg = msg;
		this.data =data;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}
