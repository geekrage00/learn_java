public class Looping{
    public static void main(String[] args){
        /* for(int i = 100; i > 0; i--){
            System.out.println(i);
        } */
        /* String[] hobbies = { "Basket", "Sepak Bola", "Coding", "Dota 2", "Main Tik Tok"};

        for(int i = 0; i <= hobbies.length - 1 ;i++)
        {
            System.out.println(hobbies[i]); //print hobbies di index ke i
        } */

        int angka = 14;
        boolean isPrimeNumber = true;

        for(int i = 2; i <= angka-1;i++){
            if(angka % i == 0){
                isPrimeNumber = false;
                break;
            }
            else{
                isPrimeNumber = true;
            }
        }

        if(isPrimeNumber == true){
            System.out.println(angka+" adalah bilangan prima");
        }else{
            System.out.println(angka+" adalah bukan bilangan prima");
        }
       
    }
}