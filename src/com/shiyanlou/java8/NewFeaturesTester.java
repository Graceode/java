package com.shiyanlou.java8;

public class NewFeaturesTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewFeaturesTester tester = new NewFeaturesTester();
		//�������������ı��ʽ
		MathOperation addition = (int a,int b) -> a + b;
		//û�����������ı��ʽ
		MathOperation subtraction = (a,b) -> a - b;
		//���д����ţ����з������ı��ʽ
		MathOperation multiplication = (int a,int b) -> {return a*b;};
		//û�д����ź�return���ı��ʽ
		MathOperation division =(int a, int b) -> a / b;
		//������
		System.out.println("100 + 5 =" +tester.operate(100, 2, addition));
		System.out.println("100 - 5 =" +tester.operate(100,2,subtraction));
		System.out.println("100 * 5 =" +tester.operate(100,2,multiplication));
		System.out.println("100 / 5 ="+tester.operate(100, 2, division));
		//û�����ŵı��ʽ
		GreetingService greetService = message -> System.out.println("hello " + message);
		// �����ŵı��ʽ
		GreetingService greetService2 =message -> System.out.println("hello " + message);
		//����sayMessage����������
		greetService.sayMessage("shiyanlou");
		greetService2.sayMessage("classmate");
		
		
	}
		
		
		//operate����
		private int operate(int a,int b,MathOperation mathOperation){
			return mathOperation.operation(a,b);
			
		}
	}


