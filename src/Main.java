import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EkranKartlariVeriMerkezi bulunanKart = null;
        IslemciVeriMerkezi bulunanIslemci = null;

        System.out.println("Sisteminizi puanlamamız için , lütfen sırasısyla sistem parçalarınızı giriniz ");

        HashMap<String, EkranKartlariVeriMerkezi> kartKutuphanesi = new HashMap<>();

        kartKutuphanesi.put("RTX 2060", new EkranKartlariVeriMerkezi("Nvidia RTX 2060", "GDDR6", 44, 160, 6, 1920, 12, 192, 1, 1750));
        kartKutuphanesi.put("RTX 2070", new EkranKartlariVeriMerkezi("Nvidia RTX 2070", "GDDR6", 46, 185, 8, 2304, 12, 256, 1, 1750));
        kartKutuphanesi.put("RTX 2080", new EkranKartlariVeriMerkezi("Nvidia RTX 2080", "GDDR6", 48, 215, 8, 2944, 12, 256, 2, 1800));
        kartKutuphanesi.put("RTX 3050", new EkranKartlariVeriMerkezi("Nvidia RTX 3050", "GDDR6", 44, 130, 8, 2560, 8, 128, 1, 1822));
        kartKutuphanesi.put("RTX 3060", new EkranKartlariVeriMerkezi("Nvidia RTX 3060", "GDDR6", 45, 170, 8, 3584, 8, 128, 1, 1850));
        kartKutuphanesi.put("RTX 3070", new EkranKartlariVeriMerkezi("Nvidia RTX 3070", "GDDR6", 53, 220, 8, 5888, 8, 256, 2, 1815));
        kartKutuphanesi.put("RTX 3080", new EkranKartlariVeriMerkezi("Nvidia RTX 3080", "GDDR6X", 62, 370, 10,8704, 8, 370, 4, 1905));
        kartKutuphanesi.put("RTX 3090", new EkranKartlariVeriMerkezi("Nvidia RTX 3090", "GDDR6X", 66, 350, 24,10496, 8, 384, 4, 1740));
        kartKutuphanesi.put("RTX 4060", new EkranKartlariVeriMerkezi("Nvidia RTX 4060", "GDDR6", 52, 115, 8, 3072, 5, 128, 1, 2125));
        kartKutuphanesi.put("RTX 4070", new EkranKartlariVeriMerkezi("Nvidia RTX 4070", "GDDR6X", 60, 200, 12, 5888, 5, 192, 2, 2508));
        kartKutuphanesi.put("RTX 4080", new EkranKartlariVeriMerkezi("Nvidia RTX 4080", "GDDR6X", 69, 320, 16, 9728, 5, 256, 4, 2655));
        kartKutuphanesi.put("RTX 4090", new EkranKartlariVeriMerkezi("Nvidia RTX 4090", "GDDR6X", 80, 450, 24, 16384, 4, 384, 4, 2595));
        kartKutuphanesi.put("RTX 5050", new EkranKartlariVeriMerkezi("Nvidia RTX 5050", "GDDR6", 53, 130, 8, 2560, 5, 128, 1, 2587));
        kartKutuphanesi.put("RTX 5060", new EkranKartlariVeriMerkezi("Nvidia RTX 5060", "GDDR7", 58, 145, 8, 3840, 4, 128, 2, 2600));
        kartKutuphanesi.put("RTX 5070", new EkranKartlariVeriMerkezi("Nvidia RTX 5070", "GDDR7", 67, 250, 12, 6144, 4, 192, 4, 2715));
        kartKutuphanesi.put("RTX 5080", new EkranKartlariVeriMerkezi("Nvidia RTX 5080", "GDDR7", 77, 360, 16, 10752, 4, 256, 4, 2730));
        kartKutuphanesi.put("RTX 5090", new EkranKartlariVeriMerkezi("Nvidia RTX 5090", "GDDR7", 95, 575, 32, 21760, 4, 512, 8, 2610));


        System.out.println("Sorgulamak istediğiniz ekran kartı modelini girin , örnek : RTX 3060 , RTX 4060 ");

        while (true) {
            String girilenKartmodeli = scanner.nextLine().strip().toUpperCase();

            if (kartKutuphanesi.containsKey(girilenKartmodeli)) {
                bulunanKart = kartKutuphanesi.get(girilenKartmodeli);
                bulunanKart.bilgiGosterEkranKarti();
                break;
            } else {
                System.out.println("Sistemde böyle bir ekran kartı yok , lütfen tekrar deneyiniz");
                System.out.println("Örnek : RTX 2080 , RTX 3060 , RTX 4090");
                System.out.print("Tekrar deneyin > ");
            }
        }
        HashMap<String, IslemciVeriMerkezi> islemciKutuphanesi = new HashMap<>();

        islemciKutuphanesi.put("Intel Core i3-12100", new IslemciVeriMerkezi("Intel core i3-12100","DDR5",50,60,10,4,8,3.3,4.3,4800,"320 KB","5 MB","12 MB"));
        islemciKutuphanesi.put("Intel Core i5-12600", new IslemciVeriMerkezi("Intel core i5-12600","DDR5",56,65,10,6,12,3.3,4.8,4800,"448 KB","7.5 MB","18 MB"));
        islemciKutuphanesi.put("Intel Core i5-12600K", new IslemciVeriMerkezi("Intel core i5-12600K","DDR5",62,125,10,10,16,3.7,4.9,4800,"864 KB","9.5 MB","20 MB"));
        islemciKutuphanesi.put("Intel Core i7-12700", new IslemciVeriMerkezi("Intel core i7-12700","DDR5",60,65,10,12,20,2.1,4.9,4800,"900 KB","15 MB","25 MB"));
        islemciKutuphanesi.put("Intel Core i7-12700K", new IslemciVeriMerkezi("Intel core i7-12700K","DDR5",66,125,10,12,20,3.6,5.0,4800,"900 KB","15 MB","25 MB"));
        islemciKutuphanesi.put("Intel Core i9-12900", new IslemciVeriMerkezi("Intel core i7-12900","DDR5",64,65,10,16,24,2.4,5.1,4800,"1.375 MB","14 MB","30 MB"));
        islemciKutuphanesi.put("Intel Core i9-12900K", new IslemciVeriMerkezi("Intel core i9-12900K","DDR5",70,125,10,16,24,3.2,5.2,4800,"1.375 MB","14 MB","30 MB"));
        islemciKutuphanesi.put("Intel Core i3-13100", new IslemciVeriMerkezi("Intel core i3-13100","DDR5",52,60,10,4,8,3.4,4.5,4800,"320 KB","5 MB","12 MB"));
        islemciKutuphanesi.put("Intel Core i5-13600", new IslemciVeriMerkezi("Intel core i5-13600","DDR5",66,65,10,14,20,2.7,5.0,4800,"1.125 MB","11.5 MB","24 MB"));
        islemciKutuphanesi.put("Intel Core i5-13600K", new IslemciVeriMerkezi("Intel core i5-13600K","DDR5",70,125,10,14,20,3.5,5.1,5600,"1.125 MB","20 MB","24 MB"));
        islemciKutuphanesi.put("Intel Core i7-13700", new IslemciVeriMerkezi("Intel core i7-13700","DDR5",66,65,10,16,24,2.1,5.2,5600,"1.375 MB","24 MB","30 MB"));
        islemciKutuphanesi.put("Intel Core i7-13700K", new IslemciVeriMerkezi("Intel core i7-13700K","DDR5",76,125,10,16,24,3.4,5.4,5600,"1.375 MB","24 MB","30 MB"));
        islemciKutuphanesi.put("Intel Core i9-13900", new IslemciVeriMerkezi("Intel core i9-13900","DDR5",78,65,10,24,32,2.0,5.6,5600,"1.9 MB","32 MB","36 MB"));
        islemciKutuphanesi.put("Intel Core i9-13900K", new IslemciVeriMerkezi("Intel core i9-13900K","DDR5",86,125,10,24,32,3.9,5.8,5600,"1.9 MB","32 MB","36 MB"));
        islemciKutuphanesi.put("Intel Core i3-14100", new IslemciVeriMerkezi("Intel core i3-14100","DDR5",52,60,10,4,8,3.5,4.7,4800,"320 KB","5 MB","12 MB"));
        islemciKutuphanesi.put("Intel Core i5-14600", new IslemciVeriMerkezi("Intel core i5-14600","DDR5",66,65,10,14,20,2.7,5.2,5600,"1.1 MB","20 MB","24 MB"));
        islemciKutuphanesi.put("Intel Core i5-14600K", new IslemciVeriMerkezi("Intel core i5-14600K","DDR5",72,125,10,14,20,3.5,5.3,5600,"1.1 MB","20 MB","24 MB"));
        islemciKutuphanesi.put("Intel Core i7-14700", new IslemciVeriMerkezi("Intel core i7-14700","DDR5",72,65,10,20,28,2.1,5.4,5600,"1.6 MB","28 MB","33 MB"));
        islemciKutuphanesi.put("Intel Core i7-14700K", new IslemciVeriMerkezi("Intel core i7-14700K","DDR5",82,125,10,20,28,3.4,5.6,5600,"1.8 MB","28 MB","33 MB"));
        islemciKutuphanesi.put("Intel Core i9-14900", new IslemciVeriMerkezi("Intel core i9-14900","DDR5",78,65,10,24,32,2.0,5.8,5600,"1.9 MB","32 MB","36 MB"));
        islemciKutuphanesi.put("Intel Core i9-14900K", new IslemciVeriMerkezi("Intel core i9-14900K","DDR5",88,125,10,24,32,3.2,6.0,5600,"1.9 MB","32 MB","36 MB"));
        islemciKutuphanesi.put("Intel Core i9-14900KS", new IslemciVeriMerkezi("Intel core i9-14900KS","DDR5",90,150,10,24,32,3.2,6.2,5600,"1.9 MB","32 MB","36 MB"));

            System.out.println("Sorgulamak istediğniz işlemci modelini girin , örnek : Intel Core i3-12100 , Intel Core i7-13700K ");

        while (true) {
            String girilenIsLemcimodeli = scanner.nextLine().strip();

        if (islemciKutuphanesi.containsKey(girilenIsLemcimodeli)) {
            bulunanIslemci = islemciKutuphanesi.get(girilenIsLemcimodeli);
            bulunanIslemci.bilgiGosterIslemci();
            break;
         } else {
            System.out.println("Sistemde böyle bir işlemci yok , lütfen tekrar deneyiniz");
            System.out.println("Örnek : Intel Core i3-14100 , Intel Core i9-12900 , Intel Core i9-14900K  ");
            System.out.print("Tekrar deneyin > ");
         }
        }
            System.out.println("Sisteminizin toplam performans puanı");

        ToplamSistemGucu sistemGuc = new ToplamSistemGucu();
        sistemGuc.sistemGucu(bulunanKart , bulunanIslemci);

            double gucSonucu = sistemGuc.sistemGucu(bulunanKart , bulunanIslemci);

            System.out.println(gucSonucu);
            System.out.println("--------------------");

            System.out.println("Sisteminizin darboğaz hesabı\n");

        sistemGuc.darbogazHesap(bulunanKart , bulunanIslemci);


            HashMap<String, OyunBilgileri> benchmarkKutuphanesi = new HashMap<>();

        System.out.println("\n--------------------------------------------------------");
        System.out.println("Sistem gereksinimlerini öğrenmek istediğiniz oyunu giriniz");

            benchmarkKutuphanesi.put("The Last Of Us Remake", new OyunBilgileri("The Last OF Us", "Naughty Dog", "Aksiyon - Hayatta Kalma", 97, 2024, 32, "Intel Core i7 11400k", "RTX 3060", 80, "Windows 11", "SSD"));
            benchmarkKutuphanesi.put("Red Redemption 2", new OyunBilgileri("Red Redemption 2", "Rockstar Games", "Açık Dünya - Aksiyon", 97, 2018, 16, "Intel Core i7 9920k", "RTX 2060", 130, "Windows 10", "SSD-HDD"));
            benchmarkKutuphanesi.put("God Of War", new OyunBilgileri("God Of War", "Sony Santa Monica", "Aksiyon - Macera", 94, 2018, 16, "Intel Core i7 10770k", "RTX 2060", 70, "Windows 10", "SSD-HDD"));
            benchmarkKutuphanesi.put("Cyberpunk 2077", new OyunBilgileri("Cyberpunk 2077", "CD Project Red", "Açık Dünya - Aksiyon - Rol Yapma", 86, 2019, 32, "Intel Core i7 11770k", "RTX 4060", 90, "Windows 11", "SSD"));
            benchmarkKutuphanesi.put("Cities Skylines 2", new OyunBilgileri("Cities Skylines 2", "Colossal Order", "Strateji - İnşa", 75, 2023, 32 - 64, "Intel Core i7 13900k", "RTX 5060", 60, "Windows 11", "SSD"));

        while (true) {
            String gameName = scanner.nextLine().strip();

            if (benchmarkKutuphanesi.containsKey(gameName)) {
                OyunBilgileri bulunanOyun = benchmarkKutuphanesi.get(gameName);
                bulunanOyun.gereksinimleriGoster();
                break;
            } else {
                System.out.println("Sistemde böyle oyun yok lütfen tekrar giriniz");
                System.out.println("Örnek : The Last Of Us Remake , Red Redemption 2 , Cities Skylines 2");
            }
          }
        }
    }
