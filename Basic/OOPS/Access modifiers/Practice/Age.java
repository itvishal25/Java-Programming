package Practice;

public class Age {
    // Private field
    private int age = 24;

    // Public method to set the age
    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        }
    }

    // Public method to display age (accessed within the package)
    void displayAge() {
        System.out.println("I am " + age + " years old.");
    }
}
