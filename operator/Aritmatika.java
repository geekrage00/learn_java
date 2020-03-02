public class Aritmatika{
    public static void main(String[] args){
        //Operator Aritmatika
        // +
        System.out.println(2+2); //4
        int x = 10;
        final int Y = 12;
        System.out.println(x+Y);

        final double PI = 3.14;
        double luasLingkaran = PI*x*x;
        System.out.println(luasLingkaran);
        double t = 18;
        double volumeTabung = (PI * x * x) * t;

        System.out.println(volumeTabung);

        // modulus % -> sisa hasil bagi

        int a = 5;
        int b = 2;
        int mod = a%b;
        System.out.println(mod);

        // ++ incremental => +1
        System.out.println("var a isinya sekarang adalah "+a); //5
        a++;
        // -- decremental => -1
        System.out.println("var b isinya sekarang adalah "+ (--b));
        //
    }
}