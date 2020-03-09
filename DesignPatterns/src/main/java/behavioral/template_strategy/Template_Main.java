package behavioral.template_strategy;

public class Template_Main {
	
		   public static void main(String[] args) {

		      Template_Game game = new Template_Cricket();
		      game.play();
		      System.out.println();
		      game = new Template_Football();
		      game.play();		
		   }
		}

