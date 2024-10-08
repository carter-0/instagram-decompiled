package X;

import android.media.MediaCodec;

public final class TJK implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ T8S A02;

    public TJK(T8S t8s, int i, long j) {
        this.A02 = t8s;
        this.A00 = i;
        this.A01 = j;
    }

    public final void run() {
        T8S t8s = this.A02;
        t8s.A02.queueInputBuffer(this.A00, 0, t8s.A06, t8s.A00, 0);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int dequeueOutputBuffer = t8s.A02.dequeueOutputBuffer(bufferInfo, 10000);
        if (dequeueOutputBuffer >= 0) {
            try {
                t8s.A0A.A00(bufferInfo, t8s.A02.getOutputBuffer(dequeueOutputBuffer));
            } catch (Exception e) {
                t8s.A03 = e;
                t8s.A0B.countDown();
            }
            t8s.A02.releaseOutputBuffer(dequeueOutputBuffer, false);
        }
        long j = t8s.A00 + this.A01;
        t8s.A00 = j;
        if (j >= t8s.A01) {
            t8s.A03 = null;
            t8s.A0B.countDown();
            return;
        }
        C10730Rx9 rx9 = t8s.A09;
        if (rx9.A04) {
            rx9.A03.processNext();
        }
    }
}
