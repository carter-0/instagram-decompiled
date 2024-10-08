package X;

/* renamed from: X.Weq  reason: case insensitive filesystem */
public final class C19749Weq implements MT5 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C19749Weq(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj2;
        this.A04 = obj4;
        this.A02 = obj3;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0108, code lost:
        if (r4 != false) goto L_0x010a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D1Y(android.view.View r12, boolean r13) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0092;
                case 1: goto L_0x004c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r11.A02
            X.U5O r6 = (X.U5O) r6
            r6.A04(r13)
            if (r13 == 0) goto L_0x016c
            java.lang.Object r8 = r11.A03
            com.instagram.business.promote.model.PromoteData r8 = (com.instagram.business.promote.model.PromoteData) r8
            r7 = 1
            boolean r0 = X.W3E.A08(r8, r7)
            if (r0 != 0) goto L_0x010a
            java.util.List r1 = r8.A1q
            X.0qQ.A06(r1)
            boolean r0 = r8.A2p
            if (r0 != 0) goto L_0x016c
            java.util.Iterator r5 = r1.iterator()
        L_0x0026:
            r4 = 0
        L_0x0027:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0108
            java.lang.Object r0 = r5.next()
            com.instagram.api.schemas.InstagramProfileCallToActionDestinations r0 = (com.instagram.api.schemas.InstagramProfileCallToActionDestinations) r0
            int r0 = r0.ordinal()
            if (r0 != r7) goto L_0x0027
            com.instagram.common.session.UserSession r3 = r8.A0y
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315271337610354(0x81048c00000c72, double:3.029262051540684E-306)
            boolean r0 = X.DbY.A1Y(r2, r3, r0)
            if (r0 != 0) goto L_0x004a
            if (r4 == 0) goto L_0x0026
        L_0x004a:
            r4 = 1
            goto L_0x0027
        L_0x004c:
            java.lang.Object r6 = r11.A03
            com.instagram.api.schemas.XIGIGBoostCallToAction r6 = (com.instagram.api.schemas.XIGIGBoostCallToAction) r6
            if (r6 == 0) goto L_0x0087
            java.lang.Object r0 = r11.A04
            com.instagram.leadgen.core.api.LeadForm r0 = (com.instagram.leadgen.core.api.LeadForm) r0
            if (r0 == 0) goto L_0x0087
            java.lang.Object r5 = r11.A02
            X.U5O r5 = (X.U5O) r5
            java.lang.Object r4 = r11.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.String r1 = r0.A02
            X.AnonymousClass7TG.A1T(r4, r1, r6)
            r0 = 2131970376(0x7f134948, float:1.9577701E38)
            java.lang.String r3 = X.DbW.A0h(r4, r1, r0)
            java.lang.String r2 = "\n"
            r1 = 2131970375(0x7f134947, float:1.95777E38)
            int r0 = X.C18677Vwa.A00(r6)
            java.lang.String r0 = r4.getString(r0)
            java.lang.String r0 = X.DbW.A0h(r4, r0, r1)
            java.lang.String r0 = X.002.A0g(r3, r2, r0)
            X.0qQ.A07(r0)
            r5.setSecondaryText((java.lang.String) r0)
        L_0x0087:
            java.lang.Object r0 = r11.A02
            X.U5O r0 = (X.U5O) r0
            r0.A04(r13)
            r0.A03(r13)
            return
        L_0x0092:
            if (r13 == 0) goto L_0x00fa
            java.lang.Object r5 = r11.A03
            com.instagram.business.promote.model.PromoteData r5 = (com.instagram.business.promote.model.PromoteData) r5
            r4 = 0
            r5.A2v = r4
            X.Vtg r0 = X.C18528Vtg.A00
            r0.A00(r5)
            int r1 = r5.A0A
            if (r1 == 0) goto L_0x00f7
            java.lang.Object r0 = r11.A01
            java.util.List r0 = (java.util.List) r0
            boolean r0 = X.C66581MXm.A1W(r1, r0)
            if (r0 == 0) goto L_0x00f7
            int r2 = r5.A0A
        L_0x00b0:
            java.lang.Object r1 = r11.A04
            X.U4o r1 = (X.C14724U4o) r1
            r1.setVisibility(r4)
            java.lang.Object r0 = r11.A01
            java.util.List r0 = (java.util.List) r0
            X.C14724U4o.A00(r1, r0, r2)
            com.instagram.common.session.UserSession r3 = r5.A0y
            X.0qQ.A06(r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327988735785818(0x81101d00003b5a, double:3.037304585355699E-306)
            X.182.A06(r2, r3, r0)
            boolean r0 = X.C18803W2r.A04(r3)
            if (r0 == 0) goto L_0x016b
            r0 = 36330239298781730(0x81122900024222, double:3.038727850456604E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x016b
            java.lang.Object r2 = r11.A02
            X.VaL r2 = (X.C17567VaL) r2
            com.instagram.igds.components.form.IgFormField r1 = r2.A02
            if (r1 == 0) goto L_0x00ef
            int r0 = r5.A0A
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setTextProperty(r0)
        L_0x00ef:
            android.view.View r0 = r2.A00
            if (r0 == 0) goto L_0x016b
            r0.setVisibility(r4)
            return
        L_0x00f7:
            int r2 = r5.A09
            goto L_0x00b0
        L_0x00fa:
            java.lang.Object r0 = r11.A04
            android.view.View r0 = (android.view.View) r0
            r4 = 8
            r0.setVisibility(r4)
            java.lang.Object r2 = r11.A02
            X.VaL r2 = (X.C17567VaL) r2
            goto L_0x00ef
        L_0x0108:
            if (r4 == 0) goto L_0x016c
        L_0x010a:
            r0 = 1
        L_0x010b:
            r6.A03(r0)
            X.2YV r0 = new X.2YV
            r0.<init>()
            java.lang.Object r9 = r11.A01
            androidx.fragment.app.FragmentActivity r9 = (androidx.fragment.app.FragmentActivity) r9
            r0 = 2131970416(0x7f134970, float:1.9577782E38)
            java.lang.String r8 = X.AnonymousClass7TE.A16(r9, r0)
            r0 = 2131427592(0x7f0b0108, float:1.8476805E38)
            com.instagram.common.ui.base.IgTextView r7 = X.DbX.A0Z(r6, r0)
            java.lang.Object r6 = r11.A03
            com.instagram.business.promote.model.PromoteData r6 = (com.instagram.business.promote.model.PromoteData) r6
            r2 = 1
            r10 = 2
            X.0qQ.A0B(r7, r10)
            com.instagram.common.session.UserSession r1 = r6.A0y
            X.0qQ.A0A(r1)
            X.1Av r4 = X.1Au.A00(r1)
            r0 = r9
            X.XA9 r0 = (X.XA9) r0
            r0.Bhj()
            boolean r0 = X.W3E.A08(r6, r2)
            if (r0 == 0) goto L_0x016b
            X.WGU r3 = X.WGU.A00(r1)
            X.0qQ.A07(r3)
            X.UzE r2 = X.C16678UzE.PROFILE_VISIT_SETTING
            java.lang.String r1 = "profile_visit_wa_secondary_cta_objective"
            java.lang.String r0 = ""
            r3.A0K(r2, r1, r0, r0)
            X.0xa r5 = r4.A01
            java.lang.String r4 = "profile_visit_whatsapp_as_secondary_cta_tooltip_impression_count"
            r3 = 0
            int r0 = r5.getInt(r4, r3)
            if (r0 >= r10) goto L_0x016b
            X.Iiu r2 = new X.Iiu
            r2.<init>(r9, r6, r7, r8)
            r0 = 500(0x1f4, double:2.47E-321)
            r7.postDelayed(r2, r0)
            X.JTS.A1S(r5, r4, r3)
        L_0x016b:
            return
        L_0x016c:
            r0 = 0
            goto L_0x010b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19749Weq.D1Y(android.view.View, boolean):void");
    }
}
