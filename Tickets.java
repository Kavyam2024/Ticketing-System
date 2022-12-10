package com;

public interface Tickets {
	void ticketBooking(int ticket);
	void cancelTicket(int ticket);
	int availableTickets();
	String displayErrorMessage();
}
