import java.util.*;

class Innings
{ 
  String teamname;
  String inningsname;
  int runs;
   	Scanner sc = new Scanner(System.in);

 public void setTeamName(String name)
    {
        teamname = name;
    }
    public void setInnings(String innings)
    {
        inningsname = innings;
    }
    
    public void setRun(int run)
    {
        runs = run;
    }
    
    public String getTeamName()
    {
    	return teamname;
    }

    public String getInnings()
    {
    	return inningsname;
    }

    public int getRuns()
    {
    	return runs;
    }


    public void displayInningsDetails()
    {
     int total = getRuns();
     String currentteam = getTeamName();

     System.out.println("\nEnter the team name: ");
   	 String team = sc.nextLine();

   	System.out.println("Enter session: ");
   	String session = sc.nextLine();

   	System.out.println("Enter runs: ");
   	int runs =sc.nextInt();
    
    setTeamName(team);
	setInnings(session);
	setRun(runs);

    if(getRuns()>total)
    {
	System.out.println("\nSample Output: ");
   	System.out.println("Name: "+ getTeamName().toUpperCase());
   	System.out.println("Scored: "+ getRuns());   
   	System.out.println("Match ended");
   	 }

    else
    {
    System.out.println("\nSample Output: ");
   	System.out.println("Name: "+ currentteam.toUpperCase());
   	System.out.println("Scored: "+ total);   
   	System.out.println("Match ended");
    }

    }
}

class InningsMain
{
   public static void main(String[] args)
    {
    int i = 0;
   	Scanner sc = new Scanner(System.in);
   	Innings in = new Innings();
   
   	System.out.println("Enter the team name: ");
   	String team = sc.nextLine();

   	System.out.println("Enter session: ");
   	String session = sc.nextLine();

   	System.out.println("Enter runs: ");
   	int runs =sc.nextInt();
    
   	 
 	in.setTeamName(team);
	in.setInnings(session);
	in.setRun(runs);
	    runs++;
   	System.out.println("\nSample Output: ");
   	System.out.println("Name: "+in.getTeamName());
   	System.out.println("Scored: "+in.getRuns());
   	System.out.println("Need "+ runs +" to win");

   	in.displayInningsDetails();
    
}
}