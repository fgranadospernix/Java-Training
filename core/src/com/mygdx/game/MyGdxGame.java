package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Sprite spaceshipSprite;

	@Override
	public void create () {
		//Texture.setEnforcePotImages(false);
		batch = new SpriteBatch();
		img = new Texture("Space-Background.png");
	    Texture spaceshipTexture = new Texture("SpaceShip1.png");
        spaceshipSprite = new Sprite(spaceshipTexture);
	    spaceshipSprite.setPosition(650/2, 0);
	
	
	}
	

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
	    spaceshipSprite.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
