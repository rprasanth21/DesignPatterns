package structural.proxy_facade;

public class ShapeMaker {
	   
	   private Shape rectangle;
	   private Shape square;

	   public ShapeMaker() {
	      
	      rectangle = new Rectangle();
	      square = new Square();
	   }
	   public void drawRectangle(){
	      rectangle.draw();
	   }
	   public void drawSquare(){
	      square.draw();
	   }
	}
	