// Version 0.01 Eggcellent Adventure
import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class midtermproject{
	public static void main(String[] args){
		Console con = new Console("Eggcellent Adventure", 1280, 720);
		con.setDrawColor(new Color(200, 208, 189));
		con.fillRect(0, 0, 1280, 720);
		
		//Title
		Font fntCucciolo = con.loadFont("Cucciolo.ttf", 80);
		con.setDrawFont(fntCucciolo);
		con.setDrawColor(Color.BLACK);
		con.drawString("Eggcellent Adventure", 230, 100);
		//Start Game
		con.setDrawColor(new Color(108, 150, 118));
		con.fillRoundRect(485, 330, 300, 100, 10, 10);
		
		Font fntCucciolo1 = con.loadFont("Cucciolo.ttf", 50);
		con.setDrawFont(fntCucciolo1);
		con.setDrawColor(Color.BLACK);
		con.drawString("Start Game", 500, 350);
		//Quit Game
		con.setDrawColor(new Color(108, 150, 118));
		con.fillRoundRect(485, 460, 300, 100, 10, 10);
		
		Font fntCucciolo2 = con.loadFont("Cucciolo.ttf", 50);
		con.setDrawFont(fntCucciolo1);
		con.setDrawColor(Color.BLACK);
		con.drawString("Quit Game", 520, 480);
		
		con.repaint();
		//Buttons
		int mousex = 0;
		int mousey = 0;
		int mouseC = 0;
		int value;
		
		while (mouseC != 1){
		mousex = con.currentMouseX();
		mousey = con.currentMouseY();
		mouseC = con.currentMouseButton();
			
		}
			if(mousex >=485 && mousex <=785 && mousey >=333 && mousey <=433){
			scene1(con);
		}else if(mousex >=485 && mousex <=785 && mousey >=463 && mousey <=563){
			con.sleep(500);
			con.closeConsole();
		}

	}
	// Scene1
	public static void scene1(Console con){
		String strChoice1;

		BufferedImage imgScene1 = con.loadImage("Scene1.jpg");
		BufferedImage imggoose = con.loadImage("goose.png");
		BufferedImage imgcharacter = con.loadImage("character.png");
		con.drawImage(imgScene1, 0, 0);
		int intGoose = 1290;
		int intCharacter = -10;
		
		while(intGoose >=450 || intCharacter <=90){
				con.drawImage(imgScene1, 0, 0);
				con.drawImage(imggoose, intGoose, 450);
				con.drawImage(imgcharacter, intCharacter, 500);
				con.repaint();
				con.sleep(2);
				if (intGoose >= 450) {
					intGoose--;
					}
				if (intCharacter <= 90){
				intCharacter++;
			}
			}
				
		con.setDrawColor(new Color(200,208,189));
		con.fillRect(0, 0, 1280, 120);
		con.setTextColor(Color.BLACK);
		con.println("Lady Goose laid many eggs, including one golden egg. It gets stolen by a sneaky wizard by the name of...");
		con.sleep(2500);
		con.println("... Harry Pottuh!");
		con.sleep(1500);
		
			while(true){
				con.println("Do you, as a hungry villager, decide to 'HELP' Lady Goose find her egg or 'COOK' her up for dinner?");
				strChoice1 = con.readLine();
				//If the user enters "cook", clears current console, runs scene2, runs scene22
				if(strChoice1.equalsIgnoreCase("Cook")){
					con.clear();
					scene2(con);
					scene2a(con);
				// If user enters "help", clears current console, runs scene3
				}else if(strChoice1.equalsIgnoreCase("Help")){
					con.clear();
					scene3(con);
				}
			}
		}
		//Scene 2
	public static void scene2(Console con){
		char chrKey1;
		
		//Loads and prints --.jpg
		BufferedImage imgScene2 = con.loadImage("Scene2.jpg");
		con.drawImage(imgScene2, 0, 0);
		con.setDrawColor(new Color(200,208,189));
		con.fillRect(0, 0, 1280, 60);
		con.setTextColor(Color.BLACK);
		con.println("You are starving and decide to catch and cook Lady Goose up for dinner...");
		con.sleep(500);
		con.println("Click 'c' to continue...");
		
		// Grabs the current keyboard input, if input is "c", runs Line 24
		while(true){
			chrKey1 = con.currentChar();
			if(chrKey1 == 'c'){
				return;
			}
		}
	}
	//Scene2a
	public static void scene2a(Console con){
		BufferedImage imgScene2a = con.loadImage("Scene2a.jpg");
		con.drawImage(imgScene2a, 0, 0);
		con.setDrawColor(new Color(200,208,189));
		con.fillRect(0, 0, 1280, 50);
		con.clear();
		con.println("MmMmMmMMMmMmm... tastes goo-");
		con.sleep(2000);
		con.println("BLEH");
		
		int intCount;
		int intCount2;
		for(intCount2 = 0; intCount2 <3; intCount2++){
		for(intCount = 200; intCount >0; intCount = intCount - 8){
			con.drawImage(imgScene2a, 0, 0);
			con.setDrawColor(new Color(200,208,189));
			con.fillRect(0, 0, 1280, 50);
			con.setDrawColor(Color.RED);
			con.drawString("Game Over", 300, intCount+200);
			con.repaint();
			con.sleep(33);
		}
	}
			
		con.sleep(1500);
		con.closeConsole();
	}
		// Scene 3
	private static void scene3(Console con){
		String strChoice2;

		// Loads and prints --.jpg, Initializes strChoice2 as the input from the user
		BufferedImage imgScene3= con.loadImage("Scene3.jpg");
		con.drawImage(imgScene3, 0, 0);
		con.setDrawColor(new Color(200,208,189));
		con.fillRect(0, 0, 1280, 120);
		
		con.println("You decide to dedicate your time to help Lady Goose find her precious golden egg.");
		con.sleep(1500);
		con.println("You walk for a bit and come across some strange boot prints...");
		con.sleep(1500);
		con.println("Do you choose to 'ignore' the footprint or further 'look into' it");
		strChoice2 = con.readLine();
		while(!strChoice2.equalsIgnoreCase("Ignore") || !strChoice2.equalsIgnoreCase("look into")){
				if(strChoice2.equalsIgnoreCase("Ignore")){
					con.clear();
					scene4(con);
				}else if(strChoice2.equalsIgnoreCase("look into")){
					con.clear();
					scene5(con);
				}
			}
	}
	// Scene 4
	public static void scene4(Console con){
		// Loads and prints --.jpg, 
		BufferedImage imgScene4= con.loadImage("Scene4.jpg");
		BufferedImage imgGhost= con.loadImage("ghost.png");
		con.drawImage(imgScene4, 0, 0);
		con.setDrawColor(new Color(200,208,189));
		con.fillRect(0, 0, 1280, 120);
		
		con.println("Oh no... You chose to ignore the OBVIOUS clue.");
		con.sleep(1500);
		con.println("You continue on your useless \" search\"  and eventually starve to death");
		con.sleep(1500);
		con.println("GAME OVER");
		
		con.setDrawColor(new Color(200,208,189));
		con.fillRect(0, 0, 1280, 120);

		int intCount;
		int intCount2;
		for(intCount2 = 0; intCount2 <3; intCount2++){
		for(intCount = 350; intCount >0; intCount = intCount - 2){
			con.drawImage(imgScene4, 0, 0);
			con.setDrawColor(new Color(200,208,189));
			con.fillRect(0, 0, 1280, 120);
			con.drawImage(imgGhost, 560, intCount+200);
			con.repaint();
			con.sleep(33);
		}
	}
		con.sleep(1000);
		con.closeConsole();
	}
	// Scene 5
	public static void scene5(Console con){
		
		int intChoice3;
		
		con.clear();
		BufferedImage imgScene5= con.loadImage("Scene5.jpg");
		con.drawImage(imgScene5, 0, 0);
		con.setDrawColor(new Color(200,208,189));
		con.fillRect(0, 0, 1280, 150);
		
		con.println("You decide to look into the footprint");
		con.sleep(1500);
		con.println("You see that it leads to 2 distinct paths...");
		con.sleep(1500);
		con.println("The LEFT path seems to lead to a swamp");
		con.sleep(1500);
		con.println("While the RIGHT path seems to lead to a strange, old shed... maybe a wizard shed??");
		con.sleep(1500);
		con.println("Which path do you go down? 1 - Left OR 2 - Right (IF YOU DONT ENTER A VALID NUMBER YOU DIE)");
		intChoice3 = con.readInt();
		
		if(intChoice3 == 1){
			con.clear();
			scene6(con);
		}else if(intChoice3 == 2){
			con.clear();
			scene8(con);
		}else{
			con.println("What did i say...");
			con.sleep(1000);
			con.println("AIYAAAAAA~");
			con.sleep(2000);
			con.closeConsole();
		}
	}
	// Scene 6
	public static void scene6(Console con){
		char chrLetter;
		
		BufferedImage imgScene6= con.loadImage("Scene6.jpg");
		con.drawImage(imgScene6, 0, 0);
		con.setDrawColor(new Color(200,208,189));
		con.fillRect(0, 0, 1280, 120);
		
		con.println("You picked the path on the left...");
		con.sleep(1500);
		con.println("Couldnt you see it CLEARLY led to a swamp??...");
		con.sleep(1500);
		con.println("You decide to walk beside the swamp, hopefully finding more clues...");
		con.sleep(500);
		con.println("Click 'c' to continue");
		
		while(true){
			chrLetter = con.currentChar();
		if(chrLetter == 'c'){
			con.clear();
			scene7(con);
		}
	}
	}
	// Scene 7
	public static void scene7(Console con){
		BufferedImage imgScene7= con.loadImage("Scene7.jpg");
		BufferedImage imgCroc= con.loadImage("crocodile.png");
		con.drawImage(imgScene7, 0, 0);
		con.setDrawColor(new Color(200,208,189));
		con.fillRect(0, 0, 1280, 120);
		int intCroc = 1280;
		
		con.println("On your walk beside the swamp, you see something poking out of the water...");
		con.sleep(1500);
		con.println("You decide to go check it out. Maybe its a clue?");
		con.sleep(1500);
		con.println("WRONG");
		con.sleep(1500);
		con.println("The 'thing' was an aligator and it jumps out of the water and eats you");
		
		for(intCroc = 1280; intCroc >=600; intCroc = intCroc -5){
			con.drawImage(imgScene7, 0, 0);
			con.setDrawColor(new Color(200,208,189));
			con.fillRect(0, 0, 1280, 120);
			con.drawImage(imgCroc, intCroc, 400);
			con.repaint();
			con.sleep(33);
		}
		
		con.println("You get chomp chomped");
		con.sleep(1500);
		con.println(" GAME OVER ");
		con.sleep(3000);
		con.closeConsole();
	}
	// Scene8
	public static void scene8(Console con){
		BufferedImage imgScene8= con.loadImage("Scene8.jpg");
		BufferedImage imgCharacter1= con.loadImage("character.png");
		con.drawImage(imgScene8, 0, 0);
		con.setDrawColor(new Color(200,208,189));
		con.fillRect(0, 0, 1280, 150);
		int intCharacter1 = -10;
		
		char chrKey2;
		con.println("You pick the path on the right...");
		con.sleep(1500);
		con.println("It DOES lead to a wizard shed, a seemingly abandoned one");
			for(intCharacter1 = -10; intCharacter1 <=300; intCharacter1 = intCharacter1+5){
				con.drawImage(imgScene8, 0, 0);
				con.setDrawColor(new Color(200,208,189));
				con.fillRect(0, 0, 1280, 120);
				con.drawImage(imgCharacter1, intCharacter1, 400);
				con.repaint();
				con.sleep(33);
			}
		con.setDrawColor(new Color(200,208,189));
		con.fillRect(0, 0, 1280, 170);
		con.sleep(1000);
		con.println("You find Harry Pottuh and DEMAND the egg back, but he won't give in");
		con.sleep(1500);
		con.println("He offers you a deal, testing your knowledge");
		con.sleep(1500);
		con.println("He asks you a few questions and says if you get them right, he'll give the egg back");
		con.println("Click 'c' to continue");
		
		while(true){
			chrKey2 = con.currentChar();
		if(chrKey2 == 'c'){
			con.clear();
			scene8a(con);
		}
	}
}
	// Scene 8a
	public static void scene8a(Console con){
		con.setDrawColor(new Color(200,208,189));
		con.fillRect(0, 0, 1280, 720);
		int intRandom;
		String strWord;
		String strBack;
		int intLength;
		String strLetter;
		int intCount;
		// Choices for Level 1 difficulty questions
		int intChoice5;
		int intChoice6;
		String strChoice7;
		double dblChoice8;
		// Choices for Level 2 difficulty questions
		int intChoice9;
		int intChoice10;
		double dblChoice11;
		double dblChoice12;
		
		intRandom = (int)(Math.random()*2+1);
		if(intRandom == 1){
			con.println("Wow... lucky... you got the eAsY questions");
			con.sleep(1000);
			con.println("What is 2+9?");
			intChoice5 = con.readInt();
				if(intChoice5 == 11){
					con.println("Congrats, next question");
				}else{
					con.clear();
					scene9(con);
				}
			con.println("What is 2*7?");
			intChoice6 = con.readInt();
				if(intChoice6 == 14){
					con.println("Congrats, next question");
				}else{
					con.clear();
					scene9(con);
				}
				
			con.println("What is an example of a palindrome?");
			strChoice7 = con.readLine();
			intLength = strChoice7.length();
			strBack = "";
			for(intCount = intLength; intCount >=1; intCount--){
				strLetter = strChoice7.substring(intCount - 1, intCount);
				strBack = strBack + strLetter;
			}
			if(strChoice7.equals(strBack)){
				con.println("Congrats, next question");
			}else{
				con.clear();
				scene9(con);
			}
			
			con.println("What is 3.5 + 1.8?");
			dblChoice8 = con.readDouble();
				if(dblChoice8 == 5.3){
					con.println("CONGRATS you've passed... the easy version. *side eye*");
					con.clear();
					scene10(con);
				}else{
					con.clear();
					scene9(con);
				}
		}else if(intRandom == 2){
			con.println("Unlucky... You got the hArDeR questions");
			con.sleep(1000);
			con.println("What is 'pi/3' (radians) in degrees?");
			intChoice9 = con.readInt();
				if(intChoice9 == 60){
					con.println("Congrats, next question");
				}else{
					con.clear();
					scene9(con);
				}
			con.println("What is 2(3-1)+12");
			intChoice10 = con.readInt();
				if(intChoice10 == 16){
					con.println("Congrats, next question");
				}else{
					con.clear();
					scene9(con);
				}
			con.println("What are the first 4 digits in 'pi' ?");
			dblChoice11 = con.readDouble();
				if(dblChoice11 == 3.141){
					con.println("Congrats, next question");
				}else{
					con.clear();
					scene9(con);
				}
			con.println("What is 3.999 +6.333?");
			dblChoice12 = con.readDouble();
				if(dblChoice12 == 10.332){
					con.println("CONGRATS you've passed...!");
					con.clear();
					scene10(con);
				}else{
					con.clear();
					scene9(con);
			}
		}
	}
	// Scene 9
	public static void scene9(Console con){
		BufferedImage imgScene9= con.loadImage("Scene9.jpg");
		BufferedImage imgcloud= con.loadImage("cloud.jpg");
		con.drawImage(imgScene9, 0, 0);
		con.setDrawColor(new Color(200,208,189));
		con.fillRect(0, 0, 1280, 140);
		
		con.println(" 'Looks like you got the question wrong...' says Harry");
		con.sleep(1500);
		con.println(" 'I will be on my way now! You will never see this egg again HAHAHAHA' ");
		con.sleep(1500);
		con.println(" *snaps fingers* ");
		con.drawImage(imgcloud, 300, 300);
		con.repaint();
		con.println(" *POOF* you disappear");
		con.println(" GAME OVER ");
		con.sleep(3000);
		con.closeConsole();
	}
	// Scene 10
	public static void scene10(Console con){
		BufferedImage imgScene10= con.loadImage("Scene10.jpg");
		con.drawImage(imgScene10, 0, 0);
		con.setDrawColor(new Color(200,208,189));
		con.fillRect(0, 0, 1280, 120);
		char chrKey3;
		
		con.println("'Awh man...' says Harry");
		con.sleep(1500);
		con.println("I guess you beat my little game...");
		con.sleep(1000);
		con.println("Click 'c' to continue");
		
		while(true){
			chrKey3 = con.currentChar();
		if(chrKey3 == 'c'){
			con.clear();
			scene11(con);
			}
		}
	}
	// Scene 11
	public static void scene11(Console con){
		BufferedImage imgScene11= con.loadImage("Scene11.jpg");
		con.drawImage(imgScene11, 0, 0);
		BufferedImage imgWizard = con.loadImage("wizard.png");
		con.drawImage(imgWizard, 50, 100);
		con.setDrawColor(new Color(200,208,189));
		con.fillRect(0, 0, 1280, 120);
		
		con.println("'You must PAY FOR THIS!!!' you say...");
		con.sleep(1500);
		con.println("Click 'd' to make Harry Pottuh DISSAPEARRRRRRRR!");
		
		char chrKey4;
		String strChoice13;
		
		while(true){
			chrKey4 = con.currentChar();
			if(chrKey4 == 'd'){
				con.drawImage(imgScene11, 0, 0);
				con.setDrawColor(new Color(200,208,189));
				con.fillRect(0, 0, 1280, 120);
				con.repaint();
		}
			con.clear();
			con.println("Finally that annoying man is out of the way. I can FINALLY give this egg back to Lady Goose!");
			con.println("... or should I...");
			con.println("You're starving right now... Do you choose to 'give' the egg back or 'cook' it up?");
			strChoice13 = con.readLine();
			
			if(strChoice13.equalsIgnoreCase("give")){
				con.clear();
				scene13(con);
			}else if(strChoice13.equalsIgnoreCase("cook")){
				con.clear();
				scene12(con);
			}
	}
}
	// Scene 12
	public static void scene12(Console con){
		BufferedImage imgScene12= con.loadImage("Scene12.jpg");
		BufferedImage imgScene12a= con.loadImage("Scene12a.jpg");
		con.drawImage(imgScene12, 0, 0);
		con.setDrawColor(new Color(200,208,189));
		con.fillRect(0, 0, 1280, 120);
		
		con.println("You can't take it anymore...");
		con.sleep(1500);
		con.println("You are TOOOOO hungry so you cook up the golden egg and-");
		con.println(".........................");
		con.sleep(3000);
		con.drawImage(imgScene12a, 0, 0);
		con.println("YOU DIE due to salmonella");
		con.sleep(1500);
		con.println(" GAME OVER ");
		con.sleep(3000);
		con.closeConsole();
		
	}
	// Scene 13
	public static void scene13(Console con){
		BufferedImage imgScene13= con.loadImage("Scene13.jpg");
		BufferedImage imgcharacter2= con.loadImage("character.png");
		BufferedImage imgEgg= con.loadImage("goldenegg.png");
		con.drawImage(imgScene13, 0, 0);
		con.setDrawColor(new Color(200,208,189));
		con.fillRect(0, 0, 1280, 200);
		
		int intEgg = -10;
		int intCharacter = -10;
		while(intEgg <=550 || intCharacter <= 550){
			con.setDrawColor(new Color(200,208,189));
			con.fillRect(0, 0, 1280, 200);
			con.drawImage(imgScene13, 0, 0);
			con.drawImage(imgEgg, intEgg, 500);
			con.drawImage(imgcharacter2, intEgg - 5, 500);
			con.repaint();
			con.sleep(2);
				if (intEgg <=550) {
					intEgg++;
					}
				if (intCharacter <= 550){
				intCharacter++;
					}
		}
		con.setDrawColor(new Color(200,208,189));
		con.fillRect(0, 0, 1280, 200);
		
		con.println("You choose to manage the pain from the hunger and give the egg back to Lady Goose");
		con.sleep(3000);
		con.println("==============================================================");
		con.println("	oh my gaaaawd! Thank you so much honey!									   ");
		con.println("			I think you deserve a reward!													   ");
		con.println("					said Lady Goose														   ");
		con.println("==============================================================");
		con.println("She gives you plenty of food and gold coins, enough for your family and your kids!");
		con.sleep(3000);
		con.clear();
		scene14(con);
	}
	//Scene 14
	public static void scene14(Console con){
		con.setDrawColor(new Color(200, 208, 189));
		con.fillRect(0, 0, 1280, 720);
		//End Screen Title
		Font fntCucciolo4 = con.loadFont("Cucciolo.ttf", 80);
		con.setDrawFont(fntCucciolo4);
		con.setDrawColor(Color.BLACK);
		con.drawString("WINNER WINNER CHICKEN DINNER!!", 70, 280);
		con.sleep(10000);
		con.closeConsole();
	}
}
