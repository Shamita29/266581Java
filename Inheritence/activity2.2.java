import java.util.*;

class HotelRoom{
	String hotelName;
	int numOfSqFeet;
	String hasTv;
	String hasWifi;

	public HotelRoom(String hname, int nosqft, String htv, String hwifi)
	{
		hotelName  = hname;
		numOfSqFeet = nosqft;
		hasTv = htv;
		this.hasWifi = hwifi;
	}

	
	public void calculateTarriff(int rpsf)
	{  
        int res = this.numOfSqFeet*rpsf;
        System.out.println("Room Tariff per day: "+res);
	}

	

}


class DeluxeRoom extends HotelRoom
{
    int ratePerSqFeet;

    public DeluxeRoom(String hname, int nosqft, String htv, String hasWifi)
    {
    	super(hname,nosqft,htv,hasWifi);
    	ratePerSqFeet = 10;
    }
      String cmp = "yes";
    public int getRatePerSqFt()
    {
    	if(super.hasWifi.equals(cmp))
    		return this.ratePerSqFeet+2;
    	else
    		return this.ratePerSqFeet;
    }
}

class DeluxeAcRoom extends DeluxeRoom
{
	public DeluxeAcRoom(String hname, int nosqft, String htv, String hasWifi)
	{
    	super(hname,nosqft,htv,hasWifi);
    	super.ratePerSqFeet = 12;
	}
	 public int getRatePerSqFt()
	 {
	 	return super.ratePerSqFeet;
	 }

}

class SuiteACroom extends HotelRoom
{
  private int ratepersqfeet;
  public SuiteACroom(String hname, int nosqft, String htv, String hasWifi)
	{
    	super(hname, nosqft,htv,hasWifi);
    	this.ratepersqfeet = 15;

	}      
	String cmp = "yes";

   public int getRatePerSqFt()
    {
    	if(super.hasWifi.equals(cmp))
    		return ratepersqfeet+2;
    	else
    		return ratepersqfeet;
    }
}

class HotelMain
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----Hotel Tariff Calculator----");
		System.out.println(" 1. Deluxe Room \n 2. Deluxe AC Room \n 3. Suite AC Room\n");
		System.out.println("Select Room Type: ");
		int type = sc.nextInt();

		if(type==1)
		{
		sc.nextLine();
		System.out.println("Hotel Name: ");
		String name = sc.nextLine();

		System.out.println("Square feet Area: ");
		int sqft = sc.nextInt();

		sc.nextLine();

		System.out.println("Room has TV(Yes/No): ");
		String tv= sc.nextLine();

		System.out.println("Room has Wifi(Yes/No) ");
		String wifi = sc.nextLine();

		DeluxeRoom dr = new DeluxeRoom(name,sqft,tv,wifi);
		int ret = dr.getRatePerSqFt();
		dr.calculateTarriff(ret);

	   }

	   if(type==2)
		{
		sc.nextLine();
		System.out.println("Hotel Name: ");
		String name = sc.nextLine();

		System.out.println("Square feet Area: ");
		int sqft = sc.nextInt();

		sc.nextLine();

		System.out.println("Room has TV(Yes/No): ");
		String tv= sc.nextLine();

		System.out.println("Room has Wifi(Yes/No) ");
		String wifi = sc.nextLine();

		DeluxeAcRoom dar = new DeluxeAcRoom(name,sqft,tv,wifi);
		int ret = dar.getRatePerSqFt();
		dar.calculateTarriff(ret);

	   }

	   if(type==3)
		{
		sc.nextLine();
		System.out.println("Hotel Name: ");
		String name = sc.nextLine();

		System.out.println("Square feet Area: ");
		int sqft = sc.nextInt();

		sc.nextLine();

		System.out.println("Room has TV(Yes/No): ");
		String tv= sc.nextLine();

		System.out.println("Room has Wifi(Yes/No) ");
		String wifi = sc.nextLine();

		SuiteACroom sac = new SuiteACroom(name,sqft,tv,wifi);
		int ret = sac.getRatePerSqFt();
		sac.calculateTarriff(ret);

	   }





	}
}