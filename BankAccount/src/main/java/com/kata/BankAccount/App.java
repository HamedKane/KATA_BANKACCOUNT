package com.kata.BankAccount;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		System.out.println( "*******************************************" );
        System.out.println( "*************  KATA BANK ACCOUNT **********" );
        System.out.println( "*******************************************" );
        Scanner sc = new Scanner(System.in);
        
        System.out.println( "Account N° XXXXXXXXX0 was created with 1000 euros deposit." ); 
        System.out.println( "" );
        
        BankAccount bankAccount = new BankAccount("XXXXXXXXX0",0);
        bankAccount.deposit(1000);
        boolean isSortir=false;
        
        while(!isSortir) {
        		System.out.println( "" );
	        	System.out.println( "Choisissez l'opération à effectuer : " );
	        	System.out.println( "[1] - Make a deposit" );
	        	System.out.println( "[2] - Make a withdrawal" );
	        	System.out.println( "[3] - History" );
	        	System.out.println( "[4] - Sortir" );
	        	System.out.print( "Choice : " );
	        	int choice = sc.nextInt();
	        		        		        	
	        	switch(choice) {	        		
		        	case 1:
		        		System.out.println( "" );
		        		System.out.print( "Deposit amount? : " );
		        		System.out.print( "" );
		        		double amount = sc.nextDouble();
		        		bankAccount.deposit(amount);
		        		break;		        	
		        	case 2:
		        		System.out.println( "" );
		        		System.out.print( "Withdrawal amount? : " );
		        		System.out.print( "" );
		        		double amountW = sc.nextDouble();
		        		bankAccount.withdraw(amountW);
		        		break;
		        	case 3:
		        		System.out.println( "" );
		        		bankAccount.getHistory();
		        		break;
		        	case 4:
		        		isSortir=true;
		        		break;
		        	default:	        	
	        	}
        }
        
		System.out.println( "*******************************************" );
        System.out.println( "*************  END ************************" );
        System.out.println( "*******************************************" );
        	
    }
}
