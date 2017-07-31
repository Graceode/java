package shiyanlou;

public class Student implements Younger,Learner {
	public void print(){
		//使用超类super来调用特定接口的默认方法
		Younger.super.print();
		Learner.super.print();
		Younger.sayHi();
		System.out.println("I am a student!");
	}
}
