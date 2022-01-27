package org.openjx.ActividadDosObligatoria2DAM;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("datosXml");
    }
}