package pixelart;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Pixel extends Canvas {
    private GraphicsContext gc;

    public Pixel(int width, int height) {
        super(width, height);
        this.gc = this.getGraphicsContext2D();
    }

    public void update() {
        this.gc.fillRect(0, 0, getWidth(), getHeight());
    }

    public void createStrokeRect() {
        this.gc.setStroke(Color.GRAY);
        this.gc.strokeRect(0, 0, getWidth(), getHeight());
    }

    public void surbrillance(Boolean state) {
        if (state) {
            this.gc.setStroke(Color.RED);
            this.gc.strokeRect(0, 0, getWidth(), getHeight());
        } else {
            this.createStrokeRect();
        }
    }
}
