class Trein {
    private String naam;
    private Conducteur conducteur;

    public Trein(String naam, Conducteur conducteur) {
        this.naam = naam;
        this.conducteur = conducteur;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Conducteur getConducteur() {
        return conducteur;
    }

    public void setConducteur(Conducteur conducteur) {
        this.conducteur = conducteur;
    }
}

interface Aflaatbaar {
    void afladen();
}
