import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

 abstract class Persoon implements Comparable<Persoon>{
    private String naam;
    private int leeftijd;

    public Persoon (String naam, int leeftijd){
        this.naam = naam;
        this.leeftijd = leeftijd;
        PersonenLijstVoegToe(this);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    @Override
    public int compareTo(Persoon persoon){
        return this.naam.compareTo(persoon.naam);
    }
    private static List<Persoon> personenLijst = new ArrayList<>();
    private static void PersonenLijstVoegToe(Persoon persoon){
        personenLijst.add(persoon);
        Collections.sort(personenLijst);
    }
    public static List<Persoon> getPersonenLijst(){
        return personenLijst;
    }

     public abstract String geefDetails();
 }
