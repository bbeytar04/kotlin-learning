# Veritabanı Mantığı (SQL Temelleri)

## 1. Relational Database

- Relational database (ilişkisel veritabanı), verilerin tablolar halinde düzenli bir şekilde saklandığı veritabanı türüdür.

- Her tablo belirli bir veri grubunu temsil eder ve satırlar kayıtları, sütunlar ise kayıtların özelliklerini içerir.

- Tablolar arasında ilişkiler kurularak farklı veriler birbiriyle bağlantılı şekilde tutulabilir.

- MySQL, PostgreSQL, Microsoft SQL Server ve SQLite ilişkisel veritabanı sistemlerine örnek olarak verilebilir.

## 2. Primary Key – Foreign Key

- `Primary Key` (birincil anahtar), bir tabloda bulunan her kaydı benzersiz olarak tanımlamak için kullanılan alandır.

- Bir tabloda aynı `Primary Key` değerine sahip iki farklı kayıt bulunamaz.

- `Foreign Key` (yabancı anahtar), bir tablodaki veriyi başka bir tablonun `Primary Key` alanıyla ilişkilendirmek için kullanılır.

- Bu anahtarlar sayesinde farklı tablolar arasında bağlantı kurulabilir ve verilerin birbiriyle ilişkili şekilde tutulması sağlanabilir.

## 3. SELECT – JOIN – GROUP BY

- `SELECT`, veritabanındaki bir veya daha fazla tablodan veri almak veya görüntülemek için kullanılır.

- `JOIN`, ilişkili tabloların verilerini ortak alanlar üzerinden bir araya getirmek için kullanılır.

- Örneğin kullanıcıların bilgileri bir tabloda, siparişleri başka bir tabloda tutuluyorsa `JOIN` kullanılarak kullanıcılar ve siparişleri birlikte görüntülenebilir.

- `GROUP BY`, aynı değere sahip kayıtları gruplandırmak için kullanılır.

- Genellikle `COUNT`, `SUM` ve `AVG` gibi işlemlerle birlikte kullanılabilir.

## 4. Index

- Index (indeks), veritabanındaki verilere daha hızlı erişilmesini sağlayan bir yapıdır.

- Özellikle çok fazla kayıt bulunan tablolarda belirli verilerin aranma süresini azaltabilir.

- Bir sütun üzerinde index oluşturulduğunda veritabanı, aranan veriyi bulmak için index yapısından yararlanabilir.

- Index sorguların daha hızlı çalışmasını sağlayabilir ancak ek depolama alanı kullanır ve veri ekleme veya güncelleme işlemlerinde ek işlem maliyeti oluşturabilir.