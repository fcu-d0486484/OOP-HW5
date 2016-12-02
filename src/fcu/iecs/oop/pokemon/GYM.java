package fcu.iecs.oop.pokemon;

public class GYM 
{
	public static void fight(Pokemon p1, Pokemon p2)
	{
		int rnum = (int)(Math.random()*10);
		Pokemon winner;
		if(rnum%2==0)
		{
			winner=p1;
		}
		else
		{
			winner=p2;
		}
		System.out.println("Winner is "+winner.getName()+".");
		int newcp=winner.getCp()+500;
	}
}
