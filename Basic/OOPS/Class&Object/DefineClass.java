public class DefineClass {
    // Fields or Attributes
    String name;
    int age;

    // Constructor
    public DefineClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        // Creating objects of the Person class
        DefineClass person1 = new DefineClass("Alice", 30);
        DefineClass person2 = new DefineClass("Bob", 25);

        // Calling the introduce method on objects
        person1.introduce(); // Output: Hello, my name is Alice and I am 30 years old.
        person2.introduce(); // Output: Hello, my name is Bob and I am 25 years old.
    }
}
