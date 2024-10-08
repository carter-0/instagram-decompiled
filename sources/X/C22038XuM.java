package X;

import android.media.MediaRecorder;

/* renamed from: X.XuM  reason: case insensitive filesystem */
public final class C22038XuM implements MediaRecorder.OnErrorListener {
    public final /* synthetic */ C22260XyI A00;

    public C22038XuM(C22260XyI xyI) {
        this.A00 = xyI;
    }

    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        this.A00.A01.DQi(mediaRecorder, i, i2, true);
    }
}
