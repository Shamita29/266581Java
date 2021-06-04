 import java.util.*;

class Student{
	private String  name;
	private String address;
	private String mobile;


   public void setName(String name)
    {
        this.name = name;
    }
    public void setAddress(String address)
    {
        this. address = address;
    }
    
    public void setNum(String mobile)
    {
        this.mobile = mobile;
    }
    
    public String getName()
    {
    	return name;
    }

    public String getAddr()
    {
    	return address;
    }

    public String getNum()
    {
    	return mobile;
    }

    public void toPrint()
    { 
    	System.out.println("\n***Employee Details: ***");
    	System.out.println("Name: "+ getName());
    	System.out.println("Address: "+ getAddr());
    	System.out.println("Number: "+ getNum());
     }
}

class EmployeeMain{
	public static void main(String args[])
	{
   Student st = new Student();

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter name: ");
     String name = sc.nextLine();
          if((name.length()) == 0){
          	System.out.println("Invalid input");
             break;
         }
         else


   System.out.println("Enter address:");
   String addr = sc.nextLine();

   System.out.println("Enter number:");
   String num = sc.nextLine();

   st.setName(name);
   st.setAddress(addr);
   st.setNum(num);


   st.toPrint();
}
}
