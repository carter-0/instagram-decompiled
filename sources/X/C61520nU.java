package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0nU  reason: invalid class name and case insensitive filesystem */
public final class C61520nU {
    public static final List A02 = new ArrayList();
    public static volatile C61520nU A03;
    public boolean A00 = false;
    public final Object A01 = new Object();

    public static C61520nU A00() {
        if (A03 == null) {
            synchronized (C61520nU.class) {
                if (A03 == null) {
                    A03 = new C61520nU();
                }
            }
        }
        return A03;
    }

    public final void A01() {
        Object obj = this.A01;
        synchronized (obj) {
            this.A00 = false;
            obj.notifyAll();
            for (C61510nT DL1 : A02) {
                DL1.DL1();
            }
        }
    }

    public final void A02() {
        synchronized (this.A01) {
            this.A00 = true;
            for (C61510nT DL2 : A02) {
                DL2.DL2();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(long r3) {
        /*
            r2 = this;
            java.lang.Object r1 = r2.A01
            monitor-enter(r1)
            boolean r0 = r2.A00     // Catch:{ all -> 0x000e }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x000e }
            return
        L_0x0009:
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000c }
        L_0x000c:
            monitor-exit(r1)     // Catch:{ all -> 0x000e }
            return
        L_0x000e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x000e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61520nU.A03(long):void");
    }
}
