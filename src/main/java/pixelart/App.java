package pixelart;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Pencil pencil = new Pencil();
        HBox paletteButtons = new HBox();
        HBox utilsButtons = new HBox();
        ArrayList<String> styles = new ArrayList<String>();
        styles.add("-fx-background-color: #FF0000;"); // Rouge
        styles.add("-fx-background-color: #0100FF;"); // Bleu
        styles.add("-fx-background-color: #1CFF00;"); // Vert
        styles.add("-fx-background-color: #000000;"); // Noir
        styles.add("-fx-background-color: #FFFFFF;"); // Blanc
        styles.add("-fx-background-color: #FF00F3;"); // Violet

        ArrayList<Color> colors = new ArrayList<Color>();
        colors.add(Color.RED); // Rouge
        colors.add(Color.BLUE); // Bleu
        colors.add(Color.GREEN); // Vert
        colors.add(Color.BLACK); // Noir
        colors.add(Color.WHITE); // Blanc
        colors.add(Color.PURPLE); // Violet

        for (String style : styles) {
            Button b = new Button();
            b.setMinHeight(100);
            b.setMinWidth(100);
            b.setStyle(style);
            b.setOnAction(e -> {
                pencil.setColor(colors.get(styles.indexOf(style)));
            });
            paletteButtons.getChildren().add(b);
        }

        PixelImage pi = new PixelImage(600, 600, pencil);

        Button fillButton = new Button();
        fillButton.setMinHeight(100);
        fillButton.setMinWidth(100);
        fillButton.setText("Remplir la grille");
        fillButton.setOnAction(e -> {
            Color colorToFill = pencil.getColor();
        });
        utilsButtons.getChildren().add(fillButton);
        VBox verticalBox = new VBox(paletteButtons, utilsButtons, pi.getGrille());

        Scene scene = new Scene(verticalBox, 600, 800);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}