class Passagier extends Persoon {
    private boolean ticket;

    public Passagier(String naam, int leeftijd, boolean ticket) {
        super(naam, leeftijd);
        this.ticket = ticket;
    }

    public boolean heeftTicket() {
        return ticket;
    }

    public void neemTicketInBeslag() {
        this.ticket = false;
    }

    @Override
    public String geefDetails() {
        String details = "Passagier " + getNaam() + " leeftijd " + getLeeftijd() + " ticket=" + heeftTicket();
        System.out.println(details);
        return details;
    }
}
