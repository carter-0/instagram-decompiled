package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Locale;

public final class Q17 {
    public MediaFormat A00;
    public String A01;
    public ByteBuffer[] A02;
    public ByteBuffer[] A03;
    public final long A04;
    public final MediaCodec A05;
    public final Surface A06;
    public final Integer A07;
    public final StringBuilder A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final Q1A A00(long j) {
        ByteBuffer byteBuffer;
        boolean z = false;
        if (this.A06 == null) {
            z = true;
        }
        C266784aL.A06(z, (String) null);
        MediaCodec mediaCodec = this.A05;
        int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(j);
        if (dequeueInputBuffer < 0) {
            return null;
        }
        if (this.A09) {
            byteBuffer = mediaCodec.getInputBuffer(dequeueInputBuffer);
        } else {
            byteBuffer = this.A02[dequeueInputBuffer];
        }
        return new Q1A(dequeueInputBuffer, byteBuffer, (MediaCodec.BufferInfo) null);
    }

    public final Q1A A01(long j) {
        String str;
        Q1A q1a;
        ByteBuffer byteBuffer;
        C349257zq.A03("MediaCodecWrapper.dequeueNextOutputBuffer()");
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            C349257zq.A03("MediaCodecWrapper.dequeueOutputBuffer()");
            MediaCodec mediaCodec = this.A05;
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j);
            C349257zq.A01();
            if (dequeueOutputBuffer >= 0) {
                if (this.A09) {
                    byteBuffer = mediaCodec.getOutputBuffer(dequeueOutputBuffer);
                } else {
                    byteBuffer = this.A03[dequeueOutputBuffer];
                }
                q1a = new Q1A(dequeueOutputBuffer, byteBuffer, bufferInfo);
            } else {
                if (dequeueOutputBuffer == -3) {
                    C349257zq.A03("MediaCodecWrapper.buffersChanged()");
                    this.A03 = mediaCodec.getOutputBuffers();
                    C349257zq.A01();
                } else if (dequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = mediaCodec.getOutputFormat();
                    this.A00 = outputFormat;
                    this.A01 = 002.A0R(this.A01, String.format(Locale.US, "New output format: %s", new Object[]{outputFormat}));
                    q1a = new Q1A(-1, (ByteBuffer) null, (MediaCodec.BufferInfo) null);
                    q1a.A01 = true;
                }
                C349257zq.A01();
                return null;
            }
            C349257zq.A01();
            return q1a;
        } catch (Throwable th) {
            C349257zq.A01();
            throw th;
        }
    }

    public final void A02() {
        StringBuilder sb = this.A08;
        sb.append("startB,");
        MediaCodec mediaCodec = this.A05;
        0fX.A05(mediaCodec, 1807375446);
        if (this.A06 == null) {
            this.A02 = mediaCodec.getInputBuffers();
        }
        this.A03 = mediaCodec.getOutputBuffers();
        sb.append("startE,");
    }

    public final void A03(Q1A q1a) {
        MediaCodec mediaCodec = this.A05;
        int i = q1a.A02;
        MediaCodec.BufferInfo bufferInfo = q1a.A00;
        mediaCodec.queueInputBuffer(i, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
    }

    public final void A04(Q1A q1a, boolean z) {
        C349257zq.A03("MediaCodecWrapper.releaseOutputBuffer");
        int i = q1a.A02;
        if (i >= 0) {
            this.A05.releaseOutputBuffer(i, z);
        }
        C349257zq.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r5 == X.AnonymousClass05K.A01) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Q17(android.media.MediaCodec r3, android.view.Surface r4, java.lang.Integer r5, java.lang.String r6, long r7, boolean r9, boolean r10, boolean r11) {
        /*
            r2 = this;
            r2.<init>()
            if (r4 == 0) goto L_0x000a
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1 = 0
            if (r5 != r0) goto L_0x000b
        L_0x000a:
            r1 = 1
        L_0x000b:
            r0 = 0
            X.C266784aL.A06(r1, r0)
            r2.A07 = r5
            r2.A05 = r3
            r2.A06 = r4
            r2.A0A = r9
            r2.A01 = r6
            r2.A09 = r10
            r2.A0B = r11
            r2.A04 = r7
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            r2.A08 = r1
            java.lang.String r0 = "MediaCodecWrapper "
            r1.append(r0)
            int r0 = r2.hashCode()
            r1.append(r0)
            java.lang.String r0 = " ctor codec="
            r1.append(r0)
            int r0 = r3.hashCode()
            r1.append(r0)
            java.lang.String r0 = ","
            r1.append(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q17.<init>(android.media.MediaCodec, android.view.Surface, java.lang.Integer, java.lang.String, long, boolean, boolean, boolean):void");
    }
}
