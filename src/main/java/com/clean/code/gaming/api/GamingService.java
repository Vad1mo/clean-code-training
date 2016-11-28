package com.clean.code.gaming.api;

/**
 * Interface definition for Rock Paper Scissor Gaming Result Finder.
 * 
 * @author kg00
 *
 */
@FunctionalInterface
public interface GamingService {
	
	String determineGameWinner(String player1Input, String player2Input);
}
