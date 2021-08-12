/**
 * Lucky Card Game Project  Base code.
 * Date:17-06-2021
 * Group Name:ABJJ Team
 * Group Members:
 * 1)Abhilakshay
 * 2)John
 * 3)Bhawna
 * 4)Jyoti
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.*;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author dancye, 2018
 */
public abstract class Game 
{
    private final String gameName;//the title of the game
    private ArrayList<Players> attribute;
	/**
	 * the title of the game
	 */
	private Collection<Players> players;// the players of the game
    
    public Game(String givenName)
    {
        gameName = givenName;
        players = new ArrayList();
    }

    /**
     * @return the gameName
     */
    public String getGameName() 
    {
        return gameName;
    }
    
     /**
     * @return the players of this game
     */
    public ArrayList<Players> getAttribute() 
    {
        return attribute;
    }

    /**
     * @param players the players of this game
     */
    public void setAttribute(ArrayList<Players> players) 
    {
        this.attribute = players;
    }
    
    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    public abstract void play();
    
    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public abstract void declareWinner();

	public Collection<Players> getPlayers() {
		return this.players;
	}

	public void setPlayers(Collection<Players> players) {
		this.players = players;
	}

   
    
}//end class
