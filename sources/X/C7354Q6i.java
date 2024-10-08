package X;

import android.media.MediaPlayer;
import android.os.Handler;

/* renamed from: X.Q6i  reason: case insensitive filesystem */
public final class C7354Q6i extends MediaPlayer {
    public final MediaPlayer A00;

    public final void reset() {
        try {
            Object obj = Pxg.A10(MediaPlayer.class, "mEventHandler").get(this.A00);
            0qQ.A0C(obj, "null cannot be cast to non-null type android.os.Handler");
            ((Handler) obj).removeCallbacksAndMessages((Object) null);
        } catch (Exception e) {
            0wb.A03("CustomMediaPlayer", AnonymousClass7TF.A0m("Error during reflection on MediaPlayer: ", e));
        }
    }

    public C7354Q6i(MediaPlayer mediaPlayer) {
        this.A00 = mediaPlayer;
    }

    public final void release() {
        0nY.A00().ATE(new C8797R9y(this));
    }
}
