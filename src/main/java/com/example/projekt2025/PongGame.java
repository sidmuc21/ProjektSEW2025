package com.example.projekt2025;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PongGame extends Application {
    private boolean wPressed = false, sPressed = false, upPressed = false, downPressed = false;

    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 600, 400);

        Rectangle paddle1 = new Rectangle(10, 100, Color.BLUE);
        paddle1.setX(10);
        paddle1.setY(150);

        Rectangle paddle2 = new Rectangle(10, 100, Color.RED);
        paddle2.setX(580);
        paddle2.setY(150);

        Circle ball = new Circle(10, Color.BLACK);
        ball.setCenterX(300);
        ball.setCenterY(200);

        root.getChildren().addAll(paddle1, paddle2, ball);

        // Input events
        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.W) wPressed = true;
            if (e.getCode() == KeyCode.S) sPressed = true;
            if (e.getCode() == KeyCode.UP) upPressed = true;
            if (e.getCode() == KeyCode.DOWN) downPressed = true;
        });

        scene.setOnKeyReleased(e -> {
            if (e.getCode() == KeyCode.W) wPressed = false;
            if (e.getCode() == KeyCode.S) sPressed = false;
            if (e.getCode() == KeyCode.UP) upPressed = false;
            if (e.getCode() == KeyCode.DOWN) downPressed = false;
        });

        // Movement logic
        new javafx.animation.AnimationTimer() {
            @Override
            public void handle(long now) {
                if (wPressed && paddle1.getY() > 0) paddle1.setY(paddle1.getY() - 5);
                if (sPressed && paddle1.getY() < scene.getHeight() - paddle1.getHeight()) paddle1.setY(paddle1.getY() + 5);
                if (upPressed && paddle2.getY() > 0) paddle2.setY(paddle2.getY() - 5);
                if (downPressed && paddle2.getY() < scene.getHeight() - paddle2.getHeight()) paddle2.setY(paddle2.getY() + 5);
            }
        }.start();

        stage.setTitle("Pong Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}


