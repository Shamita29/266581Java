import java.util.*;


abstract class Match
{
	int currentscore;
	Float currentover;
	int target;

	public void setScore(int val)
	{
		currentscore=val;
	}

	public void setOver(Float val)
	{
		currentover=val;
	}

	public void setTarget(int val)
	{
		target=val;
	}

	public int getScore()
	{
		return currentscore;
	}

	public Float getOver()
	{
		return currentover;
	}

	public int getTarget()
	{
		return target;
	}


	public abstract Float calculateRunRate();
	public abstract int calculateBalls();
	public abstract void display(Float reqRunrate, int balls);
}

class ODImatch extends Match
{ Float over;
  public Float calculateRunRate()
  {
    int rscore = super.getScore() - super.getTarget();
     Float over = super.getOver() - 50;

     return rscore/over;
  }
   
  public int calculateBalls()
  {
  	  Float over = 50 - super.getOver();
      int balls = (int)(over*6);
      return balls;
  }

  public void display(Float rr, int balls){
    int rscore =super.getTarget() - super.getScore();
  	System.out.println("Need "+rscore+" runs in "+balls+" balls");
  	System.out.println("Required run rate: "+rr);
  }
}

class T20match extends Match
{
public Float calculateRunRate()
  {
    int rscore = super.getScore() - super.getTarget();
     Float over = super.getOver() - 20;

     return rscore/over;
  }
   
  public int calculateBalls()
  {
  	  Float over = 20 - super.getOver();
      int balls = (int)(over*6);
      return balls;
  }

  public void display(Float rr, int balls){
    int rscore =super.getTarget() - super.getScore();
  	System.out.println("Need "+rscore+" runs in "+balls+" balls");
  	System.out.println("Required run rate: "+rr);
  }
}

class TestMatch extends Match
{
	public Float calculateRunRate()
  {
    int rscore = super.getScore() - super.getTarget();
     Float over = super.getOver() - 90;

     return rscore/over;
  }
   
  public int calculateBalls()
  {
  	  Float over = 90 - super.getOver();
      int balls = (int)(over*6);
      return balls;
  }
  public void display(Float rr, int balls){
    int rscore =super.getTarget() - super.getScore();
  	System.out.println("Need "+rscore+" runs in "+balls+" balls");
  	System.out.println("Required run rate: "+rr);
  }
}

class MatchMain
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" 1. ODI \n 2. T20 \n 3. Test");
		int type = sc.nextInt();

		if(type == 1)
		{
			sc.nextLine();
			System.out.println("Enter the Current score: ");
			int score = sc.nextInt();

			System.out.println("Enter the Current Over: ");
			Float over = sc.nextFloat();

			System.out.println("Enter the Target score: ");
			int target = sc.nextInt();
			ODImatch odi = new ODImatch();
			odi.setScore(score);
			odi.setOver(over);
			odi.setTarget(target);
			 //odi.calculateRunRate();
			 //odi.calculateBalls();
			Float rr = odi.calculateRunRate();
			int balls= odi.calculateBalls();
			odi.display(rr,balls);

		}

		if(type == 2)
		{
			sc.nextLine();
			System.out.println("Enter the Current score: ");
			int score = sc.nextInt();

			System.out.println("Enter the Current Over: ");
			Float over = sc.nextFloat();

			System.out.println("Enter the Target score: ");
			int target = sc.nextInt();

			T20match t20 = new T20match();

			t20.setScore(score);
			t20.setOver(over);
			t20.setTarget(target);
			Float rr = t20.calculateRunRate();
			int balls= t20.calculateBalls();
			t20.display(rr,balls);
			
		}

		if(type == 3)
		{
			sc.nextLine();
			System.out.println("Enter the Current score: ");
			int score = sc.nextInt();

			System.out.println("Enter the Current Over: ");
			Float over = sc.nextFloat();

			System.out.println("Enter the Target score: ");
			int target = sc.nextInt();
			
			TestMatch t = new TestMatch();
			t.setScore(score);
			t.setOver(over);
			t.setTarget(target);
			Float rr=t.calculateRunRate();
			int balls=t.calculateBalls();
			t.display(rr,balls);
		}
	}
}