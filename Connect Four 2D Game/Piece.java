/**
 * Describes one of the pieces of the game
 *
 * @author Qadar Isse
 */
public class Piece
{
    private String label;  // the label of the piece
    private Board board;   // the board this piece is on
    private int row;       // the row index of the piece's 
                           // location on its board
    private int col;       // the column index of the piece's 
                           // location on its board

    /**
     * Constructor for objects of class Piece
     * 
     * @param label  the label of the piece
     * @param board  the board this piece is on
     * @param row    the row index of the piece on its board
     * @param col    the col index of the piece on its board
     */
    public Piece(String label, Board board, int row, int col)
    {
        this.label = label;
        this.board = board;
        this.row = row;
        this.col = col;
    }// constructor

    /**
     * Returns the label of the piece
     *
     * @return    the label of the piece
     */
    public String getLabel()
    {
        return label;
    }// getLabel method
    
    /**
     * Returns a textual description of the piece, namely its label
     * 
     * @return    the label of the piece
     */
    @Override
    public String toString()
    {
        return label;
    }// toString method
    
    /**
     *  Returns true if and only if the two pieces have the same
     *  label
     */
    @Override
    public boolean equals(Object o)
    {
        if (o instanceof Piece)
           return label.equals( ((Piece)o).label );
        
        return false;
    }// equals method

}// Piece class
