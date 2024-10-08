package X;

import android.media.MediaPlayer;

public final class I9N implements MediaPlayer.OnPreparedListener {
    public static final I9N A00 = new I9N();

    public final void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
    }
}
