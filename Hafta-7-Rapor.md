# API Mantığı (REST & JSON Temelleri)

## 1. API

- API (Application Programming Interface), farklı yazılımların veya uygulamaların birbirleriyle iletişim kurmasını sağlayan bir yapıdır.

- Bir uygulama ihtiyaç duyduğu veriyi veya işlemi başka bir sistemden API aracılığıyla isteyebilir.

- API sayesinde istemci ve sunucu arasında belirli kurallar üzerinden veri alışverişi gerçekleştirilebilir.

- REST API, web uygulamalarında istemci ve sunucu arasındaki iletişimi sağlamak için yaygın olarak kullanılan API yaklaşımlarından biridir.

## 2. GET – POST – PUT – DELETE

- `GET`, sunucudan veri almak veya mevcut verileri görüntülemek için kullanılır.

- `POST`, sunucuya yeni veri göndermek ve genellikle yeni bir kayıt oluşturmak için kullanılır.

- `PUT`, sunucuda bulunan mevcut bir veriyi güncellemek veya değiştirmek için kullanılır.

- `DELETE`, sunucuda bulunan bir veriyi silmek için kullanılır.

## 3. JSON Yapısı

- JSON (JavaScript Object Notation), verilerin düzenli ve okunabilir bir şekilde temsil edilmesini sağlayan bir veri formatıdır.

- JSON içerisinde veriler genellikle anahtar-değer (`key-value`) çiftleri şeklinde tutulur.

- String, number, boolean, array, object ve `null` gibi farklı veri türleri JSON içerisinde kullanılabilir.

- API'lerde istemci ve sunucu arasında veri gönderip almak için JSON yaygın olarak kullanılır.

## 4. Endpoint

- Endpoint, bir API içerisinde belirli bir veriye veya işleve erişmek için kullanılan belirli bir adresi ifade eder.

- Her endpoint belirli bir kaynağı veya işlemi temsil edebilir.

- Örneğin `/users` kullanıcılarla ilgili işlemleri, `/products` ise ürünlerle ilgili işlemleri temsil edebilir.

- Aynı endpoint üzerinde farklı HTTP metotları kullanılarak farklı işlemler gerçekleştirilebilir.

## 5. Basit Bir Endpoint Tasarımı

- Endpoint tasarlanırken işlem yapılacak kaynak açık ve anlaşılır şekilde belirlenir.

- Örneğin kullanıcıları temsil etmek için `/users` endpoint'i kullanılabilir.

- `GET /users`, kullanıcıları almak için kullanılabilir.

- `POST /users`, yeni bir kullanıcı oluşturmak için kullanılabilir.

- `PUT /users/5`, ID değeri 5 olan kullanıcının bilgilerini güncellemek için kullanılabilir.

- `DELETE /users/5`, ID değeri 5 olan kullanıcıyı silmek için kullanılabilir.