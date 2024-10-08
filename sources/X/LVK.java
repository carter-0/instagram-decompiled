package X;

import android.media.MediaPlayer;

public final class LVK implements MediaPlayer.OnPreparedListener {
    public static final LVK A00 = new LVK();

    public final void onPrepared(MediaPlayer mediaPlayer) {
        0qQ.A0B(mediaPlayer, 0);
        mediaPlayer.setVolume(0.0f, 0.0f);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }
}
