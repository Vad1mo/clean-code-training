package com.clean.code.gaming.service;

import org.apache.commons.lang3.StringUtils;

import com.clean.code.gaming.api.GamingService;

/**
 * Implementation for all method definition in RockPaperGamingService.
 * 
 * @author kg00
 *
 */
public class GamingServiceImpl implements GamingService {
	
	private static final String ROCK_WINS = "Rock crushes Scissors. Rock wins.";
	private static final String PAPER_WINS = "Paper covers Rock. Paper wins.";
	private static final String SCISSOR_WINS = "Scissors cut Paper. Scissors wins.";
	private static final String INVALID_INPUTS = "Invalid Selected Items. Please try again.";
	private static final String GAME_TIED = "Game Tied.";
	private static final String ROCK = "Rock";
	private static final String PAPER = "Paper";
	private static final String SCISSORS = "Scissors";

	/**
	 * Method to determine winner of the game.
	 * 
	 * @param String - player1Input
	 * @param String - player2Input
	 */
	@Override
	public String determineGameWinner(String player1Input, String player2Input) {
	
		if(StringUtils.equalsIgnoreCase(player1Input, player2Input)){
			return GAME_TIED;
		}else if(determineIfRockIsWinner(player1Input, player2Input)){
			return ROCK_WINS;
		}else if(determineIfPaperIsWinner(player1Input, player2Input)){
			return PAPER_WINS;
		}else if(determineIfScissorsIsWinner(player1Input, player2Input)){
			return SCISSOR_WINS;
		}else{
			return INVALID_INPUTS;
		}
	}

	/**
	 * Condition for Rock Win criteria.
	 * 
	 * @param String - player1Input
	 * @param String - player2Input
	 * 
	 * @return boolean
	 */
	protected boolean determineIfRockIsWinner(String player1Input, String player2Input) {
		return checkForWinner(player1Input, player2Input, ROCK, PAPER);
	}

	/**
	 * Condition for Paper Win criteria.
	 * 
	 * @param String - player1Input
	 * @param String - player2Input
	 * 
	 * @return boolean
	 */
	protected boolean determineIfPaperIsWinner(String player1Input, String player2Input) {
		return checkForWinner(player1Input, player2Input, PAPER, SCISSORS);
	}

	/**
	 * Condition for Scissors Win criteria.
	 * 
	 * @param String - player1Input
	 * @param String - player2Input
	 * 
	 * @return boolean
	 */
	protected boolean determineIfScissorsIsWinner(String player1Input, String player2Input) {
		return checkForWinner(player1Input, player2Input, SCISSORS, ROCK);
	}
	
	/**
	 * Condition to check for a Winner based on Winner & Opponent Type checks.
	 * 
	 * @param String - player1Input
	 * @param String - player2Input
	 * @param String - winnerType
	 * @param String - opponentType
	 * 
	 * @return boolean
	 */
	protected boolean checkForWinner(String player1Input, String player2Input, String winnerType, String opponentType){
		return (winnerType.equalsIgnoreCase(player1Input) && !opponentType.equalsIgnoreCase(player2Input))
				|| (winnerType.equalsIgnoreCase(player2Input) && !opponentType.equalsIgnoreCase(player1Input));
	}
}
