public class PRectangle extends PShape {
 
    public PRectangle(){
      type = "Rectangle";
    }
  
    @Override
    public void draw() {
       System.out.println("Inside Rectangle::draw() method.");
    }
 }
