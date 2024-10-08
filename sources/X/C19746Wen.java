package X;

/* renamed from: X.Wen  reason: case insensitive filesystem */
public final class C19746Wen implements MT5 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C19746Wen(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r1.A00 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a4, code lost:
        if (X.W3E.A03(r0) != false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00eb, code lost:
        r0 = "promoteData";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (((X.C16607Uy3) r5.A01).A02 == null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0102, code lost:
        if (r4.A05 == null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011d, code lost:
        if (((com.instagram.business.promote.model.PromoteData) r5.A01).A2K == false) goto L_0x011f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D1Y(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0109;
                case 1: goto L_0x00bd;
                case 2: goto L_0x00ad;
                case 3: goto L_0x007a;
                case 4: goto L_0x005b;
                case 5: goto L_0x0043;
                case 6: goto L_0x0005;
                case 7: goto L_0x0019;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r5.A02
            X.U5O r2 = (X.U5O) r2
            if (r7 == 0) goto L_0x0014
            java.lang.Object r0 = r5.A01
            X.Uy3 r0 = (X.C16607Uy3) r0
            java.lang.Integer r1 = r0.A02
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r2.A03(r0)
        L_0x0018:
            return
        L_0x0019:
            if (r7 == 0) goto L_0x0018
            java.lang.Object r3 = r5.A02
            X.UaI r3 = (X.C15311UaI) r3
            X.U8t r0 = r3.A01()
            com.instagram.leadgen.core.model.LeadGenBaseFormList r1 = r0.A08
            java.lang.Object r0 = r5.A01
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = (com.instagram.api.schemas.XIGIGBoostCallToAction) r0
            r1.A00 = r0
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r3.A04
            if (r2 == 0) goto L_0x0018
            X.U8t r0 = r3.A01()
            com.instagram.leadgen.core.model.LeadGenBaseFormList r1 = r0.A08
            com.instagram.leadgen.core.api.LeadForm r0 = r1.A01
            if (r0 == 0) goto L_0x003e
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r1.A00
            r0 = 1
            if (r1 != 0) goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            r2.setPrimaryButtonEnabled(r0)
            return
        L_0x0043:
            if (r7 == 0) goto L_0x0018
            java.lang.Object r2 = r5.A02
            X.UaM r2 = (X.UaM) r2
            X.Unn r0 = r2.A02()
            com.instagram.leadgen.core.model.LeadGenBaseFormList r1 = r0.A02()
            java.lang.Object r0 = r5.A01
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = (com.instagram.api.schemas.XIGIGBoostCallToAction) r0
            r1.A00 = r0
            X.UaM.A00(r2)
            return
        L_0x005b:
            java.lang.Object r1 = r5.A02
            X.UZc r1 = (X.C15274UZc) r1
            X.U5O r0 = r1.A0D
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = "multiDestinationRadioButton"
            goto L_0x00d5
        L_0x0066:
            r0.A05(r7)
            if (r7 == 0) goto L_0x0018
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.MULTI_DESTINATION_MESSAGE
            r1.A04 = r0
            X.C15274UZc.A02(r1)
            java.lang.Object r0 = r5.A01
            android.view.View r0 = (android.view.View) r0
            X.C15274UZc.A00(r0, r1)
            return
        L_0x007a:
            if (r7 == 0) goto L_0x008e
            java.lang.Object r1 = r5.A02
            X.UZc r1 = (X.C15274UZc) r1
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.DIRECT_MESSAGE
            r1.A04 = r0
            X.C15274UZc.A02(r1)
            java.lang.Object r0 = r5.A01
            android.view.View r0 = (android.view.View) r0
            X.C15274UZc.A00(r0, r1)
        L_0x008e:
            java.lang.Object r0 = r5.A02
            X.UZc r0 = (X.C15274UZc) r0
            android.view.View r2 = r0.A01
            if (r2 != 0) goto L_0x0099
            java.lang.String r0 = "welcomeMessageRowContainer"
            goto L_0x00d5
        L_0x0099:
            r1 = 0
            if (r7 == 0) goto L_0x00aa
            com.instagram.business.promote.model.PromoteData r0 = r0.A0A
            if (r0 == 0) goto L_0x00eb
            boolean r0 = X.W3E.A03(r0)
            if (r0 == 0) goto L_0x00aa
        L_0x00a6:
            r2.setVisibility(r1)
            return
        L_0x00aa:
            r1 = 8
            goto L_0x00a6
        L_0x00ad:
            if (r7 == 0) goto L_0x0018
            java.lang.Object r1 = r5.A02
            X.UZc r1 = (X.C15274UZc) r1
            java.lang.Object r0 = r5.A01
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = (com.instagram.api.schemas.XIGIGBoostCallToAction) r0
            r1.A03 = r0
            X.C15274UZc.A02(r1)
            return
        L_0x00bd:
            if (r7 == 0) goto L_0x0018
            java.lang.Object r4 = r5.A02
            X.UaW r4 = (X.C15324UaW) r4
            java.lang.Object r1 = r5.A01
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = (com.instagram.api.schemas.XIGIGBoostCallToAction) r1
            r4.A05 = r1
            com.instagram.business.promote.model.PromoteData r0 = r4.A09
            if (r0 == 0) goto L_0x00eb
            r0.A0d = r1
            X.WGU r2 = r4.A07
            if (r2 != 0) goto L_0x00dd
            java.lang.String r0 = "promoteLogger"
        L_0x00d5:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00dd:
            X.UzE r1 = X.C16678UzE.MANAGE_LEAD_ADS
            java.lang.String r0 = "call_to_action_button"
            r2.A0F(r1, r0)
            X.WYX r3 = r4.A06
            if (r3 != 0) goto L_0x00ee
            java.lang.String r0 = "leadAdsLogger"
            goto L_0x00d5
        L_0x00eb:
            java.lang.String r0 = "promoteData"
            goto L_0x00d5
        L_0x00ee:
            java.lang.Long r2 = r4.A0B
            java.lang.String r1 = "lead_gen_manage_lead_forms"
            java.lang.String r0 = "call_to_action_selected"
            X.WYX.A01(r3, r2, r1, r0)
            X.Vvl r2 = r4.A08
            if (r2 == 0) goto L_0x0018
            com.instagram.leadgen.core.api.LeadForm r0 = r4.A0A
            if (r0 == 0) goto L_0x0104
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r4.A05
            r0 = 1
            if (r1 != 0) goto L_0x0105
        L_0x0104:
            r0 = 0
        L_0x0105:
            r2.A02(r0)
            return
        L_0x0109:
            java.lang.Object r3 = r5.A02
            X.U5O r3 = (X.U5O) r3
            r3.A04(r7)
            r3.A03(r7)
            r2 = 1
            if (r7 == 0) goto L_0x011f
            java.lang.Object r0 = r5.A01
            com.instagram.business.promote.model.PromoteData r0 = (com.instagram.business.promote.model.PromoteData) r0
            boolean r1 = r0.A2K
            r0 = 1
            if (r1 != 0) goto L_0x0120
        L_0x011f:
            r0 = 0
        L_0x0120:
            r3.A05(r0)
            java.lang.Object r0 = r5.A01
            com.instagram.business.promote.model.PromoteData r0 = (com.instagram.business.promote.model.PromoteData) r0
            java.lang.String r0 = r0.A1I
            if (r0 == 0) goto L_0x0132
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0132
            r2 = 0
        L_0x0132:
            r3.A06(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19746Wen.D1Y(android.view.View, boolean):void");
    }
}
