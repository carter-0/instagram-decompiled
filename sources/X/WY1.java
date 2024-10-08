package X;

public final class WY1 implements G77 {
    public final int A00;
    public final Object A01;

    public WY1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onSearchCleared(String str) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c1, code lost:
        r1.A01 = r6;
        r1.A03(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSearchTextChanged(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0044;
                case 1: goto L_0x0109;
                case 2: goto L_0x00e4;
                case 3: goto L_0x00d8;
                case 4: goto L_0x0017;
                case 5: goto L_0x00c8;
                case 6: goto L_0x00a6;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r5.A01
            X.Uam r0 = (X.C15337Uam) r0
            X.Jhq r2 = X.C15337Uam.A01(r0)
            r1 = 0
            r0 = 1
            r2.A00(r6, r0, r1)
        L_0x0016:
            return
        L_0x0017:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r2 = r5.A01
            X.Uan r2 = (X.C15338Uan) r2
            X.UAC r1 = r2.A0M
            java.lang.String r0 = r1.A01
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x0041
            java.util.List r0 = r1.A03
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0041
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
        L_0x0033:
            r1.A00 = r0
            r1.A01 = r6
            r1.notifyDataSetChanged()
            X.Wek r1 = r2.A07
            if (r1 != 0) goto L_0x00c1
            java.lang.String r0 = "networkHelper"
            goto L_0x006e
        L_0x0041:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0033
        L_0x0044:
            r2 = 0
            X.0qQ.A0B(r6, r2)
            java.lang.Object r1 = r5.A01
            X.UZ3 r1 = (X.UZ3) r1
            X.Trf r0 = r1.A09()
            r0.A04()
            X.UdQ r0 = r1.A08()
            r0.A00 = r2
            X.UdQ r0 = r1.A08()
            r0.A00()
            X.X4Z r0 = r1.A07
            boolean r0 = r0.CYJ()
            if (r0 != 0) goto L_0x0016
            X.VbT r1 = r1.A04
            if (r1 != 0) goto L_0x0076
            java.lang.String r0 = "searchRequestController"
        L_0x006e:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0076:
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x0016
            X.Ts1 r0 = r1.A02
            boolean r0 = r0.A06(r6)
            if (r0 == 0) goto L_0x0016
            X.VMG r0 = r1.A01
            X.UZ3 r2 = r0.A00
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r2.A07()
            java.lang.String r0 = r0.getSearchString()
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x0016
            X.UdQ r1 = r2.A08()
            r0 = 10
            r1.A00 = r0
            X.UdQ r0 = r2.A08()
            r0.A00()
            return
        L_0x00a6:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r5.A01
            X.Uai r0 = (X.C15333Uai) r0
            X.0eM r0 = r0.A0A
            java.lang.Object r2 = r0.getValue()
            X.U8r r2 = (X.C14781U8r) r2
            r1 = 3
            X.Iwc r0 = new X.Iwc
            r0.<init>(r6, r1)
            X.C14781U8r.A00(r2, r0)
            X.Uqr r1 = r2.A03
        L_0x00c1:
            r0 = 1
            r1.A01 = r6
            r1.A03(r0)
            return
        L_0x00c8:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r5.A01
            X.Uaj r0 = (X.C15334Uaj) r0
            X.U8g r0 = X.C15334Uaj.A00(r0)
            r0.A01(r6)
            return
        L_0x00d8:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r5.A01
            X.Uar r0 = (X.C15341Uar) r0
            X.C15341Uar.A02(r0, r6)
            return
        L_0x00e4:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r5.A01
            X.Uah r0 = (X.C15332Uah) r0
            X.0eM r0 = r0.A02
            java.lang.Object r4 = r0.getValue()
            X.U8e r4 = (X.C14768U8e) r4
            r3 = 1
            X.Iwc r2 = new X.Iwc
            r2.<init>(r6, r3)
            X.2Fj r1 = r4.A01
            X.2Fk r0 = r4.A00
            X.C13991Tnr.A0y(r0, r1, r2)
            X.Uqq r0 = r4.A03
            r0.A01 = r6
            r0.A03(r3)
            return
        L_0x0109:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r5.A01
            X.UYc r0 = (X.C15262UYc) r0
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.U8V r0 = (X.U8V) r0
            X.05G r0 = r0.A03
            r0.Epw(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WY1.onSearchTextChanged(java.lang.String):void");
    }
}
