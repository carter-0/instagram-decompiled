package X;

import android.media.MediaPlayer;

/* renamed from: X.OgW  reason: case insensitive filesystem */
public final class C71265OgW implements MediaPlayer.OnPreparedListener {
    public static final C71265OgW A00 = new C71265OgW();

    public final void onPrepared(MediaPlayer mediaPlayer) {
        0qQ.A0B(mediaPlayer, 0);
        if (!mediaPlayer.isPlaying()) {
            mediaPlayer.start();
        }
        mediaPlayer.setLooping(true);
    }
}
