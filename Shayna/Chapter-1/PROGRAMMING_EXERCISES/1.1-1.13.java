"""
Author: Shayna Fu
Date: July 2, 2020

"""

1.1
Write a program that displays Welcome to Java, Welcome to Computer Science, and
Programming is fun.

SOLUTION:
public class Exercise_1 {
  public static void main(String[] args) {
    System.out.println("Welcome to Java");
    System.out.println("Welcome to Computer Science");
    System.out.println("Programming is fun");
  }
}

1.2
Write a program that display Welcome To Java five times.

SOLUTION:
public class Exercise_2 {
  public static void main(String[] args) {
    System.out.println("Welcome to Java");
    System.out.println("Welcome to Java");
    System.out.println("Welcome to Java");
    System.out.println("Welcome to Java");
    System.out.println("Welcome to Java");
  }
}

1.3
Write a program that displays the following pattern:

SOLUTION:
public class Exercise_3 {
  public static void main(String[] args) {
    System.out.println("    J    A   V     V  A ");
    System.out.println("    J   A A   V   V  A A");
    System.out.println("J   J  AAAAA   V V  AAAAA");
    System.out.println(" J J  A     A   V  A     A");
  }
}

1.4
Write a program that displays the following table:

SOLUTION:
public class Exercise_4 {
  public static void main(String[] args) {
    System.out.println("a    a^2    a^3");
    System.out.println("1    1      1");
    System.out.println("2    4      8");
    System.out.println("3    9      27");
    System.out.println("4    16     64");
  }
}

1.5
Write a program that displays the result of
         9.5 * 4.5 - 2.5 * 3
        ---------------------
             45.5 - 3.5

SOLUTION:
public class Exercise_5 {
  public static void main(String[] args) {
    System.out.println((9.5 * 4.5 - 2.5 * 3) / (45 - 3.5));
  }
}

1.6
Write a program that displays the result of
     1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9

SOLUTION:
public class Exercise_6 {
  public static void main(String[] args) {
    System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
  }
}

1.7
π can be computed using the following formula:

SOLUTION:
public class Exercise_7 {
  public static void main(String[] args) {
  System.out.println(4 * (1.0 - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11)));
  System.out.println(4 * (1.0 - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11)+ (1 / 13)));
  }
}

1.8
Write a program that displays the area and perimeter of a circle that has a 
radius of 5.5 using the following formula:
                perimeter = 2 * radius * π
                area = radius * radius * π

SOLUTION:
public class Exercise_8 {
  public static void main(String[] args) {
    System.out.println("Perimeter = ");
    System.out.println(2 * 5.5 * 3.14159);
    System.out.println("Area = ");
    System.out.println(5.5 * 5.5 * 3.14159);
  }
}

1.9
Write a program that displays the area and perimeter of a rectangle with the
width of 4.5 and height of 7.9 using the following forumla:
                area = width * height

SOLUTION:
public class Exercise_9 {
  public static void main(String[] args) {
    System.out.println("Area = ");
    System.out.println(4.5 * 7.9);
    System.out.println("Perimeter = ");
    System.out.println(2 * (4.5 + 7.9));
  }
}  

1.10
Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a 
program that displays the average speed in miles per hour.

SOLUTION:
public class Exercise_10 {
  public static void main(String[] args) {
    System.out.println((14 / 45.30) / 1.6);
  }
}

1.11
The U.S Census Bureau projects population based on the following assumptions:
- One birth every 7 seconds
- One death every 13 second
- One new immigrant every 45 seconds
Write a program to display the population for each of the next five years. 
Assume the current population is 312,032,486 and one year has 365 days.

SOLUTION:
public class Exercise_11 {
  public static void main(String[] args) {
    System.out.println("Current Population: 312,032,486");
    System.out.println("One birth every 7 seconds");
    System.out.println("One death every 13 seconds");
    System.out.println("One new immigrant every 45 seconds");
    System.out.println("The population projection for the next 5 years are as follows");
    System.out.println("Year 1: ");
    System.out.println(312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 1));
    System.out.println("Year 2: ");
    System.out.println(312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 2));
    System.out.println("Year 3: ");
    System.out.println(312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 3));
    System.out.println("Year 4: ");
    System.out.println(312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 4));
    System.out.println("Year 5: ");
    System.out.println(312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 5));
  }
}    

1.12
Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. Write a
program that displays the average speed in kilometers per hour.

SOLUTION:
public class Exercise_12 {
  public static void main(String[] args) {
    System.out.println((24 / (1 + (40 / 60.0) + (35 / 3600.0))) * 1.6);
  }
}

1.13
You can use Cramer's rule to solve the following 2 * 2 system of linear
equation:
            ax + by = e      ed - bf      af - ec
                         * = -------  y = -------
            cx + dy = f      ad - bc      ad - bc

Write a  program that solves the following equation and displays the value for x and y:
          
                     3.4x + 50.2y = 44.5
                     2.1x + .55y = 5.9

SOLUTION:
public class Exercise_13 {
  public static void main(String[] args) {
    System.out.println("x = ");
    System.out.println((((44.5 * .55) - (50.2 * 5.9)) / ((3.4 * .55) - (50.2 * 2.1))));
    System.out.println("y = ");
    System.out.println((((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * .55) - (50.2 * 2.1))));
  }
}
