
// // interface one {

// //     void mymethod();

// // }

// // interface three {

// //     void print();

// // }

// // // class two implements one

// // class two implements one, three

// // {

// //     public void mymethod() {

// //         System.out.println("\nHello");

// //     }

// //     public void print() {

// //         System.out.println("Multiple inheritance");

// //     }

// // }

// // class HelloWorld {

// //     public static void main(String args[])

// //     {

// //         two a = new two();

// //         a.mymethod();

// //         a.print();

// //     }

// // }

// interface one{
//     int myMethod();
// }
// interface two{
//     int two();
// }
// interface three{
//     int three();
// }
// class four implements one,two,three{
//     int i=999+111;
//     public int myMethod(){
//         i=+i/i;
//         return i;
//     }
//     public int two(){
//         i=-i*i;
//         return i;
//     }
//     public int three(){
//         i=++i - --i;
//         return i;
//     }
// }
// class HelloWorld {
//     public static void main(String[] args) {
//         //System.out.println("Hello, World!");
//         four f = new four();
//         System.out.println(f.i);
//         System.out.println(f.myMethod());
//         System.out.println(f.two());
//         System.out.println(f.three());

//     }
// }

// interface A{
//     String s = "AAA";
//     String mymethod();
// }

// abstract class B{
//     String s="BBB";
//     public abstract String mymethod();
// }

// class C extends B implements A{
//     public String mymethod(){
//         String s = super.s + A.s;
//         return s;
//     }
// }

// class HelloWorld{
//     public static void main(String args[]){
//         // System.out.println("Hello World");
//          C c1 = new C();
//         //  System.out.println(c1.mymethod());
//          A a1 = c1;
//          System.out.println(a1.mymethod());
//     }
// }

interface X {
    char c = 'A';

    char methodX();
}

class Y implements X {
    {
        System.out.println(c);
    }

    public char methodX() {
        char c = this.c;

        return ++c;
    }
}

class HelloWorld {
    public static void main(String args[]) {
        Y y = new Y();

        System.out.println(y.methodX());

        System.out.println(y.c);

        System.out.println(X.c);

    }
}