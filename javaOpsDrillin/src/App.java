
// Hello John, 
        // It was good talking to you and 




public class App {

    static void fizzle( Integer start, Integer max, Integer num1, Integer num2) {
        for (int i = start; i <= max; i++) {

            if(i % num1 == 0 && i % num2 == 0) {
                System.out.println("FizzBuzz " + i + "\n");
            }else if(i % num1 == 0) {
                System.out.println("Fizz " + i + "\n");
            } else {
                System.out.print("Buzz " + i + "\n");
            }
        }
    }


    public static void main(String[] args) throws Exception {

        
     // fizzle(start, max, num1, num2);
    //  Todo 

    // 
    // 
    // 

        fizzle(1, 100, 3, 5);
        fizzle(-100, 1, 3, 5);


        
        
        
    }
}
