package X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8dg  reason: invalid class name and case insensitive filesystem */
public final class C359908dg {
    public Object A00;
    public List A01;
    public final C359888de A02 = new Handler(C359788dU.A01);
    public final AtomicInteger A03 = new AtomicInteger(0);

    public static void A00(C359968dm r1, C359908dg r2, Object obj) {
        List list = r2.A01;
        if (list == null) {
            list = new ArrayList();
            r2.A01 = list;
        }
        list.add(r1);
        synchronized (r2) {
            Object obj2 = r2.A00;
            if (obj2 != null && obj2 != obj) {
                A01(r1, obj2);
            }
        }
    }

    public static void A01(C359968dm r1, Object obj) {
        if (r1 != null) {
            1Kg.A02("DataSynchronizer_sendAdditional");
            try {
                C360018dr r2 = (C360018dr) obj;
                synchronized (r1) {
                    C360008dq r0 = r1.A00;
                    if (r0 != null) {
                        r0.DfA(r2);
                    }
                }
                1Kg.A01();
            } catch (Throwable th) {
                1Kg.A01();
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = new java.util.ArrayList(r1.A01).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r1.hasNext() == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        A01((X.C359968dm) r1.next(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        r0 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        if (r0 == null) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C359908dg r1, java.lang.Object r2, int r3) {
        /*
            java.util.concurrent.atomic.AtomicInteger r0 = r1.A03
            int r0 = r0.get()
            monitor-enter(r1)
            if (r0 == r3) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            return
        L_0x000b:
            r1.A00 = r2     // Catch:{ all -> 0x0034 }
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            java.util.List r0 = r1.A01
            if (r0 == 0) goto L_0x0033
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0033
            java.util.List r1 = r1.A01
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.Iterator r1 = r0.iterator()
        L_0x0023:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r0 = r1.next()
            X.8dm r0 = (X.C359968dm) r0
            A01(r0, r2)
            goto L_0x0023
        L_0x0033:
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C359908dg.A02(X.8dg, java.lang.Object, int):void");
    }
}
