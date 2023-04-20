import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class midtermproject{
	public static void main(String[] args){
		Console con = new Console("Eggcellent Adventure", 1280, 720);
		
		Font fntCousine = con.loadFont("Cousine-Regular.ttf", 20);
		con.setDrawFont(fntCousine);
		
		//Scene 1
		String strChoice1;
		
		// Loads and prints --.jpg, Initializes strChoice2 as the input from the user
		BufferedImage imgScene1 = con.loadImage("Scene1.jpg");
		con.drawImage(imgScene1, 0, 0);
		con.setTextColor(Color.BLACK);
		con.println("Lady Goose laid many eggs, including one golden egg. It gets stolen by a sneaky wizard by the name of...");
		con.sleep(2500);
		con.println("... Harry Pottuh!");
		con.sleep(1500);
		con.println("Do you, as a hungry villager, decide to 'HELP' Lady Goose find her egg or 'COOK' her up for dinner?");
		strChoice1 = con.readLine();
		
		//If the user enters "cook", clears current console, runs scene2, runs scene22
		if(strChoice1.equalsIgnoreCase("Cook")){
			con.clear();
			scene2(con);
			scene2D(con);
		// If user enters "help", clears current console, runs scene3
		}else if(strChoice1.equalsIgnoreCase("Help")){
			con.clear();
			scene3(con);
		}
	}
		//Scene 2
	public static void scene2(Console con){
		char chrLetter;
		
		//Loads and prints --.jpg
		BufferedImage imgScene2 = con.loadImage("Scene2.jpg");
		con.setTextColor(Color.BLACK);
		con.println("You are starving and decide to catch and cook Lady Goose up for dinner...");
		con.sleep(1500);
		con.println("Click 'c' to continue...");
		con.drawImage(imgScene2, 0, 0);
		
		// Grabs the current keyboard input, if input is "c", runs Line 24
		while(true){
			chrLetter = con.currentChar();
			if(chrLetter == 'c'){
				return;
			}
		}
	}
	// Loads and prints --.jpg, clears the last console, waits 5 seconds, and closes the console (game ends)
	public static void scene2D(Console con){
		BufferedImage imgScene22 = con.loadImage("Scene22.jpg");
		con.drawImage(imgScene22, 0, 0);
		con.clear();
		con.sleep(5000);
		con.closeConsole();
	}
		// Scene 3
	public static void scene3(Console con){
		String strChoice2;
		
		// Loads and prints --.jpg, Initializes strChoice2 as the input from the user
		BufferedImage imgScene3= con.loadImage("Scene3.jpg");
		con.drawImage(imgScene3, 0, 0);
		con.println("You decide to dedicate your time to help Lady Goose find her precious golden egg.");
		con.sleep(1500);
		con.println("You walk for a bit and come across some strange boot prints...");
		con.sleep(1500);
		con.println("Do you choose to 'ignore' the footprint or further 'look into' it");
		strChoice2 = con.readLine();
		
		if(strChoice2.equalsIgnoreCase("Ignore")){
			con.clear();
			scene4(con);
		}else if(strChoice2.equalsIgnoreCase("look into")){
			con.clear();
			scene5(con);
		}
	}
	// Scene 4
	public static void scene4(Console con){
		// Loads and prints --.jpg, 
		BufferedImage imgScene4= con.loadImage("Scene4.jpg");
		con.drawImage(imgScene4, 0, 0);
		con.println("Oh no... You chose to ignore the OBVIOUS clue.");
		con.sleep(1500);
		con.println("You continue on your useless \" search\"  and eventually starve to death");
		con.sleep(3000);
		con.closeConsole();
	}
	public static void scene5(Console con){
		BufferedImage imgScene5= con.loadImage("Scene5.jpg");
		con.drawImage(imgScene5, 0, 0);
		con.println("You decide to look into the footprint");
	}
}
