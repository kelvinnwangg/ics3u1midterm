import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class midtermproject{
	public static void main(String[] args){
		Console con = new Console("The Hunt for the Golden Egg", 1280, 720);
		
		//Scene 1
		String strChoice1;
		
		BufferedImage imgScene1 = con.loadImage("Scene1.jpg");
		con.setTextColor(Color.BLACK);
		con.println("Lady Goose laid many eggs, including one golden egg. It gets stolen by a 'smart' wizard...");
		con.println("Do you, as a hungry villager, decide to 'HELP' Lady Goose find her egg or 'COOK' her up for dinner?");
		con.drawImage(imgScene1, 0, 0);
		strChoice1 = con.readLine();
		
		//If the user enters "cook", clears current console, runs scene2, runs scene22
		if(strChoice1.equalsIgnoreCase("Cook")){
			con.clear();
			scene2(con);
			scene2D(con);
		}else if(strChoice1.equalsIgnoreCase("Help")){
			con.clear();
			scene3(con);
		}
	}
		//Scene 2
	public static void scene2(Console con){
		char chrLetter;
		
		BufferedImage imgScene2 = con.loadImage("Scene2.jpg");
		con.setTextColor(Color.BLACK);
		con.println("You are starving and decide to catch and cook Lady Goose up for dinner...");
		con.println("Click 'c' to continue...");
		con.drawImage(imgScene2, 0, 0);
		
		while(true){
			chrLetter = con.currentChar();
			
			if(chrLetter == 'c'){
				return;
			}
		}
	}
	public static void scene2D(Console con){
		BufferedImage imgScene22 = con.loadImage("Scene22.jpg");
		con.drawImage(imgScene22, 0, 0);
		con.println("");
		con.clear();
		con.sleep(5000);
		con.closeConsole();
	}
	public static void scene3(Console con){
		String strChoice2;
		
		BufferedImage imgScene3= con.loadImage("Scene3.jpg");
		con.drawImage(imgScene3, 0, 0);
		con.println("You decide to dedicate your time to help Lady Goose find her precious golden egg.");
		con.println("You walk for a bit and come across some strange boot prints...");
		con.println("Do you choose to 'ignore' the footprint or further 'look into' it");
		strChoice2 = con.readLine();
		
		if(strChoice2.equalsIgnoreCase("Ignore")){
			
		}else if(strChoice2.equalsIgnoreCase("look into")){
			
		}
	}
}
