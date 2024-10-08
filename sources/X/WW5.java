package X;

public final class WW5 implements X41 {
    public final int A00;
    public final Object A01;

    public WW5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        X.C51967G9n.A0z(r5, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        r0.A00(r5, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a1, code lost:
        r0 = "viewpointHelper";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b5, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bc, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c9, code lost:
        if (r20 == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r8.equals(((X.C15358UbA) r15.A01).A05) == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ECL(android.view.View r16, X.C296995qz r17, X.C296905qq r18, X.C296935qt r19, boolean r20) {
        /*
            r15 = this;
            r8 = r19
            int r0 = r15.A00
            r5 = r16
            r6 = r17
            r7 = r18
            r14 = r20
            switch(r0) {
                case 0: goto L_0x0097;
                case 1: goto L_0x0055;
                case 2: goto L_0x0090;
                case 3: goto L_0x00a4;
                default: goto L_0x000f;
            }
        L_0x000f:
            X.C51974G9v.A1O(r5, r8, r7, r6)
            if (r20 == 0) goto L_0x0021
            java.lang.Object r0 = r15.A01
            X.UbA r0 = (X.C15358UbA) r0
            X.5qt r0 = r0.A05
            boolean r0 = r8.equals(r0)
            r4 = 1
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            java.lang.Object r0 = r15.A01
            X.UbA r0 = (X.C15358UbA) r0
            X.VYM r3 = r0.A0B
            if (r3 == 0) goto L_0x00a1
            X.GWf r1 = new X.GWf
            r1.<init>(r6, r7)
            java.lang.String r0 = r8.getKey()
            X.30a r2 = X.AnonymousClass30Y.A00(r8, r1, r0)
            X.IPE r0 = r3.A02
            r2.A00(r0)
            if (r4 == 0) goto L_0x004f
            boolean r0 = r8 instanceof X.C296955qv
            if (r0 == 0) goto L_0x004f
            X.5qv r8 = (X.C296955qv) r8
            boolean r0 = r8.CP9()
            if (r0 == 0) goto L_0x004f
            X.GWX r0 = r3.A01
            r2.A00(r0)
        L_0x004f:
            X.2el r0 = r3.A00
        L_0x0051:
            X.C51967G9n.A0z(r5, r2, r0)
            return
        L_0x0055:
            X.C51974G9v.A1O(r5, r8, r7, r6)
            java.lang.Object r0 = r15.A01
            X.Ube r0 = (X.C15381Ube) r0
            X.Vae r3 = r0.A0J
            if (r3 == 0) goto L_0x00a1
            X.GWf r2 = new X.GWf
            r2.<init>(r6, r7)
            java.lang.String r1 = "grid:"
            java.lang.String r0 = r8.getKey()
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.30a r2 = X.AnonymousClass30Y.A00(r8, r2, r0)
            X.IPE r0 = r3.A03
            r2.A00(r0)
            if (r20 == 0) goto L_0x008d
            X.GWX r1 = r3.A00
            if (r1 == 0) goto L_0x008d
            boolean r0 = r8 instanceof X.C296955qv
            if (r0 == 0) goto L_0x008d
            X.5qv r8 = (X.C296955qv) r8
            boolean r0 = r8.CP9()
            if (r0 == 0) goto L_0x008d
            r2.A00(r1)
        L_0x008d:
            X.2el r0 = r3.A01
            goto L_0x0051
        L_0x0090:
            java.lang.Object r0 = r15.A01
            X.Ub9 r0 = (X.C15357Ub9) r0
            X.Hq5 r0 = r0.A0B
            goto L_0x009d
        L_0x0097:
            java.lang.Object r0 = r15.A01
            X.Ugy r0 = (X.C15693Ugy) r0
            X.Hq5 r0 = r0.A08
        L_0x009d:
            r0.A00(r5, r6, r7, r8)
            return
        L_0x00a1:
            java.lang.String r0 = "viewpointHelper"
            goto L_0x00b5
        L_0x00a4:
            X.C51974G9v.A1O(r5, r8, r7, r6)
            boolean r1 = r8 instanceof X.C69011Ncn
            java.lang.Object r0 = r15.A01
            X.UZq r0 = (X.C15286UZq) r0
            if (r1 == 0) goto L_0x00bd
            X.Hr7 r4 = r0.A0I
            if (r4 != 0) goto L_0x00c4
            java.lang.String r0 = "hcmViewpointHelper"
        L_0x00b5:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00bd:
            X.Hr7 r9 = r0.A0H
            if (r9 != 0) goto L_0x00d0
            java.lang.String r0 = "gridViewpointHelper"
            goto L_0x00b5
        L_0x00c4:
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x00cb
            r9 = 1
            if (r20 != 0) goto L_0x00cc
        L_0x00cb:
            r9 = 0
        L_0x00cc:
            r4.A00(r5, r6, r7, r8, r9)
            return
        L_0x00d0:
            r10 = r5
            r11 = r6
            r12 = r7
            r13 = r8
            r9.A00(r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WW5.ECL(android.view.View, X.5qz, X.5qq, X.5qt, boolean):void");
    }
}
