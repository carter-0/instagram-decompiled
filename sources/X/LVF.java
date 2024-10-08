package X;

import android.media.MediaPlayer;

public final class LVF implements MediaPlayer.OnErrorListener {
    public static final LVF A00 = new LVF();

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        return true;
    }
}
