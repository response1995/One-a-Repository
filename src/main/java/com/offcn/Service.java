package com.offcn;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class Service {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9001/Service/hello", new Service());
		System.out.println("服务器发布成功");
	}
	
	// 这是一个方法
	public String getValue(String name){
		return "I'm name is " + name;
	}
	
	
	
}
