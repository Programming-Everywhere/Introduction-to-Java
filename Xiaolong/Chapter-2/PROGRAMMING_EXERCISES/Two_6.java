import java.util.*;
class Two_6 {
  public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Enter a number between 0 and 1000: ");
     int num = keyboard.nextInt();
     int sum = 0;
     while(num > 0) {
       sum += num % 10;
       num /= 10;
     }
     System.out.println("The sum of the digits is " + sum);
  }
}
