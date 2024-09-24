package studentexample;

/**
 * This class represents a Student
 *
 * @author owen oreilly 24 sept
 */
public class Student {
    
    private String name;
    private int age;
    private String address;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress(){
        return this.address;
    }
}
