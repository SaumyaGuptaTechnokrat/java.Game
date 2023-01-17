package gamepackage;
import java.util.Scanner;
public class PlayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        System.out.println("FILL THE NUMBER YOU WANT TO MATCH BETWEEN 1 TO 6:");
	        int inp= input.nextInt();
	        
	        int RandomNum = (int)((Math.random()*5)+1);
	        System.out.println("System Generated number between 1 to 6:"+RandomNum);
	        if(inp==RandomNum){
	            System.out.println("YOU WON THE MATCH!!!");
	        }
	        else{
	            System.out.println("YOU LOST");
	        }
	    }
	}