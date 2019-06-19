package com.biz.exec;

import java.io.IOException;

import com.biz.service.PayService;

public class model {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PayService ps = new PayService();
		String fileName = "src/com/biz/list/payment.txt";
		ps.payment();
		ps.writePayment(fileName);
		
	}

}
