package X;

public final class WYN implements C358618bC {
    public final int A00;
    public final Object A01;

    public WYN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x030b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        X.0qQ.A0F(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onToggle(boolean r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            r12 = r15
            switch(r0) {
                case 0: goto L_0x0267;
                case 1: goto L_0x0248;
                case 2: goto L_0x01c3;
                case 3: goto L_0x01a3;
                case 4: goto L_0x0173;
                case 5: goto L_0x0114;
                case 6: goto L_0x0317;
                case 7: goto L_0x0090;
                case 8: goto L_0x0061;
                case 9: goto L_0x00ff;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.String r7 = "datePicker"
            r4 = 1
            java.lang.String r6 = "timePicker"
            java.lang.Object r5 = r14.A01
            X.UbI r5 = (X.C15365UbI) r5
            if (r15 == 0) goto L_0x005a
            com.instagram.igds.components.datepicker.IgTimePicker r0 = r5.A05
            if (r0 == 0) goto L_0x030d
            java.util.Calendar r0 = r0.getSelectedTime()
            if (r0 == 0) goto L_0x0039
            int r3 = X.DbZ.A06(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            int r1 = X.DbU.A03(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r2 == 0) goto L_0x0039
            if (r0 == 0) goto L_0x0039
            com.instagram.igds.components.datepicker.IgDatePicker r0 = r5.A04
            if (r0 == 0) goto L_0x003e
            r0.A02(r3, r1)
            X.C15365UbI.A00(r5, r3, r1)
        L_0x0039:
            com.instagram.igds.components.datepicker.IgTimePicker r0 = r5.A05
            if (r0 != 0) goto L_0x0046
            r7 = r6
        L_0x003e:
            X.0qQ.A0F(r7)
        L_0x0041:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0046:
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A06(r0, r4)
            com.instagram.igds.components.datepicker.IgDatePicker r0 = r5.A04
            if (r0 == 0) goto L_0x003e
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A07(r0, r4)
            goto L_0x030b
        L_0x005a:
            java.util.Calendar r0 = r5.A07
            if (r0 != 0) goto L_0x02d9
            java.lang.String r7 = "datePickerCalendar"
            goto L_0x003e
        L_0x0061:
            java.lang.Object r2 = r14.A01
            X.UZb r2 = (X.C15273UZb) r2
            com.instagram.business.promote.model.PromoteData r0 = r2.A04
            if (r0 != 0) goto L_0x006c
            java.lang.String r7 = "promoteData"
            goto L_0x003e
        L_0x006c:
            java.lang.String r7 = "promoteLogger"
            java.util.List r1 = r0.A1x
            com.instagram.api.schemas.AdsMessageExtensionType r0 = com.instagram.api.schemas.AdsMessageExtensionType.INSTAGRAM_MESSAGE
            if (r15 == 0) goto L_0x0084
            r1.add(r0)
            X.WGU r2 = r2.A01
            if (r2 == 0) goto L_0x003e
            X.UzE r1 = X.C16678UzE.DESTINATION_WEBSITE
            java.lang.String r0 = "secondary_cta_toggle_opt_in"
        L_0x007f:
            r2.A0F(r1, r0)
            goto L_0x030b
        L_0x0084:
            r1.remove(r0)
            X.WGU r2 = r2.A01
            if (r2 == 0) goto L_0x003e
            X.UzE r1 = X.C16678UzE.DESTINATION_WEBSITE
            java.lang.String r0 = "secondary_cta_toggle_opt_out"
            goto L_0x007f
        L_0x0090:
            java.lang.Object r3 = r14.A01
            X.UaS r3 = (X.C15320UaS) r3
            com.instagram.business.promote.model.PromoteData r0 = r3.A0F
            java.lang.String r8 = "promoteData"
            if (r0 == 0) goto L_0x0312
            java.util.Set r1 = r0.A25
            com.instagram.api.schemas.XFBAdproRegionalRegulatedCategory r0 = com.instagram.api.schemas.XFBAdproRegionalRegulatedCategory.TAIWAN_FINSERV
            if (r15 == 0) goto L_0x00fb
            r1.add(r0)
        L_0x00a3:
            X.WGU r7 = r3.A0B
            if (r7 == 0) goto L_0x00d9
            X.UzE r6 = X.C16678UzE.SUMMARY
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r15)
            java.lang.String r4 = "taiwan_finserv_toggle"
            com.facebook.common.callercontext.CallerContext r0 = X.WGU.A07
            X.0wc r1 = r7.A05
            java.lang.String r0 = "promoted_posts_tap_component"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x00d9
            X.UGQ r1 = new X.UGQ
            r1.<init>()
            X.C13990Tnq.A18(r1, r7)
            if (r5 == 0) goto L_0x00ce
            java.lang.String r0 = "is_taiwan_finserv_toggle_on"
            r1.A03(r0, r5)
        L_0x00ce:
            java.lang.String r0 = "component"
            r2.AAJ(r0, r4)
            X.C13990Tnq.A10(r2, r7, r6)
            X.C13988Tno.A18(r2, r1)
        L_0x00d9:
            if (r15 == 0) goto L_0x02c7
            X.WGU r1 = r3.A0B
            if (r1 == 0) goto L_0x00e4
            X.UzE r0 = X.C16678UzE.TAIWAN_FINSERV_BENEFICIARY_PAYER_SELECTION
            X.C13988Tno.A1J(r1, r0)
        L_0x00e4:
            X.WGU r0 = r3.A0B
            X.0qQ.A0A(r0)
            java.lang.String r2 = r0.A03
            X.0qQ.A07(r2)
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            com.instagram.business.promote.model.PromoteData r0 = r3.A0F
            if (r0 == 0) goto L_0x0312
            X.C18175Vmp.A00(r1, r0, r2)
            goto L_0x030b
        L_0x00fb:
            r1.remove(r0)
            goto L_0x00a3
        L_0x00ff:
            java.lang.Object r0 = r14.A01
            X.WUv r0 = (X.C19339WUv) r0
            com.instagram.common.session.UserSession r0 = r0.A0L
            X.1Av r3 = X.1Au.A00(r0)
            X.0s0 r2 = r3.A0A
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 236(0xec, float:3.31E-43)
            X.AnonymousClass7TF.A1J(r3, r2, r1, r0, r15)
            goto L_0x030b
        L_0x0114:
            java.lang.Object r4 = r14.A01
            X.UZp r4 = (X.C15285UZp) r4
            android.content.Context r1 = r4.requireContext()
            com.instagram.common.session.UserSession r0 = r4.A07
            if (r0 == 0) goto L_0x016e
            java.lang.String r5 = "PROMOTE_AUDIENCE"
            boolean r0 = X.1Wr.isLocationPermitted(r1, r0, r5)
            if (r0 != 0) goto L_0x013f
            com.instagram.common.session.UserSession r3 = r4.A07
            if (r3 == 0) goto L_0x0169
            java.lang.String r1 = "promote_create_audience_locations_local"
            X.0xG r0 = new X.0xG
            r0.<init>(r1)
            X.4O6 r2 = new X.4O6
            r2.<init>(r0, r3)
            X.4O7 r1 = X.VK6.A00
            java.lang.String r0 = "CurrentLocationHelper::onCurrentLocationButtonTap"
            r1.A05(r3, r2, r5, r0)
        L_0x013f:
            r11 = 0
            if (r15 == 0) goto L_0x0164
            X.1Wr r5 = r4.A0I
            if (r5 == 0) goto L_0x030c
            com.instagram.common.session.UserSession r6 = r4.A07
            if (r6 == 0) goto L_0x015f
            androidx.fragment.app.FragmentActivity r7 = r4.getActivity()
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            X.0qQ.A0C(r7, r0)
            X.4cM r8 = r4.A0G
            X.MTx r9 = r4.A0H
            X.Uwa r12 = X.C16530Uwa.PROMOTE_AUDIENCE
            java.lang.String r10 = "promote_create_audience_locations_local"
            r5.requestLocationUpdates(r6, r7, r8, r9, r10, r11, r12)
            return r11
        L_0x015f:
            X.DbS.A14()
            goto L_0x0041
        L_0x0164:
            X.C15285UZp.A04(r4, r11)
            goto L_0x030b
        L_0x0169:
            X.DbS.A14()
            goto L_0x0041
        L_0x016e:
            X.DbS.A14()
            goto L_0x0041
        L_0x0173:
            java.lang.Object r0 = r14.A01
            X.6Ky r0 = (X.C306146Ky) r0
            X.U92 r0 = X.C306146Ky.A01(r0)
            if (r15 == 0) goto L_0x01a0
            com.instagram.api.schemas.TargetingRelaxationConstants r4 = com.instagram.api.schemas.TargetingRelaxationConstants.EXPANSION
        L_0x017f:
            r10 = 0
            X.LAF r0 = r0.A02
            X.05G r2 = r0.A01
        L_0x0184:
            java.lang.Object r1 = r2.getValue()
            r5 = r1
            X.ULv r5 = (X.C15053ULv) r5
            r3 = 0
            r12 = 895(0x37f, float:1.254E-42)
            r6 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r11 = r10
            r13 = r10
            X.ULv r0 = X.C15053ULv.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0184
            goto L_0x030b
        L_0x01a0:
            com.instagram.api.schemas.TargetingRelaxationConstants r4 = com.instagram.api.schemas.TargetingRelaxationConstants.A05
            goto L_0x017f
        L_0x01a3:
            java.lang.Object r1 = r14.A01
            X.UZi r1 = (X.C15280UZi) r1
            X.0eM r0 = r1.A0Z
            com.instagram.business.promote.model.PromoteState r4 = X.C13990Tnq.A0O(r0)
            com.instagram.business.promote.model.PromoteData r5 = X.C15280UZi.A01(r1)
            if (r15 == 0) goto L_0x01c0
            com.instagram.api.schemas.TargetingRelaxationConstants r2 = com.instagram.api.schemas.TargetingRelaxationConstants.EXPANSION
        L_0x01b5:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.VuU r1 = X.C18167Vmh.A01(r5)
            r1.A03 = r2
            goto L_0x022f
        L_0x01c0:
            com.instagram.api.schemas.TargetingRelaxationConstants r2 = com.instagram.api.schemas.TargetingRelaxationConstants.A05
            goto L_0x01b5
        L_0x01c3:
            java.lang.Object r2 = r14.A01
            X.UZi r2 = (X.C15280UZi) r2
            X.0eM r0 = r2.A0Y
            X.WGU r1 = X.C13990Tnq.A0M(r0)
            X.0eM r0 = r2.A0W
            java.lang.Object r0 = r0.getValue()
            X.UzE r0 = (X.C16678UzE) r0
            r1.A0M(r0, r15)
            X.0eM r0 = r2.A0Z
            com.instagram.business.promote.model.PromoteState r4 = X.C13990Tnq.A0O(r0)
            com.instagram.business.promote.model.PromoteData r5 = X.C15280UZi.A01(r2)
            r0 = 0
            X.0qQ.A0B(r5, r0)
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r5.A0q
            com.instagram.api.schemas.AdvantageAudienceData r3 = r0.A02
            if (r3 == 0) goto L_0x030b
            r3.Aa9()
            java.lang.Integer r6 = r3.BT2()
            if (r15 == 0) goto L_0x0245
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r1 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.ON
        L_0x01f7:
            boolean r0 = r3 instanceof com.instagram.api.schemas.ImmutablePandoAdvantageAudienceData
            if (r0 == 0) goto L_0x023f
            java.lang.String r2 = r1.A00
            java.lang.String r0 = "advantage_audience_status"
            X.0eP r1 = new X.0eP
            r1.<init>(r0, r2)
            java.lang.String r0 = "min_age_constraint"
            X.0eP[] r0 = X.JTQ.A1b(r0, r6, r1)
            com.facebook.pando.TreeJNI r3 = X.C41847B3o.A0o(r3, r0)
        L_0x020e:
            com.instagram.api.schemas.AdvantageAudienceData r3 = (com.instagram.api.schemas.AdvantageAudienceData) r3
            if (r15 == 0) goto L_0x0236
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r5.A0q
            int r2 = r0.A01
            com.instagram.api.schemas.AdvantageAudienceData r0 = r0.A02
            if (r0 == 0) goto L_0x0234
            java.lang.Integer r0 = r0.BT2()
            if (r0 == 0) goto L_0x0234
            int r0 = r0.intValue()
        L_0x0224:
            X.VuU r1 = X.C18167Vmh.A01(r5)
            if (r2 >= r0) goto L_0x022b
            r2 = r0
        L_0x022b:
            r1.A01 = r2
        L_0x022d:
            r1.A02 = r3
        L_0x022f:
            X.C18578VuU.A00(r1, r5, r4)
            goto L_0x030b
        L_0x0234:
            r0 = 0
            goto L_0x0224
        L_0x0236:
            X.VuU r1 = X.C18167Vmh.A01(r5)
            r0 = 13
            r1.A01 = r0
            goto L_0x022d
        L_0x023f:
            com.instagram.api.schemas.AdvantageAudienceDataImpl r3 = new com.instagram.api.schemas.AdvantageAudienceDataImpl
            r3.<init>(r1, r6)
            goto L_0x020e
        L_0x0245:
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r1 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.OFF
            goto L_0x01f7
        L_0x0248:
            java.lang.Object r1 = r14.A01
            X.UaU r1 = (X.C15322UaU) r1
            com.instagram.business.promote.model.PromoteData r0 = X.C15322UaU.A00(r1)
            r0.A2e = r15
            X.WGU r1 = r1.A03
            if (r1 == 0) goto L_0x030b
            X.UzE r0 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r15)
            java.lang.String r7 = "fb_placement_toggle"
            r2 = 0
            r3 = r2
            r4 = r2
            r6 = r2
            X.WGU.A02(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x030b
        L_0x0267:
            java.lang.Object r4 = r14.A01
            X.ViU r4 = (X.C17939ViU) r4
            com.instagram.business.promote.model.PromoteData r3 = r4.A05
            java.util.Set r1 = r3.A25
            com.instagram.api.schemas.XFBAdproRegionalRegulatedCategory r0 = com.instagram.api.schemas.XFBAdproRegionalRegulatedCategory.TAIWAN_FINSERV
            if (r15 == 0) goto L_0x02c3
            r1.add(r0)
        L_0x0276:
            X.WGU r5 = r4.A03
            X.UzE r7 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r15)
            java.lang.String r6 = "taiwan_finserv_toggle"
            r8 = 0
            com.facebook.common.callercontext.CallerContext r0 = X.WGU.A07
            X.0wc r1 = r5.A05
            java.lang.String r0 = "promoted_posts_tap_component"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x02ab
            X.UGQ r1 = new X.UGQ
            r1.<init>()
            X.C13990Tnq.A18(r1, r5)
            if (r9 == 0) goto L_0x02a0
            java.lang.String r0 = "is_taiwan_finserv_toggle_on"
            r1.A03(r0, r9)
        L_0x02a0:
            java.lang.String r0 = "component"
            r2.AAJ(r0, r6)
            X.C13990Tnq.A10(r2, r5, r7)
            X.C13988Tno.A18(r2, r1)
        L_0x02ab:
            if (r15 == 0) goto L_0x02cc
            java.lang.String r1 = r3.A1K
            X.UzE r0 = X.C16678UzE.TAIWAN_FINSERV_BENEFICIARY_PAYER_SELECTION
            java.lang.String r0 = r0.toString()
            r5.A0S(r1, r0)
            java.lang.String r1 = r5.A03
            X.0qQ.A07(r1)
            androidx.fragment.app.FragmentActivity r0 = r4.A02
            X.C18175Vmp.A00(r0, r3, r1)
            goto L_0x030b
        L_0x02c3:
            r1.remove(r0)
            goto L_0x0276
        L_0x02c7:
            com.instagram.business.promote.model.PromoteData r3 = r3.A0F
            if (r3 == 0) goto L_0x0312
            r8 = 0
        L_0x02cc:
            r3.A1f = r8
            r3.A1i = r8
            r3.A1d = r8
            r3.A1g = r8
            r3.A1e = r8
            r3.A1h = r8
            goto L_0x030b
        L_0x02d9:
            int r3 = r0.get(r4)
            com.instagram.igds.components.datepicker.IgDatePicker r0 = r5.A04
            if (r0 == 0) goto L_0x003e
            int r2 = r0.getCurrentMonth()
            com.instagram.igds.components.datepicker.IgDatePicker r0 = r5.A04
            if (r0 == 0) goto L_0x003e
            int r1 = r0.getCurrentDayOfMonth()
            com.instagram.igds.components.datepicker.IgTimePicker r0 = r5.A05
            if (r0 == 0) goto L_0x030d
            r0.A01()
            com.instagram.igds.components.datepicker.IgTimePicker r0 = r5.A05
            if (r0 == 0) goto L_0x030d
            r0.A02(r3, r2, r1)
            com.instagram.igds.components.datepicker.IgTimePicker r0 = r5.A05
            if (r0 == 0) goto L_0x030d
            java.util.Calendar r0 = r0.getSelectedTime()
            if (r0 == 0) goto L_0x0308
            X.C15365UbI.A01(r5, r0)
        L_0x0308:
            X.C15365UbI.A02(r5, r4)
        L_0x030b:
            r11 = 1
        L_0x030c:
            return r11
        L_0x030d:
            X.0qQ.A0F(r6)
            goto L_0x0041
        L_0x0312:
            X.0qQ.A0F(r8)
            goto L_0x0041
        L_0x0317:
            java.lang.Object r0 = r14.A01
            X.UYz r0 = (X.UYz) r0
            androidx.fragment.app.FragmentActivity r6 = r0.getActivity()
            if (r6 == 0) goto L_0x037f
            X.0eM r0 = r0.A0D
            java.lang.Object r3 = r0.getValue()
            X.U92 r3 = (X.U92) r3
            java.lang.String r9 = "promote_create_audience_locations_local"
            r10 = 0
            if (r15 == 0) goto L_0x035e
            com.instagram.common.session.UserSession r5 = r3.A03
            java.lang.String r4 = "PROMOTE_AUDIENCE"
            boolean r0 = X.1Wr.isLocationPermitted(r6, r5, r4)
            if (r0 != 0) goto L_0x034b
            java.lang.String r1 = r3.A06
            X.0xG r0 = new X.0xG
            r0.<init>(r1)
            X.4O6 r2 = new X.4O6
            r2.<init>(r0, r5)
            X.4O7 r1 = X.VK6.A00
            java.lang.String r0 = "CurrentLocationHelper::onCurrentLocationButtonTap"
            r1.A05(r5, r2, r4, r0)
        L_0x034b:
            X.1Wr r4 = X.1Wr.A00
            if (r4 == 0) goto L_0x035e
            X.WYs r7 = new X.WYs
            r7.<init>(r6, r3)
            X.WYv r8 = new X.WYv
            r8.<init>(r6, r3)
            X.Uwa r11 = X.C16530Uwa.PROMOTE_AUDIENCE
            r4.requestLocationUpdates(r5, r6, r7, r8, r9, r10, r11)
        L_0x035e:
            X.LAF r0 = r3.A02
            X.05G r2 = r0.A04
        L_0x0362:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            X.ULF r0 = (X.ULF) r0
            int r10 = r0.A00
            com.instagram.business.promote.model.AudienceGeoLocation r6 = r0.A03
            com.instagram.business.promote.model.AudienceGeoLocation r7 = r0.A02
            java.util.List r8 = r0.A05
            java.util.List r9 = r0.A04
            int r11 = r0.A01
            X.ULF r0 = X.ULF.A00(r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0362
        L_0x037f:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WYN.onToggle(boolean):boolean");
    }
}
