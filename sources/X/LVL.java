package X;

import android.media.MediaPlayer;

public final class LVL implements MediaPlayer.OnPreparedListener {
    public static final LVL A00 = new LVL();

    public final void onPrepared(MediaPlayer mediaPlayer) {
        0qQ.A0B(mediaPlayer, 0);
        mediaPlayer.setLooping(true);
        mediaPlayer.setVolume(0.0f, 0.0f);
    }
}
