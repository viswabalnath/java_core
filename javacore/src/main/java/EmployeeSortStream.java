package main.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortStream {

	public static void main(String[] args) {
		 List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee(1, "Alice", 65000));
	        employees.add(new Employee(2, "Bob", 95000));
	        employees.add(new Employee(3, "Charlie", 85000));
	        employees.add(new Employee(4, "Diana", 65000));
	        employees.add(new Employee(5, "Eve", 90000));
	        
	        employees.stream()
	        	.sorted(Comparator.comparing(Employee::getSalary)
	        			.thenComparing(Employee::getName))
	        	.forEach(System.out::println);
	}

}
