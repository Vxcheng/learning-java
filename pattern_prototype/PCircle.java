public class PCircle extends PShape {
 
    public PCircle(){
      type = "Circle";
    }
  
    @Override
    public void draw() {
       System.out.println("Inside Circle::draw() method.");
    }
 }