import java.util.*;
class Two_9 {
  public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Enter v0, v1, and t: ");
     double V0 = keyboard.nextDouble();
     double V1 = keyboard.nextDouble();
     double time = keyboard.nextDouble();

     System.out.println((V1 - V0)/ time);
  }
}
