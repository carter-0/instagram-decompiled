package X;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;

public final class UZM extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromoteNuxFragment";
    public C16678UzE A00;
    public ReboundViewPager A01;
    public CirclePageIndicator A02;
    public boolean A03;
    public final AnonymousClass0eM A04 = C20702WxZ.A01(this, 37);
    public final AnonymousClass0eM A05 = C20702WxZ.A01(this, 38);
    public final AnonymousClass0eM A06 = C20702WxZ.A01(this, 39);
    public final AnonymousClass0eM A07 = C20702WxZ.A01(this, 40);
    public final AnonymousClass0eM A08 = C20702WxZ.A01(this, 41);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Ets(false);
        DbX.A1A(new WBB(this, 39), DbX.A0M(), r4);
        r4.ENd(new ColorDrawable(AnonymousClass7TF.A03(requireContext(), R.attr.igds_color_primary_background)));
    }

    public final String getModuleName() {
        return "promote_native_nux";
    }

    /* JADX WARNING: type inference failed for: r4v19, types: [com.instagram.ui.slidecardpageadapter.SlideCardViewModel, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0327, code lost:
        r15 = new X.WBB(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x032c, code lost:
        r4 = com.instagram.ui.slidecardpageadapter.SlideCardViewModel.A00(r14, r15, r16, r17, r18, r19, r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x039c, code lost:
        r1.add(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r22, android.os.Bundle r23) {
        /*
            r21 = this;
            r2 = 0
            r3 = r22
            X.0qQ.A0B(r3, r2)
            r0 = 2131442381(0x7f0b3acd, float:1.85068E38)
            android.view.View r1 = r3.requireViewById(r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r1
            r0 = r21
            r0.A01 = r1
            r1 = 2131437430(0x7f0b2776, float:1.8496758E38)
            android.view.View r4 = r3.requireViewById(r1)
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r4 = (com.instagram.ui.widget.pageindicator.CirclePageIndicator) r4
            r0.A02 = r4
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r0.A01
            java.lang.String r13 = "viewPager"
            if (r1 == 0) goto L_0x03a6
            java.lang.String r12 = "circlePageIndicatorBottom"
            if (r4 == 0) goto L_0x03aa
            r1.A0P(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.UzE r4 = r0.A00
            if (r4 == 0) goto L_0x003b
            int r4 = r4.ordinal()
            switch(r4) {
                case 6: goto L_0x0331;
                case 7: goto L_0x00ef;
                case 8: goto L_0x01c5;
                case 9: goto L_0x0260;
                case 45: goto L_0x00c7;
                default: goto L_0x003b;
            }
        L_0x003b:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r4 = r0.A01
            if (r4 == 0) goto L_0x03a6
            X.Djf r6 = new X.Djf
            r6.<init>(r4, r1, r2, r2)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r0.A01
            if (r1 == 0) goto L_0x03a6
            r1.setAdapter((android.widget.Adapter) r6)
            boolean r1 = r0.A03
            r5 = 8
            if (r1 == 0) goto L_0x0080
            X.0eM r1 = r0.A05
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r1)
            com.instagram.business.promote.model.PromoteData r1 = (com.instagram.business.promote.model.PromoteData) r1
            boolean r1 = r1.A2D
            if (r1 == 0) goto L_0x0080
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r1 = r0.A02
            if (r1 == 0) goto L_0x03aa
            r1.setVisibility(r5)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r0.A01
            if (r1 == 0) goto L_0x03a6
            r1.setDraggingEnabled(r2)
        L_0x006b:
            X.0eM r1 = r0.A06
            X.WGU r2 = X.C13990Tnq.A0M(r1)
            X.UzE r1 = r0.A00
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.A0Q(r1)
            r1 = r23
            super.onViewCreated(r3, r1)
            return
        L_0x0080:
            boolean r1 = r0.A03
            if (r1 != 0) goto L_0x00a9
            X.0eM r1 = r0.A04
            java.lang.Object r4 = r1.getValue()
            X.UzE r1 = X.C16678UzE.OBJECTIVE
            if (r4 != r1) goto L_0x00a9
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r5 = r0.A02
            if (r5 == 0) goto L_0x03aa
            int r1 = r6.getCount()
            r4 = 1
            r5.A01(r4, r1)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r0.A01
            if (r1 == 0) goto L_0x03a6
            r1.A0K(r4)
        L_0x00a1:
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r1 = r0.A02
            if (r1 == 0) goto L_0x03aa
            r1.setVisibility(r2)
            goto L_0x006b
        L_0x00a9:
            X.0eM r1 = r0.A04
            java.lang.Object r4 = r1.getValue()
            X.UzE r1 = X.C16678UzE.PROFILE_VISIT_SETTING
            if (r4 != r1) goto L_0x00bb
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r1 = r0.A02
            if (r1 == 0) goto L_0x03aa
            r1.setVisibility(r5)
            goto L_0x006b
        L_0x00bb:
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r4 = r0.A02
            if (r4 == 0) goto L_0x03aa
            int r1 = r6.getCount()
            r4.A01(r2, r1)
            goto L_0x00a1
        L_0x00c7:
            r20 = 2131237622(0x7f081af6, float:1.80915E38)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970420(0x7f134974, float:1.957779E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r5, r4)
            r14 = 0
            android.content.Context r6 = r0.requireContext()
            r4 = 2131970418(0x7f134972, float:1.9577787E38)
            java.lang.String r5 = r6.getString(r4)
            r4 = 2131970419(0x7f134973, float:1.9577789E38)
            java.lang.String r16 = X.C13991Tnr.A0b(r6, r5, r4)
            r15 = r14
            r18 = r14
            r19 = r14
            goto L_0x032c
        L_0x00ef:
            r20 = 2131237621(0x7f081af5, float:1.8091498E38)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970513(0x7f1349d1, float:1.957798E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r5, r4)
            r14 = 0
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970481(0x7f1349b1, float:1.9577914E38)
            java.lang.String r19 = X.AnonymousClass7TE.A16(r5, r4)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970498(0x7f1349c2, float:1.9577949E38)
            java.lang.String r16 = X.AnonymousClass7TE.A16(r5, r4)
            r4 = 44
            X.WBB r15 = new X.WBB
            r15.<init>(r0, r4)
            r18 = r14
            com.instagram.ui.slidecardpageadapter.SlideCardViewModel r4 = com.instagram.ui.slidecardpageadapter.SlideCardViewModel.A00(r14, r15, r16, r17, r18, r19, r20)
            r1.add(r4)
            r20 = 2131237624(0x7f081af8, float:1.8091504E38)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970512(0x7f1349d0, float:1.9577977E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r5, r4)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970480(0x7f1349b0, float:1.9577912E38)
            java.lang.String r19 = X.AnonymousClass7TE.A16(r5, r4)
            android.content.Context r6 = r0.requireContext()
            r4 = 2131970496(0x7f1349c0, float:1.9577945E38)
            java.lang.String r5 = r6.getString(r4)
            r4 = 2131970497(0x7f1349c1, float:1.9577947E38)
            java.lang.String r16 = X.C13991Tnr.A0b(r6, r5, r4)
            r4 = 45
            X.WBB r15 = new X.WBB
            r15.<init>(r0, r4)
            com.instagram.ui.slidecardpageadapter.SlideCardViewModel r4 = com.instagram.ui.slidecardpageadapter.SlideCardViewModel.A00(r14, r15, r16, r17, r18, r19, r20)
            r1.add(r4)
            r20 = 2131237587(0x7f081ad3, float:1.8091429E38)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970515(0x7f1349d3, float:1.9577983E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r5, r4)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970484(0x7f1349b4, float:1.957792E38)
            java.lang.String r19 = X.AnonymousClass7TE.A16(r5, r4)
            android.content.Context r6 = r0.requireContext()
            r4 = 2131970500(0x7f1349c4, float:1.9577953E38)
            java.lang.String r5 = r6.getString(r4)
            r4 = 2131970501(0x7f1349c5, float:1.9577955E38)
            java.lang.String r16 = X.C13991Tnr.A0b(r6, r5, r4)
            r4 = 46
            X.WBB r15 = new X.WBB
            r15.<init>(r0, r4)
            com.instagram.ui.slidecardpageadapter.SlideCardViewModel r4 = com.instagram.ui.slidecardpageadapter.SlideCardViewModel.A00(r14, r15, r16, r17, r18, r19, r20)
            r1.add(r4)
            r20 = 2131237995(0x7f081c6b, float:1.8092256E38)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970508(0x7f1349cc, float:1.957797E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r5, r4)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970474(0x7f1349aa, float:1.95779E38)
            java.lang.String r19 = X.AnonymousClass7TE.A16(r5, r4)
            android.content.Context r6 = r0.requireContext()
            r4 = 2131970491(0x7f1349bb, float:1.9577935E38)
            java.lang.String r5 = r6.getString(r4)
            r4 = 2131970492(0x7f1349bc, float:1.9577937E38)
            java.lang.String r16 = X.C13991Tnr.A0b(r6, r5, r4)
            r4 = 47
            goto L_0x0327
        L_0x01c5:
            r20 = 2131237993(0x7f081c69, float:1.8092252E38)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970504(0x7f1349c8, float:1.957796E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r5, r4)
            r14 = 0
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970471(0x7f1349a7, float:1.9577894E38)
            java.lang.String r19 = X.AnonymousClass7TE.A16(r5, r4)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970485(0x7f1349b5, float:1.9577922E38)
            java.lang.String r16 = X.AnonymousClass7TE.A16(r5, r4)
            r4 = 48
            X.WBB r15 = new X.WBB
            r15.<init>(r0, r4)
            r18 = r14
            com.instagram.ui.slidecardpageadapter.SlideCardViewModel r4 = com.instagram.ui.slidecardpageadapter.SlideCardViewModel.A00(r14, r15, r16, r17, r18, r19, r20)
            r1.add(r4)
            r20 = 2131237994(0x7f081c6a, float:1.8092254E38)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970511(0x7f1349cf, float:1.9577975E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r5, r4)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970479(0x7f1349af, float:1.957791E38)
            java.lang.String r19 = X.AnonymousClass7TE.A16(r5, r4)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970495(0x7f1349bf, float:1.9577943E38)
            java.lang.String r16 = X.AnonymousClass7TE.A16(r5, r4)
            r4 = 49
            X.WBB r15 = new X.WBB
            r15.<init>(r0, r4)
            com.instagram.ui.slidecardpageadapter.SlideCardViewModel r4 = com.instagram.ui.slidecardpageadapter.SlideCardViewModel.A00(r14, r15, r16, r17, r18, r19, r20)
            android.content.Context r5 = X.C66583MXo.A07(r0, r4, r1)
            r4 = 2131970514(0x7f1349d2, float:1.9577981E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r5, r4)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970482(0x7f1349b2, float:1.9577916E38)
            java.lang.String r18 = X.AnonymousClass7TE.A16(r5, r4)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970483(0x7f1349b3, float:1.9577918E38)
            java.lang.String r19 = X.AnonymousClass7TE.A16(r5, r4)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970499(0x7f1349c3, float:1.957795E38)
            java.lang.String r16 = X.AnonymousClass7TE.A16(r5, r4)
            r4 = 50
            X.WBB r14 = new X.WBB
            r14.<init>(r0, r4)
            r4 = 51
            goto L_0x0327
        L_0x0260:
            r20 = 2131237615(0x7f081aef, float:1.8091485E38)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970505(0x7f1349c9, float:1.9577963E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r5, r4)
            r14 = 0
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970472(0x7f1349a8, float:1.9577896E38)
            java.lang.String r19 = X.AnonymousClass7TE.A16(r5, r4)
            android.content.Context r7 = r0.requireContext()
            X.0eM r4 = r0.A05
            java.lang.Object r5 = X.AnonymousClass7TE.A14(r4)
            com.instagram.business.promote.model.PromoteData r5 = (com.instagram.business.promote.model.PromoteData) r5
            int r8 = r5.A08
            java.lang.Object r5 = X.AnonymousClass7TE.A14(r4)
            com.instagram.business.promote.model.PromoteData r5 = (com.instagram.business.promote.model.PromoteData) r5
            int r6 = r5.A06
            java.lang.Object r5 = X.AnonymousClass7TE.A14(r4)
            com.instagram.business.promote.model.PromoteData r5 = (com.instagram.business.promote.model.PromoteData) r5
            java.util.Currency r5 = r5.A1j
            X.0qQ.A06(r5)
            java.lang.String r6 = X.W2x.A02(r5, r8, r6)
            r5 = 2131970486(0x7f1349b6, float:1.9577924E38)
            java.lang.String r16 = X.DbY.A0c(r7, r6, r5)
            r5 = 40
            X.WBB r15 = new X.WBB
            r15.<init>(r0, r5)
            r18 = r14
            com.instagram.ui.slidecardpageadapter.SlideCardViewModel r5 = com.instagram.ui.slidecardpageadapter.SlideCardViewModel.A00(r14, r15, r16, r17, r18, r19, r20)
            r1.add(r5)
            r20 = 2131237998(0x7f081c6e, float:1.8092262E38)
            android.content.Context r6 = r0.requireContext()
            r5 = 2131970509(0x7f1349cd, float:1.9577971E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r6, r5)
            android.content.Context r6 = r0.requireContext()
            r5 = 2131970475(0x7f1349ab, float:1.9577902E38)
            java.lang.String r19 = X.AnonymousClass7TE.A16(r6, r5)
            android.content.Context r7 = r0.requireContext()
            java.lang.Object r5 = X.AnonymousClass7TE.A14(r4)
            com.instagram.business.promote.model.PromoteData r5 = (com.instagram.business.promote.model.PromoteData) r5
            int r5 = r5.A09
            r6 = 2131970493(0x7f1349bd, float:1.9577939E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r16 = X.DbY.A0c(r7, r5, r6)
            r5 = 41
            X.WBB r15 = new X.WBB
            r15.<init>(r0, r5)
            com.instagram.ui.slidecardpageadapter.SlideCardViewModel r5 = com.instagram.ui.slidecardpageadapter.SlideCardViewModel.A00(r14, r15, r16, r17, r18, r19, r20)
            r1.add(r5)
            r20 = 2131238004(0x7f081c74, float:1.8092274E38)
            android.content.Context r6 = r0.requireContext()
            r5 = 2131970507(0x7f1349cb, float:1.9577967E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r6, r5)
            android.content.Context r6 = r0.requireContext()
            r5 = 2131970473(0x7f1349a9, float:1.9577898E38)
            java.lang.String r19 = X.AnonymousClass7TE.A16(r6, r5)
            android.content.Context r6 = r0.requireContext()
            java.lang.Object r4 = X.AnonymousClass7TE.A14(r4)
            com.instagram.business.promote.model.PromoteData r4 = (com.instagram.business.promote.model.PromoteData) r4
            boolean r5 = r4.A2c
            r4 = 2131970489(0x7f1349b9, float:1.957793E38)
            if (r5 == 0) goto L_0x0321
            r4 = 2131970490(0x7f1349ba, float:1.9577933E38)
        L_0x0321:
            java.lang.String r16 = X.AnonymousClass7TE.A16(r6, r4)
            r4 = 42
        L_0x0327:
            X.WBB r15 = new X.WBB
            r15.<init>(r0, r4)
        L_0x032c:
            com.instagram.ui.slidecardpageadapter.SlideCardViewModel r4 = com.instagram.ui.slidecardpageadapter.SlideCardViewModel.A00(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x039c
        L_0x0331:
            X.0eM r5 = r0.A05
            java.lang.Object r4 = X.AnonymousClass7TE.A14(r5)
            com.instagram.business.promote.model.PromoteData r4 = (com.instagram.business.promote.model.PromoteData) r4
            com.instagram.business.promote.model.PromoteEnrollCouponInfo r11 = r4.A0t
            if (r11 == 0) goto L_0x03a1
            java.lang.Object r4 = X.AnonymousClass7TE.A14(r5)
            com.instagram.business.promote.model.PromoteData r4 = (com.instagram.business.promote.model.PromoteData) r4
            boolean r4 = r4.A2Y
            r10 = 2131237605(0x7f081ae5, float:1.8091465E38)
            r7 = 2131970487(0x7f1349b7, float:1.9577926E38)
            if (r4 == 0) goto L_0x0353
            r10 = 2131237682(0x7f081b32, float:1.8091621E38)
            r7 = 2131970488(0x7f1349b8, float:1.9577929E38)
        L_0x0353:
            android.content.Context r6 = r0.requireContext()
            r5 = 2131970506(0x7f1349ca, float:1.9577965E38)
            java.lang.String r4 = r11.A0A
            java.lang.String r9 = X.DbW.A0h(r6, r4, r5)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131970481(0x7f1349b1, float:1.9577914E38)
            java.lang.String r8 = r5.getString(r4)
            android.content.Context r6 = r0.requireContext()
            java.lang.String r5 = r11.A0A
            java.lang.String r4 = r11.A09
            java.lang.String r7 = X.DbV.A0u(r6, r5, r4, r7)
            r4 = 43
            X.WBB r6 = new X.WBB
            r6.<init>(r0, r4)
            r5 = 0
            com.instagram.ui.slidecardpageadapter.SlideCardViewModel r4 = new com.instagram.ui.slidecardpageadapter.SlideCardViewModel
            r4.<init>()
            r4.A00 = r2
            r4.A01 = r10
            r4.A06 = r5
            r4.A05 = r5
            r4.A0B = r9
            r4.A0A = r5
            r4.A08 = r8
            r4.A09 = r5
            r4.A07 = r7
            r4.A02 = r5
            r4.A03 = r6
            r4.A04 = r5
        L_0x039c:
            r1.add(r4)
            goto L_0x003b
        L_0x03a1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x03a6:
            X.0qQ.A0F(r13)
            goto L_0x03ad
        L_0x03aa:
            X.0qQ.A0F(r12)
        L_0x03ad:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UZM.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) AnonymousClass7TE.A14(this.A08);
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        C16678UzE uzE;
        int A022 = AnonymousClass0fD.A02(503125305);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("is_enter_flow_nux");
        } else {
            z = false;
        }
        this.A03 = z;
        int ordinal = ((C16678UzE) this.A04.getValue()).ordinal();
        if (ordinal != 10) {
            if (ordinal == 11) {
                uzE = C16678UzE.EDUCATION_AUDIENCE;
            } else if (ordinal != 15) {
                if (ordinal == 45) {
                    uzE = C16678UzE.PROFILE_VISIT_SETTING;
                }
                UZM.super.onCreate(bundle);
                AnonymousClass0fD.A09(-1679758556, A022);
            } else {
                uzE = C16678UzE.EDUCATION_BUDGET;
            }
        } else if (!this.A03 || !((PromoteData) AnonymousClass7TE.A14(this.A05)).A2D) {
            uzE = C16678UzE.EDUCATION_DESTINATION;
        } else {
            uzE = C16678UzE.NUX_COUPON;
        }
        this.A00 = uzE;
        UZM.super.onCreate(bundle);
        AnonymousClass0fD.A09(-1679758556, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1479235887);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_nux_view, viewGroup, false);
        AnonymousClass0fD.A09(1856206976, A022);
        return inflate;
    }
}
