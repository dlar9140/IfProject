package controller;

//Import Section
import models.HouseModels;

import javax.swing.JOptionPane; //import for pop up windows

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
			System.out.println("Let's build a house for you! What color is it?");
			
		}
		{
			askUser();
		}
		
		private void loopy()
		{
			//Define variable before loop
			boolean isDone = false;
			int count = 0;
			
			while (!isDone)//Test the variable
			{
				JOptionPane.showMessageDialog(null, "brother may I have some loops?" );
				//Eventually change the loop variable
				count++;
			
				
			}
			
			for (int loop = 0; loop < 30; loop += 2)
			{
				JOptionPane.showMessageDialog(null,  "The loop value is: " + loop);
			}
		}
		
		private void askUser()
		{
			String response = JOptionPane.showInputDialog(null, "What is the distance?");
			Run userRun = new Run();
			
			while (!validDouble(response))
			{
				response = JOptionPane.showInputDialog(null, "No! Type in a valid number for the distance.");
			}
			userRun.setDistance(Double.parseDouble(response));
			
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

	
		
	

