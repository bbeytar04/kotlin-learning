# Dosya Sistemleri ve Depolama Mantığı

## 1. NTFS

- NTFS (New Technology File System), Microsoft tarafından geliştirilen ve özellikle Windows işletim sistemlerinde kullanılan bir dosya sistemidir.
- Dosya ve klasörlerin depolama aygıtı üzerinde düzenlenmesini ve yönetilmesini sağlar.
- Dosya izinleri, şifreleme ve büyük dosya desteği gibi gelişmiş özelliklere sahiptir.
- Günümüzde Windows işletim sistemlerinde kullanılan temel dosya sistemlerinden biridir.


## 2. ext4

- ext4 (Fourth Extended File System), özellikle Linux işletim sistemlerinde yaygın olarak kullanılan bir dosya sistemidir.
- Dosya ve klasörlerin disk üzerinde düzenli bir şekilde saklanmasını ve yönetilmesini sağlar.
- Büyük dosyaları ve yüksek kapasiteli depolama alanlarını destekler.
- Kararlılığı ve performansı nedeniyle birçok Linux dağıtımında tercih edilir.


## 3. APFS

- APFS (Apple File System), Apple tarafından geliştirilen ve Apple cihazlarında kullanılan bir dosya sistemidir.
- Özellikle SSD ve flash tabanlı depolama teknolojileri düşünülerek geliştirilmiştir.
- Şifreleme, veri bütünlüğü ve depolama alanının verimli kullanılması gibi özellikler sunar.
- macOS, iOS ve diğer Apple işletim sistemlerinde kullanılan temel dosya sistemidir.


## 4. NTFS – ext4 – APFS Farkları

- NTFS daha çok Windows, ext4 Linux ve APFS Apple işletim sistemlerinde kullanılır.
- Üç dosya sistemi de dosyaların depolama aygıtı üzerinde düzenlenmesini ve yönetilmesini sağlar.
- NTFS Windows sistemleriyle, ext4 Linux sistemleriyle ve APFS Apple cihazlarıyla uyumlu olacak şekilde geliştirilmiştir.
- APFS özellikle SSD ve flash depolama için tasarlanırken NTFS ve ext4 farklı depolama aygıtlarında yaygın olarak kullanılabilir.


## 5. Blok Yapısı

- Depolama aygıtlarında veriler belirli büyüklükteki bloklar halinde saklanır.
- Bir dosya kaydedildiğinde dosyanın verileri uygun bloklara yerleştirilir.
- Dosya sistemi hangi blokların kullanıldığını ve hangi blokların boş olduğunu takip eder.
- Blok yapısı, verilerin depolama alanında düzenli şekilde saklanmasını ve gerektiğinde tekrar bulunmasını sağlar.


## 6. HDD (Hard Disk Drive)

- HDD, verileri manyetik diskler üzerinde saklayan bir depolama teknolojisidir.
- İçerisinde dönen disk plakaları ve verileri okumak veya yazmak için hareket eden bir okuma-yazma kafası bulunur.
- Veriye ulaşmak için mekanik parçaların hareket etmesi gerektiğinden erişim süresi SSD'lere göre daha uzundur.
- Genellikle yüksek depolama kapasitesini daha düşük maliyetle sunması nedeniyle tercih edilir.


## 7. SSD (Solid State Drive)

- SSD, verileri flash bellek üzerinde saklayan ve hareketli mekanik parça içermeyen bir depolama teknolojisidir.
- Verilere elektronik olarak erişildiği için okuma ve yazma işlemleri HDD'lere göre daha hızlı gerçekleştirilebilir.
- Hareketli parçalarının bulunmaması daha sessiz çalışmasını ve fiziksel darbelere karşı daha dayanıklı olmasını sağlar.
- İşletim sisteminin açılması, programların çalıştırılması ve dosyalara erişim gibi işlemlerde yüksek performans sağlar.


## 8. HDD ve SSD Farkları

- HDD verileri manyetik ve mekanik bir sistemle saklarken SSD flash bellek kullanır.
- HDD'de hareketli parçalar bulunurken SSD'de hareketli mekanik parçalar bulunmaz.
- SSD'lerde verilere elektronik olarak erişildiği için okuma ve yazma hızları genellikle HDD'lerden daha yüksektir.
- HDD'ler genellikle daha düşük maliyetle yüksek depolama kapasitesi sunarken SSD'ler hız ve erişim süresi açısından avantaj sağlar.