package X;

import android.util.SparseArray;
import java.util.List;

/* renamed from: X.S4m  reason: case insensitive filesystem */
public final class C10992S4m {
    public final SparseArray A00;
    public final AnonymousClass6S4 A01;
    public final Object A02 = Pxe.A0p();
    public final List A03;

    public final 0eP A00() {
        0eP A1L;
        synchronized (this.A02) {
            A1L = AnonymousClass7TE.A1L(this.A00.clone(), AnonymousClass7TE.A1D(this.A03));
        }
        return A1L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r2.A00.contains(r5) != false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.Object r3, java.util.List r4, int r5) {
        /*
            r2 = this;
            java.lang.Object r1 = r2.A02
            monitor-enter(r1)
            if (r3 != 0) goto L_0x000d
            android.util.SparseArray r0 = r2.A00     // Catch:{ all -> 0x001b }
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0012
        L_0x000d:
            android.util.SparseArray r0 = r2.A00     // Catch:{ all -> 0x001b }
            r0.put(r5, r3)     // Catch:{ all -> 0x001b }
        L_0x0012:
            if (r4 == 0) goto L_0x0019
            java.util.List r0 = r2.A03     // Catch:{ all -> 0x001b }
            r0.removeAll(r4)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return
        L_0x001b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10992S4m.A01(java.lang.Object, java.util.List, int):void");
    }

    public C10992S4m(SparseArray sparseArray, AnonymousClass6S4 r5, List list) {
        SparseArray sparseArray2;
        this.A01 = r5;
        this.A03 = AnonymousClass7TE.A1D(list);
        if (sparseArray == null || (sparseArray2 = sparseArray.clone()) == null) {
            sparseArray2 = Pxe.A0L();
        } else {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                Pxi.A17(sparseArray, sparseArray2, i);
            }
        }
        this.A00 = sparseArray2;
    }
}
