package homework3q2;
//    isPrimeX metodu içerisinde, gönderilen argumanın asal olup olmadığı test edilecek, eğer sayı asal ise bu kez sayının
//basamak değerleri toplanarak elde edilen sayının asal olup olmadığı test edilecektir. Bu işleme sonuçta tek basamaklı bir
//sayı kalana kadar devam edilecektir. Eğer en son elde edilen tek basamaklı sayı dahil tüm sayılar asal ise isPrimeX metodu
//true değerine geri dönecektir. Eğer herhangi bir kademede asal olmayan bir sayı elde edilirse metot false değerine geri
////dönecektir

public class Homework3Q2 {

    public static boolean isPrimeX(int sayi) {
        sayi = 997;
        int sayi2 = 0;
        boolean isSayiPrime = true;
        boolean isSayi2Prime = true;
        for (int i = 2; i < (sayi / 2); i++) {
            if (sayi % i == 0) {
                isSayiPrime = false;
                break;
            }
        }
        if (isSayiPrime) {
            System.out.println(sayi + " is a prime number.");
            for (int i = sayi; i != 0; i /= 10) {
                sayi2 += i % 10;
            }
        } else {
            System.out.println(sayi + " is not a prime number.");
        }

        if (sayi2 < 10 && isSayiPrime) {
            for (int i = 2; i < sayi2; i++) {
                if (sayi2 % i == 0) {
                    isSayi2Prime = false;
                    break;
                } else if (isSayi2Prime) {
                    isSayi2Prime = true;
                    break;
                }

            }
            System.out.println(sayi2 + " is a prime number.");

        } else if (sayi2 > 9 && isSayi2Prime) {
            for (int i = 2; i < (sayi2 / 2); i++) {
                if (sayi2 % i == 0) {
                    isSayi2Prime = false;
                    break;
                }
            }
        }

        if (!isSayi2Prime) {
            System.out.println(sayi2 + " is not a prime number.");
        } else if (isSayiPrime) {
            isSayi2Prime = true;
        }

        return isSayi2Prime;

    }

    public static void main(String[] args) {
        isPrimeX(113);
    }

}
