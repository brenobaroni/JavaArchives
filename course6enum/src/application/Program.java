package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order = new Order(1080, new Date(), OrderStatus.SHIPPED);
		
		System.out.println(order);

	}

}
