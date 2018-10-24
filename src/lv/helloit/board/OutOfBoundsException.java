package lv.helloit.board;

public class OutOfBoundsException extends Exception {
    public String errorMessage;

    public OutOfBoundsException(String errorMessage){
        super(errorMessage);
        this.errorMessage = errorMessage;
    }
}
