package com.jbk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jbk.config.MyConfigureClass;
import com.jbk.entity.Bank;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigureClass.class);
		Bank bank = context.getBean(Bank.class);
		bank.withdrawal();
		bank.balanceChecking();
	}

}
