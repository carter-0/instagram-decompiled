package X;

import android.view.View;

/* renamed from: X.OjA  reason: case insensitive filesystem */
public final class C71355OjA implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public C71355OjA(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.A00 = i;
        this.A04 = z;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0054, code lost:
        if (((X.C16028UnH) r9.A03).A00.A0I() != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0214;
                case 1: goto L_0x01e5;
                case 2: goto L_0x01bf;
                case 3: goto L_0x0198;
                case 4: goto L_0x0133;
                case 5: goto L_0x00d5;
                case 6: goto L_0x003b;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1659581799(0x62eb3567, float:2.1694165E21)
            int r1 = X.AnonymousClass0fD.A05(r0)
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x0020
            java.lang.Object r2 = r9.A03
            X.FF7 r2 = (X.FF7) r2
            java.lang.String r0 = "invite_friends"
            X.FF7.A01(r2, r0)
            r0 = 1957123363(0x74a75523, float:1.0605961E32)
        L_0x001c:
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        L_0x0020:
            java.lang.Object r0 = r9.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            java.lang.Object r3 = r9.A03
            X.FF7 r3 = (X.FF7) r3
            java.lang.Object r0 = r9.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.String r2 = X.C48957Emv.A00(r0)
            r0 = 0
            X.FF7.A00(r3, r0, r2)
            r0 = -2133530726(0xffffffff80d4e79a, float:-1.9552208E-38)
            goto L_0x001c
        L_0x003b:
            r0 = -778363151(0xffffffffd19b1ef1, float:-8.327988E10)
            int r1 = X.AnonymousClass0fD.A05(r0)
            boolean r4 = r9.A04
            r5 = 1
            r7 = 0
            if (r4 != 0) goto L_0x0056
            java.lang.Object r2 = r9.A03
            X.UnH r2 = (X.C16028UnH) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.leadgen.core.ui.LeadGenFormStoreLocatorView r0 = r2.A00
            boolean r0 = r0.A0I()
            if (r0 == 0) goto L_0x008f
        L_0x0056:
            java.lang.Object r0 = r9.A02
            X.UKy r0 = (X.C15045UKy) r0
            java.util.List r3 = r0.A08
            boolean r0 = X.AnonymousClass7TE.A1b(r3)
            if (r0 == 0) goto L_0x008f
            java.lang.Object r0 = r3.get(r7)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r0 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r0
            java.lang.String r0 = r0.A00
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0093
            if (r4 != 0) goto L_0x0093
            java.lang.Object r2 = r9.A03
            X.UnH r2 = (X.C16028UnH) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.leadgen.core.ui.LeadGenFormStoreLocatorView r0 = r2.A00
            com.instagram.common.ui.base.IgTextView r0 = r0.A04
            r0.setVisibility(r7)
            java.lang.Object r2 = r9.A01
            X.Vl6 r2 = (X.C18077Vl6) r2
            java.lang.Object r0 = r3.get(r7)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r0 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r0
            r2.A02(r0)
            r2.A00()
        L_0x008f:
            r0 = -394386262(0xffffffffe87e24aa, float:-4.8006297E24)
            goto L_0x001c
        L_0x0093:
            java.lang.Object r2 = r9.A03
            X.UnH r2 = (X.C16028UnH) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.leadgen.core.ui.LeadGenFormStoreLocatorView r6 = r2.A00
            com.instagram.common.ui.base.IgTextView r2 = r6.A04
            r0 = 8
            r2.setVisibility(r0)
            java.lang.Object r4 = r9.A01
            X.Vl6 r4 = (X.C18077Vl6) r4
            java.lang.String r3 = r6.A00
            X.W33 r0 = X.W33.A00
            java.lang.String r2 = r6.getCountryCode()
            java.util.Set r0 = X.W33.A01
            boolean r2 = r0.contains(r2)
            X.0qQ.A0B(r3, r7)
            X.Umf r0 = r4.A00
            X.U8P r0 = r0.A07()
            X.UnS r0 = (X.C16039UnS) r0
            if (r2 == 0) goto L_0x00c3
            java.lang.String r3 = "00000"
        L_0x00c3:
            com.instagram.leadads.repository.LeadFormQuestionsRepository r0 = r0.A0J
            X.0Ud r0 = r0.A0N
            java.lang.Object r0 = r0.getValue()
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r0 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r0
            if (r0 == 0) goto L_0x00d1
            r0.A00 = r3
        L_0x00d1:
            r4.A06(r5)
            goto L_0x008f
        L_0x00d5:
            r0 = -1034109281(0xffffffffc25cbe9f, float:-55.186153)
            int r1 = X.AnonymousClass0fD.A05(r0)
            X.37E r7 = X.AnonymousClass37D.A00
            java.lang.Object r6 = r9.A03
            X.OKp r6 = (X.C70769OKp) r6
            android.app.Activity r5 = r6.A00
            X.37D r4 = r7.A01(r5)
            if (r4 == 0) goto L_0x00f6
            java.lang.Object r3 = r9.A02
            r2 = 4
            X.PQt r0 = new X.PQt
            r0.<init>(r2, r6, r3)
            X.37F r4 = (X.AnonymousClass37F) r4
            r4.A0H = r0
        L_0x00f6:
            X.37D r0 = r7.A01(r5)
            X.7Pu r0 = X.C48943Emh.A00(r0)
            if (r0 == 0) goto L_0x0103
            r0.A07()
        L_0x0103:
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x012e
            com.instagram.common.session.UserSession r4 = r6.A01
            java.lang.Object r3 = r9.A01
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r3 = (com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams) r3
            X.0Aj r2 = X.C66584MXp.A0C(r4)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x012e
            X.C71137Odf.A01(r2, r4)
            java.lang.String r0 = "fwd_share_anyway_click"
            X.C66584MXp.A0v(r2, r0)
            java.lang.Long r0 = X.C66583MXo.A0f(r3)
            X.76k r0 = X.C66583MXo.A0I(r2, r3, r0)
            java.lang.Long r0 = X.C66584MXp.A0R(r0, r2, r3)
            X.C66583MXo.A17(r2, r0)
        L_0x012e:
            r0 = 1888173460(0x708b3d94, float:3.4474288E29)
            goto L_0x001c
        L_0x0133:
            r0 = 213994230(0xcc14af6, float:2.9781474E-31)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r9.A03
            X.0lg r5 = (X.0lg) r5
            java.lang.Object r4 = r9.A01
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r2 = r9.A04
            java.lang.Object r0 = r9.A02
            java.lang.Number r0 = (java.lang.Number) r0
            if (r2 != 0) goto L_0x015e
            X.1xC r3 = X.1xC.A01
            X.6ap r2 = X.DbV.A0X()
            r0 = 2131958840(0x7f131c38, float:1.9554304E38)
            X.DbS.A19(r4, r2, r0)
            X.DbY.A1K(r3, r2)
        L_0x0159:
            r0 = 933900843(0x37aa322b, float:2.028894E-5)
            goto L_0x001c
        L_0x015e:
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            int r0 = r0.intValue()
            int r0 = 2 - r0
            if (r0 == 0) goto L_0x0195
            java.lang.String r2 = "accept_request"
        L_0x016c:
            java.lang.String r0 = "entry_point"
            r3.putString(r0, r2)
            r2 = 0
            java.lang.String r0 = "show_add_chats"
            r3.putBoolean(r0, r2)
            r2 = 1
            java.lang.String r0 = "should_use_callback"
            r3.putBoolean(r0, r2)
            X.37E r0 = X.AnonymousClass37D.A00
            X.DbX.A10(r4, r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            r0 = 657(0x291, float:9.2E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r0 = X.AnonymousClass6W8.A03(r4, r3, r5, r2, r0)
            r0.A08()
            r0.A0C(r4)
            goto L_0x0159
        L_0x0195:
            java.lang.String r2 = "move_thread"
            goto L_0x016c
        L_0x0198:
            r0 = -819399601(0xffffffffcf28f44f, float:-2.8345833E9)
            int r1 = X.AnonymousClass0fD.A05(r0)
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x01a8
            r0 = 2123958495(0x7e9908df, float:1.0170897E38)
            goto L_0x001c
        L_0x01a8:
            java.lang.Object r0 = r9.A01
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.toggle()
            java.lang.Object r2 = r9.A02
            X.PuE r2 = (X.C74398PuE) r2
            java.lang.Object r0 = r9.A03
            X.Mbz r0 = (X.C66754Mbz) r0
            r2.Drt(r0)
            r0 = -638764065(0xffffffffd9ed3bdf, float:-8.3469248E15)
            goto L_0x001c
        L_0x01bf:
            r0 = 1525634186(0x5aef548a, float:3.36827356E16)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r9.A03
            X.Moe r3 = (X.C67484Moe) r3
            java.lang.Object r2 = r9.A02
            X.2Ep r2 = (X.AnonymousClass2Ep) r2
            boolean r0 = r9.A04
            X.C67484Moe.A01(r3, r2, r0)
            java.lang.Object r0 = r9.A01
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r0 = r0.A00
            X.7Pu r0 = (X.C331157Pu) r0
            if (r0 == 0) goto L_0x01e0
            r0.A07()
        L_0x01e0:
            r0 = 2142285665(0x7fb0af61, float:NaN)
            goto L_0x001c
        L_0x01e5:
            r0 = -1583951116(0xffffffffa196d2f4, float:-1.0220234E-18)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r9.A02
            com.instagram.common.typedurl.ImageUrl r7 = (com.instagram.common.typedurl.ImageUrl) r7
            if (r7 == 0) goto L_0x020c
            boolean r6 = r9.A04
            java.lang.Object r5 = r9.A03
            X.4DH r5 = (X.AnonymousClass4DH) r5
            android.content.Context r4 = r5.requireContext()
            java.lang.Object r3 = r9.A01
            r2 = 2
            X.W4v r0 = new X.W4v
            r0.<init>(r2, r3, r5)
            X.W3M.A03(r4, r0, r5, r7, r6)
        L_0x0207:
            r0 = 1364821809(0x51598731, float:5.8392252E10)
            goto L_0x001c
        L_0x020c:
            java.lang.Object r0 = r9.A03
            X.UZU r0 = (X.UZU) r0
            X.UZU.A02(r0)
            goto L_0x0207
        L_0x0214:
            r0 = 555801211(0x2120da7b, float:5.4499265E-19)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r9.A03
            X.NJJ r5 = (X.NJJ) r5
            X.OFo r4 = r5.A02
            if (r4 != 0) goto L_0x022d
            java.lang.String r0 = "logger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x022d:
            X.0Ae r2 = r4.A00
            java.lang.String r0 = "barcelona_golden_ticket_tap"
            X.0Aj r3 = X.C51969G9p.A0d(r2, r0)
            java.lang.String r2 = r4.A03
            r0 = 764(0x2fc, float:1.07E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.AAJ(r0, r2)
            X.0iw r0 = r4.A01
            java.lang.String r2 = r0.getModuleName()
            java.lang.String r0 = "module"
            X.C51973G9u.A14(r3, r0, r2)
            com.instagram.common.session.UserSession r0 = r4.A02
            java.lang.String r0 = r0.A06
            java.lang.Long r2 = X.AnonymousClass7TE.A10(r0)
            java.lang.String r0 = "target_user_id"
            r3.A9F(r0, r2)
            boolean r0 = r4.A04
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_barcelona_installed"
            r3.A7p(r0, r2)
            r3.Cgf()
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x028d
            java.lang.Object r3 = r9.A01
            android.view.View r3 = (android.view.View) r3
            android.content.Context r4 = r5.requireContext()
            boolean r0 = r5.A09
            r8 = r0 ^ 1
            r0 = 0
            r3.setEnabled(r0)
            X.0xx r0 = X.DbW.A0E(r5)
            r6 = 0
            r7 = 3
            X.JTf r2 = new X.JTf
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.AnonymousClass7TE.A1Z(r2, r0)
        L_0x0288:
            r0 = 1063008346(0x3f5c385a, float:0.86023486)
            goto L_0x001c
        L_0x028d:
            X.0eM r0 = r5.A0A
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            java.lang.Object r0 = r9.A02
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r5 = r0.getId()
            java.lang.String r6 = r0.getUsername()
            r4 = 0
            java.lang.String r7 = "golden_ticket"
            X.C49965FGy.A01(r2, r3, r4, r5, r6, r7)
            goto L_0x0288
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71355OjA.onClick(android.view.View):void");
    }
}
