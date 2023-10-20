package day01;
import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double armut=2.14, elma=3.67, domates=1.11,patlican=5.00,muz=0.95;
        double armutKilo,elmaKilo,domatesKilo,patlicanKilo,muzKilo,toplam;
        Scanner input=new Scanner(System.in);

        System.out.println("kaç kilo armut aldınız?: ");
        armutKilo=input.nextDouble();

        System.out.println("kaç kilo elma aldınız?: ");
        elmaKilo=input.nextDouble();

        System.out.println("kaç kilo domates aldınız?: ");
        domatesKilo=input.nextDouble();

        System.out.println("kaç kilo patlıcan aldınız?: ");
        patlicanKilo=input.nextDouble();

        System.out.println("kaç kilo muz aldınız?: ");
        muzKilo=input.nextDouble();

        toplam=(armut*armutKilo)+(elma*elmaKilo)+(domates*domatesKilo)+(patlican*patlicanKilo)+(muz*muzKilo);
        System.out.println("toplam tutar: "+toplam);

    }
}
