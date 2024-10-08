package X;

import android.util.TypedValue;

/* renamed from: X.VpE  reason: case insensitive filesystem */
public abstract class C18290VpE {
    public static final TypedValue A00 = new TypedValue();

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r2 > 31) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(android.content.res.TypedArray r4, int r5) {
        /*
            android.util.TypedValue r3 = A00
            monitor-enter(r3)
            r4.getValue(r5, r3)     // Catch:{ all -> 0x0014 }
            int r2 = r3.type     // Catch:{ all -> 0x0014 }
            r0 = 28
            if (r2 < r0) goto L_0x0011
            r1 = 31
            r0 = 1
            if (r2 <= r1) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            monitor-exit(r3)
            return r0
        L_0x0014:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18290VpE.A00(android.content.res.TypedArray, int):boolean");
    }
}
