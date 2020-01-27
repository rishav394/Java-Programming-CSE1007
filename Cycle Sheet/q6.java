import java.util.*;

abstract class ThemePark{
    int ADULT_FEE = 500;
    int CHILDREN_FEE = 300;
    
    protected int cost(int adult, int children){
        return adult * ADULT_FEE + children * CHILDREN_FEE;
    }
    
    ThemePark(int adult, int children){
        System.out.println("\n\n**************************************\nYour total cost is " + cost(adult, children));
    }
    
    abstract void playGame(int gameId);
    abstract void exit();
}

class Queensland extends ThemePark{
    
    Queensland(int adult, int children){
        super(adult,children);
        System.out.println("Welcome to Queensland!");
    }
    
    final int TOTAL_GAMES = 30;
    boolean[] games = new boolean[TOTAL_GAMES]; // False by default
    
    // @param gameId [0 - 29]
    public void playGame(int gameId){
        if(games[gameId]){
            System.out.println("You have already played this game. Please play another game.");
        }
        else{
            games[gameId] = true;
            System.out.println("Thank you for playing game #" + gameId);
        }
    }
    
    public void exit(){
        System.out.println("Thank you for visiting Queensland!\n\n");
    }
}

class Wonderla extends ThemePark{
    
    Wonderla(int adult, int children){
        super(adult,children);
        System.out.println("Welcome to Wonderla!");
    }
    
    final int TOTAL_GAMES = 40;
    int[] games = new int[TOTAL_GAMES]; // 0 by default
    
    // @param gameId [0 - 29]
    public void playGame(int gameId){
        games[gameId]++;
        System.out.println("Thank you for playing game #"+ gameId);
    }
    
    public void exit(){
        int repeated = 0;
        for(int x: games){
            if (x!=0) repeated++;
        }
        System.out.println("Total number of repeated games played were " + repeated);
        System.out.println("Total number of games not played were "+ (TOTAL_GAMES - repeated));
        System.out.println("Thank you for visiting Wonderla!\n\n");
    }
}

public class q6
{
	public static void main(String[] args) {
	    Scanner src = new Scanner(System.in);
	    char choice;
	    do{
	        System.out.println("1. Queensland");
	        System.out.println("2. Wonderla");
	        System.out.println("Press any other key to exit");
	        System.out.print("Choice: ");
	        choice = src.nextLine().charAt(0);
	        switch(choice){
	            case '1':{
	                System.out.print("\nEnter number of adults and number of children:");
	                int adults = Integer.parseInt(src.nextLine());
	                int children = Integer.parseInt(src.nextLine());
	                Queensland player = new Queensland(adults,children);
	                int gameid;
	                do{
	                    System.out.print("Enter game id [0-29] or anything else to exit : ");
	                    try{
	                        gameid = Integer.parseInt(src.nextLine());
	                        player.playGame(gameid);
	                    }
	                    catch(NumberFormatException e){
	                        player.exit();
	                        break;
	                    }
	                }while(true);
	                break;
	            }
                case '2':{
	                System.out.print("\nEnter number of adults and number of children:");
	                int adults = Integer.parseInt(src.nextLine());
	                int children = Integer.parseInt(src.nextLine());
	                Wonderla player = new Wonderla(adults,children);
	                int gameid;
	                do{
	                    System.out.print("Enter game id [0-39] or anything else to exit : ");
	                    try{
	                        gameid = Integer.parseInt(src.nextLine());
	                        player.playGame(gameid);
	                    }
	                    catch(NumberFormatException e){
	                        player.exit();
	                        break;
	                    }
	                }while(true);
	                break;
                }
	        }
	    }while(choice=='1' || choice=='2');
	}
}

