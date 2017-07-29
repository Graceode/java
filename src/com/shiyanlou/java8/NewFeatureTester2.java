package com.shiyanlou.java8;

public class NewFeatureTester2 {
	final static String salution = "hello";
	//正确，不可再次赋值
    //static String salutation = "Hello "; //正确，可再次赋值
    //String salutation = "Hello "; //报错
    //final String salutation = "Hello "; //报错

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final salutation = "Hello "; //正确，不可再次赋值
        //String salutation = "Hello "; //正确，隐性为 final , 不可再次赋值

        // salution = "welcome to " 
		GreetingService greetingService3 = message -> System.out.println(salution + message);
		greetingService3.sayMessage("shiyanlou");
		/*可以得到以下结论：
		可访问 static 修饰的成员变量，
		如果是 final static 修饰，不可再次赋值，只有 static 修饰可再次赋值；
		可访问表达式外层的 final 局部变量（不用声明为 final，隐性具有 final 语义），不可再次赋值。
		*/

	}

}
