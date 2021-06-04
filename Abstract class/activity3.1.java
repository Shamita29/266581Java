import java.util.*;

abstract class Shape{
	int value;

	public void setVal(int val)
	{
		value = val;
	}

	public int getVal()
	{
		return value;
	}

	public abstract void calculateArea();

}

class Circle extends Shape{
	public void calculateArea()
	{
		double ans = 3.14*getVal()*getVal();
		System.out.println("Area of Circle: "+ans);
	}
}

class Square extends Shape{

	public void calculateArea()
	{
		double area = getVal()*getVal();
		System.out.println("Area of square : "+area);
	}
}

class Calculate
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose shape: \n 1. Circle \n 2. Square");
		String type = sc.nextLine();

		if(type.equals("circle"))
		{
		System.out.println("Enter radius: ");
		int rad = sc.nextInt();
		Circle cir = new Circle();
		cir.setVal(rad);
		cir.calculateArea();
	     }

	     if(type.equals("square"))
	     {
		System.out.println("Enter side: ");
		int side = sc.nextInt();
		Square sq = new Square();
		sq.setVal(side);
		sq.calculateArea();
	     }


	}
}