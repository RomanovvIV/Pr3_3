package com.mycompany.pr3_3;
public class Gardener {
      private static String name;

    private static String disemvowel(String trew) {
        String[] vow = {"a", "e", "i", "o", "u"};

        for (int i = 0; i < vow.length; i++) {
            trew = trew.replace(vow[i], "");
            trew = trew.replace(vow[i].toUpperCase(), "");
        }

        return trew;
    }

    public static void filter(String namePlant) {
        name = disemvowel(namePlant) + "VGTBL";
    }

    public static String getName() {
        return name;
    }
}
