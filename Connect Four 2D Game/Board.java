/**
 * Describes the current state of the board
 *
 * @author Qadar Isse
 */
public abstract class Board
{
    protected Game game;        // the game using this board
    protected Piece[][] board;  // the state of the board
    protected int rows;         // the vertical size of the board
    protected int cols;         // the horizontal size of the board

    /**
     * Constructor for objects of class Board
     * 
     * @param  game       game the board is used for
     * @param  numRows    number of rows of the board
     * @param  numColumns number of columns of the board
     */
    public Board(Game game, int numRows, int numColumns)
    {
        this.game = game;
        rows = numRows;
        cols = numColumns;
        board = new Piece[rows][cols];
    }// constructor

    /**
     * Associates to this board the game that uses it
     *
     * @param  game  the game that uses this board
     */
    public void setGame(Game game)
    {
        this.game = game;
    }// setGame method

    /**
     *  Returns the piece located at the given position or null
     *  if no piece is at that location; throws an exception if 
     *  the location is off the board
     *
     * @param  row     the row index of the location
     * @param  column  the column index of the location
     * @return         the piece at the given location or null
     *                 if the location is empty
     */
    protected Piece getPiece(int row, int column)
                      throws InvalidBoardPositionException
    {
        if (row < 0 || row >= rows || column < 0 || column >= cols)
            throw new InvalidBoardPositionException(row,column);

        return board[row][column];
    }// getPiece method

    /**
     *  Puts down the given piece at the given location; throws an 
     *  exception if the location is off the board or already
     *  occupied
     *
     * @param  piece   the piece to place on the board
     * @param  row     the row index of the target location
     * @param  column  the column index of the target location
     */
    protected void putPiece(Piece piece, int row, int column)
                 throws InvalidBoardPositionException
    {
        if ( row < 0 || row >= rows || 
             column < 0 || column >= cols ||
             ! isEmpty(row,column) )
            throw new InvalidBoardPositionException(row,column);

        board[row][column] = piece;
    }// putPiece method

    /**
     *  Removes from the board the piece at the given location; 
     *  throws an exception if the location is off the board or empty
     *
     * @param  row     the row index of the target location
     * @param  column  the column index of the target location
     */
    protected void removePiece(int row, int column)
           throws InvalidBoardPositionException
    {
        if ( row < 0 || row >= rows || 
             column < 0 || column >= cols ||
             isEmpty(row,column) )
            throw new InvalidBoardPositionException(row,column);

        board[row][column] = null;
    }// removePiece method
    
    /**
     *   Returns true if and only if the specified location is
     *   empty
     *   
     *   @param   row    row index of the location being checked
     *   @param   col    column index of the location being checked
     *   @return         true if and only if there is no piece at
     *                   the location being checked
     */
    protected boolean isEmpty(int row, int col)
    {
        return board[row][col] == null;
    }// isEmpty method

    /**
     * Displays the board on the terminal window
     */
    protected abstract void display();

}// Board class

