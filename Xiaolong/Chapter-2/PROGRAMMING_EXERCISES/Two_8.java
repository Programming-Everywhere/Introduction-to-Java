import java.util.*;
class Two_8 {
  public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Enter a offset for GMT: ");
     int offSet = keyboard.nextInt();
     
     long totalMillionSeconds = System.currentTimeMillis();
     long totalSeconds = totalMillionSeconds / 1000;
     long currentSecond = totalSeconds % 60;
     long totalMins = totalSeconds / 60;
     long currentMin = totalMins % 60;
     long totalHours = totalMins / 60;

     long currentHours = totalHours % 24;
   
     System.out.println("The current time is " + (currentHours + offSet) + ":" + currentMin + ":" + currentSecond);
     
  }
}
