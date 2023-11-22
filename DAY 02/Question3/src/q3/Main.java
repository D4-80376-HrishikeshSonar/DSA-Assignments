package q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import q3.Employee;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		

		Collections.addAll(list,new Employee("AA",1,1000),new Employee("AA",2,1190),new Employee("AAC",3,100),new Employee("BA",4,10200),new Employee("AB",5,1500));		
		
		
		System.out.println("Before Sort");
		System.out.println(list.toString());
		
		
		class SalaryComparator implements Comparator<Employee>{

			@Override
			public int compare(Employee arg0, Employee arg1) {
				float diff = arg0.salary - arg1.salary;
				return (int) -diff;
			}
			
		}
		
		
		System.out.println("After Sort");
		Collections.sort(list, new SalaryComparator());
		
		
		
		System.out.println(list.toString());

		
//		for(int i = 0; i<list.size()-1;i++)
//		{
//			for (int j = i+1; i<list.size(); j++)
//			{
//				if
//			}
//		}
//		
//		
//		
//	}

}
}
