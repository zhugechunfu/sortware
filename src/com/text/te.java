package com.text;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Equip;
import com.entity.Player;
import com.spring.HelloSpring;

public class te {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过getBean方法来获取HelloSpring的实例
		Player hello = (Player)context.getBean("toukiu");
		Player rod=(Player)context.getBean("kaijia");
		Player pr3 = (Player)context.getBean("boot");
		Player player=(Player)context.getBean("ring");
		Player play=(Player)context.getBean("lanmo");
		//执行方法
		hello.print();
		rod.print1();
		pr3.print2();
		player.print3();
		play.ring();
		Equip equip=(Equip)context.getBean("type4");
		Player player2=(Player)context.getBean("lanmo");
		player2.updateEqiup(equip);
	}
}
