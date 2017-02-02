import java.util.Scanner;

public class Finance {
	static Scanner console=new Scanner(System.in);
	
	
	public void OperatingCashFlow()
	{
		/*
		 * this first method calculates operating cash flow 
		 * it uses a decomposition method to have all parameters individually calculated
		 */
		double operatingCF;
		double NetCapitalSpending;
		double changeInWorkingCapital;
		System.out.println("Please enter the net capital spending: ");
		NetCapitalSpending=console.nextDouble();
		System.out.println("Please enter the change in working capital: ");
		changeInWorkingCapital=console.nextDouble();
		operatingCF=cashFlowFromAssets()+NetCapitalSpending+changeInWorkingCapital;
		System.out.println("The operating cash flow is" + operatingCF);
	}
	public double cashFlowFromAssets()
	{
		double CFAssets;
		CFAssets=CFtoCreditor() + CFtoShareholders();
		System.out.println();
		System.out.println("the cash flow to assets is " + CFAssets);
		return CFAssets;
	}
	public double CFtoCreditor()
	{
		double interestExpense;
		double endingDebt;
		double beginningDebt;
		double cashFlowToCreditor;
		
		System.out.println("Please enter the ending debt: ");
		endingDebt=console.nextDouble();
		System.out.println("Please enter the beginning debt: ");
		beginningDebt=console.nextDouble();
		System.out.println("Please enter the interest expense: ");
		interestExpense=console.nextDouble();
		
		cashFlowToCreditor=interestExpense-(endingDebt-beginningDebt);
		System.out.println("the cash flow to creditors is " + cashFlowToCreditor);
		return cashFlowToCreditor;
		
	}
	public double CFtoShareholders()
	{
		double endingStock;
		double beginningStock;
		double endingSurplus;
		double beginningSurplus;
		double dividends;
		double cashFlowtoShareholders;
		double surplusValue;
		double stockValue;
		
		System.out.println("Please enter the ending common stock amount: ");
		endingStock=console.nextDouble();
		System.out.println("Please enter the beginning common stock value: ");
		beginningStock=console.nextDouble();
		System.out.println("Please enter the ending surplus value: ");
		endingSurplus=console.nextDouble();
		System.out.println("Please enter the beginning surplus value: ");
		beginningSurplus=console.nextDouble();
		System.out.println("Please enter the dividends paid out: ");
		dividends=console.nextDouble();
		
		surplusValue=(endingSurplus-beginningSurplus);
		
		stockValue=dividends-(endingStock-beginningStock);
		
		cashFlowtoShareholders=stockValue-surplusValue;
		System.out.println("the cash flow to shareholders is " + cashFlowtoShareholders);
		return cashFlowtoShareholders;
		
		
		
		
	}
	

}
