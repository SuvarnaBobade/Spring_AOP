package com.jbk.entity;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Bank {
	public void withdrawal() {
		System.out.println(" withdrawal Processing.....!");
	}

	public void balanceChecking() {
		System.out.println(" balanceCkecking Processing.....!");
	}
}
