public class IslemciVeriMerkezi {
    String model;
    String bellekTuru;
    int performansDuzeyi;
    int watDegeri;
    int transistorMesafesi;
    int cekirdekSayisi;
    int isParcacigisayisi;
    double temelFrekans;
    double artirilmisFrekans;
    int bellekHizi;
    String l1Bellek;
    String l2Bellek;
    String l3Bellek;

    public IslemciVeriMerkezi(String model, String bellekTuru, int performansDuzeyi, int watDegeri, int transistorMesafesi, int cekirdekSayisi, int isParcacigisayisi, double temelFrekans, double artirilmisFrekans, int bellekHizi, String l1Bellek, String l2Bellek, String l3Bellek) {

        this.model = model;
        this.bellekTuru = bellekTuru;
        this.performansDuzeyi = performansDuzeyi;
        this.watDegeri = watDegeri;
        this.transistorMesafesi = transistorMesafesi;
        this.cekirdekSayisi = cekirdekSayisi;
        this.isParcacigisayisi= isParcacigisayisi;
        this.temelFrekans = temelFrekans;
        this.artirilmisFrekans =artirilmisFrekans;
        this.bellekHizi = bellekHizi;
        this.l1Bellek = l1Bellek;
        this.l2Bellek = l2Bellek;
        this.l3Bellek = l3Bellek;

    }

    public void bilgiGosterIslemci() {

        System.out.println("--------------------");
        System.out.println("İşlemciniz " + model);
        System.out.println("Bellek türü " + bellekTuru);
        System.out.println("Wat değeri " + watDegeri + " W");
        System.out.println("Transistör mesafesi " + transistorMesafesi + " nm" );
        System.out.println("Çekirdek sayısı " + cekirdekSayisi);
        System.out.println("İş parçacığı sayısı " + isParcacigisayisi);
        System.out.println("Temel frekans " + temelFrekans + " GHz");
        System.out.println("Artırılmış frekans " + artirilmisFrekans + " GHz");
        System.out.println("Bellek hızı " + bellekHizi + " MHz");
        System.out.println("L1 önbellek boyutu " + l1Bellek);
        System.out.println("L2 önbellek boyutu " + l2Bellek);
        System.out.println("L3 önbellek boyutu " + l3Bellek);
        System.out.println("Toplam performans puanı " + performansDuzeyi + "/100");
        System.out.println("--------------------");

    }
}