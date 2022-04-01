package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        SuperLigaKlub teamTordenFlæsk = new SuperLigaKlub("TeamTordenFlæsk", "BaconVej 117", "2920", 1, 4, 10, 1, 11, 23, new ArrayList<>(Arrays.asList("1 Torben", "2 Nicklas", "3 Mads", "4 Jacob", "5 Daniel", "6 Marc", "7 Fisk", "8 Messi", "9 Neymar", "10 Obama", "11 Churchill")));
        SuperLigaKlub fcNordsjælland = new SuperLigaKlub("FCNordsjælland", "Rigmandsvej 99", "2900", 100, 50, 10, 1000, 0, 10, new ArrayList<>(Arrays.asList("1 Faxe", "2 Zuma", "3 Henry", "4 Beckham", "5 Cantona", "6 Zidane", "7 Ronaldo", "8 CR7", "9 Laudrup", "10 Laudrup", "11 Reagan")));
        SuperLigaKlub fml = new SuperLigaKlub("FML", "Lortestræde 0", "Lolland...", 0, 50, 100, 0, 22, 44, new ArrayList<>(Arrays.asList("1")));
        System.out.println("Hashcode for holdet teamTordenFlæsk: " + teamTordenFlæsk.hashCode());
        int x = teamTordenFlæsk.hashCode();
        int indexPlads = x % 50;
        System.out.println(indexPlads);
        System.out.println("den nye hashcode for teamTordenFlæsk er: " + indexPlads);
        SuperLigaKlub[] superLigaKlubber = {teamTordenFlæsk, fcNordsjælland, fml};

        ArrayList<SuperLigaKlub> superLigaListe = new ArrayList<>(Arrays.asList(superLigaKlubber));

        for (SuperLigaKlub s : superLigaListe) {
            System.out.println(s.toString());
        }

        ArrayList superligaklubberne = new ArrayList();
        superligaklubberne.add(teamTordenFlæsk);
        superligaklubberne.add(fcNordsjælland);
        superligaklubberne.add(fml);

        BubbleSort bubbleSort = new BubbleSort();

        bubbleSort.bubbleSort(superLigaKlubber);

        System.out.println("\nSortering by Ganes won");

        for (int i = 0; i < superLigaKlubber.length; i++) {
            System.out.printf("\nKlub: %-10s - Vundne kampe: %d - Antal røde kort: %d \n", superLigaKlubber[i].getClubName(), superLigaKlubber[i].getGamesWon(), superLigaKlubber[i].getRedCards(), "\n");
        }

        for (int i = 0; i < superLigaListe.size(); i++) {
            System.out.println();
            System.out.printf(superLigaListe.get(i).toString());
            System.out.println();
        }

        System.out.println("\n\nSorting by Red Cards\n");

        Collections.sort(superLigaListe, new CardsComparator());

        for (SuperLigaKlub slk : superLigaKlubber) {
            System.out.println("Klubben: " + slk.getClubName() + " har fået så mange røde kort: " + slk.getRedCards() + "\n");
        }

        System.out.println("\nSorting by Name\n");

        Collections.sort(superLigaListe, new NameComparator());
        for (SuperLigaKlub slk : superLigaListe) {
            System.out.println("Klubnavn: " + slk.getClubName() + "\n");
        }

        ObjectComparator nc = new ObjectComparator();
        BubbleSort1 b = new BubbleSort1();
        b.bubbleSort1(superLigaKlubber, nc);
        for (int i = 0; i < superLigaKlubber.length; i++)
            System.out.printf(superLigaKlubber[i] + "\n ");
        System.out.println();

        Set<SuperLigaKlub> klubSet = new HashSet<>();
        klubSet.add(teamTordenFlæsk);
        klubSet.add(fcNordsjælland);
        klubSet.add(fml);

        Set<SuperLigaKlub> linkedKlubSet = new LinkedHashSet<>();
        linkedKlubSet.add(fcNordsjælland);
        linkedKlubSet.add(teamTordenFlæsk);
        linkedKlubSet.add(fml);

        Set<SuperLigaKlub> treeKlubSet = new TreeSet<>();
        treeKlubSet.add(fml);
        treeKlubSet.add(fcNordsjælland);
        treeKlubSet.add(teamTordenFlæsk);

        for (SuperLigaKlub klubben : linkedKlubSet) {
            System.out.println(klubben + " ");
        }

        Map<SuperLigaKlub, String> klubber = new HashMap<>();
        klubber.put(fcNordsjælland, "Din far...\n");
        klubber.put(teamTordenFlæsk, "2Ben\n");
        klubber.put(fml, "Folketinget\n");
        System.out.println("Hashmappet med trænere:\n");
        for (SuperLigaKlub key : klubber.keySet()) {
            System.out.println(key + " = " + klubber.get(key));
        }

        Set<SuperLigaKlub> comparatorKlubSet = new TreeSet<>(new CardsComparator());
        comparatorKlubSet.add(teamTordenFlæsk);
        comparatorKlubSet.add(fcNordsjælland);
        comparatorKlubSet.add(fml);

        System.out.println("Sorteret på kort:\n");

        for (SuperLigaKlub s : comparatorKlubSet) {
            System.out.println(s);
        }
    }
}
/**
 * 1.	Implementer en klasse superligaKlub, der som minimum skal have medlemsvariablene:
 * Klubbens navn
 * Klubbens adresse
 * Klubbens postnummer
 * antal vundne kampe i den aktuelle sæson
 * antal uafgjorte kampe i den aktuelle sæson
 * antal spillede kampe i den aktuelle sæson
 * antal scoringer
 * antal udvisninger
 * antal gule kort
 * En datastruktur som indeholder navnene på spillere på superligaholdet
 * Test klassen i et main-program.
 * <p>
 * 2.	Opret i main en datastruktur, som kan indeholde objekter af klassen superliga.
 * Indsæt superligahold i denne datastruktur.
 * <p>
 * 3.	Det skal nu være muligt at sortere dataene i datastrukturen fra opgave 2. Sorteringen skal være på klubbens navn.
 * Vælg selv sorteringsalgoritme.
 * <p>
 * 4.	Ved brug af interfacet Comparator skal det nu være muligt ved kald af sorteringsfunktionen at angive hvad der skal sorteres på (antal vundne kampe, antal scoringer, osv).
 * <p>
 * 5.	Programmer de forskellige sorteringsalgoritmer, som vi har gennemgået, så de bliver generiske. Se evt. BubbleSortTemplate1->Bubblesort1 programmet.
 */