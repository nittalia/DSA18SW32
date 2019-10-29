abstract class Shape{
	abstract public void drawShape();
	abstract public void eraseShape();
}
class Square extends Shape{
	public void drawShape(){
		System.out.println("Draw Square");
	}

	public void eraseShape(){
		System.out.println("Erase Square");
	}
}

class Trangle extends Shape{
	public void drawShape(){
		System.out.println("Draw Trianagle");
	}

	public void eraseShape(){
		System.out.println("Erase Triangle");
	}
}

class MainTask2{
	public static void main(String[] args) {
		Shape s=new Square();
		s.drawShape();
		s.eraseShape();

	}
}