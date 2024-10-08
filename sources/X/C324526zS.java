package X;

import android.view.View;

/* renamed from: X.6zS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C324526zS implements View.OnClickListener {
    public final /* synthetic */ C323366xN A00;

    public /* synthetic */ C324526zS(C323366xN r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02cd, code lost:
        if (X.182.A06(r3, r14, 36315799618588208L) == false) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02f3, code lost:
        if (X.C319886rO.A02(r14) == false) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0310, code lost:
        if (X.182.A06(r3, r14, 36322353739212894L) == false) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0322, code lost:
        if (X.C318996ps.A00().A05(r14) == false) goto L_0x0324;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r33) {
        /*
            r32 = this;
            r0 = r32
            X.6xN r0 = r0.A00
            X.6xL r2 = r0.A0H
            com.instagram.profile.fragment.UserDetailFragment r0 = r2.A07
            boolean r8 = r0.A15()
            if (r8 == 0) goto L_0x005b
            com.instagram.common.session.UserSession r11 = r2.A02
            X.0Tu r5 = X.0Tu.A05
            r3 = 36316564124275190(0x8105b9001711f6, double:3.03007961503316E-306)
            boolean r1 = X.182.A06(r5, r11, r3)
            if (r1 == 0) goto L_0x002f
            X.6nu r9 = X.C317816nt.A00(r11)
            android.content.Context r10 = r0.requireContext()
            r12 = 0
            r15 = 1
            r16 = 0
            java.lang.String r13 = "IG_FB_RIGHT_BEFORE_LOGOUT_SSO_UPSELL"
            r14 = r12
            r9.A09(r10, r11, r12, r13, r14, r15, r16)
        L_0x002f:
            r3 = 36316564124078580(0x8105b9001411f4, double:3.030079614908823E-306)
            boolean r1 = X.182.A06(r5, r11, r3)
            if (r1 == 0) goto L_0x005b
            r3 = 36879514077954327(0x8305b9001b0117, double:3.386091432557362E-306)
            java.lang.String r3 = X.182.A04(r5, r11, r3)
            java.lang.String r1 = "user_detail_delegate"
            boolean r1 = X.0qQ.A0K(r3, r1)
            if (r1 == 0) goto L_0x005b
            r3 = 36316564124471801(0x8105b9001a11f9, double:3.0300796151574976E-306)
            boolean r3 = X.182.A06(r5, r11, r3)
            X.6nu r1 = X.C317816nt.A00(r11)
            r1.A0A(r3)
        L_0x005b:
            com.instagram.common.session.UserSession r14 = r2.A02
            r6 = 0
            r1 = 0
            r7 = 1
            X.AnonymousClass37B.A01(r14, r7)
            if (r8 == 0) goto L_0x0354
            X.DcA r8 = r2.A06
            if (r8 == 0) goto L_0x020a
            androidx.fragment.app.FragmentActivity r5 = r8.getActivity()
            if (r5 == 0) goto L_0x0093
            java.util.List r4 = r8.A00
            if (r4 == 0) goto L_0x0080
            X.0eM r3 = r8.A03
            java.lang.Object r3 = r3.getValue()
            X.E3T r3 = (X.E3T) r3
            X.5Oz r3 = r3.A03
            r3.Epw(r4)
        L_0x0080:
            X.0eM r3 = r8.A03
            java.lang.Object r4 = r3.getValue()
            X.E3T r4 = (X.E3T) r4
            X.0eM r3 = r8.A04
            java.lang.Object r3 = r3.getValue()
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            r4.A00(r5, r3)
        L_0x0093:
            X.2aO r3 = X.2aN.A00(r14)
            X.2aT r7 = r3.A00()
            X.2aD r5 = X.2aD.A0c
            X.6xC r15 = r2.A05
            int r3 = r15.A03()
            X.2aX r4 = new X.2aX
            r4.<init>(r5, r1, r3, r3)
            X.2g1 r3 = X.AnonymousClass2g1.PROFILE_PAGE
            X.2fx r8 = X.C226252fx.NUMBERED
            r7.A01(r8, r3, r4)
            X.2aO r3 = X.2aN.A00(r14)
            X.2aV r7 = r3.A01()
            X.2aD r4 = X.2aD.A0b
            int r3 = r15.A03()
            X.2aX r5 = new X.2aX
            r5.<init>(r4, r1, r3, r3)
            X.2g1 r4 = X.AnonymousClass2g1.TOP_NAVIGATION_BAR
            X.0qQ.A0B(r4, r6)
            X.3Jd r3 = new X.3Jd
            r3.<init>(r8, r4, r1, r1)
            r7.A03(r3, r5, r6)
        L_0x00cf:
            X.2aO r1 = X.2aN.A00(r14)
            X.2aT r7 = r1.A00()
            X.2aD r5 = X.2aD.A0F
            int r3 = r15.A02()
            r4 = 0
            X.2aX r1 = new X.2aX
            r1.<init>(r5, r4, r3, r3)
            X.2g1 r8 = X.AnonymousClass2g1.PROFILE_MENU
            X.2fx r10 = X.C226252fx.NUMBERED
            r7.A02(r10, r8, r1)
            X.2aO r1 = X.2aN.A00(r14)
            X.2aV r5 = r1.A01()
            X.2aD r9 = X.2aD.A0b
            int r1 = r15.A02()
            X.2aX r3 = new X.2aX
            r3.<init>(r9, r4, r1, r1)
            X.0qQ.A0B(r8, r6)
            X.2fx r7 = X.C226252fx.LIST_ITEM
            X.3Jd r1 = new X.3Jd
            r1.<init>(r7, r8, r4, r4)
            r5.A02(r1, r3)
            X.3kF r1 = X.C249713kF.A00
            java.lang.Integer r1 = r1.A0Y(r14)
            if (r1 == 0) goto L_0x0207
            int r11 = r1.intValue()
        L_0x0116:
            X.2aO r1 = X.2aN.A00(r14)
            X.2aT r5 = r1.A00()
            X.2aD r3 = X.2aD.A0g
            X.2aX r1 = new X.2aX
            r1.<init>(r3, r4, r11, r11)
            r5.A02(r10, r8, r1)
            X.2aO r1 = X.2aN.A00(r14)
            X.2aV r5 = r1.A01()
            X.2aX r3 = new X.2aX
            r3.<init>(r9, r4, r11, r11)
            X.3Jd r1 = new X.3Jd
            r1.<init>(r7, r8, r4, r4)
            r5.A02(r1, r3)
            X.3kF r5 = X.C249713kF.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            java.lang.String r1 = "profile_menu"
            r5.A1I(r14, r3, r4, r1)
            X.6pf r5 = r2.A04
            if (r5 == 0) goto L_0x0180
            com.instagram.common.session.UserSession r13 = r5.A05
            X.2aO r1 = X.2aN.A00(r13)
            X.2aT r11 = r1.A00()
            X.2aD r12 = X.2aD.A0M
            int r3 = r5.A00
            X.2aX r1 = new X.2aX
            r1.<init>(r12, r3)
            X.2fx r12 = X.C226252fx.DOT
            r11.A02(r12, r8, r1)
            X.2aO r1 = X.2aN.A00(r13)
            X.2aV r11 = r1.A01()
            int r1 = r5.A00
            X.2aX r5 = new X.2aX
            r5.<init>(r9, r1)
            X.2g1 r3 = X.AnonymousClass2g1.TOP_NAVIGATION_BAR
            X.0qQ.A0B(r3, r6)
            X.3Jd r1 = new X.3Jd
            r1.<init>(r12, r3, r4, r4)
            r11.A02(r1, r5)
        L_0x0180:
            boolean r1 = r15.A03
            if (r1 == 0) goto L_0x01ab
            X.2aO r1 = X.2aN.A00(r14)
            X.2aT r5 = r1.A00()
            X.2aD r3 = X.2aD.A0L
            X.2aX r1 = new X.2aX
            r1.<init>(r3, r4, r6, r6)
            r5.A02(r10, r8, r1)
            X.2aO r1 = X.2aN.A00(r14)
            X.2aV r5 = r1.A01()
            X.2aX r3 = new X.2aX
            r3.<init>(r9, r4, r6, r6)
            X.3Jd r1 = new X.3Jd
            r1.<init>(r7, r8, r4, r4)
            r5.A02(r1, r3)
        L_0x01ab:
            boolean r1 = r15.A02
            if (r1 == 0) goto L_0x01cc
            X.0wc r5 = r2.A01
            java.lang.String r3 = "discover_people_entry_point_displayed"
            X.0kJ r1 = r5.A00
            X.0Aj r5 = r5.A00(r1, r3)
            java.lang.String r3 = "side_tray"
            java.lang.String r1 = "view_module"
            r5.AAJ(r1, r3)
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "module"
            r5.AAJ(r0, r1)
            r5.Cgf()
        L_0x01cc:
            boolean r0 = r15.A04
            if (r0 == 0) goto L_0x01e5
            X.0wc r3 = X.AnonymousClass0kN.A01(r4, r14)
            java.lang.String r1 = "ig_native_meta_verified_profile_menu_impression"
            X.0kJ r0 = r3.A00
            X.0Aj r1 = r3.A00(r0, r1)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x01e5
            r1.Cgf()
        L_0x01e5:
            boolean r0 = r15.A01
            if (r0 == 0) goto L_0x0203
            X.4DU r3 = r2.A03
            X.Dc6 r0 = r2.A08
            com.instagram.user.model.User r0 = r0.A03
            if (r0 == 0) goto L_0x0204
            java.lang.String r0 = r0.getId()
        L_0x01f5:
            androidx.fragment.app.FragmentActivity r1 = r2.A00
            boolean r7 = X.0oI.A0A(r1)
            java.lang.String r5 = "settings"
            r2 = r3
            r3 = r14
            r6 = r0
            X.C321406u6.A04(r2, r3, r4, r5, r6, r7)
        L_0x0203:
            return
        L_0x0204:
            java.lang.String r0 = r14.A06
            goto L_0x01f5
        L_0x0207:
            r11 = 0
            goto L_0x0116
        L_0x020a:
            X.0Tu r3 = X.0Tu.A05
            r4 = 2342163236943700083(0x2081090e00022073, double:4.0657789759647865E-152)
            boolean r4 = X.182.A06(r3, r14, r4)
            if (r4 == 0) goto L_0x0228
            r4 = 36324526992339079(0x810cf700033087, double:3.0351153648606595E-306)
            boolean r3 = X.182.A06(r3, r14, r4)
            androidx.fragment.app.FragmentActivity r0 = r2.A00
            if (r3 == 0) goto L_0x0512
            X.FCS.A01(r14, r0)
            return
        L_0x0228:
            X.6rY r15 = X.C319986rY.SELF
            X.Dc6 r4 = r2.A08
            com.instagram.user.model.User r4 = r4.A03
            if (r4 == 0) goto L_0x0234
            java.lang.String r1 = r4.getId()
        L_0x0234:
            java.lang.String r5 = r2.A0A
            java.lang.String r4 = r2.A0B
            java.lang.String r16 = "tap_settings"
            java.lang.String r20 = "user_profile_header"
            r13 = r0
            r17 = r1
            r18 = r5
            r19 = r4
            X.C319976rX.A08(r13, r14, r15, r16, r17, r18, r19, r20)
            X.E3T r8 = X.C49079Eox.A00(r14)
            android.content.Context r4 = r0.requireContext()
            X.6xC r15 = r2.A05
            X.0t1 r1 = X.0eE.A00(r14)
            com.instagram.user.model.User r1 = r1.A00()
            boolean r1 = r1.A1P()
            if (r1 == 0) goto L_0x0350
            java.lang.Integer r18 = X.AnonymousClass05K.A0Y
        L_0x0260:
            boolean r1 = X.0oI.A0C(r4)
            if (r1 != 0) goto L_0x034c
            java.lang.Integer r16 = X.AnonymousClass05K.A00
        L_0x0268:
            r13 = r14
            r4 = 36311835363771167(0x81016c0000031f, double:3.027089127849226E-306)
            boolean r1 = X.182.A06(r3, r14, r4)
            if (r1 != 0) goto L_0x0275
            r13 = 0
        L_0x0275:
            X.Ddd r1 = X.C46361Ddd.A00(r14)
            boolean r1 = r1.A0F
            if (r1 == 0) goto L_0x0336
            java.lang.Integer r17 = X.AnonymousClass05K.A01
        L_0x027f:
            boolean r25 = X.AnonymousClass37B.A01(r14, r6)
            X.0Tu r1 = X.0Tu.A06
            r4 = 36313888359188757(0x81034a00100915, double:3.0283874504180586E-306)
            boolean r23 = X.182.A06(r1, r14, r4)
            r4 = 36313544760756311(0x8102fa00000857, double:3.02817015738582E-306)
            boolean r26 = X.182.A06(r3, r14, r4)
            r4 = 36312363644748852(0x8101e700000434, double:3.0274232148667305E-306)
            boolean r1 = X.182.A06(r1, r14, r4)
            r21 = r1 ^ 1
            r4 = 36312513968604306(0x81020a00000492, double:3.027518280278225E-306)
            boolean r22 = X.182.A06(r3, r14, r4)
            r4 = 36311350032466429(0x8100fb000001fd, double:3.026782202377837E-306)
            boolean r30 = X.182.A06(r3, r14, r4)
            X.0t1 r1 = X.0eE.A00(r14)
            com.instagram.user.model.User r1 = r1.A00()
            boolean r1 = r1.A2L()
            if (r1 != 0) goto L_0x02cf
            r4 = 36315799618588208(0x81050700000e30, double:3.0295961385582953E-306)
            boolean r1 = X.182.A06(r3, r14, r4)
            r20 = 1
            if (r1 != 0) goto L_0x02d1
        L_0x02cf:
            r20 = 0
        L_0x02d1:
            r4 = 36314893380488054(0x81043400000b76, double:3.02902302993463E-306)
            boolean r24 = X.182.A06(r3, r14, r4)
            boolean r29 = X.C319116q4.A08(r14, r7)
            r4 = 36321627889346151(0x810a5400022667, double:3.033281960454181E-306)
            boolean r27 = X.182.A06(r3, r14, r4)
            boolean r1 = X.C319886rO.A03(r14)
            if (r1 != 0) goto L_0x02f5
            boolean r1 = X.C319886rO.A02(r14)
            r19 = 1
            if (r1 != 0) goto L_0x02f7
        L_0x02f5:
            r19 = 0
        L_0x02f7:
            X.C65001Zz.A00()
            r4 = 36322353738688598(0x810afd00002856, double:3.033740990501105E-306)
            boolean r1 = X.182.A06(r3, r14, r4)
            if (r1 == 0) goto L_0x0312
            r4 = 36322353739212894(0x810afd0008285e, double:3.033740990832672E-306)
            boolean r1 = X.182.A06(r3, r14, r4)
            r31 = 1
            if (r1 != 0) goto L_0x0314
        L_0x0312:
            r31 = 0
        L_0x0314:
            X.1q7 r1 = X.1q7.A03
            if (r1 == 0) goto L_0x0324
            X.1q7 r1 = X.C318996ps.A00()
            boolean r1 = r1.A05(r14)
            r28 = 1
            if (r1 != 0) goto L_0x0326
        L_0x0324:
            r28 = 0
        L_0x0326:
            java.util.List r3 = X.C319136q6.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.5Oz r1 = r8.A03
            r1.Epw(r3)
            androidx.fragment.app.FragmentActivity r1 = r2.A00
            r8.A00(r1, r14)
            goto L_0x00cf
        L_0x0336:
            X.0t1 r1 = X.0eE.A00(r14)
            com.instagram.user.model.User r1 = r1.A00()
            boolean r1 = r1.A1W()
            if (r1 == 0) goto L_0x0348
            java.lang.Integer r17 = X.AnonymousClass05K.A0N
            goto L_0x027f
        L_0x0348:
            java.lang.Integer r17 = X.AnonymousClass05K.A00
            goto L_0x027f
        L_0x034c:
            java.lang.Integer r16 = X.AnonymousClass05K.A01
            goto L_0x0268
        L_0x0350:
            java.lang.Integer r18 = X.AnonymousClass05K.A00
            goto L_0x0260
        L_0x0354:
            X.6xN r2 = r0.A11
            android.view.View r9 = r2.A01
            X.Dc6 r2 = r0.A10
            com.instagram.user.model.User r8 = r2.A03
            if (r8 == 0) goto L_0x0203
            boolean r2 = r9 instanceof com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton
            r11 = 0
            if (r2 == 0) goto L_0x03be
            com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton r9 = (com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton) r9
            int r2 = r9.getDisplayedChild()
            if (r2 != r7) goto L_0x03be
            com.instagram.common.session.UserSession r12 = r0.A0I
            X.6x7 r1 = r0.A0x
            X.710 r10 = r1.BhL()
            X.6x7 r1 = r0.A0x
            X.0eM r1 = r1.A0V
            java.lang.Object r5 = r1.getValue()
            X.6xL r5 = (X.C323346xL) r5
            X.1Xl r1 = r0.A0M
            if (r1 == 0) goto L_0x0385
            X.1Xj r11 = r1.BPf()
        L_0x0385:
            com.instagram.profile.intf.UserDetailLaunchConfig r1 = r0.A1E
            java.lang.String r4 = r1.A0C
            java.lang.String r3 = r1.A0A
            com.instagram.profile.intf.UserDetailEntryInfo r2 = r1.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            r9.A08 = r8
            r9.A03 = r12
            r9.A07 = r10
            r9.A06 = r5
            r9.A04 = r11
            r9.A09 = r4
            r9.A0A = r3
            r9.A05 = r2
            r9.A0B = r7
            com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton.A03(r9)
            X.Wnb r3 = new X.Wnb
            r3.<init>(r9, r1)
            r1 = 1500(0x5dc, double:7.41E-321)
            r9.postDelayed(r3, r1)
            X.6xm r2 = r0.A17
            if (r2 == 0) goto L_0x0203
            android.view.View r1 = r0.mView
            android.content.Context r0 = r0.getContext()
            r2.A01(r0, r1, r6)
            return
        L_0x03be:
            X.1YZ r2 = X.1YZ.A02
            if (r2 == 0) goto L_0x03cf
            X.0wc r5 = r0.A0F
            java.lang.String r4 = r8.getId()
            java.lang.String r3 = "click"
            java.lang.String r2 = "profile_entry_point"
            X.AnonymousClass73V.A0G(r5, r3, r2, r4)
        L_0x03cf:
            com.instagram.common.session.UserSession r9 = r0.A0I
            r5 = 3
            X.0qQ.A0B(r9, r5)
            java.lang.String r2 = "report_user"
            X.0xI r4 = X.0xI.A00(r0, r2)
            java.lang.String r3 = r9.A06
            java.lang.String r2 = "actor_id"
            r4.A0C(r2, r3)
            java.lang.String r3 = "ACTION_OPEN_USER_OVERFLOW"
            java.lang.String r2 = "action"
            r4.A0C(r2, r3)
            java.lang.String r3 = r8.getId()
            java.lang.String r2 = "target_id"
            r4.A0C(r2, r3)
            X.0xN r2 = X.C60510iO.A00(r9)
            r2.EFq(r4)
            com.instagram.common.session.UserSession r2 = r0.A0I
            X.C48904Em4.A00(r0, r2, r8, r1, r1)
            android.content.Context r2 = r0.getContext()
            if (r2 == 0) goto L_0x0203
            androidx.fragment.app.FragmentActivity r16 = r0.requireActivity()
            android.content.Context r15 = r0.getContext()
            com.instagram.common.session.UserSession r13 = r0.A0I
            X.Dc6 r2 = r0.A10
            com.instagram.user.model.User r12 = r2.A03
            com.instagram.profile.fragment.UserDetailTabController r11 = r0.A0z
            X.6x7 r10 = r0.A0x
            X.07i r9 = r0.A08
            X.0wc r8 = r0.A0F
            X.GSk r2 = r0.A16
            java.lang.String r27 = r2.A00()
            X.1Xl r4 = r0.A0M
            com.instagram.profile.intf.UserDetailLaunchConfig r2 = r0.A1E
            java.lang.String r3 = r2.A0K
            if (r4 == 0) goto L_0x050e
            X.1Xj r2 = r4.BPf()
            java.lang.String r29 = r2.getId()
        L_0x0430:
            java.lang.String r30 = r0.A0m()
            X.FV7 r2 = new X.FV7
            r14 = r2
            r17 = r9
            r18 = r0
            r19 = r0
            r20 = r8
            r21 = r13
            r22 = r4
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r0
            r28 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            com.instagram.common.session.UserSession r9 = r0.A0I
            X.0qQ.A0B(r9, r6)
            X.0Tu r8 = X.0Tu.A05
            r3 = 36326803324942310(0x810f09000237e6, double:3.0365549267649985E-306)
            boolean r3 = X.182.A06(r8, r9, r3)
            if (r3 == 0) goto L_0x0533
            java.lang.String r25 = r0.getModuleName()
            com.instagram.common.session.UserSession r10 = r2.A07
            X.Hto r0 = new X.Hto
            r0.<init>(r10)
            java.util.List r3 = r2.A03()
            java.util.List r9 = X.00k.A0a(r3)
            r3 = 36326803325007847(0x810f09000337e7, double:3.0365549268064443E-306)
            boolean r13 = X.182.A06(r8, r10, r3)
            r3 = 36326803325073384(0x810f09000437e8, double:3.03655492684789E-306)
            boolean r12 = X.182.A06(r8, r10, r3)
            java.util.Iterator r11 = r9.iterator()
        L_0x048b:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x0526
            java.lang.Object r8 = r11.next()
            android.util.Pair r8 = (android.util.Pair) r8
            if (r12 == 0) goto L_0x04ac
            java.lang.Object r3 = r8.first
            X.0qQ.A06(r3)
            X.EWQ r3 = (X.EWQ) r3
            int r4 = r3.ordinal()
            r3 = 2
            if (r4 == r3) goto L_0x04e7
            if (r4 == r5) goto L_0x04e7
            r3 = 5
            if (r4 == r3) goto L_0x04e7
        L_0x04ac:
            android.content.Context r9 = r2.A01
            java.lang.Object r3 = r8.second
            java.lang.String r17 = r3.toString()
            java.lang.Object r10 = r8.first
            r4 = r10
            X.EWQ r4 = (X.EWQ) r4
            boolean r3 = r4.A01
            if (r3 != 0) goto L_0x04c3
            if (r12 == 0) goto L_0x04e4
            X.EWQ r3 = X.EWQ.A0D
            if (r10 != r3) goto L_0x04e4
        L_0x04c3:
            r22 = 1
        L_0x04c5:
            if (r13 == 0) goto L_0x04e2
            int r4 = r4.A00
        L_0x04c9:
            X.FNA r3 = new X.FNA
            r3.<init>(r8, r2)
            r19 = 1065353216(0x3f800000, float:1.0)
            r14 = r0
            r15 = r9
            r16 = r3
            r18 = r1
            r20 = r4
            r21 = r6
            r23 = r6
            r24 = r7
            r14.A02(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x048b
        L_0x04e2:
            r4 = -1
            goto L_0x04c9
        L_0x04e4:
            r22 = 0
            goto L_0x04c5
        L_0x04e7:
            android.content.Context r9 = r2.A01
            java.lang.Object r3 = r8.second
            java.lang.String r26 = r3.toString()
            if (r13 == 0) goto L_0x050c
            java.lang.Object r3 = r8.first
            X.EWQ r3 = (X.EWQ) r3
            int r4 = r3.A00
        L_0x04f7:
            r27 = 1065353216(0x3f800000, float:1.0)
            X.EHd r3 = new X.EHd
            r3.<init>(r8, r2)
            r22 = r0
            r23 = r9
            r24 = r3
            r28 = r4
            r29 = r6
            r22.A04(r23, r24, r25, r26, r27, r28, r29)
            goto L_0x048b
        L_0x050c:
            r4 = -1
            goto L_0x04f7
        L_0x050e:
            r29 = 0
            goto L_0x0430
        L_0x0512:
            X.6Yo r2 = new X.6Yo
            r2.<init>(r0, r14)
            r2.A0F = r7
            X.XQw r0 = X.C21251XQw.MAIN_SETTINGS_SCREEN
            X.JaK r0 = X.Eq6.A00(r0, r1)
            r2.A0B(r1, r0)
            r2.A04()
            return
        L_0x0526:
            r0.A03 = r7
            X.Vho r1 = new X.Vho
            r1.<init>(r0)
            android.content.Context r0 = r2.A01
            r1.A00(r0)
            return
        L_0x0533:
            android.content.Context r7 = r2.A01
            com.instagram.common.session.UserSession r9 = r2.A07
            X.Dg1 r6 = new X.Dg1
            r6.<init>(r7, r9)
            java.util.List r0 = r2.A03()
            java.util.List r0 = X.00k.A0a(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x0548:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x057a
            java.lang.Object r1 = r5.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r0 = r1.second
            java.lang.String r4 = r0.toString()
            X.FN9 r3 = new X.FN9
            r3.<init>(r1, r2)
            java.lang.Object r0 = r1.first
            X.EWQ r0 = (X.EWQ) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0576
            r0 = 36324634366390466(0x810d10000130c2, double:3.035183268643117E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 == 0) goto L_0x0576
            r6.A0A(r4, r3)
            goto L_0x0548
        L_0x0576:
            r6.A0C(r4, r3)
            goto L_0x0548
        L_0x057a:
            X.FFy r0 = new X.FFy
            r0.<init>(r6)
            r0.A05(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324526zS.onClick(android.view.View):void");
    }
}
