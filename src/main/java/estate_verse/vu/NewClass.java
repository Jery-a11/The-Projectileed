/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estate_verse.vu;

/**
 *
 * @author ADIMIIN
 */
import java.util.Scanner;

public class NewClass {
    public static void main(String[] arg){
        Scanner save = new Scanner(System.in);
        System.out.println("===============\nWELCOME TOMMOBILEMONEY\n===========");
        System.out.println("Select your option \n1.send money. \n2. Withdraw Money. \n3. Check Balance. ");
        int opt = save.nextInt();
        switch(opt){
            case 1:
                System.out.println("Send Money Section");
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
    }
}
