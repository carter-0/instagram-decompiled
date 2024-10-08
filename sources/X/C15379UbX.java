package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;

/* renamed from: X.UbX  reason: case insensitive filesystem */
public final class C15379UbX extends AnonymousClass4DH implements C273414mX, C252293os {
    public static final String __redex_internal_original_name = "PromoteEducationDrawerBottomSheetFragment";
    public C16678UzE A00;
    public C16678UzE A01;
    public WGU A02;
    public U48 A03;
    public X6P A04;
    public PromoteData A05;
    public PromoteState A06;
    public ReboundViewPager A07;
    public CirclePageIndicator A08;
    public Integer A09 = AnonymousClass05K.A00;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);

    public final void DVx(int i, int i2) {
    }

    public final void DhK(AnonymousClass3TF r1, float f, float f2) {
    }

    public final void DhS(AnonymousClass3TF r1, AnonymousClass3TF r2) {
    }

    public final void Dpz(int i, int i2) {
    }

    public final /* synthetic */ void Dwb(int i, float f) {
    }

    public final void DzE(View view) {
    }

    public final String getModuleName() {
        return "promote_education_drawer_bottom_sheet_fragment";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02df, code lost:
        if (r3.A0d == null) goto L_0x02e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            r24 = this;
            r5 = 0
            r2 = r25
            X.0qQ.A0B(r2, r5)
            r1 = r24
            r0 = r26
            super.onViewCreated(r2, r0)
            com.instagram.business.promote.model.PromoteState r0 = X.XA9.A00(r1)
            r1.A06 = r0
            com.instagram.business.promote.model.PromoteData r0 = X.XAI.A00(r1)
            r1.A05 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A09 = r0
            r0 = 2131429019(0x7f0b069b, float:1.8479699E38)
            android.view.View r0 = r2.findViewById(r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r0
            r1.A07 = r0
            r0 = 2131437430(0x7f0b2776, float:1.8496758E38)
            android.view.View r2 = r2.findViewById(r0)
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r2 = (com.instagram.ui.widget.pageindicator.CirclePageIndicator) r2
            r1.A08 = r2
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r1.A07
            java.lang.String r14 = "viewPager"
            if (r0 == 0) goto L_0x00dc
            java.lang.String r13 = "pageIndicator"
            if (r2 == 0) goto L_0x03ec
            r0.A0P(r2)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r1.A07
            if (r0 == 0) goto L_0x00dc
            r0.A0P(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.Context r0 = r1.requireContext()
            X.UzE r3 = r1.A01
            if (r3 != 0) goto L_0x005e
            java.lang.String r12 = "entryScreen"
        L_0x0056:
            X.0qQ.A0F(r12)
        L_0x0059:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x005e:
            int r11 = r3.ordinal()
            r10 = 45
            r8 = 1
            r4 = 15
            r6 = 10
            r3 = 11
            r9 = 8
            r7 = 7
            java.lang.String r12 = "promoteData"
            if (r11 == r6) goto L_0x025f
            if (r11 == r3) goto L_0x01d0
            if (r11 == r4) goto L_0x0130
            if (r11 != r10) goto L_0x00a1
            r3 = 2131970420(0x7f134974, float:1.957779E38)
            java.lang.String r20 = X.AnonymousClass7TE.A16(r0, r3)
            r3 = 2131970418(0x7f134972, float:1.9577787E38)
            java.lang.String r4 = r0.getString(r3)
            r3 = 2131970419(0x7f134973, float:1.9577789E38)
            java.lang.String r19 = X.C13991Tnr.A0b(r0, r4, r3)
            r16 = 0
            X.WAi r17 = X.C18870WAi.A00
            X.UzE r18 = X.C16678UzE.PROFILE_VISIT_SETTING
            java.lang.String r23 = "education_secondary_cta"
            com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel r15 = new com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel
            r21 = r16
            r22 = r16
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x009e:
            r2.add(r15)
        L_0x00a1:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r4 = r1.A07
            if (r4 == 0) goto L_0x00dc
            com.instagram.business.promote.model.PromoteData r0 = r1.A05
            if (r0 == 0) goto L_0x0056
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.0qQ.A06(r0)
            X.U48 r3 = new X.U48
            r3.<init>(r4, r0, r2)
            r1.A03 = r3
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r1.A07
            if (r0 == 0) goto L_0x00dc
            java.lang.String r12 = "pageAdapter"
            r0.setAdapter((android.widget.Adapter) r3)
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r0 = r1.A08
            if (r0 == 0) goto L_0x03ec
            r0.setVisibility(r5)
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r2 = r1.A08
            if (r2 == 0) goto L_0x03ec
            X.U48 r0 = r1.A03
            if (r0 == 0) goto L_0x0056
            int r0 = r0.getCount()
            r2.A01(r5, r0)
            X.UzE r2 = X.C16678UzE.PROFILE_VISIT_SETTING
            X.UzE r0 = r1.A01
            if (r0 != 0) goto L_0x00e1
            java.lang.String r14 = "entryScreen"
        L_0x00dc:
            X.0qQ.A0F(r14)
            goto L_0x0059
        L_0x00e1:
            if (r2 != r0) goto L_0x00ea
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r0 = r1.A08
            if (r0 == 0) goto L_0x03ec
            r0.setVisibility(r9)
        L_0x00ea:
            X.U48 r0 = r1.A03
            if (r0 == 0) goto L_0x0056
            java.util.List r0 = r0.A04
            java.lang.Object r0 = r0.get(r5)
            com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel r0 = (com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel) r0
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L_0x03e8
            X.U48 r0 = r1.A03
            if (r0 == 0) goto L_0x0056
            java.util.List r0 = r0.A04
            java.lang.Object r0 = r0.get(r5)
            com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel r0 = (com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel) r0
            X.UzE r0 = r0.A02
            if (r0 == 0) goto L_0x03e4
            r1.A00 = r0
            X.0eM r0 = r1.A0A
            X.WGU r3 = X.JTU.A0D(r0)
            r1.A02 = r3
            if (r3 == 0) goto L_0x0126
            X.UzE r0 = r1.A00
            if (r0 != 0) goto L_0x011d
            java.lang.String r14 = "currentScreen"
            goto L_0x00dc
        L_0x011d:
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "enter_education_drawer"
            r3.A0R(r2, r0)
        L_0x0126:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r1.A07
            if (r0 == 0) goto L_0x00dc
            int r0 = r0.A08
            r1.DW9(r0, r0, r5)
            return
        L_0x0130:
            r3 = 2131970505(0x7f1349c9, float:1.9577963E38)
            java.lang.String r20 = X.AnonymousClass7TE.A16(r0, r3)
            com.instagram.business.promote.model.PromoteData r4 = r1.A05
            if (r4 == 0) goto L_0x0056
            int r3 = r4.A08
            java.lang.String r4 = X.C13991Tnr.A0g(r4, r3)
            r3 = 2131970486(0x7f1349b6, float:1.9577924E38)
            java.lang.String r19 = X.DbY.A0c(r0, r4, r3)
            r3 = 2131970472(0x7f1349a8, float:1.9577896E38)
            java.lang.String r21 = X.AnonymousClass7TE.A16(r0, r3)
            r22 = 0
            r4 = 30
            X.WBB r3 = new X.WBB
            r3.<init>(r1, r4)
            X.WAf r17 = X.C18867WAf.A00
            X.UzE r18 = X.C16678UzE.EDUCATION_BUDGET
            java.lang.String r23 = "education_budget"
            com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel r15 = new com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel
            r16 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r2.add(r15)
            r3 = 2131970509(0x7f1349cd, float:1.9577971E38)
            java.lang.String r20 = X.AnonymousClass7TE.A16(r0, r3)
            com.instagram.business.promote.model.PromoteData r3 = r1.A05
            if (r3 == 0) goto L_0x0056
            int r3 = r3.A09
            r4 = 2131970493(0x7f1349bd, float:1.9577939E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r19 = X.DbY.A0c(r0, r3, r4)
            r3 = 2131970475(0x7f1349ab, float:1.9577902E38)
            java.lang.String r21 = X.AnonymousClass7TE.A16(r0, r3)
            r4 = 23
            X.WBB r3 = new X.WBB
            r3.<init>(r1, r4)
            X.WAg r17 = X.C18868WAg.A00
            java.lang.String r23 = "education_duration"
            com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel r15 = new com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel
            r16 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r2.add(r15)
            r3 = 2131970507(0x7f1349cb, float:1.9577967E38)
            java.lang.String r20 = X.AnonymousClass7TE.A16(r0, r3)
            com.instagram.business.promote.model.PromoteData r3 = r1.A05
            if (r3 == 0) goto L_0x0056
            boolean r4 = r3.A2c
            r3 = 2131970489(0x7f1349b9, float:1.957793E38)
            if (r4 == 0) goto L_0x01b1
            r3 = 2131970490(0x7f1349ba, float:1.9577933E38)
        L_0x01b1:
            java.lang.String r19 = X.AnonymousClass7TE.A16(r0, r3)
            r3 = 2131970473(0x7f1349a9, float:1.9577898E38)
            java.lang.String r21 = X.AnonymousClass7TE.A16(r0, r3)
            r3 = 24
            X.WBB r0 = new X.WBB
            r0.<init>(r1, r3)
            X.WAh r17 = X.C18869WAh.A00
            java.lang.String r23 = "education_distribution"
            com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel r15 = new com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x009e
        L_0x01d0:
            r3 = 2131970504(0x7f1349c8, float:1.957796E38)
            java.lang.String r20 = X.AnonymousClass7TE.A16(r0, r3)
            r3 = 2131970485(0x7f1349b5, float:1.9577922E38)
            java.lang.String r19 = X.AnonymousClass7TE.A16(r0, r3)
            r3 = 2131970471(0x7f1349a7, float:1.9577894E38)
            java.lang.String r21 = X.AnonymousClass7TE.A16(r0, r3)
            r22 = 0
            r4 = 26
            X.WBB r3 = new X.WBB
            r3.<init>(r1, r4)
            X.WAk r17 = X.C18872WAk.A00
            X.UzE r18 = X.C16678UzE.EDUCATION_AUDIENCE
            java.lang.String r23 = "education_audience_automatic"
            com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel r15 = new com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel
            r16 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r2.add(r15)
            r3 = 2131970511(0x7f1349cf, float:1.9577975E38)
            java.lang.String r20 = X.AnonymousClass7TE.A16(r0, r3)
            r3 = 2131970495(0x7f1349bf, float:1.9577943E38)
            java.lang.String r19 = X.AnonymousClass7TE.A16(r0, r3)
            r3 = 2131970479(0x7f1349af, float:1.957791E38)
            java.lang.String r21 = X.AnonymousClass7TE.A16(r0, r3)
            r4 = 27
            X.WBB r3 = new X.WBB
            r3.<init>(r1, r4)
            X.WAl r17 = X.C18873WAl.A00
            java.lang.String r23 = "education_audience_manual"
            com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel r15 = new com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel
            r16 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r2.add(r15)
            r3 = 2131970514(0x7f1349d2, float:1.9577981E38)
            java.lang.String r20 = X.AnonymousClass7TE.A16(r0, r3)
            r3 = 2131970499(0x7f1349c3, float:1.957795E38)
            java.lang.String r19 = X.AnonymousClass7TE.A16(r0, r3)
            r3 = 2131970482(0x7f1349b2, float:1.9577916E38)
            java.lang.String r21 = X.AnonymousClass7TE.A16(r0, r3)
            r3 = 2131970483(0x7f1349b3, float:1.9577918E38)
            java.lang.String r22 = X.AnonymousClass7TE.A16(r0, r3)
            r0 = 28
            X.WBB r4 = new X.WBB
            r4.<init>(r1, r0)
            r3 = 29
            X.WBB r0 = new X.WBB
            r0.<init>(r1, r3)
            java.lang.String r23 = "education_audience_special_requirements"
            com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel r15 = new com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel
            r17 = r0
            r16 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x009e
        L_0x025f:
            r3 = 2131970513(0x7f1349d1, float:1.957798E38)
            java.lang.String r20 = X.AnonymousClass7TE.A16(r0, r3)
            r3 = 2131970498(0x7f1349c2, float:1.9577949E38)
            java.lang.String r19 = X.AnonymousClass7TE.A16(r0, r3)
            r3 = 2131970481(0x7f1349b1, float:1.9577914E38)
            java.lang.String r21 = X.AnonymousClass7TE.A16(r0, r3)
            r22 = 0
            r3 = 25
            X.WBB r0 = new X.WBB
            r0.<init>(r1, r3)
            X.WAj r17 = X.C18871WAj.A00
            X.UzE r18 = X.C16678UzE.EDUCATION_DESTINATION
            java.lang.String r23 = "education_reach_new_people"
            com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel r15 = new com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r2.add(r15)
            com.instagram.business.promote.model.PromoteData r0 = r1.A05
            if (r0 == 0) goto L_0x0056
            java.util.List r0 = r0.A1p
            java.util.Iterator r11 = r0.iterator()
        L_0x0297:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r0 = r11.next()
            com.instagram.api.schemas.XIGIGBoostDestination r0 = (com.instagram.api.schemas.XIGIGBoostDestination) r0
            if (r0 == 0) goto L_0x0297
            int r3 = r0.ordinal()
            if (r3 == r7) goto L_0x0398
            if (r3 == r9) goto L_0x0364
            if (r3 == r6) goto L_0x0331
            if (r3 == r8) goto L_0x02fe
            r0 = 4
            if (r3 != r0) goto L_0x0297
            X.Vth r3 = X.C18529Vth.A00
            com.instagram.business.promote.model.PromoteData r0 = r1.A05
            if (r0 == 0) goto L_0x0056
            boolean r0 = r3.A00(r0)
            if (r0 == 0) goto L_0x0297
            android.content.Context r4 = r1.requireContext()
            r0 = 2131970503(0x7f1349c7, float:1.9577959E38)
            java.lang.String r20 = X.AnonymousClass7TE.A16(r4, r0)
            r0 = 2131970502(0x7f1349c6, float:1.9577957E38)
            java.lang.String r19 = X.AnonymousClass7TE.A16(r4, r0)
            com.instagram.business.promote.model.PromoteData r3 = r1.A05
            if (r3 == 0) goto L_0x0056
            com.instagram.leadgen.core.api.LeadForm r0 = r3.A16
            if (r0 == 0) goto L_0x02e1
            com.instagram.api.schemas.XIGIGBoostCallToAction r3 = r3.A0d
            r0 = 2131970478(0x7f1349ae, float:1.9577908E38)
            if (r3 != 0) goto L_0x02e4
        L_0x02e1:
            r0 = 2131970477(0x7f1349ad, float:1.9577906E38)
        L_0x02e4:
            java.lang.String r21 = X.C51967G9n.A0p(r4, r0)
            r3 = 32
            X.WBB r0 = new X.WBB
            r0.<init>(r1, r3)
            X.WAn r17 = X.C18875WAn.A00
            java.lang.String r23 = "education_destination_lead_gen"
            com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel r15 = new com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x02fa:
            r2.add(r15)
            goto L_0x0297
        L_0x02fe:
            android.content.Context r4 = r1.requireContext()
            r0 = 2131970508(0x7f1349cc, float:1.957797E38)
            java.lang.String r20 = X.AnonymousClass7TE.A16(r4, r0)
            r0 = 2131970491(0x7f1349bb, float:1.9577935E38)
            java.lang.String r3 = r4.getString(r0)
            r0 = 2131970492(0x7f1349bc, float:1.9577937E38)
            java.lang.String r19 = X.C13991Tnr.A0b(r4, r3, r0)
            r0 = 2131970474(0x7f1349aa, float:1.95779E38)
            java.lang.String r21 = X.AnonymousClass7TE.A16(r4, r0)
            r3 = 31
            X.WBB r0 = new X.WBB
            r0.<init>(r1, r3)
            X.WAm r17 = X.C18874WAm.A00
            java.lang.String r23 = "education_destination_direct"
            com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel r15 = new com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x02fa
        L_0x0331:
            android.content.Context r4 = r1.requireContext()
            r0 = 2131970515(0x7f1349d3, float:1.9577983E38)
            java.lang.String r20 = X.AnonymousClass7TE.A16(r4, r0)
            r0 = 2131970500(0x7f1349c4, float:1.9577953E38)
            java.lang.String r3 = r4.getString(r0)
            r0 = 2131970501(0x7f1349c5, float:1.9577955E38)
            java.lang.String r19 = X.C13991Tnr.A0b(r4, r3, r0)
            r0 = 2131970484(0x7f1349b4, float:1.957792E38)
            java.lang.String r21 = X.AnonymousClass7TE.A16(r4, r0)
            r3 = 35
            X.WBB r0 = new X.WBB
            r0.<init>(r1, r3)
            X.WAq r17 = X.C18878WAq.A00
            java.lang.String r23 = "education_destination_website"
            com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel r15 = new com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x02fa
        L_0x0364:
            android.content.Context r4 = r1.requireContext()
            r0 = 2131970512(0x7f1349d0, float:1.9577977E38)
            java.lang.String r20 = X.AnonymousClass7TE.A16(r4, r0)
            r0 = 2131970496(0x7f1349c0, float:1.9577945E38)
            java.lang.String r3 = r4.getString(r0)
            r0 = 2131970497(0x7f1349c1, float:1.9577947E38)
            java.lang.String r19 = X.C13991Tnr.A0b(r4, r3, r0)
            r0 = 2131970480(0x7f1349b0, float:1.9577912E38)
            java.lang.String r21 = X.AnonymousClass7TE.A16(r4, r0)
            r3 = 34
            X.WBB r0 = new X.WBB
            r0.<init>(r1, r3)
            X.WAp r17 = X.C18877WAp.A00
            java.lang.String r23 = "education_destination_profile"
            com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel r15 = new com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x02fa
        L_0x0398:
            com.instagram.business.promote.model.PromoteData r0 = r1.A05
            if (r0 == 0) goto L_0x0056
            com.instagram.common.session.UserSession r10 = r0.A0y
            X.0qQ.A06(r10)
            X.0Tu r0 = X.0Tu.A05
            r3 = 36322495472609502(0x810b1e000028de, double:3.0338306236034017E-306)
            boolean r0 = X.182.A06(r0, r10, r3)
            if (r0 == 0) goto L_0x0297
            android.content.Context r4 = r1.requireContext()
            r0 = 2131970510(0x7f1349ce, float:1.9577973E38)
            java.lang.String r20 = X.AnonymousClass7TE.A16(r4, r0)
            java.lang.String r3 = "\n\n"
            r0 = 2131970494(0x7f1349be, float:1.957794E38)
            java.lang.String r0 = r4.getString(r0)
            java.lang.String r19 = X.002.A0R(r3, r0)
            X.0qQ.A07(r19)
            r0 = 2131970476(0x7f1349ac, float:1.9577904E38)
            java.lang.String r21 = X.AnonymousClass7TE.A16(r4, r0)
            r3 = 33
            X.WBB r0 = new X.WBB
            r0.<init>(r1, r3)
            X.WAo r17 = X.C18876WAo.A00
            java.lang.String r23 = "education_destination_engagement"
            com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel r15 = new com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x02fa
        L_0x03e4:
            java.lang.String r12 = "promoteScreen"
            goto L_0x0056
        L_0x03e8:
            java.lang.String r12 = "promoteComponentValue"
            goto L_0x0056
        L_0x03ec:
            X.0qQ.A0F(r13)
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15379UbX.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* synthetic */ boolean CsC() {
        return false;
    }

    public final void Cyc() {
        X6P x6p;
        Fragment uZb;
        int intValue = this.A09.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    x6p = this.A04;
                    if (x6p != null) {
                        C18079Vl8 A0N = C13990Tnq.A0N();
                        PromoteData promoteData = this.A05;
                        if (promoteData != null) {
                            0qQ.A06(promoteData.A0y);
                            uZb = A0N.A05(false);
                        }
                    } else {
                        return;
                    }
                } else if (intValue == 3) {
                    x6p = this.A04;
                    if (x6p != null) {
                        C13990Tnq.A0h();
                        if (this.A05 != null) {
                            uZb = new C15274UZc();
                        }
                    } else {
                        return;
                    }
                } else if (intValue == 4) {
                    x6p = this.A04;
                    if (x6p != null) {
                        C13990Tnq.A0h();
                        uZb = new C15280UZi();
                    } else {
                        return;
                    }
                } else {
                    throw new RuntimeException();
                }
                0qQ.A0F("promoteData");
                throw AnonymousClass00P.createAndThrow();
            }
            x6p = this.A04;
            if (x6p != null) {
                C13990Tnq.A0h();
                uZb = new C15273UZb();
            } else {
                return;
            }
            x6p.Cqq(uZb);
            return;
        }
        X6P x6p2 = this.A04;
        if (x6p2 != null) {
            x6p2.Cya();
        }
    }

    public final void Cyf() {
        WGU wgu = this.A02;
        if (wgu != null) {
            C16678UzE uzE = this.A00;
            if (uzE == null) {
                0qQ.A0F("currentScreen");
                throw AnonymousClass00P.createAndThrow();
            } else {
                wgu.A0R(uzE.toString(), "exit_education_drawer");
            }
        }
    }

    public final void DW9(int i, int i2, boolean z) {
        U48 u48 = this.A03;
        String str = "pageAdapter";
        if (u48 != null) {
            C16678UzE uzE = ((PromoteBottomSheetSlideCardViewModel) u48.A04.get(i)).A02;
            if (uzE != null) {
                this.A00 = uzE;
                U48 u482 = this.A03;
                if (u482 != null) {
                    String str2 = ((PromoteBottomSheetSlideCardViewModel) u482.A04.get(i)).A06;
                    if (str2 != null) {
                        WGU wgu = this.A02;
                        if (wgu != null) {
                            C16678UzE uzE2 = this.A00;
                            if (uzE2 == null) {
                                str = "currentScreen";
                            } else {
                                wgu.A0H(uzE2, str2);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        str = "promoteComponentValue";
                    }
                }
            } else {
                str = "promoteScreen";
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1159962503);
        C15379UbX.super.onCreate(bundle);
        C16678UzE uzE = (C16678UzE) requireArguments().get("step");
        0qQ.A0A(uzE);
        this.A01 = uzE;
        AnonymousClass0fD.A09(1709287786, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1736036053);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_education_drawer_bottom_sheet_view, viewGroup, false);
        AnonymousClass0fD.A09(-1331450623, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1514505882);
        super.onDestroyView();
        ReboundViewPager reboundViewPager = this.A07;
        String str = "viewPager";
        if (reboundViewPager != null) {
            CirclePageIndicator circlePageIndicator = this.A08;
            if (circlePageIndicator == null) {
                str = "pageIndicator";
            } else {
                reboundViewPager.A0Q(circlePageIndicator);
                ReboundViewPager reboundViewPager2 = this.A07;
                if (reboundViewPager2 != null) {
                    reboundViewPager2.A0Q(this);
                    this.A02 = null;
                    AnonymousClass0fD.A09(51918041, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
