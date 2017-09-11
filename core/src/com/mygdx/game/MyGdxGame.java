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
	AnimatedSprite spaceshipAnimated;

	@Override
	public void create () {
		//Texture.setEnforcePotImages(false);
		batch = new SpriteBatch();
		img = new Texture("Space-Background.png");
	   // Texture spaceshipTexture = new Texture("SpaceShip1.png"); animacion de imagen 1
		Texture spaceshipTexture = new Texture("SpaceShip2.png");
        spaceshipSprite = new Sprite(spaceshipTexture);
	    spaceshipSprite.setPosition(650/2, 0);
	    spaceshipAnimated = new AnimatedSprite(spaceshipSprite);
	    
	}
	

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
	   // spaceshipSprite.draw(batch); Anima la imagen1
		spaceshipAnimated.draw(batch);
		batch.end();
		
		//Animacion en eje X y Y sand Gdx.input.isToched
		handleInput();
		spaceshipAnimated.move();
	}


	private void handleInput() {
		if(Gdx.input.isTouched()) //Indica qe si se toca la pnatalla o una tecla a la derecha o izq
		{
			int xTouch = Gdx.input.getX();
			
			if (xTouch > spaceshipAnimated.getX())
			{
			spaceshipAnimated.moveRight();
			}
			else
			{
			spaceshipAnimated.moveLefth();	
			}
		}
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
