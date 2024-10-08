package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.8gs  reason: invalid class name and case insensitive filesystem */
public abstract class C361828gs {
    public static final ConcurrentHashMap A00 = new ConcurrentHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r1 = java.util.Calendar.getInstance();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Calendar A00() {
        /*
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            java.util.concurrent.ConcurrentHashMap r2 = A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r1 = r2.get(r0)
            if (r1 != 0) goto L_0x001f
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            java.lang.Object r0 = r2.putIfAbsent(r0, r1)
            if (r0 == 0) goto L_0x001f
            r1 = r0
        L_0x001f:
            X.0qQ.A09(r1)
            java.util.Calendar r1 = (java.util.Calendar) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361828gs.A00():java.util.Calendar");
    }
}
