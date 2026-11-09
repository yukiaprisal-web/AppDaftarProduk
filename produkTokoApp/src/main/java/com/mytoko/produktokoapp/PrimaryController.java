package com.mytoko.produktokoapp;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.math.BigDecimal;

public class PrimaryController {

    @FXML
    private TextField txtKode;

    @FXML
    private TextField txtNama;

    @FXML
    private ComboBox<String> cbKategori;

    @FXML
    private TextField txtHarga;

    // Tempat menyimpan data produk sementara
    private final ObservableList<String> daftarProduk =
            FXCollections.observableArrayList();

    // Mengisi pilihan kategori ketika halaman dibuka
    @FXML
    public void initialize() {
        cbKategori.setItems(
            FXCollections.observableArrayList(
                "Makanan",
                "Minuman",
                "Elektronik",
                "Perlengkapan"
            )
        );
    }

    // Fungsi tombol Simpan Produk
    @FXML
    private void handleSimpan() {

        String kode = txtKode.getText().trim();
        String nama = txtNama.getText().trim();
        String kategori = cbKategori.getValue();
        String hargaText = txtHarga.getText().trim();

        // Validasi input
        if (kode.isEmpty() || nama.isEmpty()
                || kategori == null || hargaText.isEmpty()) {

            tampilkanPesan(
                Alert.AlertType.WARNING,
                "Peringatan",
                "Semua data produk harus diisi!"
            );
            return;
        }

        BigDecimal harga;

        try {
            harga = new BigDecimal(hargaText);

            if (harga.compareTo(BigDecimal.ZERO) <= 0) {
                throw new NumberFormatException();
            }

        } catch (NumberFormatException e) {

            tampilkanPesan(
                Alert.AlertType.ERROR,
                "Kesalahan",
                "Harga harus berupa angka lebih dari 0!"
            );
            return;
        }

        // Memeriksa kode produk yang sama
        for (String produk : daftarProduk) {
            if (produk.startsWith("Kode: " + kode + "\n")) {
                tampilkanPesan(
                    Alert.AlertType.WARNING,
                    "Peringatan",
                    "Kode produk sudah digunakan!"
                );
                return;
            }
        }

        // Menyimpan produk
        String dataProduk =
                "Kode: " + kode
                + "\nNama: " + nama
                + "\nKategori: " + kategori
                + "\nHarga: Rp " + harga.stripTrailingZeros().toPlainString();

        daftarProduk.add(dataProduk);

        tampilkanPesan(
            Alert.AlertType.INFORMATION,
            "Berhasil",
            "Produk berhasil disimpan!"
        );

        // Mengosongkan form
        txtKode.clear();
        txtNama.clear();
        cbKategori.getSelectionModel().clearSelection();
        txtHarga.clear();
    }

    // Fungsi tombol Lihat Daftar Produk
    @FXML
    private void handleLihat() {

        if (daftarProduk.isEmpty()) {
            tampilkanPesan(
                Alert.AlertType.INFORMATION,
                "Daftar Produk",
                "Belum ada produk yang disimpan."
            );
            return;
        }

        String hasil = String.join("\n\n", daftarProduk);

        tampilkanPesan(
            Alert.AlertType.INFORMATION,
            "Daftar Produk",
            hasil
        );
    }

    // Fungsi untuk menampilkan pesan
    private void tampilkanPesan(
            Alert.AlertType tipe,
            String judul,
            String pesan) {

        Alert alert = new Alert(tipe);
        alert.setTitle(judul);
        alert.setHeaderText(null);
        alert.setContentText(pesan);
        alert.showAndWait();
    }
}