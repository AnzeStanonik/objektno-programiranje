class StringPomnilnik {
    // StringBuffer
    int dolzina = 3;
    String pomnilnik = "niz"; //nizparam

    boolean lahkoSpreminjamo = false;
    boolean neMoremoSpreminjati;

    {
        //inicializacijski blok           
        neMoremoSpreminjati = false;
    }

    void append(String pomn) { //pa
        pomnilnik += pomn;
    }
    String vrednost() {
        return pomnilnik;
    }

    String konstantnaVrednost() {
        return "vrednost";
    }
}