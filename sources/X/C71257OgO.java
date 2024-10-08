package X;

import android.media.MediaPlayer;
import android.widget.VideoView;

/* renamed from: X.OgO  reason: case insensitive filesystem */
public final class C71257OgO implements MediaPlayer.OnCompletionListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71257OgO(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (this.A00 != 0) {
            C62320sa r0 = ((AnonymousClass4AL) this.A02).A07;
            if (r0 != null && !C51971G9r.A1b(r0)) {
                ((VideoView) this.A01).start();
                return;
            }
            return;
        }
        ((0sP) this.A01).invoke((Object) null);
        mediaPlayer.release();
        C51965G9l.A1W(this.A02, (Object) null);
    }
}
