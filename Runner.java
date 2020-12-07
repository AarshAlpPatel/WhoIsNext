import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
* @author Aarsh Patel
* @version 1.0
* This class creates the JavaFX application
*/
public class Runner extends Application {
	
	@Override
	public void start(Stage mainStage) {
		mainStage.setTitle("Who Is Next");
		Label head = new Label("Who should we contact to finish the task?");
		head.setTextFill(Color.web("#3333ff"));
        head.setFont(new Font("Helvetica", 30));

		Label file = new Label("Write the File Name that needs to be analyzed: ");
		TextField one = new TextField();

		Label amount = new Label("How many individuals do we want to finish the task? (write a number)");
		TextField two = new TextField();

		Button btn = new Button("Submit");

		Label result1 = new Label();
		Label result = new Label();

		btn.setOnAction(event -> {
			String fileName = one.getCharacters().toString();
			int count = Integer.parseInt(two.getCharacters().toString());
			result.setText(Team.getLeast(Team.readFile(fileName), count));
			result1.setText("These proctors have not been proctors in a while: ");
		});

		HBox one1 = new HBox(10);
		one1.setAlignment(Pos.CENTER);
		one1.getChildren().addAll(file, one);

		HBox two2 = new HBox(10);
		two2.setAlignment(Pos.CENTER);
		two2.getChildren().addAll(amount, two);

		VBox root = new VBox(10);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(head, one1, two2, btn, result1, result);

		Scene scene = new Scene(root, 700, 900);
		mainStage.setScene(scene);
		mainStage.show();

	}
}