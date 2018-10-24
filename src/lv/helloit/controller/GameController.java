package lv.helloit.controller;

import lv.helloit.board.*;
import lv.helloit.board.exceptions.EmptyInputException;
import lv.helloit.board.exceptions.OutOfBoundsException;
import lv.helloit.board.exceptions.WrongFromFieldException;

import java.util.Scanner;

public class GameController {
    private Board board;

    public void start() {
        board = new Board();
        this.startGameLoop();
    }

    private void startGameLoop() {
        while (true) {
            this.print();

            try {
               Move move = readPlayerMove();
               board.makeMove(move);
            } catch (OutOfBoundsException o) {
                System.out.println(o.errorMessage);
            } catch (WrongFromFieldException e) {
                System.out.println(e.errorMessage);
            } catch (EmptyInputException e){
                System.out.println(e.errorMessage);
            }
        }
    }
//TODO bukvi exception!
    private Move readPlayerMove() throws OutOfBoundsException, EmptyInputException {
        Scanner sc = new Scanner(System.in);

            System.out.printf("It's %s turn. Enter your move: \n From: \n", this.board.isWhiteTurn() ? "white" : "black");

            String fromX = sc.nextLine();
            String fromY = sc.nextLine();

            System.out.println("To:");
            String toX = sc.nextLine();
            String toY = sc.nextLine();
        if (fromX.isEmpty() || fromY.isEmpty() || toX.isEmpty() || toY.isEmpty()){
            throw new EmptyInputException("U cant leave blank line!");
        }
        if     (Integer.parseInt(fromX) < 1 || Integer.parseInt(fromX) > 8 ||
                Integer.parseInt(fromY) < 1 || Integer.parseInt(fromY) > 8 ||
                  Integer.parseInt(toX) < 1 || Integer.parseInt(toX) > 8 ||
                  Integer.parseInt(toY) < 1 || Integer.parseInt(toY) > 8) {
            throw new OutOfBoundsException("Enter the position again. Last time there was a number outside the border");
        }

        return new Move.Builder()
                    .from(new Coordinates.Builder()
                            .x((byte) (Byte.parseByte(fromX) - 1))
                            .y((byte) (Byte.parseByte(fromY) - 1))
                            .build())
                    .to(new Coordinates.Builder()
                            .x((byte) (Byte.parseByte(toX) - 1))
                            .y((byte) (Byte.parseByte(toY) - 1))
                            .build())
                    .build();

    }
    private void print() {
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                System.out.print(board.getBoard()[i][j]);
            }
            System.out.println();
        }
    }
}