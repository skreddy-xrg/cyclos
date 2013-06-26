import java.util.Scanner;


public class TopUps extends MainMenu {
	Scanner s=new Scanner(System.in);
	
	public int Idly()
	{
		int count,price=0;
		System.out.println("1.Chutney-Rs.25");
		System.out.println("2.Sambar-Rs.35");
		System.out.println("3.Raitha-Rs.25");
	count= read(4);
	switch (count)
	{
	
	case 1:
		price=25;
		break;
	case 2:
		price=35;
		break;
	case 3:
		price=25;
		break;
	
	
	}
	
	return price;
		
	}
	public int Dosa()
	{
		int count,price=0;
		System.out.println("1.Chutney-Rs.25");
		System.out.println("2.Sambar-Rs.35");
		System.out.println("3.Raitha-Rs.25");
		count= read(4);
		switch (count)
		{
		
		case 1:
			price=25;
			break;
		case 2:
			price=35;
			break;
		case 3:
			price=25;
			break;
		
		
		}
		
		return price;
	}
	public int Upma()
	{
		int count,price=0;
		System.out.println("1.Chutney-Rs.25");
		System.out.println("2.Sambar-Rs.35");
		System.out.println("3.Raitha-Rs.25");
		count= read(4);
		switch (count)
		{
		
		case 1:
			price=25;
			break;
		case 2:
			price=35;
			break;
		case 3:
			price=25;
			break;
		
		
		}
		
		return price;
	}
	
	public int Chapathi()
	{
		int count,price=0;
		System.out.println("1.Chutney-Rs.25");
		System.out.println("2.Sambar-Rs.35");
		System.out.println("3.Raitha-Rs.25");
		count= read(4);
		switch (count)
		{
		
		case 1:
			price=25;
			break;
		case 2:
			price=35;
			break;
		case 3:
			price=25;
			break;
		
		
		}
		
		return price;
		
	}
	
	public int DisplayTopups(int a)
	{
		int Tprice=0;
		Boolean flag=true;
		while(flag)
		{
		switch (a)
		{
		
		case 1:
			Tprice=Tprice+Idly();
			break;
		case 2:
			Tprice=Tprice+Dosa();
			break;
		case 3:
			Tprice=Tprice+Upma();
			break;
		case 4:
			Tprice=Tprice+Chapathi();
			break;
		
		}
		System.out.println("Do you want to choose more Top-Ups");
		flag=readflag();
		
		}
		return Tprice;
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

}
