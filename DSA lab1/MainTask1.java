import java.util.Scanner;
class Employee
{
	double salary;
	float hours;
	


	public void getInfo(double salary, float hours)
	{
		this.salary = salary;
		this.hours = hours;
	}
	  
    // if salary is greater than $500 add 10
	public void addSalary()
	{
		if(salary>500){
			salary = salary+10;
	}

	}
	// if hours are greater than 5 add 5 dollors more
	public void  addWork()
	{
		if(hours>5)
		{
			salary+=5;
		}
	}
	public void print(){
		System.out.println("Salary = $" + salary);
	}
}
public class MainTask1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("Enter the Salary");
		double s = sc.nextDouble();
		System.out.println("Enter the Hours");
		float h = sc.nextFloat();
		emp.getInfo(s,h);
		emp.addSalary();
		emp.addWork();
		emp.print();

	}
}