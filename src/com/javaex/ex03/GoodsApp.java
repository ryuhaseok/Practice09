package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("상품을 입력해주세요(종료 q)");
       
       List<Goods> gList = new ArrayList<Goods>();
       
       
       while(true) {
    	String str = sc.nextLine();   
    	
    	if(str.equals("q")) {
    		break;
    	}
			Goods g00 = new Goods(str);
			gList.add(g00);
    	}
    	System.out.println("[입력완료]");
    	System.out.println("=======================");
    	
    	for(int i=0; i<gList.size(); i++) {
    		gList.get(i).toString();
       }
       sc.close();
       
       
    }

}
