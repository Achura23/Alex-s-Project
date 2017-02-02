import java.util.*;
class Conversion 
{
	static Scanner console=new Scanner(System.in);
	
	public void cubicIn()
	{
		long ci; 
		long im;
		
			im=5280* 12;
			ci=im*im*im;
		
				System.out.println("There are " + ci + " cubic inches in 1 mile.");
				System.out.println();
	}
	public void MilestoInches()
	{
		double inches;
		int feet=5280;
		double miles;
		char answer='y';
	
		do
		{
			inches= feet*12;
			System.out.println("the amount of inches in 1 mile is " + inches);
			System.out.println();
		
			System.out.println("please enter the amount of miles you would like to convert.");
				miles=console.nextDouble();
					inches=(miles*feet)*12;
						System.out.println("the amount of inches in your specified miles are " + inches);
						System.out.println();
							
							System.out.println("Would you like to enter another value to convert? If yes then enter 'yes'. If not then please enter 'no' ");
							answer=console.next().trim().charAt(0);
							
							
						
						
		}while(answer=='y');
	}
		
		
	
	public void GaltoLit()
	{
		double gallons, liters;
		
		int counter=0;
		
		for(gallons=1; gallons <= 10; gallons++)
		{
			liters=gallons*3.7854;
			System.out.println(gallons + " gallons is " + liters +" liters");
			
			counter ++;
			
			if(counter==10)
			{
				System.out.println();
				
				counter=0;
			}
			
		}
	}
	public void InputGaltoLit() throws conException
	{
		double gallons, liters;
			System.out.println("Please enter the amount of gallons you would like to convert to liters:");
			gallons=console.nextDouble();
		if(gallons>=0)
		{
			liters=gallons*3.7854;
			System.out.println(gallons + " gallons is " + liters + " liters");
			System.out.println();
		}
		else
		{
			throw new conException("cannot convert negative value");
		}
			
	}
	public void lightening() throws conException
	{
		double interval; 
		double distance;
		
			System.out.println("enter the time interval between the lightening and thunder.");
			interval=console.nextDouble();
		
			distance=interval*1087;
		
			System.out.println("the distance you are from the lightening in feet is " + distance);
	}
	public void LbstoKg()
	{
		int lbs;
		double kg;
		//int conversionFactor;
		//char no='n';
		char answer='y';
			
		do
		{
				
			//System.out.println("There is .4536 kg in 1 lb.");
			//System.out.println();
				
			System.out.println("please enter the amount of lbs you would like to convert to kg.");
			lbs=console.nextInt();
				
			if(lbs>0)
			{
				kg=lbs*.4526;
				System.out.println("The kg equivalent is " + kg);
				System.out.println();
					
			}
			else
			{
				System.out.println("do not enter a negative value.");
			}
				
				System.out.println("Would you like to enter another value? If so, enter 'yes'. If not, enter 'no'.");
				answer=console.next().trim().charAt(0);
		}while(answer=='y');
	}
	public void KgtoLbs()
	{
			double kg2;
			double lbs2;
			char answer2='y';
			
			do
			{
				System.out.println();
				System.out.println("Please enter the kg's that you would like to convert.");
				kg2=console.nextDouble();
				
				if(kg2>0)
				{
					lbs2=kg2*2.2046;
					System.out.println("The amount of lbs is " + lbs2);
				}
				else
				{
					System.out.println("cannot enter negative value.");
				}
				
					System.out.println("would you like to enter another value? If yes then type 'yes', and 'no' if not.");
					answer2=console.next().trim().charAt(0);
			}while(answer2=='y');
				
				
		
	}
	public void mphtoKmph() throws conException
	{
		double kmph;
		double mph;
		char answer3='y';
		
		do
		{
			System.out.println();
			System.out.println("enter the speed in mph that you would like to convert: ");
			mph=console.nextDouble();
			
			if(mph>0)
			{
				kmph=mph*1.60934;
				System.out.println("\t\t your speed in mph equates to " + kmph + "kmph.");
				System.out.println();
			}
			else
			{
				throw new conException("cannot print negative value");
			}
			
				System.out.println("would you like to enter another value? Yes or no?...Kobe");
				System.out.println();
				answer3=console.next().trim().charAt(0);
				System.out.println();
		}while(answer3=='y');
	}
	public void KmphtoMph() throws conException
	{
		double mph2;
		double kmph2;
		char answer4='y';
		
		do
		{
			System.out.println();
			System.out.println("Please enter the speed in km you would like to convert. ");
			kmph2=console.nextDouble();
			
			if(kmph2>0)
			{
				mph2=.621371*kmph2;
				System.out.println("\t\t the speed in mph is " +mph2);
				System.out.println();
			}
			else
			{
				throw new conException("cannot print negative value.");
			}
			
			System.out.println("Would you like to enter another value? Yes or no?");
			System.out.println();
			answer4=console.next().trim().charAt(0);
			System.out.println();
		}while(answer4=='y');
	}
	public void NewtonMetersToLbFT() throws conException
	{
		double lbft;
		double nm;
		char yes='y';
		
		do
		{
			System.out.println("please enter the torque amount in NM you need to convert.");
			nm=console.nextInt();
			if(nm>=0)
			{
				lbft=nm*.7376;
				System.out.println("the torque in lb/ft is " + lbft);
				System.out.println();
			}
			else
			{
				throw new conException("cannot convert negative value");
			}
			System.out.println("Would you like to enter another value, Yes or No?");
			yes=console.next().trim().charAt(0);
			System.out.println();
		}while(yes=='y');
	}
	public void Rebalance()
	{
		
		double orgPercent;
		double newAllo;
		double newTotal;
		double rebalance;
		char answer5='y';
		do
		{
		
			System.out.println("Enter the new value you wish yo rebalance: ");
			newAllo=console.nextDouble();
			System.out.println("Now enter the original allocation percentage you would like to withhold: ");
			orgPercent=console.nextDouble();
			orgPercent=orgPercent/100;
			System.out.println("Now enter the new total of your portfolio: ");
			newTotal=console.nextDouble();
			
			rebalance=((newTotal*orgPercent)-newAllo);
			
			System.out.println("The rebalanced number to be added is: " + rebalance);
			
			System.out.println("Would you like to enter another value, Yes or No?");
			answer5=console.next().trim().charAt(0);
			System.out.println();
		
		}while(answer5=='y');
	}
		
		
		
	public void Box()
	{
		int height=2;
		int width=40;
		for(int h=0; h<height;h++)
		{
			for(int w=0;w<width;w++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
			
			
	}
		
	
}
					
			
			
