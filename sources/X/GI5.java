package X;

import android.app.Activity;
import android.view.View;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class GI5 implements JRF {
    public 1wn A00;
    public boolean A01;
    public boolean A02;
    public C267324bN A03;
    public final Activity A04;
    public final ClipsViewerConfig A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final 1Av A08;
    public final C52016GBn A09;
    public final JSx A0A;
    public final C62320sa A0B;
    public final C62320sa A0C;

    public GI5(Activity activity, ClipsViewerConfig clipsViewerConfig, JSx jSx, AnonymousClass0iw r5, UserSession userSession, 1Av r7, C52016GBn gBn, C62320sa r9, C62320sa r10) {
        0qQ.A0B(r7, 4);
        this.A04 = activity;
        this.A07 = userSession;
        this.A0B = r9;
        this.A08 = r7;
        this.A06 = r5;
        this.A05 = clipsViewerConfig;
        this.A0A = jSx;
        this.A09 = gBn;
        this.A0C = r10;
        gBn.A94(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02f1, code lost:
        if (r0 != null) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0109, code lost:
        if (X.182.A06(r7, r2, 36318234865375251L) != false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x018e, code lost:
        if (r0 != null) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0190, code lost:
        r8 = r0.getId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0194, code lost:
        r1.A06("ig_media_id", r8);
        r1.A09(java.lang.Boolean.valueOf(r18));
        r1.A05("impression_count", 1L);
        X.C368288sN.A00(r9, r6, r10, r1, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dxm(X.C267324bN r20, java.lang.Integer r21, int r22) {
        /*
            r19 = this;
            r3 = 0
            r4 = r20
            X.0qQ.A0B(r4, r3)
            r5 = r19
            X.0sa r0 = r5.A0B
            java.lang.Object r1 = r0.invoke()
            X.GBj r1 = (X.C52012GBj) r1
            X.JSx r0 = r5.A0A
            X.GDe r0 = r0.BzC(r4)
            int r0 = r0.A09()
            android.view.View r15 = r1.A0A(r0)
            if (r15 == 0) goto L_0x02ad
            X.4bN r0 = r5.A03
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 != 0) goto L_0x002c
            r5.A02 = r3
            r5.A03 = r4
        L_0x002c:
            boolean r0 = r4.A0X
            if (r0 == 0) goto L_0x0061
            X.1Xj r1 = r4.A02
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x0061
            if (r1 == 0) goto L_0x0061
            com.instagram.common.session.UserSession r0 = r5.A07
            boolean r0 = X.AnonymousClass3ZC.A0S(r0, r1)
            if (r0 == 0) goto L_0x0061
            android.view.View r1 = A01(r15)
            if (r1 == 0) goto L_0x0061
            r0 = 2131966727(0x7f133b07, float:1.95703E38)
            A03(r1, r5, r0)
            X.1Av r0 = r5.A08
            r2 = 1
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            r0 = 5173(0x1435, float:7.249E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.E5T(r0, r2)
            r1.apply()
            r5.A02 = r2
        L_0x0061:
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x0093
            com.instagram.common.session.UserSession r1 = r5.A07
            r7 = 1
            boolean r0 = X.AnonymousClass3ZC.A0G(r4, r1)
            if (r0 == 0) goto L_0x0093
            X.1Av r1 = X.1Au.A00(r1)
            X.0s0 r0 = r1.A2A
            X.0YZ[] r6 = X.1Av.A8a
            r2 = 80
            boolean r0 = X.AnonymousClass7TG.A1a(r1, r0, r6, r2)
            if (r0 != 0) goto L_0x0093
            android.view.View r1 = A01(r15)
            if (r1 == 0) goto L_0x0093
            r0 = 2131966725(0x7f133b05, float:1.9570296E38)
            A03(r1, r5, r0)
            X.1Av r1 = r5.A08
            X.0s0 r0 = r1.A2A
            X.AnonymousClass7TF.A1J(r1, r0, r6, r2, r7)
            r5.A02 = r7
        L_0x0093:
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x00d1
            X.1Av r0 = r5.A08
            X.0xa r7 = r0.A01
            java.lang.String r6 = "clips_remix_options_tool_tip_total_shown_count"
            int r0 = r7.getInt(r6, r3)
            r2 = 1
            if (r0 >= r2) goto L_0x00d1
            com.instagram.common.session.UserSession r0 = r5.A07
            boolean r0 = X.AnonymousClass3ZC.A0I(r4, r0)
            if (r0 == 0) goto L_0x00d1
            X.1Xj r0 = r4.A02
            if (r0 == 0) goto L_0x00d1
            X.1s9 r0 = r0.A1N()
            if (r0 == 0) goto L_0x00d1
            boolean r0 = r0.getHasBeenMashedUp()
            if (r0 != r2) goto L_0x00d1
            android.view.View r1 = A01(r15)
            if (r1 == 0) goto L_0x00d1
            r0 = 2131966729(0x7f133b09, float:1.9570304E38)
            A03(r1, r5, r0)
            X.0xY r0 = r7.AR4()
            X.AnonymousClass7TG.A1L(r0, r7, r6, r3)
            r5.A02 = r2
        L_0x00d1:
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x01ac
            com.instagram.common.session.UserSession r2 = r5.A07
            com.instagram.clips.intf.ClipsViewerConfig r0 = r5.A05
            boolean r0 = X.AnonymousClass3ZC.A09(r0, r4, r2)
            if (r0 == 0) goto L_0x01ac
            X.1Av r6 = r5.A08
            X.0s0 r14 = r6.A2H
            X.0YZ[] r12 = X.1Av.A8a
            r11 = 81
            boolean r0 = X.AnonymousClass7TG.A1a(r6, r14, r12, r11)
            if (r0 == 0) goto L_0x010b
            boolean r0 = r6.A1p()
            if (r0 != 0) goto L_0x01ac
            X.0Tu r7 = X.0Tu.A05
            r0 = 36318234865113104(0x81073e00011810, double:3.03113619826659E-306)
            boolean r0 = X.182.A06(r7, r2, r0)
            if (r0 == 0) goto L_0x01ac
            r0 = 36318234865375251(0x81073e00051813, double:3.031136198432373E-306)
            boolean r0 = X.182.A06(r7, r2, r0)
            if (r0 == 0) goto L_0x01ac
        L_0x010b:
            X.1Xj r0 = r4.A02
            boolean r0 = X.C246353eS.A09(r2, r0)
            if (r0 == 0) goto L_0x01ac
            X.1Xj r0 = r4.A02
            if (r0 == 0) goto L_0x01ac
            X.Dfd r1 = X.C246353eS.A01(r0)
            X.HPj r0 = X.C59724JVi.A00(r0)
            boolean r0 = r0 instanceof X.KYY
            if (r0 == 0) goto L_0x01ac
            boolean r0 = r1.A00()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01ac
            X.819 r10 = X.AnonymousClass819.TOOLTIP_SHARE_LATER_REELS
            X.818 r9 = X.AnonymousClass818.IG_SELF_REEL_VIEW
            boolean r0 = X.C367998ru.A03(r9, r10, r2)
            if (r0 == 0) goto L_0x01ac
            X.8jd r1 = X.C363388je.A00(r2)
            java.lang.String r0 = "ClipsViewerInfoToolTipController"
            com.facebook.common.callercontext.CallerContext r0 = com.facebook.common.callercontext.CallerContext.A01(r0)
            X.5wF r0 = r1.A00(r0)
            boolean r18 = X.C363388je.A03(r0)
            boolean r0 = r6.A1p()
            r16 = 1
            r8 = 0
            r7 = 1
            if (r0 != 0) goto L_0x02ae
            X.0Tu r13 = X.0Tu.A05
            r0 = 36318234865113104(0x81073e00011810, double:3.03113619826659E-306)
            boolean r0 = X.182.A06(r13, r2, r0)
            if (r0 == 0) goto L_0x02ae
            r0 = 36318234865375251(0x81073e00051813, double:3.031136198432373E-306)
            boolean r0 = X.182.A06(r13, r2, r0)
            if (r0 == 0) goto L_0x02ae
            android.view.View r11 = A01(r15)
            if (r11 == 0) goto L_0x01ac
            r0 = 2131972970(0x7f13536a, float:1.9582963E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.2fy r0 = X.C226262fy.LEFT_ANCHOR
            A02(r11, r0, r8, r5, r1)
            r6.A1Y(r7)
            X.0iw r0 = r5.A06
            X.C52086GEg.A0W(r0, r2)
            r5.A02 = r7
            X.8sM r6 = X.C368278sM.VIEW
            X.81A r1 = new X.81A
            r1.<init>()
            X.1Xj r0 = r4.A02
            if (r0 == 0) goto L_0x0194
        L_0x0190:
            java.lang.String r8 = r0.getId()
        L_0x0194:
            java.lang.String r0 = "ig_media_id"
            r1.A06(r0, r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r18)
            r1.A09(r0)
            java.lang.Long r7 = java.lang.Long.valueOf(r16)
            java.lang.String r0 = "impression_count"
            r1.A05(r0, r7)
            X.C368288sN.A00(r9, r6, r10, r1, r2)
        L_0x01ac:
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x01ff
            com.instagram.common.session.UserSession r10 = r5.A07
            com.instagram.clips.intf.ClipsViewerConfig r0 = r5.A05
            boolean r0 = X.AnonymousClass3ZC.A09(r0, r4, r10)
            if (r0 == 0) goto L_0x01ff
            X.1Av r8 = r5.A08
            X.0s0 r7 = r8.A2m
            X.0YZ[] r6 = X.1Av.A8a
            r0 = 79
            boolean r0 = X.AnonymousClass7TG.A1a(r8, r7, r6, r0)
            if (r0 != 0) goto L_0x01ff
            X.0s0 r1 = r8.A2n
            r0 = 84
            boolean r0 = X.AnonymousClass7TG.A1a(r8, r1, r6, r0)
            if (r0 != 0) goto L_0x01ff
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342162575518604773(0x2081087400001de5, double:4.06521814359108E-152)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x01ff
            android.view.View r9 = A00(r15)
            if (r9 == 0) goto L_0x01ff
            X.0iw r0 = r5.A06
            X.C52086GEg.A0W(r0, r10)
            r0 = 2131971085(0x7f134c0d, float:1.957914E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.2fy r1 = X.C226262fy.LEFT_ANCHOR
            r0 = 0
            A02(r9, r1, r0, r5, r2)
            r1 = 1
            r0 = 79
            X.AnonymousClass7TF.A1J(r8, r7, r6, r0, r1)
            r5.A02 = r1
        L_0x01ff:
            X.1Xj r2 = r4.A02
            if (r2 == 0) goto L_0x024a
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x024a
            com.instagram.common.session.UserSession r1 = r5.A07
            boolean r0 = X.AnonymousClass3ZC.A0L(r4, r1)
            if (r0 == 0) goto L_0x024a
            X.1Av r0 = r5.A08
            X.0xa r9 = r0.A01
            java.lang.String r8 = "pin_reels_to_grid_for_reels_viewer_nux"
            int r0 = r9.getInt(r8, r3)
            r7 = 3
            if (r0 >= r7) goto L_0x024a
            boolean r0 = X.GLX.A02(r1, r2)
            if (r0 == 0) goto L_0x024a
            android.view.View r6 = A01(r15)
            if (r6 == 0) goto L_0x024a
            r0 = 2131969493(0x7f1345d5, float:1.957591E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.2fy r1 = X.C226262fy.LEFT_ANCHOR
            r0 = 0
            A02(r6, r1, r0, r5, r2)
            int r0 = r9.getInt(r8, r3)
            if (r0 >= r7) goto L_0x0247
            X.0xY r1 = r9.AR4()
            int r0 = r0 + 1
            r1.E5Z(r8, r0)
            r1.apply()
        L_0x0247:
            r0 = 1
            r5.A02 = r0
        L_0x024a:
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x028b
            X.1Xj r2 = r4.A02
            if (r2 == 0) goto L_0x028b
            com.instagram.clips.intf.ClipsViewerConfig r0 = r5.A05
            java.lang.String r1 = r0.A11
            if (r1 == 0) goto L_0x028b
            java.lang.String r0 = "1297"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0268
            java.lang.String r0 = "1296"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x028b
        L_0x0268:
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x028b
            com.instagram.common.session.UserSession r1 = r5.A07
            boolean r0 = X.AnonymousClass3ZC.A0L(r4, r1)
            if (r0 == 0) goto L_0x028b
            boolean r0 = X.GKS.A02(r1, r2)
            if (r0 == 0) goto L_0x028b
            android.view.View r1 = A01(r15)
            if (r1 == 0) goto L_0x028b
            r0 = 2131966726(0x7f133b06, float:1.9570298E38)
            A03(r1, r5, r0)
            r0 = 1
            r5.A02 = r0
            r5.A01 = r0
        L_0x028b:
            r0 = 4
            X.IO3 r3 = new X.IO3
            r3.<init>(r0, r4, r5, r15)
            X.1wn r2 = r5.A00
            if (r2 == 0) goto L_0x02a0
            com.instagram.common.session.UserSession r0 = r5.A07
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.INX> r0 = X.INX.class
            r1.A02(r2, r0)
        L_0x02a0:
            r5.A00 = r3
            com.instagram.common.session.UserSession r0 = r5.A07
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.INX> r0 = X.INX.class
            r1.A01(r3, r0)
        L_0x02ad:
            return
        L_0x02ae:
            boolean r0 = X.AnonymousClass7TG.A1a(r6, r14, r12, r11)
            if (r0 != 0) goto L_0x01ac
            X.0Tu r11 = X.0Tu.A05
            r0 = 36318234865113104(0x81073e00011810, double:3.03113619826659E-306)
            boolean r0 = X.182.A06(r11, r2, r0)
            if (r0 == 0) goto L_0x02cc
            r0 = 36318234865375251(0x81073e00051813, double:3.031136198432373E-306)
            boolean r0 = X.182.A06(r11, r2, r0)
            if (r0 != 0) goto L_0x01ac
        L_0x02cc:
            android.view.View r11 = A00(r15)
            if (r11 == 0) goto L_0x01ac
            r0 = 2131972970(0x7f13536a, float:1.9582963E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.2fy r0 = X.C226262fy.LEFT_ANCHOR
            A02(r11, r0, r8, r5, r1)
            r6.A1P(r7)
            X.0iw r0 = r5.A06
            X.C52086GEg.A0W(r0, r2)
            r5.A02 = r7
            X.8sM r6 = X.C368278sM.VIEW
            X.81A r1 = new X.81A
            r1.<init>()
            X.1Xj r0 = r4.A02
            if (r0 == 0) goto L_0x0194
            goto L_0x0190
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GI5.Dxm(X.4bN, java.lang.Integer, int):void");
    }

    public static final void A02(View view, C226262fy r4, C315476jx r5, GI5 gi5, Integer num) {
        if (num != null) {
            r5 = new C315476jx((CharSequence) AnonymousClass7TF.A0d(view.getResources(), num.intValue()));
        } else if (r5 == null) {
            throw AnonymousClass7TE.A0y();
        }
        AnonymousClass5Gt r1 = new AnonymousClass5Gt(gi5.A04, r5);
        r1.A03(view);
        r1.A05 = r4;
        r1.A00 = 5000;
        r1.A0A = true;
        view.postDelayed(new C57785IgQ(r1.A00()), 500);
    }

    public final void Dzs() {
    }

    public static final View A00(View view) {
        View findViewWithTag = view.findViewWithTag(Integer.valueOf(R.id.direct_share_button));
        if (findViewWithTag != null) {
            return findViewWithTag;
        }
        View findViewWithTag2 = view.findViewWithTag("clips_ufi_share_button_component");
        if (findViewWithTag2 == null) {
            return null;
        }
        return findViewWithTag2;
    }

    public static final View A01(View view) {
        View findViewWithTag = view.findViewWithTag(Integer.valueOf(R.id.more_button));
        if (findViewWithTag != null) {
            return findViewWithTag;
        }
        View findViewWithTag2 = view.findViewWithTag("clips_ufi_more_button_component");
        if (findViewWithTag2 == null) {
            return null;
        }
        return findViewWithTag2;
    }

    public static void A03(View view, GI5 gi5, int i) {
        A02(view, C226262fy.ABOVE_ANCHOR, (C315476jx) null, gi5, Integer.valueOf(i));
    }

    public final void A04(View view, C267324bN r11, AnonymousClass4DU r12, String str) {
        1Xj r1;
        View A012;
        long j;
        Long A10;
        boolean A1Z = AnonymousClass7TG.A1Z(r12, r11);
        0qQ.A0B(str, 3);
        if (view != null && !this.A02 && (r1 = r11.A02) != null) {
            UserSession userSession = this.A07;
            if (AnonymousClass3ZC.A0L(r11, userSession) && GKS.A02(userSession, r1)) {
                1Av r5 = this.A08;
                0s0 r4 = r5.A2J;
                AnonymousClass0YZ[] r3 = 1Av.A8a;
                if (!AnonymousClass7TG.A1a(r5, r4, r3, 433) && !this.A01 && (A012 = A01(view)) != null) {
                    A03(A012, this, 2131966726);
                    r1.A30();
                    int A092 = this.A0A.BzC(r11).A09();
                    0Aj A0u = G9t.A0u(r12, userSession);
                    if (A0u.isSampled()) {
                        DbW.A16(A0u, r12);
                        String A2n = r1.A2n();
                        if (A2n == null || (A10 = AnonymousClass7TE.A10(A2n)) == null) {
                            j = 0;
                        } else {
                            j = A10.longValue();
                        }
                        C51974G9v.A0l(A0u, A092, j);
                        C51973G9u.A14(A0u, "viewer_session_id", str);
                        C51965G9l.A19(C52236GKd.A0E, A0u);
                        C51965G9l.A1C(AnonymousClass5OC.THREE_DOTS, A0u);
                        A0u.Cgf();
                    }
                    AnonymousClass7TF.A1J(r5, r4, r3, 433, A1Z);
                    this.A02 = A1Z;
                }
            }
        }
    }

    public final void D7O(C267324bN r1, List list) {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
    }

    public final void Dxg(C267324bN r1, int i) {
    }

    public final void Dxi(C267324bN r1, int i) {
    }

    public final void DxZ(C267324bN r1, int i, int i2) {
    }

    public final void Dzr(C267324bN r1, JRO jro, boolean z) {
    }

    public final void DaS(C267324bN r1, int i, int i2, boolean z) {
    }

    public final void Dxl(C267324bN r1, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
    }
}
