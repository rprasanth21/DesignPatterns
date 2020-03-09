package behavioral.template_strategy;



	public class Template_Cricket extends Template_Game {

		   
		   void endPlay() {
		      System.out.println("Cricket Game Finished!");
		   }

	
		   void initialize() {
		      System.out.println("Cricket Game Initialized! Start playing.");
		   }

	
		   void startPlay() {
		      System.out.println("Cricket Game Started. Enjoy the game!");
		   }
		
}
