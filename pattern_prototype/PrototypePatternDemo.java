public class PrototypePatternDemo {
    public static void main(String[] args) {
       ShapeCache.loadCache();
  
       PShape clonedShape = (PShape) ShapeCache.getShape("1");
       System.out.println("hape : " + clonedShape.getType());        
  
       PShape clonedShape2 = (PShape) ShapeCache.getShape("2");
       System.out.println("hape : " + clonedShape2.getType());        
  
       PShape clonedShape3 = (PShape) ShapeCache.getShape("3");
       System.out.println("hape : " + clonedShape3.getType());        
    }
 }