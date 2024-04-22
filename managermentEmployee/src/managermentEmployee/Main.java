package managermentEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static int ID = 0;
	
	public static class CRUDEmployee {
		
		private List<Employee> listEmployee = new ArrayList<Employee>();
		
		public List<Employee> getListEmployee()
		{
			return this.listEmployee;
		}
		
		public Employee findEmployee_by_code(String code) 
		{
			for (Employee employee : listEmployee) {
				if(employee.getCode().equals(code))
					return employee;
			}
			return null;
			
		}
		
		public boolean removeEmployee(String code) 
		{
			return this.listEmployee.remove(findEmployee_by_code(code));
		}
		
		public void ShowListEmployee() 
		{
			System.out.printf("Infor: %-9s %-20s %-12s %-12s %-12s %-12s \n", "ID", "Name", "Age", "Department", "Code", "SalaryRate");
			for (Employee ls : listEmployee) {
				ls.outputEmpoyee();
			}
		}
		
		public void AddEmployee()
		{
			Employee employee = new Employee();
			employee.inputEmployee();
			listEmployee.add(employee);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		CRUDEmployee handleEmployee = new CRUDEmployee();
		
		Scanner input = new Scanner(System.in);
		
		int n;
		System.out.print("Nhập số lượng nhân viên: ");
		n = input.nextInt();
		
		for(int i=0; i<n; i++)
		{
			handleEmployee.AddEmployee();
		}
		
		handleEmployee.ShowListEmployee();
		
		
		
	}
}
