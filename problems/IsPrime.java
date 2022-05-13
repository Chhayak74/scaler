package problems;

import java.util.Scanner;

public class IsPrime {
    public static boolean CheckPrime(int num) {
      int count = 0;
      for(int i = 1; i*i< num; i++) {
        if(i*i == num) {
          count += 1;
        }else if(num%i == 0) {
          count +=2;
        }
      }
      if(count != 2) return false;
      return true;
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      System.out.println(CheckPrime(num)); 
      sc.close();    
    }
}