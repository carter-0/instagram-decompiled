package X;

import java.util.concurrent.Callable;

/* renamed from: X.TNh  reason: case insensitive filesystem */
public final class C13149TNh implements Callable {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;

    public C13149TNh(int i, int i2, long j, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A01 = i;
        this.A04 = obj;
        this.A02 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a8, code lost:
        if (r5.A01 == null) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0223, code lost:
        if (r5.A01 == null) goto L_0x0225;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r20 = this;
            r6 = r20
            int r0 = r6.A00
            if (r0 == 0) goto L_0x010f
            java.lang.String r0 = "EncodeMuxerWrapper.setup"
            X.C349257zq.A03(r0)
            int r0 = r6.A01
            int r0 = r0 + -1
            android.os.Process.setThreadPriority(r0)
            java.lang.Object r10 = r6.A03
            X.Q4g r10 = (X.C7330Q4g) r10
            X.C349257zq.A01()
            r1 = 0
        L_0x001a:
            boolean r0 = r10.A0A
            if (r0 != 0) goto L_0x02ab
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L_0x02ab
            java.lang.String r0 = "EncodeMuxerWrapper.loop"
            X.C349257zq.A03(r0)
            java.lang.String r0 = "EncodeMuxerWrapper.dequeue"
            X.C349257zq.A03(r0)
            X.Tie r0 = r10.A09
            r2 = 250000(0x3d090, double:1.235164E-318)
            X.Q1A r9 = r0.AOj(r2)
            X.C349257zq.A01()
            if (r9 == 0) goto L_0x0069
            java.lang.String r0 = "EncodeMuxerWrapper.mux"
            X.C349257zq.A03(r0)
            java.lang.Object r8 = r6.A04
            X.Q1J r8 = (X.Q1J) r8
            long r11 = r6.A02
            int r0 = r9.A02
            if (r0 < 0) goto L_0x00b9
            android.media.MediaCodec$BufferInfo r13 = r9.A00
            int r0 = r13.flags
            r0 = r0 & 4
            r14 = 1
            if (r0 == 0) goto L_0x006f
            r1 = 1
        L_0x0059:
            X.C349257zq.A01()
            java.lang.String r0 = "EncodeMuxerWrapper.release"
            X.C349257zq.A03(r0)
            X.Tie r0 = r10.A09
            r0.ECi(r9)
            X.C349257zq.A01()
        L_0x0069:
            X.C349257zq.A01()
            if (r1 != 0) goto L_0x02ab
            goto L_0x001a
        L_0x006f:
            X.SJL r7 = r10.A04
            r7.A0R = r14
            long r4 = r13.presentationTimeUs
            long r2 = r7.A07
            r16 = 1
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00a4
            boolean r0 = r7.A0X
            if (r0 != 0) goto L_0x0087
            r7.A0X = r14
            long r0 = r4 - r2
            r7.A0D = r0
        L_0x0087:
            X.RzN r0 = r10.A06
            X.SOn r0 = r0.A06
            if (r0 == 0) goto L_0x00a4
            X.SJA r15 = r0.A0G
            if (r15 == 0) goto L_0x00a4
            int r0 = r15.A03
            if (r14 != r0) goto L_0x00a4
            X.RFa r1 = X.C8907RFa.CODEC_VIDEO_H264
            X.RFa r0 = r15.A04
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a4
            long r2 = r2 + r16
            r13.presentationTimeUs = r2
            r4 = r2
        L_0x00a4:
            double r2 = (double) r4
            double r0 = (double) r11
            double r2 = r2 / r0
            r0 = 0
            r8.A00(r0, r2)
            java.lang.String r0 = "EncodeMuxerWrapper.writeVideoSampleData"
            X.C349257zq.A03(r0)     // Catch:{ Exception -> 0x00fa }
            X.Q4j r0 = r10.A05     // Catch:{ Exception -> 0x00fa }
            r0.FOI(r9)     // Catch:{ Exception -> 0x00fa }
            X.C349257zq.A01()     // Catch:{ Exception -> 0x00fa }
            goto L_0x0100
        L_0x00b9:
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x010c
            java.lang.String r0 = "EncodeMuxerWrapper.initTracksAndStartMuxer"
            X.C349257zq.A03(r0)
            X.RzN r0 = r10.A06
            boolean r0 = r0.A0O
            if (r0 == 0) goto L_0x00e9
            android.media.MediaFormat r1 = r10.A02
            if (r1 == 0) goto L_0x00d5
            X.Q4j r0 = r10.A05
            r0.A03 = r1
            X.SJL r1 = r10.A04
            r0 = 1
            r1.A0O = r0
        L_0x00d5:
            X.C7330Q4g.A00(r10)
        L_0x00d8:
            X.Q4j r0 = r10.A05
            r0.start()
            X.SJL r1 = r10.A04
            java.lang.String r0 = r0.BVE()
            r1.A0J = r0
            X.C349257zq.A01()
            goto L_0x010c
        L_0x00e9:
            X.C7330Q4g.A00(r10)
            android.media.MediaFormat r1 = r10.A02
            if (r1 == 0) goto L_0x00d8
            X.Q4j r0 = r10.A05
            r0.A03 = r1
            X.SJL r1 = r10.A04
            r0 = 1
            r1.A0O = r0
            goto L_0x00d8
        L_0x00fa:
            long r0 = r7.A0B
            long r0 = r0 + r16
            r7.A0B = r0
        L_0x0100:
            android.media.MediaCodec$BufferInfo r0 = r9.A00
            long r0 = r0.presentationTimeUs
            r7.A07 = r0
            long r0 = r7.A0C
            long r0 = r0 + r16
            r7.A0C = r0
        L_0x010c:
            r1 = 0
            goto L_0x0059
        L_0x010f:
            java.lang.String r0 = "AudioEncodeMuxerWrapper.setup"
            X.C349257zq.A03(r0)
            int r0 = r6.A01
            int r0 = r0 + -1
            android.os.Process.setThreadPriority(r0)
            java.lang.Object r5 = r6.A03
            X.SsQ r5 = (X.C12376SsQ) r5
            X.C349257zq.A01()
            r3 = 0
        L_0x0123:
            boolean r0 = r5.A0C
            if (r0 != 0) goto L_0x02a6
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L_0x02a6
            java.lang.String r0 = "AudioEncodeMuxerWrapper.loop"
            X.C349257zq.A03(r0)
            X.S0W r0 = r5.A0B
            r1 = 5000(0x1388, double:2.4703E-320)
            X.Q17 r0 = r0.A00
            X.Q1A r4 = r0.A01(r1)
            if (r4 == 0) goto L_0x016b
            java.lang.Object r10 = r6.A04
            X.Q1J r10 = (X.Q1J) r10
            long r11 = r6.A02
            android.media.MediaCodec$BufferInfo r2 = r4.A00
            int r13 = r4.A02
            if (r13 < 0) goto L_0x01f6
            int r1 = r2.flags
            r0 = r1 & 2
            if (r0 != 0) goto L_0x02a3
            r0 = r1 & 4
            r1 = 1
            if (r0 == 0) goto L_0x0171
            r3 = 1
        L_0x015a:
            X.S0W r0 = r5.A0B
            X.Q17 r2 = r0.A00
            java.lang.StringBuilder r1 = r2.A08
            java.lang.String r0 = "releaseOutputBuffer,"
            r1.append(r0)
            boolean r0 = r2.A0A
            r2.A04(r4, r0)
        L_0x016b:
            X.C349257zq.A01()
            if (r3 != 0) goto L_0x02a6
            goto L_0x0123
        L_0x0171:
            X.SJL r9 = r5.A03
            r9.A0Q = r1
            long r7 = r2.presentationTimeUs
            long r2 = r9.A05
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0187
            boolean r0 = r9.A0X
            if (r0 != 0) goto L_0x0187
            r9.A0X = r1
            long r0 = r7 - r2
            r9.A0D = r0
        L_0x0187:
            if (r10 == 0) goto L_0x0190
            double r2 = (double) r7
            double r0 = (double) r11
            double r2 = r2 / r0
            r0 = 0
            r10.A00(r0, r2)
        L_0x0190:
            r10 = 1
            boolean r0 = r5.A09     // Catch:{ Exception -> 0x01e4 }
            if (r0 == 0) goto L_0x01de
            android.media.MediaCodec$BufferInfo r2 = r4.A00     // Catch:{ Exception -> 0x01e4 }
            int r0 = r2.size     // Catch:{ Exception -> 0x01e4 }
            byte[] r8 = r5.A0A     // Catch:{ Exception -> 0x01e4 }
            int r7 = r0 + 7
            X.Pxh.A12(r7, r8)     // Catch:{ Exception -> 0x01e4 }
            java.nio.ByteBuffer r3 = r5.A06     // Catch:{ Exception -> 0x01e4 }
            if (r3 == 0) goto L_0x01aa
            android.media.MediaCodec$BufferInfo r0 = r5.A01     // Catch:{ Exception -> 0x01e4 }
            r1 = 1
            if (r0 != 0) goto L_0x01ab
        L_0x01aa:
            r1 = 0
        L_0x01ab:
            java.lang.String r0 = "Temporary buffers are null"
            X.C266784aL.A06(r1, r0)     // Catch:{ Exception -> 0x01e4 }
            r3.clear()     // Catch:{ Exception -> 0x01e4 }
            r3.limit(r7)     // Catch:{ Exception -> 0x01e4 }
            r3.put(r8)     // Catch:{ Exception -> 0x01e4 }
            java.nio.ByteBuffer r0 = r4.AjB()     // Catch:{ Exception -> 0x01e4 }
            X.Pxg.A1D(r2, r0)     // Catch:{ Exception -> 0x01e4 }
            r3.put(r0)     // Catch:{ Exception -> 0x01e4 }
            android.media.MediaCodec$BufferInfo r14 = r5.A01     // Catch:{ Exception -> 0x01e4 }
            r15 = 0
            long r0 = r2.presentationTimeUs     // Catch:{ Exception -> 0x01e4 }
            int r2 = r2.flags     // Catch:{ Exception -> 0x01e4 }
            r17 = r0
            r19 = r2
            r16 = r7
            r14.set(r15, r16, r17, r19)     // Catch:{ Exception -> 0x01e4 }
            X.TiT r1 = r5.A04     // Catch:{ Exception -> 0x01e4 }
            X.Q1A r0 = new X.Q1A     // Catch:{ Exception -> 0x01e4 }
            r0.<init>(r13, r3, r14)     // Catch:{ Exception -> 0x01e4 }
            r1.FNk(r0)     // Catch:{ Exception -> 0x01e4 }
            goto L_0x01e9
        L_0x01de:
            X.TiT r0 = r5.A04     // Catch:{ Exception -> 0x01e4 }
            r0.FNk(r4)     // Catch:{ Exception -> 0x01e4 }
            goto L_0x01e9
        L_0x01e4:
            long r0 = r9.A08
            long r0 = r0 + r10
            r9.A08 = r0
        L_0x01e9:
            android.media.MediaCodec$BufferInfo r0 = r4.A00
            long r0 = r0.presentationTimeUs
            r9.A05 = r0
            long r0 = r9.A09
            long r0 = r0 + r10
            r9.A09 = r0
            goto L_0x02a3
        L_0x01f6:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x02a3
            X.S0W r0 = r5.A0B
            X.Q17 r0 = r0.A00
            android.media.MediaFormat r2 = r0.A00
            X.TiT r7 = r5.A04
            r7.EPD(r2)
            r7.start()
            r1 = 0
            java.lang.String r0 = "csd-0"
            java.nio.ByteBuffer r2 = r2.getByteBuffer(r0)
            if (r2 == 0) goto L_0x0212
            r1 = 1
        L_0x0212:
            java.lang.String r0 = "CSD should not be null. Verify encoder was configured properly."
            X.C266784aL.A06(r1, r0)
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x0250
            java.nio.ByteBuffer r3 = r5.A06
            r9 = 0
            if (r3 == 0) goto L_0x0225
            android.media.MediaCodec$BufferInfo r0 = r5.A01
            r1 = 1
            if (r0 != 0) goto L_0x0226
        L_0x0225:
            r1 = 0
        L_0x0226:
            java.lang.String r0 = "Temporary buffers are null"
            X.C266784aL.A06(r1, r0)
            android.media.MediaCodec$BufferInfo r8 = r5.A01
            int r10 = r2.limit()
            r11 = 0
            r13 = 2
            r8.set(r9, r10, r11, r13)
            r3.clear()
            int r0 = r2.limit()
            r3.limit(r0)
            r2.position(r9)
            r3.put(r2)
            r1 = -1
            X.Q1A r0 = new X.Q1A
            r0.<init>(r1, r3, r8)
            r7.FNk(r0)
        L_0x0250:
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x029e
            byte[] r7 = r5.A0A
            r8 = 0
            byte r0 = r2.get(r8)
            r12 = 3
            int r0 = r0 >> r12
            r10 = r0 & 31
            byte r0 = r2.get(r8)
            r11 = r0 & 7
            r1 = 1
            int r11 = r11 << r1
            byte r0 = r2.get(r1)
            int r0 = r0 >> 7
            r0 = r0 & 1
            r11 = r11 | r0
            byte r0 = r2.get(r1)
            int r0 = r0 >> r12
            r9 = r0 & 15
            r0 = -1
            r7[r8] = r0
            r0 = -15
            r7[r1] = r0
            r3 = 6
            int r10 = r10 << r3
            byte r0 = (byte) r10
            r2 = 2
            r7[r2] = r0
            int r11 = r11 << r2
            r0 = r0 | r11
            byte r1 = (byte) r0
            r7[r2] = r1
            int r0 = r9 >> 2
            r1 = r1 | r0
            byte r0 = (byte) r1
            r7[r2] = r0
            r0 = r9 & 3
            int r0 = r0 << r3
            byte r0 = (byte) r0
            r7[r12] = r0
            r0 = 4
            r7[r0] = r8
            r0 = 5
            r7[r0] = r8
            r0 = -4
            r7[r3] = r0
        L_0x029e:
            X.SJL r1 = r5.A03
            r0 = 1
            r1.A0O = r0
        L_0x02a3:
            r3 = 0
            goto L_0x015a
        L_0x02a6:
            X.TiT r0 = r5.A04
            r0.stop()
        L_0x02ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13149TNh.call():java.lang.Object");
    }
}
