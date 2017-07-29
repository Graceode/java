package shiyanlou;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class NewFeaturesTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>  list =  Arrays.asList(0,1,2,3,4,5,7,8,9);
		System.out.println("All of the numbers:");
		eval(list,n->true);
		System.out.println("Even numbers:");
		eval(list,n-> n%2 == 0);
		System.out.println("Numbers that greater than 5:");
		eval(list,n -> n>5);
		
		
		

	}

	public static void eval(List<Integer> list, Predicate<Integer> predicate) {
		// TODO Auto-generated method stub
		for(Integer n:list){
			
			if(predicate.test(n)){
				System.out.println(n);
			}
		}
	}
}
