//Names: Chahana Reddy
//Teacher: Ms. Basaraba
//Date: Friday, March 24, 2023
//Description: This program draws the Man Left Side animated object.

import java.awt.*; //This gives access to java command libraries.
import hsa.Console; //This gives access to the Console class file.
public class Machine extends Thread //This creates a new class named "ManLeftSide".
{
    private Console c;  //This creates an instance variable of the Console class so
    //that the output window can be made.

    public void spinning ()  //This creates a new method named "MLSItem".
    {



	for (int y = 0 ; y < 2000 ; y = y + 10)
	{

	    //restarts the loop
	    while (y > 775)
	    {
		y = 0;
	    }

	    //first slot
	    c.setFont (new Font ("SansSerif", Font.BOLD, 110));
	    c.setColor (Color.green);
	    c.drawString ("J", 150, -600 + y);
	    c.setColor (Color.blue);
	    c.drawString ("7", 150, -500 + y);
	    c.setColor (Color.red);
	    c.drawString ("?", 150, -400 + y);
	    c.setColor (Color.yellow);
	    c.fillStar (150, -375 + y, 60, 60);


	    c.setColor (Color.green);
	    c.drawString ("J", 150, -200 + y);
	    c.setColor (Color.blue);
	    c.drawString ("7", 150, -100 + y);
	    c.setColor (Color.red);
	    c.drawString ("?", 150, 0 + y);
	    c.setColor (Color.yellow);
	    c.fillStar (150, 25 + y, 60, 60);


	    c.setColor (Color.green);
	    c.drawString ("J", 150, 200 + y);
	    c.setColor (Color.blue);
	    c.drawString ("7", 150, 300 + y);
	    c.setColor (Color.red);
	    c.drawString ("?", 150, 400 + y);
	    c.setColor (Color.yellow);
	    c.fillStar (150, 425 + y, 60, 60);



	    //second slot
	    c.setColor (Color.red);
	    c.drawString ("?", 325, -600 + y);
	    c.setColor (Color.yellow);
	    c.fillStar (325, -575 + y, 60, 60);
	    c.setColor (Color.green);
	    c.drawString ("J", 325, -400 + y);
	    c.setColor (Color.blue);
	    c.drawString ("7", 325, -300 + y);

	    c.setColor (Color.red);
	    c.drawString ("?", 325, -200 + y);
	    c.setColor (Color.yellow);
	    c.fillStar (325, -175 + y, 60, 60);
	    c.setColor (Color.green);
	    c.drawString ("J", 325, 0 + y);
	    c.setColor (Color.blue);
	    c.drawString ("7", 325, 100 + y);

	    c.setColor (Color.red);
	    c.drawString ("?", 325, 200 + y);
	    c.setColor (Color.yellow);
	    c.fillStar (325, 225 + y, 60, 60);
	    c.setColor (Color.green);
	    c.drawString ("J", 325, 400 + y);
	    c.setColor (Color.blue);
	    c.drawString ("7", 325, 500 + y);




	    //third slot
	    c.setColor (Color.blue);
	    c.drawString ("7", 500, -600 + y);
	    c.setColor (Color.red);
	    c.drawString ("?", 500, -500 + y);
	    c.setColor (Color.yellow);
	    c.fillStar (500, -475 + y, 60, 60);
	    c.setColor (Color.green);
	    c.drawString ("J", 500, -300 + y);

	    c.setColor (Color.blue);
	    c.drawString ("7", 500, -200 + y);
	    c.setColor (Color.red);
	    c.drawString ("?", 500, -100 + y);
	    c.setColor (Color.yellow);
	    c.fillStar (500, -75 + y, 60, 60);
	    c.setColor (Color.green);
	    c.drawString ("J", 500, 100 + y);

	    c.setColor (Color.blue);
	    c.drawString ("7", 500, 200 + y);
	    c.setColor (Color.red);
	    c.drawString ("?", 500, 300 + y);
	    c.setColor (Color.yellow);
	    c.fillStar (500, 325 + y, 60, 60);
	    c.setColor (Color.green);
	    c.drawString ("J", 500, 500 + y);


	    try    //used to delay the animation
	    {
		Thread.sleep (8);
	    }
	    catch (Exception e)
	    {
	    }
	    

	    c.setColor (Color.white); //cover trace

	    //first slots
	    c.setFont (new Font ("SansSerif", Font.BOLD, 110));
	    c.drawString ("J", 150, -600 + y);
	    c.drawString ("7", 150, -500 + y);
	    c.drawString ("?", 150, -400 + y);
	    c.fillStar (150, -375 + y, 60, 60);


	    c.drawString ("J", 150, -200 + y);
	    c.drawString ("7", 150, -100 + y);
	    c.drawString ("?", 150, 0 + y);
	    c.fillStar (150, 25 + y, 60, 60);

	    
	    c.drawString ("J", 150, 200 + y);
	    c.drawString ("7", 150, 300 + y);
	    c.drawString ("?", 150, 400 + y);
	    c.fillStar (150, 425 + y, 60, 60);


	    //second slot
	    c.drawString ("?", 325, -600 + y);
	    c.fillStar (325, -575 + y, 60, 60);
	    c.drawString ("J", 325, -400 + y);
	    c.drawString ("7", 325, -300 + y);

	    c.drawString ("?", 325, -200 + y);
	    c.fillStar (325, -175 + y, 60, 60);
	    c.drawString ("J", 325, 0 + y);
	    c.drawString ("7", 325, 100 + y);

	    c.drawString ("?", 325, 200 + y);
	    c.fillStar (325, 225 + y, 60, 60);
	    c.drawString ("J", 325, 400 + y);
	    c.drawString ("7", 325, 500 + y);


	    //third slots
	    c.drawString ("7", 500, -600 + y);
	    c.drawString ("?", 500, -500 + y);
	    c.fillStar (500, -475 + y, 60, 60);
	    c.drawString ("J", 500, -300 + y);

	    c.drawString ("7", 500, -200 + y);
	    c.drawString ("?", 500, -100 + y);
	    c.fillStar (500, -75 + y, 60, 60);
	    c.drawString ("J", 500, 100 + y);

	    c.drawString ("7", 500, 200 + y);
	    c.drawString ("?", 500, 300 + y);
	    c.fillStar (500, 325 + y, 60, 60);
	    c.drawString ("J", 500, 500 + y);
	}
    }



    public Machine (Console con)  //This is the "ManLeftSide" class constructor.
    {
	c = con; //This creates a new Console object window.
    }


    public void run ()
    {
	spinning (); //This executes the MLSItem method.
    }
}
