package com.mygdx.game.actors;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.game.base_classes.BaseActor;

public class Whirlpool extends BaseActor {

    public Whirlpool(float x, float y, Stage s) {
        super(x, y, s);
        loadAnimationFromSheet("images/whirlpool.png", 2, 5, 0.1f, false);
    }

    @Override
    public void act(float dt) {
        super.act(dt);
        if (isAnimationFinished())
            remove();
    }


}
