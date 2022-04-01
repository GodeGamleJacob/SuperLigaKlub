package com.company;

import java.util.Comparator;

public class NameComparator implements Comparator<SuperLigaKlub> {

    public int compare(SuperLigaKlub klub1, SuperLigaKlub klub2) {
        if (klub1.getClubName().compareTo(klub2.getClubName()) == 0)
            return 0;
        else if (klub1.getClubName().compareTo(klub2.getClubName()) > 0)
            return 1;
        else
            return -1;

    }
}
