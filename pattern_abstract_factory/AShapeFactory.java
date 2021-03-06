public class AShapeFactory extends AbstractFactory {
    
    @Override
    public AShape getShape(String shapeType){
       if(shapeType == null){
          return null;
       }        
       if(shapeType.equalsIgnoreCase("CIRCLE")){
          return new ACircle();
       } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
          return new ARectangle();
       } else if(shapeType.equalsIgnoreCase("SQUARE")){
          return new ASquare();
       }
       return null;
    }
    
    @Override
    public AColor getColor(String color) {
       return null;
    }
 }