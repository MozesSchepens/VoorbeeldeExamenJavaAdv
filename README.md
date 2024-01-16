
Treinbeheersysteem

Deel 1: Persoon en Trein Klassen
Deel 2: Vracht- en Passagierstreinen met Aflaadfunctionaliteit
Deel 3: Hoofdprogramma: Toevoegen van Conducteurs, Passagiers en Beheer van Treinen

DEEL 1:
Om te beginnen maken we een Persoon klasse aan. Een Persoon heeft een naam en een
leeftijd. Beide zijn nodig om een persoon aan te maken, een persoon heeft geen default
waardes. De klasse persoon houdt een unieke gesorteerde lijst bij van al de aangemaakte
personen. Deze lijst is uniek en gesorteerd op naam. Bij het aanmaken van een nieuwe
Persoon zal die persoon dus automatisch worden toegevoegd aan de personen lijst. Zorg bij
al de klasses voor gepaste getters en setters.
Zorg ervoor dat je deze personenlijst in je main klasse altijd kan opvragen en afdrukken.
We hebben twee soorten personen, één Conducteur en een Passagier.
Conducteur: De conducteur heeft een extra attribuut: int ervaring; Deze zal aantonen
hoeveel jaar ervaring hij/zij heeft.
Passagier: Een passagier heeft als extra attribuut: een boolean genaamd ticket.
Voorzie voor beiden ook een toString() methode. Zoek een manier om de subklasses van
Persoon te verplichten de functie geefDetails() te laten implementeren. De geefDetails()
functie zal de toString() functie laten verschijn in de console (sout). Voorbeeld:
“Passagier Robin leeftijd 23 ticket=false”
DEEL 2:
We maken een trein klasse aan. Een trein heeft een naam en een Conducteur nodig. Zorg
ervoor dat subklassen van de treinklassen niet zonder een functie aan de attributen kunnen.
We hebben twee verschillende soorten treinen in ons programma:
1. Vrachttrein deze soort trein heeft een laadVermogen uitgedrukt in ton (int), om
aan te tonen hoeveel gewicht hij kan dragen. Vervolgens heb je nog een
attribuut geladen, dit toont aan hoe vol de vrachttrein is geladen bij default is
deze 0 en het laadVermogen 60.
1. zorg voor de bijpassende getters en setters.
2. Een Vrachttrein implementeert de interface Aflaatbaar met de
methode afladen(). Deze methode returned niets maar zet
de geladen attribuut terug op 0 en toont aan in de console dat de
vrachttrein is afgeladen.
2. Passagierstrein deze soort trein heeft drie attributen,
een maximumCapaciteit om aan te tonen hoeveel passagiers deze kan vervoeren
en een huidigeCapaciteit om te kijken hoeveel mensen er op de trein zitten.
Voor het gemak van de oefening zetten we de maximumCapaciteit voor een passagierstrein
op 15. Indien de gebruiker een getal groter dan 15 meegeeft zet je de capaciteit op
de default waarde 3 zetten.
Tenslotte houdt deze nog een ongesorteerde lijst bij genaamd passagiers van al de passagiers
die op de trein zitten.
Om dit te verwezenlijken voegen we een void functie stapOp() toe die een
Passagier meeneemt als parameter en deze toevoegt aan de passagiers lijst.
1. Een Passagier kan enkel op de trein gaan indien deze een ticket heeft (boolean
true). Anders zal er een bericht in de console verschijnen dat de persoon
geweigerd is op de trein.
2. Als de persoon toegelaten wordt op de trein zal je deze toevoegen aan de
passagiers lijst. Zorg er hier echter voor dat je het ticket na de opstap ook in
beslag neemt.
3. Vervolgens zorg je ervoor dat een passagier via de stapAf() functie de trein ook
terug kan verlaten. Indien de Passagier zich niet op de trein bevindt zal je
een PassagierNietGevondenException Deze behandel je elke keer dat je de
stapAf() functie uitvoert.
4. Ten slotte voeg je nog twee functies toe:
1. geefPassagiersGesorteerdOpNaam() deze al de passagiers teruggeven
gesorteerd op naam.
2. En geefPassagiersGesorteerdOpLeeftijd. Deze zal al de passagiers
teruggeven gesorteerd op leeftijd.
DEEL 3 Main
Voeg in de main twee conducteurs toe. Robin en Klaas, je mag de leeftijd en ervaring zelf
kiezen.
Voeg vervolgens 6 passagiers toe Lode heeft een ticket, Ahmad heeft een ticket, Erica heeft
een ticket, Josh geen ticket, Zoe geen ticket en Chantal heeft een ticket. Leeftijd mag je zelf
kiezen maar deze is altijd anders.
Daarna maak je een vrachttrein de “Robin Express” waarvan Robin de conducteur is, hier zet
het laadvermogen op 50. Vervolgens laad je de vrachttrein met 40ton. Nu print je deze trein
af. Vervolgens roep je de functie afladen() op en print de vrachttrein opnieuw af.
Maak dan een passagierstrein aan en noem deze “EhB Express” met als conducteur Klaas. De
huidige capaciteit zal 0 zijn en de maximumcapaciteit 20. Probeer vervolgens iedereen met
een ticket op de trein te zetten en print dit via geefPassagiersGesorteerdOpNaam &
geefPassagiersGesorteerdOpLeeftijd af.
Laat ten slotte Josh van de trein afstappen en print het resultaat af.
