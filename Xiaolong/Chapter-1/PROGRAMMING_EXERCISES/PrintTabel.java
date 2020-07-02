/* 1.4 (Print a table) Write a program that displays the following table:
a a^2 a^3
1 1 1
2 4 8
3 9 27
4 16 64
*/
class PrintTabel {
  public static void main(String[] args) {
     
    System.out.println("a" + " a^2 " + " a^3");
    for(int a = 1; a <= 4; a++) {
       System.out.println(a + "  " + a*a + "  " + a*a*a);
    }
  }
}
