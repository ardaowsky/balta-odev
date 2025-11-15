import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {

        float sonuc;
        float sayiA = 22.0f;
        float sayiB = 6.0f;

        sonuc = topla(sayiA, sayiB);
        System.out.println("Toplam: " + sonuc);

        sonuc = fark(sayiA, sayiB);
        System.out.println("Fark: " + sonuc);

        sonuc = carp(sayiA, sayiB);
        System.out.println("Çarpım: " + sonuc);

        sonuc = bol(sayiA, sayiB);
        System.out.println("Bölüm: " + sonuc);

        eskenarUcgenBilgisi(10.0f);
    }

    static float topla(float x, float y){
        return x + y;
    }

    static float fark(float x, float y){
        return x - y;
    }

    static float carp(float x, float y){
        return x * y;
    }

    static float bol(float x, float y){
        return x / y;
    }

    static void eskenarUcgenBilgisi(float kenar){
        float cevre = kenar * 3.0f;
        System.out.println("Üçgenin çevresi: " + cevre);

        float yukseklik = (float) sqrt((kenar * kenar) - ((kenar / 2.0f) * (kenar / 2.0f)));
        float alan = (yukseklik * kenar) / 2.0f;

        System.out.println("Üçgenin alanı: " + alan);
    }
}
