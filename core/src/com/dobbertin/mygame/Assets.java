package com.dobbertin.mygame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Assets {

	public static Texture texture_back;
	public static Sprite sprite_back;

	public static void load() {
		texture_back = new Texture(Gdx.files.internal("test.jpeg"));
		texture_back.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		sprite_back = new Sprite(texture_back);
		sprite_back.flip(false, true);
	}
}
