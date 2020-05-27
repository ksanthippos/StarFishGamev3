package com.mygdx.game;

import com.mygdx.game.base_classes.BaseGame;
import com.mygdx.game.screens.MenuScreen;

public class StarFishGame extends BaseGame {

	@Override
	public void create() {
		super.create();
		setActiveScreen(new MenuScreen());
	}

}
