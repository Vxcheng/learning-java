public class AColorFactory extends AbstractFactory {
    
    @Override
    public AShape getShape(String shapeType){
       return null;
    }
    
    @Override
    public AColor getColor(String color) {
       if(color == null){
          return null;
       }        
       if(color.equalsIgnoreCase("RED")){
          return new ARed();
       } else if(color.equalsIgnoreCase("GREEN")){
          return new AGreen();
       } else if(color.equalsIgnoreCase("BLUE")){
          return new ABlue();
       }
       return null;
    }
 }