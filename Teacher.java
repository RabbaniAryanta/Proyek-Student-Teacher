//SuperClass Bagian
public class Teacher extends Person {
    private String subject;

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Constructor
    public Teacher () {
        this.subject = "null";
        super.setAge(0);
        super.setName("null");
    }

    // Parameter
    public Teacher (int age, String name, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Override
    public void print() {
        super.print();
        System.out.println("Subject: " + subject);
    }
}
