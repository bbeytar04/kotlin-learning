fun main() {

// Etkinlik bilgileri
    val etkinlikAdi = "Kotlin Başlangıç Atölyesi"
    val etkinlikKodu = "KOTLIN"
    val etkinlikSehri = "İstanbul"
    val tekBiletUcreti = 350.50
    val indirimOrani = 0.10
    val salonNumarasiMetni = "12"
    val ekHizmetUcretiMetni = "49.90"
    val yemekUcreti = 150.0
    val etkinlikTarihi = "18 Temmuz 2026"

    // Kullanıcı bilgileri
    var katilimciAdi = "Berra"
    var katilimciSoyadi = "Beytar"
    var katilimciYasi = 22
    var katilimciTelefonNo = "05451780906"
    var katilimciEposta = "bbeytar2003@gmail.com"
    var biletSayisi = 2
    val tamAd = katilimciAdi + " " + katilimciSoyadi
    val ogrenciMi = true


    //Ödeme Bilgileri
    var toplamUcret = biletSayisi * tekBiletUcreti
    var indirimMiktari = toplamUcret * indirimOrani
    var odenecekTutar = toplamUcret - indirimMiktari
    var toplamYemekUcreti = yemekUcreti * biletSayisi
    val kayitTamamlandi = true
    val odemeYapildi = false

    //Dönüştürme
    val yasMetni = katilimciYasi.toString()
    val biletSayisiMetni = biletSayisi.toString()
    val salonNumarasi = salonNumarasiMetni.toInt()
    val ekHizmetUcreti = ekHizmetUcretiMetni.toDouble()
    var genelToplam = odenecekTutar + ekHizmetUcreti + toplamYemekUcreti
    var etkinlikKayitKodu = etkinlikKodu + "-" + yasMetni + "-" + biletSayisiMetni + "-" + salonNumarasi
    val genelToplamMetni = genelToplam.toString()


    println("===========================")
    println("  ETKİNLİK KAYIT BELGESİ")
    println("===========================")


    println("Katılımcı: " + tamAd)
    println("Katılımcı E-posta: " + katilimciEposta)
    println("Katılımcı Telefon Numarası: " + katilimciTelefonNo)
    println("Etkinlik Adı: " + etkinlikAdi)
    println("Etkinlik Şehri: " + etkinlikSehri)
    println("Etkinlik Tarihi: " + etkinlikTarihi)
    println("Salon Numarası: " + salonNumarasi)
    println("Katılımcının Yaşı: " + yasMetni)
    println("Katılımcı Öğrenci mi?: " + ogrenciMi)
    println("Bilet Sayısı: " + biletSayisiMetni)
    println("Tek Bilet Ücreti: " + tekBiletUcreti + " TL")
    println("Toplam Bilet Ücreti: " + toplamUcret + " TL")
    println("İndirim Miktarı: " + indirimMiktari + " TL")
    println("İndirimli Tutar: " + odenecekTutar + " TL")
    println("Ek Hizmet Ücreti: " + ekHizmetUcreti + " TL")
    println("Toplam Yemek Ücreti: " + toplamYemekUcreti + " TL")
    println("Genel Toplam: " + genelToplam + " TL")
    println("Kayıt Tamamlandı mı?: " + kayitTamamlandi)
    println("Ücret Ödendi mi?: " + odemeYapildi)
    println("Kayıt Kodu: " + etkinlikKayitKodu)



    println("===========================")
}