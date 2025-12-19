package com.hust.kstn.javafx.painter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {
    @FXML
    private Pane drawingAreaPane;

    @FXML
    private RadioButton penRadioButton;

    @FXML
    private RadioButton eraserRadioButton;

    private Color currentColor = Color.BLACK;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        Circle newCircle = new Circle(event.getX(), event.getY(), 4, currentColor);
        drawingAreaPane.getChildren().add(newCircle);
    }

    @FXML
    void penSelected(ActionEvent event) {
        currentColor = Color.BLACK;
    }

    @FXML
    void eraserSelected(ActionEvent event) {
        currentColor = Color.WHITE;
    }

}
