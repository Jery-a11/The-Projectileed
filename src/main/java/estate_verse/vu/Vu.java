package estate_verse.vu;

import java.util.Scanner;  // Ensure this import is here
public class Vu {

    public static void main(String[] args) {
        Scanner save = new Scanner(System.in);
        System.out.println("===============\nWELCOME TOMMOBILEMONEY\n===========");
        System.out.println("Select your option \n1. Send money. \n2. Withdraw Money. \n3. Check Balance. ");
        int opt = save.nextInt();
        switch(opt){
            case 1:
                System.out.println("Send Money Section" + Math.PI);
                break;
            case 2 :
                System.out.println("Withdraw cash Section");
                break;
                
            case 3:
                System.out.println("Check balance Section");
                break;
            default:
                System.out.println("Entered wrong option");
                        break;    
        }
        int count = 0;
        while (count < 100){
            System.out.println("Welcome to Java");
            count++;
        }
    }
}
