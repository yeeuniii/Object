package TicketSale;

public class Bag {
    private Ticket ticket;
    private Invitation invitation;
    private Long amount;

    public Bag(long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasTicket() {
        return this.ticket != null;
    }

    public boolean hasInvitation() {
        return this.invitation != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
