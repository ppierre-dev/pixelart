package pixelart;

import javafx.scene.paint.Color;

public class Pencil {
    private Color color;

    public Pencil() {
        this.color = Color.BLACK;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }
}
