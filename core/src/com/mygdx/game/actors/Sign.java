package com.mygdx.game.actors;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.game.base_classes.BaseActor;

public class Sign extends BaseActor {

    private String text;
    private boolean viewing;

    public Sign(float x, float y, Stage s) {
        super(x, y, s);
        loadTexture("sign.png");
        text = " ";
        viewing = false;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setViewing(boolean viewing) {
        this.viewing = viewing;
    }

    public String getText() {
        return text;
    }

    public boolean isViewing() {
        return viewing;
    }
}
