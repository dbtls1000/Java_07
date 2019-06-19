package com.biz.model;

public class PaymentVO {
	private int money;
	private int pay;
	private int paper;
	
	public PaymentVO(int money, int pay, int paper) {
		super();
		this.money = money;
		this.pay = pay;
		this.paper = paper;
	}
	
	public PaymentVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getPaper() {
		return paper;
	}
	public void setPaper(int paper) {
		this.paper = paper;
	}
	@Override
	public String toString() {
		return "PaymentVO [money=" + money + ", pay=" + pay + ", paper=" + paper + "]";
	}


		

	
}
