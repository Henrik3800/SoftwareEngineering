//Henrik Sopart und Florian Klören, Lotto, 23.11.2021 V.6.9

package org.hsd.inflab.se1c4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Arrays;


public class GUI extends Application{
	
	public static void main(String[] args) {
		
		launch(args);
		
	}
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		//Titel des Fensters festlegen
		primaryStage.setTitle("Lotto");
		
		//Textfelder erzeugen
		TextField textfield0 = new TextField();
		TextField textfield1 = new TextField();
		TextField textfield2 = new TextField();
		TextField textfield3 = new TextField();
		TextField textfield4 = new TextField();
		TextField textfield5 = new TextField();
		
		//Button erzeugen und benennen
		Button draw = new Button();
		draw.setText("Draw");
		
		//Aktion die ausgeführt wird, wenn der Button gedrückt wird
		draw.setOnAction(e -> {
								
								// Array erzeugen, Klasse ziehung aufrufen und rückgabe in dem erzeugten Array speichern
								int[] numbersgui = ziehung.lottoziehung();
								
								//einzelnen Werte aus dem Array auf Textfelder legen
								textfield0.setText(Integer.toString(numbersgui[0]));
								textfield1.setText(Integer.toString(numbersgui[1]));
								textfield2.setText(Integer.toString(numbersgui[2]));
								textfield3.setText(Integer.toString(numbersgui[3]));
								textfield4.setText(Integer.toString(numbersgui[4]));
								textfield5.setText(Integer.toString(numbersgui[5]));
								
								});
		
		//HBox layout Objekt erstellen
		HBox layout_top = new HBox();
		
		//Textfelder dem HBox layout hinzufügen
		layout_top.getChildren().addAll(textfield0, textfield1, textfield2, textfield3, textfield4, textfield5);
		
		
		//StackPane layout Objekt erstellen
		StackPane  layout_center = new StackPane ();
		
		//Button dem StackPane layout hinzufügen
		layout_center.getChildren().add(draw);
		
		
		//BorderPane layout Objekt erstellen
		BorderPane layout = new BorderPane();
		
		//HBox layout Objekt in das BorderPane layout Objekt einfügen
		layout.setTop(layout_top);
		
		//StackPane layout Objekt in das BorderPane layout Objekt einfügen
		layout.setCenter(layout_center);
		
		
		//Scene erzeugen
		primaryStage.setScene(new Scene(layout, 500, 400));

		//Fenster zeigen
		primaryStage.show();

		
	}



}
