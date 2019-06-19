package com.biz.exec;

import com.biz.service.LeapYearService;

public class Exec_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYearService lys = new LeapYearService();
		String fileName = "src/com/biz/exec/LeapYearList.txt";
		
		lys.makeLeapYearList(1500, 3000);
		lys.writeLeapYearListFile(fileName);
		
		
		
		
		
	}

}
