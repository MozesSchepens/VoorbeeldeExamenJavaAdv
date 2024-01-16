class Conducteur extends Persoon {
    private int ervaring;

    public Conducteur(String naam, int leeftijd, int ervaring) {
        super(naam, leeftijd);
        this.ervaring = ervaring;
    }

    public int getErvaring() {
        return ervaring;
    }

    public void setErvaring(int ervaring) {
        this.ervaring = ervaring;
    }
    public String geefDetails() {
        System.out.println("Conducteur " + getNaam() + " leeftijd " + getLeeftijd() + " jaar, ervaring: " + ervaring + " jaar");
        return null;
    }
}
