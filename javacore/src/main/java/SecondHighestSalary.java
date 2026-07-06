package main.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestSalary {

	public static void main(String[] args) {
		 List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee(1, "Alice", 75000));
	        employees.add(new Employee(2, "Bob", 95000));
	        employees.add(new Employee(3, "Charlie", 85000));
	        employees.add(new Employee(4, "Diana", 65000));
	        employees.add(new Employee(5, "Eve", 90000));
	        
	     Optional<Long> sal = employees.stream().map(e ->e.getSalary()).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	
	     employees.stream().filter(e ->e.getSalary() == sal.get()).forEach(e->System.out.println(e));
	}
}
