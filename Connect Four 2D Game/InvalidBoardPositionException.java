/**
 * Signals an attempt to access a board position that is out
 * of range
 *
 * @author Qadar Isse
 */
public class InvalidBoardPositionException extends RuntimeException
{
    /**
     * Constructor for objects of class 
     * InvalidBoardPositionException
     *
     * @param row     row index
     * @param col     column index
     */
    public InvalidBoardPositionException(int row, int col)
    {
        super(row + " x " + col + " is not a valid board position.");
    }// constructor

}// InvalidBoardPositionException class
