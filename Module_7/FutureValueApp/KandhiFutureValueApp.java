import java.io.IOException;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class KandhiFutureValueApp extends Application {

    // private properties
    private Label lblMonthlyPayment = new Label("Monthly Payment:");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
    private Label lblYears = new Label("Years:");
    private TextField txtMonthlyPayment = new TextField();
    private TextField txtInterestRate = new TextField();
    private TextArea taMessage = new TextArea();
    private ComboBox cbYears = new ComboBox<Integer>();
    private Button btnClear = new Button("Clear");
    private Button btnCalculate = new Button("Calculate");

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Setting the title to Stage
        primaryStage.setTitle("Kandhi Future Value App");

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
        lblMonthlyPayment.setFont(Font.font("Arial", FontWeight.NORMAL, 12));
        lblMonthlyPayment.setAlignment(Pos.CENTER_LEFT);
        gridPane.add(lblMonthlyPayment, 0, 0);

        // sets monthly payment text field height and position in grid pane
        txtMonthlyPayment.setPrefHeight(30);
        gridPane.add(txtMonthlyPayment, 1, 0);

        // sets interest rate label font and position in grid pane
        lblInterestRate.setFont(Font.font("Arial", FontWeight.NORMAL, 12));
        gridPane.add(lblInterestRate, 0, 1);

        // sets interest rate text field height and position in grid pane
        txtInterestRate.setPrefHeight(30);
        gridPane.add(txtInterestRate, 1, 1);

        // sets interest rate format label font and position in grid pane
        lblInterestRateFormat.setTextFill(Color.RED);
        lblInterestRateFormat.setFont(Font.font("Arial", FontWeight.NORMAL, 12));
        gridPane.add(lblInterestRateFormat, 1, 2);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);

        // sets years label font and position in grid pane
        lblYears.setFont(Font.font("Arial", FontWeight.NORMAL, 12));
        gridPane.add(lblYears, 0, 3);

        // sets combo box width and postion in grid pane
        cbYears.setMaxWidth(Double.MAX_VALUE);
        gridPane.add(cbYears, 1, 3);

        // sets text area position in grid pane
        taMessage.setWrapText(true);
        gridPane.add(taMessage, 0, 5, 2, 2);

        // set clear and calculate button properties and position in grid pane
        HBox actionButtonContainer = new HBox();
        actionButtonContainer.setPadding(new Insets(15, 0, 15, 30));
        actionButtonContainer.setSpacing(30);
        actionButtonContainer.getChildren().add(btnClear);
        actionButtonContainer.getChildren().add(btnCalculate);
        GridPane.setHalignment(actionButtonContainer, HPos.RIGHT);
        gridPane.add(actionButtonContainer, 1, 4);
    } // end addUIControls

    public static void main(String[] args) throws IOException {
        launch(args);
    } // end main
} // KandhiFutureValueApp