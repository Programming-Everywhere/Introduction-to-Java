class AverageSpeed {
   public static void main(String[] args) {
        double distance = 14.0;
        double min = 45;
        double seconds = 30;
        
        double miles = distance * 1.6;
        double hour =((45 +(double)30 / 60) / 60.0);
        System.out.println(miles);
        System.out.println(hour);
       
        System.out.println(Math.round(miles/hour*100)/100.0);
   }
}
