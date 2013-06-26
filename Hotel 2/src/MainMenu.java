
public class MainMenu {

	public void DisplayItems() // It will Display the Main Menu
{
		System.out.println("Choose Your Items");
	System.out.println("1.Idly-Rs.25");
	System.out.println("2.Dosa-Rs.35");
	System.out.println("3.Upma-Rs.25");
	System.out.println("4.Chapathi-Rs.40");
	
	
}
	
	public int Rate(int i) // It will Return the Item Cost
	{
		int rate=0;
		switch(i)
		{
		
		case 1:
		
		rate=25;
		break;
		
		case 2:
			
			rate=35;
			break;
		
		case 3:
			
			rate=25;
			break;
		
		case 4:
			
			rate=25;
			break;
		}

		
		
		return rate;
	}

}
