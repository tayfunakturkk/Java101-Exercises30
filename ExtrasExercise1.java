package Extras.Exercise1;
import java.util.Scanner;
import java.util.Random;
public class ExtrasExercise1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int number = rand.nextInt(100);
        int guess=-1;
        int i = 5;
        System.out.println(number);
        while(i>0){
            System.out.print("Guess: ");
            guess= input.nextInt();
            if(guess<0 ||guess >100){
                System.out.println("Incorrect range 1 right gone");
                System.out.println("Remaining right: "+i);
                continue;
            }
            else {
                if(guess==number){
                    System.out.println("Congratulations you got it right: "+number);
                    break;
                }
                else {
                    if(guess<number){
                        System.out.println("Guess a bigger");
                        System.out.println("Remaining right: "+(i-1));
                    }
                    else{
                        System.out.println("Guess a smaller");
                        System.out.println("Remaining right: "+(i-1));
                    }
                }
            }
            i--;
        }
        if(guess!=number){
            System.out.println("You lost,number: "+number);
        }
}
}
