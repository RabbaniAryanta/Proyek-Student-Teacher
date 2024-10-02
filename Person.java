//SuperClass
public class Person {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    // Constructor
    public Person() {
        this.name = "null";
        this.age = 0;
    }

    // Parameter
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override
    public void print() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
    
}