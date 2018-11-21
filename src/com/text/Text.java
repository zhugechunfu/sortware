package com.text;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.HelloSpring;

public class Text {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过getBean方法来获取HelloSpring的实例
		HelloSpring hello = (HelloSpring)context.getBean("zhangga");
		HelloSpring rod=(HelloSpring)context.getBean("rod");
		//执行方法
		hello.print();
		rod.print();
	}
}
