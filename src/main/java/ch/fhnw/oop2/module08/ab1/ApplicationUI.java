package ch.fhnw.oop2.module08.ab1;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ApplicationUI extends StackPane {
	private Button button;
	private PresentationModel pm;

	public ApplicationUI(PresentationModel pm) {
		this.pm = pm;
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		button = new Button();
		button.textProperty().bind(pm.getButtonTextProperty());
	}

	private void layoutControls() {
		this.getChildren().add(button);
	}
}