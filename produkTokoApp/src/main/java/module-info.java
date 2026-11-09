module com.mytoko.produktokoapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mytoko.produktokoapp to javafx.fxml;
    exports com.mytoko.produktokoapp;
}
