package Assignment1;

import java.util.Queue;
import java.util.Random;
import java.util.LinkedList;

public class QuickieMart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int counter = 0, maxLength = 0;
		Queue<Customer> checkoutLine = new LinkedList<Customer>();
		
		for (int i=0; i<60; i++){
			counter = didLineGrow(checkoutLine, counter);
			if(checkoutLine.size() > 0){
				serviceCustomer(checkoutLine);
			}
			System.out.println("-----------------------------");
			if(checkoutLine.size() > maxLength){
				maxLength = checkoutLine.size();
			}
		}
		System.out.println("Total number of customers served: "+ counter);
		System.out.println("Maximum line length during simulation: "+ maxLength);
	}
	public static int didLineGrow(Queue<Customer> checkoutLine, int c){
		int custChance;
		Random rand = new Random();
		custChance = rand.nextInt(4);
		if (custChance == 0) {
			c+=1;
			checkoutLine.add(new Customer());
			System.out.println("New customer added! Queue length is now "
					+ checkoutLine.size());
			
		}
		return c;
	}
	
	public static void serviceCustomer(Queue<Customer> checkoutLine){
		checkoutLine.peek().serviceTime = checkoutLine.peek().serviceTime -1;
		if(checkoutLine.peek().serviceTime == 0){
			checkoutLine.remove();
			System.out.println("Customer serviced and removed from the queue."
			+ " Queue length is now "+ checkoutLine.size()+".");
		}
	}
}