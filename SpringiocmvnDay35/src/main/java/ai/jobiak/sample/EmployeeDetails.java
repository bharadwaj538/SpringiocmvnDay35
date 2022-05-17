package ai.jobiak.sample;
import java.util.*;

public class EmployeeDetails {
	private int id;
	private String name;
	private int salary;
	private String address;
	public EmployeeDetails() {
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
}
