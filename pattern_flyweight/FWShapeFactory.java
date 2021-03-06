import java.util.HashMap;
 
public class FWShapeFactory {
   private static final HashMap<String, FWShape> circleMap = new HashMap<>();
 
   public static FWShape getCircle(String color) {
      FWCircle circle = (FWCircle)circleMap.get(color);
 
      if(circle == null) {
         circle = new FWCircle(color);
         circleMap.put(color, circle);
         System.out.println("Creating circle of color : " + color);
      }
      return circle;
   }
}