import java.util.*;
class AreaPerimeter {
   public static void main(String[] args) {
        double radius = 5.5;
        double perimeter =(double)((int)(2 * radius * Math.PI * 100)/100);
        double area = (double)((int)(radius * radius * Math.PI*100)/100);
        System.out.println("Radius " + radius + "'s Perimeter: " + perimeter + " Area: "+ area);
   }
}
