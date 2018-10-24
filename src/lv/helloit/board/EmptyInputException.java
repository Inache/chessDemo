package lv.helloit.board;

public class EmptyInputException extends Exception {
    public String errorMessage;

        public EmptyInputException(String errorMessage){
            super(errorMessage);
            this.errorMessage = errorMessage;
        }
}
