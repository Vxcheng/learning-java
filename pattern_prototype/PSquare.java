public class PSquare extends PShape {
 
    public PSquare(){
      type = "Square";
    }
  
    @Override
    public void draw() {
       System.out.println("Inside Square::draw() method.");
    }
 }