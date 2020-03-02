public class Perbandingan{
    public static void main(String[] args) {
        // Operator yang digunakan untuk membandingkan dua buah data

        // == sama dengan
        // != tidak sama dengan
        // > lebih dari
        // < kurang dari
        // >= lebih dari sama dengan
        // <= kurang dari sama dengan

        boolean a = true;
        boolean b = false;

        System.out.println(a == b); // false
        System.out.println(a != b); // true

        String x = "Test";
        String y = "test";
        System.out.println(x.equals(y)); // false
        System.out.println(!x.equals(y)); // false

        System.out.println(x.equalsIgnoreCase(y)); //true
        

    }
}