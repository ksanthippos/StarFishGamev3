package com.mygdx.game.actors;

import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.mygdx.game.base_classes.BaseActor;

public class Starfish extends BaseActor {

    public boolean collected;

    public Starfish(float x, float y, Stage s) {
        super(x, y, s);
        collected = false;
        loadTexture("starfish.png");

        // boundaries
        setBoundaryPolygon(8);

        Action spin = Actions.rotateBy(30, 1);
        this.addAction(Actions.forever(spin));
    }

}
