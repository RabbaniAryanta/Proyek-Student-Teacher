public class FullTime extends Teacher {
    private int anualSalary;
    private String unit;

    public int getAnualSalary() {
        return this.anualSalary;
    }

    public void setAnualSalary(int anualSalary) {
        this.anualSalary = anualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    // Constructor
    public FullTime() {
        anualSalary = 0;
        unit = "null";
        super.setSubject("null");
    }
    // Parameter
    public FullTime(int anualSalary, String unit ,String subject, String name, int age) {
        super(age, name, subject);
        this.anualSalary = anualSalary;
        this.unit = unit;
        super.setSubject(subject);
        super.setName(name);
        super.setAge(age);
    }
    
    // Override
    public void print() {
        super.print();
        System.out.println("Anual Salary: " + anualSalary);
        System.out.println("Unit: " + unit);
    }
}
