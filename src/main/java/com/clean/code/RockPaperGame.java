package com.clean.code;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

import com.clean.code.gaming.api.GamingService;
import com.clean.code.gaming.api.GamingServiceConsumer;

/**
 * Rock Paper & Scissors Game class.
 * 
 * @author kg00
 *
 */
public class RockPaperGame implements GamingServiceConsumer{
	
	private GamingService gamingService;
	
	public RockPaperGame(GamingService gamingService){
		this.gamingService = gamingService;
	}

	@SuppressWarnings("resource")
	@Override
	public void playGame() {
		Scanner scanner = new Scanner(System.in);
		do{			
			System.out.println("Select any 1 item from - rock, paper or scissors.");
			String player1Input = scanner.next();
			String player2Input = scanner.next();
			System.out.println(this.gamingService.determineGameWinner(player1Input, player2Input));
			System.out.println("Do you want to continue: (Y/N)");
		}while(StringUtils.equalsIgnoreCase("Y", scanner.next()));
		
	}

}
