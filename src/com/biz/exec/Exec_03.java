package com.biz.exec;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exec_03 {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fileWriter = new FileWriter("src/com/biz/list/leapYearList.txt");
		PrintWriter printer = new PrintWriter(fileWriter);
		List<Integer> yearList = new ArrayList<Integer>();
		
		int year = 0;
		for(year = 1500; year <3001 ; year++) {
			if((year % 4 ==0) && (year % 100 != 0) || (year % 400 == 0)){
				yearList.add(year);	
			}
			
		}
		System.out.println(yearList.toString());
		
		for(Integer i : yearList) {
			printer.printf("%d\n", i);
		}
		printer.flush();
		printer.close();
		
//		if(day % 4 == 0) {
//			System.out.println(day + "1차 후보");
//			if(day % 100 != 0 || day % 400 == 0) {
//				System.out.println(day +"2차 후보");
//			}
//		}
//		
//		if(day % 4 == 0) {
//			if(day % 100 != 0 && day % 4 == 0) {
//			} else if (day % 4 == 0 && day % 400 ==0) {
//				
//			}
//		}
		
		
		
		
		
		
	}
	
}
