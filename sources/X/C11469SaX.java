package X;

import android.view.Choreographer;

/* renamed from: X.SaX  reason: case insensitive filesystem */
public final class C11469SaX implements Choreographer.FrameCallback {
    public C13947Tm7 A00;
    public final /* synthetic */ C12216SpG A01;

    public C11469SaX(C12216SpG spG) {
        this.A01 = spG;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 136 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        r3.A04.remove(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void doFrame(long r7) {
        /*
            r6 = this;
            X.SpG r3 = r6.A01
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A0D
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0013
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A0E
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 / r0
            java.lang.Object r4 = r3.A0B
            monitor-enter(r4)
            goto L_0x001e
        L_0x001b:
            r5.add(r2)     // Catch:{ all -> 0x0073 }
        L_0x001e:
            java.util.PriorityQueue r5 = r3.A0C     // Catch:{ all -> 0x0073 }
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x005e
            java.lang.Object r0 = r5.peek()     // Catch:{ all -> 0x0073 }
            X.0qQ.A0A(r0)     // Catch:{ all -> 0x0073 }
            X.RwD r0 = (X.C10674RwD) r0     // Catch:{ all -> 0x0073 }
            long r1 = r0.A00     // Catch:{ all -> 0x0073 }
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x005e
            java.lang.Object r2 = r5.poll()     // Catch:{ all -> 0x0073 }
            X.RwD r2 = (X.C10674RwD) r2     // Catch:{ all -> 0x0073 }
            if (r2 == 0) goto L_0x005e
            X.Tm7 r0 = r6.A00     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x0048
            com.facebook.react.bridge.WritableNativeArray r0 = new com.facebook.react.bridge.WritableNativeArray     // Catch:{ all -> 0x0073 }
            r0.<init>()     // Catch:{ all -> 0x0073 }
            r6.A00 = r0     // Catch:{ all -> 0x0073 }
        L_0x0048:
            int r1 = r2.A02     // Catch:{ all -> 0x0073 }
            r0.pushInt(r1)     // Catch:{ all -> 0x0073 }
            boolean r0 = r2.A03     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0058
            int r0 = r2.A01     // Catch:{ all -> 0x0073 }
            long r0 = (long) r0     // Catch:{ all -> 0x0073 }
            long r0 = r0 + r7
            r2.A00 = r0     // Catch:{ all -> 0x0073 }
            goto L_0x001b
        L_0x0058:
            android.util.SparseArray r0 = r3.A04     // Catch:{ all -> 0x0073 }
            r0.remove(r1)     // Catch:{ all -> 0x0073 }
            goto L_0x001e
        L_0x005e:
            monitor-exit(r4)
            X.Tm7 r1 = r6.A00
            if (r1 == 0) goto L_0x006b
            com.facebook.react.modules.core.TimingModule r0 = r3.A09
            r0.callTimers(r1)
            r0 = 0
            r6.A00 = r0
        L_0x006b:
            X.SOf r1 = r3.A08
            X.RFI r0 = X.RFI.TIMERS_EVENTS
            r1.A02(r6, r0)
            return
        L_0x0073:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11469SaX.doFrame(long):void");
    }
}
