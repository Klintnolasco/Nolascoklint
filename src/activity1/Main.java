  
package activity1;

import banking.bankingclass;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        bankingclass bApp[] = new bankingclass[9];
        int accountCount = 0;
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        int resp;
        
        switch(choice){
            case 1:
              do {
                System.out.println("1. Register Account");
                System.out.println("2. Login Account");
                System.out.println("3. View All Accounts");
                System.out.println("Enter Selection: ");
                int action = sc.nextInt();
                
                switch(action){
                    case 1:
                        if (accountCount < bApp.length) {
                            bApp[accountCount] = new bankingclass();
                            System.out.print("Enter Account No.: ");
                            bApp[accountCount].setAccountNo(sc.nextInt());
                            System.out.print("Enter Account Pin: ");
                            bApp[accountCount].setPin(sc.nextInt());
                            System.out.println("Account registered successfully!");
                            accountCount++; 
                        } else {
                            System.out.println("Cannot register new account. Maximum accounts reached.");
                        }
                        break;
                    case 2:
                        int attempts = 3;
                        boolean loggedIn = false;
                        
                        while(attempts > 0 && !loggedIn){
                            System.out.print("Enter your Account No: ");
                            int accountNo = sc.nextInt();
                            System.out.print("Enter your Pin: ");
                            int pin = sc.nextInt();
                            
                            for (int i = 0; i < accountCount; i++) {
                                if (bApp[i].verifyAccount(accountNo, pin)) {
                                    System.out.println("Login Successful! Welcome Account " + bApp[i].getAccountNo());
                                    loggedIn = true;
                                    break; 
                                }
                            }
                            
                            if (!loggedIn) {
                                attempts--;
                                System.out.println("INVALID ACCOUNT!");
                                System.out.println("Attempt Left: " + attempts);
                            }
                        }
                        
                        if (!loggedIn) {
                            System.out.println("ATTEMPT LIMIT REACHED!");
                        }
                        break;
                    case 3:
                        if (accountCount == 0) {
                            System.out.println("No accounts registered yet.");
                        } else {
                            System.out.println("--- All Registered Accounts ---");
                            for (int i = 0; i < accountCount; i++) {
                                System.out.println("Account No: " + bApp[i].getAccountNo() + ", Pin: " + bApp[i].getPin());
                            }
                            System.out.println("-----------------------------");
                        }
                        break;
                    default:
                        System.out.println("Invalid Selection!");
                }
                
                System.out.print("Do you want to continue? (1 for yes, 0 for no):");
                resp = sc.nextInt();
              } while(resp == 1);
                
                break;
            case 2:
                System.out.println("Not yet implemented.");
                break;
            case 3:
                System.out.println("Not yet implemented.");
                break;
            default:
                System.out.println("Invalid Selection!");
        }
    }
}
        
    
    

