public class PartTime extends Teacher {
    private int hoursworked;


    public int getHoursworked() {
        return this.hoursworked;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    // Constructor
    public PartTime() {
        hoursworked = 0;
        super.setSubject("null");
    }

    // Parameter
    public PartTime(int hoursworked, String subject, String name, int age) {
        super(age, name, subject);
        this.hoursworked = hoursworked;
        super.setSubject(subject);
        super.setName(name);
        super.setAge(age);
    }

    // Override
    public void print() {
        super.print();
        System.out.println("Hours Worked: " + hoursworked);
    }
}
