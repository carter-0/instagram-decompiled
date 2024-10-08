package X;

import android.media.MediaCodec;
import android.os.Handler;

/* renamed from: X.Y1c  reason: case insensitive filesystem */
public final class C22374Y1c implements Runnable {
    public final /* synthetic */ XIK A00;

    public C22374Y1c(XIK xik) {
        this.A00 = xik;
    }

    public final void run() {
        MediaCodec mediaCodec;
        long j;
        XIK xik = this.A00;
        if (xik.A08 == AnonymousClass05K.A0C && (mediaCodec = xik.A01) != null) {
            int i = 1;
            try {
                int dequeueInputBuffer = mediaCodec.dequeueInputBuffer((long) xik.A04.A04);
                if (dequeueInputBuffer >= 0) {
                    i = xik.A01(xik.A01, dequeueInputBuffer);
                }
                XIK.A00(xik.A01, xik);
            } catch (Exception e) {
                xik.A06.A01(e);
            }
            Handler handler = xik.A03;
            Runnable runnable = xik.A01;
            if (i == 0) {
                j = 0;
            } else {
                j = xik.A00;
            }
            handler.postDelayed(runnable, j);
        }
    }
}
