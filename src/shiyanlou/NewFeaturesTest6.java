package shiyanlou;

import java.util.Optional;

public class NewFeaturesTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewFeaturesTest6 tester = new NewFeaturesTest6();
		Integer value1 = null;
		Integer value2 = new Integer(5);
		// ofNullable ������ʱ���� null
		Optional<Integer> a = Optional.ofNullable(value1);
		// ������ݵĲ���Ϊnull����ô of ���׳���ָ���쳣��NullPointerException��
		Optional<Integer> b = Optional.of( value2);
		System.out.println(tester.sum(a,b));
	}

	private Integer sum(Optional<Integer> a, Optional<Integer> b) {
		// TODO Auto-generated method stub
		// isPresent ���ڼ��ֵ�Ƿ����
		System.out.println("First parameter is present :"+a.isPresent());
		System.out.println("Second parameter is present��"+b.isPresent());
		// �����ǰ���ص��Ǵ����Ĭ��ֵ��orElse ��������
		Integer value1 = a.orElse(new Integer(0));
		//get ���ڻ��ֵ�����������ֵ�������
		Integer value2 = b.get();
		return value1 + value2;
	}

}
