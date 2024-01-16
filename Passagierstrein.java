import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Passagierstrein extends Trein {
    private int maximumCapaciteit;
    private int huidigeCapaciteit;
    private List<Passagier> passagiers;

    public Passagierstrein(String naam, Conducteur conducteur, int maximumCapaciteit, int huidigeCapaciteit) {
        super(naam, conducteur);
        this.maximumCapaciteit = maximumCapaciteit;
        this.huidigeCapaciteit = huidigeCapaciteit;
        this.passagiers = new ArrayList<>();
    }

    public void stapOp(Passagier passagier) throws PassagierNietGevonden {
        if (passagier.heeftTicket()) {
            if (huidigeCapaciteit < maximumCapaciteit) {
                passagier.neemTicketInBeslag();
                passagiers.add(passagier);
                huidigeCapaciteit++;
            } else {
                System.out.println("Passagier " + passagier.getNaam() + " geweigerd. Trein vol.");
            }
        } else {
            System.out.println("Passagier " + passagier.getNaam() + " geweigerd. Geen ticket.");
        }
    }

    public void stapAf(Passagier passagier) throws PassagierNietGevonden {
        if (passagiers.contains(passagier)) {
            passagiers.remove(passagier);
            huidigeCapaciteit--;
        } else {
            throw new PassagierNietGevonden("Passagier niet gevonden op de trein.");
        }
    }

    public List<Passagier> geefPassagiersGesorteerdOpNaam() {
        List<Passagier> kopiePassagiers = new ArrayList<>(passagiers);
        Collections.sort(kopiePassagiers, Comparator.comparing(Passagier::getNaam));
        return kopiePassagiers;
    }

    public List<Passagier> geefPassagiersGesorteerdOpLeeftijd() {
        List<Passagier> kopiePassagiers = new ArrayList<>(passagiers);
        Collections.sort(kopiePassagiers, Comparator.comparingInt(Passagier::getLeeftijd));
        return kopiePassagiers;
    }
}
class PassagierNietGevonden extends Exception {
    public PassagierNietGevonden(String message) {
        super(message);
    }
}


