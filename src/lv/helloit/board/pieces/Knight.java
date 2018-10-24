package lv.helloit.board.pieces;

public class Knight extends Figure {

    public Knight(boolean isWhite){
        super(isWhite);
    }

    public String toString(){
        if(this.isWhite){
            return "\u2658";
        } else{
            return "\u265E";
        }
    }
}
