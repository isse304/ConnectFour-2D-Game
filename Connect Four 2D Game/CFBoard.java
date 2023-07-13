
/**
 * This class extends board and implements the display
 * method which displays the board.
 *
 * @author Qadar Isse
 */
public class CFBoard extends Board
{
    public CFBoard(CFGame game, int rows, int columns)
    {
        super(game, rows, columns);

    }

    public void display()
    {
        

        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {

                System.out.print("|"); 

                if(!(this.isEmpty(i, j)))
                {

                    Piece myPiece = this.getPiece(i, j);
                    System.out.print(myPiece);
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println("|"); 
        }
        System.out.println("+-+-+-+-+-+-+-+");
        System.out.println(" 1 2 3 4 5 6 7\n");
    }
}
