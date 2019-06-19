package com.biz.exec;

public class PaymentEx_01 {
	public static void main(String[] args) {
		
		// 총급여액
		int intPay = 3892840;
		
		// 대한민국 액면가 최고 가
		int intMoney = 50000;
		
		// 5만원권 매수계산
		int 오만원권 = (int)intPay/intMoney;
		System.out.println("5만원권 : " + 오만원권);
		
		// 총급여액에서 5만원권을 제외한 나머지만 intPay에 담는다
		intPay = intPay - (오만원권*intMoney);
		intMoney = intMoney / 5; // 1만원권 액면가
		
		int 일만원권 = (int)intPay/intMoney;
		System.out.println("1만원권 : " + 일만원권);
		
		intPay = intPay - (일만원권*intMoney);
		intMoney = intMoney / 2; // 5천원권 액면가
		
		
		
		
		
		
		
	}
}
