import java.util.*;
public class ConversionMenu
{
	static Scanner console=new Scanner(System.in);
	
	public void subMenu1()
	{
		Conversion testConversion=new Conversion();
			ConversionMenu testConversionMenu=new ConversionMenu();
		try
		{
			
			int choice;
		
				
			do
			{
				testConversion.Box();
				
				
				System.out.println("Conversion Menu: ");
				System.out.println("     0 Cubic inches in a mile.");
				System.out.println("     1: Miles to inches.");
				System.out.println("     2. Gallons to Liters chart.");
				System.out.println("     3. Covert gallons to liters.");
				System.out.println("     4. Distance from lightening.");
				System.out.println("     5. Metric Weight conversion");
					System.out.println("\t   a. kg to lbs");
					System.out.println("\t   b. lbs to kg");
				System.out.println("     6. Speed conversion");
					System.out.println("\t   a. Mph to Km/h");
					System.out.println("\t   b. Km/h to Mph");
				System.out.println("     7. Torque Conversion");
					System.out.println(" 	   a. NM to lb/ft");
					System.out.println("\t   b. lb/ft to NM");
				System.out.println("8. Portfolio Rebalance");
				System.out.println("9. Exit");
		
				testConversion.Box();
				System.out.println(" please enter you choice here: ");
				choice=console.nextInt();
				
				
				
				
				System.out.println("\n");
			
			switch(choice)
			{
				case 0:
					testConversion.cubicIn();
					break;
				case 1:
					testConversion.MilestoInches();
					break;
				case 2: 
					testConversion.GaltoLit();
					break;
				case 3:
					testConversion.InputGaltoLit();
					break;
				case 4:
					testConversion.lightening();
					break;
				case 5:
					testConversionMenu.NestedSwitch5();
					break;
				case 6:
					testConversionMenu.NestedSwitch6();
					break;
				case 7:
					testConversionMenu.NestedSwitch7();
					break;
				case 8: 
					testConversion.Rebalance();
					break;
				case 9: 
					char exit='y';
					do{
					System.out.println("Would you like to exit to the main menu, yes?");
					exit=console.next().trim().charAt(0);
					}while(exit!='y');
					break;
			default:
				System.out.println("selection not found.");
			}
			
		}while(choice!=9);
		}
		catch(conException e)
		{
			System.out.println("cannot convert");
		}
	}

				
	//the nested switches account for the A & B choices. They call methods in Conversion, and get called by testConversionMenu  			
				
	private void NestedSwitch5()
	{
			Conversion test1Conversion=new Conversion();
			char innerSwitch;
			innerSwitch=console.next().trim().charAt(0);
			switch(innerSwitch)
			{
						case 'a':
							test1Conversion.LbstoKg();
							break;
								
						case 'b':
							test1Conversion.KgtoLbs();
							break;
			}
	}
	private void NestedSwitch6()
	{
		try
		{
			Conversion test2Conversion=new Conversion();
			char innerSwitch2;
			innerSwitch2=console.next().trim().charAt(0);
				
				switch(innerSwitch2)
				{
					case 'a':
						test2Conversion.mphtoKmph();
						break;
					case 'b':
						test2Conversion.KmphtoMph();
						break;
				}
		}
		catch(conException e)
		{
			System.out.println("cannot convert");
		}
	}
	private void NestedSwitch7()
	{
		try
		{
			Conversion test3Conversion=new Conversion();
			char innerSwitch3;
			innerSwitch3=console.next().trim().charAt(0);
			switch(innerSwitch3)
			{
				case 'a':
					test3Conversion.NewtonMetersToLbFT();
					break;
				case 'b':
					break;
			}
		}
		catch(conException e)
		{
			System.out.println("cannot convert negative value");
		}
	}

}
	
