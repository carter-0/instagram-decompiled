package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6ob  reason: invalid class name and case insensitive filesystem */
public abstract class C318226ob {
    public static final Map A00 = new ConcurrentHashMap();
    public static final AtomicReference A01 = new AtomicReference();
    public static final boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r2 != false) goto L_0x0024;
     */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            A01 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            A00 = r0
            java.util.Properties r3 = java.lang.System.getProperties()
            java.lang.String r1 = "rx2.purge-enabled"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = r3.getProperty(r1)
            boolean r2 = java.lang.Boolean.parseBoolean(r0)
            if (r2 == 0) goto L_0x0036
        L_0x0024:
            java.lang.String r1 = "rx2.purge-period-seconds"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0036
            goto L_0x002f
        L_0x002d:
            r2 = 1
            goto L_0x0024
        L_0x002f:
            java.lang.String r0 = r3.getProperty(r1)     // Catch:{ NumberFormatException -> 0x0036 }
            java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0036 }
        L_0x0036:
            A02 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C318226ob.<clinit>():void");
    }
}
