import java.util.Scanner;
/**
 * This class extends the player class and implements
 * playAMove. This class functions as the human player
 *
 * @author Qadar Isse
 */
public class CFPlayer extends Player
{
    public CFPlayer(String name, Game game)
    {
        super(name, game);

    }

    public void playAMove()
    {

        Scanner scan = new Scanner(System.in);
        int chosenRow = 5;
        int move;

        System.out.print(super.name.toString() + " plays: ");
        move = scan.nextInt();
        move=move - 1;


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
                Piece p1Piece =  new Piece("O", this.game.board, chosenRow, move);
                this.game.board.putPiece(p1Piece, chosenRow, move);
            }
            else
            {
                System.out.println("Invalid move. Try again!");

                scan.nextInt();
            }

        }
        else
        {
            System.out.println("Invalid move. Try again!");

            scan.nextInt();

        }

    }

}

