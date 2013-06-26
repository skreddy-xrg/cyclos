import java.awt.List;
import java.util.NoSuchElementException;
import java.util.Scanner;



public class Current {

	/**
	 * @param args
	 */
	static Scanner s=new Scanner(System.in);
	static TopUps M=new TopUps();
	static int TBill=0;
	//static MainMenu M=new MainMenu();// Inastance for MainMenu
	static Current P=new Current();//Instance for Present Class-to call non static function in static main()
	
	
	
	public static void main(String[] args) throws NoSuchElementException {
		int rval;
		Boolean flag=true;
		while(flag)
		{
			P.billing();
			System.out.println("Do you want to choose more items ");
			flag=P.readflag();
			
		}
		
		System.out.println("Your Total Bill is "+TBill+".\nThank You for choosing us.");
	
s.close();
	
	}
	
	public  void billing()
	{
		int ItemNo=0,Itemrate=0,NofItems=0,TupPrice=0;
		

		P.display();
		ItemNo=P.read(5);
		Itemrate=M.Rate(ItemNo);
		System.out.println("Do you need TopUps ?");
		if(P.readflag())
		{
	TupPrice=M.DisplayTopups(ItemNo);	
		}
		
		
		NofItems=P.readValue();
		TBill=TBill+((Itemrate+TupPrice)*NofItems);
		

	}
	
	public void display ()//to display items..calling from MainMenu class
	{
		M.DisplayItems();
	}

	public int read(int a) //To read value from console
	{
	
	int rval;
	do
	{
		while(!s.hasNextInt())
		{
		System.out.println("Invalid Option selected. Please choose correct Option");
		s.next();
		}
		rval=s.nextInt();
		if((0<=rval & rval>=a))
		{
			System.out.println("Invalid Option selected. Please choose correct Option");
		}
	}while(0>=rval || rval>=a);

	
	return rval;
	
	}
	
	public Boolean readflag() //To read flag from console
	{

	//Boolean a;
	int rval;
	
	do
	{
		
		System.out.println("1.Yes");
		System.out.println("2.No");
		while(!s.hasNextInt())
		{
		System.out.println("Invalid Option selected. Please choose correct Option");
		s.next();
		}
		rval=s.nextInt();
		if((0<=rval & rval>=3))
		{
			System.out.println("Invalid Option selected. Please choose correct Option");
		}
	}while(0>=rval || rval>=3);

	if (rval==1)
	{
		return true;
	}
	else
	{
		return false;
	}
	}
	
	public int readValue() //To read flag from console
	{

	//Boolean a;
	int rval;
	
	System.out.println("Please Enter No.of.Plates");
		
	do
	{
		
		while(!s.hasNextInt())
		{
		System.out.println("Invalid Option selected. Please choose correct Option");
		s.next();
		}
		rval=s.nextInt();
		if(rval<=0)
		{
			System.out.println("Invalid Option selected. Please choose correct Option");
		}
	}while(0>=rval);
	

	return rval;
	
	
	}

	
	}

