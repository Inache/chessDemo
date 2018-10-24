package lv.helloit.board.pieces;

public class Queen extends Figure {
    public Queen(boolean isWhite){
        super(isWhite);
    }

    public String toString(){
        if(this.isWhite){
            return "\u2655";
        } else{
            return "\u265B";
        }
    }
}
