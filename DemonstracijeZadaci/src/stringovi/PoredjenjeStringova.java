package stringovi;

public class PoredjenjeStringova {
    public static void main(String[] args) {
        // String pool
        String str1 = "string1";
        String str2 = "string1";
        String str3 = "string2";
        // Memory heap
        String str4 = new String("string1");

        // equals poređenje (vrednost)
        boolean str1EqualsStr3 = str1.equals(str3);
        boolean str1EqualsStr2 = str1.equals(str2);

        System.out.println("Da li je str1 jednak str3 po vrednosti (equals)? " + str1EqualsStr3);
        System.out.println("Da li je str1 jednak str2 po vrednosti (equals)? " + str1EqualsStr2);

        // == poređenje (referenca)
        boolean str1JednakoStr2 = str1 == str2;
        boolean str1JednakoStr3 = str1 == str3;
        boolean str1JednakoStr4 = str1 == str4;

        System.out.println("Da li str1 i str2 pokazuju na isti objekat u memoriji (==)? " + str1JednakoStr2);
        System.out.println("Da li str1 i str3 pokazuju na isti objekat u memoriji (==)? " + str1JednakoStr3);
        System.out.println("Da li str1 i str4 pokazuju na isti objekat u memoriji (==)? " + str1JednakoStr4);
    }
}
