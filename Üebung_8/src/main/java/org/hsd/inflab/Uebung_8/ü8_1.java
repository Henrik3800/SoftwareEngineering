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
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ü8_1 extends Application { 
	
	   @Override 
	   public void start(Stage stage) { 
	      
	      Rectangle rectangle1 = new Rectangle();
	      Rectangle rectangle2 = new Rectangle();
	      Rectangle rectangle3 = new Rectangle();
	      Rectangle rectangle4 = new Rectangle();
	      
	      
	      rectangle4.setX(150.0f); 
	      rectangle4.setY(75.0f); 
	      rectangle4.setWidth(10.0f); 
	      rectangle4.setHeight(350.0f);
	      rectangle4.setFill(Color.GRAY);
	      rectangle4.setStroke(Color.BLACK);
	      
	      rectangle1.setX(150.0f); 
	      rectangle1.setY(75.0f); 
	      rectangle1.setWidth(300.0f); 
	      rectangle1.setHeight(75.0f);
	      rectangle1.setFill(Color.BLACK);
	      rectangle1.setStroke(Color.BLACK);
	      
	      rectangle2.setX(150.0f); 
	      rectangle2.setY(150.0f); 
	      rectangle2.setWidth(300.0f); 
	      rectangle2.setHeight(75.0f); 
	      rectangle2.setFill(Color.RED);
	      rectangle2.setStroke(Color.BLACK);
	      
	      rectangle3.setX(150.0f); 
	      rectangle3.setY(225.0f); 
	      rectangle3.setWidth(300.0f); 
	      rectangle3.setHeight(75.0f); 
	      rectangle3.setFill(Color.GOLD);
	      rectangle3.setStroke(Color.BLACK);
	      
	        
	      Group root = new Group(rectangle1,rectangle2,rectangle3,rectangle4); 
	         
	      
	      Scene scene = new Scene(root, 600, 500);  
	      
	      
	      stage.setTitle("DE"); 
	         
	      
	      stage.setScene(scene); 
	         
	      
	      stage.show(); 
	   }      
	   
	   
	   
	   
	   
	   public static void main(String args[]){ 
	      launch(args); 
	   } 
	} 
