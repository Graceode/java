package shiyanlou;

public class Student implements Younger,Learner {
	public void print(){
		//ʹ�ó���super�������ض��ӿڵ�Ĭ�Ϸ���
		Younger.super.print();
		Learner.super.print();
		Younger.sayHi();
		System.out.println("I am a student!");
	}
}
