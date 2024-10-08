package X;

import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.IGPostTriggerExperience;
import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3rV  reason: invalid class name and case insensitive filesystem */
public final class C253843rV {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass311 A02;
    public final AnonymousClass4DU A03;
    public final C2360532g A04;
    public final AnonymousClass2xI A05;
    public final 1Ux A06;
    public final C228232l0 A07;
    public final C249763kK A08;
    public final AnonymousClass2xS A09;
    public final String A0A;
    public final boolean A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r10 = r2.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.view.View r32, X.1Xj r33, X.GQ0 r34, X.AnonymousClass3W1 r35, int r36) {
        /*
            r31 = this;
            r0 = 1
            r3 = r33
            boolean r11 = r3.A5d()
            boolean r1 = r3.A5f()
            if (r1 != 0) goto L_0x0122
            r2 = r31
            boolean r1 = r2.A0B
            if (r1 != 0) goto L_0x0122
            r1 = r35
            boolean r4 = r1.A2G
            if (r4 != 0) goto L_0x0122
            boolean r4 = r3.A5m()
            if (r4 != 0) goto L_0x0122
            r8 = r32
            if (r32 == 0) goto L_0x0079
            androidx.fragment.app.Fragment r10 = r2.A00
            android.content.Context r9 = r10.getContext()
            if (r9 == 0) goto L_0x0079
            boolean r4 = X.C61970qY.A0E(r9)
            if (r4 != 0) goto L_0x0079
            com.instagram.common.session.UserSession r4 = r2.A01
            X.1Av r7 = X.1Au.A00(r4)
            X.0s0 r6 = r7.A4J
            X.0YZ[] r5 = X.1Av.A8a
            r4 = 71
            r4 = r5[r4]
            java.lang.Object r4 = r6.CDM(r7, r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x0079
            X.2xI r7 = r2.A05
            X.4DV r10 = (X.AnonymousClass4DV) r10
            X.3Ar r4 = r10.getScrollingViewProxy()
            android.view.ViewParent r6 = r4.getParent()
            java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r6, r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r4 = 2131968767(0x7f1342ff, float:1.9574438E38)
            java.lang.String r14 = r9.getString(r4)
            X.0qQ.A07(r14)
            r16 = 500(0x1f4, double:2.47E-321)
            r18 = 0
            r5 = 18
            X.9Kz r4 = new X.9Kz
            r4.<init>(r8, r5)
            r12 = r7
            r13 = r6
            r15 = r4
            r12.A00(r13, r14, r15, r16, r18)
        L_0x0079:
            com.instagram.common.session.UserSession r15 = r2.A01
            X.0q2 r4 = X.0q2.A00(r15)
            boolean r7 = r4.A0N(r3)
            X.0Tu r6 = X.0Tu.A05
            r4 = 36322297904179255(0x810af000012837, double:3.033705680532569E-306)
            boolean r10 = X.182.A06(r6, r15, r4)
            r19 = r34
            r5 = r1
            r6 = r19
            r8 = r0
            r9 = r0
            r5.A0J(r6, r7, r8, r9, r10)
            X.2l0 r6 = r2.A07
            X.2v9 r5 = X.C233162v9.LIKE_CLICK
            X.5yf r4 = X.C301155ye.A00()
            r6.DUE(r4, r5, r3, r1)
            X.7kd r6 = X.C340057kd.A00(r15)
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            java.lang.Integer r23 = X.AnonymousClass05K.A01
            r4 = 4727(0x1277, float:6.624E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            X.4DU r8 = r2.A03
            X.A7L r4 = X.C297085r9.A02(r8, r3, r5, r4, r0)
            r6.A01(r4)
            androidx.fragment.app.Fragment r4 = r2.A00
            android.content.Context r13 = r4.requireContext()
            int r9 = r1.A03
            X.3Yl r17 = X.C243363Yl.LIKED
            androidx.fragment.app.FragmentActivity r12 = r4.requireActivity()
            X.3kK r7 = r2.A08
            boolean r6 = r1.A2V
            X.ISn r5 = new X.ISn
            r5.<init>(r2, r3, r1)
            r14 = 0
            r27 = -1
            X.6zg r4 = X.C324636ze.A00(r15)
            com.instagram.search.common.analytics.SearchContext r4 = r4.A00
            r26 = r36
            r21 = r4
            r22 = r7
            r24 = r14
            r25 = r14
            r28 = r9
            r29 = r27
            r30 = r6
            r18 = r3
            r20 = r8
            r16 = r5
            X.C56622I4z.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            int r4 = r1.A03
            boolean r4 = X.1sx.A0Q(r3, r4)
            if (r4 == 0) goto L_0x0122
            if (r11 != 0) goto L_0x0111
            X.32g r2 = r2.A04
            boolean r2 = r2.A03(r3, r1)
            if (r2 == 0) goto L_0x0111
            boolean r2 = r3.CcK()
            if (r2 == 0) goto L_0x0111
            r1.A0e(r0)
            r1.A0m(r0, r0)
        L_0x0111:
            X.C292885jg.A00(r15)
            X.C292905ji.A00(r15, r3, r8, r1)
            r1.A0m(r0, r0)
            r0 = 3499(0xdab, float:4.903E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A1L = r0
        L_0x0122:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C253843rV.A01(android.view.View, X.1Xj, X.GQ0, X.3W1, int):void");
    }

    public C253843rV(Fragment fragment, UserSession userSession, AnonymousClass311 r4, AnonymousClass4DU r5, C2360532g r6, AnonymousClass2xI r7, AnonymousClass2xS r8, 1Ux r9, C228232l0 r10, C249763kK r11, String str, boolean z) {
        0qQ.A0B(r11, 8);
        0qQ.A0B(r6, 10);
        this.A02 = r4;
        this.A01 = userSession;
        this.A00 = fragment;
        this.A03 = r5;
        this.A09 = r8;
        this.A07 = r10;
        this.A0B = z;
        this.A08 = r11;
        this.A0A = str;
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = r9;
    }

    /* JADX WARNING: type inference failed for: r3v24, types: [X.5Gs, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015d, code lost:
        if (r28 == null) goto L_0x015f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01cc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.view.View r23, X.1Xj r24, X.GQ0 r25, X.AnonymousClass3V3 r26, X.AnonymousClass3W1 r27, X.AnonymousClass3VF r28, int r29) {
        /*
            r22 = this;
            r2 = r23
            r13 = 0
            r0 = r22
            X.2l0 r5 = r0.A07
            X.2v9 r3 = X.C233162v9.MEDIA_TAP
            X.5yf r1 = X.C301155ye.A00()
            r15 = r24
            r10 = r27
            r5.DUE(r1, r3, r15, r10)
            java.lang.String r6 = r15.getId()
            if (r6 == 0) goto L_0x025a
            X.1sy r4 = r10.A0o
            X.1sy r3 = X.1sy.A0U
            r1 = r25
            if (r4 == r3) goto L_0x005f
            androidx.fragment.app.Fragment r4 = r0.A00
            android.content.Context r3 = r4.getContext()
            boolean r3 = X.2eO.A00(r3)
            if (r3 == 0) goto L_0x005f
            X.C46447Df9.A03()
            X.F3W r5 = new X.F3W
            r5.<init>()
            r5.A0B = r6
            r2 = 1
            r5.A0K = r2
            r5.A0J = r2
            androidx.fragment.app.FragmentActivity r4 = r4.requireActivity()
            com.instagram.common.session.UserSession r2 = r0.A01
            X.6Yo r3 = new X.6Yo
            r3.<init>(r4, r2)
            X.32F r2 = r5.A01()
            r3.A0D(r2)
            r3.A08()
            java.lang.String r2 = "talkback_feed"
            r3.A0B = r2
            r3.A04()
            java.lang.String r2 = "TAP_TO_SINGLE_MEDIA"
        L_0x005b:
            r0.A02(r15, r1, r2)
        L_0x005e:
            return
        L_0x005f:
            boolean r3 = r15.A5D()
            if (r3 == 0) goto L_0x006e
            int r3 = r10.A03
            X.1Xj r8 = r15.A1c(r3)
        L_0x006b:
            if (r8 != 0) goto L_0x007a
            return
        L_0x006e:
            boolean r3 = r15.A5H()
            if (r3 == 0) goto L_0x0079
            X.1Xj r8 = r15.A1b()
            goto L_0x006b
        L_0x0079:
            r8 = r15
        L_0x007a:
            boolean r3 = r8.CeS()
            if (r3 != 0) goto L_0x00a5
            int r3 = r10.A03
            boolean r3 = X.1sx.A0Q(r15, r3)
            if (r3 == 0) goto L_0x00a5
            X.32g r3 = r0.A04
            boolean r3 = r3.A03(r15, r10)
            if (r3 == 0) goto L_0x0101
            boolean r3 = r15.CcK()
            if (r3 == 0) goto L_0x0101
            boolean r3 = r10.A2B
            if (r3 != 0) goto L_0x0101
            r3 = 1
            r10.A0e(r3)
            r10.A0m(r3, r3)
        L_0x00a1:
            java.lang.String r3 = "tap_media"
            r10.A1L = r3
        L_0x00a5:
            if (r23 == 0) goto L_0x0120
            boolean r3 = X.1sx.A0M(r15, r8)
            if (r3 == 0) goto L_0x0120
            boolean r3 = r10.A2i
            if (r3 != 0) goto L_0x00b5
            boolean r3 = r10.A32
            if (r3 == 0) goto L_0x0120
        L_0x00b5:
            boolean r3 = r10.A20
            if (r3 != 0) goto L_0x0120
            X.3Ds r9 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            r12 = 0
            r3 = r12
            boolean r4 = r15.A5D()
            if (r4 == 0) goto L_0x00c9
            int r3 = r10.A03
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x00c9:
            com.instagram.common.session.UserSession r8 = r0.A01
            X.3Dp r7 = X.C238833Dp.A00(r8)
            X.3Dt r6 = new X.3Dt
            r6.<init>(r3, r9, r12, r12)
            java.lang.String[] r3 = new java.lang.String[r13]
            r4 = 1
            r7.A09(r2, r6, r3, r4)
            X.4DU r3 = r0.A03
            X.3kK r2 = r0.A08
            X.32b r11 = new X.32b
            r16 = r11
            r17 = r8
            r18 = r3
            r19 = r12
            r20 = r5
            r21 = r2
            r16.<init>(r17, r18, r19, r20, r21)
            androidx.fragment.app.Fragment r14 = r0.A00
            X.2EG r17 = X.2EG.A2U
            r13 = r12
            r16 = r10
            r18 = r12
            r11.A00(r12, r13, r14, r15, r16, r17, r18)
            r10.A2i = r4
            java.lang.String r2 = "TAP_TO_AD_DESTINATION"
            goto L_0x005b
        L_0x0101:
            com.instagram.common.session.UserSession r7 = r0.A01
            X.0Tu r6 = X.0Tu.A05
            r3 = 36318642886941018(0x81079d0000195a, double:3.031394232913535E-306)
            boolean r3 = X.182.A06(r6, r7, r3)
            if (r3 == 0) goto L_0x0117
            boolean r3 = X.C243193Xt.A07(r7, r8)
            if (r3 == 0) goto L_0x0117
            goto L_0x00a1
        L_0x0117:
            boolean r3 = r10.A29
            r4 = r3 ^ 1
            r3 = 1
            r10.A0m(r4, r3)
            goto L_0x00a1
        L_0x0120:
            boolean r3 = X.1sx.A0M(r15, r8)
            r11 = r28
            if (r3 == 0) goto L_0x01fb
            if (r28 == 0) goto L_0x01fb
            boolean r3 = r10.A20
            if (r3 == 0) goto L_0x01f7
            boolean r3 = r10.A3H
            if (r3 == 0) goto L_0x01f3
            java.lang.String r3 = "TAP_TO_CLOSE_DWELL_IMAGE_TOOLTIP"
        L_0x0134:
            r0.A02(r15, r1, r3)
            r10.A3H = r13
            r10.A0k = r1
            com.instagram.common.session.UserSession r6 = r0.A01
            X.4DU r9 = r0.A03
            X.311 r3 = r0.A02
            X.30y r3 = (X.C2357230y) r3
            X.0eM r3 = r3.A1c
            java.lang.Object r7 = r3.getValue()
            X.Hkr r7 = (X.C55632Hkr) r7
            java.lang.String r12 = r0.A0A
            androidx.fragment.app.Fragment r3 = r0.A00
            android.content.Context r5 = r3.getContext()
            X.C55012Haj.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0156:
            boolean r3 = X.1sx.A0M(r15, r8)
            if (r3 == 0) goto L_0x015f
            r7 = 1
            if (r28 != 0) goto L_0x0160
        L_0x015f:
            r7 = 0
        L_0x0160:
            if (r23 == 0) goto L_0x005e
            if (r25 == 0) goto L_0x005e
            boolean r3 = r15.A4n()
            if (r3 == 0) goto L_0x005e
            boolean r3 = r8.A5G()
            if (r3 != 0) goto L_0x005e
            com.instagram.common.session.UserSession r6 = r0.A01
            X.0Tu r5 = X.0Tu.A05
            r3 = 36319884133015242(0x8108be00081eca, double:3.032179201928971E-306)
            boolean r3 = X.182.A06(r5, r6, r3)
            if (r3 == 0) goto L_0x005e
            androidx.fragment.app.Fragment r3 = r0.A00
            androidx.fragment.app.FragmentActivity r5 = r3.requireActivity()
            X.PI0 r3 = new X.PI0
            r3.<init>()
            X.5Gt r4 = new X.5Gt
            r4.<init>(r5, r3)
            X.5Gu r3 = X.C283255Gu.A06
            r4.A07(r3)
            X.9pF r3 = new X.9pF
            r3.<init>(r0, r15, r10)
            r4.A04 = r3
            if (r7 == 0) goto L_0x01a3
            boolean r0 = X.C243193Xt.A07(r6, r8)
            if (r0 != 0) goto L_0x01bd
        L_0x01a3:
            boolean r0 = r8.CeS()
            if (r0 != 0) goto L_0x01bd
            r4.A02()
            float r0 = r1.A04
            int r3 = (int) r0
            float r0 = r1.A05
            int r0 = (int) r0
            r4.A04(r2, r3, r0, r13)
        L_0x01b5:
            X.5Gv r0 = r4.A00()
            r0.A06()
            return
        L_0x01bd:
            boolean r0 = r15.A5D()
            if (r0 != 0) goto L_0x01dd
            r0 = 2131443086(0x7f0b3d8e, float:1.850823E38)
            android.view.View r1 = r2.findViewById(r0)
            if (r1 == 0) goto L_0x005e
        L_0x01cc:
            r0 = 2131434669(0x7f0b1cad, float:1.8491158E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.0qQ.A07(r0)
            r4.A03(r0)
            r4.A01()
            goto L_0x01b5
        L_0x01dd:
            r0 = 2131429688(0x7f0b0938, float:1.8481056E38)
            android.view.View r1 = r2.findViewById(r0)
            if (r1 != 0) goto L_0x01cc
            android.view.ViewParent r2 = r2.getParent()
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L_0x005e
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x005e
            goto L_0x01dd
        L_0x01f3:
            java.lang.String r3 = "TAP_TO_CLOSE_IMAGE_TOOLTIP"
            goto L_0x0134
        L_0x01f7:
            java.lang.String r3 = "TAP_TO_OPEN_IMAGE_TOOLTIP"
            goto L_0x0134
        L_0x01fb:
            boolean r4 = r8.CeS()
            r3 = 0
            if (r4 == 0) goto L_0x0255
            r16 = r26
            if (r26 == 0) goto L_0x0255
            boolean r4 = r15.CcK()
            if (r4 == 0) goto L_0x0237
            com.instagram.common.session.UserSession r6 = r0.A01
            X.4DU r3 = r0.A03
            java.lang.String r5 = r3.getModuleName()
            r7 = 1
            r3 = 2
            X.0qQ.A0B(r5, r3)
            X.1Xy r3 = r15.A0C
            X.3lZ r3 = r3.getInjected()
            if (r3 == 0) goto L_0x024c
            X.3tc r3 = r3.BF5()
            if (r3 == 0) goto L_0x024c
            java.lang.Boolean r4 = r3.Cd2()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            boolean r3 = X.0qQ.A0K(r4, r3)
            if (r3 == 0) goto L_0x024c
            java.lang.String r3 = "TAP_TO_WATCH_AND_BROWSE_TALL_VIDEO_ON_REELS_VIEWER_WITH_CHAINING"
        L_0x0237:
            r0.A02(r15, r1, r3)
            X.2xS r4 = r0.A09
            X.311 r3 = r0.A02
            X.4Gh r18 = r3.BR1()
            r19 = r29
            r14 = r4
            r17 = r10
            r14.A08(r15, r16, r17, r18, r19)
            goto L_0x0156
        L_0x024c:
            X.4Jz r3 = X.C263264Jy.A00(r6, r15, r5, r13)
            java.lang.String r3 = r3.name()
            goto L_0x0237
        L_0x0255:
            r0.A02(r15, r1, r3)
            goto L_0x0156
        L_0x025a:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C253843rV.A00(android.view.View, X.1Xj, X.GQ0, X.3V3, X.3W1, X.3VF, int):void");
    }

    public final void A02(1Xj r8, GQ0 gq0, String str) {
        long j;
        Long l;
        ArrayList arrayList;
        C263944Ny r4;
        UserSession userSession = this.A01;
        AnonymousClass4DU r42 = this.A03;
        0wc A012 = AnonymousClass0kN.A01(r42, userSession);
        C254523sc A042 = C254513sb.A04(r8, r42, "media_tap");
        A042.A0G(userSession, r8);
        if (r8.CcK()) {
            Boolean bool = null;
            if (r8.CeS()) {
                bool = Boolean.valueOf(r8.A6P(IGPostTriggerExperience.IG_POST_TRIGGER_EXPERIENCE_FEED_VIDEO_AD_TO_REELS_CHAIN));
            }
            A042.A20 = bool;
            C54989HaM.A00(A012, A042, gq0, str);
            return;
        }
        0Aj A002 = A012.A00(A012.A00, "instagram_organic_media_tap");
        0jB A013 = A042.A01();
        if (A002.isSampled()) {
            Number number = (Number) A013.A01(C271774jZ.A0Z);
            if (number != null) {
                j = number.longValue();
            } else {
                j = 0;
            }
            A002.A9F("a_pk", Long.valueOf(j));
            String str2 = (String) A013.A01(C271774jZ.A2v);
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            A002.AAJ("follow_status", str2);
            0j9 r6 = C271774jZ.A5I;
            String str4 = (String) A013.A01(r6);
            if (str4 != null) {
                str3 = str4;
            }
            A002.AAJ("m_pk", str3);
            A002.AAJ("tracking_token", (String) A013.A01(C271774jZ.A9L));
            0j9 r5 = C271774jZ.A0C;
            A002.A9F("m_t", (Long) A013.A01(r5));
            A002.AAJ("inventory_source", (String) A013.A01(C271774jZ.A3q));
            A002.AAJ("module_name", r42.getModuleName());
            String str5 = (String) A013.A01(r6);
            Long l2 = null;
            if (str5 != null) {
                l = 00y.A0n(10, str5);
            } else {
                l = null;
            }
            A002.A9F("media_id", l);
            A002.A9F("media_author_id", (Long) A013.A01(C271774jZ.A5E));
            A002.AAJ("delivery_flags", (String) A013.A01(C271774jZ.A26));
            A002.A9F("ad_id", (Long) A013.A01(r5));
            A002.AAJ("action", (String) A013.A01(C271774jZ.A00));
            A002.AAJ("carousel_cover_media_id", (String) A013.A01(C271774jZ.A0x));
            A002.AAJ("carousel_media_id", (String) A013.A01(C271774jZ.A10));
            A002.A9F("carousel_starting_media_id", (Long) A013.A01(C271774jZ.A16));
            A002.A9F("carousel_index", (Long) A013.A01(C271774jZ.A0z));
            A002.A9F("carousel_media_id_int", (Long) A013.A01(C271774jZ.A11));
            A002.A9F("carousel_container_media_id", (Long) A013.A01(C271774jZ.A0w));
            A002.A9F("carousel_cover_media_id_int", (Long) A013.A01(C271774jZ.A0y));
            A002.AAJ("ranking_session_id", (String) A013.A01(C271774jZ.A6q));
            A002.A9F("m_ix", (Long) A013.A01(C271774jZ.A3m));
            A002.AAJ("ranking_info_token", (String) A013.A01(C271774jZ.A6p));
            AbstractCollection abstractCollection = (AbstractCollection) A013.A01(C271774jZ.A6j);
            if (abstractCollection != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    String str6 = (String) it.next();
                    0qQ.A0B(str6, 0);
                    Long A0n = 00y.A0n(10, str6);
                    if (A0n != null) {
                        arrayList2.add(A0n);
                    }
                }
                arrayList = 00k.A0U(arrayList2);
            } else {
                arrayList = null;
            }
            A002.AAe("product_ids", arrayList);
            A002.A9F("product_id", (Long) A013.A01(C271774jZ.A6k));
            String str7 = (String) A013.A01(C271774jZ.A5e);
            if (str7 != null) {
                r4 = C263944Ny.A00(str7);
            } else {
                r4 = null;
            }
            A002.AAE(r4, "merchant_id");
            A002.A7p("is_checkout_enabled", (Boolean) A013.A01(C271774jZ.A41));
            A002.AAJ("shopping_session_id", (String) A013.A01(C271774jZ.A80));
            A002.AAJ("topic_cluster_id", (String) A013.A01(C271774jZ.A9D));
            A002.AAJ("topic_cluster_title", (String) A013.A01(C271774jZ.A9F));
            A002.AAJ("topic_cluster_type", (String) A013.A01(C271774jZ.A9G));
            A002.AAJ("topic_cluster_debug_info", (String) A013.A01(C271774jZ.A9C));
            A002.AAJ("chaining_session_id", (String) A013.A01(C271774jZ.A1C));
            A002.A9F("chaining_position", (Long) A013.A01(C271774jZ.A1A));
            A002.A9F("chaining_seed_media_id", (Long) A013.A01(C271774jZ.A3f));
            A002.A9F("chaining_seed_author_id", (Long) A013.A01(C271774jZ.A1B));
            A002.AAJ("hashtag_name", (String) A013.A01(C298085sr.A03));
            A002.A9F("hashtag_id", (Long) A013.A01(C271774jZ.A3O));
            A002.AAJ("hashtag_feed_type", (String) A013.A01(C271774jZ.A3N));
            A002.AAJ("hashtag_follow_status", (String) A013.A01(C298085sr.A01));
            A002.AAJ("radio_type", (String) A013.A01(C271774jZ.A6o));
            A002.AAJ("mezql_token", (String) A013.A01(C271774jZ.A5g));
            A002.AAJ("entity_type", (String) A013.A01(C271774jZ.A2d));
            A002.A9F("entity_id", (Long) A013.A01(C271774jZ.A2Z));
            A002.AAJ("entity_name", (String) A013.A01(C271774jZ.A2a));
            A002.AAJ("entity_page_name", (String) A013.A01(C271774jZ.A2c));
            String str8 = (String) A013.A01(C271774jZ.A2b);
            if (str8 != null) {
                l2 = 00y.A0n(10, str8);
            }
            A002.A9F("entity_page_id", l2);
            A002.AAJ("entity_follow_status", (String) A013.A01(C271774jZ.A2Y));
            A002.AAJ("media_thumbnail_section", (String) A013.A01(C271774jZ.A5X));
            A002.AAJ("collection_id", (String) A013.A01(C271774jZ.A1L));
            A002.AAJ("collection_name", (String) A013.A01(C271774jZ.A1N));
            A002.A7p("is_eof", (Boolean) A013.A01(C271774jZ.A4G));
            A002.A9F("is_dark_mode", (Long) A013.A01(C271774jZ.A4B));
            A002.AAJ("rank_token", (String) A013.A01(C271774jZ.A6r));
            A002.Cgf();
        }
    }
}
