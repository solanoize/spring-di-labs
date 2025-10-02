# Spring DI Labs

Repository ini berisi eksperimen praktis terkait Dependency Injection (DI) di Spring Framework. Setiap branch fokus pada metode DI tertentu (constructor, setter, field) untuk belajar langsung melalui coding.

## Tujuan

- Memahami konsep Dependency Injection di Spring.
- Menerapkan berbagai metode DI secara langsung.

## Branch
- `main` → DI Based on Constructor
- `di/setter` → DI Based on Setter
- `di/field` → DI Based on Field

## Cara Menggunakan

Clone repository:

```bash
git clone https://github.com/solanoize/spring-di-labs.git
```

Checkout branch yang diinginkan:

```bash
git checkout di/setter
```

Jalankan project menggunakan:

```bash
mvn clean test
```

## Catatan

- Semua dependensi sudah ada di pom.xml, tidak perlu instalasi tambahan.
- Selama program dibuat, saya menggunakan versi Java 17.
