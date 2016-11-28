package com.clean.code.gaming.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GamingServiceImplTest {
	
	private static final String ROCK_WINS = "Rock crushes Scissors. Rock wins.";
	private static final String PAPER_WINS = "Paper covers Rock. Paper wins.";
	private static final String SCISSOR_WINS = "Scissors cut Paper. Scissors wins.";
	private static final String INVALID_INPUTS = "Invalid Selected Items. Please try again.";
	private static final String GAME_TIED = "Game Tied.";
	private static final String ROCK = "Rock";
	private static final String PAPER = "Paper";
	private static final String SCISSORS = "Scissors";
	
	private GamingServiceImpl classToUnitTest = new GamingServiceImpl();
	
	@Test
	public void checkForWinnerReturnsTrueWhenRockIsWinnerTypeAndOpponetTypeIsNotPaper(){
		assertTrue(classToUnitTest.checkForWinner("rock", "scissors", ROCK, PAPER));
	}
	
	@Test
	public void checkForWinnerReturnsFalseWhenRockIsWinnerTypeAndOpponetTypeIsNotPaper(){
		assertFalse(classToUnitTest.checkForWinner("rock", "paper",  ROCK, PAPER));
	}
	
	@Test
	public void determineGameWinnerReturnsInvalidMessageWhenBothPlayerInputsAreBlank(){
		assertEquals(classToUnitTest.determineGameWinner("", null), INVALID_INPUTS);
	}
	
	@Test
	public void determineGameWinnerReturnsRockWinnerMessageWhenBothPlayer1InputIsRockAndPlayer2InputIsNotPaper(){
		assertEquals(classToUnitTest.determineGameWinner(ROCK, SCISSORS), ROCK_WINS);
	}
	
	@Test
	public void determineGameWinnerReturnsRockWinnerMessageWhenBothPlayer2InputIsRockAndPlayer1InputIsNotPaper(){
		assertEquals(classToUnitTest.determineGameWinner(SCISSORS, ROCK), ROCK_WINS);
	}
	
	@Test
	public void determineGameWinnerReturnsPaperWinnerMessageWhenBothPlayer1InputIsPaperAndPlayer2InputIsNotScissors(){
		assertEquals(classToUnitTest.determineGameWinner(PAPER, ROCK), PAPER_WINS);
	}
	
	@Test
	public void determineGameWinnerReturnsPaperWinnerMessageWhenBothPlayer2InputIsPaperAndPlayer1InputIsNotScissors(){
		assertEquals(classToUnitTest.determineGameWinner(ROCK, PAPER), PAPER_WINS);
	}
	
	@Test
	public void determineGameWinnerReturnsScissorWinnerMessageWhenBothPlayer1InputIsScissorAndPlayer2InputIsNotRock(){
		assertEquals(classToUnitTest.determineGameWinner(SCISSORS, PAPER), SCISSOR_WINS);
	}
	
	@Test
	public void determineGameWinnerReturnsScissorWinnerMessageWhenBothPlayer2InputIsScissorAndPlayer1InputIsNotRock(){
		assertEquals(classToUnitTest.determineGameWinner(PAPER, SCISSORS), SCISSOR_WINS);
	}
	
	@Test
	public void determineGameWinnerReturnsGameTiedMessageWhenBothPlayerInputsAreNonBlankAndSame(){
		assertEquals(classToUnitTest.determineGameWinner(PAPER, PAPER), GAME_TIED);
	}
}
