import java.util.Random;
import java.util.Scanner;
public class GuessNo {
    public static void main(String[] args) {
      Random rand=new Random();
      Scanner sc=new Scanner(System.in);
       int randomNum= rand.nextInt(100)+1;
       System.out.println("enter the Num");

      
      while(true)
      {
        int guessNum=sc.nextInt();
        if(guessNum==randomNum)
        {
            System.out.println("correct!");
            break;
        }
        else if(randomNum>guessNum)
        {
            System.out.println("Nope! your no. is smaller");
        
        }
        else{
            System.out.println("Nope! your no. is greater");
        
        }
       }
    } 
}
