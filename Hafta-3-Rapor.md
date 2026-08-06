# Ağ Temelleri (Networking)

## 1. IP 

- IP (Internet Protocol), ağ üzerindeki cihazların birbirini tanımasını sağlayan benzersiz adresleme sistemidir.
- İnternete bağlanan her cihazın bir IP adresi bulunur ve bu adres sayesinde veri doğru hedefe yönlendirilir.
- IP adresleri IPv4 ve IPv6 olmak üzere iki temel sürüme ayrılır.
- IP protokolü, verilerin kaynak cihazdan hedef cihaza ulaşmasını sağlayan temel iletişim protokollerinden biridir.


## 2. Port

- Port, bir bilgisayarda çalışan uygulamaların ağ üzerinden veri alışverişi yapmasını sağlayan mantıksal iletişim noktasıdır.
- Aynı IP adresi üzerinde birden fazla uygulama farklı port numaraları kullanarak aynı anda çalışabilir.
- Her servisin varsayılan olarak kullandığı belirli port numaraları bulunur.
- Örneğin HTTP 80, HTTPS 443 ve SSH 22 numaralı portları kullanır.


## 3. DNS (Domain Name System)

- DNS (Domain Name System), alan adlarını IP adreslerine dönüştüren sistemdir.
- Kullanıcıların sayısal IP adreslerini ezberlemek yerine alan adlarını kullanmasını sağlar.
- Bir web sitesi ziyaret edildiğinde DNS sunucusu ilgili alan adının IP adresini bulur ve bağlantının kurulmasına yardımcı olur.
- DNS sistemi internetin daha kolay ve düzenli kullanılmasını sağlayan temel servislerden biridir.


## 4. TCP (Transmission Control Protocol)

- TCP, cihazlar arasında güvenilir veri iletişimi sağlayan bir taşıma katmanı protokolüdür.
- Veri iletilmeden önce bağlantı kurulur ve gönderilen paketlerin eksiksiz şekilde hedefe ulaşması kontrol edilir.
- Eksik veya hatalı paketler yeniden gönderilerek veri bütünlüğü korunur.
- Dosya transferi, e-posta ve web sayfalarının yüklenmesi gibi güvenilir iletişim gerektiren uygulamalarda kullanılır.


## 5. UDP (User Datagram Protocol)

- UDP, hızlı veri iletimi sağlayan bağlantısız bir taşıma katmanı protokolüdür.
- TCP'den farklı olarak paketlerin ulaşıp ulaşmadığını kontrol etmez.
- Bu nedenle daha hızlı çalışırken veri kaybı yaşanma ihtimali bulunur.
- Canlı yayınlar, çevrim içi oyunlar ve görüntülü görüşmeler gibi hızın önemli olduğu uygulamalarda tercih edilir.


## 6. Paket Yapısı (Packet)

- Ağ üzerinden gönderilen veriler paket adı verilen küçük parçalara ayrılarak iletilir.
- Her pakette kaynak adresi, hedef adresi ve veri gibi bilgiler bulunur.
- Paketler ağ üzerinde bağımsız olarak taşınabilir ve hedefte tekrar birleştirilir.
- Paketleme yöntemi sayesinde büyük veriler daha verimli ve güvenilir şekilde iletilebilir.


## 7. Ping

- Ping, iki cihaz arasındaki bağlantının aktif olup olmadığını test etmek için kullanılan ağ komutudur.
- Gönderilen isteğe karşılık alınan yanıt süresi milisaniye (ms) cinsinden ölçülür.
- Ağ bağlantısında gecikme veya erişim problemi olup olmadığını anlamaya yardımcı olur.
- Ağ yöneticileri tarafından en sık kullanılan temel tanılama araçlarından biridir.


## 8. Traceroute

- Traceroute, bir verinin hedefe ulaşıncaya kadar geçtiği ağ cihazlarını gösteren tanılama komutudur.
- Paketlerin izlediği yolu adım adım listeleyerek bağlantı sorunlarının tespit edilmesini sağlar.
- Ağdaki gecikmenin veya kesintinin hangi noktada oluştuğunu belirlemeye yardımcı olur.
- Windows işletim sisteminde "tracert", Linux ve macOS'ta ise "traceroute" komutu kullanılır.


## 9. Nslookup

- Nslookup, DNS sorguları yapmak ve alan adlarının IP adreslerini öğrenmek için kullanılan ağ aracıdır.
- Bir alan adının doğru DNS kayıtlarına sahip olup olmadığını kontrol etmeye yardımcı olur.
- Ağ ve DNS sorunlarının tespit edilmesinde yaygın olarak kullanılır.
- Sistem yöneticileri tarafından DNS yapılandırmalarını doğrulamak amacıyla sıkça tercih edilir.