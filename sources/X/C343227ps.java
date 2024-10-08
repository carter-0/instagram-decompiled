package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.7ps  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C343227ps implements Runnable {
    public final /* synthetic */ C341037mE A00;
    public final /* synthetic */ CountDownLatch A01;

    public /* synthetic */ C343227ps(C341037mE r1, CountDownLatch countDownLatch) {
        this.A00 = r1;
        this.A01 = countDownLatch;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        if (r1 == false) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            X.7mE r2 = r6.A00
            java.util.concurrent.CountDownLatch r4 = r6.A01
            X.7uT r1 = r2.A05     // Catch:{ RuntimeException -> 0x00b8 }
            if (r1 == 0) goto L_0x000d
            X.7rm r0 = r2.A08     // Catch:{ RuntimeException -> 0x00b8 }
            X.C344387rm.A04(r0, r1)     // Catch:{ RuntimeException -> 0x00b8 }
        L_0x000d:
            X.7rm r5 = r2.A08     // Catch:{ RuntimeException -> 0x00b8 }
            boolean r0 = r5.A0Q     // Catch:{ RuntimeException -> 0x00b8 }
            if (r0 == 0) goto L_0x0060
            X.7mG r3 = r2.A07     // Catch:{ RuntimeException -> 0x00b8 }
            r5.A0C(r3)     // Catch:{ RuntimeException -> 0x00b8 }
            android.os.Handler r2 = r5.A0L     // Catch:{ RuntimeException -> 0x00b8 }
            int r1 = r3.A00     // Catch:{ RuntimeException -> 0x00b8 }
            r0 = 0
            if (r1 == 0) goto L_0x0020
            r0 = 1
        L_0x0020:
            X.0JA.A06(r0)     // Catch:{ RuntimeException -> 0x00b8 }
            boolean r0 = r3.A02     // Catch:{ RuntimeException -> 0x00b8 }
            java.lang.String r1 = "ar-session"
            if (r0 == 0) goto L_0x0046
            X.7nh r0 = r3.A01     // Catch:{ RuntimeException -> 0x00b8 }
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = "ar core surface used"
            X.0KC.A0C(r1, r0)     // Catch:{ RuntimeException -> 0x00b8 }
            X.7nh r2 = r3.A01     // Catch:{ RuntimeException -> 0x00b8 }
            int r1 = r3.A00     // Catch:{ RuntimeException -> 0x00b8 }
            X.AUy r0 = new X.AUy     // Catch:{ RuntimeException -> 0x00b8 }
            r0.<init>(r3)     // Catch:{ RuntimeException -> 0x00b8 }
            android.graphics.SurfaceTexture r0 = r2.getArSurfaceTexture(r1, r0)     // Catch:{ RuntimeException -> 0x00b8 }
            r3.A04 = r0     // Catch:{ RuntimeException -> 0x00b8 }
        L_0x0041:
            X.C344387rm.A03(r5)     // Catch:{ RuntimeException -> 0x00b8 }
            goto L_0x00c8
        L_0x0046:
            java.lang.String r0 = "regular surface used - attach"
            X.0KC.A0C(r1, r0)     // Catch:{ RuntimeException -> 0x00b8 }
            android.graphics.SurfaceTexture r1 = r3.A05     // Catch:{ RuntimeException -> 0x00b8 }
            if (r1 == 0) goto L_0x0041
            r1.detachFromGLContext()     // Catch:{ RuntimeException -> 0x00b8 }
            int r0 = r3.A00     // Catch:{ RuntimeException -> 0x00b8 }
            r1.attachToGLContext(r0)     // Catch:{ RuntimeException -> 0x00b8 }
            android.graphics.SurfaceTexture$OnFrameAvailableListener r0 = r3.A03     // Catch:{ RuntimeException -> 0x00b8 }
            r1.setOnFrameAvailableListener(r0, r2)     // Catch:{ RuntimeException -> 0x00b8 }
            r1.updateTexImage()     // Catch:{ RuntimeException -> 0x00b8 }
            goto L_0x0041
        L_0x0060:
            X.7mG r3 = r2.A07     // Catch:{ RuntimeException -> 0x00b8 }
            r3.A00()     // Catch:{ RuntimeException -> 0x00b8 }
            r5.A0C(r3)     // Catch:{ RuntimeException -> 0x00b8 }
            X.7nh r0 = r3.A01     // Catch:{ RuntimeException -> 0x00b8 }
            r2 = 1
            if (r0 == 0) goto L_0x0074
            boolean r1 = r0.isARCoreEnabled()     // Catch:{ RuntimeException -> 0x00b8 }
            r0 = 1
            if (r1 != 0) goto L_0x0075
        L_0x0074:
            r0 = 0
        L_0x0075:
            r3.A02 = r0     // Catch:{ RuntimeException -> 0x00b8 }
            android.graphics.SurfaceTexture r0 = r3.getSurfaceTexture()     // Catch:{ RuntimeException -> 0x00b8 }
            if (r0 != 0) goto L_0x00c8
            int r0 = r3.A00     // Catch:{ RuntimeException -> 0x00b8 }
            if (r0 != 0) goto L_0x0082
            r2 = 0
        L_0x0082:
            X.0JA.A06(r2)     // Catch:{ RuntimeException -> 0x00b8 }
            boolean r0 = r3.A02     // Catch:{ RuntimeException -> 0x00b8 }
            java.lang.String r1 = "ar-session"
            if (r0 == 0) goto L_0x00a4
            X.7nh r0 = r3.A01     // Catch:{ RuntimeException -> 0x00b8 }
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = "ar core surface used"
            X.0KC.A0C(r1, r0)     // Catch:{ RuntimeException -> 0x00b8 }
            X.7nh r2 = r3.A01     // Catch:{ RuntimeException -> 0x00b8 }
            int r1 = r3.A00     // Catch:{ RuntimeException -> 0x00b8 }
            X.AUz r0 = new X.AUz     // Catch:{ RuntimeException -> 0x00b8 }
            r0.<init>(r3)     // Catch:{ RuntimeException -> 0x00b8 }
            android.graphics.SurfaceTexture r0 = r2.getArSurfaceTexture(r1, r0)     // Catch:{ RuntimeException -> 0x00b8 }
            r3.A04 = r0     // Catch:{ RuntimeException -> 0x00b8 }
            goto L_0x00c8
        L_0x00a4:
            java.lang.String r0 = "regular surface used"
            X.0KC.A0C(r1, r0)     // Catch:{ RuntimeException -> 0x00b8 }
            int r0 = r3.A00     // Catch:{ RuntimeException -> 0x00b8 }
            android.graphics.SurfaceTexture r1 = new android.graphics.SurfaceTexture     // Catch:{ RuntimeException -> 0x00b8 }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x00b8 }
            android.graphics.SurfaceTexture$OnFrameAvailableListener r0 = r3.A03     // Catch:{ RuntimeException -> 0x00b8 }
            r1.setOnFrameAvailableListener(r0)     // Catch:{ RuntimeException -> 0x00b8 }
            r3.A05 = r1     // Catch:{ RuntimeException -> 0x00b8 }
            goto L_0x00c8
        L_0x00b8:
            r3 = move-exception
            java.lang.String r2 = X.C344387rm.A0V
            java.lang.String r0 = r3.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Failed to create SurfaceNode: %s"
            X.0KC.A0L(r2, r0, r3, r1)
        L_0x00c8:
            r4.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C343227ps.run():void");
    }
}
