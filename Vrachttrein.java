class VrachtTrein extends Trein implements Aflaatbaar {
    private int laadVermogen;
    private int geladen;

    public VrachtTrein(String naam, Conducteur conducteur) {
        super(naam, conducteur);
        this.laadVermogen = getLaadVermogen();
        this.geladen = getGeladen();
    }

    public int getLaadVermogen() {
        return laadVermogen;
    }

    public void setLaadVermogen(int laadVermogen) {
        if (laadVermogen >= 0) {
            this.laadVermogen = laadVermogen;
        } else {
            System.out.println("te zwaar geladen");
        }
    }
    public int getGeladen() {
        return geladen;
    }

    public void setGeladen(int geladen) {
        this.geladen = geladen;
    }

    @Override
    public void afladen() {
        System.out.println("VrachtTrein " + getNaam() + " is afgeladen.");
        this.geladen = 0;
    }
}
