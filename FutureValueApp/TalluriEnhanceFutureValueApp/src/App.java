
/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
package TalluriEnhanceFutureValueApp.src;


import java.text.SimpleDateFormat;
import java.util.Date;

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
    private TextField tfMonthlyPayment = new TextField();
        private TextField tfAnnualInterestRate = new TextField();

        private TextArea tfFutureValue = new TextArea();
        //private TextField year = new TextField();

        	private Button btCalculate = new Button("Calculate");
            private Button btClear = new Button("Clear");
            private Label intrestRateMessageLabel=new Label(" Enter 11.1% AS 11.1");
            //final ComboBox<String> comboBox = new ComboBox<String>();
             ChoiceBox<String> yearChoiceBox = new ChoiceBox<String>();
             private Label lbDateText=new Label("");

    @Override
    public void start(Stage primaryStage) throws Exception {  
        yearChoiceBox.getItems().add("1");
        yearChoiceBox.getItems().add("2");
        yearChoiceBox.getItems().add("3");
        GridPane pane = new GridPane();		
        pane.setVgap(5);		
        pane.setHgap(5);		
        pane.add(new Label("Monthly Payment:"), 0, 0);		
        pane.add(tfMonthlyPayment, 1, 0);				
        pane.add(new Label(" Interest Rate:"), 0, 1);		
        pane.add(tfAnnualInterestRate, 1, 1);
        pane.add(new Label(" Years:"), 0, 3);
        pane.add(yearChoiceBox, 1, 3);
        pane.add(intrestRateMessageLabel, 1, 2);
        pane.add(btCalculate, 0, 4);
        pane.add(btClear, 1, 4);

        pane.add(lbDateText, 0, 5);
        pane.add(tfFutureValue, 0, 6);


        //Set UI properties		
        pane.setAlignment(Pos.CENTER);		
        tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);		
        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);	
        intrestRateMessageLabel.setTextFill(Color.RED);	
        intrestRateMessageLabel.setAlignment(Pos.BOTTOM_RIGHT);		
        GridPane.setHalignment(btCalculate, HPos.RIGHT);
        GridPane.setHalignment(btClear, HPos.LEFT);		
        pane.setPadding(new Insets(10, 10, 0, 0)); 
        // Process events		
        btCalculate.setOnAction(e -> futureValue());
        btClear.setOnAction(e -> {
            tfFutureValue.clear();
            lbDateText.setText("");
           });

        Scene scene=new Scene(pane,800,500);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Future Value App");  
        primaryStage.show();  
       }
       private void futureValue() {	
        double MONTHS_IN_YEAR =12;	

        double monthlyPayment = Double.parseDouble(tfMonthlyPayment.getText());			
        double yearOfChoice = Double.parseDouble(yearChoiceBox.getValue());
        double annualInterestRate = Double.parseDouble(tfAnnualInterestRate.getText());		
        double interestRate =(1+(annualInterestRate/100)) ;	
        Double noOfMonths=yearOfChoice*MONTHS_IN_YEAR;
        Double presentValue=noOfMonths*monthlyPayment;
        tfFutureValue.setText(String.format("The Future Value is $%.2f", 			
         (presentValue * Math.pow(interestRate, noOfMonths))));	
         Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("MM/dd/yyyy");
        String stringDate = DateFor.format(date);
        lbDateText.setText("Caliculations As of"+stringDate);

    }
    
    



}