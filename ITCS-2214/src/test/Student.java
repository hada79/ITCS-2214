package test;

public class Student {

	private String name, idNum;
	int grade;
	
	public Student(String n, String i, int g) {
		name =n;
		idNum =i;
		grade = g;
	}
	
	public String toString(){
		return "Name: " + name + "\nID: " + idNum + "\nGrade: " + grade + "\n";
	}
	
	public void promote() {
		grade++;
	}
	
}
