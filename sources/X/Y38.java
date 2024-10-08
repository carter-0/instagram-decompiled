package X;

import android.os.Handler;

public final class Y38 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C22147XwB A01;
    public final /* synthetic */ C341737nR A02;

    public Y38(Handler handler, C22147XwB xwB, C341737nR r3) {
        this.A01 = xwB;
        this.A02 = r3;
        this.A00 = handler;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f A[Catch:{ Exception -> 0x009c, all -> 0x00b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e A[Catch:{ Exception -> 0x009c, all -> 0x00b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088 A[Catch:{ Exception -> 0x009c, all -> 0x00b0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            X.XwB r4 = r0.A01
            X.7nR r6 = r0.A02
            android.os.Handler r5 = r0.A00
            X.7mw r3 = r4.A04
            java.lang.String r0 = "sAEi"
            r3.A01(r0)
            X.7r6 r1 = r4.A06
            r0 = 119(0x77, float:1.67E-43)
            boolean r9 = r1.CTO(r0)
            r2 = 0
            android.media.MediaCodec r0 = r4.A01     // Catch:{ Exception -> 0x009c }
            if (r0 == 0) goto L_0x0089
            java.lang.Integer r0 = r4.A0B     // Catch:{ Exception -> 0x009c }
            java.lang.Integer r7 = X.AnonymousClass05K.A0C     // Catch:{ Exception -> 0x009c }
            if (r0 != r7) goto L_0x0057
            java.lang.String r0 = "sAEdq"
            r3.A01(r0)     // Catch:{ Exception -> 0x009c }
            android.media.MediaCodec r8 = r4.A01     // Catch:{ Exception -> 0x009c }
            X.7qK r0 = r4.A05     // Catch:{ Exception -> 0x009c }
            int r0 = r0.A04     // Catch:{ Exception -> 0x009c }
            long r0 = (long) r0     // Catch:{ Exception -> 0x009c }
            int r11 = r8.dequeueInputBuffer(r0)     // Catch:{ Exception -> 0x009c }
            if (r11 < 0) goto L_0x004b
            java.lang.String r0 = "sAEq"
            r3.A01(r0)     // Catch:{ Exception -> 0x009c }
            android.media.MediaCodec r10 = r4.A01     // Catch:{ Exception -> 0x009c }
            r12 = 0
            r14 = 0
            r16 = 4
            r13 = r12
            r10.queueInputBuffer(r11, r12, r13, r14, r16)     // Catch:{ Exception -> 0x009c }
            java.lang.String r0 = "sAEpT"
            r3.A01(r0)     // Catch:{ Exception -> 0x009c }
            r0 = 1
            goto L_0x0051
        L_0x004b:
            java.lang.String r0 = "sAEpF"
            r3.A01(r0)     // Catch:{ Exception -> 0x009c }
            r0 = 0
        L_0x0051:
            X.C22147XwB.A00(r4, r0)     // Catch:{ Exception -> 0x009c }
            if (r9 != 0) goto L_0x006b
            goto L_0x005a
        L_0x0057:
            if (r9 != 0) goto L_0x006b
            goto L_0x0062
        L_0x005a:
            android.media.MediaCodec r1 = r4.A01     // Catch:{ Exception -> 0x009c }
            r0 = 1699712939(0x654f8fab, float:6.1261254E22)
            X.0fX.A06(r1, r0)     // Catch:{ Exception -> 0x009c }
        L_0x0062:
            android.media.MediaCodec r1 = r4.A01     // Catch:{ Exception -> 0x009c }
            r0 = -1011709272(0xffffffffc3b28aa8, float:-357.08325)
            X.0fX.A03(r1, r0)     // Catch:{ Exception -> 0x009c }
            goto L_0x0089
        L_0x006b:
            java.lang.Integer r0 = r4.A0B     // Catch:{ Exception -> 0x009c }
            if (r0 != r7) goto L_0x007e
            android.media.MediaCodec r0 = r4.A01     // Catch:{ Exception -> 0x009c }
            if (r0 == 0) goto L_0x0089
            java.lang.Exception r1 = X.C11292SKa.A01(r0)     // Catch:{ Exception -> 0x009c }
            java.lang.Exception r0 = X.C11292SKa.A00(r0)     // Catch:{ Exception -> 0x009c }
            if (r1 != 0) goto L_0x0086
            goto L_0x0085
        L_0x007e:
            android.media.MediaCodec r0 = r4.A01     // Catch:{ Exception -> 0x009c }
            java.lang.Exception r1 = X.C11292SKa.A00(r0)     // Catch:{ Exception -> 0x009c }
            goto L_0x0086
        L_0x0085:
            r1 = r0
        L_0x0086:
            if (r1 == 0) goto L_0x0089
            throw r1     // Catch:{ Exception -> 0x009c }
        L_0x0089:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r4.A0B = r0
            r4.A01 = r2
            r4.A00 = r2
            r4.A02 = r2
            java.lang.String r0 = "sAEs"
            r3.A01(r0)
            X.C18091VlL.A00(r5, r6)
            return
        L_0x009c:
            r1 = move-exception
            java.lang.String r0 = "sAEe"
            r3.A01(r0)     // Catch:{ all -> 0x00b0 }
            X.C18091VlL.A01(r5, r6, r1)     // Catch:{ all -> 0x00b0 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r4.A0B = r0
            r4.A01 = r2
            r4.A00 = r2
            r4.A02 = r2
            return
        L_0x00b0:
            r1 = move-exception
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r4.A0B = r0
            r4.A01 = r2
            r4.A00 = r2
            r4.A02 = r2
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y38.run():void");
    }
}
