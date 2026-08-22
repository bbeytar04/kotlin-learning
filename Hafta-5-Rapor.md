# Linux Temelleri

## 1. Linux Terminali

- Linux terminali, işletim sistemiyle komutlar aracılığıyla iletişim kurmayı sağlayan bir ortamdır.
- Dosya ve klasör işlemleri, program çalıştırma ve sistem yönetimi gibi birçok işlem terminal üzerinden gerçekleştirilebilir.
- Terminal kullanımı özellikle yazılım geliştirme, sunucu yönetimi ve sistem işlemlerinde yaygın olarak kullanılır.
- Birçok işlem grafiksel arayüze ihtiyaç duyulmadan terminal üzerinden gerçekleştirilebilir.


## 2. Temel Terminal Komutları

- `ls` bulunulan dizindeki dosya ve klasörleri listelemek, `cd` ise dizinler arasında geçiş yapmak için kullanılır.
- `mkdir` yeni klasör oluşturmayı, `grep` ise metin içerisinde belirli bir kelime veya ifadeyi aramayı sağlar.
- `chmod` dosya ve klasörlerin erişim izinlerini değiştirmek için kullanılır.
- `top` çalışan işlemleri, işlemci ve bellek gibi sistem kaynaklarının kullanımını görüntülemeyi sağlar.


## 3. Paket Yönetimi

- Paket yönetimi, Linux sistemlerinde programların kurulmasını, güncellenmesini ve kaldırılmasını sağlar.
- Linux dağıtımları farklı paket yöneticileri kullanabilir.
- `apt` Debian ve Ubuntu tabanlı sistemlerde, `dnf` Fedora tabanlı sistemlerde ve `pacman` Arch Linux tabanlı sistemlerde kullanılır.
- Paket yöneticileri yazılımların ve gerekli bağımlılıkların düzenli şekilde yönetilmesini sağlar.


## 4. Dosya İzinleri

- Linux'ta dosya ve klasörlere erişim belirli izinler üzerinden kontrol edilir.
- Temel izinler okuma (`r`), yazma (`w`) ve çalıştırma (`x`) izinleridir.
- Bu izinler dosyanın sahibi, bağlı olduğu grup ve diğer kullanıcılar için ayrı ayrı belirlenebilir.
- Dosya izinleri, dosyalara kimlerin erişebileceğini veya değişiklik yapabileceğini kontrol etmeyi sağlar.


## 5. Servisler ve systemctl

- Servisler, Linux sisteminde arka planda çalışan ve belirli görevleri yerine getiren programlardır.
- `systemctl`, systemd kullanan Linux sistemlerinde servisleri yönetmek için kullanılır.
- `systemctl start`, `systemctl stop` ve `systemctl restart` komutlarıyla servisler başlatılabilir, durdurulabilir veya yeniden başlatılabilir.
- `systemctl status` komutu ile bir servisin mevcut çalışma durumu kontrol edilebilir.