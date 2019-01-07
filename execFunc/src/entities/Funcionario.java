package entities;

public class Funcionario {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	
	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void increseSalary(int percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f", netSalary());
	}

}
