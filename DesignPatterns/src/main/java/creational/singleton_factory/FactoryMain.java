package creational.singleton_factory;

public class FactoryMain {
	 public static void main(String[] args) {
	      FruitFactory FruitFactory = new FruitFactory();
	      Fruit f1 = FruitFactory.getFruit("apple");
	      f1.showName();
	      Fruit f2 = FruitFactory.getFruit("mango");
	      f2.showName();
}
}