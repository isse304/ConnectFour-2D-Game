import java.util.Random;

/**
 * This class extends the player class and implements
 * playAMove. This class functions as the computer player
 *
 * @author Qadar Isse
 */
public class CFComputerPlayer extends Player
{
    public CFComputerPlayer(String name, Game game)
    {
        super(name, game);

    }

    public void playAMove() 
    {
        Random rand = new Random();
        int chosenRow = 5;
        int move;

        move = rand.nextInt(7)+1;
        move=move - 1;
        System.out.print(super.name.toString() + " plays: " + (move +1) + "\n");

        if((move < 8) && (move >= 0) && (this.board.isEmpty(0, move)))
        {
            for(int i = 5; i > 0 ; i--)
            {
                if(!(this.board.isEmpty(i, move)))
                {
                    chosenRow--;
                }
            }//if a pice is there, the number of available rows decreases by 1
            if(this.game.board.isEmpty(chosenRow, move))
            {
                Piece p2Piece =  new Piece("X", this.game.board, chosenRow, move);
                this.game.board.putPiece(p2Piece, chosenRow, move);
            }
            else
            {
                System.out.println("Invalid move. Try again!");

                rand.nextInt();
            }

        }
        else
        {
            System.out.println("Invalid move. Try again!");

            rand.nextInt();

        }

    }

}
