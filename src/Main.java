import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        //SORU1
        int toplam=0;
        int[] numbers = new int[10];

                System.out.println("10 tane sayı giriniz: ");
                for (int i=0; i<10; i++){
                    numbers[i]= input.nextInt();
                }
                for (int i=0;i<10;i++){
                    toplam+=numbers[i];
                }
                int a= toplam/10;
                System.out.println("Girdiğiniz sayıların ortalaması: "+a);

                System.out.println("50 den büyük sayılar.");
                for (int i=0;i<10;i++){
                    if (numbers[i]>50){
                        System.out.println(numbers[i]);
                    }
                }

        System.out.println("-----------------------------------------");

        //SORU2
        int[] rakamlar = new int[6];

        System.out.println("6 tane rakam giriniz: ");
        for (int i=0; i<6; i++){
            rakamlar[i]=input.nextInt();
        }
        for (int i=0;i<6;i++){
            for (int j=i+1;j<6;j++){
                if (rakamlar[i] == rakamlar[j]){
                    System.out.println("Tekrar edilen rakam/lar: "+rakamlar[i]);
                    break;                }
            }
        }

        System.out.println("-----------------------------------------");

        //SORU3

        int[] sayii = new int[6];
        System.out.println("6 tane pozitif,negatif sayılar giriniz: ");
        for (int i=0;i<6;i++){
            sayii[i]= input.nextInt();
        }
        System.out.println("Negatif sayılar: ");
        for (int i=0;i<6;i++){
            if (sayii[i]<0){
                System.out.println(sayii[i]);
            }
        }
        System.out.println("Pozitif sayılar: ");
        for (int i=0;i<6;i++){
            if (sayii[i]>0){
                System.out.println(sayii[i]);
            }
        }

        System.out.println("-----------------------------------------");

        //SORU4

        ArrayList<Integer> sayi = new ArrayList<>();
        System.out.println("Lütfen 10 sayı girin:");
        for (int i = 0; i < 10; i++) {
            sayi.add(input.nextInt());
        }
        Collections.sort(sayi, Collections.reverseOrder());
        System.out.println("Büyükten küçüğe sıralı: " + sayi);

        System.out.println("-----------------------------------------");

        //SORU5
        ArrayList<String> kelimeler=new ArrayList<>();
        System.out.println("Kelimeleri giriniz: ");
        for (int i=0;i<10;i++) {
            kelimeler.add(input.nextLine());
        }
        Collections.sort(kelimeler);

        System.out.println("Alfabetik sıralama: ");
        for (String kelime :kelimeler){
            System.out.println(kelime);
        }

        System.out.println("-----------------------------------------");

        //SORU6

        ArrayList<Integer> sayilar= new ArrayList<Integer>();
        ArrayList<Integer> ciftsayilar =new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(100); // 0-99 arası rastgele sayı
            sayilar.add(num);
            if (num % 2 == 0) {
                ciftsayilar.add(num);
            }
        }
        System.out.println("Çift sayılar: " + ciftsayilar);

        System.out.println("-----------------------------------------");

        //SORU7
        ArrayList<String> sehir= new ArrayList<>();
        sehir.add("İstanbul");
        sehir.add("Ankara");
        sehir.add("İzmir");
        sehir.add("Bursa");
        sehir.add("Antalya");

        System.out.print("Aramak istediğiniz şehri girin: ");
        String searchCity = input.nextLine();
        boolean found = false;

        for (int i = 0; i < sehir.size(); i++) {
            if (sehir.get(i).equalsIgnoreCase(searchCity)) {
                System.out.println(searchCity + " listede, indeksi: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(searchCity + " listede bulunamadı.");
        }

        System.out.println("-----------------------------------------");

        //SORU8
       /* Random random = new Random();
        ArrayList<Integer> numberss = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        int min = Collections.min(numberss);
        int max = Collections.max(numberss);
        System.out.println("Sayılar: " + numbers);
        System.out.println("En küçük: " + min + ", En büyük: " + max);*/

        System.out.println("-----------------------------------------");

        //SORU9
       ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println("Orijinal liste: " + list);
        System.out.println("get(2): " + list.get(2));
        list.set(2, "Z");
        System.out.println("set(2, 'Z'): " + list);
        list.remove(1);
        System.out.println("remove(1): " + list);
        System.out.println("size(): " + list.size());
        list.clear();
        System.out.println("clear(): " + list);

        System.out.println("-----------------------------------------");


        //SORU10
        int[] array = {5, 3, 8, 1, 9};
        java.util.Arrays.sort(array);
        System.out.println("Arrays.sort(): " + java.util.Arrays.toString(array));
        int index = java.util.Arrays.binarySearch(array, 8);
        System.out.println("Arrays.binarySearch(8): " + index);
        int[] copy = java.util.Arrays.copyOfRange(array, 1, 4);
        System.out.println("Arrays.copyOfRange(1, 4): " + java.util.Arrays.toString(copy));
        boolean isEqual = java.util.Arrays.equals(array, copy);
        System.out.println("Arrays.equals(array, copy): " + isEqual);
        java.util.Arrays.fill(array, 0);
        System.out.println("Arrays.fill(0): " + java.util.Arrays.toString(array));

    }

}
