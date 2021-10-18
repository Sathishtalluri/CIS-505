
/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
package TalluriFutureValueApp.src;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
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
    private TextField tfInvestmentAmount = new TextField();
    	//private TextField tfNumberOfYears = new TextField();	
        private TextField tfAnnualInterestRate = new TextField();

        private TextArea text = new TextArea();
        private TextField year = new TextField();

        	private Button btCalculate = new Button("Calculate");
            private Button btClear = new Button("Clear");
            private Label intrestRateMessageLabel=new Label(" Enter 11.1% AS 11.1");
            final ComboBox<String> comboBox = new ComboBox<String>();
    @Override
    public void start(Stage primaryStage) throws Exception {  
        ObservableList<String> years = 
    FXCollections.observableArrayList(
        " 1",
        " 2",
        " 3"
    );
        GridPane pane = new GridPane();		
        pane.setVgap(5);		
        pane.setHgap(5);		
        pane.add(new Label("Monthly Payment:"), 0, 0);		
        pane.add(tfInvestmentAmount, 1, 0);				
        pane.add(new Label(" Interest Rate:"), 0, 1);		
        pane.add(tfAnnualInterestRate, 1, 1);
        pane.add(new Label(" Years:"), 0, 3);
        pane.add(year, 1, 3);
        pane.add(intrestRateMessageLabel, 1, 2);
        pane.add(btCalculate, 0, 4);
        pane.add(btClear, 1, 4);
        pane.add(text, 0, 5);


        //Set UI properties		
        pane.setAlignment(Pos.CENTER);		
        tfInvestmentAmount.setAlignment(Pos.BOTTOM_RIGHT);		
        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);	
        intrestRateMessageLabel.setTextFill(Color.RED);	
        intrestRateMessageLabel.setAlignment(Pos.BOTTOM_RIGHT);		
        GridPane.setHalignment(btCalculate, HPos.RIGHT);
        GridPane.setHalignment(btClear, HPos.LEFT);		
        pane.setPadding(new Insets(10, 10, 0, 0)); 

        Scene scene=new Scene(pane,800,500);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Future Value App");  
        primaryStage.show();  
       }
    
    



}