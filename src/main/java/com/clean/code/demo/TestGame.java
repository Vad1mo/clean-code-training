package com.clean.code.demo;

import com.clean.code.gaming.api.GamingServiceConsumer;
import com.clean.code.gaming.api.GamingServiceInjector;
import com.clean.code.gaming.injector.GamingServiceInjectorImpl;

public class TestGame {

	public static void main(String[] args) {
		GamingServiceInjector injector = new GamingServiceInjectorImpl();
		GamingServiceConsumer game = injector.getConsumer();
		game.playGame();

	}
}
