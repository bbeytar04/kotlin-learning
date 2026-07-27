//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val toplamKapasite = 300
    var mevcutAracSayisi = 15
    val sarjNoktasiSayisi = 20
    val gunlukMaksimumGelirHedefi = 40000.0
    var kullanilanSarjNoktasi = 0

    //Araç Bilgileri
    val plakalar = arrayListOf(
        "06EOT273",
        "34ABC123",
        "35XYZ456",
        "16BRS101",
        "07ANT555",
        "41KOC789",
        "06ANK202",
        "34IST909",
        "35EGE808",
        "42KNY111",
        "01ADA444",
        "55SMS222",
        "61TRB333",
        "38KYS777",
        "26ESK888"
    )

    val aracTurleri = arrayListOf(
        "Otomobil",
        "Motosiklet",
        "Minibüs",
        "Elektrikli Araç",
        "Otomobil",
        "Minibüs",
        "Otomobil",
        "Motosiklet",
        "Elektrikli Araç",
        "Otomobil",
        "Minibüs",
        "Otomobil",
        "Motosiklet",
        "Elektrikli Araç",
        "Otomobil"
    )

    val girisSaatleri = arrayListOf(
        8,
        9,
        10,
        11,
        12,
        13,
        14,
        15,
        8,
        7,
        16,
        18,
        19,
        20,
        21
    )

    val cikisSaatleri = arrayListOf(
        9,
        11,
        13,
        15,
        17,
        19,
        21,
        23,
        17,
        20,
        15,
        22,
        20,
        22,
        23
    )

    val aboneMi = arrayListOf(
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        false,
        true
    )

    val elektrikliMi = arrayListOf(
        false,
        false,
        false,
        true,
        false,
        false,
        false,
        false,
        true,
        false,
        false,
        false,
        false,
        true,
        false
    )

    val yasakliPlakalar = setOf(
        "34ABC123",
        "16BRS101",
        "55SMS222"
    )

    val supheliAraclar = arrayListOf<String>()


    val saatlikUcretler = mapOf(
        "Otomobil" to 50,
        "Motosiklet" to 25,
        "Minibüs" to 80,
        "Elektrikli Araç" to 40
    )

    var gunlukToplamGelir = 0
    var gelenAracSayisi = 0
    var reddedilenAracSayisi = 0
    var enYuksekDolulukOrani = 0.0

    val aracTuruGelirleri = hashMapOf(
        "Otomobil" to 0,
        "Motosiklet" to 0,
        "Minibüs" to 0,
        "Elektrikli Araç" to 0
    )

    for(i in 0..14){
        val plaka = plakalar[i]
        val aracTuru = aracTurleri[i]
        val girisSaati = girisSaatleri[i]
        val cikisSaati = cikisSaatleri[i]
        val abone = aboneMi[i]
        val elektrikli = elektrikliMi[i]


        if (mevcutAracSayisi >= toplamKapasite) {
            reddedilenAracSayisi++
            println("$plaka -> Otopark dolu. Giriş reddedildi.")
        }
        else if (plaka in yasakliPlakalar) {
            reddedilenAracSayisi++
            println("$plaka -> Yasaklı araç. Giriş reddedildi.")

            if (plaka !in supheliAraclar) {
                supheliAraclar.add(plaka)
            }
        }
        else if (elektrikli && kullanilanSarjNoktasi >= sarjNoktasiSayisi) {
            reddedilenAracSayisi++
            println("$plaka -> Şarj noktası dolu. Giriş reddedildi.")
        }
        else {
            println("$plaka -> Giriş onaylandı.")

            gelenAracSayisi++

            mevcutAracSayisi++

            if(elektrikli){
                kullanilanSarjNoktasi++
            }

            val parkSuresi = cikisSaati - girisSaati

            if(parkSuresi > 12){
                println("$plaka -> 12 saatten fazla park etmiş.")

                if (plaka !in supheliAraclar) {
                    supheliAraclar.add(plaka)
                }
            }

            if (cikisSaati < girisSaati) {
                println("$plaka -> Çıkış saati giriş saatinden küçük.")

                if (plaka !in supheliAraclar) {
                    supheliAraclar.add(plaka)
                }
            }

            if (parkSuresi < 0) {
                println("$plaka -> Park süresi negatif.")

                if (plaka !in supheliAraclar) {
                    supheliAraclar.add(plaka)
                }
            }

            when (parkSuresi) {
                in 0..1 -> {
                    println("Kategori: Kısa Süreli")
                }

                in 2..4 -> {
                    println("Kategori: Normal")
                }

                in 5..8 -> {
                    println("Kategori: Uzun Süreli")
                }

                else -> {
                    println("Kategori: Çok Uzun Süreli")
                }
            }

            var toplamUcret = parkSuresi * saatlikUcretler[aracTuru]!!
            val dolulukOrani = (mevcutAracSayisi.toDouble() / toplamKapasite) * 100

            if (dolulukOrani > enYuksekDolulukOrani) {
                enYuksekDolulukOrani = dolulukOrani
            }

            if (dolulukOrani >= 0 && dolulukOrani <= 50) {

            }
            else if (dolulukOrani <= 75) {
                toplamUcret += (toplamUcret * 0.1).toInt()
            }
            else if (dolulukOrani <= 90) {
                toplamUcret += (toplamUcret * 0.25).toInt()
            }
            else {
                toplamUcret += (toplamUcret * 0.5).toInt()
            }

            when(aracTuru){
                "Otomobil" -> {
                    //Ücreti aynı olacak
                }

                "Motosiklet" -> {
                    if(parkSuresi <= 1){
                        toplamUcret = 0
                    }
                }

                "Minibüs" -> {
                    toplamUcret = toplamUcret + (toplamUcret * 0.2).toInt()
                }

                "Elektrikli Araç" -> {
                    toplamUcret = toplamUcret - (toplamUcret * 0.1).toInt()
                }
            }

            if(abone){
                toplamUcret = toplamUcret - (toplamUcret * 0.3).toInt()
            }
            if(toplamUcret < 0){
                toplamUcret = 0
            }

            gunlukToplamGelir += toplamUcret
            aracTuruGelirleri[aracTuru] = aracTuruGelirleri[aracTuru]!! + toplamUcret

            println("$plaka -> Park Süresi: $parkSuresi saat -> Toplam Ücret: $toplamUcret TL")


            mevcutAracSayisi--
            if(elektrikli){
                kullanilanSarjNoktasi--
            }
        }
    }
    println("\nŞüpheli Araçlar:")
    println(supheliAraclar)

    println("Günlük Toplam Gelir: $gunlukToplamGelir TL")

    var enFazlaGelir = 0
    var enFazlaGelirTuru = ""

    println("\nAraç Türüne Göre Gelirler:")
    for ((tur, gelir) in aracTuruGelirleri) {
        if (gelir > enFazlaGelir) {
            enFazlaGelir = gelir
            enFazlaGelirTuru = tur
        }
        println("$tur: $gelir TL")
    }
    println("\nEn Fazla Gelir Getiren Araç Türü: $enFazlaGelirTuru")
    println("Toplam Gelir: $enFazlaGelir TL")

    var simuleAracSayisi = mevcutAracSayisi

    while (simuleAracSayisi < toplamKapasite) {
        simuleAracSayisi++
        println("Otoparktaki araç sayısı: $simuleAracSayisi")
    }

    println("OTOPARK DOLU - YENİ ARAÇ KABUL EDİLEMİYOR")



    println("\n========== AKILLI OTOPARK GÜN SONU RAPORU ==========")

    println("Toplam Kapasite: $toplamKapasite")
    println("Gün İçinde Gelen Araç: $gelenAracSayisi")
    println("Reddedilen Araç: $reddedilenAracSayisi")
    println("\nToplam Gelir: $gunlukToplamGelir TL")

    println("\nAraç Türlerine Göre Gelir:")
    for ((tur, gelir) in aracTuruGelirleri) {
        println("$tur: $gelir TL")
    }

    println("\nEn Fazla Gelir:")
    println("$enFazlaGelirTuru ($enFazlaGelir TL)")

    println("\nEn Yüksek Doluluk Oranı:")
    println("%${enYuksekDolulukOrani.toInt()}")

    println("\nŞüpheli Araç Sayısı: ${supheliAraclar.size}")

    println("\nŞüpheli Araçlar:")
    for (plaka in supheliAraclar) {
        println(plaka)
    }

    println("\nGünlük Gelir Hedefi: ${gunlukMaksimumGelirHedefi.toInt()} TL")

    println("Sonuç:")

    if (gunlukToplamGelir >= gunlukMaksimumGelirHedefi) {
        println("HEDEFE ULAŞILDI")
    } else {
        println("HEDEFİN ALTINDA")
    }


}