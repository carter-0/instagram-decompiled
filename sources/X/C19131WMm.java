package X;

/* renamed from: X.WMm  reason: case insensitive filesystem */
public final class C19131WMm implements AnonymousClass2hV {
    public final int A00;
    public final Object A01;

    public C19131WMm(int i, 0sP r2) {
        this.A00 = i;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ac, code lost:
        if (X.00l.A0d(r2, X.Pxd.A00(79), false) != false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (X.00l.A0d(r2, X.Pxd.A00(79), false) != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x011d;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x000e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A01
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r0 = r0.invoke(r8)
            return r0
        L_0x000e:
            r5 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            boolean r0 = X.0qQ.A0K(r8, r6)
            java.lang.String r4 = "promoteData"
            if (r0 != 0) goto L_0x0030
            java.lang.Object r3 = r7.A01
            X.UZb r3 = (X.C15273UZb) r3
            java.lang.String r2 = r3.A06
            if (r2 == 0) goto L_0x0118
            r0 = 79
            java.lang.String r1 = X.Pxd.A00(r0)
            r0 = 0
            boolean r0 = X.00l.A0d(r2, r1, r0)
            if (r0 == 0) goto L_0x0097
        L_0x0030:
            java.lang.Object r3 = r7.A01
            X.UZb r3 = (X.C15273UZb) r3
            com.instagram.business.promote.model.PromoteData r0 = r3.A04
            if (r0 == 0) goto L_0x0107
            boolean r0 = X.AnonymousClass9F0.A04(r0)
            if (r0 == 0) goto L_0x0097
            X.Vvl r0 = r3.A03
            if (r0 == 0) goto L_0x0048
            r1 = 0
            X.2da r0 = r0.A01
            r0.setIsLoading(r1)
        L_0x0048:
            com.instagram.common.session.UserSession r4 = r3.A05
            if (r4 == 0) goto L_0x010b
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323685178551686(0x810c3300002d86, double:3.0345829984318E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0094
            X.WGU r2 = r3.A01
            if (r2 == 0) goto L_0x0105
            X.UzE r1 = X.C16678UzE.DESTINATION_WEBSITE
            java.lang.String r0 = "soft_upsell_for_wa_hacky_link"
            r2.A0H(r1, r0)
            X.8ab r4 = X.DbW.A0U(r3)
            r4.A0s(r5)
            r0 = 2131970445(0x7f13498d, float:1.9577841E38)
            r4.A09(r0)
            r0 = 2131970444(0x7f13498c, float:1.957784E38)
            r4.A08(r0)
            r2 = 2131970435(0x7f134983, float:1.957782E38)
            r1 = 9
            X.W5U r0 = new X.W5U
            r0.<init>(r3, r1)
            r4.A0I(r0, r2)
            r2 = 2131968513(0x7f134201, float:1.9573923E38)
            r1 = 10
            X.W5U r0 = new X.W5U
            r0.<init>(r3, r1)
            r4.A0H(r0, r2)
        L_0x0091:
            X.DbT.A1V(r4)
        L_0x0094:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0097:
            boolean r0 = X.0qQ.A0K(r8, r6)
            if (r0 != 0) goto L_0x00ae
            java.lang.String r2 = r3.A06
            if (r2 == 0) goto L_0x0113
            r0 = 79
            java.lang.String r1 = X.Pxd.A00(r0)
            r0 = 0
            boolean r0 = X.00l.A0d(r2, r1, r0)
            if (r0 == 0) goto L_0x00fd
        L_0x00ae:
            com.instagram.business.promote.model.PromoteData r0 = r3.A04
            if (r0 == 0) goto L_0x0107
            boolean r0 = X.AnonymousClass9F0.A04(r0)
            if (r0 != 0) goto L_0x00fd
            com.instagram.common.session.UserSession r4 = r3.A05
            if (r4 == 0) goto L_0x0101
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324338013581321(0x810ccb00003009, double:3.034995853933297E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0094
            X.WGU r2 = r3.A01
            if (r2 == 0) goto L_0x0105
            X.UzE r1 = X.C16678UzE.DESTINATION_WEBSITE
            java.lang.String r0 = "soft_upsell_for_wa_hacky_link"
            r2.A0H(r1, r0)
            X.8ab r4 = X.DbW.A0U(r3)
            r4.A0s(r5)
            r0 = 2131973872(0x7f1356f0, float:1.9584792E38)
            r4.A09(r0)
            r0 = 2131973870(0x7f1356ee, float:1.9584788E38)
            r4.A08(r0)
            r2 = 2131973871(0x7f1356ef, float:1.958479E38)
            r1 = 11
            X.W5U r0 = new X.W5U
            r0.<init>(r3, r1)
            r4.A0I(r0, r2)
            r1 = 2131968513(0x7f134201, float:1.9573923E38)
            r0 = 12
            X.W5U.A01(r4, r3, r0, r1)
            goto L_0x0091
        L_0x00fd:
            X.C15273UZb.A03(r3)
            goto L_0x0094
        L_0x0101:
            X.DbS.A14()
            goto L_0x010e
        L_0x0105:
            java.lang.String r4 = "promoteLogger"
        L_0x0107:
            X.0qQ.A0F(r4)
            goto L_0x010e
        L_0x010b:
            X.DbS.A14()
        L_0x010e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0113:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0118:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x011d:
            java.lang.Object r0 = r7.A01
            X.W1k r0 = (X.C18784W1k) r0
            java.lang.Number r8 = (java.lang.Number) r8
            r8.getClass()
            com.instagram.business.promote.model.PromoteData r1 = r0.A03
            boolean r0 = r1.A2v
            if (r0 == 0) goto L_0x0137
            r1 = 1
        L_0x012d:
            int r0 = r8.intValue()
            int r1 = r1 * r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x0137:
            int r1 = r1.A0A
            goto L_0x012d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19131WMm.apply(java.lang.Object):java.lang.Object");
    }

    public C19131WMm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
