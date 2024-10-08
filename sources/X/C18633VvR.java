package X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.VvR  reason: case insensitive filesystem */
public final class C18633VvR {
    public final Map A00 = new HashMap();

    public final void A01(WG9 wg9, C344907sc r9) {
        0JA.A08(AnonymousClass7TF.A1V(r9), "Null event passed in");
        Map map = this.A00;
        synchronized (map) {
            C344877sZ CAG = r9.CAG();
            if (map.containsKey(CAG) && !((C3496981j) map.get(CAG)).A00.isEmpty()) {
                VUX A02 = wg9.A02();
                A02.A00 = r9;
                C3496981j r3 = (C3496981j) map.get(CAG);
                List list = r3.A00;
                for (int i = 0; i < list.size(); i++) {
                    WeakReference weakReference = (WeakReference) list.get(i);
                    if (((C345237tA) weakReference.get()) == null) {
                        r3.A02(weakReference);
                    }
                }
                A02.A02 = r3.A00;
                wg9.A03(A02);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.ref.WeakReference A00(X.C18633VvR r4, X.C345237tA r5, X.C344877sZ r6) {
        /*
            java.util.Map r4 = r4.A00
            monitor-enter(r4)
            java.lang.Object r0 = r4.get(r6)     // Catch:{ all -> 0x0029 }
            X.81j r0 = (X.C3496981j) r0     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0026
            java.util.List r3 = r0.A00     // Catch:{ all -> 0x0029 }
            r2 = 0
        L_0x000e:
            int r0 = r3.size()     // Catch:{ all -> 0x0029 }
            if (r2 >= r0) goto L_0x0026
            java.lang.Object r1 = r3.get(r2)     // Catch:{ all -> 0x0029 }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x0029 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0029 }
            if (r0 != r5) goto L_0x0022
            monitor-exit(r4)     // Catch:{ all -> 0x0029 }
            goto L_0x0025
        L_0x0022:
            int r2 = r2 + 1
            goto L_0x000e
        L_0x0025:
            return r1
        L_0x0026:
            monitor-exit(r4)     // Catch:{ all -> 0x0029 }
            r0 = 0
            return r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0029 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18633VvR.A00(X.VvR, X.7tA, X.7sZ):java.lang.ref.WeakReference");
    }

    public final boolean A03(C344877sZ r4) {
        boolean z;
        Map map = this.A00;
        synchronized (map) {
            C3496981j r0 = (C3496981j) map.get(r4);
            z = false;
            if (r0 != null && r0.A00.size() > 0) {
                z = true;
            }
        }
        return z;
    }

    public final void A02(C345237tA r4, C344877sZ r5) {
        0JA.A08(AnonymousClass7TF.A1V(r4), "Null listener unregistered");
        Map map = this.A00;
        synchronized (map) {
            if (map.containsKey(r5)) {
                ((C3496981j) map.get(r5)).A02(A00(this, r4, r5));
            }
        }
    }
}
