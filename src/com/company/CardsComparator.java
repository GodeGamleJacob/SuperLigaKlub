package com.company;

import java.util.Comparator;

class CardsComparator implements Comparator<SuperLigaKlub> {

    public int compare(SuperLigaKlub klub1, SuperLigaKlub klub2) {
        if (klub1.getRedCards() == klub2.getRedCards())
            return 0;
        else if (klub1.getRedCards() > klub2.getRedCards())
            return 1;
        else
            return -1;
    }
}

