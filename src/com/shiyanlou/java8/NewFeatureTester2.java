package com.shiyanlou.java8;

public class NewFeatureTester2 {
	final static String salution = "hello";
	//��ȷ�������ٴθ�ֵ
    //static String salutation = "Hello "; //��ȷ�����ٴθ�ֵ
    //String salutation = "Hello "; //����
    //final String salutation = "Hello "; //����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final salutation = "Hello "; //��ȷ�������ٴθ�ֵ
        //String salutation = "Hello "; //��ȷ������Ϊ final , �����ٴθ�ֵ

        // salution = "welcome to " 
		GreetingService greetingService3 = message -> System.out.println(salution + message);
		greetingService3.sayMessage("shiyanlou");
		/*���Եõ����½��ۣ�
		�ɷ��� static ���εĳ�Ա������
		����� final static ���Σ������ٴθ�ֵ��ֻ�� static ���ο��ٴθ�ֵ��
		�ɷ��ʱ��ʽ���� final �ֲ���������������Ϊ final�����Ծ��� final ���壩�������ٴθ�ֵ��
		*/

	}

}
