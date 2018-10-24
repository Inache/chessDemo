package lv.helloit.board.pieces;




public abstract class Figure  {
    protected boolean isWhite;

    public Figure(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return this.isWhite;
    }

    @Override
    public abstract String toString();

}
