package lk.ijse.dep10.controllers;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Viewcontroller {

    public VBox vBox;
    public Canvas cnv;
    public ImageView imgCircle;
    public ImageView imgSquare;
    public ImageView imgOval;
    public ImageView imgPen;
    public ColorPicker clrPickerBoarder;
    public ColorPicker clrPickerFill;
    public Canvas cnvD;
    private double mouseX;
    private double mouseY;

    @FXML
    private ImageView imgRectangular;
    int identyfy=0;

    @FXML
    void rectangularOnMouseClicked(MouseEvent event) {
        identyfy=1;
        cnvOnmousePressed(event);

    }

    @FXML
    void rectangularOnMouseEntered(MouseEvent event) {

    }

    @FXML
    void rectangularOnMouseExited(MouseEvent event) {

    }

    @FXML
    void rectangularOnMouseReleased(MouseEvent event) {
        
    }

    public void cnvOnmouseDragged(MouseEvent mouseEvent) {
        if (identyfy == 1) {
            double x2 = mouseEvent.getX();
            double y2 = mouseEvent.getY();
            double width = x2 - mouseX;
            double height = y2 - mouseY;
            GraphicsContext gc = cnv.getGraphicsContext2D();
            gc.strokeRect(width < 0 ? x2 : mouseX, height < 0 ? y2 : mouseY, Math.abs(width), Math.abs(height));
            gc.clearRect(width < 0 ? x2 : mouseX, height < 0 ? y2 : mouseY, Math.abs(width), Math.abs(height));
            gc.strokeRect(width < 0 ? x2 : mouseX, height < 0 ? y2 : mouseY, Math.abs(width), Math.abs(height));
        } else if (identyfy == 2) {
            double x2 = mouseEvent.getX();
            double y2 = mouseEvent.getY();
            double width = x2 - mouseX;
            double height = y2 - mouseY;
            GraphicsContext gc = cnv.getGraphicsContext2D();
            gc.strokeRect(width < 0 ? x2 : mouseX, height < 0 ? y2 : mouseY, Math.abs(width) < Math.abs(height) ? Math.abs(height) : Math.abs(width), Math.abs(width) < Math.abs(height) ? Math.abs(height) : Math.abs(width));
            gc.clearRect(width < 0 ? x2 : mouseX, height < 0 ? y2 : mouseY, Math.abs(width) < Math.abs(height) ? Math.abs(height) : Math.abs(width), Math.abs(width) < Math.abs(height) ? Math.abs(height) : Math.abs(width));
            gc.strokeRect(width < 0 ? x2 : mouseX, height < 0 ? y2 : mouseY, Math.abs(width) < Math.abs(height) ? Math.abs(height) : Math.abs(width), Math.abs(width) < Math.abs(height) ? Math.abs(height) : Math.abs(width));

        }else if (identyfy == 3) {
            double x2 = mouseEvent.getX();
            double y2 = mouseEvent.getY();
            double width = x2 - mouseX;
            double height = y2 - mouseY;
            GraphicsContext gc = cnv.getGraphicsContext2D();
            gc.strokeOval(width < 0 ? x2 : mouseX, height < 0 ? y2 : mouseY, Math.abs(width)<Math.abs(height)?Math.abs(height):Math.abs(width), Math.abs(width)<Math.abs(height)?Math.abs(height):Math.abs(width));
            gc.clearRect(width < 0 ? x2 : mouseX, height < 0 ? y2 : mouseY, Math.abs(width)<Math.abs(height)?Math.abs(height):Math.abs(width), Math.abs(width)<Math.abs(height)?Math.abs(height):Math.abs(width));
            gc.strokeOval(width < 0 ? x2 : mouseX, height < 0 ? y2 : mouseY, Math.abs(width)<Math.abs(height)?Math.abs(height):Math.abs(width), Math.abs(width)<Math.abs(height)?Math.abs(height):Math.abs(width));

        } else if (identyfy == 4) {
            double x2 = mouseEvent.getX();
            double y2 = mouseEvent.getY();
            double width = x2 - mouseX;
            double height = y2 - mouseY;
            GraphicsContext gc = cnv.getGraphicsContext2D();
            gc.strokeOval(width < 0 ? x2 : mouseX, height < 0 ? y2 : mouseY, Math.abs(width), Math.abs(height));
            gc.clearRect(width < 0 ? x2 : mouseX, height < 0 ? y2 : mouseY, Math.abs(width), Math.abs(height));
            gc.strokeOval(width < 0 ? x2 : mouseX, height < 0 ? y2 : mouseY, Math.abs(width), Math.abs(height));

        } else if (identyfy == 5) {
            GraphicsContext gc = cnv.getGraphicsContext2D();
                gc.fillOval(mouseEvent.getX(), mouseEvent.getY(), 4, 4);

        }
        else if (identyfy == 6) {

            GraphicsContext gc = cnv.getGraphicsContext2D();
            gc.setFill(Color.WHITE);
            gc.fillOval(mouseEvent.getX(), mouseEvent.getY(), 8, 8);
            gc.setFill(Color.BLACK);

        }
    }
    public void cnvOnmousePressed(MouseEvent mouseEvent) {
        if(identyfy==1){
        mouseX=mouseEvent.getX();
        mouseY=mouseEvent.getY();}
        else if (identyfy==2) {
            mouseX=mouseEvent.getX();
            mouseY=mouseEvent.getY();

        } else if (identyfy==3) {
            mouseX=mouseEvent.getX();
            mouseY=mouseEvent.getY();

        }else if (identyfy==4) {
            mouseX = mouseEvent.getX();
            mouseY = mouseEvent.getY();
        } else if (identyfy==5){
            mouseX = mouseEvent.getX();
            mouseY = mouseEvent.getY();
        }
    }

    public void cnvOnmouseRleased(MouseEvent mouseEvent) {
        if(identyfy==1) {

            double x2 = mouseEvent.getX();
            double y2 = mouseEvent.getY();
            double width = x2 - mouseX;
            double height = y2 - mouseY;
            GraphicsContext gc = cnv.getGraphicsContext2D();
            gc.strokeRect(width < 0 ? x2 : mouseX, height < 0 ? y2 : mouseY, Math.abs(width), Math.abs(height));

        }else if (identyfy==2){
            double x2 = mouseEvent.getX();
            double y2 = mouseEvent.getY();
            double width = x2 - mouseX;
            double height = y2 - mouseY;
            GraphicsContext gc = cnv.getGraphicsContext2D();
            gc.strokeRect(width < 0 ? x2 : mouseX, height < 0 ? y2 : mouseY, Math.abs(width) < Math.abs(height) ? Math.abs(height) : Math.abs(width), Math.abs(width) < Math.abs(height) ? Math.abs(height) : Math.abs(width));;

        } else if (identyfy==3) {
            double x2 = mouseEvent.getX();
            double y2 = mouseEvent.getY();
            double width = x2 - mouseX;
            double height = y2 - mouseY;
            GraphicsContext gc = cnv.getGraphicsContext2D();
            gc.strokeOval(width < 0 ? x2 : mouseX, height < 0 ? y2 : mouseY, Math.abs(width)<Math.abs(height)?Math.abs(height):Math.abs(width), Math.abs(width)<Math.abs(height)?Math.abs(height):Math.abs(width));

        } else if (identyfy==4) {
            double x2 = mouseEvent.getX();
            double y2 = mouseEvent.getY();
            double width = x2 - mouseX;
            double height = y2 - mouseY;
            GraphicsContext gc = cnv.getGraphicsContext2D();
            gc.strokeOval(width < 0 ? x2 : mouseX, height < 0 ? y2 : mouseY, Math.abs(width), Math.abs(height));

        }
        }

    public void squareOnMouseClicked(MouseEvent mouseEvent) {
        identyfy=2;
        cnvOnmousePressed(mouseEvent);
    }

    public void squareOnMouseReleased(MouseEvent mouseEvent) {

    }

    public void circleOnMouseClicked(MouseEvent mouseEvent) {
        identyfy=3;
        cnvOnmousePressed(mouseEvent);
    }

    public void ovalOnMouseClicked(MouseEvent mouseEvent) {
        identyfy=4;
        cnvOnmousePressed(mouseEvent);

    }

    public void penOnMouseClicked(MouseEvent mouseEvent) {
        identyfy=5;
        cnvOnmousePressed(mouseEvent);

    }

    public void eraserOnMouseClicked(MouseEvent mouseEvent) {
        identyfy=6;
        cnvOnmousePressed(mouseEvent);
    }


}
