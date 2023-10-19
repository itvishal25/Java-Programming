package Constructor;

class Person {
    String name;
    int age;

    // Default Constructor
    public Person() {
        name = "Unknown";
        age = 0;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person person = new Person(); // Using the default constructor
        person.displayInfo();
    }
}
