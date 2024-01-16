
import java.util.List;

public class main {
    public static void main(String[] args) throws PassagierNietGevonden {
       //Conducteur conducteur = new Conducteur("Bert", 45, 10);
       //VrachtTrein vrachtTrein = new VrachtTrein("Thomas", conducteur);
       //Passagierstrein passagierstrein = new Passagierstrein("MIB",conducteur, 12, 2);

       Conducteur conducteur1 = new Conducteur("Fons", 35, 5);
       Conducteur conducteur2 = new Conducteur("Brenda", 45, 15);
       VrachtTrein vrachtTrein1 = new VrachtTrein("RobinExpress", conducteur1);
       vrachtTrein1.setGeladen(40);
       vrachtTrein1.setLaadVermogen(50);

       System.out.println("RobinExpress heeft een laadvermogen van " + vrachtTrein1.getLaadVermogen() + " ton en is " + vrachtTrein1.getGeladen() + " ton geladen.");
       vrachtTrein1.afladen();
       System.out.println("RobinExpress heeft een laadvermogen van " + vrachtTrein1.getLaadVermogen() + " ton en is " + vrachtTrein1.getGeladen() + " ton geladen.");

       Passagierstrein passagierstrein1 = new Passagierstrein("EhbExpress", conducteur2, 20, 0);

       Passagier passagier1 = new Passagier("Bob",45, true);
       Passagier passagier2 = new Passagier("An", 32, false);
       Passagier passagier3 = new Passagier("Lode", 12, true);
       Passagier passagier4 = new Passagier("Ahmad", 18, true);
       Passagier passagier5 = new Passagier("Erica", 22, true);
       Passagier passagier6 = new Passagier("Chantal", 45, true);
       Passagier passagier7 = new Passagier("Josh", 60, false);
       Passagier passagier8 = new Passagier("Zoe", 16, false);
       passagierstrein1.stapOp(passagier3);
       passagierstrein1.stapOp(passagier4);
       passagierstrein1.stapOp(passagier5);
       passagierstrein1.stapOp(passagier6);
       passagierstrein1.stapOp(passagier7);
       passagierstrein1.stapOp(passagier8);

       try {
           passagierstrein1.stapOp(passagier3);
           passagierstrein1.stapOp(passagier4);
           passagierstrein1.stapOp(passagier5);
           passagierstrein1.stapOp(passagier6);
           passagierstrein1.stapOp(passagier7);
           passagierstrein1.stapOp(passagier8);
           passagierstrein1.stapAf(passagier7);

       }catch (PassagierNietGevonden e){
           System.out.println(e.getMessage());
       }
       List<Passagier> OpNaam = passagierstrein1.geefPassagiersGesorteerdOpNaam();
       List<Passagier> OpLeeftijd = passagierstrein1.geefPassagiersGesorteerdOpLeeftijd();
       System.out.println("Geef passagiers gesorteerd op naam:");
       for (Passagier passagier : OpNaam){
           passagier.geefDetails();
       }
       System.out.println("Geef passagiers gesorteerd op naam:");
       for (Passagier passagier : OpLeeftijd){
           passagier.geefDetails();
       }

       /*vrachtTrein.afladen();
       passagierstrein.stapOp(passagier1);
       passagierstrein.stapOp(passagier2);
       try {
           passagierstrein.stapOp(passagier1);
           passagierstrein.stapOp(passagier2);
       }
       catch (PassagierNietGevonden e){
           System.out.println(e.getMessage());
       }
       List<Passagier>opNaam = passagierstrein.geefPassagiersGesorteerdOpNaam();
       List<Passagier>opLeeftijd = passagierstrein.geefPassagiersGesorteerdOpLeeftijd();
        System.out.println("Passagiers gesorteerd op naam:");
        for (Passagier passagier : opNaam) {
            passagier.geefDetails();
        }

        System.out.println("Passagiers gesorteerd op leeftijd:");
        for (Passagier passagier : opLeeftijd) {
            passagier.geefDetails();
        }*/
    }
}
