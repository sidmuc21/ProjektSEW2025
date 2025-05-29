package com.example.projekt2025;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.layout.Pane;

import javafx.scene.paint.Color;

import javafx.scene.shape.Circle;

import javafx.scene.shape.Rectangle;

import javafx.stage.Stage;

public class PongGame extends Application {

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

        stage.setTitle("Pong Game");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {

        launch();

    }

}

