class A{
    private int a;
    public int getnum(){
        return a;
    }

    public void setnu(int a){
        this.a = a;
    }
}

class Program1{
    public static void main(String [] args){
        A a1 = new A();
        a1.setnu(20);
        System.out.println(a1.getnum());
    }
}