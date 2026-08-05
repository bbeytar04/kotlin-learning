# İşletim Sistemi Temelleri (OS Basics)

## 1. Kernel

- Kernel, işletim sisteminin çekirdeğini oluşturan ve donanım ile yazılımlar arasındaki iletişimi sağlayan temel bileşendir.
- Bellek yönetimi, işlemci yönetimi, dosya sistemi ve aygıt yönetimi gibi temel görevleri yerine getirir.
- Uygulamalar donanıma doğrudan erişmek yerine kernel aracılığıyla işlem gerçekleştirir.
- Sistem kaynaklarının güvenli ve verimli kullanılmasını sağlayarak işletim sisteminin düzgün çalışmasına katkıda bulunur.


## 2. Süreç (Process) ve İş Parçacığı (Thread)

- Process, çalışmakta olan bir programın işletim sistemi tarafından oluşturulan yürütme birimidir.
- Thread ise bir process içerisinde çalışan ve aynı bellek alanını paylaşan daha küçük yürütme birimidir.
- Bir process bir veya birden fazla thread içerebilir ve bu sayede aynı anda birden fazla işlem gerçekleştirilebilir.
- Process'ler birbirinden bağımsız çalışırken, aynı process içerisindeki thread'ler ortak kaynakları kullanabilir.


## 3. Bellek Yönetimi

- Bellek yönetimi, çalışan uygulamalar için gerekli bellek alanlarının düzenlenmesini ve yönetilmesini sağlayan işletim sistemi görevidir.
- İşletim sistemi ihtiyaç duyulan bellek alanını uygulamalara ayırır ve kullanılmayan alanları tekrar kullanılabilir hâle getirir.
- Aynı anda birden fazla uygulamanın güvenli şekilde çalışabilmesi bellek yönetimi sayesinde mümkün olur.
- Sanal bellek (Virtual Memory) kullanılarak fiziksel belleğin yetersiz olduğu durumlarda depolama alanından destek alınabilir.


## 4. CPU Zamanlayıcıları

- CPU zamanlayıcıları, işlemcinin hangi süreç veya iş parçacığını hangi sırayla çalıştıracağını belirleyen mekanizmalardır.
- İşlemci zamanı belirli algoritmalar kullanılarak çalışan süreçler arasında paylaştırılır.
- Bu mekanizma işlemci kaynaklarının verimli kullanılmasını ve uygulamaların dengeli şekilde çalışmasını sağlar.
- FCFS, SJF, Round Robin ve Priority Scheduling en yaygın CPU zamanlama algoritmaları arasında yer almaktadır.


## 5. Sanal Bellek (Virtual Memory)

- Sanal bellek, fiziksel RAM'in yetersiz kaldığı durumlarda depolama alanının bir bölümünü geçici bellek olarak kullanan bellek yönetim tekniğidir.
- İşletim sistemi, ihtiyaç duyulan verileri RAM ile depolama birimi arasında taşıyarak uygulamaların çalışmaya devam etmesini sağlar.
- Bu yöntem sayesinde aynı anda daha fazla uygulama çalıştırılabilir ancak fiziksel belleğe göre daha düşük performans sunar.
- Sanal bellek, sistem kaynaklarının daha verimli kullanılmasına katkı sağlarken bellek yetersizliği nedeniyle oluşabilecek sorunları azaltır.

## 6. Kesmeler (Interrupts)

- Kesmeler (Interrupts), işlemcinin yürütmekte olduğu işlemi geçici olarak durdurarak daha öncelikli bir olaya yanıt vermesini sağlayan mekanizmalardır.
- Donanım aygıtları veya yazılımlar tarafından oluşturulabilir ve gerekli işlem tamamlandıktan sonra işlemci kaldığı yerden çalışmaya devam eder.
- Klavye girişi, fare hareketleri, disk işlemleri ve ağ iletişimi gibi birçok işlem kesmeler sayesinde yönetilir.
- Kesmeler, sistemin olaylara hızlı tepki vermesini sağlayarak işletim sisteminin verimli çalışmasına katkıda bulunur.
