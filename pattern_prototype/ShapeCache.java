import java.util.Hashtable;
 
public class ShapeCache {
    
   private static Hashtable<String, PShape> shapeMap 
      = new Hashtable<String, PShape>();
 
   public static PShape getShape(String shapeId) {
      PShape cachedShape = shapeMap.get(shapeId);
      return (PShape)cachedShape.clone();
   }
 
   // 对每种形状都运行数据库查询，并创建该形状
   // shapeMap.put(shapeKey, shape);
   // 例如，我们要添加三种形状
   public static void loadCache() {
      PCircle circle = new PCircle();
      circle.setId("1");
      shapeMap.put(circle.getId(),circle);
 
      PSquare square = new PSquare();
      square.setId("2");
      shapeMap.put(square.getId(),square);
 
      PRectangle rectangle = new PRectangle();
      rectangle.setId("3");
      shapeMap.put(rectangle.getId(),rectangle);
   }
}