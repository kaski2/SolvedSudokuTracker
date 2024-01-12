package Exceptions;

public class InvalidSudokuCodeCharacters extends Exception{
    public InvalidSudokuCodeCharacters(String errorMessage){
        super(errorMessage);
    }
}
