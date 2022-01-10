package cadastro;

public abstract class Shape {
	
	protected String name;
	protected String color;
	protected boolean filled;

	public Shape(){
	}

	public Shape(String name, String color, Boolean filled){
		this.name = name;
		this.color = color;
		this.filled = filled;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public abstract double getArea();	
	public abstract double getPerimeter();	
	public abstract String toString();
	
}
