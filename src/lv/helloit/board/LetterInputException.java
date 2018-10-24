package lv.helloit.board;

public class LetterInputException extends Exception {
    String errorMessage;

    public LetterInputException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }
}
