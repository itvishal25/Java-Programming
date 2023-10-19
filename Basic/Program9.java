public class Program9 {
//    static int mymethod(int... num){
//     return num[0];
//    } 
//    public static void main(String[] args){
//     int []num = {11,22,33,44,55};
//     for(int i = 0; i < num.length; i++) {
//         System.out.println(num[i]);
//     }
//    }
// }
    
//     static void mymethod(int... arr){
//         for(int i:arr){
//             System.out.println(i*10);
//         }
//     }
//  public static void main(String[] args){


//     mymethod(1,2,3,4,5);
//     System.out.println("\n");
    
//  }
 
// }

public static void main(String [] args){
    int sum = 0;
    int [] a = {3,7,8,9};
    for(int i = 0; i<a.length; i++){
        sum = sum +a [i];
    }

    System.out.println(sum);
}

}