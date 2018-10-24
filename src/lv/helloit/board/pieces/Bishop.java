package lv.helloit.board.pieces;

public class Bishop extends Figure {
    public Bishop(boolean isWhite){
        super(isWhite);
    }

    public String toString(){
        if(this.isWhite){
            return "\u2657";
        } else{
            return "\u265D";
        }
    }

}
