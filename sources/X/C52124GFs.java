package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.GFs  reason: case insensitive filesystem */
public final class C52124GFs {
    public static final C52124GFs A00 = new Object();
    public static final C283255Gu A01 = new C283255Gu((Integer) null, new int[]{R.dimen.abc_edit_text_inset_top_material, R.dimen.abc_edit_text_inset_top_material, R.dimen.abc_edit_text_inset_top_material, R.dimen.abc_edit_text_inset_top_material}, R.color.grey_9_95_transparent, R.color.design_dark_default_color_on_background, R.dimen.abc_text_size_menu_header_material, R.drawable.tooltip_shadow);

    public static final boolean A00(DU9 du9, C267324bN r5, UserSession userSession) {
        if (du9 == null || !du9.CSO() || !r5.A0E() || !182.A06(0Tu.A05, userSession, 36319488995564991L)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(DU9 du9, C267324bN r5, UserSession userSession) {
        boolean A06;
        1Xj r0;
        1Xj r02;
        if (182.A06(0Tu.A06, userSession, 36325119697760881L)) {
            if (du9 == null || !du9.CSO() || !r5.CcK() || (r0 = r5.A02) == null || r0.A5H() || (r02 = r5.A02) == null || !r02.A5p()) {
                return false;
            }
            C257853y4 r03 = r5.A06().A0I;
            if (r03 != null && r03.BUi() != null) {
                return false;
            }
            A06 = r5.A06().A08();
        } else if (du9 == null || !du9.CSO() || !r5.CcK()) {
            return false;
        } else {
            A06 = r5.A06().A06();
        }
        if (A06) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0318, code lost:
        if (r4 <= (r0 * 0.75d)) goto L_0x031a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        if (r0 == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r1.getVisibility() == 0) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.app.Activity r38, android.graphics.PointF r39, android.view.View r40, com.instagram.api.schemas.ReelsMediaInteractivityType r41, X.DU9 r42, X.C267324bN r43, X.AnonymousClass0iw r44, com.instagram.common.session.UserSession r45, X.AnonymousClass3W1 r46, X.AnonymousClass3OA r47, X.S6e r48, X.C55571Hjr r49, X.C52046GCs r50, java.lang.String r51, X.C62320sa r52, boolean r53, boolean r54) {
        /*
            r37 = this;
            r2 = r44
            r11 = 0
            r31 = r50
            r14 = r43
            r0 = r31
            X.AnonymousClass7TF.A1F(r14, r11, r0)
            r0 = 10
            r12 = r46
            X.0qQ.A0B(r12, r0)
            r22 = r38
            r3 = r45
            r36 = r49
            r1 = r36
            r0 = r22
            X.C51974G9v.A1R(r3, r2, r1, r0)
            r23 = r40
            android.content.Context r8 = r23.getContext()
            boolean r0 = r2 instanceof X.AnonymousClass4DU
            r19 = 0
            if (r0 == 0) goto L_0x0038
            X.0qQ.A0A(r8)
            X.4DU r2 = (X.AnonymousClass4DU) r2
            X.GCc r19 = new X.GCc
            r0 = r19
            r0.<init>(r8, r3, r2)
        L_0x0038:
            r34 = r41
            if (r54 == 0) goto L_0x004b
            com.instagram.api.schemas.ReelsMediaInteractivityType r1 = com.instagram.api.schemas.ReelsMediaInteractivityType.LONG_PRESS_RELEASE
            r0 = r34
            if (r0 != r1) goto L_0x004b
            r35 = 1
            boolean r0 = r12.A2f
            if (r0 == 0) goto L_0x004d
            r12.A2f = r11
        L_0x004a:
            return
        L_0x004b:
            r35 = 0
        L_0x004d:
            boolean r0 = r12.A2g
            if (r0 == 0) goto L_0x0054
            r12.A2g = r11
            return
        L_0x0054:
            r1 = r39
            float r0 = r1.x
            int r0 = (int) r0
            r33 = r0
            float r0 = r1.y
            int r7 = (int) r0
            X.0Tu r6 = X.0Tu.A06
            r0 = 36326966533568612(0x810f2f00003864, double:3.03665814055746E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x0074
            boolean r0 = X.C51968G9o.A1V(r14)
            r1 = 2131430235(0x7f0b0b5b, float:1.8482165E38)
            if (r0 != 0) goto L_0x0077
        L_0x0074:
            r1 = 2131430222(0x7f0b0b4e, float:1.8482139E38)
        L_0x0077:
            X.0qQ.A0A(r8)
            android.app.Activity r0 = X.C61270mF.A01(r8)
            if (r0 == 0) goto L_0x0086
            android.view.View r1 = r0.findViewById(r1)
            if (r1 != 0) goto L_0x0088
        L_0x0086:
            r1 = r23
        L_0x0088:
            if (r53 == 0) goto L_0x0092
            int r0 = r1.getVisibility()
            r21 = r23
            if (r0 != 0) goto L_0x0094
        L_0x0092:
            r21 = r1
        L_0x0094:
            r0 = 36325119698088564(0x810d8100073274, double:3.035490194363268E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            r20 = r42
            if (r0 == 0) goto L_0x02d9
            r0 = r20
            boolean r0 = A01(r0, r14, r3)
            if (r0 != 0) goto L_0x02d9
            r0 = 36606594674726343(0x820d81000615c7, double:3.213496102997757E-306)
            int r9 = X.DbS.A04(r6, r3, r0)
        L_0x00b2:
            int r13 = X.C61380mr.A01(r8, r9)
        L_0x00b6:
            int r2 = r21.getHeight()
            int r5 = r7 - r13
            if (r5 >= r11) goto L_0x00bf
            r5 = 0
        L_0x00bf:
            if (r53 == 0) goto L_0x00da
            X.1Xj r0 = r14.A02
            r1 = 1
            if (r0 == 0) goto L_0x0263
            boolean r0 = r0.A5p()
            if (r0 != r1) goto L_0x0263
            X.3OA r0 = r14.A06()
            X.3y4 r0 = r0.A0I
            if (r0 == 0) goto L_0x00da
            X.XB5 r0 = r0.BUi()
            if (r0 != 0) goto L_0x0263
        L_0x00da:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            X.2fy r0 = X.C226262fy.ABOVE_ANCHOR
        L_0x00e0:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)
        L_0x00e4:
            int r13 = X.C51970G9q.A0B(r0)
            java.lang.Object r4 = r0.A01
            X.2fy r4 = (X.C226262fy) r4
            float r2 = (float) r13
            float r1 = X.AnonymousClass7TE.A03(r21)
            r0 = 1060320051(0x3f333333, float:0.7)
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x004a
            if (r42 == 0) goto L_0x0260
            java.lang.String r10 = r20.AyF()
        L_0x00ff:
            java.lang.String r9 = ""
            if (r10 != 0) goto L_0x0104
            r10 = r9
        L_0x0104:
            X.3OA r0 = r14.A06()
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x025c
            android.app.Activity r1 = X.C61270mF.A01(r8)
            if (r1 == 0) goto L_0x0259
            r0 = 2131430322(0x7f0b0bb2, float:1.8482342E38)
            android.view.View r2 = r1.findViewById(r0)
        L_0x011b:
            if (r53 == 0) goto L_0x0239
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0239
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L_0x0123:
            X.Hle r15 = new X.Hle
            r15.<init>()
            boolean r0 = r14.CcK()
            if (r0 == 0) goto L_0x0225
            X.0Tu r5 = X.0Tu.A05
            r0 = 36326240684291733(0x810e8600033695, double:3.0361991105520015E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 == 0) goto L_0x0225
            if (r51 == 0) goto L_0x013f
            r9 = r51
        L_0x013f:
            X.UuR r5 = new X.UuR
            r5.<init>(r9, r10)
        L_0x0144:
            r0 = 36325119698154101(0x810d8100083275, double:3.035490194404714E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x0221
            X.3OA r0 = r14.A06()
            java.lang.String r0 = r0.A0b
            if (r0 == 0) goto L_0x021d
            int r0 = android.graphics.Color.parseColor(r0)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r0)
        L_0x015f:
            r27 = 2131100293(0x7f060285, float:1.7812963E38)
            r28 = 2131100036(0x7f060184, float:1.7812442E38)
            r29 = 2131165216(0x7f070020, float:1.7944643E38)
            r30 = 2131240190(0x7f0824fe, float:1.8096708E38)
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            int[] r26 = new int[]{r0, r0, r0, r0}
            X.5Gu r0 = new X.5Gu
            r24 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30)
        L_0x0179:
            X.5Gt r9 = new X.5Gt
            r9.<init>(r8, r2, r5)
            X.9UE r5 = new X.9UE
            r2 = r21
            r1 = r33
            r5.<init>(r2, r1, r13, r11)
            r9.A05(r5)
            r2 = 1
            r9.A0A = r2
            X.2fy r5 = X.C226262fy.ABOVE_ANCHOR
            if (r4 != r5) goto L_0x01a1
            int r4 = X.AnonymousClass3D4.A00(r8)
            r1 = 1117519872(0x429c0000, float:78.0)
            float r1 = X.C61380mr.A00(r8, r1)
            int r1 = (int) r1
            int r4 = r4 + r1
            if (r13 > r4) goto L_0x021b
            X.2fy r4 = X.C226262fy.BELOW_ANCHOR
        L_0x01a1:
            r9.A06(r4)
            X.HBm r1 = new X.HBm
            r32 = r52
            r28 = r47
            r29 = r48
            r24 = r34
            r25 = r19
            r26 = r14
            r27 = r12
            r30 = r15
            r34 = r7
            r21 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r9.A04 = r1
            r9.A07(r0)
            r9.A08(r0)
            r9.A0B = r11
            if (r35 == 0) goto L_0x01f1
            X.1Xj r0 = r14.A02
            if (r0 == 0) goto L_0x01f1
            boolean r0 = r0.A5p()
            if (r0 != 0) goto L_0x01f1
            r0 = 36325119698285175(0x810d81000a3277, double:3.035490194487606E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x020c
            r9.A0B = r2
            r0 = 5000(0x1388, float:7.006E-42)
        L_0x01e2:
            r9.A00 = r0
        L_0x01e4:
            r0 = 36325119698350712(0x810d81000b3278, double:3.035490194529052E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x01f1
            r9.A0G = r2
        L_0x01f1:
            X.5Gv r3 = r9.A00()
            r0 = r36
            r0.A00 = r3
            if (r35 == 0) goto L_0x0209
            r12.A2f = r2
        L_0x01fd:
            X.0JR r0 = r15.A01
            long r0 = r0.now()
            r15.A00 = r0
            r3.A06()
            return
        L_0x0209:
            r12.A2g = r2
            goto L_0x01fd
        L_0x020c:
            if (r42 == 0) goto L_0x01e4
            java.lang.Integer r0 = r20.AzJ()
            if (r0 == 0) goto L_0x01e4
            int r0 = r0.intValue()
            r9.A0B = r2
            goto L_0x01e2
        L_0x021b:
            r4 = r5
            goto L_0x01a1
        L_0x021d:
            r25 = 0
            goto L_0x015f
        L_0x0221:
            X.5Gu r0 = A01
            goto L_0x0179
        L_0x0225:
            if (r51 == 0) goto L_0x0229
            r9 = r51
        L_0x0229:
            r0 = 36325119698154101(0x810d8100083275, double:3.035490194404714E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r6, r3, r0)
            X.UuS r5 = new X.UuS
            r5.<init>(r0, r9, r10)
            goto L_0x0144
        L_0x0239:
            android.app.Activity r0 = X.C61270mF.A01(r8)
            if (r0 == 0) goto L_0x0257
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x0257
            android.view.View r2 = r0.getDecorView()
        L_0x0249:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0251
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L_0x0123
        L_0x0251:
            android.view.ViewGroup r2 = X.C3019160o.A01(r23)
            goto L_0x0123
        L_0x0257:
            r2 = 0
            goto L_0x0249
        L_0x0259:
            r2 = 0
            goto L_0x011b
        L_0x025c:
            r2 = r21
            goto L_0x011b
        L_0x0260:
            r10 = 0
            goto L_0x00ff
        L_0x0263:
            int r4 = r2 / 2
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165209(0x7f070019, float:1.7944629E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r2 = r0 / 2
            r0 = 8
            int r10 = X.C61380mr.A01(r8, r0)
            r0 = 36325119698088564(0x810d8100073274, double:3.035490194363268E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            r9 = 1117519872(0x429c0000, float:78.0)
            if (r0 == 0) goto L_0x028c
            int r4 = r4 - r2
            if (r5 < r4) goto L_0x02ac
            int r5 = r4 - r10
            goto L_0x00da
        L_0x028c:
            r0 = 36325119698219638(0x810d8100093276, double:3.03549019444616E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x02bb
            if (r7 < r4) goto L_0x02ac
            int r4 = r4 + r2
            r0 = 64
            int r0 = X.C61380mr.A01(r8, r0)
            int r0 = r0 + r4
            if (r7 >= r0) goto L_0x02ac
            int r4 = r4 + r10
        L_0x02a4:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            X.2fy r0 = X.C226262fy.BELOW_ANCHOR
            goto L_0x00e0
        L_0x02ac:
            int r1 = X.AnonymousClass3D4.A00(r8)
            float r0 = X.C61380mr.A00(r8, r9)
            int r0 = (int) r0
            int r1 = r1 + r0
            if (r5 > r1) goto L_0x00da
            int r4 = r7 + r13
            goto L_0x02a4
        L_0x02bb:
            if (r4 > r7) goto L_0x02c6
            int r1 = r4 + r2
            int r0 = r1 + r13
            if (r7 > r0) goto L_0x02c6
            int r4 = r1 + r10
            goto L_0x02a4
        L_0x02c6:
            int r0 = r4 - r2
            if (r0 > r7) goto L_0x00da
            if (r7 >= r4) goto L_0x00da
            int r0 = r0 - r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.2fy r0 = X.C226262fy.ABOVE_ANCHOR
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)
            goto L_0x00e4
        L_0x02d9:
            r0 = 36325119698219638(0x810d8100093276, double:3.03549019444616E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            r2 = 16
            if (r0 == 0) goto L_0x031a
            r0 = r20
            boolean r0 = A01(r0, r14, r3)
            if (r0 != 0) goto L_0x031a
            int r0 = r21.getHeight()
            double r4 = (double) r7
            double r0 = (double) r0
            r15 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r15 = r15 * r0
            r9 = 48
            int r10 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x00b2
            r17 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r10 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x030d
            double r15 = r0 * r17
            int r10 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r10 > 0) goto L_0x030d
            r9 = 32
            goto L_0x00b2
        L_0x030d:
            double r17 = r17 * r0
            int r10 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r10 <= 0) goto L_0x00b2
            r15 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r0 = r0 * r15
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00b2
        L_0x031a:
            int r13 = X.C61380mr.A01(r8, r2)
            goto L_0x00b6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52124GFs.A02(android.app.Activity, android.graphics.PointF, android.view.View, com.instagram.api.schemas.ReelsMediaInteractivityType, X.DU9, X.4bN, X.0iw, com.instagram.common.session.UserSession, X.3W1, X.3OA, X.S6e, X.Hjr, X.GCs, java.lang.String, X.0sa, boolean, boolean):void");
    }
}
