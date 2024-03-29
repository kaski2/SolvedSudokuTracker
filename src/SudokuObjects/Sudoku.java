package SudokuObjects;


import Exceptions.*;

public class Sudoku {

    public enum Difficulty{
        GENTLE, MODERATE, TOUGH, DIABOLICAL, EXTREME
    }
    private int[] sudokuBoard;
    private int day;
    private int month;
    private int year;
    private static final int SUDOKU_CODE_LENGTH = 81;
    private boolean solved;
    private String puzzleOrigin;
    private Difficulty diff;

    public Sudoku(String sudokuCode, int day, int month, int year, boolean solved, String puzzleOrigin, Difficulty diff){
        try{
            sudokuBoard = makeSudokuBoard(sudokuCode);
        }catch(InvalidSudokuCodeLength e){
            System.out.println("Invalid length of import string");
        }catch(InvalidSudokuCodeCharacters e){
            System.out.println("Invalid characters in import string");
        }
        this.day = day;
        this.month = month;
        this.year = year;
        this.solved = solved;
        this.puzzleOrigin = puzzleOrigin;
        this.diff = diff;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int[] getSudokuBoard() {
        return sudokuBoard;
    }

    public boolean isSolved() {
        return solved;
    }

    public String getPuzzleOrigin(){
        return puzzleOrigin;
    }

    public Difficulty getDiff() {
        return diff;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setSudokuBoard(String sudokuCode) {
        try{
            sudokuBoard = makeSudokuBoard(sudokuCode);
        }catch(Exception e){
            System.out.println("Invalid sudoku code");
        }

    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public void setPuzzleOrigin(String puzzleOrigin) {
        this.puzzleOrigin = puzzleOrigin;
    }

    public void setDiff(Difficulty diff) {
        this.diff = diff;
    }
/*
    ---------------------------------------
    | 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 |
    | 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 |
    | 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 |
    ---------------------------------------
    | 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 |
    | 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 |
    | 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 |
    ---------------------------------------
    | 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 |
    | 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 |
    | 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 |
    ---------------------------------------

 */
    public void printBoard(){
        StringBuilder sb = new StringBuilder();
        sb.append("---------------------------------------\n");
        for (int i=0; i<9; i++){

            sb.append("| ");
            for (int j=i*9; j<(9*i)+9; j++){
                //sb.append(" | ");
                if(sudokuBoard[j] == 0){
                    sb.append(" ");
                }else {
                    sb.append(sudokuBoard[j]);
                }
                if(j % 9 == 2 || j % 9 == 5){
                    sb.append(" || ");
                }else {
                    sb.append(" | ");
                }
            }
            sb.append("\n");
            if(i == 2 || i == 5){
                sb.append("---------------------------------------\n");
            }

        }
        sb.append("---------------------------------------\n");

        System.out.println(sb);
    }

    private int[] makeSudokuBoard(String sudokuCode) throws InvalidSudokuCodeLength, InvalidSudokuCodeCharacters{
        int[] array = new int[81];
        if(sudokuCode.length() != SUDOKU_CODE_LENGTH){
            throw new InvalidSudokuCodeLength("Code length is not 81");
        }
        for(int i=0; i<81; i++){
            int number = Character.getNumericValue(sudokuCode.charAt(i));
            if(number > 9 || number < 0){
                throw new InvalidSudokuCodeCharacters("Invalid characters in import string");
            }
            array[i] = number;
        }
        return array;
    }
}
