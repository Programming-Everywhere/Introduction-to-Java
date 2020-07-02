class AvgSpeed {
   public static void main(String[] args) {
       int distance = 24;
       double time = 1 + 40.0/60 + 35.0/(60*60);
       System.out.println("Avg speed: " + Math.round(distance * 1.6 / time*100)/100.0);
   }
}
