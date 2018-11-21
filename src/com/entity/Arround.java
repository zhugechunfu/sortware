package com.entity;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Arround {
	private static final Logger log=Logger.getLogger(Arround.class);
/*	@Pointcut("execution(* com.entity.*()")
	public void Pointcut() {
		
	}*/
	@Before("execution(* com.service.UserService.*(..))")
	public void before(JoinPoint jp) {
		Equip equip=(Equip)jp.getTarget();
		if (equip.getType().equals("指环")) {
			log.info(" 指环" + jp.getTarget() + "调用" + jp.getSignature().getName()
					+ "ss" + Arrays.toString(jp.getArgs()));
		}
		
	}
	@AfterReturning(pointcut = "execution(* com.service.UserService.*(..))", returning = "returnValue")
	public void afterReturning(JoinPoint jp, Object returnValue) {
		log.info(" " + jp.getTarget() + " " + jp.getSignature().getName()
				+ " " + returnValue);
	}
}

