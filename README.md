
# 🛒 Produk Toko App

## 📌 Deskripsi
Produk Toko App adalah aplikasi desktop sederhana berbasis Java yang digunakan untuk mengelola data produk toko. Aplikasi ini dikembangkan menggunakan JavaFX dengan Maven sebagai pengelola proyek.

Aplikasi ini dibuat sebagai proyek pembelajaran pemrograman Java dan pengembangan aplikasi berbasis GUI (Graphical User Interface).

## ✨ Fitur Aplikasi
- Menambahkan data produk.
- Memasukkan kode dan nama produk.
- Memilih kategori produk.
- Memasukkan harga produk.
- Validasi data produk.
- Mencegah kode produk duplikat.
- Menampilkan daftar produk.
- Menampilkan notifikasi menggunakan JavaFX Alert.

## 🛠️ Teknologi
- Java
- JavaFX
- FXML
- Maven
- Apache NetBeans

## 📂 Struktur Proyek
```text
produkTokoApp/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── com/mytoko/produktokoapp/
        │       ├── App.java
        │       ├── PrimaryController.java
        │       ├── SecondaryController.java
        │       ├── data/
        │       └── model/
        └── resources/
            └── com/mytoko/produktokoapp/
                ├── primary.fxml
                └── secondary.fxml
```

## ⚙️ Persyaratan
- JDK 17 atau lebih baru.
- Apache NetBeans.
- Maven.

## 🚀 Cara Menjalankan

1. Clone repository:
```bash
git clone URL_REPOSITORY_KAMU
```

2. Masuk ke folder proyek:
```bash
cd produkTokoApp
```

3. Jalankan aplikasi:
```bash
mvn clean javafx:run
```

Atau buka proyek melalui Apache NetBeans dan klik **Run Project**.

## 📝 Cara Penggunaan
1. Buka aplikasi Produk Toko App.
2. Masukkan kode produk.
3. Masukkan nama produk.
4. Pilih kategori produk.
5. Masukkan harga produk.
6. Klik tombol Simpan Produk.
7. Klik Lihat Daftar Produk untuk melihat data produk.

## 📌 Catatan
Data produk pada versi ini disimpan sementara selama aplikasi berjalan dan belum menggunakan database permanen.

## 👨‍💻 Developer

**Yuki Aprisal**

Program Studi Mekatronika dan Kecerdasan Buatan  
Universitas Pendidikan Indonesia

---

© 2026 Produk Toko App
