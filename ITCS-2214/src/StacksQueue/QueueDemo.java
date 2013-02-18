package StacksQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import java.util.Iterator;

public class QueueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		Queue<String> myQ = new LinkedList<String>();
		
		while(true){
			System.out.println("1 - Add new person");
			System.out.println("2 - Let someone in");
			System.out.println("3 - Examine line");
			System.out.println("4 - Quit");
		
			int n = k.nextInt();
			
			if(n == 1) {
				myQ.add("#");
				System.out.println("Person added!");
			}else if(n==2) {
				myQ.remove();
				System.out.println("Person removed!");
			}else if(n==3) {
				System.out.println("Examining line");
				Iterator<String> it =  myQ.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
			}else {
				break;
			}
		}
	}

}
