package composition;

public class Student {

    private String name;
    private int age;

    public Student(String streetAddress, int zipCode, String state, String phone, String name, int age) {
        this.name = name;
        this.age = age;

        Address address = new Address(streetAddress,zipCode,state, phone){
            
        }

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
}
