package cadastro;

public class Circle extends Shape {

	protected double radius;
	
	public Circle() {		
	}	
	public Circle(double radius) {
		this.radius = radius;
	}	
	public Circle(String name, String color, double radius, boolean filled) {
		super(name,color,filled);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	public String toString() {
		return "Circle [name= " + name + ", radius= " + radius + ", color= " + color + ", filled= " + filled + ", area= " + getArea() + ", perimeter= " + getPerimeter() + "]";
	}
}