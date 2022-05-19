package pixelart;

import javafx.scene.layout.GridPane;

public class PixelImage {
    private GridPane grille;
    private Boolean mouseClicked;

    public PixelImage(int width, int height, Pencil pencil) {
        this.grille = new GridPane();
        this.mouseClicked = false;
        for (int i = 0; i < width / 10; i++) {
            for (int j = 0; j < height / 10; j++) {
                Pixel p = new Pixel(10, 10);
                p.createStrokeRect();
                // p.setOnMouseEntered(e -> {
                // PixelHandler ph = new PixelHandler(p, pencil.getColor());
                // ph.handle(e);
                // });

                // p.setOnMousePressed(e -> {
                // p.setOnMouseMoved(e1 -> {
                // PixelHandler ph = new PixelHandler(p, pencil.getColor());
                // ph.handle(e1);
                // });
                // });

                p.setOnMouseReleased(e -> {
                    if (this.mouseClicked) {
                        this.mouseClicked = false;
                    } else {
                        this.mouseClicked = true;
                    }
                });

                p.setOnMouseMoved(e -> {
                    if (this.mouseClicked) {
                        PixelHandler ph = new PixelHandler(p, pencil.getColor());
                        ph.handle(e);
                    }
                });

                p.setOnMouseEntered(e -> {
                    p.surbrillance(true);
                });

                p.setOnMouseExited(e -> {
                    p.surbrillance(false);
                });

                this.grille.add(p, i, j);
            }
        }
    }

    public GridPane getGrille() {
        return this.grille;
    }
}
