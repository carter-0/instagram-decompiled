package X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4uE  reason: invalid class name and case insensitive filesystem */
public final class C276984uE {
    public static int A00 = -1;
    public static C276964uC A01;
    public static Handler A02;
    public static final List A03 = new ArrayList();
    public static volatile boolean A04;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized android.os.Handler A00() {
        /*
            java.lang.Class<X.4uE> r6 = X.C276984uE.class
            monitor-enter(r6)
            r3 = 5
            X.4uC r0 = A01     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0036
            X.08y r5 = X.09i.A0A     // Catch:{ all -> 0x0074 }
            X.0wW r2 = r5.A05(r0)     // Catch:{ all -> 0x0074 }
            X.0Tu r4 = X.0Tu.A05     // Catch:{ all -> 0x0074 }
            r0 = 36318853341452818(0x8107ce00111a12, double:3.03152732519423E-306)
            boolean r0 = X.182.A06(r4, r2, r0)     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0036
            X.4uC r0 = A01     // Catch:{ all -> 0x0074 }
            X.0wW r2 = r5.A05(r0)     // Catch:{ all -> 0x0074 }
            r0 = 36600328318095192(0x8207ce00100f58, double:3.209533233831624E-306)
            long r0 = X.182.A01(r4, r2, r0)     // Catch:{ all -> 0x0074 }
            int r3 = (int) r0     // Catch:{ all -> 0x0074 }
            r0 = 1
            A04 = r0     // Catch:{ all -> 0x0074 }
            int r1 = A00     // Catch:{ all -> 0x0074 }
            r0 = -1
            if (r1 == r0) goto L_0x004e
            if (r3 == r0) goto L_0x004e
            goto L_0x0043
        L_0x0036:
            boolean r0 = A04     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x004e
            int r0 = A00     // Catch:{ all -> 0x0074 }
            android.os.Process.setThreadPriority(r0, r3)     // Catch:{ all -> 0x0074 }
            r0 = 0
            A04 = r0     // Catch:{ all -> 0x0074 }
            goto L_0x004e
        L_0x0043:
            int r0 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x0074 }
            if (r3 == r0) goto L_0x004e
            int r0 = A00     // Catch:{ all -> 0x0074 }
            android.os.Process.setThreadPriority(r0, r3)     // Catch:{ all -> 0x0074 }
        L_0x004e:
            android.os.Handler r0 = A02     // Catch:{ all -> 0x0074 }
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = "BackgroundLayoutPreparer"
            android.os.HandlerThread r2 = new android.os.HandlerThread     // Catch:{ all -> 0x0074 }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0074 }
            X.AnonymousClass0fe.A00(r2)     // Catch:{ all -> 0x0074 }
            r2.start()     // Catch:{ all -> 0x0074 }
            android.os.Looper r1 = r2.getLooper()     // Catch:{ all -> 0x0074 }
            android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x0074 }
            r0.<init>(r1)     // Catch:{ all -> 0x0074 }
            A02 = r0     // Catch:{ all -> 0x0074 }
            int r0 = r2.getThreadId()     // Catch:{ all -> 0x0074 }
            A00 = r0     // Catch:{ all -> 0x0074 }
        L_0x0070:
            android.os.Handler r0 = A02     // Catch:{ all -> 0x0074 }
            monitor-exit(r6)
            return r0
        L_0x0074:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C276984uE.A00():android.os.Handler");
    }

    public static synchronized C14543Ty3 A01(List list, int i, boolean z) {
        C14543Ty3 ty3;
        synchronized (C276984uE.class) {
            Handler A002 = A00();
            List list2 = A03;
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C14534Txu txu = (C14534Txu) it.next();
                if (txu.A00 == i) {
                    txu.A01.A00.compareAndSet(false, true);
                }
                C14543Ty3 ty32 = txu.A01;
                if (ty32.A00.get()) {
                    A002.removeCallbacksAndMessages(ty32);
                    it.remove();
                }
            }
            ty3 = new C14543Ty3();
            C14534Txu txu2 = new C14534Txu(ty3, list, i, z);
            list2.add(txu2);
            A002.postAtTime(new C14540Ty0(txu2), ty3, 0);
        }
        return ty3;
    }
}
