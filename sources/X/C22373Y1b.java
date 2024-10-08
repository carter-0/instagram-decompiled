package X;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: X.Y1b  reason: case insensitive filesystem */
public final class C22373Y1b implements Runnable {
    public final /* synthetic */ C22147XwB A00;

    public C22373Y1b(C22147XwB xwB) {
        this.A00 = xwB;
    }

    public final void run() {
        Y1G y1g;
        C341507n0 r0;
        C22147XwB xwB = this.A00;
        Integer num = xwB.A0B;
        Integer num2 = AnonymousClass05K.A0C;
        if (num == num2) {
            try {
                MediaCodec mediaCodec = xwB.A01;
                int dequeueInputBuffer = mediaCodec.dequeueInputBuffer((long) xwB.A05.A04);
                if (dequeueInputBuffer >= 0) {
                    ByteBuffer byteBuffer = mediaCodec.getInputBuffers()[dequeueInputBuffer];
                    byteBuffer.clear();
                    y1g = new Y1G(mediaCodec, byteBuffer, dequeueInputBuffer);
                    if (xwB.A0B == num2 && (r0 = xwB.A07.A00.A00) != null) {
                        r0.DKo(y1g);
                    }
                    y1g.close();
                }
            } catch (Exception e) {
                xwB.A04.A01("rARe");
                xwB.A08.A01(e);
            } catch (Throwable th) {
                C9153RRe.A00(th, th);
            }
            xwB.A03.post(xwB.A09);
            return;
        }
        return;
        throw th;
    }
}
