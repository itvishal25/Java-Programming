class Program10 {
    int a,b;
    void show() {
        System.out.println("This is the Constructor A");
    }

    Program10(int a, int b) {
        this.a=a;
        this.b=b;
        System.out.println(a+b);
    }

    void print() {
        System.out.println("Print method of A");
    }

    public static void main(String[] args) {
        B b1 = new B();
        b1.print();
        b1.show();
        b1.display();
    }
}

class B extends Program10 {
    void display() {
        System.out.println("This is method of B");
    }

    B() {
        super(15,44);
        System.out.println("This the method B");
    }

    void print() {
        super.print();
        System.out.println("Print method of class B");
    }
}
