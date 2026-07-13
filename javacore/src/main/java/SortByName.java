package main.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByName {

	public static void main(String[] args) {
		 List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee(1, "Alice", 75000));
	        employees.add(new Employee(3, "Charlie", 95000));
	        employees.add(new Employee(2, "Bob", 85000));
	        employees.add(new Employee(4, null, 65000));
	        employees.add(new Employee(5, "aEve", 90000));
	      
	        List<Employee> sortList =employees.stream(
	        		).sorted(Comparator.comparing(Employee::getName, 
//	        				String.CASE_INSENSITIVE_ORDER // this will work for case insensitive
	        				Comparator.nullsLast(Comparator.reverseOrder()))) // this will work for null names last and reverse order
//	        				Comparator.nullsFirst(String.CASE_INSENSITIVE_ORDER))) // this will work for null names first and case insensitive
	        		
	        		.collect(Collectors.toList());
	
	        sortList.forEach(e-> System.out.println(e.getId() + " - " + e.getName() + " " + e.getSalary()));
	
	
	        employees.stream().sorted((a, b) ->
	        a.getName().compareToIgnoreCase(b.getName())).forEach(System.out::println); // Throws NPE if name is null
		}

}
