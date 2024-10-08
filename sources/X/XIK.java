package X;

import android.os.Handler;

public final class XIK extends C22146XwA {
    public final long A00;
    public final Runnable A01 = new C22374Y1c(this);

    public XIK(Handler handler, C343507qK r13, C343967r6 r14, XZ8 xz8, A9N a9n) {
        super(handler, r13, r14, xz8, a9n);
        this.A00 = (C39902AIk.A01(r13.A07, r13.A03, (long) r13.A02, (long) r13.A08) / 1000) / 2;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 130 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        r5.A02 = r4.getOutputFormat();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.media.MediaCodec r4, X.XIK r5) {
        /*
            android.media.MediaCodec$BufferInfo r0 = r5.A00     // Catch:{ Exception -> 0x0056 }
            if (r0 != 0) goto L_0x0013
            X.A9N r4 = r5.A06     // Catch:{ Exception -> 0x0056 }
            java.lang.String r0 = "Unexpected null audio buffer info while attempting to process output buffers"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ Exception -> 0x0056 }
        L_0x000c:
            r4.A01(r0)     // Catch:{ Exception -> 0x0056 }
            goto L_0x0054
        L_0x0010:
            r5.A02(r4, r3, r2)     // Catch:{ Exception -> 0x0056 }
        L_0x0013:
            android.media.MediaCodec$BufferInfo r2 = r5.A00     // Catch:{ Exception -> 0x0056 }
            r0 = 0
            int r3 = r4.dequeueOutputBuffer(r2, r0)     // Catch:{ Exception -> 0x0056 }
            android.media.MediaCodec$BufferInfo r2 = r5.A00     // Catch:{ Exception -> 0x0056 }
            int r0 = r2.size     // Catch:{ Exception -> 0x0056 }
            r1 = 0
            if (r0 > 0) goto L_0x002c
            int r0 = r2.flags     // Catch:{ Exception -> 0x0056 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x002c
            r4.releaseOutputBuffer(r3, r1)     // Catch:{ Exception -> 0x0056 }
            goto L_0x0055
        L_0x002c:
            r0 = -1
            if (r3 == r0) goto L_0x005c
            r0 = -3
            if (r3 == r0) goto L_0x0013
            r0 = -2
            if (r3 != r0) goto L_0x003c
            android.media.MediaFormat r0 = r4.getOutputFormat()     // Catch:{ Exception -> 0x0056 }
            r5.A02 = r0     // Catch:{ Exception -> 0x0056 }
            goto L_0x0013
        L_0x003c:
            if (r3 >= 0) goto L_0x0010
            X.A9N r4 = r5.A06     // Catch:{ Exception -> 0x0056 }
            r2 = 0
            r0 = 283(0x11b, float:3.97E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ Exception -> 0x0056 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch:{ Exception -> 0x0056 }
            java.io.IOException r0 = X.C21053XCe.A0V(r0, r2, r1)     // Catch:{ Exception -> 0x0056 }
            goto L_0x000c
        L_0x0054:
            return
        L_0x0055:
            return
        L_0x0056:
            r1 = move-exception
            X.A9N r0 = r5.A06
            r0.A01(r1)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XIK.A00(android.media.MediaCodec, X.XIK):void");
    }
}
