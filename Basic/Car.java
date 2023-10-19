class Car {

    int price;
    String name,model,color;

    Car(int price,String name,String model,String color){
        this.price = price ;
        this.name=name;
        this.model=model;
        this.color=color;
    }
        void display(){
            System.out.println(price+ " "+name+ " "+model+" "+color);
        }
        
         
    
    public static void main(String [] args)
    {
        // System.out.println("Hello World!");
        Car c1= new Car(20000000, "Audi","A6","Black");
        Car c2= new Car(20000000, "BMW","B700","White");

        // System.out.println("Car 1: " + c1.name + " " + c1.model+" "+c1.color);
        // System.out.println("Car 2: " + c2.name + " " + c2.model+" "+c2.color);

        c1.display();
        c2.display();
    }
}

