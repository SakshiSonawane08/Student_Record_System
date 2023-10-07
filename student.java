import java.util.ArrayList;
import java.util.Scanner;
 class student {
	 private String studentId;
	    private String name;
	    private int age;
	    private double gpa;
	    private int attendance;

	    public student(String studentId, String name, int age) {
	        this.studentId = studentId;
	        this.name = name;
	        this.age = age;
	        this.gpa = 0.0;
	        this.attendance = 0; 
	    }

	   
	    public double getGpa() {
	        return gpa;
	    }

	    public void setGpa(double gpa) {
	        this.gpa = gpa;
	    }

	    public int getAttendance() {
	        return attendance;
	    }

	    public void setAttendance(int attendance) {
	        this.attendance = attendance;
	    }

	    @Override
	    public String toString() {
	        return "Student ID: " + studentId + "\nName: " + name + "\nAge: " + age + "\nGPA: " + gpa + "\nAttendance: " + attendance + "%";
	    }
	}

