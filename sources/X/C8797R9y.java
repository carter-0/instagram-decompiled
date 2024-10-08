package X;

import android.media.MediaPlayer;

/* renamed from: X.R9y  reason: case insensitive filesystem */
public final class C8797R9y extends 0ng {
    public final /* synthetic */ C7354Q6i A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8797R9y(C7354Q6i q6i) {
        super(957719190, 2, false, false);
        this.A00 = q6i;
    }

    public final void run() {
        MediaPlayer mediaPlayer = this.A00.A00;
        mediaPlayer.reset();
        mediaPlayer.release();
    }
}
