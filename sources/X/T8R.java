package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;

public final class T8R implements C13808ThX {
    public MediaCodec A00;
    public MediaFormat A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final S70 A05;

    public T8R(S70 s70, int i, int i2) {
        0qQ.A0B(s70, 1);
        this.A05 = s70;
        this.A03 = i;
        this.A04 = i2;
    }

    public final void cancel() {
        this.A02 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b3, code lost:
        if (r1 == null) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b5, code lost:
        X.0fX.A03(r1, -237215854);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bb, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bc A[EDGE_INSN: B:53:0x00bc->B:51:0x00bc ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cp8(long r21, long r23) {
        /*
            r20 = this;
            android.media.MediaCodec$BufferInfo r2 = new android.media.MediaCodec$BufferInfo
            r2.<init>()
            r3 = r20
            int r0 = r3.A04
            long r0 = (long) r0
            long r23 = r23 * r0
            int r0 = r3.A03
            long r0 = (long) r0
            long r23 = r23 * r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r23 = r23 / r0
            r5 = 2048(0x800, float:2.87E-42)
            byte[] r4 = new byte[r5]
            r15 = 0
            r11 = 0
            r9 = 0
        L_0x001e:
            java.lang.String r10 = "codec"
            if (r9 != 0) goto L_0x00b1
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x00b1
            r0 = 10000(0x2710, double:4.9407E-320)
            int r7 = (r11 > r23 ? 1 : (r11 == r23 ? 0 : -1))
            android.media.MediaCodec r6 = r3.A00
            if (r7 < 0) goto L_0x0086
            if (r6 == 0) goto L_0x00bc
            int r14 = r6.dequeueInputBuffer(r0)
            if (r14 < 0) goto L_0x0043
            android.media.MediaCodec r13 = r3.A00
            if (r13 == 0) goto L_0x00bc
            r17 = 0
            r19 = 4
            r16 = r15
        L_0x0040:
            r13.queueInputBuffer(r14, r15, r16, r17, r19)
        L_0x0043:
            android.media.MediaCodec r6 = r3.A00
            if (r6 == 0) goto L_0x00bc
            r0 = 0
            int r8 = r6.dequeueOutputBuffer(r2, r0)
            r9 = 0
        L_0x004e:
            r6 = -1
            if (r8 == r6) goto L_0x001e
            if (r8 < 0) goto L_0x007d
            android.media.MediaCodec r6 = r3.A00
            if (r6 == 0) goto L_0x00bc
            java.nio.ByteBuffer r7 = r6.getOutputBuffer(r8)
            X.S70 r6 = r3.A05     // Catch:{ Exception -> 0x0061 }
            r6.A00(r2, r7)     // Catch:{ Exception -> 0x0061 }
            goto L_0x006f
        L_0x0061:
            r7 = move-exception
            java.lang.Class<X.T8R> r6 = X.T8R.class
            java.lang.String r6 = r6.getSimpleName()
            X.0qQ.A07(r6)
            X.0wb.A07(r6, r7)
            r9 = 1
        L_0x006f:
            int r6 = r2.flags
            r6 = r6 & 4
            if (r6 == 0) goto L_0x0076
            r9 = 1
        L_0x0076:
            android.media.MediaCodec r6 = r3.A00
            if (r6 == 0) goto L_0x00bc
            r6.releaseOutputBuffer(r8, r15)
        L_0x007d:
            android.media.MediaCodec r6 = r3.A00
            if (r6 == 0) goto L_0x00bc
            int r8 = r6.dequeueOutputBuffer(r2, r0)
            goto L_0x004e
        L_0x0086:
            if (r6 == 0) goto L_0x00bc
            int r6 = r6.dequeueInputBuffer(r0)
            if (r6 < 0) goto L_0x0043
            r0 = 1024(0x400, double:5.06E-321)
            long r11 = r11 + r0
            android.media.MediaCodec r0 = r3.A00
            if (r0 == 0) goto L_0x00bc
            java.nio.ByteBuffer r0 = r0.getInputBuffer(r6)
            if (r0 == 0) goto L_0x00a4
            r0.clear()
            r0.position(r15)
            r0.put(r4)
        L_0x00a4:
            android.media.MediaCodec r0 = r3.A00
            if (r0 == 0) goto L_0x00bc
            r17 = 0
            r19 = 1
            r13 = r0
            r14 = r6
            r16 = r5
            goto L_0x0040
        L_0x00b1:
            android.media.MediaCodec r1 = r3.A00
            if (r1 == 0) goto L_0x00bc
            r0 = -237215854(0xfffffffff1dc5f92, float:-2.1824717E30)
            X.0fX.A03(r1, r0)
            return
        L_0x00bc:
            X.0qQ.A0F(r10)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T8R.Cp8(long, long):void");
    }

    public final void E40() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "audio/mp4a-latm");
        mediaFormat.setInteger("aac-profile", 2);
        mediaFormat.setInteger("sample-rate", this.A04);
        mediaFormat.setInteger("channel-count", this.A03);
        mediaFormat.setInteger(TraceFieldType.Bitrate, 64000);
        this.A01 = mediaFormat;
        MediaCodec A022 = 0fX.A02("audio/mp4a-latm", 1658431799);
        this.A00 = A022;
        String str = "codec";
        if (A022 != null) {
            MediaFormat mediaFormat2 = this.A01;
            if (mediaFormat2 == null) {
                str = "audioFormat";
            } else {
                0fX.A07(A022, (MediaCrypto) null, mediaFormat2, (Surface) null, 1, 1769226264);
                MediaCodec mediaCodec = this.A00;
                if (mediaCodec != null) {
                    0fX.A05(mediaCodec, 1041434947);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void ExD() {
        S70 s70 = this.A05;
        MediaFormat mediaFormat = this.A01;
        if (mediaFormat == null) {
            0qQ.A0F("audioFormat");
            throw AnonymousClass00P.createAndThrow();
        } else {
            s70.A02(mediaFormat);
        }
    }
}
