package managermentEmployee;

//import java.awt.ContainerOrderFocusTraversalPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String department;
	private String code;
	private float salaryRate;
	
	public static int ID = 0;
	
	public Employee() {
		
	}
	public Employee(int id, String name, int age, String department, String code , float salaryRate)
	{
		id = this.id;
		name = this.name;
		age = this.age;
		department = this.department;
		code = this.code;
		salaryRate = this.salaryRate;
	}
	
	void inputEmployee() {
		Scanner input = new Scanner(System.in);
		this.id = ID++;
		System.out.println("Nhập Các thông tin của Employee");
		System.out.print("Nhập Name: ");
		this.name = input.nextLine();
		System.out.print("Nhập tuổi: ");
		this.age = input.nextInt();
		input.nextLine();
		System.out.print("Nhập Department: ");
		this.department = input.nextLine();
		System.out.print("Nhập code: ");
		this.code = input.nextLine();
		System.out.print("Nhập Salary rate: ");
		this.salaryRate = input.nextFloat();
	}
	
	void outputEmpoyee() {
		System.out.printf("Infor: %-9d %-20s %-12d %-12s %-12s %-12.3f \n", this.id, this.name, this.age, this.department, this.code, this.salaryRate);
	}
	
	public String getCode()
	{
		return this.code;
	}
	
	
	
	
	
}
