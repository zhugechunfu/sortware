package com.text;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.HelloSpring;

public class Text {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ͨ��getBean��������ȡHelloSpring��ʵ��
		HelloSpring hello = (HelloSpring)context.getBean("zhangga");
		HelloSpring rod=(HelloSpring)context.getBean("rod");
		//ִ�з���
		hello.print();
		rod.print();
	}
}
