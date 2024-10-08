package X;

import java.util.List;
import java.util.Map;

public final class S12 {
    public final List A00 = AnonymousClass7TE.A1C();
    public final Map A01 = AnonymousClass7TE.A1E();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r8.isAssignableFrom(r2.A02) == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.ArrayList A00(java.lang.Class r7, java.lang.Class r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0049 }
            java.util.List r0 = r6.A00     // Catch:{ all -> 0x0049 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0049 }
        L_0x000b:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = X.AnonymousClass7TE.A18(r5)     // Catch:{ all -> 0x0049 }
            java.util.Map r0 = r6.A01     // Catch:{ all -> 0x0049 }
            java.util.List r0 = X.C66580MXl.A13(r1, r0)     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x000b
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0049 }
        L_0x0021:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x000b
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0049 }
            X.Rtk r2 = (X.C10531Rtk) r2     // Catch:{ all -> 0x0049 }
            java.lang.Class r0 = r2.A01     // Catch:{ all -> 0x0049 }
            boolean r0 = r0.isAssignableFrom(r7)     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x003e
            java.lang.Class r0 = r2.A02     // Catch:{ all -> 0x0049 }
            boolean r1 = r8.isAssignableFrom(r0)     // Catch:{ all -> 0x0049 }
            r0 = 1
            if (r1 != 0) goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 == 0) goto L_0x0021
            java.lang.Class r0 = r2.A02     // Catch:{ all -> 0x0049 }
            X.JTR.A1S(r0, r4)     // Catch:{ all -> 0x0049 }
            goto L_0x0021
        L_0x0047:
            monitor-exit(r6)
            return r4
        L_0x0049:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S12.A00(java.lang.Class, java.lang.Class):java.util.ArrayList");
    }
}
