//********************************************************************
//  Card.java       Java Foundations
//
//  Solution to Programming Project 5.13
//********************************************************************

public class Card
{

	private int face, suit;
	private String faceName, suitName;

	//-----------------------------------------------------------------
	//  Creates a random card.
	//-----------------------------------------------------------------
	public Card()
	{
		
	}

	//-----------------------------------------------------------------
	//  Creates a card of the specified suit and face value.
	//-----------------------------------------------------------------
	public Card(int faceValue, int suitValue)
	{
		
	}

	//-----------------------------------------------------------------
	//  Sets the string representation of the face using its stored
	//  numeric value.
	//-----------------------------------------------------------------
	private void setFaceName()
	{
		
	}

	//-----------------------------------------------------------------
	//  Sets the string representation of the suit using its stored
	//  numeric value.
	//-----------------------------------------------------------------
	private void setSuitName()
	{
	
	}

	//-----------------------------------------------------------------
	//  Determines if this card is higher than the passed card. The
	//  second parameter determines if aces should be considered high
	//  (beats a King) or low (lowest of all cards).  Uses the suit
	//  if both cards have the same face.
	//-----------------------------------------------------------------
	public boolean isHigherThan(Card card2, boolean aceHigh)
	{
		
	}

	//-----------------------------------------------------------------
	//  Determines if this card is higher than the passed card,
	//  assuming that aces should be considered high.
	//-----------------------------------------------------------------
	public boolean isHigherThan(Card card2)
	{
		
	}

	//-----------------------------------------------------------------
	//  Returns the face (numeric value) of this card.
	//-----------------------------------------------------------------
	public int getFace()
	{
		
	}

	//-----------------------------------------------------------------
	//  Returns the suit (numeric value) of this card.
	//-----------------------------------------------------------------
	public int getSuit()
	{
		
	}

	//-----------------------------------------------------------------
	//  Returns the face (string value) of this card.
	//-----------------------------------------------------------------
	public String getFaceName()
	{
		
	}

	//-----------------------------------------------------------------
	//  Returns the suit (string value) of this card.
	//-----------------------------------------------------------------
	public String getSuitName()
	{
		
	}

	//-----------------------------------------------------------------
	//  Returns the string representation of this card, including
	//  both face and suit. ex) "CLUBS of NINE"
	//-----------------------------------------------------------------
	public String toString()
	{
		
	}
}
