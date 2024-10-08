package X;

import java.util.LinkedList;
import java.util.List;

/* renamed from: X.XEz  reason: case insensitive filesystem */
public final class C21109XEz implements C65051aA, AnonymousClass1aB {
    public List A00;
    public volatile boolean A01;

    public final boolean A7i(C65051aA r2) {
        1aP.A01(r2, "d is null");
        if (!this.A01) {
            synchronized (this) {
                if (!this.A01) {
                    List list = this.A00;
                    if (list == null) {
                        list = new LinkedList();
                        this.A00 = list;
                    }
                    list.add(r2);
                    return true;
                }
            }
        }
        r2.dispose();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AOQ(X.C65051aA r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Disposable item is null"
            X.1aP.A01(r3, r0)
            boolean r0 = r2.A01
            r1 = 0
            if (r0 != 0) goto L_0x0021
            monitor-enter(r2)
            boolean r0 = r2.A01     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001c
            java.util.List r0 = r2.A00     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.remove(r3)     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x001c
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            r1 = 1
            return r1
        L_0x001c:
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            return r1
        L_0x001e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            throw r0
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21109XEz.AOQ(X.1aA):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r2 = null;
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r1.hasNext() == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        ((X.C65051aA) r1.next()).dispose();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        X.C9877Riq.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r2 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        r2 = X.AnonymousClass7TE.A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        r2.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r2.size() != 1) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        throw X.C22013Xr3.A00((java.lang.Throwable) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0052, code lost:
        throw new X.C13225TQr(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r4 = this;
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x0056
            monitor-enter(r4)
            boolean r0 = r4.A01     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r4)     // Catch:{ all -> 0x0053 }
            return
        L_0x000b:
            r3 = 1
            r4.A01 = r3     // Catch:{ all -> 0x0053 }
            java.util.List r1 = r4.A00     // Catch:{ all -> 0x0053 }
            r0 = 0
            r4.A00 = r0     // Catch:{ all -> 0x0053 }
            monitor-exit(r4)     // Catch:{ all -> 0x0053 }
            if (r1 == 0) goto L_0x0056
            r2 = 0
            java.util.Iterator r1 = r1.iterator()
        L_0x001b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r1.next()
            X.1aA r0 = (X.C65051aA) r0
            r0.dispose()     // Catch:{ all -> 0x002b }
            goto L_0x001b
        L_0x002b:
            r0 = move-exception
            X.C9877Riq.A00(r0)
            if (r2 != 0) goto L_0x0035
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
        L_0x0035:
            r2.add(r0)
            goto L_0x001b
        L_0x0039:
            if (r2 == 0) goto L_0x0056
            int r0 = r2.size()
            if (r0 != r3) goto L_0x004d
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.RuntimeException r0 = X.C22013Xr3.A00(r0)
            throw r0
        L_0x004d:
            X.TQr r0 = new X.TQr
            r0.<init>(r2)
            throw r0
        L_0x0053:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0053 }
            throw r0
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21109XEz.dispose():void");
    }

    public final boolean ED6(C65051aA r2) {
        if (!AOQ(r2)) {
            return false;
        }
        r2.dispose();
        return true;
    }
}
