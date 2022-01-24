module org.openjx.ActividadDosObligatoria2DAM {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.sql;

    opens org.openjx.ActividadDosObligatoria2DAM to javafx.fxml;
    exports org.openjx.ActividadDosObligatoria2DAM;
}
