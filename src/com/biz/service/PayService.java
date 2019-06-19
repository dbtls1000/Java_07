package com.biz.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.PaymentVO;

public class PayService {

	Scanner scan;
	List<PaymentVO> psList;

	public PayService() throws IOException {
		scan = new Scanner(System.in);
		psList = new ArrayList<PaymentVO>();

	}

	public void payment() {

		System.out.println("총급여액 >>");
		String strpay = scan.nextLine();
		int intPay = Integer.valueOf(strpay);

		int intMoney = 50000;

		int sw = 1;
		while (intPay > 5) {
			PaymentVO vo = new PaymentVO();
			vo = new PaymentVO();
			vo.setPay(intPay);
			int paper = (int) (intPay / intMoney);
			System.out.println(intMoney + "원권 :" + paper);

			intPay -= (paper * intMoney);

			vo.setMoney(intMoney);

			if (sw > 0)
				intMoney = intMoney / 5;
			else
				intMoney = intMoney / 2;
			sw = sw * (-1);

			vo.setPaper(paper);

			psList.add(vo);
		}
		System.out.println(psList.toString());
	}

	public void writePayment(String fileName) throws IOException {
		FileWriter fileWriter = new FileWriter(fileName);
		PrintWriter printer = new PrintWriter(fileWriter);
		int index = 0;
		printer.println("=============================");
		printer.println("총급여액 : "+ psList.get(index).getPay());
		printer.println("액면가\t매수");
		for (PaymentVO vo : psList) {
			printer.printf("%d\t%d\n", vo.getMoney(), vo.getPaper());
		}
		printer.flush();
		printer.close();
	}

}
