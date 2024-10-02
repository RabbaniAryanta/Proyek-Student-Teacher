public class Student extends Person {
    private int studentNumber;
    private int score;
    private String major;

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Constructor 
    public Student() {
        studentNumber = 0;
        score = 0;
        major = "null";
        
    }

    // Parameter
    public Student(int age, String name, int studentNumber, int score, String major) {
        super(name, age);
        this.studentNumber = studentNumber;
        this.score = score;
        this.major = major;
    }

    // Override
    public void print() {
        super.print();
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Score: " + score);
        System.out.println("Major: " + major);
    }

}

