package X;

import android.media.MediaCodec;
import android.os.Handler;

public final class Y2U implements Runnable {
    public final /* synthetic */ C22252XyA A00;
    public final /* synthetic */ C22254XyC A01;

    public Y2U(C22252XyA xyA, C22254XyC xyC) {
        this.A01 = xyC;
        this.A00 = xyA;
    }

    public final void run() {
        C22254XyC xyC = this.A01;
        C22252XyA xyA = this.A00;
        Handler A002 = xyA.A00();
        xyC.A07.append("asyncStop, ");
        xyC.A03 = xyA;
        xyC.A02 = A002;
        MediaCodec mediaCodec = xyC.A00;
        if (mediaCodec != null) {
            try {
                mediaCodec.signalEndOfInputStream();
            } catch (IllegalStateException unused) {
                C22254XyC.A01(A002, xyA, xyC);
            }
        }
    }
}
