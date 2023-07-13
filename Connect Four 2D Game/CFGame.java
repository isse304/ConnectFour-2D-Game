
/**
 * This class is a child of Game and implements the
 * abstract classes of Game namely, setUp, wrapUp, and
 * gameOver
 *
 * @author Qadar Isse
 */
public class CFGame extends Game
{
    public CFGame()
    {
        super(new CFBoard(null, 6, 7));
    }

    public static void main (String [] args)
    {
        new CFGame().play();
    }//newGame method

    public void setUp()
    {
        p1 = new CFPlayer("O",this );
        p2 = new CFComputerPlayer("X",this );
    }

    public void wrapUp()
    {
        if(p1 == winner)
        {
            System.out.println("Player O wins.");
        }
        else if(p2 == winner)
        {
            System.out.println("Player X wins.");
        }
        else
        {
            System.out.println("It`s a draw.");
        }
    }

    public boolean gameOver()
    {
        boolean isGameOver = false;

        for(int i = 5; i >= 0; i--)
        { 

            for(int j = 6; j >= 0; j--)
            {

                if(i > 2) //checks vertically
                {
                    
                    if((board.getPiece(i, j) != null) &&
                    (board.getPiece(i,j).getLabel() == "O") &&
                    (board.getPiece(i-1,j) != null) &&
                    (board.getPiece(i-1,j).getLabel() == "O")&&
                    (board.getPiece(i-2, j) != null) &&
                    (board.getPiece(i-2,j).getLabel() == "O") &&
                    (board.getPiece(i-3, j) != null) &&
                    (board.getPiece(i-3,j).getLabel() == "O"))
                    {

                        p1 = winner;
                         isGameOver =true;
                    }  

                    if((board.getPiece(i, j) != null) &&
                    (board.getPiece(i,j).getLabel() == "X") &&
                    (board.getPiece(i-1,j) != null) &&
                    (board.getPiece(i-1,j).getLabel() == "X")&&
                    (board.getPiece(i-2, j) != null) &&
                    (board.getPiece(i-2,j).getLabel() == "X") &&
                    (board.getPiece(i-3, j) != null) &&
                    (board.getPiece(i-3,j).getLabel() == "X"))
                    {

                        p2 = winner;
                         isGameOver =true;
                    }  

                }
                if(j > 2) //checks horizontally
                {

                    if((board.getPiece(i, j) != null) &&
                    (board.getPiece(i,j).getLabel() == "O") &&
                    (board.getPiece(i,j-1) != null) &&
                    (board.getPiece(i,j-1).getLabel() == "O")&&
                    (board.getPiece(i, j-2) != null) &&
                    (board.getPiece(i,j-2).getLabel() == "O") &&
                    (board.getPiece(i, j-3) != null) &&
                    (board.getPiece(i,j-3).getLabel() == "O"))
                    {

                        p1 = winner;
                        isGameOver =true;
                    }  


                    if((board.getPiece(i, j) != null) &&
                    (board.getPiece(i,j).getLabel() == "X") &&
                    (board.getPiece(i,j-1) != null) &&
                    (board.getPiece(i,j-1).getLabel() == "X")&&
                    (board.getPiece(i, j-2) != null) &&
                    (board.getPiece(i,j-2).getLabel() == "X") &&
                    (board.getPiece(i, j-3) != null) &&
                    (board.getPiece(i,j-3).getLabel() == "X"))
                    {

                        p2 = winner;
                        isGameOver =true;
                    }  

                }
                if((i > 2) && (j>=3)) //checks Diagonally (left to right)
                {

                    if((board.getPiece(i, j) != null) &&
                    (board.getPiece(i,j).getLabel() == "O") &&
                    (board.getPiece(i-1,j-1) != null) &&
                    (board.getPiece(i-1,j-1).getLabel() == "O")&&
                    (board.getPiece(i-2, j-2) != null) &&
                    (board.getPiece(i-2,j-2).getLabel() == "O") &&
                    (board.getPiece(i-3, j-3) != null) &&
                    (board.getPiece(i-3,j-3).getLabel() == "O"))
                    {

                        p1 = winner;
                         isGameOver =true;
                    } 
                    if((board.getPiece(i, j) != null) &&
                    (board.getPiece(i,j).getLabel() == "X") &&
                    (board.getPiece(i-1,j-1) != null) &&
                    (board.getPiece(i-1,j-1).getLabel() == "X")&&
                    (board.getPiece(i-2, j-2) != null) &&
                    (board.getPiece(i-2,j-2).getLabel() == "X") &&
                    (board.getPiece(i-3, j-3) != null) &&
                    (board.getPiece(i-3,j-3).getLabel() == "X"))
                    {

                        p2 = winner;
                         isGameOver =true;
                    }  

                }
                if((i > 2) && (j<=3)) //checks Diagonally (right to left)
                {

                    if((board.getPiece(i, j) != null) &&
                    (board.getPiece(i,j).getLabel() == "O") &&
                    (board.getPiece(i-1,j+1) != null) &&
                    (board.getPiece(i-1,j+1).getLabel() == "O")&&
                    (board.getPiece(i-2, j+2) != null) &&
                    (board.getPiece(i-2,j+2).getLabel() == "O") &&
                    (board.getPiece(i-3, j+3) != null) &&
                    (board.getPiece(i-3,j+3).getLabel() == "O"))
                    {

                        p1 = winner;
                         isGameOver =true;
                    }  

                    if((board.getPiece(i, j) != null) &&
                    (board.getPiece(i,j).getLabel() == "X") &&
                    (board.getPiece(i-1,j+1) != null) &&
                    (board.getPiece(i-1,j+1).getLabel() == "X")&&
                    (board.getPiece(i-2, j+2) != null) &&
                    (board.getPiece(i-2,j+2).getLabel() == "X") &&
                    (board.getPiece(i-3, j+3) != null) &&
                    (board.getPiece(i-3,j+3).getLabel() == "X"))
                    {

                        p2 = winner;
                         isGameOver =true;
                    }  

                }
        
            }
        }


        
        return isGameOver;
    }
}

