package X;

/* renamed from: X.5Qq  reason: invalid class name and case insensitive filesystem */
public final class C285295Qq extends C267794cD implements AnonymousClass5Qr, C285305Qs {
    public C285305Qs A00;
    public C285315Qt A01;
    public final 0sP A02;
    public final Object A03 = C285325Qu.A00;

    public final void A0F() {
        this.A01 = null;
        this.A00 = null;
    }

    public final Object C9j() {
        return this.A03;
    }

    public final boolean DB6(C55429HhZ hhZ) {
        C285315Qt r0 = this.A00;
        if (r0 == null && (r0 = this.A01) == null) {
            return false;
        }
        return r0.DB6(hhZ);
    }

    public final void DCE(C55429HhZ hhZ) {
        J6M j6m = new J6M(hhZ, 24);
        if (j6m.invoke(this) == GRZ.ContinueTraversal) {
            GQ7.A03(this, j6m);
        }
    }

    public final void DDa(C55429HhZ hhZ) {
        C285315Qt r0 = this.A01;
        if (r0 != null) {
            r0.DDa(hhZ);
        }
        C285305Qs r02 = this.A00;
        if (r02 != null) {
            r02.DDa(hhZ);
        }
        this.A00 = null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r1 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        r1.DSV(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        r0 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r0 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        r0.DSV(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r3 != null) goto L_0x0027;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DSV(X.C55429HhZ r5) {
        /*
            r4 = this;
            X.5Qs r3 = r4.A00
            r2 = 1
            if (r3 == 0) goto L_0x003b
            android.view.DragEvent r0 = r5.A00
            float r1 = r0.getX()
            float r0 = r0.getY()
            long r0 = X.C289325dP.A00(r1, r0)
            boolean r0 = X.HRE.A00(r3, r0)
            if (r0 != r2) goto L_0x003b
            r1 = r3
        L_0x001a:
            boolean r0 = X.0qQ.A0K(r1, r3)
            if (r0 != 0) goto L_0x002d
            if (r1 == 0) goto L_0x0025
            r1.DSV(r5)
        L_0x0025:
            if (r3 == 0) goto L_0x002a
        L_0x0027:
            r3.DDa(r5)
        L_0x002a:
            r4.A00 = r1
            return
        L_0x002d:
            if (r1 == 0) goto L_0x0033
            r1.DSV(r5)
            goto L_0x002a
        L_0x0033:
            X.5Qt r0 = r4.A01
            if (r0 == 0) goto L_0x002a
            r0.DSV(r5)
            goto L_0x002a
        L_0x003b:
            X.4cD r0 = r4.A03
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x004e
            r1 = 0
        L_0x0042:
            X.5Qs r1 = (X.C285305Qs) r1
            if (r1 == 0) goto L_0x0062
            if (r3 != 0) goto L_0x001a
            r1.DSV(r5)
            X.5Qt r3 = r4.A01
            goto L_0x0025
        L_0x004e:
            X.0rm r2 = new X.0rm
            r2.<init>()
            r1 = 11
            X.Iwy r0 = new X.Iwy
            r0.<init>(r1, r5, r4, r2)
            X.GQ7.A03(r4, r0)
            java.lang.Object r1 = r2.A00
            X.5Qr r1 = (X.AnonymousClass5Qr) r1
            goto L_0x0042
        L_0x0062:
            if (r3 == 0) goto L_0x001a
            X.5Qt r0 = r4.A01
            if (r0 == 0) goto L_0x0027
            r0.DSV(r5)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C285295Qq.DSV(X.HhZ):void");
    }

    public C285295Qq(0sP r2) {
        this.A02 = r2;
    }
}
