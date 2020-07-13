import java.util.*;
class Two_1 {
  public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     System.out.println("What is the tempreture now: ");
     double celsius = keyboard.nextDouble();
     System.out.println("it is "+((9.0 / 5) * celsius + 32)+ " fahrenheit");
  }
}
