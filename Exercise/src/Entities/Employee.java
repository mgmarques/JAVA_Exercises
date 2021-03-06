package Entities;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;

	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	
	public Integer getId() {
		return id;
	}

	public void increaseSalary (Double percentege) {
		this.setSalary(this.salary * (1 + percentege/100));
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" 
					+  String.format("%.2f", salary)  + "]";
	}
	
	
}
