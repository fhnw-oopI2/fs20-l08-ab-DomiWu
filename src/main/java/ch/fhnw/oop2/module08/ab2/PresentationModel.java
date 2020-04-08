package ch.fhnw.oop2.module08.ab2;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {

	private StringProperty applicationTitle;
	private StringProperty buttonText;

	private enum buttonStatus {
		Off, On
	};

	public PresentationModel() {
		applicationTitle = new SimpleStringProperty("Toggle Application");
		buttonText = new SimpleStringProperty(buttonStatus.Off.toString());
	}

	public void setButtonText(StringProperty buttonText) {
		this.buttonText = buttonText;
	}

	public StringProperty getApplicationTitleProperty() {
		return applicationTitle;
	}

	public StringProperty getButtonTextProperty() {
		return buttonText;
	}

	public void toggle() {
		if (buttonText.get().equals(buttonStatus.Off.toString())) {
			buttonText.setValue(buttonStatus.On.toString());
		} else {
			buttonText.setValue(buttonStatus.Off.toString());
		}
	}

}
