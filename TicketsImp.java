package com;

public class TicketsImp implements Tickets{
	int tickets;
	public TicketsImp(int tickets) {
		this.tickets=tickets;
	}
	public void ticketBooking(int ticket) {
		if(ticket<=tickets) {
			System.out.println("Number of tickets to be booked:"+ticket);
			tickets=tickets-ticket;
			System.out.println("Ticket is Booked Successfully...");
		}
		else {
			try {
				throw new InsufficientTicketException("Insufficient Tickets...");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public void cancelTicket(int ticket) {
		System.out.println("Number of tickets to be Cancelled:"+ticket);
		tickets=tickets+ticket;
		System.out.println("Ticket is Cancelled Successfully...");
	}
	public int availableTickets() {
		return tickets;
	}
	public String displayErrorMessage() {
		return "Invalid Choice,Please Enter Valid Choice";
	}
}
