package X;

import android.media.MediaPlayer;

public final class LVD implements MediaPlayer.OnCompletionListener {
    public static final LVD A00 = new LVD();

    public final void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.reset();
    }
}
