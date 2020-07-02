class PopulationProjection {
   public static void main(String[] args) {
       int birth = 7;
       int death = 13;
       int immigrant = 45;
       int currentPopulation = 312032486;
       int daysOfYear = 365;
       
       int total_seconds = 365*5*24*60*60;
       int gain = 45+7-13;
       System.out.println(total_seconds);
       System.out.println(total_seconds/gain);
   }
}
