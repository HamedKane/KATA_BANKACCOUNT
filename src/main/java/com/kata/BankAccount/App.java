package com.kata.BankAccount;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		Client client = new Client("C1","N'DAW", "Hamed");
        BankAccount bankAccount = new BankAccount("BA00001",client);
        
    		System.out.println( "*******************************************" );
        System.out.println( "*************  KATA BANK ACCOUNT **********" );
        System.out.println( "*******************************************" );
        System.out.println( "" );
        System.out.println( "--------- Client Informations -------------" );
        System.out.println(client.getId() + " - " + client.getPrenom() + " " + client.getNom());      
        boolean isSortir=false;
        
        while(!isSortir) {
        		System.out.println( "" );
	        	System.out.println( "[1] - Make a deposit" );
	        	System.out.println( "[2] - Make a withdrawal" );
	        	System.out.println( "[3] - History" );
	        	System.out.println( "[4] - Exit" );
	        	System.out.println( "" );
	        	System.out.print( "Choice : " );
	        	Scanner sc = new Scanner(System.in);
	        	try {
	        		int choice = sc.nextInt();
	        		switch(choice) {	        		
			        	case 1:
			        		System.out.println( "" );
			        		System.out.print( "Deposit amount : " );
			        		System.out.print( "" );
			        		double amount = sc.nextDouble();
			        		bankAccount.deposit(amount);
			        		break;		        	
			        	case 2:
			        		System.out.println( "" );
			        		System.out.print( "Withdrawal amount : " );
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
			        		System.out.print( "Incorrect entry!");
			        		System.out.println( "" );
			        		break;
	        		}
	        	}catch(Exception e){
	        		System.out.print( "Incorrect entry!");
	        		System.out.println( "" );
	        	} 	
        }
        
		System.out.println( "*******************************************" );
        System.out.println( "*************  END ************************" );
        System.out.println( "*******************************************" );       	
    }
}
