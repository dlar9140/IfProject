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
			loopy();
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
				if (count >= 10)
				{
					isDone = true;	//update variable
				}
				
			}
		}

		{
			myLoop();
		}

	private void myLoop()
	{
		boolean isFinished = false;
		int count = 0;
				
		while (isFinished)
		{
			JOptionPane.showMessageDialog(null, "Hello, I am the second looper." );
			count++;
			if (count >= 5)
			{
				isFinished = true;
			}
		}
	}
	
	}

	
		
	

