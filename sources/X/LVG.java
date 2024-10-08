package X;

import android.media.MediaPlayer;

public final class LVG implements MediaPlayer.OnErrorListener {
    public static final LVG A00 = new LVG();

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        return true;
    }
}
