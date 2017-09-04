package elnino.androidmedia;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool soundPool;
    private int key1Sound;
    private int key2Sound;
    private int key3Sound;
    private int key4Sound;
    private int key5Sound;
    private int key6Sound;
    private int key7Sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundPool = new SoundPool(7, AudioManager.STREAM_MUSIC, 0);

        key1Sound = soundPool.load(getApplicationContext(), R.raw.key1, 1);
        key2Sound = soundPool.load(getApplicationContext(), R.raw.key2, 1);
        key3Sound = soundPool.load(getApplicationContext(), R.raw.key3, 1);
        key4Sound = soundPool.load(getApplicationContext(), R.raw.key4, 1);
        key5Sound = soundPool.load(getApplicationContext(), R.raw.key5, 1);
        key6Sound = soundPool.load(getApplicationContext(), R.raw.key6, 1);
        key7Sound = soundPool.load(getApplicationContext(), R.raw.key7, 1);


    }

    public void playKey1(View view) {
        soundPool.play(key1Sound, 1.0f, 1.0f, 0, 0, 1);
    }

    public void playKey2(View view) {
        soundPool.play(key2Sound, 1.0f, 1.0f, 0, 0, 1);
    }

    public void playKey3(View view) {
        soundPool.play(key3Sound, 1.0f, 1.0f, 0, 0, 1);
    }

    public void playKey4(View view) {
        soundPool.play(key4Sound, 1.0f, 1.0f, 0, 0, 1);
    }

    public void playKey5(View view) {
        soundPool.play(key5Sound, 1.0f, 1.0f, 0, 0, 1);
    }

    public void playKey6(View view) {
        soundPool.play(key6Sound, 1.0f, 1.0f, 0, 0, 1);
    }

    public void playKey7(View view) {
        soundPool.play(key7Sound, 1.0f, 1.0f, 0, 0, 1);
    }
}
