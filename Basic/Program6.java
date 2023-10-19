//Nested if statement

public class Program6 {
    public static void main(String [] args){
        int age = 18;
        int weight=80;

        if(age>=18){
            if(weight>80){
                System.out.println("You are eligible to donate blood");
            } else {
                System.out.println("You are not eligible to donate blood");
            }
        } else {
                System.out.println("Age must be greater than 18");
        }
    }
}
