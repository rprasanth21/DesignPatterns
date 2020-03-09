package behavioral.template_strategy;

public class Template_Football extends 	Template_Game {
		   void endPlay() {
		      System.out.println("Football Game Finished!");
		   }
		   void initialize() {
		      System.out.println("Start playing FootBall Game");
		   }

		   void startPlay() {
		      System.out.println("Football game started!");
		   }
		}

