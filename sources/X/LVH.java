package X;

import android.media.MediaPlayer;

public final class LVH implements MediaPlayer.OnErrorListener {
    public static final LVH A00 = new LVH();

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        return true;
    }
}
