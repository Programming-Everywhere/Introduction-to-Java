






10



#Answer 



private static double KILOMETERS = 14.0;
private static double MILES = KILOMETERS / 1.6;

public static void main(String[] strings) {

    double formula = (45.5 * 60.0 + 30.0) / (60.0 * 60.0);
    double milesPerHour = MILES / formula;

    System.out.println(milesPerHour);
}


Output = 11.41304347826087
