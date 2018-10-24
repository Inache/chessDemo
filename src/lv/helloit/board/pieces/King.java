package lv.helloit.board.pieces;

public class King extends Figure {
    public King(boolean isWhite) {
        super(isWhite);
    }

    public String toString(){
        if(this.isWhite){
            return "\u2654";
        } else{
            return "\u265A";
        }
    }
}
