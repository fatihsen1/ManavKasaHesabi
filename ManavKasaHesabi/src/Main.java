/*

Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
 */




import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double Armut,Elma,Domates,Muz,Patlican;
        double toplamTutar;

        System.out.print("Armut kaç kilo aldınız:");
        Armut = input.nextDouble();
        System.out.print("Elma kaç kilo aldınız:");
        Elma = input.nextDouble();
        System.out.print("Domates kaç kilo aldınız:");
        Domates = input.nextDouble();
        System.out.print("Muz kaç kilo aldınız:");
        Muz = input.nextDouble();
        System.out.print("Patlıcan kaç kilo aldınız:");
        Patlican = input.nextDouble();

        toplamTutar = ((Armut*2.14)+(Elma*3.67)+(Domates*1.11)+(Muz*0.95)+(Patlican*5.00));
        System.out.print("Toplam Tutar:" + toplamTutar);
















    }
}