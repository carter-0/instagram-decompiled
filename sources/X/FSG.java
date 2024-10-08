package X;

public final class FSG implements AnonymousClass2Kv {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public FSG(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.ESI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.ESG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.ESI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: X.ESI} */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fa, code lost:
        r4.setItems(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010a, code lost:
        r2.A07(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0182, code lost:
        if (r4.getCoercedBooleanField(0, r1) == false) goto L_0x0184;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0155;
                case 1: goto L_0x010e;
                case 2: goto L_0x00fe;
                case 3: goto L_0x00bd;
                case 4: goto L_0x00a9;
                case 5: goto L_0x0097;
                case 6: goto L_0x004c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r6 = r7.A02
            X.Der r6 = (X.C46430Der) r6
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x0015:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            X.0eM r0 = r6.A0u
            X.Dbb.A1U(r1, r5, r0)
            goto L_0x0015
        L_0x0025:
            X.Dex r3 = r6.A0E
            if (r3 != 0) goto L_0x0033
            java.lang.String r0 = "followListAdapter"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0033:
            java.util.Iterator r2 = r5.iterator()
        L_0x0037:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0199
            java.lang.Object r1 = r2.next()
            java.util.List r0 = r3.A0C
            r0.remove(r1)
            java.util.List r0 = r3.A0w
            r0.remove(r1)
            goto L_0x0037
        L_0x004c:
            java.lang.Object r4 = r7.A02
            X.ESG r4 = (X.ESG) r4
            r5 = 0
            r4.A08 = r5
            if (r8 == 0) goto L_0x0086
            X.3lr r3 = X.C41845B3m.A0U(r8)
            if (r3 == 0) goto L_0x0086
            java.lang.Class<X.BqJ> r2 = X.BqJ.class
            r0 = 1362(0x552, float:1.909E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1911787969(0x71f391c1, float:2.412194E30)
            X.3lr r3 = r3.getRequiredTreeField(r5, r1, r2, r0)
            if (r3 == 0) goto L_0x0086
            r0 = 164(0xa4, float:2.3E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.hasFieldValue(r1)
            if (r0 == 0) goto L_0x0086
            java.lang.Object r2 = r7.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            r0 = 1
            java.lang.Boolean r1 = X.C41846B3n.A0d(r3, r1, r0)
            X.4Cl r0 = r2.A03
            r0.EVF(r1)
        L_0x0086:
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x01bb
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x01bb
            boolean r0 = r4.A07
            if (r0 != 0) goto L_0x01bb
            java.util.List r0 = X.ESG.A06(r4)
            goto L_0x00fa
        L_0x0097:
            java.lang.Object r1 = r7.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 1
            r1.setEnabled(r0)
            X.FGz r2 = X.C49966FGz.A00
            java.lang.Object r0 = r7.A02
            X.FF7 r0 = (X.FF7) r0
            com.instagram.common.session.UserSession r1 = r0.A04
            r0 = 0
            goto L_0x010a
        L_0x00a9:
            java.lang.Object r0 = r7.A01
            android.view.View r0 = (android.view.View) r0
            r2 = 1
            r0.setEnabled(r2)
            X.FGz r1 = X.C49966FGz.A00
            java.lang.Object r0 = r7.A02
            X.FF7 r0 = (X.FF7) r0
            com.instagram.common.session.UserSession r0 = r0.A04
            r1.A07(r0, r2)
            return
        L_0x00bd:
            if (r8 == 0) goto L_0x01bb
            X.3lr r3 = X.C41845B3m.A0U(r8)
            if (r3 == 0) goto L_0x01bb
            java.lang.Class<X.BqJ> r2 = X.BqJ.class
            r0 = 1362(0x552, float:1.909E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1911787969(0x71f391c1, float:2.412194E30)
            X.3lr r3 = r3.A05(r2, r1, r0)
            if (r3 == 0) goto L_0x01bb
            r0 = 164(0xa4, float:2.3E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.hasFieldValue(r2)
            if (r0 == 0) goto L_0x01bb
            java.lang.Object r4 = r7.A02
            X.ESI r4 = (X.ESI) r4
            r1 = 1
            r4.A0A = r1
            java.lang.Object r0 = r7.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.Boolean r1 = X.C41846B3n.A0d(r3, r2, r1)
            X.4Cl r0 = r0.A03
            r0.EVF(r1)
            java.util.ArrayList r0 = X.ESI.A06(r4)
        L_0x00fa:
            r4.setItems(r0)
            return
        L_0x00fe:
            X.FGz r2 = X.C49966FGz.A00
            java.lang.Object r1 = r7.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r7.A01
            X.E7G r0 = (X.E7G) r0
            boolean r0 = r0.A01
        L_0x010a:
            r2.A07(r1, r0)
            return
        L_0x010e:
            X.3lr r3 = X.C41845B3m.A0U(r8)
            if (r3 == 0) goto L_0x014f
            java.lang.Class<X.Bh1> r2 = X.C42704Bh1.class
            r4 = 0
            r0 = 829(0x33d, float:1.162E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1101492816(0xffffffffbe588db0, float:-0.211478)
            X.3lr r3 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L_0x014f
            java.lang.Object r2 = r7.A02
            X.FYl r2 = (X.C50331FYl) r2
            r0 = 499(0x1f3, float:6.99E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.hasFieldValue(r1)
            if (r0 == 0) goto L_0x013c
            java.lang.Boolean r0 = X.C41846B3n.A0d(r3, r1, r4)
            r2.A01 = r0
        L_0x013c:
            r0 = 2585(0xa19, float:3.622E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.hasFieldValue(r1)
            if (r0 == 0) goto L_0x014f
            r0 = 1
            java.lang.Boolean r0 = X.C41846B3n.A0d(r3, r1, r0)
            r2.A02 = r0
        L_0x014f:
            java.lang.Object r0 = r7.A01     // Catch:{ Exception -> 0x01bb }
            X.DbS.A1U(r0)     // Catch:{ Exception -> 0x01bb }
            return
        L_0x0155:
            X.3lr r4 = X.C41845B3m.A0U(r8)
            if (r4 == 0) goto L_0x01bb
            java.lang.Class<X.Bp1> r3 = X.Bp1.class
            r2 = 0
            r0 = 4254(0x109e, float:5.961E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 495053591(0x1d81eb17, float:3.4389093E-21)
            X.3lr r4 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r4 == 0) goto L_0x01bb
            java.lang.Object r3 = r7.A01
            X.0r1 r3 = (X.0r1) r3
            r0 = 3425(0xd61, float:4.8E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            boolean r0 = r4.hasFieldValue(r1)
            if (r0 == 0) goto L_0x0184
            boolean r1 = r4.getCoercedBooleanField(r2, r1)
            r0 = 1
            if (r1 != 0) goto L_0x0185
        L_0x0184:
            r0 = 0
        L_0x0185:
            r3.A00 = r0
            java.lang.Object r2 = r7.A02
            X.0rl r2 = (X.0rl) r2
            r1 = 1
            java.lang.String r0 = "timestamp"
            long r0 = r4.getCoercedTimeField(r1, r0)
            r2.A00 = r0
            boolean r0 = r3.A00
            X.AnonymousClass5MG.A01 = r0
            return
        L_0x0199:
            r0 = 0
            r3.A0G(r0, r0)
            android.content.Context r4 = r6.getContext()
            android.content.res.Resources r3 = X.DbV.A05(r6)
            r2 = 2131820986(0x7f1101ba, float:1.9274702E38)
            int r1 = r5.size()
            int r0 = r5.size()
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r0)
            java.lang.String r0 = r3.getQuantityString(r2, r1, r0)
            X.C59689JTv.A09(r4, r0)
        L_0x01bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FSG.invoke(X.3JD):void");
    }
}
