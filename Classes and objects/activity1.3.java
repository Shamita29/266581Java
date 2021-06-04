import java.util.*;

class Customer{
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


class CustomerMain{
    public static void main(String args[])
    {
   Student st = new Student();

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter details: ");
   String line = sc.nextLine();
   String[] words = line.split("[,]",0);

   st.setName(words[0]);
   st.setAddress(words[1]);
   st.setNum(words[2]);

   st.toPrint();
}
}