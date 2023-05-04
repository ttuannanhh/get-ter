package advance.dev;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
	static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Student[] students = new Student[10];
        input(students);
        print(students);
        sort(students);
        print(students);
    }

    public static void input(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            Student student = new Student();
            System.out.println("Enter information of student " + (i + 1));
            System.out.print("Name: ");
            student.setName(scanner.nextLine());
            System.out.print("Age: ");
            student.setAge(Integer.parseInt(scanner.nextLine()));
            System.out.print("Address: ");
            student.setAddress(scanner.nextLine());
            System.out.print("Phone number: ");
            student.setPhoneNumber(scanner.nextLine());
            System.out.print("Average score: ");
            student.setAverageScore(Float.parseFloat(scanner.nextLine()));
            students[i] = student;
        }
    }

    public static void print(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println("Information of student " + (i + 1));
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Address: " + student.getAddress());
            System.out.println("Phone number: " + student.getPhoneNumber());
            System.out.println("Average score: " + student.getAverageScore());
        }
    }

    public static void sort(Student[] students) {
        Arrays.sort(students, (s1, s2) -> Float.compare(s1.getAverageScore(), s2.getAverageScore()));
    }
}


