package X;

import android.content.Context;
import java.util.Arrays;

/* renamed from: X.8dM  reason: invalid class name and case insensitive filesystem */
public abstract class C359708dM implements Cloneable {
    public Context A00;
    public boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000e, code lost:
        if (r2.A01 != false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        r2.A01 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        monitor-enter(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A01     // Catch:{ all -> 0x001a }
            r1 = 0
            if (r0 != 0) goto L_0x0018
            android.content.Context r0 = r2.A00     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0018
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            monitor-enter(r2)
            boolean r0 = r2.A01     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0013
            r0 = 1
            r2.A01 = r0     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            return r1
        L_0x0015:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            throw r0
        L_0x0018:
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C359708dM.A00():java.lang.Object");
    }

    public final String A01() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(":");
        C359698dL r0 = (C359698dL) this;
        sb.append((long) Arrays.hashCode(new Object[]{r0.A02, r0.A03, r0.A04}));
        return sb.toString();
    }
}
