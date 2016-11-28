package com.clean.code.gaming.injector;

import com.clean.code.RockPaperGame;
import com.clean.code.gaming.api.GamingServiceConsumer;
import com.clean.code.gaming.api.GamingServiceInjector;
import com.clean.code.gaming.service.GamingServiceImpl;

/**
 * Dependency Injector for GamingServiceImpl.
 * 
 * @author kg00
 *
 */
public class GamingServiceInjectorImpl implements GamingServiceInjector {

	/**
	 * RockPaperGame creation with GamingService initialized.
	 * 
	 */
	@Override
	public GamingServiceConsumer getConsumer() {
		return new RockPaperGame(new GamingServiceImpl());
	}
}
