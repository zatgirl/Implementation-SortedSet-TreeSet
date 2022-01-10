package cadastro;

public class Rectangle extends Shape {

	protected double width;
	protected double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}	
	public Rectangle(String name, String color, double width, double length, boolean filled) {
		super(name,color,filled);
		this.width = width;
		this.length = length;
	}		
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public Rectangle() {
	}	
	public double getArea() {
		return width*length;
	}
	public double getPerimeter() {
		return 
		2*width+2*length;
	}
	public String toString() {
		return "Rectangle [name " + name + ", width= " + width + ", length= " + length + ", color= " + color + ", filled= " + filled + ", area= " + getArea() + ", perimeter= " + getPerimeter() + "]" ;
	}

}
