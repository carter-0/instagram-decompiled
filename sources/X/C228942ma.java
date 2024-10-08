package X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2ma  reason: invalid class name and case insensitive filesystem */
public final class C228942ma extends C228952mb {
    public final AnonymousClass11X A00;
    public final Integer A01;
    public final AtomicBoolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C228942ma(Context context, AnonymousClass11X r3, Integer num, AtomicBoolean atomicBoolean) {
        super(context);
        0qQ.A0B(atomicBoolean, 3);
        if (this.A07) {
            A09();
        } else {
            this.A04 = true;
        }
        this.A00 = r3;
        this.A02 = atomicBoolean;
        this.A01 = num;
    }

    public final void A00() {
        if (!this.A02.get()) {
            this.A00.onCancel();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A06() {
        /*
            r7 = this;
            r5 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto L_0x001a
            java.lang.String r1 = "run "
            X.11X r0 = r7.A00
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = X.002.A0R(r1, r0)
            r0 = -1566362997(0xffffffffa2a3328b, float:-4.4234753E-18)
            X.0fS.A01(r1, r0)
        L_0x001a:
            java.lang.Integer r4 = r7.A01     // Catch:{ all -> 0x0090 }
            if (r4 == 0) goto L_0x0032
            int r0 = android.os.Process.myTid()     // Catch:{ all -> 0x0090 }
            int r3 = android.os.Process.getThreadPriority(r0)     // Catch:{ all -> 0x0090 }
            int r2 = r4.intValue()     // Catch:{ all -> 0x0090 }
            if (r2 < r3) goto L_0x0035
            X.11X r0 = r7.A00     // Catch:{ all -> 0x0090 }
        L_0x002e:
            r0.run()     // Catch:{ all -> 0x0090 }
            goto L_0x006d
        L_0x0032:
            X.11X r0 = r7.A00     // Catch:{ all -> 0x0090 }
            goto L_0x002e
        L_0x0035:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0090 }
            r1.<init>()     // Catch:{ all -> 0x0090 }
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0090 }
            r1.append(r0)     // Catch:{ all -> 0x0090 }
            r1.append(r4)     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0090 }
            r0 = 1135469940(0x43ade574, float:347.7926)
            X.0fS.A01(r1, r0)     // Catch:{ all -> 0x0090 }
        L_0x0056:
            android.os.Process.setThreadPriority(r2)     // Catch:{ all -> 0x0090 }
            X.11X r0 = r7.A00     // Catch:{ all -> 0x007f }
            r0.run()     // Catch:{ all -> 0x007f }
            android.os.Process.setThreadPriority(r3)     // Catch:{ all -> 0x0090 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x006d
            r0 = 544955576(0x207b5cb8, float:2.1291205E-19)
            X.0fS.A00(r0)     // Catch:{ all -> 0x0090 }
        L_0x006d:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto L_0x0079
            r0 = 1950779151(0x7446870f, float:6.29159E31)
            X.0fS.A00(r0)
        L_0x0079:
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x007f:
            r1 = move-exception
            android.os.Process.setThreadPriority(r3)     // Catch:{ all -> 0x0090 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008f
            r0 = 669753256(0x27eb9fa8, float:6.5398702E-15)
            X.0fS.A00(r0)     // Catch:{ all -> 0x0090 }
        L_0x008f:
            throw r1     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto L_0x009d
            r0 = -1741425537(0xffffffff9833f47f, float:-2.3258647E-24)
            X.0fS.A00(r0)
        L_0x009d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228942ma.A06():java.lang.Object");
    }
}
