package com;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Tickets t = new TicketsImp(500);
		Scanner sc =  new Scanner(System.in);

		while(true) {
			System.out.println("1:BookTickets\n2:CancelTickets\n3:CheckAvailableTickets\n4:Exit\nEnter Choice:");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Number of Tickets need to Book:");
				t.ticketBooking(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter Number of Tickets to be Cancelled:");
				t.cancelTicket(sc.nextInt());
				break;
			case 3:
				System.out.println("Total Available TIckets are:"+t.availableTickets());
				break;
			case 4:
				System.out.println("THANK YOU!!");
				System.exit(0);
			default:
				System.out.println(t.displayErrorMessage());
			}
			System.out.println("--------------------------------");
		}

	}

}
