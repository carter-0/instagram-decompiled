package X;

import android.media.MediaRecorder;

/* renamed from: X.SVo  reason: case insensitive filesystem */
public final class C11451SVo implements MediaRecorder.OnErrorListener {
    public final /* synthetic */ Q2G A00;

    public C11451SVo(Q2G q2g) {
        this.A00 = q2g;
    }

    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (i == 100) {
            str = "MediaRecorder server died. Code: ";
        } else {
            str = "Unknown MediaRecorder error. Code: ";
        }
        Q2G.A00(this.A00, AnonymousClass7TE.A0z(Pxg.A0t(str, A1A, i2)));
    }
}
