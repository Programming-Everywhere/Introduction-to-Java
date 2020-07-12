import java.util.*;
class Two_7 {
  public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Enter a number between of minutes: ");
     int min = keyboard.nextInt();
     int year = min /(60 * 24 * 365);
     int minsLeft = min % (60 * 24 * 365);
     int days = minsLeft /(60 * 24);
     System.out.println( min +" minutes is approximately "+ year +" years and "+ days+" days");
  }
}
