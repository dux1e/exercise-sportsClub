
/**
 * Write a description of class Member here.
 *
 * @author Joakim Christensen
 * @version 01-10-2020
 */
public class Member {
    // Instance Variables
    private int age;
    private String name;
    private String address;
    private String phoneNo;

    // Constructor
    public Member(int age, String name, String address, String phoneNo) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    // Accessor Functions
    public int getAge() {
        return age;
    }
    
    public void printAge() {
        System.out.println(age);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return phoneNo;
    }
    
    public void printInfo() {
        System.out.println("Members age: " + age);
        System.out.println("Members name: " + name);
        System.out.println("Members address: " + address);
        System.out.println("Members phone: " + phoneNo);
        System.out.println("");
    }

    // Mutator Functions
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(String number) {
        phoneNo = number;
    }
}
