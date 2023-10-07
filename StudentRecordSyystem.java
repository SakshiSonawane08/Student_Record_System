import java.util.ArrayList;
import java.util.Scanner;

public class StudentRecordSyystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<student> students = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nStudent Record System");
	            System.out.println("1. Add Student");
	            System.out.println("2. View Student Records");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter student ID: ");
	                    String studentId = scanner.nextLine();
	                    System.out.print("Enter student name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter student age: ");
	                    int age = scanner.nextInt();
	                    scanner.nextLine(); // Consume the newline character

	                    student student = new student(studentId, name, age);
	                    students.add(student);

	                    System.out.println("Student added successfully!");
	                    break;

	                case 2:
	                    System.out.println("\nStudent Records:");
	                    for (student s : students) {
	                        System.out.println("\n" + s);
	                    }
	                    break;

	                case 3:
	                    System.out.println("Exiting the program.");
	                    scanner.close();
	                    System.exit(0);
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}
	
