package creational.singleton_factory;

public class FruitFactory {
	
		
		    
		   public Fruit getFruit(String FruitType){
		      if(FruitType == null){
		         return null;
		      }		
		      if(FruitType.equals("apple")){
		         return new Apple();
		         
		      } else if(FruitType.equals("mango")){
		         return new Mango();
		         
		      } 
		      
		      return null;
		   }
		
}
