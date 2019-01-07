package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	
	
	
	public double area() {
		double area;
		area = this.width * this.height;
		return area;
	}
	
	public double perimeter() {
		double per;
		per = (this.width * 2) + (this.height * 2);
		return per;
	}
	
	public double diagonal() {
		double diag;
		diag = Math.sqrt(this.width * this.width + this.height * this.height);
		return diag;
	}
	
	

}
