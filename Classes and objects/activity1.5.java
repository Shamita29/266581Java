import java.util.*;

class Employee
{
	String name;
	String address;
	String mobile;
	Scanner sc = new Scanner(System.in);

  public void setName(String name)
  {
  	this.name = name;
  }	

  public void setAddress(String address)
  {
  	this.address = address;
  }

  public void setMob(String mobile)
  {
  	this.mobile = mobile;
  }

  public String getName(){
  	return name;
  }
  public String getAddress(){
   return address;
  }
  public String getMob(){
  	return mobile;
  }

  public String toReturn()
  {
  	return "Employee details: \n name: " + getName() + "\n address: " + getAddress() + "\n mobile : "+ getMob() ;
  }

  public void updateName()
  {
  	System.out.println("Current name is: "+ getName());
    System.out.println("Enter new name: ");
    String name1 = sc.nextLine();
    setName(name1);
  }

  public void updateAddr()
  {
    System.out.println("Current address is: "+ getAddress());
    System.out.println("Enter new address");
    String addr1 = sc.nextLine();
    setAddress(addr1);
  }

  public void updateMob()
  {
    System.out.println("Current mobile number is: "+ getMob());
    System.out.println("Enter new number");
    String num1 = sc.nextLine();
    setMob(num1);
  }
}


class EmployeeMain
{
 public static void main(String[] args)
  {
	Employee emp  = new Employee();
	Scanner sc = new Scanner(System.in);

    System.out.println("Enter name");
	String name = sc.nextLine();

	System.out.println("Enter address");
	String addr = sc.nextLine();

	System.out.println("Enter mobile");
	String num = sc.nextLine();

	emp.setName(name);
	emp.setAddress(addr);
	emp.setMob(num);

    System.out.println("\n\nVerify and update details:\n Menu");
    while(true){
    System.out.println(" 1. Update Employee name\n 2. Update Employee address\n 3. Update Employee number\n 4. Ok and Exit");
    int op  = sc.nextInt();
    
    switch(op)
    {
    	case 1:   emp.updateName(); 
    	          break;
    	          
    	case 2:   emp.updateAddr(); 
    	          break;

    	case 3:   emp.updateMob(); 
    	          break;

    	case 4:    System.out.println(emp.toReturn());

    	          return;

    	default: System.out.println("Invalid input");

    } 
}


}
}