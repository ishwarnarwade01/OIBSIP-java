
import java.util.*;
class ATMinterface{
	static int bal;
	public static int deposit(){
	//int bal=0;
	//this.bal=0;
	//int dep;
	System.out.println("Enter the amount you want to deposit");
	Scanner sc=new Scanner(System.in);
	int dep=sc.nextInt();
	bal=dep+bal;
	System.out.println("your balance is :"+bal);
	return bal;
	}
	
	public static int withdraw(){
	System.out.println("Enter the amount you want to withdraw");
    Scanner sc=new Scanner(System.in);
    int withdraw=sc.nextInt();
	if(bal<withdraw){
		System.out.println("insufficient balance");
	}
	else{
    bal=bal-withdraw;
    System.out.println("your balance is"+bal);	
	}
	return bal;
	}
	
	public static void amount(){
		System.out.println("Your balance is:"+bal);
	}
	
	public static void main(String args[]){
	System.out.println("");
	System.out.println("welcome to ATM");
	int choice;
	do{
	System.out.println("");
	System.out.println("****************************************************************");
	Scanner sc=new Scanner(System.in);
	
	System.out.println("1.Deposit\n2.Withdraw\n3.CheckBal\n4.Exit");
	choice=sc.nextInt();
		//System.out.println("");
	switch(choice){
		case 1:{
			deposit();
		break;}
		case 2:{
			withdraw();
			break;
		}
		case 3:{amount();
		break;
		}
		case 4:{
			break;
		}
		default:{
			System.out.println("Wrong Choice");
		}
		
	}
	}while(choice!=4);
}
}