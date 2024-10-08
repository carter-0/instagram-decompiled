package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Dde  reason: case insensitive filesystem */
public class C46362Dde extends C66940MfZ {
    public Object A00;
    public boolean A01;
    public final AnonymousClass07Z A02;
    public final C62320sa A03;

    public C46362Dde(AnonymousClass07Z r5, C62320sa r6) {
        if (r5 instanceof Fragment) {
            C50139FQw.A01(r5, ((Fragment) r5).mViewLifecycleOwnerLiveData, this, 4);
        } else {
            r5.getLifecycle().A09(new C319286qL(r5.getLifecycle(), this));
        }
        this.A02 = r5;
        this.A03 = r6;
        this.A01 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        return r2.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b A[SYNTHETIC, Splitter:B:16:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02() {
        /*
            r2 = this;
            monitor-enter(r2)
            X.07Z r1 = r2.A02     // Catch:{ all -> 0x0042 }
            boolean r0 = r1 instanceof androidx.fragment.app.Fragment     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0011
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1     // Catch:{ all -> 0x0042 }
            android.view.View r0 = r1.mView     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0023
            X.07Z r1 = r1.getViewLifecycleOwner()     // Catch:{ all -> 0x0042 }
        L_0x0011:
            X.07V r0 = r1.getLifecycle()     // Catch:{ all -> 0x0042 }
            X.07U r1 = r0.A07()     // Catch:{ all -> 0x0042 }
            X.07U r0 = X.07U.A03     // Catch:{ all -> 0x0042 }
            int r1 = r1.compareTo(r0)     // Catch:{ all -> 0x0042 }
            r0 = 0
            if (r1 < 0) goto L_0x0026
            goto L_0x0025
        L_0x0023:
            r0 = 0
            goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            if (r0 != 0) goto L_0x002b
            r0 = 0
            monitor-exit(r2)
            return r0
        L_0x002b:
            java.lang.Object r0 = r2.A00     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x003e
            boolean r0 = r2.A01     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x003e
            X.0sa r0 = r2.A03     // Catch:{ all -> 0x0042 }
            java.lang.Object r0 = r0.invoke()     // Catch:{ all -> 0x0042 }
            r2.A00 = r0     // Catch:{ all -> 0x0042 }
            r0 = 0
            r2.A01 = r0     // Catch:{ all -> 0x0042 }
        L_0x003e:
            monitor-exit(r2)
            java.lang.Object r0 = r2.A00
            return r0
        L_0x0042:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46362Dde.A02():java.lang.Object");
    }

    public final void A04() {
        this.A01 = true;
    }
}
