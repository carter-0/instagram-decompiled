package X;

import com.instagram.business.promote.model.PromoteAudience;

/* renamed from: X.Wep  reason: case insensitive filesystem */
public final class C19748Wep implements MT5 {
    public final /* synthetic */ C17939ViU A00;
    public final /* synthetic */ PromoteAudience A01;
    public final /* synthetic */ U5O A02;
    public final /* synthetic */ String A03;

    public C19748Wep(C17939ViU viU, PromoteAudience promoteAudience, U5O u5o, String str) {
        this.A00 = viU;
        this.A02 = u5o;
        this.A01 = promoteAudience;
        this.A03 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r0 == 5) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r12.A00.A01 == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r1 != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D1Y(android.view.View r13, boolean r14) {
        /*
            r12 = this;
            r3 = 0
            if (r14 == 0) goto L_0x000a
            X.ViU r0 = r12.A00
            boolean r0 = r0.A01
            r2 = 1
            if (r0 != 0) goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            X.U5O r9 = r12.A02
            r9.A04(r14)
            r9.A03(r2)
            if (r14 == 0) goto L_0x0029
            X.ViU r0 = r12.A00
            com.instagram.business.promote.model.PromoteData r1 = r0.A05
            java.lang.Object r0 = r13.getTag()
            X.DbS.A1Y(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = X.W3x.A0S(r1, r0)
            r0 = 1
            if (r1 == 0) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            r9.A06(r0)
            if (r2 == 0) goto L_0x00b9
            X.ViU r6 = r12.A00
            X.WGU r2 = r6.A03
            X.UzE r1 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r0 = "edit_audience_link"
            r2.A0H(r1, r0)
            com.instagram.business.promote.model.PromoteAudience r0 = r12.A01
            com.instagram.api.schemas.AdvantageAudienceData r0 = r0.A02
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r2 = X.C13991Tnr.A0L(r0)
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.OFF
            r1 = 1
            boolean r11 = X.AnonymousClass7TF.A1W(r2, r0)
            com.instagram.business.promote.model.PromoteData r0 = r6.A05
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r0.A0i
            if (r0 != 0) goto L_0x012c
            r0 = -1
        L_0x0050:
            r4 = 3
            r2 = 5
            if (r0 == r1) goto L_0x005b
            r1 = 12
            if (r0 == r1) goto L_0x005b
            r10 = 1
            if (r0 != r2) goto L_0x005c
        L_0x005b:
            r10 = 0
        L_0x005c:
            com.instagram.common.session.UserSession r7 = r6.A07
            X.0xa r0 = X.AnonymousClass7TE.A0q(r7)
            java.lang.String r5 = "boost_advantage_plus_tooltip_seen_count"
            int r0 = r0.getInt(r5, r3)
            boolean r8 = X.JTQ.A1P(r0, r4)
            X.1Av r2 = X.1Au.A00(r7)
            r0 = 24
            java.lang.String r4 = "boost_advantage_plus_tooltip_last_shown_time_ms"
            boolean r0 = X.1Av.A08(r2, r4, r0)
            if (r11 == 0) goto L_0x00b9
            if (r10 == 0) goto L_0x00b9
            if (r8 != 0) goto L_0x00b9
            if (r0 == 0) goto L_0x00b9
            boolean r0 = X.C18803W2r.A06(r7)
            if (r0 == 0) goto L_0x00b9
            r0 = 2131427592(0x7f0b0108, float:1.8476805E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r9, r0)
            androidx.fragment.app.FragmentActivity r1 = r6.A02
            r0 = 2131970171(0x7f13487b, float:1.9577286E38)
            X.5Gt r1 = X.DbZ.A0V(r1, r0)
            r1.A03(r2)
            r0 = 1
            r1.A0B = r0
            r1.A01()
            X.Wmm r0 = new X.Wmm
            r0.<init>(r6, r1)
            r2.post(r0)
            X.0xa r0 = X.AnonymousClass7TE.A0q(r7)
            X.0xY r2 = X.AnonymousClass7TG.A0g(r0, r5)
            long r0 = java.lang.System.currentTimeMillis()
            r2.E5c(r4, r0)
            r2.apply()
        L_0x00b9:
            X.ViU r4 = r12.A00
            java.util.Map r0 = r4.A0B
            java.lang.String r5 = r12.A03
            java.lang.Object r1 = r0.get(r5)
            android.view.View r1 = (android.view.View) r1
            r6 = 8
            if (r1 == 0) goto L_0x00d0
            int r0 = X.DbW.A01(r14)
            r1.setVisibility(r0)
        L_0x00d0:
            java.util.Map r0 = r4.A09
            java.lang.Object r2 = r0.get(r5)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x00ef
            r0 = 2131440874(0x7f0b34ea, float:1.8503744E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r2, r0)
            int r0 = X.DbW.A01(r14)
            r2.setVisibility(r0)
            int r0 = X.DbW.A01(r14)
            r1.setVisibility(r0)
        L_0x00ef:
            java.util.Map r0 = r4.A0A
            java.lang.Object r5 = r0.get(r5)
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L_0x012b
            if (r14 == 0) goto L_0x0132
            r5.setVisibility(r3)
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x010e
            r0 = 1
            r4.A00 = r0
            X.WGU r2 = r4.A03
            X.UzE r1 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r0 = "taiwan_finserv_toggle"
            r2.A0H(r1, r0)
        L_0x010e:
            r0 = 2131442936(0x7f0b3cf8, float:1.8507926E38)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r5, r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r2 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r2
            com.instagram.business.promote.model.PromoteData r0 = r4.A05
            java.util.Set r1 = r0.A25
            com.instagram.api.schemas.XFBAdproRegionalRegulatedCategory r0 = com.instagram.api.schemas.XFBAdproRegionalRegulatedCategory.TAIWAN_FINSERV
            boolean r0 = r1.contains(r0)
            r2.setChecked(r0)
            X.WYN r0 = new X.WYN
            r0.<init>(r4, r3)
            r2.A07 = r0
        L_0x012b:
            return
        L_0x012c:
            int r0 = r0.ordinal()
            goto L_0x0050
        L_0x0132:
            r5.setVisibility(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19748Wep.D1Y(android.view.View, boolean):void");
    }
}
