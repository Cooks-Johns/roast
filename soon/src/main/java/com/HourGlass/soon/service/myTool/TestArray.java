package com.HourGlass.soon.service.myTool;

import java.text.NumberFormat;
import java.util.Scanner;

public class TestArray {


// Todo ------>  Try thinking to keep main easy to read with all of the work being done below
   public static void main(String[] args) {


// 1)     Using formatter


//-----------------------------------/
// 2)     Find if num is even or Odd
//      Scanner evenOddScan = new Scanner(System.in);
//      System.out.println("Enter the number: \n");
//      int usrNum = evenOddScan.nextInt();
//      findEvenOdd(usrNum);



// ------------> Todo make it so your main tells the story

//      int N = 200;
//      int k;
//      Scanner sc = new Scanner(System.in);
//      k = sc.nextInt();
//      int i = 0;
//      for (int num = 2; num <= N; num++) {
//         if (isPrimeNumber(num) && i != k) {
//            System.out.println(num);
//            i++;
//         }
//      }




   }


// -------------------------> WareHouse

//2)
 public static void findEvenOdd(int num) {
      if(num %2 == 0)
         System.out.println(num + " is even");
      else
         System.out.println(num + " is odd");
   }


// 1)
   public static void formatLongInt() {
      // Fixme
   }

// Build differnt methods that might be used for a busin

   public static boolean isPrimeNumber(int num) {
      for (int i = 2; i < num; i++) {
         if (num % i == 0) {
            return false;
         }
      }
      return true;
   }








}