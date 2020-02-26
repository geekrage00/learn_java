public class App{
    public static void main(String[] args) {
        // tipe data primitif 
        // char
        char inisial = 'R';

        // char array
        char[] nama = {'R','o','b','y'}; // array dari char
        // ======================================================
        // tipe data komposit /reference
        String firstName = "2";
        String lastName = "1";
        
        System.out.println(firstName+lastName);

        int angka = 10; // int adalah primitif
        Integer num = 12; //Integer adalah komposit, meski sama sama bil. bulat.
    
        System.out.println(angka);
        System.out.println(num);

        String angkaDalamString = String.valueOf(angka); //convert int angka jadi String
        String numDalamString = Integer.toString(angka);
       
        Mobil bmw = new Mobil();
        bmw.merk = "BMW i3000";
        bmw.platNomor = "Z 5453 BC";
        bmw.maju();
        String merk = bmw.getMerk();
        System.out.println(merk);
    }
}

//rancangan mobil
class Mobil{
    // variable / attribut
    String merk;
    String platNomor;
    int jumlahRoda;

    //method / perilaku / behavior /function/prosedur
    void maju(){
        System.out.println(merk + " maju");
    }

    void mundur(){

    }

    String getMerk(){
        return merk;
    }
}
