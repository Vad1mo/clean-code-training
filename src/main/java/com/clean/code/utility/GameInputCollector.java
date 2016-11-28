package com.clean.code.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class to collect inputs from players.
 * 
 * @author kg00
 *
 */
public class GameInputCollector {
	
	private GameInputCollector(){
		
	}
	
	public static List<String> collectPlayerInputs(){
		
		List<String> playerInputs = new ArrayList<>(2);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select any 1 item from - rock, paper or scissors.");
		String player1Input = scanner.next();
		String player2Input = scanner.next();
		playerInputs.add(player1Input);
		playerInputs.add(player2Input);
		scanner.close();
		return playerInputs;
	}
}
