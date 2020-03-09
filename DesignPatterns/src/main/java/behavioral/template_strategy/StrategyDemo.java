package behavioral.template_strategy;
import java.util.Scanner;

	
	public class StrategyDemo {
		   public static void main(String[] args) {
			   Scanner sc=new Scanner(System.in);
			   int a=sc.nextInt();int b=sc.nextInt();
		      StrategyContext context = new StrategyContext(new StrategyAdd());		
		      System.out.println("add result= " + context.executeStrategy(a, b));

		      context = new StrategyContext(new StrategySub());		
		      System.out.println("sub result= " + context.executeStrategy(a, b));

		     
		   }
		

}
