//name: Chahana Reddy and Saleena Saini
//date: 2023-05-19
//teacher: Ms. Basaraba
//Assignment: Slots machine game


import java.awt.*;  //gives access to java command libraries
import hsa.Console; //gives access to Console class file
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class SlotMachine  //creates new class called StringClass
{
    Console c;           // The output console

    static double initialBal = 100;
    int symbol1;
    int symbol2;
    int symbol3;
    static double winnings;
    double bet;
    static double newBalance2;


    public void splashScreen ()  //title method
    {
	c.setColor (Color.black);
	c.fillRect (0, 0, 656, 532);

	//screen border
	c.setColor (Color.red);
	for (int x = 0 ; x < 8 ; x++)  //loop for a thick border
	{
	    c.drawRect (25 + x, 20 + x, 590, 460);
	}

	//Screen title
	c.setCursor (-200, -200);

	Color yellowGold = new Color (219, 191, 64);
	c.setColor (yellowGold);
	c.setFont (new Font ("SansSerif", Font.ITALIC, 50));
	c.drawString ("The Slots Machine", 120, 85);


	//$$ signs
	Color brownYellow = new Color (120, 95, 42);
	c.setColor (brownYellow);
	c.drawString ("$", 60, 85);
	c.drawString ("$", 550, 85);

	//slots white part
	c.setColor (Color.white);
	c.fillRoundRect (130, 160, 125, 235, 25, 25);
	c.fillRoundRect (275, 160, 125, 235, 25, 25);
	c.fillRoundRect (420, 160, 125, 235, 25, 25);

	//slots divider
	c.setColor (Color.black);
	c.drawLine (100, 200, 265, 200);
	c.drawLine (100, 350, 265, 350);

	c.drawLine (245, 200, 400, 200);
	c.drawLine (245, 350, 400, 350);

	c.drawLine (300, 200, 550, 200);
	c.drawLine (300, 350, 550, 350);


	//Slots numbers
	c.setFont (new Font ("SansSerif", Font.BOLD, 100));
	c.setColor (Color.blue);
	c.drawString ("7", 170, 315);
	c.drawString ("7", 315, 315);
	c.drawString ("7", 460, 315);

	//next screen key
	c.setColor (Color.white);
	c.drawRect (425, 435, 187, 40);
	c.setFont (new Font ("SansSerif", Font.BOLD, 15));
	c.drawString ("Press any key to continue", 430, 462);

	char next = c.getChar ();

	if (next == 'i' || next == 'I')
	{
	    mainMenu ();
	}
	else
	{
	    mainMenu ();
	}

    }





    public void mainMenu ()
    {

	//background
	c.setColor (Color.black);
	c.fillRect (0, 0, 656, 532);

	//screen border
	c.setColor (Color.red);
	for (int x = 0 ; x < 8 ; x++)  //loop for a thick border
	{
	    c.drawRect (25 + x, 20 + x, 590, 460);
	}

	//"main menu" title
	Color yellowGold = new Color (219, 191, 64);
	c.setColor (yellowGold);
	c.setFont (new Font ("SansSerif", Font.BOLD | Font.ITALIC, 50));
	c.drawString ("Main Menu", 200, 85);


	//$$ signs
	Color brownYellow = new Color (120, 95, 42);
	c.setColor (brownYellow);
	c.drawString ("$", 60, 85);
	c.drawString ("$", 550, 85);
	c.setColor (Color.blue);
	c.drawRect (175, 100, 300, 100);
	c.drawRect (175, 325, 300, 125);
	c.drawRect (175, 225, 300, 75); //restart border

	//keys to continue
	c.setColor (Color.white);
	c.setFont (new Font ("SansSerif", Font.BOLD, 35));
	c.drawString ("Press 'E' to exit", 197, 160);

	c.setFont (new Font ("SansSerif", Font.BOLD, 30));
	c.drawString ("Press any other key", 185, 375);
	c.drawString ("for instructions", 215, 420);

	c.setFont (new Font ("SansSerif", Font.BOLD, 24));
	c.drawString ("Press 'R' to reset balance", 182, 275);

	char next = c.getChar ();
	if (next == 'e' || next == 'E')
	{
	    goodbye ();
	}

	else if (next == 'r' || next == 'R')
	{
	    initialBal = 100;
	    c.setColor (Color.white);

	}

	else
	{
	    instructions ();
	}
    }


    public void instructions ()
    {
	c.setColor (Color.black);
	c.fillRect (0, 0, 656, 532);

	//screen border
	c.setColor (Color.red);
	for (int x = 0 ; x < 8 ; x++)  //loop for a thick border
	{
	    c.drawRect (25 + x, 20 + x, 590, 460);
	}

	Color yellowGold = new Color (219, 191, 64);
	c.setColor (yellowGold);
	c.setFont (new Font ("SansSerif", Font.ITALIC, 50));
	c.drawString ("Instructions", 205, 80);


	Color lightYellow = new Color (237, 236, 192);
	c.setColor (lightYellow);

	c.setFont (new Font ("Arial", Font.BOLD, 18));
	c.drawString ("You initially start with $100, and can place bets of either", 80, 120);
	c.drawString ("$1, $2, $5 each round before you spin the slots machine.", 80, 155);
	c.drawString ("Then, you can spin the slots machine with 3 wheels.", 95, 190);
	c.drawString ("If the three wheels land on 3 identical symbols, ", 125, 225);
	c.drawString ("you will win a value TRIPLE the amount you bet.", 120, 260);
	c.drawString ("If you land on 2 identical symbols, 1.5x the amount you bet.", 75, 295);
	c.drawString ("Your bet value returns back in both cases.", 145, 330);
	c.drawString ("If no similar symbols at all, you will lose all the amount you bet.", 50, 365);
	c.drawString ("If you'd like to exit and restart the game at any other time, ", 75, 400);
	c.drawString ("your balance will be saved.", 200, 435);

	//next screen key
	c.setColor (Color.blue);
	c.drawRect (425, 440, 187, 35);
	c.setColor (Color.white);
	c.setFont (new Font ("SansSerif", Font.BOLD, 15));
	c.drawString ("Press any key to continue", 430, 462);

	char next2 = c.getChar ();
	if (next2 == 'e' || next2 == 'E')
	{
	    instructions ();
	}
	else
	{
	    placeBet ();
	}

    }


    public void placeBet ()
    {
	c.setColor (Color.black);
	c.fillRect (0, 0, 656, 532);

	//screen border
	c.setColor (Color.red);
	for (int x = 0 ; x < 8 ; x++)  //loop for a thick border
	{
	    c.drawRect (25 + x, 20 + x, 590, 460);
	}

	//titles
	Color yellowGold = new Color (219, 191, 64);
	c.setColor (yellowGold);
	c.setFont (new Font ("SansSerif", Font.BOLD, 40));
	c.drawString ("Your Current Balance", 125, 100);

	c.setColor (Color.blue);
	c.drawString ("$" + initialBal, 275, 200);

	c.setColor (yellowGold);
	c.drawString ("Place Bet", 250, 300);

	c.setColor (Color.blue);
	c.drawString ("$", 250, 375);
	c.setCursor (-40, -23);


	boolean mf = false;
	while (!mf)
	{
	    try
	    {

		c.setColor (Color.blue);
		c.setFont (new Font ("SansSerif", Font.BOLD, 40));

		String bet2 = c.readLine ();
		bet = Double.parseDouble (bet2);

		if (bet != 1 && bet != 2 && bet != 5)
		{
		    throw new NumberFormatException ();
		}

		mf = true;

	    }

	    catch (NumberFormatException e)
	    {
		c.setColor (Color.red);
		c.setFont (new Font ("Serif", Font.BOLD, 25));
		c.setColor (Color.red);
		c.drawString ("Error, enter a bet that is either $1, $2 or $5 ", 95, 420);
		c.drawString ("and less than or equal to your current balance", 85, 445);
	    }


	}


	c.drawString ("" + bet, 300, 375);
	c.setColor (Color.black);
	c.fillRect (75, 400, 500, 50);

	//next screen key
	c.setColor (Color.blue);
	c.drawRect (425, 435, 187, 40);
	c.setColor (Color.white);
	c.setFont (new Font ("SansSerif", Font.BOLD, 15));
	c.drawString ("Press any key to continue", 430, 462);



	char next2 = c.getChar ();
	if (next2 == 'o' || next2 == 'O')
	{
	    slotMachine1 ();
	}


	else
	{
	    slotMachine1 ();
	}

    }


    public void slotMachine1 ()
    {

	//background
	c.setColor (Color.black);
	c.fillRect (0, 0, 656, 532);

	//slots white part
	c.setColor (Color.white);
	c.fillRect (100, 0, 150, 600);
	c.fillRect (275, 0, 150, 600);
	c.fillRect (450, 0, 150, 600);


	c.setColor (Color.blue);
	for (int x = 0 ; x < 8 ; x++)  //loop for a thick border
	{
	    c.drawRect (100 + x, 0, 150, 600);
	    c.drawRect (275 + x, 0, 150, 600);
	    c.drawRect (450 + x, 0, 150, 600);

	}


	c.setFont (new Font ("SansSerif", Font.BOLD, 20));
	c.setColor (Color.blue);
	c.drawString ("Click any ", 5, 75);
	c.drawString ("key", 30, 100);
	c.drawString ("to spin", 12, 125);

	Machine m = new Machine (c);


	char next2 = c.getChar ();
	if (next2 == 's' || next2 == 'S')
	{
	    c.setColor (Color.black);
	    c.fillRect (0, 0, 100, 500);

	    c.setColor (Color.red);
	    c.drawString ("Click any ", 5, 75);
	    c.drawString ("key", 30, 100);
	    c.drawString ("to stop", 12, 125);
	    m.start ();

	}
	else
	{
	    c.setColor (Color.black);
	    c.fillRect (0, 75, 100, 300);
	    c.setColor (Color.red);
	    c.drawString ("Click any ", 5, 75);
	    c.drawString ("key", 30, 100);
	    c.drawString ("to stop", 12, 125);
	    m.start ();

	}

	char next = c.getChar ();
	if (next2 == 's' || next2 == 'S')
	{
	    m.stop ();
	    spinResult ();
	}
	else
	{
	    m.stop ();
	    spinResult ();

	}
    }


    public void spinResult ()
    {
	symbol1 = (int) (Math.random () * 4);
	symbol2 = (int) (Math.random () * 4);
	symbol3 = (int) (Math.random () * 4);


	//background
	c.setColor (Color.black);
	c.fillRect (0, 0, 656, 532);

	//slots white part
	c.setColor (Color.white);
	c.fillRect (100, 0, 150, 600);
	c.fillRect (275, 0, 150, 600);
	c.fillRect (450, 0, 150, 600);

	// 0 = 7
	// 1 = star
	// 2 = ?
	// 3 = J

	//first slot
	if (symbol1 == 0)
	{
	    c.setColor (Color.blue);
	    c.drawString ("7", 140, 275);
	}

	else if (symbol1 == 1)
	{
	    c.setColor (Color.yellow);
	    c.fillStar (130, 175, 100, 100);
	}

	else if (symbol1 == 2)
	{
	    c.setColor (Color.red);
	    c.drawString ("?", 140, 275);
	}

	else if (symbol1 == 3)
	{
	    c.setColor (Color.green);
	    c.drawString ("J", 140, 275);
	}


	//second slot
	if (symbol2 == 0)
	{
	    c.setColor (Color.blue);
	    c.drawString ("7", 325, 275);
	}

	else if (symbol2 == 1)
	{
	    c.setColor (Color.yellow);
	    c.fillStar (300, 175, 100, 100);
	}

	else if (symbol2 == 2)
	{
	    c.setColor (Color.red);
	    c.drawString ("?", 325, 275);
	}

	else if (symbol2 == 3)
	{
	    c.setColor (Color.green);
	    c.drawString ("J", 325, 275);
	}

	//third slot
	if (symbol3 == 0)
	{
	    c.setColor (Color.blue);
	    c.drawString ("7", 500, 275);
	}

	else if (symbol3 == 1)
	{
	    c.setColor (Color.yellow);
	    c.fillStar (475, 175, 100, 100);
	}

	else if (symbol3 == 2)
	{
	    c.setColor (Color.red);
	    c.drawString ("?", 500, 275);
	}

	else if (symbol3 == 3)
	{
	    c.setColor (Color.green);
	    c.drawString ("J", 500, 275);
	}

	c.setColor (Color.red);
	for (int x = 0 ; x < 8 ; x++)  //loop for a thick border
	{
	    c.drawRect (100 + x, 0, 150, 600);
	    c.drawRect (275 + x, 0, 150, 600);
	    c.drawRect (450 + x, 0, 150, 600);

	}

	//next screen key
	c.setColor (Color.blue);
	c.fillRect (445, 455, 187, 40);
	c.setColor (Color.white);
	c.setFont (new Font ("SansSerif", Font.BOLD, 15));
	c.drawString ("Press any key to continue", 450, 480);

	char next2 = c.getChar ();
	if (next2 == 's' || next2 == 'S')
	{
	    finalBalance ();
	}
	else
	{
	    finalBalance ();

	}
	c.setColor (Color.blue);


    }




    public static double prize (double bet, int symbol1, int symbol2, int symbol3)
    {

	//jackpot
	if (symbol1 == 0 && symbol2 == 0 && symbol3 == 0 || symbol1 == 1 && symbol2 == 1 && symbol3 == 1 || symbol1 == 2 && symbol2 == 2 && symbol3 == 2 || symbol1 == 3 && symbol2 == 3 && symbol3 == 3)
	{
	    winnings = bet * 3;
	}


	//0 combos
	else if (symbol1 == 0 && symbol2 == 0 && symbol3 == 1 || symbol1 == 0 && symbol2 == 1 && symbol3 == 0 || symbol1 == 1 && symbol2 == 0 && symbol3 == 0)
	{
	    winnings = bet * 1.5;
	}


	else if (symbol1 == 0 && symbol2 == 0 && symbol3 == 2 || symbol1 == 0 && symbol2 == 2 && symbol3 == 0 || symbol1 == 2 && symbol2 == 0 && symbol3 == 0)
	{
	    winnings = bet * 1.5;
	}


	else if (symbol1 == 0 && symbol2 == 0 && symbol3 == 3 || symbol1 == 0 && symbol2 == 3 && symbol3 == 0 || symbol1 == 3 && symbol2 == 0 && symbol3 == 0)
	{
	    winnings = bet * 1.5;
	}




	//1 combos
	else if (symbol1 == 1 && symbol2 == 1 && symbol3 == 0 || symbol1 == 1 && symbol2 == 0 && symbol3 == 1 || symbol1 == 0 && symbol2 == 1 && symbol3 == 1)
	{
	    winnings = bet * 1.5;
	}


	else if (symbol1 == 1 && symbol2 == 1 && symbol3 == 2 || symbol1 == 1 && symbol2 == 2 && symbol3 == 1 || symbol1 == 2 && symbol2 == 1 && symbol3 == 1)
	{
	    winnings = bet * 1.5;
	}


	else if (symbol1 == 1 && symbol2 == 1 && symbol3 == 3 || symbol1 == 1 && symbol2 == 3 && symbol3 == 1 || symbol1 == 3 && symbol2 == 1 && symbol3 == 1)
	{
	    winnings = bet * 1.5;
	}



	//2 combos
	else if (symbol1 == 2 && symbol2 == 2 && symbol3 == 0 || symbol1 == 2 && symbol2 == 0 && symbol3 == 2 || symbol1 == 0 && symbol2 == 2 && symbol3 == 2)
	{
	    winnings = bet * 1.5;
	}


	else if (symbol1 == 2 && symbol2 == 2 && symbol3 == 1 || symbol1 == 2 && symbol2 == 1 && symbol3 == 2 || symbol1 == 1 && symbol2 == 2 && symbol3 == 2)
	{
	    winnings = bet * 1.5;
	}


	else if (symbol1 == 2 && symbol2 == 2 && symbol3 == 3 || symbol1 == 2 && symbol2 == 3 && symbol3 == 2 || symbol1 == 3 && symbol2 == 2 && symbol3 == 2)
	{
	    winnings = bet * 1.5;
	}




	//3 combos
	else if (symbol1 == 3 && symbol2 == 3 && symbol3 == 0 || symbol1 == 3 && symbol2 == 0 && symbol3 == 3 || symbol1 == 0 && symbol2 == 3 && symbol3 == 3)
	{
	    winnings = bet * 1.5;
	}


	else if (symbol1 == 3 && symbol2 == 3 && symbol3 == 1 || symbol1 == 3 && symbol2 == 1 && symbol3 == 3 || symbol1 == 1 && symbol2 == 3 && symbol3 == 3)
	{
	    winnings = bet * 1.5;
	}


	else if (symbol1 == 3 && symbol2 == 3 && symbol3 == 2 || symbol1 == 3 && symbol2 == 2 && symbol3 == 3 || symbol1 == 2 && symbol2 == 3 && symbol3 == 3)
	{
	    winnings = bet * 1.5;
	}


	//combos with no winnings
	else
	{
	    winnings = 0;
	}


	return winnings;
    }


    public static double newBalance (double initialBal, double bet, double winnings)
    {
	if (winnings == 0)
	{
	    newBalance2 = initialBal - bet;

	}
	else
	{
	    newBalance2 = initialBal + winnings;
	}

	return newBalance2;
    }


    public void finalBalance ()  //title method
    {

	winnings = prize (bet, symbol1, symbol2, symbol3);

	newBalance2 = newBalance (initialBal, bet, winnings);

	c.setColor (Color.black);
	c.fillRect (0, 0, 656, 532);

	//screen border
	c.setColor (Color.blue);
	for (int x = 0 ; x < 8 ; x++)
	{
	    c.drawRect (25 + x, 20 + x, 590, 460);
	}

	Color yellowGold = new Color (219, 191, 64);
	c.setColor (yellowGold);
	c.setFont (new Font ("SansSerif", Font.ITALIC, 35));
	c.drawString ("You won:", 60, 100);

	c.setColor (Color.red);
	c.setFont (new Font ("SansSerif", Font.BOLD, 50));
	c.drawString ("" + winnings, 340, 100);

	c.setColor (yellowGold);
	c.setFont (new Font ("SansSerif", Font.ITALIC, 35));
	c.drawString ("Your new balance: ", 60, 200);

	c.setColor (Color.red);
	c.setFont (new Font ("SansSerif", Font.BOLD, 50));
	c.drawString ("" + newBalance2, 425, 200);

	c.setColor (yellowGold);
	c.setFont (new Font ("SansSerif", Font.ITALIC, 35));
	c.drawString ("Total winnings:", 60, 300);
	c.drawString ("Total losses:", 60, 400);

	c.setColor (Color.red);
	c.setFont (new Font ("SansSerif", Font.BOLD, 50));
	c.drawString ("$", 300, 100);
	c.drawString ("$", 380, 200);
	c.drawString ("$", 320, 300);
	c.drawString ("$", 300, 400);

	//next screen key
	c.setColor (Color.blue);
	c.drawRect (425, 435, 187, 40);
	c.setColor (Color.white);
	c.setFont (new Font ("SansSerif", Font.BOLD, 15));
	c.drawString ("Press any key to exit", 450, 460);

	//next screen key
	c.setColor (Color.blue);
	c.drawRect (40, 435, 187, 40);
	c.setColor (Color.white);
	c.setFont (new Font ("SansSerif", Font.BOLD, 15));
	c.drawString ("Press 'p' to play again", 60, 460);

	char next2 = c.getChar ();
	if (next2 == 'p' || next2 == 'P')
	{
	    mainMenu ();
	}


	else
	{
	    createFile ();
	    goodbye ();
	}

    }


    public void createFile ()
    {
	File slotsResults = new File ("slotsresults.txt");
	//making file
	if (slotsResults.exists ())
	{
	    c.println ("Exists"); // append it
	    PrintWriter pw;
	    try
	    {
		FileWriter fWriter = new FileWriter ("slotsresults.txt", true);
		pw = new PrintWriter (fWriter); //attach pw to file
		//Add the following lines to the existing file
		String prize = "Your prize is " + prize (bet, symbol1, symbol2, symbol3);
		String Bal = "Your balance is " + newBalance (initialBal, bet, winnings);

		pw.println ();  //puts amended content on new line
		pw.println ("" + prize); //print to file
		pw.println ("" + Bal); //print to file
		
		pw.close (); //close file
	    }
	    catch (IOException e)
	    {

	    }
	}
	else
	{
	    try
	    {
		slotsResults.createNewFile ();
		c.println ("File was successfully created");

		try
		{
		    FileWriter fWriter = new FileWriter ("slotsresults.txt");

		    String prize = "Your prize is " + prize (bet, symbol1, symbol2, symbol3);
		    String Bal = "Your balance is " + newBalance (initialBal, bet, winnings);
		    fWriter.write (prize);
		    fWriter.write(Bal);
		    fWriter.close ();
		    //c.println ("FileWriter worked!!!");
		}

		catch (IOException e)
		{

		}
	    }

	    catch (IOException e)
	    {

	    }
	}
    }


    public void goodbye ()
    {
	//bg
	c.setColor (Color.black);
	c.fillRect (0, 0, 656, 532);

	//screen border
	c.setColor (Color.red);
	for (int x = 0 ; x < 8 ; x++)  //loop used to thicken the border
	{
	    c.drawRect (25 + x, 20 + x, 590, 460);
	}


	//informs the user that their results have been saved
	c.setColor (Color.white);
	c.setFont (new Font ("SansSerif", Font.BOLD, 28));
	c.drawString ("Thanks for using the Slot Machine.", 95, 90);
	c.drawString ("Your results have been saved and you can", 40, 150);
	c.drawString ("resume the game whenever you'd like.", 70, 210);

	//goodbye message
	Color yellowGold = new Color (219, 191, 64);
	c.setColor (yellowGold);
	c.setFont (new Font ("SansSerif", Font.ITALIC | Font.BOLD, 50));
	c.drawString ("Goodbye,", 220, 300);
	c.drawString ("See you later!,", 160, 375);
	c.fillStar (50, 275, 90, 90);
	c.fillStar (515, 275, 90, 90);

	//name, date, teacher, course
	c.setFont (new Font ("SansSerif", Font.BOLD, 15));
	c.setColor (Color.white);
	c.drawString ("By: Chahana Reddy and Saleena Saini     ICS3U1    Ms.Basaraba     June 12, 2023", 40, 465);

	pauseProgram ();
    }


    public void pauseProgram ()
    {
	try
	{
	    Thread.sleep (4000);
	}


	catch (Exception e)
	{
	}

	System.exit (0);
    }



    public SlotMachine ()  //class
    {
	//656,532
	c = new Console ("The Slot Machine"); //creates a new Console object window
    }



    public static void main (String[] args)
    {

	SlotMachine s; //creates instance variable of SlotMachine
	s = new SlotMachine (); //constructs a new SlotMachine object

	s.splashScreen (); //executes title method
	s.mainMenu ();
	s.instructions ();
	s.placeBet ();
	s.slotMachine1 ();
	s.spinResult ();
	s.createFile ();
	s.goodbye ();
	s.finalBalance ();
	s.pauseProgram (); //executes pauseProgram method

    }
}
