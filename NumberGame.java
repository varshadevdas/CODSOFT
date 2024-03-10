import java.util.*;

public class NumberGame {

    public static int getrandN(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int chances = 10;
        int final_score = 0;
        boolean play = true;
        System.out.println("*****  Number Game  *****");
        System.out.println("Welcome to The Game .");
        System.out.println("Hello You Have "+chances+" to win the Game .");
        
        while(play){
            int randnum = getrandN(1,100);
            boolean guess = false;
            for(int i = 0; i < chances; i++){
                System.out.println("Chance - "+(i+1)+"  Enter Your Guess ");
                int num = sc.nextInt();
                if(num==randnum){
                 guess=true;
                 final_score+=1;    
                 System.out.println("You Won the Game !!!");
                 break;
                }
                else if(num > randnum){
                    System.out.println("Too High");
                }
                else{
                    System.out.println("Too Low");
                }
            }
            if(guess == false){
                System.out.println("Sorry , You Loose the game !!!");
                System.out.println("The Number is :- "+randnum);
            }
            System.out.println("Do you want to Continue the Game (y/n)");
            String conti = sc.next();
            play = conti.equalsIgnoreCase("y");
        }
        System.out.println("Thank You !!");
        System.out.println("Your Score "+final_score);
        sc.close(); 
    }
}