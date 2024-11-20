package Diagram;

import java.util.Scanner;

public class testerArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ingin Memasukkan data berapa?");
        int data = in.nextInt();
        System.out.println();

        System.out.println("Pilihan : ");
        System.out.println("1. Person\n2. Student\n3. Teacher");

        int pilihan = in.nextInt();
        System.out.println();

        Person p[] = new Person[20];

        for (int i = 1; i <= data; i++) {
            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan nama : ");
                    String name = in.next();
                    System.out.println("Masukkan umur : ");
                    int age = in.nextInt();
                    p[0] = new Person(name, age);
                    p[0].print();
                    break;

                case 2:
                    System.out.println("Masukkan nama : ");
                    String name2 = in.next();
                    System.out.println("Masukkan umur : ");
                    int age2 = in.nextInt();
                    System.out.println("Masukkan number : ");
                    int studentNumber = in.nextInt();
                    System.out.println("Masukkan score : ");
                    int score = in.nextInt();
                    System.out.println("Masukkan major : ");
                    String major = in.next();
                    p[1] = new Student(age2, name2, studentNumber, score, major);
                    p[1].print();

                    break;

                case 3:
                    System.out.println("Masukkan nama : ");
                    String name3 = in.next();
                    System.out.println("Masukkan umur : ");
                    int age3 = in.nextInt();
                    System.out.println("Masukkan subject : ");
                    String subject = in.next();

                    p[2] = new Teacher(age3, name3, subject);
                    p[2].print();

                default:
                    break;
            }

        }
    }
}
