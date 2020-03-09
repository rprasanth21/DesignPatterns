package creational.singleton_factory;

public class Singleton {

	  
	   private static Singleton instance = new Singleton();
	   private Singleton(){}

	  
	   public static Singleton getInstance(){
	      return instance;
	   }

	   public void get(){
	      System.out.println("This is for singleton pattern implementation");
	   }
	}


