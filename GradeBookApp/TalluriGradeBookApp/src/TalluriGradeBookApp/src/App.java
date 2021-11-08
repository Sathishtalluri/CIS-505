
/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
package TalluriGradeBookApp.src;


import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.opencsv.CSVWriter;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.DataFormat;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class App extends Application {	
    public static void main(String[] args) {
        launch(args);
    }
    private TextField tfFirstName = new TextField();
        private TextField tfLastName = new TextField();
        private TextField tfCourse = new TextField();

        	private Button btSave = new Button("Save");
            private Button btClear = new Button("Clear");
            private Button btview = new Button("View");
            
            //final ComboBox<String> comboBox = new ComboBox<String>();
             ChoiceBox<String> garadeChoiceBox = new ChoiceBox<String>();

    @Override
    public void start(Stage primaryStage) throws Exception {  
        garadeChoiceBox.getItems().add("A");
        garadeChoiceBox.getItems().add("B");
        garadeChoiceBox.getItems().add("C");
        garadeChoiceBox.getItems().add("E");
        garadeChoiceBox.getItems().add("F");
        GridPane pane = new GridPane();		
        pane.setVgap(5);		
        pane.setHgap(5);		
        pane.add(new Label("First Name:"), 0, 0);		
        pane.add(tfFirstName, 1, 0);				
        pane.add(new Label(" Last Name:"), 0, 1);		
        pane.add(tfLastName, 1, 1);
        pane.add(new Label(" Course:"), 0, 2);
        pane.add(tfCourse, 1, 2);
        pane.add(new Label(" Grade:"), 0, 3);
        pane.add(garadeChoiceBox, 1, 3);
        pane.add(btSave, 0, 4);
        pane.add(btClear, 1, 4);
        pane.add(btview, 2, 4);
    


        //Set UI properties		
        pane.setAlignment(Pos.CENTER);		
        tfFirstName.setAlignment(Pos.BOTTOM_RIGHT);		
        tfLastName.setAlignment(Pos.BOTTOM_RIGHT);	
        tfCourse.setAlignment(Pos.BOTTOM_RIGHT);		
        GridPane.setHalignment(btSave, HPos.RIGHT);
        GridPane.setHalignment(btClear, HPos.LEFT);		
        pane.setPadding(new Insets(10, 10, 0, 0)); 
        btSave.setOnAction(e -> studentDetails());
        btClear.setOnAction(e -> {
            tfFirstName.setText("");
            tfLastName.setText("");
            tfCourse.setText("");
        });
        // Process events		

        Scene scene=new Scene(pane,300,300);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle(" Grade Book App");  
        primaryStage.show();  
       }
       private void studentDetails() {		

        String firstName = tfFirstName.getText();			
        String lastName = tfLastName.getText();
        String course =tfCourse.getText() ;		
        String grade=garadeChoiceBox.getValue();


    

    }
    
    



}
