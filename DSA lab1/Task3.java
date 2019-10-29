import java.util.Scanner;
class Area
{
	double length,width;
	
	Area(double length, double width)
	{
		this.length = length;
		this.width = width;

		System.out.print("Area = " + returnArea());
	}
	
	public double returnArea(){
		return length*width;
	}
	
	
}
class Task3{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter length ");
	double l = sc.nextDouble();
	System.out.println("Enter width ");
	double w = sc.nextDouble();

	new Area(l,w);
	}
}