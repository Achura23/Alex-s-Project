import java.util.*;
public class FinanceMenu {
	
	static Scanner console=new Scanner(System.in);
	
	
	Finance testFinance=new Finance();
	Conversion testConversion=new Conversion();
	
	public void FinancialMenu()
	{
		int choice;
	
		do
		{
				testConversion.Box();
				
				System.out.println("Financial Menu");
				
				System.out.println("0. Operating Cash Flow");
				System.out.println("1. Cash Flow From Assets");
				System.out.println("2. Cash Flow to Creditors");
				System.out.println("3. Cash flow to Shareholders");
				System.out.println("4. Exit");
				
				testConversion.Box();
				System.out.println("Please enter your chocie here: ");
				choice=console.nextInt();
				
				switch(choice)
				{
				
				case 0: 
					testFinance.OperatingCashFlow();
					break;
				case 1:
					testFinance.cashFlowFromAssets();
					break;
				case 2: 
					testFinance.CFtoCreditor(); 
					break;
				case 3:
					testFinance.CFtoShareholders();
					break;
				case 4:
					char exit='y';
					do{
					System.out.println("Would you like to exit to the main menu, yes?");
					exit=console.next().trim().charAt(0);
					}while(exit!='y');
					break;
					
				default:
					System.out.println("selection not found.");
				}
				
		}while(choice!=4);
				
	

	}
}
