package test;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declaring an array list called list. can only point to an list that can only hold student objects
		// test
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner k = new Scanner(System.in);
		
		while(true){
			System.out.println("1 - Enter new student");
			System.out.println("2 - Promote All Students");
			System.out.println("3 - Display All Students");
			System.out.println("4 - Exit");
			
			int input = k.nextInt();
			k.nextLine();
			
			if(input == 1) {
				list.add(createNewStudent(k));
			}else if(input == 2){
				promoteAllStudents(list);				
			}else if(input ==3){
				displayAllStudents(list);
			}else {
				break;
			}
		}
		
	}
	
	public static Student createNewStudent(Scanner k) {
		String name, idNum;
		int grade;
		System.out.println("Enter Student Name: ");
		name = k.nextLine();
		System.out.println("Enter Student ID Num: ");
		idNum = k.nextLine();
		System.out.println("Enter Student Grade: ");
		grade = k.nextInt();
		
		return new Student(name, idNum, grade);
				
	}

	public static void displayAllStudents(ArrayList<Student> list){
		for(Student s: list) {
			System.out.println(s.toString());
		}
	}
	
	public static void promoteAllStudents(ArrayList<Student> list){
		for(int i = list.size()-1; i< 0; i--){
			list.get(i).promote();
			checkGraduate(list, i);
		}
	}
	
	public static void checkGraduate(ArrayList<Student> list, int i){
		if(list.get(i).grade > 12){
			list.remove(i);
		}
	}
}
