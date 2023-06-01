package com.example.androidgamedevelopment.map;

import android.graphics.Canvas;
import android.graphics.Rect;

import com.example.androidgamedevelopment.graphics.Sprite;
import com.example.androidgamedevelopment.graphics.SpriteSheet;

public class LavaTile extends Tile {
    private final Sprite sprite;

    public LavaTile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        sprite = spriteSheet.getLavaSprite();
    }

    @Override
    public void draw(Canvas canvas) {
        sprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
