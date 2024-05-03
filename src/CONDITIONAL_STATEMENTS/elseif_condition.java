package CONDITIONAL_STATEMENTS;

public class elseif_condition {
public static void main(String[] args) {
	int age =61;
	int TicketCost = 300;
	
	   if(age<5) {
		System.out.println("you are child ,No ticket");
	}

	else if (age >5&&age<12){
	    int b;
	    b=TicketCost*50/100;
		System.out.println("You are Minor Ticket cost , INR "+ b);
	}
	else if(age >12 && age<60) {
		System.out.println("you are Majior ticket Cost ,INR "+TicketCost);
	}
	else if(age>60) {
		int D = TicketCost-TicketCost*20/100;
		System.out.println("you are Senior Citizen Ticket Cost ,INR "+D);
	}
	}
    }

