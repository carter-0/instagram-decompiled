package X;

/* renamed from: X.Wdo  reason: case insensitive filesystem */
public final class C19686Wdo implements C273414mX {
    public final int A00;
    public final Object A01;

    public C19686Wdo(C15998Umf umf, int i) {
        this.A00 = i;
        this.A01 = umf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d3, code lost:
        if (r0 != null) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cyc() {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0063;
                case 1: goto L_0x0075;
                case 2: goto L_0x001f;
                case 3: goto L_0x00f4;
                case 4: goto L_0x0043;
                case 5: goto L_0x0112;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r7.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r2 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r2
            boolean r0 = r2.A0E
            if (r0 == 0) goto L_0x001e
            X.6Yo r1 = X.C13991Tnr.A0M(r2)
            X.Kai r0 = X.C250563lf.A0E()
            r1.A0E(r0)
            r1.A04()
            r0 = 0
            r2.A0E = r0
        L_0x001e:
            return
        L_0x001f:
            java.lang.Object r1 = r7.A01
            X.UaK r1 = (X.C15313UaK) r1
            boolean r0 = r1.A08
            if (r0 != 0) goto L_0x001e
            X.U8j r1 = r1.A04()
            boolean r0 = r1 instanceof X.C16058Unl
            if (r0 != 0) goto L_0x001e
            boolean r0 = r1 instanceof X.C16057Unk
            if (r0 == 0) goto L_0x001e
            X.Unk r1 = (X.C16057Unk) r1
            X.WYY r4 = r1.A04
            java.lang.String r3 = r1.A00
            boolean r2 = r1.A00
            java.lang.String r1 = "privacy_policy_bottom_sheet_cancel_button_click"
            java.lang.String r0 = "click"
            X.WYY.A01(r4, r1, r0, r3, r2)
            return
        L_0x0043:
            java.lang.Object r1 = r7.A01
            X.Umf r1 = (X.C15998Umf) r1
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x001e
            X.VsB r0 = X.C16039UnS.A00(r1)
            X.XB6 r4 = r0.A00
            java.lang.String r3 = r0.A01
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "form_id"
            android.os.Bundle r2 = X.DbY.A0B(r0, r1)
            java.lang.String r1 = "lead_gen_multi_step_consumer_questions"
            java.lang.String r0 = "privacy_policy_bottom_sheet_cancel_button_click"
            X.XB6.A00(r2, r4, r3, r1, r0)
            return
        L_0x0063:
            java.lang.Object r0 = r7.A01
            com.instagram.business.promote.model.PromoteData r0 = (com.instagram.business.promote.model.PromoteData) r0
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.WGU r2 = X.WGU.A00(r0)
            X.UzE r1 = X.C16678UzE.OBJECTIVE
            java.lang.String r0 = "boost_objective_recommendation_bottomsheet_dismiss"
            r2.A0F(r1, r0)
            return
        L_0x0075:
            java.lang.Object r3 = r7.A01
            X.Vho r3 = (X.C17897Vho) r3
            android.view.View r4 = r3.A01
            int r6 = r3.A00
            r2 = -1
            if (r6 == r2) goto L_0x00ea
            if (r4 == 0) goto L_0x00b3
            X.UZA r0 = r3.A04
            X.Mv8 r5 = r0.A07
            int r0 = r5.getItemViewType(r6)
            if (r0 == 0) goto L_0x00d6
            int r1 = r5.getItemViewType(r6)
            r0 = 2
            if (r1 == r0) goto L_0x00d6
            r5.getItemViewType(r6)
            int r1 = r5.getItemViewType(r6)
            r0 = 3
            if (r1 != r0) goto L_0x00b9
            java.util.List r0 = r5.A02
            java.lang.Object r1 = r0.get(r6)
            r0 = 1005(0x3ed, float:1.408E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.Oak r1 = (X.C71065Oak) r1
            android.view.View$OnClickListener r0 = r1.A0D
        L_0x00b0:
            r0.onClick(r4)
        L_0x00b3:
            r0 = 0
            r3.A01 = r0
            r3.A00 = r2
            return
        L_0x00b9:
            int r1 = r5.getItemViewType(r6)
            r0 = 4
            if (r1 != r0) goto L_0x00b3
            java.util.List r0 = r5.A02
            java.lang.Object r1 = r0.get(r6)
            r0 = 1007(0x3ef, float:1.411E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.OIM r1 = (X.OIM) r1
            android.view.View$OnClickListener r0 = r1.A01
            if (r0 == 0) goto L_0x00b3
            goto L_0x00b0
        L_0x00d6:
            java.util.List r0 = r5.A02
            java.lang.Object r1 = r0.get(r6)
            r0 = 1006(0x3ee, float:1.41E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.MlS r1 = (X.C67293MlS) r1
            android.view.View$OnClickListener r0 = r1.A0A
            goto L_0x00b0
        L_0x00ea:
            X.Hto r0 = r3.A03
            X.XCD r0 = r0.A01
            if (r0 == 0) goto L_0x00b3
            r0.D9e()
            goto L_0x00b3
        L_0x00f4:
            java.lang.Object r2 = r7.A01
            X.Umf r2 = (X.C15998Umf) r2
            X.UnS r0 = X.C13990Tnq.A0R(r2)
            X.VsA r1 = r0.A0L
            java.lang.String r4 = "lead_gen_disqualifying_bottom_sheet"
            java.lang.String r0 = X.C15998Umf.A02(r2)
            X.XB6 r3 = r1.A00
            java.lang.String r2 = r1.A01
            android.os.Bundle r1 = X.C18461VsA.A00(r1, r0)
            java.lang.String r0 = "bottom_sheet_dismiss"
            X.XB6.A00(r1, r3, r2, r4, r0)
            return
        L_0x0112:
            java.lang.Object r1 = r7.A01
            X.W27 r1 = (X.W27) r1
            X.4mX r0 = r1.A01
            if (r0 == 0) goto L_0x011d
            r0.Cyc()
        L_0x011d:
            r0 = 0
            r1.A00 = r0
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19686Wdo.Cyc():void");
    }

    public final /* synthetic */ void Cyf() {
    }

    public C19686Wdo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
