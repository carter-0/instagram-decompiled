package X;

/* renamed from: X.5PF  reason: invalid class name */
public final class AnonymousClass5PF extends AnonymousClass5PD {
    public 0sP A00;
    public 0sP A01;
    public final long A02;
    public final boolean A03;
    public final AnonymousClass5PD A04;
    public final boolean A05;

    public final void A0H() {
        AnonymousClass5PD r0;
        this.A02 = true;
        if (this.A05 && (r0 = this.A04) != null) {
            r0.A0H();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        r2 = r6.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r0 == null) goto L_0x000f;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5PF(X.AnonymousClass5PD r6, X.0sP r7, X.0sP r8, boolean r9, boolean r10) {
        /*
            r5 = this;
            X.5P8 r4 = X.AnonymousClass5P8.A04
            if (r6 == 0) goto L_0x000f
            boolean r0 = r6 instanceof X.AnonymousClass5PF
            if (r0 == 0) goto L_0x0067
            r0 = r6
            X.5PF r0 = (X.AnonymousClass5PF) r0
            X.0sP r0 = r0.A00
        L_0x000d:
            if (r0 != 0) goto L_0x001f
        L_0x000f:
            java.util.concurrent.atomic.AtomicReference r0 = X.AnonymousClass5P3.A08
            java.lang.Object r1 = r0.get()
            X.5PD r1 = (X.AnonymousClass5PD) r1
            boolean r0 = r1 instanceof X.AnonymousClass5PF
            if (r0 == 0) goto L_0x0064
            X.5PF r1 = (X.AnonymousClass5PF) r1
            X.0sP r0 = r1.A00
        L_0x001f:
            X.0sP r3 = X.AnonymousClass5P3.A0C(r7, r0, r9)
            if (r6 == 0) goto L_0x002b
            X.0sP r2 = r6.A06()
            if (r2 != 0) goto L_0x0037
        L_0x002b:
            java.util.concurrent.atomic.AtomicReference r0 = X.AnonymousClass5P3.A08
            java.lang.Object r0 = r0.get()
            androidx.compose.runtime.snapshots.Snapshot r0 = (androidx.compose.runtime.snapshots.Snapshot) r0
            X.0sP r2 = r0.A06()
        L_0x0037:
            if (r8 == 0) goto L_0x0062
            if (r2 == 0) goto L_0x0045
            if (r8 == r2) goto L_0x0045
            r1 = 9
            X.9Ly r0 = new X.9Ly
            r0.<init>((X.0sP) r8, (X.0sP) r2, (int) r1)
            r8 = r0
        L_0x0045:
            r0 = 0
            r5.<init>(r4, r3, r8, r0)
            r5.A04 = r6
            r5.A03 = r9
            r5.A05 = r10
            X.0sP r0 = r5.A07
            r5.A00 = r0
            X.0sP r0 = r5.A08
            r5.A01 = r0
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            r5.A02 = r0
            return
        L_0x0062:
            r8 = r2
            goto L_0x0045
        L_0x0064:
            X.0sP r0 = r1.A07
            goto L_0x001f
        L_0x0067:
            X.0sP r0 = r6.A07
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5PF.<init>(X.5PD, X.0sP, X.0sP, boolean, boolean):void");
    }

    public static final AnonymousClass5PD A00(AnonymousClass5PF r0) {
        AnonymousClass5PD r02 = r0.A04;
        if (r02 == null) {
            return (AnonymousClass5PD) AnonymousClass5P3.A08.get();
        }
        return r02;
    }
}
