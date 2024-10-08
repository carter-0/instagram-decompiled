package X;

import android.media.MediaPlayer;

public final class W61 implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ UKD A00;

    public W61(UKD ukd) {
        this.A00 = ukd;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        UKD ukd = this.A00;
        MediaPlayer mediaPlayer2 = ukd.A00;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            ukd.A00 = null;
        }
    }
}
