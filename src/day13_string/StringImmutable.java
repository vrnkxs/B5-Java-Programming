package day13_string;

public class StringImmutable {
    public static void main(String[] args) {
        String word1 = "Loop";
        String word2 = "Loop";

        System.out.println(word1);
        System.out.println(word2);

        word1 = word1 + "camp";  //"Loop" + "camp"  -> "Loopcamp" (new string in string pool, instead of changing the original one, because String is IMMUTABLE)

        System.out.println("--------------");
        System.out.println(word1);
        System.out.println(word2);

        String word3 = "LOOP";
        System.out.println(word3);
        word3 = word3 + "!";
        System.out.println(word3);
        word2 = "apple";

        String word4 = new String("Wed");
        word4 = "Wednesday"; //don't have the acces to "Wed" anymore; created new object - :Wednesday
        word4 = new String("Wednesday");
        word4 = new String("Wednesday"); //still creating a new one in HEAP, because it was created with new keyword

        //IMMUTABLE -> once the String object is created, it cannot be modified


    }
}
