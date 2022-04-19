module ru.gb.java2.lesson4.java2lesson4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens ru.gb.java2.lesson4.java2lesson4 to javafx.fxml;
    exports ru.gb.java2.lesson4.java2lesson4;
}