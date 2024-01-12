package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("친구를 3명 등록해 주세요");

    	Friend f01 = new Friend(sc.nextLine().split(" "));
    	Friend f02 = new Friend(sc.nextLine().split(" "));
    	Friend f03 = new Friend(sc.nextLine().split(" "));
    	
    	List<Friend> fList = new ArrayList<Friend>();
    	
    	fList.add(f01);
    	fList.add(f02);
    	fList.add(f03);
    	
    	for(int i=0; i<fList.size(); i++) {
    		System.out.print("이름:" + fList.get(i).getName() + " ");
    		System.out.print("핸드폰:" + fList.get(i).getHp() + " ");
    		System.out.println("학교:" + fList.get(i).getSchool());
    	}
    	
    	
    	
    	
    	sc.close();

    	
    	
    }

}
