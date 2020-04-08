package ch.fhnw.oop2.module08.ab1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {

	private StringProperty applicationTitle;
	private StringProperty buttonText;

	public PresentationModel() {
		applicationTitle = new SimpleStringProperty("JavaFX Application");
		buttonText = new SimpleStringProperty("Hello World");
	}

	public StringProperty getApplicationTitleProperty() {
		return applicationTitle;
	}

	public StringProperty getButtonTextProperty() {
		return buttonText;
	}

}
