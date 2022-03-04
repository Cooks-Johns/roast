package layups;


public class fizzBuzz {

    static void fizzle(Integer n) {
        for (int i = 1; i <= n; i++) {

            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz" + i);
            }else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.print("Buzz");
            }
        }
    }




    private static void main(String args[]){
     
     

    }

    

}
