public class ToplamSistemGucu {

    public double sistemGucu(EkranKartlariVeriMerkezi gelenKart , IslemciVeriMerkezi gelenIslemci) {

        double toplamGuc = (gelenKart.performansDuzeyi + gelenIslemci.performansDuzeyi) / 2.0;
        return toplamGuc;

    }

    public void darbogazHesap(EkranKartlariVeriMerkezi gelenKart , IslemciVeriMerkezi gelenIslemci) {

        if (gelenKart.performansDuzeyi == gelenIslemci.performansDuzeyi) {
            System.out.println("Darboğaz yok");
            System.out.println("Sistem uyumlu çalışıyor");
        } else if (gelenKart.performansDuzeyi - gelenIslemci.performansDuzeyi >= 40) {
            System.out.println("İşlemci %80-%99 arası darboğaz yapıyor");
            System.out.println("Daha iyi performans için işlemcinizi yükseltin");
        } else if (gelenKart.performansDuzeyi - gelenIslemci.performansDuzeyi >=30) {
            System.out.println("İşlemci %60-%80 arasında darboğaz yapıyor");
            System.out.println("Daha iyi performans için işlemcinizi yükseltin");
        } else if (gelenKart.performansDuzeyi - gelenIslemci.performansDuzeyi >=20) {
            System.out.println("İşlemci %40-%60 arasında darboğaz yapıyor");
            System.out.println("Daha iyi performans için işlemcinizi yükseltin");
        } else if (gelenKart.performansDuzeyi - gelenIslemci.performansDuzeyi >=10) {
            System.out.println("İşlemci %20-40% arasında darboğaz yapıyor");
            System.out.println("Daha iyi performans için işlemcinizi yükseltin");
        } else if (gelenKart.performansDuzeyi - gelenIslemci.performansDuzeyi > 0) {
            System.out.println("İşlemci %1-20% arasında darboğaz yapıyor");
            System.out.println("Daha iyi performans için işlemcinizi yükseltin");
        } else if (gelenKart.performansDuzeyi - gelenIslemci.performansDuzeyi <= -40) {
            System.out.println("Ekran kartınız %80-%99 arasında darboğaz yapıyor");
            System.out.println("Daha iyi performans için ekran kartınızı yükseltin");
        } else if (gelenKart.performansDuzeyi - gelenIslemci.performansDuzeyi <= -30) {
            System.out.println("Ekran kartınız %60-%80 arasında darboğaz yapıyor");
            System.out.println("Daha iyi performans için ekran kartınızı yükseltin");
        } else if (gelenKart.performansDuzeyi - gelenIslemci.performansDuzeyi <= -20) {
            System.out.println("Ekran kartınız %40-%60 arasında darboğaz yapıyor");
            System.out.println("Daha iyi performans için ekran kartınızı yükseltin");
        } else if (gelenKart.performansDuzeyi - gelenIslemci.performansDuzeyi <= -10) {
            System.out.println("Ekran kartınız %20-%40 arasında darboğaz yapıyor");
            System.out.println("Daha iyi performans için ekran kartınızı yükseltin");
        } else if (gelenKart.performansDuzeyi - gelenIslemci.performansDuzeyi < 0) {
            System.out.println("Ekran kartınız %1-%20 arasında darboğaz yapıyor");
            System.out.println("Daha iyi performans için ekran kartınızı yükseltin");
        }
    }
}
