class Naloga {
    public static void main(String[] args) {
        System.out.println("Objektno programiranje");

        //objekt / instanca razreda
        StringBuffer sb = new StringBuffer();
        sb.append("pa");
        System.out.println(sb);
        sb.append("ram");
        System.out.println(sb);
        System.out.println("------------------");

        StringPomnilnik sp = new StringPomnilnik();
        sp.append("pa");
        System.out.println(sp.vrednost());
        System.out.println(sp.vrednost());
        System.out.println(sp.vrednost());
        sp.append("ram");
        System.out.println(sp.vrednost());
        System.out.println("------------------");

    
        StringPomnilnik sp2 = new StringPomnilnik();
        System.out.println(sp2.vrednost());
        
        StringPomnilnik sp3 = new StringPomnilnik();
        System.out.println(sp3.vrednost());
        //snov
        System.out.println(sp == sp2);
        System.out.println(sp2 == sp3); // 0x1 ni enako 0x5, oba hranita isto stanje, vendar loceno (beseda new)
        System.out.prinln(sp3.konstantnaVrednost);
    }
}