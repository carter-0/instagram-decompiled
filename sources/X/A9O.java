package X;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Map;

public final class A9O {
    public A3P A00;
    public volatile boolean A01 = false;
    public final /* synthetic */ C341777nV A02;

    public A9O(C341777nV r2) {
        this.A02 = r2;
    }

    public final void A00(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        if (this.A01) {
            return;
        }
        if ((bufferInfo.flags & 4) != 0) {
            this.A01 = true;
            return;
        }
        C341777nV r8 = this.A02;
        if (r8.A0B.CTO(126)) {
            C341797nX r7 = r8.A0E;
            r7.A03++;
            int i = r7.A02 + 1;
            r7.A02 = i;
            long currentTimeMillis = System.currentTimeMillis();
            if (r7.A04 == 0) {
                r7.A04 = currentTimeMillis;
            }
            long j = r7.A06;
            if (j == 0) {
                r7.A07 = currentTimeMillis;
                r7.A06 = currentTimeMillis;
                j = currentTimeMillis;
            }
            if (currentTimeMillis > r7.A07 + 1000) {
                if (i < 30) {
                    r7.A05 += (long) (30 - i);
                    r7.A01 += 30 - i;
                }
                if (currentTimeMillis > j + 30000) {
                    r7.A09.add(Integer.valueOf(r7.A01));
                    r7.A01 = 0;
                    r7.A06 = currentTimeMillis;
                }
                r7.A07 = currentTimeMillis;
                r7.A02 = 0;
            }
        }
        synchronized (r8) {
            C341667nK r1 = r8.A03;
            if (r1 != null) {
                r1.A03(bufferInfo, C341767nU.VIDEO, byteBuffer);
            }
        }
    }

    public final void A01(Exception exc, Map map) {
        if (this.A00 != null) {
            C391719tX r2 = new C391719tX(23001, (Throwable) exc);
            r2.A01(map);
            C341777nV r0 = this.A02;
            r0.A0D.Cjv(r2, "inprogress_recording_video_failure", "AbstractVideoRecordingTrack", "", "VideoEncoderCallback", (Map) null, AnonymousClass7TE.A0Q(r0));
            C341627nG r1 = this.A00.A00;
            r1.A04(r2);
            r1.A07(new AUN());
        }
    }
}
