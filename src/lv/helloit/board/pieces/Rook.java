package lv.helloit.board.pieces;

public class Rook extends Figure {

    public Rook(boolean isWhite) {
        super(isWhite);
    }

    public String toString(){
        if(this.isWhite){
            return "\u2656";
        } else {
            return "\u265C";
        }
    }
}
