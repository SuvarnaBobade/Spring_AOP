package com.jbk.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MessageAspects {
	@Before("execution(public void withdrawal())")
	public void beforewithdrawal() {
		System.out.println("Enter your pin:");

	}

	@After("execution(public void withdrawal())")
	public void afterwithdrawal() {
		System.out.println("Withdrawal processed successfully");

	}
	

	@Around("execution(* com.jbk.entity.Bank.withdrawal(..))")
	public void aroundMsgforwithdrawal(ProceedingJoinPoint pj) {
		System.out.println("Enter your pin:");
		try {
			pj.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Withdrawal processed successfully");

		System.out.println("_________________________________________________________________");
	}

	@Before("execution(public void balanceChecking())")
	public void beforebalanceChecking() {
		System.out.println("Enter your pin:");

	}

	@After("execution(public void balanceChecking())")
	public void afterbalanceChecking() {
		System.out.println("Your current balance is: ");

	}
	@Around("execution(* com.jbk.entity.Bank.balanceChecking(..))")
	public void aroundMsgforBalance(ProceedingJoinPoint pj) {
		System.out.println("Enter your pin:");
		try {
			pj.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Your current balance is: ");

	}
}
