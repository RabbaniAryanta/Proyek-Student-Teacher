import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---- Selamat Datang ----");
        System.out.println("Choose One :");
        System.out.println("1. Student\n2. Teacher");
        int choose = input.nextInt();
        input.nextLine();
        if (choose == 1) {
            System.out.println("-- Student --");
            System.out.print("Name : ");
            String name = input.nextLine();
            System.out.print("Major : ");
            String major = input.nextLine();
            System.out.print("Age : ");
            int age = input.nextInt();
            input.nextLine();
            System.out.print("Student Number : ");
            int studentNumber = input.nextInt();
            input.nextLine();
            System.out.print("Score : ");
            int score = input.nextInt();
            System.out.println("---------------------");
            Student student = new Student(age, name, studentNumber, score, major);
            student.print();
        } else if (choose == 2) {
            System.out.println();
            System.out.println("-- Teacher --");
            System.out.println("Choose One");
            System.out.println("1. FullTime\n2. PartTime");
            int choose2 = input.nextInt(); 
            input.nextLine();
            if (choose2 == 1) {
                System.out.println();
                System.out.println("-- Full Time --");
                System.out.print("Name : ");
                String name = input.nextLine();
                System.out.print("Subject : ");
                String subject = input.nextLine();
                System.out.print("Age : ");
                int age = input.nextInt();
                System.out.print("Anual Salary : ");
                int anualSalary = input.nextInt();
                input.nextLine();
                System.out.print("Unit : ");
                String unit = input.nextLine();
                System.out.println("---------------------");
                FullTime fullTime = new FullTime(anualSalary, unit, subject, name, age);
                fullTime.print();
            } else if (choose2 == 2) {
                System.out.println();
                System.out.println("-- Part Time --");
                System.out.print("Name : ");
                String name = input.nextLine();
                System.out.print("Subject : ");
                String subject = input.nextLine();
                System.out.print("Age : ");
                int age = input.nextInt();
                input.nextLine();
                System.out.print("Hours Worked : ");
                int hoursWorked = input.nextInt();
                input.nextLine();
                int Salary = hoursWorked * 150000;
                System.out.println("---------------------");
                PartTime partTime = new PartTime(hoursWorked, subject, name, age);
                partTime.print();
                System.out.println("Salary : " + Salary);
            }
        } input.close();
    }     
}
