package com.shiyanlou.java8;

import java.util.ArrayList;
import java.util.List;

public class NewFeaturesTester3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List names =new ArrayList();
		names.add("Peter");
		names.add("Linda");
		names.add("Smith");
		names.add("Zack");
		names.add("Bob");
		//ͨ��System.out::println����������ķ���
		
		names.forEach(System.out::println);
	}

}
