package X;

/* renamed from: X.MoZ  reason: case insensitive filesystem */
public final class C67479MoZ {
    public 2EM A00;
    public final C67478MoY A01;

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0173, code lost:
        if (r0 != false) goto L_0x0175;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.2EM r10) {
        /*
            r9 = this;
            r1 = 0
            X.0qQ.A0B(r10, r1)
            X.2EM r6 = r9.A00
            if (r6 == r10) goto L_0x0213
            r9.A00 = r10
            X.MoY r0 = r9.A01
            X.Ma2 r2 = r0.A01
            X.PxF r7 = r0.A02
            X.Mbh r5 = r0.A00
            X.0eM r0 = r2.A1s
            java.lang.Object r4 = r0.getValue()
            X.Mjt r4 = (X.C67197Mjt) r4
            java.lang.String r3 = "CHANGE_FOLDER"
            X.48q r0 = X.C66633Ma2.A05(r2)
            r4.A02(r10, r0, r3)
            com.instagram.common.session.UserSession r0 = r2.A0p()
            boolean r0 = X.AnonymousClass6FC.A00(r0)
            if (r0 == 0) goto L_0x0038
            X.Pvy r0 = X.C66581MXm.A0V(r2)
            X.Pw5 r0 = r0.BNZ()
            r0.Eji(r10)
        L_0x0038:
            com.instagram.common.session.UserSession r0 = r2.A0p()
            boolean r0 = X.2El.A07(r0)
            if (r0 == 0) goto L_0x004d
            X.Pvy r0 = X.C66581MXm.A0V(r2)
            X.PxE r0 = r0.B6g()
            r0.Eji(r10)
        L_0x004d:
            X.5y8 r0 = X.C300895y8.A00
            boolean r0 = r10.equals(r0)
            r8 = 0
            if (r0 == 0) goto L_0x00ab
            X.0eM r4 = r2.A2e
            java.lang.Object r0 = r4.getValue()
            X.Nbb r0 = (X.C68952Nbb) r0
            X.34p r0 = r0.A00
            if (r0 == 0) goto L_0x0065
            r0.A04()
        L_0x0065:
            java.lang.Object r0 = r4.getValue()
            X.9HT r0 = (X.AnonymousClass9HT) r0
            X.9HU r0 = r0.A08
            r0.A00()
            X.0eM r3 = r2.A1h
            java.lang.Object r0 = r3.getValue()
            X.Pvy r0 = (X.C74503Pvy) r0
            X.P3Z r0 = r0.BbV()
            if (r0 == 0) goto L_0x01ee
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x01ee
            java.lang.Object r0 = r4.getValue()
            X.Nbb r0 = (X.C68952Nbb) r0
            X.34p r0 = r0.A01
            r0.A04()
            java.lang.Object r0 = r4.getValue()
            X.Nbb r0 = (X.C68952Nbb) r0
            X.34p r0 = r0.A02
            r0.A04()
            java.lang.Object r0 = r3.getValue()
            X.Pvy r0 = (X.C74503Pvy) r0
            X.P3Z r4 = r0.BbV()
            if (r4 == 0) goto L_0x00ab
            X.48q r3 = X.C2611948q.ALL
            java.lang.String r0 = "secondary_snapshot"
            r4.AUu(r10, r3, r0)
        L_0x00ab:
            r7.Eji(r10)
            X.Miz r3 = r5.A0E
            X.2EM r0 = r3.A0E
            if (r10 == r0) goto L_0x00c2
            r3.A0E = r10
            android.content.Context r4 = r5.A03
            X.48q r3 = X.C2611948q.ALL
            X.Mbk r0 = r5.A0C
            r0.A02(r4, r10, r3)
            X.C66736Mbh.A04(r5)
        L_0x00c2:
            X.Mkx r0 = r2.A0d
            if (r0 == 0) goto L_0x00cb
            X.Mky r0 = r0.A0C
            r0.A01()
        L_0x00cb:
            X.2EM r0 = r2.A0s()
            X.2EX r5 = X.AnonymousClass2EX.A00
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x0102
            X.0eE r3 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r2.A0p()
            com.instagram.user.model.User r0 = r3.A01(r0)
            boolean r0 = X.2Ek.A02(r0)
            if (r0 == 0) goto L_0x0102
            com.instagram.common.session.UserSession r7 = X.C66580MXl.A0P(r2, r1)
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r7)
            boolean r0 = X.2Ek.A02(r0)
            if (r0 == 0) goto L_0x01e1
            X.0Tu r0 = X.0Tu.A05
            r3 = 36317934217402005(0x8106f800011695, double:3.03094606744348E-306)
            boolean r0 = X.182.A06(r0, r7, r3)
            if (r0 == 0) goto L_0x01e1
        L_0x0102:
            X.Pvy r0 = X.C66581MXm.A0V(r2)
            X.Pvz r7 = r0.BzE()
            X.2EM r4 = r2.A0t()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            X.N4R r0 = new X.N4R
            r0.<init>((X.2EM) r4, (java.lang.Boolean) r3)
            r7.EWx(r0)
            X.0eM r0 = r2.A0z
            boolean r0 = r0.CVQ()
            if (r0 == 0) goto L_0x012d
            X.0eM r0 = r2.A0z
            java.lang.Object r0 = r0.getValue()
            X.3AD r0 = (X.AnonymousClass3AD) r0
            r0.ARa()
        L_0x012d:
            boolean r0 = r6.equals(r5)
            if (r0 == 0) goto L_0x01d2
            X.Odl r0 = X.OPT.A01(r2)
            r0.A07()
        L_0x013a:
            com.instagram.common.session.UserSession r6 = r2.A0p()
            X.0Tu r0 = X.0Tu.A05
            r3 = 36317934219695797(0x8106f8002416b5, double:3.0309460688940834E-306)
            boolean r0 = X.182.A06(r0, r6, r3)
            if (r0 == 0) goto L_0x015d
            com.instagram.common.session.UserSession r0 = r2.A0p()
            X.2cc r4 = X.C71342cb.A00(r0)
            X.Os5 r3 = new X.Os5
            r3.<init>(r10)
            java.lang.String r0 = "not_activity_or_fragment"
            r4.A0E(r0, r3)
        L_0x015d:
            com.instagram.common.session.UserSession r4 = r2.A0p()
            boolean r3 = r2.A1A(r5)
            X.0qQ.A0B(r4, r1)
            boolean r0 = X.2El.A0C(r4)
            if (r0 != 0) goto L_0x0175
            boolean r0 = X.2El.A0N(r4, r3)
            r3 = 0
            if (r0 == 0) goto L_0x0176
        L_0x0175:
            r3 = 2
        L_0x0176:
            r5 = 0
            r0 = 2
            if (r3 != r0) goto L_0x0198
            com.instagram.common.session.UserSession r0 = r2.A0p()
            X.3H4 r0 = X.2J7.A00(r0)
            java.util.Map r3 = r0.A02
            boolean r0 = r3.containsKey(r10)
            if (r0 == 0) goto L_0x0198
            java.lang.Object r0 = r3.get(r10)
            X.0qQ.A0A(r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            if (r0 <= 0) goto L_0x0198
            r5 = 1
        L_0x0198:
            com.instagram.common.session.UserSession r0 = r2.A0p()
            int r4 = r10.A00
            X.0qQ.A0B(r0, r1)
            X.0Aj r3 = X.C66583MXo.A0H(r0)
            java.lang.String r1 = "tab_switch"
            java.lang.String r0 = "action"
            java.lang.Long r1 = X.DbV.A0p(r3, r0, r1, r4)
            java.lang.String r0 = "folder"
            r3.A9F(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "has_unread_badge"
            r3.A7p(r0, r1)
            r3.Cgf()
            X.Mi6 r0 = r2.A1M
            if (r0 == 0) goto L_0x0213
            X.4mt r0 = r0.A00
            X.MeY r1 = r0.A04
            if (r1 != 0) goto L_0x0206
            java.lang.String r0 = "actionBarRepository"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01d2:
            boolean r0 = r10.equals(r5)
            if (r0 == 0) goto L_0x013a
            X.Odl r0 = X.OPT.A01(r2)
            r0.A08()
            goto L_0x013a
        L_0x01e1:
            com.instagram.common.session.UserSession r0 = r2.A0p()
            boolean r0 = X.2El.A0J(r0)
            if (r0 != 0) goto L_0x0102
            r8 = 1
            goto L_0x0102
        L_0x01ee:
            java.lang.Object r0 = r4.getValue()
            X.Nbb r0 = (X.C68952Nbb) r0
            X.34p r0 = r0.A01
            r0.A03()
            java.lang.Object r0 = r4.getValue()
            X.Nbb r0 = (X.C68952Nbb) r0
            X.34p r0 = r0.A02
            r0.A03()
            goto L_0x00ab
        L_0x0206:
            X.2EM r0 = r1.A01
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 != 0) goto L_0x0213
            r1.A01 = r10
            X.MeY.A01(r1)
        L_0x0213:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67479MoZ.A00(X.2EM):void");
    }

    public C67479MoZ(C67478MoY moY, 2EM r2) {
        this.A00 = r2;
        this.A01 = moY;
    }
}
