import java.util.Random;
import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        int box1 = 0 ;
        int box2 = 1 ;
        int box3 = 2 ;
        int user ; //user's choice
        int comp ; //computer's choice

        Scanner input = new Scanner(System.in);
        Random  myRand = new Random() ;
        System.out.println("0. box1 , 1.box2 , 2.box3");
        System.out.println("choose between 0,1,2");
        user = input.nextInt();
        comp = myRand.nextInt();

        if ( user == comp )
        {
            System.out.println("user wins the treasure");
        }
        else
        {
            System.out.println("user takes a big L");
        }
    }
}
