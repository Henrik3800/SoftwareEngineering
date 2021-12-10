package org.hsd.inflab.Uebung_8;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ü8_2 extends Application { 
	
	   @Override 
	   public void start(Stage stage) { 
	      
	      Polygon Polygon1 = new Polygon();
	      Polygon1.getPoints().addAll(new Double[]{
	    		  100.0, 400.0,
	    		  300.0, 400.0,
	    		  300.0, 200.0,
	    		  200.0,  50.0,
	    		  100.0, 200.0,
	    		  300.0, 200.0,
	    		  100.0, 400.0,
	    		  100.0, 200.0,
	    		  300.0, 400.0});
	      Polygon1.setStroke(Color.BLACK);
	      Polygon1.setFill(Color.WHITE);

	      
	        
	      Group root = new Group(Polygon1); 
	      
	      Scene scene = new Scene(root, 400, 500);  
	      stage.setTitle("Nikolaus"); 
	      stage.setScene(scene); 
	      stage.show(); 
	   }      
	   
	   
	   
	   
	   
	   public static void main(String args[]){ 
	      launch(args); 
	   } 
	} 
