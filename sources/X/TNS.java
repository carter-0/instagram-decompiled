package X;

import java.util.concurrent.Callable;

public final class TNS implements Callable {
    public final int A00;
    public final int A01;
    public final Object A02;

    public TNS(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008e, code lost:
        r5.EQ8(r6, r6, 0, 4);
        r2.A0R.E5w(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r11 = this;
            int r0 = r11.A00
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r2 = r11.A02
            X.Q1S r2 = (X.Q1S) r2
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x001a
            r0 = -4
        L_0x000d:
            android.os.Process.setThreadPriority(r0)
            X.TSr r3 = r2.A06
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x001d
            r3.lock()
            goto L_0x001d
        L_0x001a:
            int r0 = r11.A01
            goto L_0x000d
        L_0x001d:
            boolean r0 = r2.A0T     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x00ab
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00b0 }
            boolean r0 = r0.isInterrupted()     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x00ab
            boolean r0 = r3.A00     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0034
            boolean r0 = r2.A0V     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0034
            goto L_0x00ab
        L_0x0034:
            X.TiZ r4 = r2.A0R     // Catch:{ all -> 0x00b0 }
            int r0 = r2.A0F     // Catch:{ all -> 0x00b0 }
            long r0 = (long) r0     // Catch:{ all -> 0x00b0 }
            X.Q1A r5 = r4.AOi(r0)     // Catch:{ all -> 0x00b0 }
            if (r5 == 0) goto L_0x001d
            X.TiZ r0 = r2.A0R     // Catch:{ all -> 0x00b0 }
            boolean r0 = r0.EtW()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0048
            goto L_0x008d
        L_0x0048:
            java.nio.ByteBuffer r0 = r5.AjB()     // Catch:{ all -> 0x00b0 }
            r6 = 0
            if (r0 == 0) goto L_0x009b
            boolean r0 = r2.A0A     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0064
            boolean r0 = r2.A0T     // Catch:{ all -> 0x00b0 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.Object[] r4 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = "VideoDemuxDecodeWrapperTag"
            java.lang.String r0 = "extractVideoFrame mVideoDemuxer.readSampleData mCancelled: %s"
            X.0KC.A0P(r1, r0, r4)     // Catch:{ all -> 0x00b0 }
        L_0x0064:
            X.Tig r1 = r2.A0Q     // Catch:{ all -> 0x00b0 }
            java.nio.ByteBuffer r0 = r5.AjB()     // Catch:{ all -> 0x00b0 }
            int r7 = r1.E6i(r0)     // Catch:{ all -> 0x00b0 }
            X.Tig r0 = r2.A0Q     // Catch:{ all -> 0x00b0 }
            long r8 = r0.BpD()     // Catch:{ all -> 0x00b0 }
            long r0 = r2.A0P     // Catch:{ all -> 0x00b0 }
            long r8 = r8 - r0
            if (r7 <= 0) goto L_0x008e
            X.Tig r0 = r2.A0Q     // Catch:{ all -> 0x00b0 }
            int r10 = r0.BpB()     // Catch:{ all -> 0x00b0 }
            r5.EQ8(r6, r7, r8, r10)     // Catch:{ all -> 0x00b0 }
            X.TiZ r0 = r2.A0R     // Catch:{ all -> 0x00b0 }
            r0.E5w(r5)     // Catch:{ all -> 0x00b0 }
            X.Tig r0 = r2.A0Q     // Catch:{ all -> 0x00b0 }
            r0.AAt()     // Catch:{ all -> 0x00b0 }
            goto L_0x001d
        L_0x008d:
            r6 = 0
        L_0x008e:
            r8 = 0
            r10 = 4
            r7 = r6
            r5.EQ8(r6, r7, r8, r10)     // Catch:{ all -> 0x00b0 }
            X.TiZ r0 = r2.A0R     // Catch:{ all -> 0x00b0 }
            r0.E5w(r5)     // Catch:{ all -> 0x00b0 }
            goto L_0x00ab
        L_0x009b:
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = "extractVideoFrame: byteBuffer cannot be null"
            java.lang.String r0 = "VideoDemuxDecodeWrapperTag"
            X.Q1V.A00(r0, r1, r2)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "byteBuffer cannot be null"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x00b0 }
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x00ab:
            r3.close()
            r0 = 0
            return r0
        L_0x00b0:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00b5 }
            throw r1
        L_0x00b5:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
            throw r1
        L_0x00ba:
            java.lang.Object r1 = r11.A02
            X.QAQ r1 = (X.QAQ) r1
            int r4 = r11.A01
            boolean r0 = r1.A03
            android.content.Context r3 = r1.getContext()
            if (r0 == 0) goto L_0x00e5
            java.lang.String r2 = "rawRes"
            android.content.res.Configuration r0 = X.Pxf.A0G(r3)
            int r0 = r0.uiMode
            r1 = r0 & 48
            r0 = 32
            if (r1 != r0) goto L_0x00e2
            java.lang.String r0 = "_night_"
        L_0x00d9:
            java.lang.String r0 = X.002.A0b(r2, r0, r4)
        L_0x00dd:
            X.SIM r0 = X.C11425STh.A00(r3, r0, r4)
            return r0
        L_0x00e2:
            java.lang.String r0 = "_day_"
            goto L_0x00d9
        L_0x00e5:
            r0 = 0
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TNS.call():java.lang.Object");
    }
}
