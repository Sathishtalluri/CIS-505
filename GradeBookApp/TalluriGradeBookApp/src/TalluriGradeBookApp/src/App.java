
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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBeanBuilder;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    StudentCSV writer = new StudentCSV();
    File studentDataFile=new File("D:\\Student\\Student.csv");	
    public static void main(String[] args) {
        launch(args);
    }
    private TextField tfFirstName = new TextField();
        private TextField tfLastName = new TextField();
        private TextField tfCourse = new TextField();

        	private Button btSave = new Button("Save");
            private Button btClear = new Button("Clear");
            private Button btview = new Button("View");
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
            garadeChoiceBox.setValue("");
        });
        btview.setOnAction(e -> {
            try {
                viewstudentDetails();
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } 
        });
        Scene scene=new Scene(pane,300,300);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle(" Grade Book App");  
        primaryStage.show();  
       }
       private void studentDetails() {	
        Student student=new Student();
                student.setFirstName(tfFirstName.getText());
                student.setLastName(tfLastName.getText()); 
                student.setCourse(tfCourse.getText());
                student.setGrade(garadeChoiceBox.getValue());
                //Boolean flag= studentDataFile.exists();
        try {
            if(studentDataFile.createNewFile())
            {
                studentDataCoversion(student);
}
           else{  
            CSVWriter writer = new CSVWriter(new FileWriter(studentDataFile, true));
            String [] record = {tfFirstName.getText(),tfLastName.getText(),tfCourse.getText(),garadeChoiceBox.getValue()};
            writer.writeNext(record);
            writer.close();
             }
            } catch (Exception e) {

            e.printStackTrace();
        }


        	
}
private void viewstudentDetails() throws IOException,FileNotFoundException {
    System.out.println("in viewstudentDetails");
    FileReader obj=new FileReader(studentDataFile);
    List<Student> beans = new CsvToBeanBuilder(obj)
    .withType(Student.class)
    .build()
    .parse();

beans.forEach(System.out::println);
   

}
public void studentDataCoversion(Student student)
{
    List<String[]> data=writer.createCsvDataSpecial(student);
                try {
                    writer.writeToCsvFile(data, studentDataFile);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

}
    
    



}
