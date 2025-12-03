public class GameBenchmark {

    String oyunAdi;
    String yapimciFirma;
    String oyunTuru;
    int metaPuani;
    int cikisYili;

    int ramGereksinimi;
    String islemciGereksinimi;
    String ekranKartiGereksinimi;
    int depolamaGereksinimi;
    String windowsSurumu;
    String depolamaTuru;

    public GameBenchmark(String oyunAdi, String yapimciFirma, String oyunTuru, int metaPuani, int cikisYili, int ramGereksinimi, String islemciGereksinimi, String ekranKartiGereksinimi, int depolamaGereksinimi, String windowsSurumu, String depolamaTuru) {

        this.oyunAdi = oyunAdi;
        this.yapimciFirma = yapimciFirma;
        this.oyunTuru = oyunTuru;
        this.metaPuani = metaPuani;
        this.cikisYili = cikisYili;

        this.ramGereksinimi = ramGereksinimi;
        this.islemciGereksinimi = islemciGereksinimi;
        this.ekranKartiGereksinimi = ekranKartiGereksinimi;
        this.depolamaGereksinimi = depolamaGereksinimi;
        this.windowsSurumu = windowsSurumu;
        this.depolamaTuru = depolamaTuru;
    }

    public void gereksinimleriGoster() {

        System.out.println("OYUN BİLGİLERİ\n");
        System.out.println("Seçtiğiniz oyun : " + oyunAdi);
        System.out.println("Oyunu yayımlayan firma : " + yapimciFirma);
        System.out.println("Oyunun piyasaya sürüldüğü tarih : " + cikisYili);
        System.out.println("Oyunun 'Meta Critic puanı' : " + metaPuani);
        System.out.println();

        System.out.println("OYUNUN SİSTEM GEREKSİNİMLERİ\n");
        System.out.println("Önerilen sistem 'RAM' : " + ramGereksinimi);
        System.out.println("Önerilen sistem 'İŞLEMCİ' : " + islemciGereksinimi);
        System.out.println("Önerilen sistem 'EKRAN KARTI' : " + ekranKartiGereksinimi);
        System.out.println("Önerilen sistem 'DEPOLAMA ALANI' : " + depolamaGereksinimi);
        System.out.println("Önerilen sistem 'DEPOLAMA TÜRÜ' : " + depolamaTuru);
        System.out.println("Önerilen sistem 'İŞLETİMİ' : " + windowsSurumu);


    }
}