package q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();
		
		Collections.addAll(list,new Employee("AA",1,1000),new Employee("AA",2,1190),new Employee("AAC",3,100),new Employee("BA",4,10200),new Employee("AB",5,1500));
		
		int id = 3;
		
		String name = "AB";
		
		int salary = 1190;

		for (Employee employee : list) {
			if(employee.id == id) {
				System.out.println(employee.toString()); 
			};
		}
		
		
		for (Employee employee : list) {
			if(employee.name == name) {
				System.out.println(employee.toString()); 
			};
		}
		
		
		
		for (Employee employee : list) {
			if(employee.salary == salary) {
				System.out.println(employee.toString()); 
			};
		}
	}

}
