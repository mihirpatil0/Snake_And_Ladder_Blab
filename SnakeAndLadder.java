package snakeandladder;

import java.util.Random;

public class SnakeAndLadder 
{	
	public static void main(String[] args)
	{
		int startPosition = 0;
		Random random = new Random();
		int dice = random.nextInt(7)+1;
		System.out.println("Random number generated by dice is" + " " + dice);
	}
}
