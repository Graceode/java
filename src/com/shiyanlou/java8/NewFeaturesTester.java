package com.shiyanlou.java8;

public class NewFeaturesTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewFeaturesTester tester = new NewFeaturesTester();
		//带有类型声明的表达式
		MathOperation addition = (int a,int b) -> a + b;
		//没有类型声明的表达式
		MathOperation subtraction = (a,b) -> a - b;
		//带有大括号，带有返回语句的表达式
		MathOperation multiplication = (int a,int b) -> {return a*b;};
		//没有大括号和return语句的表达式
		MathOperation division =(int a, int b) -> a / b;
		//输出结果
		System.out.println("100 + 5 =" +tester.operate(100, 2, addition));
		System.out.println("100 - 5 =" +tester.operate(100,2,subtraction));
		System.out.println("100 * 5 =" +tester.operate(100,2,multiplication));
		System.out.println("100 / 5 ="+tester.operate(100, 2, division));
		//没有括号的表达式
		GreetingService greetService = message -> System.out.println("hello " + message);
		// 有括号的表达式
		GreetingService greetService2 =message -> System.out.println("hello " + message);
		//调用sayMessage方法输出结果
		greetService.sayMessage("shiyanlou");
		greetService2.sayMessage("classmate");
		
		
	}
		
		
		//operate方法
		private int operate(int a,int b,MathOperation mathOperation){
			return mathOperation.operation(a,b);
			
		}
	}


