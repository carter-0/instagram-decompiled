package X;

import android.media.MediaRecorder;

/* renamed from: X.XuN  reason: case insensitive filesystem */
public final class C22039XuN implements MediaRecorder.OnInfoListener {
    public final /* synthetic */ C22260XyI A00;

    public C22039XuN(C22260XyI xyI) {
        this.A00 = xyI;
    }

    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        this.A00.A01.DQi(mediaRecorder, i, i2, false);
    }
}
