package X;

import android.media.MediaPlayer;

/* renamed from: X.OgV  reason: case insensitive filesystem */
public final class C71264OgV implements MediaPlayer.OnPreparedListener {
    public static final C71264OgV A00 = new C71264OgV();

    public final void onPrepared(MediaPlayer mediaPlayer) {
        0qQ.A0B(mediaPlayer, 0);
        mediaPlayer.setLooping(true);
        mediaPlayer.setVolume(0.0f, 0.0f);
    }
}
