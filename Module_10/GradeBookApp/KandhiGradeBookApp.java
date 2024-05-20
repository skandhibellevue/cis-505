import java.io.*;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class KandhiGradeBookApp extends Application {

    // private properties
    private Label lblFirstName = new Label("First Name:");
    private Label lblLastName = new Label("Last Name:");
    private Label lblCourse = new Label("Course:");
    private Label lblGrade = new Label("Grade:");
    private TextField txtFirstName = new TextField();
    private TextField txtLastName = new TextField();
    private TextField txtCourse = new TextField();
    private TextArea taResults = new TextArea();
    private ComboBox cbGrade = new ComboBox<Integer>();
    private Button btnClear = new Button("Clear");
    private Button btnSaveGrade = new Button("Save Grade");
    private Button btnViewGrades = new Button("View Grades");

    private static String GRADES_FILE = "grades.csv";

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Setting the title to Stage
        primaryStage.setTitle("Kandhi Grade Book App");

        // Create the pane
        GridPane gridPane = createGridPane();
        addUIControls(gridPane);

        // Create a scene with the gridPane as the root node.
        Scene scene = new Scene(gridPane, 350, 300);
        // Set the scene in primary stage
        primaryStage.setScene(scene);

        primaryStage.show();
    } // end start

    /**
     * createGridPane method, which is used to create a GridPane with 2 columns
     * @return returns GridPane object
     */
    private GridPane createGridPane() {
        // Instantiate a new Grid Pane
        GridPane gridPane = new GridPane();

        // Position the pane at the center of the screen
        gridPane.setAlignment(Pos.CENTER);

        // Set a padding for the grid pane
        gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));

        // Set the horizontal gap between columns
        gridPane.setHgap(5.5);

        // Set the vertical gap between rows
        gridPane.setVgap(5.5);

        // Add Column Constraints
        // columnOneConstraints will be applied to all the nodes placed in column one.
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.LEFT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(150,150, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

        return gridPane;
    } // createGridPane

    /**
     * addUIControls method with one argument, which is used to add UI controls to the GridPane
     * @param gridPane, GridPane object
     */
    private void addUIControls(GridPane gridPane) {
        // sets monthly payment label font and position in grid pane
        lblFirstName.setFont(Font.font("Arial", FontWeight.NORMAL, 12));
        lblFirstName.setAlignment(Pos.CENTER_LEFT);
        gridPane.add(lblFirstName, 0, 0);

        // sets monthly payment text field height and position in grid pane
        txtFirstName.setPrefHeight(30);
        gridPane.add(txtFirstName, 1, 0);

        // sets interest rate label font and position in grid pane
        lblLastName.setFont(Font.font("Arial", FontWeight.NORMAL, 12));
        gridPane.add(lblLastName, 0, 1);

        // sets interest rate text field height and position in grid pane
        txtLastName.setPrefHeight(30);
        gridPane.add(txtLastName, 1, 1);

        // sets interest rate label font and position in grid pane
        lblCourse.setFont(Font.font("Arial", FontWeight.NORMAL, 12));
        gridPane.add(lblCourse, 0, 2);

        // sets interest rate text field height and position in grid pane
        txtCourse.setPrefHeight(30);
        gridPane.add(txtCourse, 1, 2);

        // sets years label font and position in grid pane
        lblGrade.setFont(Font.font("Arial", FontWeight.NORMAL, 12));
        gridPane.add(lblGrade, 0, 3);

        // sets combo box width and position in grid pane
        cbGrade.setMaxWidth(Double.MAX_VALUE);
        String[] grades = {"A", "B", "C", "D", "E", "F"};
        ObservableList<String> options =
                FXCollections.observableArrayList(grades);
        cbGrade.getItems().addAll(options);
        gridPane.add(cbGrade, 1, 3);

        // set clear and calculate button properties and position in grid pane
        HBox actionButtonContainer = new HBox();
        actionButtonContainer.setPadding(new Insets(15, 10, 15, 10));
        actionButtonContainer.setSpacing(30);
        actionButtonContainer.getChildren().add(btnClear);
        actionButtonContainer.getChildren().add(btnSaveGrade);
        actionButtonContainer.getChildren().add(btnViewGrades);
        GridPane.setHalignment(actionButtonContainer, HPos.CENTER);
        gridPane.add(actionButtonContainer, 0, 4, 2, 1);

        btnSaveGrade.setOnAction(event -> saveGradeToCsv());
        btnClear.setOnAction(event -> clearFormFields());
        btnViewGrades.setOnAction(event -> viewSavedGrades());

        // sets text area position in grid pane
        taResults.setWrapText(true);
        gridPane.add(taResults, 0, 5, 2, 2);
    } // end addUIControls

    /**
     * clearFormFields method, which is used to clear all fields and rest to defaults
     */
    private void  clearFormFields() {
        txtFirstName.setText("");
        txtLastName.setText("");
        txtCourse.setText("");
        cbGrade.getSelectionModel().clearSelection();
        taResults.setText("");
    } // clearFormFields

    /**
     * saveGrade method, which is used to save the entered grades to csv file
     */
    private void saveGradeToCsv() {
    } // saveGradeToCsv

    /**
     * viewSavedGrades method, which is used to display all the saved grades from csv file
     */
    private void viewSavedGrades() {
    } // viewSavedGrades

    public static void main(String[] args) throws IOException {
        launch(args);
    } // end main
} // KandhiGradeBookApp