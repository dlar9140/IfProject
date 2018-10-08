package controller;

//Import Section
import models.HouseModels;
import java.util.Scanner;
import javax.swing.JOptionPane; //import for pop up windows
import java.util.Arraylist;

public class IfProjectController
{
	/**
	 * Builds the instance of the Controller
	 */
	public IfProjectController()
	{

	}
	
	/**
	 * This is where the program starts calling methods to run the program.
	 */


		public void start()
		{
			JOptionPane.showInputDialog(null, "Let's build a house for you! What is it's name?");
			Scanner inputScanner = new Scanner(System.in);
			String name = inputScanner.nextLine();
			JOptionPane.showMessageDialog(null, "Your house is named" + name); 
			
			JOptionPane.showInputDialog(null, "What material is" + name + "made out of?"); 
			String material = inputScanner.nextLine();
			JOptionPane.showMessageDialog(null, name + "is made out of" + material); 
			
			JOptionPane.showInputDialog(null, "How many units of" + material + "are a part of your house?");
			String amountMaterial = inputScanner.nextLine();
			JOptionPane.showMessageDialog(null, "Your house has" + amountMaterial + "in it");
			
			JOptionPane.showInputDialog(null, "How many rooms does" + name + "have?");
			String amountRooms = inputScanner.nextLine();
			JOptionPane.showMessageDialog(null, "Your house has" + amountRooms + "rooms.");
			
			String hasWindows =	JOptionPane.showInputDialog(null, "Does your house have any windows?");
			if(hasWindows.equals("yes") {
				JOptionPane.showInputDialog(null, "How many windows does your house have?");
				String hasWindows = inputScanner.nextLine();
				JOptionPane.showMessageDialog(null, "Your house has" + hasWindows + "windows.");
			}else(hasWindows.equals("no")) {
				JOptionPane.showMessageDialog(null, "Your house doesn't have any windows.");
			}
		}		
		{
			askUser();
		}
		
		private void loopy()
		{
			//Define variable before loop
			
			int count = 0;
			
			while (count < 15)//Test the variable
			{
				JOptionPane.showMessageDialog(null, "brother may I have some loops?" );
				//Eventually change the loop variable
				count++;
			
				
			}
			
			for (int loop = 0; loop < 30; loop += 2)
			{
				askUser();
				JOptionPane.showMessageDialog(null,  "The loop value is: " + loop + "'Run object I made");
			}
		}
		
		private void lotsofRun()
		{
			
		}
		{
			//Local variable are only visible in the method they are defined in!
			//They only have SCOPE to that method
			
			ArrayList<Run> myRuns = new ArrayList<Run>();
			
			Run sampleRun = new Run();
			Run otherRun = newRun();
			
			myRuns.add(sampleRun);
			myRuns.add(sampleRun);
			myRuns.add(otherRun);
			
			//Standard forward loop
			for (int index = myRuns.size() / 2; index < myRuns.size(); index += 1)
			{
				
			}
			
			//Standard backward loop
			for (int index = myRuns.size() - 1; index >= 0; index -=1)
			{
				
			}
			
			for (Run current : myRuns)
			{
				JOptionPane.showMessageDialog(null, "The run is named: " + current.getName());
			}
			
		}
		
		private void askUser()
		{
			IfProjectRunner userRun = new IfProjectRunner();
			
			//ask
			String response = JOptionPane.showInputDialog(null, "What is the price?");
			
			//repeat until finished correctly. while loop.
			while (!validDouble(response))
			{
				response = JOptionPane.showInputDialog(null, "No! Type in a valid number for the price.");
			}
			//assign and convert
			userRun.setPrice(Double.parseDouble(response)); 
			
			response = JOptionPane.showInputDialog(null, "what is the name of the run?");
			if (response.equalsIgnoreCase("CTEC"))
			{
				JOptionPane.showInputDialog(null, "Did you really press cancel, the x, or type nothing? :(");
			}
			
			
			JOptionPane.showMessageDialog(null, userRun);
			
		}

		public boolean validDouble(String maybeDouble)
{
	boolean isValid = false;
	
	try
	{
		Double.parseDouble(maybeDouble);
		isValid = true;
	}
	catch(NumberFormatException error)
	{
		JOptionPane.showMessageDialog(null,  "This requires a double value aka something with a . >)");
	}
	return isValid;
	}
}

	
		
	

