public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
       if(choice.equalsIgnoreCase("SHAPE")){
          return new AShapeFactory();
       } else if(choice.equalsIgnoreCase("COLOR")){
          return new AColorFactory();
       }
       return null;
    }
 }