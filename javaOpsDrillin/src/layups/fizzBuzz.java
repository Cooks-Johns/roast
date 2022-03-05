package layups;


public class fizzBuzz {

   public static void fizzleUp( Integer start, Integer max, Integer num1, Integer num2) {
        for (int i = start; i <= max; i++) {

            if(i % num1 == 0 && i % num2 == 0) {
                System.out.println("FizzBuzz " + i + "\n");
            }else if(i % num1 == 0) {
                System.out.println("Fizz " + i + "\n");
            } else {
                System.out.print("Buzz " + i + "\n");
            }
        }C:\Users\12109\OneDrive - SNHU\Documents\myStuff
    }


}
