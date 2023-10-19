package Practice;

public class Main {
    public static void main(String[] args) {
        // Create instances of  FirstName and Age
        FirstName person = new FirstName();
        Age age1 = new Age();

        // Access public members from different classes
        person.introduce();
        age1.setAge( 24);
        age1.displayAge();

        // Access package-private (default) member within the package
        System.out.println("Person's name: " + person.name );
        age1.displayAge();
    }
}
