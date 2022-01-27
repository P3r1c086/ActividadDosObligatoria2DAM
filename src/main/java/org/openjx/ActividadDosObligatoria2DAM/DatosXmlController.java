package org.openjx.ActividadDosObligatoria2DAM;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class DatosXmlController {

	@FXML
	private Label tercera;
	
	@FXML
	private Button btnButon;
	
	@FXML
	public void cargar(MouseEvent event) throws IOException {
		  App.setRoot("secondary");
		
	}
}
