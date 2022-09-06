package com.sonata.four2;
import com.sonata.four2.EmpGn;

public class TestGen {

	public static <E> void simpleArray(E[] elements) {
		for (E element : elements)
			System.out.println(element);
		}
		public static void main(String[] args) {
			
			EmpGn<Integer> gm = new EmpGn<Integer>();
			gm.add(12);
			
			EmpGn<String> gm1 = new EmpGn<String>();
					
			System.out.println(gm.get());
			
			Integer[] a1 = {10,20,30,40};
			simpleArray(a1);
		

	

}
}
