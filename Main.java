import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yas = 19;
        String ad = "ozan";
        String soyad = "kocaer";
        String sinifi = "bilgisayar teknolojisi";
        String memleket = "erzincan";

        System.out.println(yas);
        System.out.println(ad);
        System.out.println(soyad);
        System.out.println(sinifi);
        System.out.println(memleket);

        Scanner scn = new Scanner(System.in);
        System.out.println("İsim Giriniz");
        String h = scn.nextLine();

        System.out.println("Yasinizi Giriniz");
        int key = scn.nextInt();
        if (key > 18) {
            System.out.println("Ehliyet Alabilisiniz");
        } else {
            System.out.println("Ehliyet Alamazsiniz");
        }


        int i=0;
            while(i<10)
            {
                System.out.println(i);
                     i++;
             }


   }




}