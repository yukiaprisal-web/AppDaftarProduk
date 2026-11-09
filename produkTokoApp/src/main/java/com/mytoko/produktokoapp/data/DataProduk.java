
package com.mytoko.produktokoapp.data;

import com.mytoko.produktokoapp.model.Produk;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataProduk {

    private static final ObservableList<Produk> daftarProduk =
            FXCollections.observableArrayList();

    public static ObservableList<Produk> getDaftarProduk() {
        return daftarProduk;
    }

    public static void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }
}
