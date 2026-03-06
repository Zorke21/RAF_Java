package stringovi;

public class StringMetode {
    public static void main(String[] args) {
        String s = "  Dobar Dan  ";

        // length
        System.out.println("length: " + s.length());

        // trim
        String t = s.trim();
        System.out.println("trim: '" + t + "'");

        // substring
        System.out.println("substring(0,5): " + t.substring(0, 5));

        // startsWith / endsWith
        System.out.println("startsWith(\"Do\"): " + t.startsWith("Do"));
        System.out.println("endsWith(\"Dan\"): " + t.endsWith("Dan"));

        // toLowerCase / toUpperCase
        System.out.println("lower: " + t.toLowerCase());
        System.out.println("upper: " + t.toUpperCase());

        // contains
        System.out.println("contains(\"Dan\"): " + t.contains("Dan"));

        // indexOf
        System.out.println("indexOf(\"a\"): " + t.indexOf("a"));

        // charAt
        System.out.println("charAt(0): " + t.charAt(0));

        // StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("A=").append(10).append(", B=").append(20);
        System.out.println("StringBuilder: " + sb);

        // Integer.parseInt
        int x = Integer.parseInt("123");
        System.out.println("parseInt: " + (x + 7));

        // split
        String recenica = "Marko je student računarskog fakulteta.";
        String[] reci = recenica.split(" ");

        System.out.println("split:");
        for (String rec : reci) {
            System.out.println(rec);
        }

        // replace
        String promenjen = recenica.replace("računarskog fakulteta", "RAF-a");
        System.out.println("replace:: " + promenjen);
    }
}
