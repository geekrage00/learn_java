public class Logika{
    public static void main(String[] args) {
        boolean isRain = true;
        boolean isUmbrellaAvail = true;

        //AND
        if(isRain && isUmbrellaAvail) { // jika isRain AND isUmbrellaAvail
            System.out.println("Boleh keluar rumah");
        }
        else if(isRain && isUmbrellaAvail == false){
            System.out.println("hujan, tidak ada payung, gak boleh keluar rumah");
        }
        else if(isRain == false && isUmbrellaAvail) {
            System.out.println("boleh keluar rumah mau ada payung ada payung atau ennga");
        }
        else{
            System.out.println("meski gak ada payung, boleh keluar rumah karena tidak hujan");
        }

        // OR
        if(isRain || isUmbrellaAvail == false){
            System.out.println("tidak boleh keluar rumah");
        }
        else{
            System.out.println("boleh keluar rumah");
        }
    }
}