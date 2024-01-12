import SudokuObjects.*;

public class Main {
    public static void main(String[] args) {
        Sudoku asd = new Sudoku("700893001006000003004506000008300070000040000040005200000907500300000900500432006", 12, 12, 2002, true, "asd", Sudoku.Difficulty.DIABOLICAL);
        asd.printBoard();
    }
}