package pixelart;

import javafx.event.EventHandler;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class PixelHandler implements EventHandler<MouseEvent> {
    private Pixel pixel;
    private Color pixelColor;

    public PixelHandler(Pixel p, Color c) {
        this.pixel = p;
        this.pixelColor = c;
    }

    @Override
    public void handle(MouseEvent e) {
        GraphicsContext gc = this.pixel.getGraphicsContext2D();
        gc.setFill(this.pixelColor);
        this.pixel.update();
    }
}
