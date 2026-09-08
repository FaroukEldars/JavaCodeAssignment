package Session06;

public class Person {
    private int age;
    private String name;
    private String address;

    public Person() {
        System.out.println("Im person default constructor");
    }

    public Person(String name) {
        System.out.println("Im person paramaterized constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}