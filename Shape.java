// Q No: 02 Shape Hierarchy
import java.util.*;
abstract class Shape{
	 public double calculateArea(){
		return 20.0;
	 }
	 
	 Shape(){
	 }
}
class Circle extends Shape{
	public double calculateArea(double r){
		return (3.14)*r*r;
	}
	Circle(){
	}
}
class Rectangle extends Shape{
	public int calculateArea(int l,int h){
		return l*h;
	}
	Rectangle(){
	}
}
class Triangle extends Shape{
	public float calculateArea(int B,int H){
		return (1/2)*B*H;
	}
	Triangle(){
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of Circle");
		double r = sc.nextDouble();
		System.out.println("Enter length of Rectangle");
		int l = sc.nextInt();
		System.out.println("Enter Heigth of Rectangle");
		int h = sc.nextInt();
		System.out.println("Enter Base of Triangle");
		int B = sc.nextInt();
		System.out.println("Enter Heigth of Triangle");
		int H = sc.nextInt();
		
		Circle circle = new Circle();
		System.out.println("Circle Area is:" + circle.calculateArea(r));
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Rectangle Area is:" + rectangle.calculateArea(l,h));
		
		Triangle triangle = new Triangle();
		System.out.println("Triangle Area is:" + triangle.calculateArea(B,H));
		
		Shape shapes[] = new Shape[3];
		shapes[0] = circle;
		shapes[1] = rectangle;
		shapes[2] = triangle;
		double totalArea=0;
		totalArea=circle.calculateArea(r)+rectangle.calculateArea(l,h)+triangle.calculateArea(B,H);
	    System.out.println("Total Area of all Shapes is:" +totalArea);
	}
}