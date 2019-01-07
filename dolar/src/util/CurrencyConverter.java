package util;

public class CurrencyConverter {
	
	public static double dollar;
	public static double buyAmon;
	public static double IOF = 6;
	public static double result;
	
	public static double convertPay() {
		result = (dollar * buyAmon) + ( dollar * buyAmon * 6 /100);
		return result;
		
		
	}
	
	/*public static double convertPay() {
		this.result = (this.dollar * this.buyAmon) + ( this.dollar * this.buyAmon * 6 /100);
		return this.result;
		
	}*/
	

}
