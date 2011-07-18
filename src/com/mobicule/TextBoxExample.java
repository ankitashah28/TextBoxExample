package com.mobicule;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Spacer;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public class TextBoxExample extends MIDlet
{
	private TextBox txtBox1;

	private TextBox txtBox2;
	
	public TextBoxExample()
	{
		txtBox1 = new TextBox("Your Name?", "", 50, TextField.ANY);

		txtBox2 = new TextBox("Your PIN?", "", 4, TextField.NUMERIC | TextField.PASSWORD);
	}

	protected void destroyApp(boolean arg0) throws MIDletStateChangeException
	{
		// TODO Auto-generated method stub

	}

	protected void pauseApp()
	{
		// TODO Auto-generated method stub

	}

	protected void startApp() throws MIDletStateChangeException
	{
		Display display = Display.getDisplay(this);
		display.setCurrent(txtBox1);
		
		try
		{
			Thread.currentThread();
			Thread.sleep(5000);
		}
		catch (Exception e)
		{
		}

		txtBox1.setString("Bertice Boman");

		try
		{
			Thread.currentThread();
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
		}

		// inserts 'w' at the 10th index to make the
		// name Bertice Bowman
		txtBox1.insert("w", 10);

		try
		{
			Thread.currentThread();
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
		}
		display.setCurrent(txtBox2);
	}
}
