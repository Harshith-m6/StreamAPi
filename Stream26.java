package com.rcb.StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream26 {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee(1,"Gagu","Cloud",40000,23),new Employee(1,"Harshith","IT",100000,24),new Employee(1,"Pavan","AI",50000,21),new Employee(1,"Ajju","BPO",10000,25));
		
		list.stream().filter(e->e.getSalary()>50000).map(e->e.getName()).forEach(System.out::println);
		
		List<String> HighSal = list.stream().filter(e->e.getSalary()>50000).map(Employee::getName).toList();
		System.out.println(HighSal);
		
		Employee hemp = list.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(hemp);
		
		//Second highest employee salary
		
		Employee sEmp = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().get();
		System.out.println(sEmp);
		//Count Employee in IT
		long countIT = list.stream().filter(e->e.getDepartment().equalsIgnoreCase("IT")).count();
		System.out.println(countIT);
		//Count Employee Department Wise
		Map<String,Long> dept = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println(dept);
		//Employee Department Wise
		Map<String,List<Employee>> deptEmployees = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		for(String dname : deptEmployees.keySet())
		{
			System.out.println("department name "+dname);
			for(Employee emp : deptEmployees.get(dname))
			{
				System.out.println(emp);
			}
		}
		
		//Average salary of the Employee
		double AvgSal = list.stream().collect(Collectors.averagingDouble(e->e.getSalary()));
		System.out.println(AvgSal);
		
		//Youngest Employee
		Employee youngEmp = list.stream().min(Comparator.comparing(Employee::getAge)).get();
		System.out.println(youngEmp);
		
		//Total Salary
		double salary = list.stream().map(e->e.getSalary()).reduce(0.0, (a,b)->a+b);
		System.out.println(salary);
		//Employee Sorted based on their salary and then name 
		List<Employee> SortedEmp = list.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName)).toList();
		
	}

}
