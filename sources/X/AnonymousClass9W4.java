package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.9W4  reason: invalid class name */
public final class AnonymousClass9W4 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass9Tu A01;
    public final /* synthetic */ CountDownLatch A02;

    public AnonymousClass9W4(AnonymousClass9Tu r1, CountDownLatch countDownLatch, long j) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = countDownLatch;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r2 == null) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050 A[Catch:{ all -> 0x0037 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            X.9Tu r0 = r8.A01     // Catch:{ all -> 0x006d }
            java.util.Map r1 = r0.A0O     // Catch:{ all -> 0x006d }
            r7 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x006d }
            java.lang.Object r6 = r1.get(r0)     // Catch:{ all -> 0x006d }
            X.7uU r6 = (X.C346037uU) r6     // Catch:{ all -> 0x006d }
            r6.getClass()     // Catch:{ all -> 0x006d }
            long r4 = r8.A00     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "displayFrame"
            X.C349257zq.A03(r0)     // Catch:{ all -> 0x0068 }
            X.7uT r3 = r6.A0G     // Catch:{ all -> 0x0068 }
            monitor-enter(r3)     // Catch:{ all -> 0x0068 }
            X.7uK r1 = r6.A0L     // Catch:{ all -> 0x0065 }
            X.7uG r2 = r6.A05     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x003c
            if (r2 == 0) goto L_0x0045
            boolean r0 = r6.A08     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x004c
            r6.A08 = r7     // Catch:{ all -> 0x0065 }
            r1.A05()     // Catch:{ all -> 0x0037 }
            r1.A04(r4)     // Catch:{ all -> 0x0037 }
            r1.A03()     // Catch:{ all -> 0x0037 }
            r0 = 1
            r6.A0M = r0     // Catch:{ all -> 0x0037 }
            goto L_0x0058
        L_0x0037:
            r0 = move-exception
            r2.makeCurrent()     // Catch:{ all -> 0x0065 }
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x003c:
            X.7ro r1 = r6.A0F     // Catch:{ all -> 0x0065 }
            X.8td r0 = X.C368978td.GL_SURFACE_OUTPUT_SKIP_DISPLAY_FRAME_GL_SURFACE_NULL     // Catch:{ all -> 0x0065 }
            r1.A00(r0)     // Catch:{ all -> 0x0065 }
            if (r2 != 0) goto L_0x004c
        L_0x0045:
            X.7ro r1 = r6.A0F     // Catch:{ all -> 0x0065 }
            X.8td r0 = X.C368978td.GL_SURFACE_OUTPUT_SKIP_DISPLAY_FRAME_GL_CONTEXT_NULL     // Catch:{ all -> 0x0065 }
            r1.A00(r0)     // Catch:{ all -> 0x0065 }
        L_0x004c:
            boolean r0 = r6.A08     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x005b
            X.7ro r1 = r6.A0F     // Catch:{ all -> 0x0065 }
            X.8td r0 = X.C368978td.GL_SURFACE_OUTPUT_SKIP_DISPLAY_FRAME_BUFFER_NOT_UPDATED     // Catch:{ all -> 0x0065 }
            r1.A00(r0)     // Catch:{ all -> 0x0065 }
            goto L_0x005b
        L_0x0058:
            r2.makeCurrent()     // Catch:{ all -> 0x0065 }
        L_0x005b:
            monitor-exit(r3)     // Catch:{ all -> 0x0065 }
            X.C349257zq.A01()     // Catch:{ all -> 0x006d }
            java.util.concurrent.CountDownLatch r0 = r8.A02
            r0.countDown()
            return
        L_0x0065:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0065 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            X.C349257zq.A01()     // Catch:{ all -> 0x006d }
            throw r0     // Catch:{ all -> 0x006d }
        L_0x006d:
            r1 = move-exception
            java.util.concurrent.CountDownLatch r0 = r8.A02
            r0.countDown()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9W4.run():void");
    }
}
