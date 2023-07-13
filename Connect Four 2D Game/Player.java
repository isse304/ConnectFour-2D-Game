/**
 * Describes one of the players of the game
 *
 * @author Qadar Isse
 */
public abstract class Player
{
    protected String name; // the name of the player
    protected Game game;   // the game being played
    protected Board board; // the board used in the current game

    /**
     * Constructor for objects of class Player
     * 
     * @param name   the name of the player
     * @param game   the game the player is about to start
     */
    public Player(String name, Game game)
    {
        this.name = name;
        this.game = game;
        this.board = game.board;
    }// constructor

    /**
     * Returns a textual description of the player, namely its name
     * 
     * @return    the name of the player
     */
    @Override
    public String toString()
    {
        return name;
    }// toString method

    /**
     *  Performs one move on behalf of the player
     */
    public abstract void playAMove();

}// Player class
