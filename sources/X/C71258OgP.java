package X;

import android.media.MediaPlayer;

/* renamed from: X.OgP  reason: case insensitive filesystem */
public final class C71258OgP implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ 0sL A00;

    public C71258OgP(0sL r1) {
        this.A00 = r1;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        return AnonymousClass7TE.A1a(this.A00.invoke(Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
