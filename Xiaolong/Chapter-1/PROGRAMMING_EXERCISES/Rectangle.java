class Rectangle {
   public static void main(String[] args) {
        double width = 4.5, height = 7.9;
  
        double area  = width * height;
        double area0 = (int)Math.round(width * height * 100) / 100.0; 
	//double area1 = (int)(width * height * 100) / 100;
        System.out.println(area + " " + area0);
   }
}
