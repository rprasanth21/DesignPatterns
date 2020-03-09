package behavioral.template_strategy;

public abstract class Template_Game {
	
		   abstract void initialize();
		   abstract void startPlay();
		   abstract void endPlay();

		   //template method
		   public final void play(){
		      initialize();
		      startPlay();
		      endPlay();
		   }
		

}
