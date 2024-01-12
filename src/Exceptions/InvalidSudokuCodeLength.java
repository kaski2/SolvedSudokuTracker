package Exceptions;

public class InvalidSudokuCodeLength extends Exception{
    public InvalidSudokuCodeLength(String errorMsg){
        super(errorMsg);
    }
}
