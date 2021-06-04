import java.util.*;

class Customer{
  private String  name;
  private String employees;
  private String teamlead;


   public void setName(String name)
    {
        this.name = name;
    }
    public void setEmp(String employees)
    {
        this. employees = employees;
    }
    
    public void setTL(String teamlead)
    {
        this.teamlead = teamlead;
    }
    
    public String getName()
    {
      return name;
    }

    public String getEmp()
    {
      return employees;
    }

    public String getTL()
    {
      return teamlead;
    }

    public void toPrint()
    { 
      System.out.println("\n***Employee Details: ***");
      System.out.println("Name: "+ getName());
      System.out.println("Employees: "+ getEmp());
      System.out.println("Lead: "+ getTL());
     }
}


class CustomerMain{
    public static void main(String args[])
    {
   Customer cu = new Customer();
   int flag = 0;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Company name: ");
   String comp = sc.nextLine(); 
   
   System.out.println("Enter details: ");
   String line = sc.nextLine();
   String[] words = line.split("[,]",0);

   System.out.println("Enter team lead");
   String  tl  = sc.nextLine();
  
   for(String w: words)
   {
    if (tl.equals(w))
       flag = 1;
  }
   
   if (flag == 1)
   {
     cu.setName(comp);
     cu.setEmp(line);
     cu.setTL(tl);
     cu.toPrint();
   }
   else
     System.out.println("Invalid input");
}
}
