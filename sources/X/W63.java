package X;

import android.media.MediaPlayer;

public final class W63 implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ UKD A00;

    public W63(UKD ukd) {
        this.A00 = ukd;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        UKD ukd = this.A00;
        MediaPlayer mediaPlayer2 = ukd.A00;
        if (mediaPlayer2 == null) {
            return true;
        }
        mediaPlayer2.release();
        ukd.A00 = null;
        return true;
    }
}
