package lv.helloit.board;

import lv.helloit.board.exceptions.WrongFromFieldException;
import lv.helloit.board.pieces.*;

public class Board {
    private Field[][] board;
    private boolean whiteTurn;

    public Board() {
        this.board = new Field[8][8];
        this.whiteTurn = true;

        this.initBoard();
        this.fillFieldWithAllFigures();


    }

    public void makeMove(Move move) throws WrongFromFieldException {
        Field from = board[move.from.x][move.from.y];
        if (from.isEmpty() || (from.figure().isWhite() == this.whiteTurn)) {
            throw new WrongFromFieldException("Wrong");
        } else {
            if (Pawn.validate)
            board[move.to.x][move.to.y] = board[move.from.x][move.from.y];
            board[move.from.x][move.from.y] = new Field();

            this.whiteTurn = !this.whiteTurn;
        }
    }

    public Field[][] getBoard() {
        return this.board;
    }

    public boolean isWhiteTurn() {
        return whiteTurn;
    }

    private void initBoard() {
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                board[i][j] = new Field();
            }
        }
    }
    private void fillPawns(boolean isWhite) {
        int rowIndex = isWhite ? 1 : 6;

        for (int i = 0; i < 8; ++i) {
            board[rowIndex][i] = new Field(new Pawn(isWhite));
        }
    }

    private void fillKnights(boolean isWhite) {
        int rowIndex = isWhite ? 0 : 7;
        board[rowIndex][1] = new Field(new Knight(isWhite));
        board[rowIndex][6] = new Field(new Knight(isWhite));
    }

    private void fillBishops(boolean isWhite) {
        int rowIndex = isWhite ? 0 : 7;
        board[rowIndex][2] = new Field(new Bishop(isWhite));
        board[rowIndex][5] = new Field(new Bishop(isWhite));
    }

    private void fillRooks(boolean isWhite) {
        int rowIndex = isWhite ? 0 : 7;
        board[rowIndex][0] = new Field(new Rook(isWhite));
        board[rowIndex][7] = new Field(new Rook(isWhite));
    }

    private void fillKings(boolean isWhite) {
        int rowIndex = isWhite ? 0 : 7;
        board[rowIndex][4] = new Field(new King(isWhite));
    }

    private void fillQueens(boolean isWhite) {
        int rowIndex = isWhite ? 0 : 7;
        board[rowIndex][3] = new Field(new Queen(isWhite));
    }
    private void fillFieldWithAllFigures(){
        this.fillPawns(true);
        this.fillPawns(false);
        this.fillBishops(true);
        this.fillBishops(false);
        this.fillRooks(true);
        this.fillRooks(false);
        this.fillKnights(true);
        this.fillKnights(false);
        this.fillKings(true);
        this.fillKings(false);
        this.fillQueens(true);
        this.fillQueens(false);
    }

}
