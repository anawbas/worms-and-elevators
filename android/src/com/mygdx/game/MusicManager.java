package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;

/**
 * Created by Patrick on 09.04.2017.
 * Music and Sound are handled the same way. The difference is, that soundfiles are loaded into the ram (only for small files) and musicfiles are streamed.
 * Only for the game not for the Activities.
 */
public class MusicManager {

    private Music gameMusic;
    private Sound diceSound;
    private Sound finish;
    private Sound move;

    /**
     * Instantiates a new Music manager.
     */
    public MusicManager() {

        this.gameMusic = Gdx.audio.newMusic(Gdx.files.internal("m.mp3"));
        this.diceSound = Gdx.audio.newSound(Gdx.files.internal("roll.wav"));
        this.move = Gdx.audio.newSound(Gdx.files.internal("wormSound.wav"));
        this.finish = Gdx.audio.newSound(Gdx.files.internal("finish.wav"));
    }

    /**
     * Start music.
     */
    public void startMusic() {
        this.gameMusic.setLooping(true);
        this.gameMusic.play();
    }

    /**
     * Shuffle.
     */
    public void shuffle() {
        this.diceSound.play();
    }

    /**
     * Worm sound.
     */
    public void wormSound() {
        this.move.play();
    }

    /**
     * Finish sound.
     */
    public void finishSound() {
        this.finish.play();
    }
}
