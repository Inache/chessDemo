package lv.helloit;

import lv.helloit.controller.GameController;

public class Main {
    public static void main(String[] args) {
        GameController game = new GameController();
        game.start();
    }
}