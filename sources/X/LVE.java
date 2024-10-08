package X;

import android.media.MediaPlayer;

public final class LVE implements MediaPlayer.OnCompletionListener {
    public static final LVE A00 = new LVE();

    public final void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.reset();
    }
}
