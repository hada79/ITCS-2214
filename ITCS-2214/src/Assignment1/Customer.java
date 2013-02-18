package Assignment1;
import java.util.Random;

public class Customer {

	Random rand = new Random();
	int serviceTime;
	
	public Customer(){
	
	serviceTime = rand.nextInt(5)+1;
	}
	
	public String toString(){
		return "Number:" + serviceTime;
	}
}