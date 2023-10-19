

class A{
    int a = 10;
    String name = "RISE";

    void mymethod(){
        System.out.println("Method of A");
    }
}


class Program1{
    public static void main(String [] args){
    
        A a1 = new A();
        a1.mymethod();
        System.out.println(a1.a);
        
    }
} 