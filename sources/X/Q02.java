package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;

public final class Q02 {
    public final Q03 A00;
    public final C258403yx A01;

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.Q04 A01() {
        /*
            r38 = this;
            r0 = r38
            X.Q03 r4 = r0.A00
            com.instagram.model.reels.Reel r6 = r4.A0M
            X.3OA r8 = r4.A0O
            r11 = 0
            r5 = 1
            if (r6 == 0) goto L_0x00c5
            com.instagram.common.session.UserSession r2 = r4.A10
            java.util.List r0 = r6.A0O(r2)
            X.0qQ.A07(r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x00c5
            X.0Tu r3 = X.0Tu.A06
            r0 = 36312226206581768(0x8101c7000c0408, double:3.0273362984164475E-306)
            boolean r8 = X.182.A06(r3, r2, r0)
            r0 = 36312226206712841(0x8101c7000e0409, double:3.0273362984993386E-306)
            boolean r7 = X.182.A06(r3, r2, r0)
            java.lang.Integer r0 = r4.A0Z
            if (r8 == 0) goto L_0x00c1
            if (r7 == 0) goto L_0x00c1
            if (r0 == 0) goto L_0x00c1
            int r0 = r0.intValue()
            int r0 = r0 + 1
        L_0x003d:
            X.3uh r0 = r6.A0A(r2, r0)
            X.1Xj r3 = r0.A0b
            if (r3 == 0) goto L_0x01b6
            java.lang.String r1 = r4.A0f
            androidx.fragment.app.FragmentActivity r6 = r4.A0z
            r0 = 0
            com.instagram.model.androidlink.AndroidLink r10 = X.AnonymousClass47K.A00(r6, r2, r3, r1, r0)
            if (r8 == 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
            X.47L r0 = X.AnonymousClass47L.AD_DESTINATION_DIRECT_MESSAGE
            java.util.Set r1 = X.JTP.A0y(r0)
            if (r10 == 0) goto L_0x00b8
            X.47L r0 = X.C271714jT.A01(r10)
        L_0x005e:
            boolean r0 = X.00k.A0u(r1, r0)
            if (r0 != 0) goto L_0x00ba
            java.lang.String r0 = r4.A0f
            if (r0 == 0) goto L_0x00ba
            boolean r0 = android.webkit.URLUtil.isValidUrl(r0)
            if (r0 == 0) goto L_0x00ba
            X.47L r0 = X.AnonymousClass47L.AD_DESTINATION_WEB
            int r2 = r0.A00
            java.lang.String r0 = r4.A0f
            com.instagram.model.androidlink.AndroidLinkImpl r10 = new com.instagram.model.androidlink.AndroidLinkImpl
            r1 = r10
            java.lang.Integer r17 = java.lang.Integer.valueOf(r2)
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r18 = r11
            r19 = r11
            r20 = r11
            r21 = r11
            r22 = r11
            r23 = r11
            r24 = r11
            r25 = r11
            r26 = r11
            r27 = r11
            r28 = r11
            r29 = r11
            r30 = r11
            r31 = r11
            r32 = r11
            r33 = r11
            r34 = r11
            r35 = r11
            r36 = r11
            r37 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
        L_0x00ac:
            com.instagram.model.androidlink.AndroidLink r0 = r4.A0L
            if (r0 == 0) goto L_0x00b2
            r10 = r0
            r1 = r0
        L_0x00b2:
            X.Q04 r0 = new X.Q04
            r0.<init>(r3, r10, r1)
            return r0
        L_0x00b8:
            r0 = 0
            goto L_0x005e
        L_0x00ba:
            java.lang.String r0 = r4.A0f
            com.instagram.model.androidlink.AndroidLink r1 = X.AnonymousClass47K.A00(r6, r2, r3, r0, r5)
            goto L_0x00ac
        L_0x00c1:
            int r0 = r4.A0C
            goto L_0x003d
        L_0x00c5:
            r6 = 0
            if (r8 == 0) goto L_0x014f
            X.1Xj r3 = r8.A0K
            boolean r0 = r8.A05()
            r9 = -1
            if (r0 == 0) goto L_0x014c
            int r1 = r4.A09
            if (r1 == r9) goto L_0x014c
            X.3OA r0 = r4.A0O
            androidx.fragment.app.FragmentActivity r7 = r4.A0z
            com.instagram.common.session.UserSession r2 = r4.A10
            com.instagram.model.androidlink.AndroidLink r10 = X.AnonymousClass47K.A02(r7, r2, r0, r1, r6)
            X.3OA r1 = r4.A0O
            int r0 = r4.A09
            com.instagram.model.androidlink.AndroidLink r1 = X.AnonymousClass47K.A02(r7, r2, r1, r0, r5)
        L_0x00e7:
            java.lang.String r7 = r4.A0f
            if (r7 == 0) goto L_0x011a
            java.util.List r0 = r8.A0l
            if (r0 == 0) goto L_0x0103
            com.google.common.collect.ImmutableList r0 = r8.A02(r7)
            androidx.fragment.app.FragmentActivity r2 = r4.A0z
            com.instagram.common.session.UserSession r1 = r4.A10
            com.instagram.model.androidlink.AndroidLink r10 = X.AnonymousClass47K.A03(r2, r1, r0, r6)
            com.google.common.collect.ImmutableList r0 = r8.A02(r7)
            com.instagram.model.androidlink.AndroidLink r1 = X.AnonymousClass47K.A03(r2, r1, r0, r5)
        L_0x0103:
            if (r10 != 0) goto L_0x00ac
            java.util.List r0 = r8.A04()
            androidx.fragment.app.FragmentActivity r2 = r4.A0z
            com.instagram.common.session.UserSession r1 = r4.A10
            com.instagram.model.androidlink.AndroidLink r10 = X.AnonymousClass47K.A01(r2, r1, r3, r0, r6)
            java.util.List r0 = r8.A04()
            com.instagram.model.androidlink.AndroidLink r1 = X.AnonymousClass47K.A01(r2, r1, r3, r0, r5)
            goto L_0x00ac
        L_0x011a:
            boolean r0 = r4.A03()
            if (r0 == 0) goto L_0x0103
            int r1 = r4.A09
            if (r1 != r9) goto L_0x0139
            X.3yN r0 = r8.A05
            if (r0 == 0) goto L_0x012c
            java.util.List r11 = r0.Bw6()
        L_0x012c:
            androidx.fragment.app.FragmentActivity r1 = r4.A0z
            com.instagram.common.session.UserSession r0 = r4.A10
            com.instagram.model.androidlink.AndroidLink r10 = X.AnonymousClass47K.A01(r1, r0, r3, r11, r6)
            com.instagram.model.androidlink.AndroidLink r1 = X.AnonymousClass47K.A01(r1, r0, r3, r11, r5)
            goto L_0x0103
        L_0x0139:
            X.3OA r0 = r4.A0O
            androidx.fragment.app.FragmentActivity r7 = r4.A0z
            com.instagram.common.session.UserSession r2 = r4.A10
            com.instagram.model.androidlink.AndroidLink r10 = X.AnonymousClass47K.A02(r7, r2, r0, r1, r6)
            X.3OA r1 = r4.A0O
            int r0 = r4.A09
            com.instagram.model.androidlink.AndroidLink r1 = X.AnonymousClass47K.A02(r7, r2, r1, r0, r5)
            goto L_0x0103
        L_0x014c:
            r10 = r11
            r1 = r11
            goto L_0x00e7
        L_0x014f:
            X.1Xj r3 = r4.A0J
            if (r3 == 0) goto L_0x01a4
            int r1 = r4.A09
            r0 = -1
            if (r1 == r0) goto L_0x01a4
            X.1Xj r0 = r3.A1c(r1)
            if (r0 == 0) goto L_0x01a4
            boolean r0 = r0.A5S()
            if (r0 != r5) goto L_0x01a4
            X.3W1 r0 = r4.A0K
            if (r0 == 0) goto L_0x01a4
            java.lang.Integer r0 = r0.A1A
            if (r0 == 0) goto L_0x01a4
            int r2 = r0.intValue()
            X.1Xj r1 = r4.A0J
            if (r1 == 0) goto L_0x01a2
            int r0 = r4.A09
            X.1Xj r0 = r1.A1c(r0)
            if (r0 == 0) goto L_0x01a2
            java.util.List r0 = r0.A3Z()
            if (r0 == 0) goto L_0x01a2
            java.lang.Object r0 = X.00k.A0O(r0, r2)
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x01a2
            java.util.List r2 = r0.A3P()
        L_0x018e:
            androidx.fragment.app.FragmentActivity r1 = r4.A0z
            com.instagram.common.session.UserSession r0 = r4.A10
            com.instagram.model.androidlink.AndroidLink r10 = X.AnonymousClass47K.A01(r1, r0, r3, r2, r6)
            com.instagram.model.androidlink.AndroidLink r1 = X.AnonymousClass47K.A01(r1, r0, r3, r2, r5)
            X.3W1 r0 = r4.A0K
            if (r0 == 0) goto L_0x00ac
            r0.A1A = r11
            goto L_0x00ac
        L_0x01a2:
            r2 = r11
            goto L_0x018e
        L_0x01a4:
            int r0 = r4.A09
            androidx.fragment.app.FragmentActivity r2 = r4.A0z
            com.instagram.common.session.UserSession r1 = r4.A10
            com.instagram.model.androidlink.AndroidLink r10 = X.AnonymousClass47K.A02(r2, r1, r3, r0, r6)
            int r0 = r4.A09
            com.instagram.model.androidlink.AndroidLink r1 = X.AnonymousClass47K.A02(r2, r1, r3, r0, r5)
            goto L_0x00ac
        L_0x01b6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q02.A01():X.Q04");
    }

    public final void A02() {
        Q03 q03 = this.A00;
        02m r2 = ((C258403yx) q03.A14.getValue()).A00;
        if (r2 != null) {
            r2.markerPoint(1056313521, "on_ad_cta_opener");
        }
        Q04 A012 = A01();
        AnonymousClass3OA r10 = A012.A00;
        if (r10 != null) {
            AndroidLink androidLink = A012.A02;
            AnonymousClass3OA r4 = q03.A0O;
            if (r4 == null) {
                r4 = r10;
            }
            1Nv r42 = (1Nv) r4;
            UserSession userSession = q03.A10;
            String ByO = r42.ByO(userSession);
            0Tu r3 = 0Tu.A05;
            if (182.A06(r3, userSession, 36320554147390065L) && !r10.A3P().isEmpty()) {
                C55153Hd3.A00(userSession, r10, (AndroidLink) r10.A3P().get(0), C273654mx.A00(532), ByO, false);
            }
            if (A03(r42, r10, androidLink, A012.A01)) {
                String ByO2 = r42.ByO(userSession);
                if (182.A06(r3, userSession, 36320554147390065L) && androidLink != null) {
                    C55153Hd3.A00(userSession, r10, androidLink, "navigation", ByO2, true);
                    return;
                }
                return;
            }
            AnonymousClass4DU r5 = q03.A12;
            String obj = q03.A13.toString();
            C270594gz r22 = q03.A11;
            C60510iO.A00(userSession);
            C254523sc A013 = C233822wX.A01(r22, r42, r5, "action_failed");
            A013.A5K = obj;
            r22.A8S(A013, r5, "action_failed");
            C233822wX.A0C(userSession, A013, r42, r5, (Integer) null);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public Q02(Q03 q03) {
        this.A00 = q03;
        this.A01 = (C258403yx) q03.A14.getValue();
    }

    public static void A00(1Nv r2, AndroidLink androidLink, Q03 q03) {
        SUD.A06(r2, q03, C9855RiU.A00(androidLink), androidLink.Avj());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v89, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v90, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v47, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v190, resolved type: X.1Xj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v92, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v93, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v94, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x04e2, code lost:
        r1.A0B(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x06c9, code lost:
        if (r5 != null) goto L_0x06cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0a04, code lost:
        if (r2 == null) goto L_0x0a06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0c22, code lost:
        throw X.DbW.A0c("Unexpected destination: ", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0129, code lost:
        r71.A01(X.TVV.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0df0, code lost:
        r1.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0130, code lost:
        if (r16 == null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0132, code lost:
        r16.markerEnd(1056313521, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013b, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0f9c, code lost:
        r1.A0D(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0144, code lost:
        if (r4 != false) goto L_0x16b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x1206, code lost:
        if (r5.A5H() == false) goto L_0x120a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x1208, code lost:
        r1.A0E = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x120a, code lost:
        r1.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x1296, code lost:
        if (X.0qQ.A0K(r11, new X.QP1((X.C8951RIq) null, false)) == false) goto L_0x1298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x129a, code lost:
        if (r11.A00 != false) goto L_0x129c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x1333, code lost:
        if (r11.A01 >= 1) goto L_0x1337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0206, code lost:
        if (X.182.A06(r1, r0, 36324892065018308L) == false) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:656:0x150b, code lost:
        r1.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0222, code lost:
        if (X.182.A06(X.0Tu.A06, r5.A1K, 36324892065345991L) == false) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:0x1674, code lost:
        X.SUD.A06(r2, r0, r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x02ac, code lost:
        if (X.182.A06(r1, r0, 36324892065018308L) == false) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02c6, code lost:
        if (X.182.A06(X.0Tu.A06, r5.A1K, 36324892065345991L) == false) goto L_0x02c8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:872:0x183e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.1Nv r73, X.1Xj r74, com.instagram.model.androidlink.AndroidLink r75, com.instagram.model.androidlink.AndroidLink r76) {
        /*
            r72 = this;
            r15 = r75
            r17 = 2
            r4 = 0
            r3 = r72
            if (r75 != 0) goto L_0x001c
            X.3yx r1 = r3.A01
            X.TVW r0 = X.TVW.A00
            r1.A01(r0)
            X.02m r2 = r1.A00
            if (r2 == 0) goto L_0x001b
            r1 = 1056313521(0x3ef610b1, float:0.4805961)
            r0 = 3
            r2.markerEnd(r1, r0)
        L_0x001b:
            return r4
        L_0x001c:
            r7 = 1
            r5 = r74
            if (r74 == 0) goto L_0x014e
            X.1Xy r0 = r5.A0C
            java.lang.String r8 = r0.BDp()
            if (r8 == 0) goto L_0x014e
            X.Q03 r2 = r3.A00
            boolean r0 = r2.A0p
            if (r0 == 0) goto L_0x014e
            X.47L r1 = X.C271714jT.A01(r15)
            X.47L r0 = X.AnonymousClass47L.AD_DESTINATION_DEEPLINK
            if (r1 != r0) goto L_0x014e
            com.instagram.common.session.UserSession r6 = r2.A10
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328839139507837(0x8110e300033e7d, double:3.037842384093805E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x014e
            r0 = 36328839139573374(0x8110e300043e7e, double:3.037842384135251E-306)
            boolean r13 = X.182.A06(r2, r6, r0)
            com.instagram.model.androidlink.AndroidLinkImpl r15 = X.C271714jT.A00(r8)
            r12 = 1
        L_0x0054:
            X.Q03 r0 = r3.A00
            com.instagram.common.session.UserSession r6 = r0.A10
            java.lang.String r1 = r15.CGH()
            if (r1 == 0) goto L_0x0148
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0148
            java.lang.String r10 = r15.CGH()
        L_0x0068:
            X.0Tu r1 = X.0Tu.A05
            r8 = 36330853479170873(0x8112b800034339, double:3.039116260607804E-306)
            boolean r2 = X.182.A06(r1, r6, r8)
            if (r2 == 0) goto L_0x00ea
            if (r10 == 0) goto L_0x00ea
            X.0bY r2 = X.SUD.A06
            android.net.Uri r9 = X.0cp.A01(r2, r10)
            if (r9 == 0) goto L_0x00ea
            boolean r2 = r9.isHierarchical()
            if (r2 == 0) goto L_0x00ea
            java.lang.String r2 = "app_id"
            java.lang.String r8 = r9.getQueryParameter(r2)
            java.lang.String r2 = "smc_expose"
            java.lang.String r2 = r9.getQueryParameter(r2)
            if (r2 != 0) goto L_0x00a0
            r2 = 551(0x227, float:7.72E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r2 = X.0qQ.A0K(r8, r2)
            if (r2 == 0) goto L_0x00ea
        L_0x00a0:
            r25 = 0
            java.lang.String r8 = "cart_as_ads_landing"
            X.2IS r9 = X.C41845B3m.A04()
            X.2IS r10 = X.C41845B3m.A04()
            java.lang.String r2 = "experiment_name"
            r9.A04(r2, r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)
            java.lang.String r2 = "should_log_exposure"
            r9.A02(r2, r8)
            X.1vR r19 = X.C41845B3m.A05()
            java.util.Map r21 = r9.getParamsCopy()
            java.util.Map r22 = r10.getParamsCopy()
            java.lang.Class<X.BdU> r23 = X.C42487BdU.class
            java.util.ArrayList r29 = X.AnonymousClass7TE.A1C()
            java.lang.String r20 = "IGShoppingExperimentCheckBool"
            java.lang.String r28 = "me"
            com.facebook.pando.PandoGraphQLRequest r2 = new com.facebook.pando.PandoGraphQLRequest
            r18 = r2
            r24 = r4
            r26 = r4
            r27 = r25
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.1vn r10 = X.1vm.A01(r6)
            X.Smp r9 = X.C12095Smp.A00
            X.Smj r8 = X.C12089Smj.A00
            r10.ATL(r8, r9, r2)
        L_0x00ea:
            X.47L r10 = X.C271714jT.A01(r15)
            java.lang.String r19 = "Required value was null."
            if (r10 == 0) goto L_0x183e
            X.3yx r2 = r3.A01
            r71 = r2
            r2 = 9
            X.9LP r8 = new X.9LP
            r8.<init>(r10, r2)
            r2 = r71
            r2.A01(r8)
            X.02m r2 = r2.A00
            r16 = r2
            if (r2 == 0) goto L_0x0120
            r9 = 1056313521(0x3ef610b1, float:0.4805961)
            java.lang.String r8 = r10.toString()
            java.lang.String r2 = "to_open_link_type"
            r11 = r16
            r11.markerPoint(r9, r2, r8)
            r2 = 1553(0x611, float:2.176E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r11.markerAnnotate(r9, r2, r8)
        L_0x0120:
            int r8 = r10.ordinal()
            r2 = r73
            switch(r8) {
                case 0: goto L_0x0152;
                case 1: goto L_0x02dc;
                case 2: goto L_0x0359;
                case 3: goto L_0x0360;
                case 4: goto L_0x03c8;
                case 5: goto L_0x0413;
                case 6: goto L_0x05ca;
                case 7: goto L_0x08e9;
                case 8: goto L_0x0950;
                case 9: goto L_0x1510;
                case 10: goto L_0x14c7;
                case 11: goto L_0x0957;
                case 12: goto L_0x0b83;
                case 13: goto L_0x0bfe;
                case 14: goto L_0x1687;
                case 15: goto L_0x16b0;
                case 16: goto L_0x013c;
                case 17: goto L_0x013c;
                case 18: goto L_0x013c;
                case 19: goto L_0x1565;
                case 20: goto L_0x0bfe;
                case 21: goto L_0x1614;
                default: goto L_0x0129;
            }
        L_0x0129:
            X.TVV r1 = X.TVV.A00
            r0 = r71
            r0.A01(r1)
            if (r16 == 0) goto L_0x001b
            r2 = 1056313521(0x3ef610b1, float:0.4805961)
            r1 = 3
            r0 = r16
            r0.markerEnd(r2, r1)
            return r4
        L_0x013c:
            java.lang.String r1 = X.C9855RiU.A00(r15)
            boolean r4 = X.SUD.A09(r2, r15, r0, r1)
            if (r4 == 0) goto L_0x0129
            goto L_0x16b8
        L_0x0148:
            java.lang.String r10 = r15.Avj()
            goto L_0x0068
        L_0x014e:
            r13 = 0
            r12 = 0
            goto L_0x0054
        L_0x0152:
            boolean r3 = r0.A0v
            if (r3 == 0) goto L_0x02d1
            if (r74 == 0) goto L_0x16cc
            boolean r2 = X.SUD.A08(r2, r15, r0)
            if (r2 != 0) goto L_0x16b7
            androidx.fragment.app.FragmentActivity r10 = r0.A0z
            android.content.Context r9 = r10.getApplicationContext()
            X.3mM r3 = r0.A0N
            X.4mU r2 = r0.A0P
            X.Ryg r8 = new X.Ryg
            r8.<init>(r10, r6, r3, r2)
            X.SUL r5 = X.SUD.A01(r5, r15, r0, r4)
            X.0qQ.A0A(r9)
            X.0qQ.A0B(r9, r7)
            X.6LY r0 = r8.A07
            com.instagram.common.session.UserSession r0 = r0.A00
            r2 = 36324892064559551(0x810d4c000331bf, double:3.035346238002914E-306)
            boolean r2 = X.182.A06(r1, r0, r2)
            if (r2 == 0) goto L_0x023e
            X.3mM r10 = r8.A04
            if (r10 == 0) goto L_0x0237
            boolean r2 = X.C316216lI.A0E(r9, r10)
            if (r2 == 0) goto L_0x0237
            int r6 = X.C316216lI.A03(r9)
            android.content.res.Resources r3 = r9.getResources()
            r2 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r2 = r3.getDimensionPixelOffset(r2)
            int r6 = r6 + r2
            float r3 = (float) r6
            int r2 = X.C316216lI.A04(r9, r10)
            float r2 = (float) r2
            float r3 = r3 + r2
        L_0x01a7:
            int r2 = X.AnonymousClass0nB.A00(r9)
            float r2 = (float) r2
            float r3 = r3 / r2
            r5.A0z = r7
            r5.A03 = r3
            r5.A0c = r4
            com.instagram.common.session.UserSession r4 = r8.A03
            java.lang.String r2 = r4.A05
            r5.A0F(r2)
            r5.A19 = r7
            r5.A0d = r7
            r5.A18 = r7
            r2 = 36324892064887234(0x810d4c000831c2, double:3.035346238210142E-306)
            boolean r2 = X.182.A06(r1, r0, r2)
            r5.A0y = r2
            r5.A0f = r7
            r5.A11 = r7
            r2 = 36324892064821697(0x810d4c000731c1, double:3.035346238168696E-306)
            boolean r3 = X.182.A06(r1, r0, r2)
            X.RIg r2 = X.RIg.IG_STORY_BROWSER_PEEK
            r5.A0s = r3
            r5.A09 = r2
            X.T8G r2 = r8.A06
            r5.A0F = r2
            r2 = 36324892064428477(0x810d4c000131bd, double:3.035346237920022E-306)
            boolean r2 = X.182.A06(r1, r0, r2)
            r5.A0p = r2
            X.ERK r2 = r8.A08
            r5.A0J = r2
            r2 = 36324892065345991(0x810d4c000f31c7, double:3.0353462385002617E-306)
            boolean r2 = X.182.A06(r1, r0, r2)
            if (r2 != 0) goto L_0x0208
            r2 = 36324892065018308(0x810d4c000a31c4, double:3.0353462382930336E-306)
            boolean r3 = X.182.A06(r1, r0, r2)
            r2 = 1
            if (r3 != 0) goto L_0x0209
        L_0x0208:
            r2 = 0
        L_0x0209:
            r5.A0G(r2)
            r5.A0t = r7
            r2 = 36324892065345991(0x810d4c000f31c7, double:3.0353462385002617E-306)
            boolean r0 = X.182.A06(r1, r0, r2)
            if (r0 == 0) goto L_0x0224
            com.instagram.common.session.UserSession r6 = r5.A1K
            X.0Tu r0 = X.0Tu.A06
            boolean r2 = X.182.A06(r0, r6, r2)
            r0 = 1
            if (r2 != 0) goto L_0x0225
        L_0x0224:
            r0 = 0
        L_0x0225:
            r5.A0m = r0
        L_0x0227:
            r2 = 36324943604625917(0x810d58000a31fd, double:3.035378832148419E-306)
            boolean r0 = X.182.A06(r1, r4, r2)
            r5.A0x = r0
            r5.A0A()
            goto L_0x16b7
        L_0x0237:
            int r2 = X.C316216lI.A03(r9)
            float r3 = (float) r2
            goto L_0x01a7
        L_0x023e:
            r2 = 36324892065477065(0x810d4c001131c9, double:3.0353462385831534E-306)
            boolean r2 = X.182.A06(r1, r0, r2)
            if (r2 == 0) goto L_0x16b7
            r5.A0z = r7
            r2 = 37169316995662317(0x840d4c001201ed, double:3.569363964658579E-306)
            double r2 = X.182.A00(r1, r0, r2)
            float r6 = (float) r2
            r5.A03 = r6
            r5.A0c = r4
            com.instagram.common.session.UserSession r4 = r8.A03
            java.lang.String r2 = r4.A05
            r5.A0F(r2)
            r5.A19 = r7
            r5.A0d = r7
            r5.A1B = r7
            r5.A18 = r7
            r2 = 36324892064887234(0x810d4c000831c2, double:3.035346238210142E-306)
            boolean r2 = X.182.A06(r1, r0, r2)
            r5.A0y = r2
            r5.A0f = r7
            r5.A11 = r7
            r2 = 36324892064428477(0x810d4c000131bd, double:3.035346237920022E-306)
            boolean r2 = X.182.A06(r1, r0, r2)
            r5.A0p = r2
            r5.A0t = r7
            r2 = 36324892064821697(0x810d4c000731c1, double:3.035346238168696E-306)
            boolean r3 = X.182.A06(r1, r0, r2)
            X.RIg r2 = X.RIg.IG_STORY_BROWSER_PEEK
            r5.A0s = r3
            r5.A09 = r2
            X.ERK r2 = r8.A08
            r5.A0J = r2
            r2 = 36324892065345991(0x810d4c000f31c7, double:3.0353462385002617E-306)
            boolean r2 = X.182.A06(r1, r0, r2)
            if (r2 != 0) goto L_0x02ae
            r2 = 36324892065018308(0x810d4c000a31c4, double:3.0353462382930336E-306)
            boolean r3 = X.182.A06(r1, r0, r2)
            r2 = 1
            if (r3 != 0) goto L_0x02af
        L_0x02ae:
            r2 = 0
        L_0x02af:
            r5.A0G(r2)
            r2 = 36324892065345991(0x810d4c000f31c7, double:3.0353462385002617E-306)
            boolean r0 = X.182.A06(r1, r0, r2)
            if (r0 == 0) goto L_0x02c8
            com.instagram.common.session.UserSession r6 = r5.A1K
            X.0Tu r0 = X.0Tu.A06
            boolean r2 = X.182.A06(r0, r6, r2)
            r0 = 1
            if (r2 != 0) goto L_0x02c9
        L_0x02c8:
            r0 = 0
        L_0x02c9:
            r5.A0m = r0
            X.T8G r0 = r8.A06
            r5.A0F = r0
            goto L_0x0227
        L_0x02d1:
            if (r74 == 0) goto L_0x16d1
            r8 = r2
            r9 = r5
            r10 = r15
            r11 = r0
            X.SUD.A05(r8, r9, r10, r11, r12, r13)
            goto L_0x16b7
        L_0x02dc:
            X.T5d r7 = new X.T5d
            r7.<init>(r2, r5, r3)
            if (r74 == 0) goto L_0x16d6
            java.lang.String r3 = r15.Bd3()
            r23 = r76
            if (r3 == 0) goto L_0x034e
            r3 = 36320717356278558(0x8109800002231e, double:3.032706135675813E-306)
            boolean r1 = X.182.A06(r1, r6, r3)
            if (r1 == 0) goto L_0x034e
            android.os.Bundle r9 = X.DbY.A09(r6)
            java.lang.String r3 = r15.Bd3()
            r1 = 347(0x15b, float:4.86E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r9.putString(r1, r3)
            java.lang.String r3 = r15.getAppName()
            java.lang.String r1 = "playable_title"
            r9.putString(r1, r3)
            java.lang.String r3 = r5.getId()
            java.lang.String r1 = "media_id"
            r9.putString(r1, r3)
            X.2EG r1 = r0.A13
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "entry_point"
            r9.putString(r1, r3)
            androidx.fragment.app.FragmentActivity r8 = r0.A0z
            X.6Yo r1 = X.DbS.A0M(r8, r6)
            X.0hq r4 = X.C229102mq.A00(r8)
            X.SdO r3 = new X.SdO
            r18 = r3
            r19 = r7
            r20 = r2
            r21 = r5
            r22 = r15
            r24 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            java.lang.String r0 = "playable_request_key"
            r4.A0v(r3, r8, r0)
            X.R8W r0 = new X.R8W
            r0.<init>()
            goto L_0x04e2
        L_0x034e:
            r1 = r7
            r3 = r5
            r4 = r15
            r5 = r23
            r6 = r0
            X.SUD.A02(r1, r2, r3, r4, r5, r6)
            goto L_0x16b7
        L_0x0359:
            if (r74 == 0) goto L_0x16db
            X.SUD.A03(r2, r5, r15, r0)
            goto L_0x16b7
        L_0x0360:
            if (r74 == 0) goto L_0x16e5
            java.lang.String r4 = r15.Avj()
            if (r4 == 0) goto L_0x16e0
            java.lang.String r3 = X.C9855RiU.A00(r15)
            X.SUD.A06(r2, r0, r3, r4)
            X.VuQ r3 = X.C18574VuQ.A00(r6)
            X.4DU r8 = r0.A12
            java.lang.String r2 = r8.getModuleName()
            r3.A02(r5, r2)
            r2 = 36329711017672980(0x8111ae00004114, double:3.038393763356213E-306)
            boolean r9 = X.182.A06(r1, r6, r2)
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r7 = r0.A0z
            X.37D r3 = r1.A01(r7)
            if (r3 == 0) goto L_0x16b7
            r2 = r3
            X.37F r2 = (X.AnonymousClass37F) r2
            boolean r1 = r2.A0g
            if (r1 == 0) goto L_0x03ad
            X.T8J r1 = new X.T8J
            r1.<init>(r5, r0, r4)
            r2.A0H = r1
            r3.A0B()
        L_0x03a0:
            java.lang.String r1 = "instagram_phone"
            X.3GX r0 = X.AnonymousClass3GX.A00(r6)
            if (r9 == 0) goto L_0x03c3
            r0.A06(r1)
            goto L_0x16b7
        L_0x03ad:
            X.SGU r18 = X.SGU.A00
            java.lang.String r24 = r8.getModuleName()
            X.6a7 r0 = r0.A0W
            r19 = r7
            r20 = r6
            r21 = r5
            r22 = r0
            r23 = r4
            r18.A00(r19, r20, r21, r22, r23, r24)
            goto L_0x03a0
        L_0x03c3:
            r0.A07(r1)
            goto L_0x16b7
        L_0x03c8:
            if (r74 == 0) goto L_0x16ef
            java.lang.String r4 = r15.Avj()
            if (r4 == 0) goto L_0x16ea
            A00(r2, r15, r0)
            X.VuQ r2 = X.C18574VuQ.A00(r6)
            X.4DU r1 = r0.A12
            java.lang.String r1 = r1.getModuleName()
            r2.A02(r5, r1)
            com.instagram.model.reels.Reel r1 = r0.A0M
            if (r1 == 0) goto L_0x0408
            androidx.fragment.app.FragmentActivity r3 = r0.A0z
            android.content.DialogInterface$OnDismissListener r2 = r0.A0E
            android.content.Intent r1 = X.Pxe.A0E()
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r1 = r1.setFlags(r0)
            android.net.Uri r0 = X.0cp.A03(r4)
            android.content.Intent r0 = r1.setData(r0)
            X.FFS.A02(r3, r2, r0)
        L_0x03fd:
            X.3GX r1 = X.AnonymousClass3GX.A00(r6)
            java.lang.String r0 = "instagram_map"
            r1.A07(r0)
            goto L_0x16b7
        L_0x0408:
            androidx.fragment.app.FragmentActivity r0 = r0.A0z
            X.47L r2 = X.AnonymousClass47L.AD_DESTINATION_MAP
            r3 = 0
            r1 = r6
            r5 = r3
            X.FH7.A06(r0, r1, r2, r3, r4, r5)
            goto L_0x03fd
        L_0x0413:
            if (r74 == 0) goto L_0x16f4
            com.instagram.model.reels.Reel r8 = r0.A0M
            if (r8 == 0) goto L_0x0431
            boolean r1 = r5.A66()
            if (r1 == 0) goto L_0x0431
            com.instagram.model.reels.sponsored.AutoGeneratedCardType r3 = com.instagram.model.reels.sponsored.AutoGeneratedCardType.COLLECTION
            X.1Xy r1 = r5.A0C
            com.instagram.model.reels.sponsored.AutoGeneratedCardType r1 = r1.Ae3()
            if (r3 != r1) goto L_0x0431
            X.3uh r1 = r8.A0A(r6, r4)
            X.1Xj r8 = r1.A0b
            if (r8 != 0) goto L_0x0432
        L_0x0431:
            r8 = r5
        L_0x0432:
            X.1Xy r1 = r8.A0C
            java.lang.String r1 = r1.BMi()
            r9 = 0
            if (r1 == 0) goto L_0x0476
            android.net.Uri r10 = X.0cp.A03(r1)
        L_0x043f:
            X.1Xy r1 = r8.A0C
            java.lang.String r1 = r1.AYt()
            X.SUD.A06(r2, r0, r1, r9)
            X.2cc r1 = X.C71342cb.A00(r6)
            androidx.fragment.app.FragmentActivity r3 = r0.A0z
            r1.A06(r3)
            if (r10 == 0) goto L_0x04e9
            java.lang.String r5 = "AdCTAOpenerHelper"
            boolean r1 = X.SL1.A02(r10, r5)
            if (r1 == 0) goto L_0x04e9
            X.0qQ.A0B(r3, r4)
            java.util.HashMap r4 = X.SL1.A00(r10)
            if (r4 != 0) goto L_0x0478
            X.0wb r2 = X.0wb.A01
            java.lang.String r0 = "Invalid serverParamsString or nativeAdType to open Bloks screen from %s"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r5)
            X.0qQ.A07(r1)
            java.lang.String r0 = "InstantShoppingInstagramBloksScreenUtil"
            r2.Ew0(r0, r1)
            goto L_0x16b7
        L_0x0476:
            r10 = r9
            goto L_0x043f
        L_0x0478:
            java.lang.String r10 = r8.getId()
            if (r10 != 0) goto L_0x0480
            java.lang.String r10 = ""
        L_0x0480:
            com.instagram.user.model.User r0 = r8.A2A(r6)
            if (r0 == 0) goto L_0x04e7
            java.lang.String r7 = r0.getId()
        L_0x048a:
            X.1iA r0 = r8.BR7()
            int r0 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r5 = X.C294185m0.A06(r6, r8)
            com.google.common.collect.ImmutableMap$Builder r2 = X.Pxf.A0Q()
            java.lang.String r0 = "m_pk"
            r2.put(r0, r10)
            java.lang.String r0 = "a_pk"
            if (r7 == 0) goto L_0x04a9
            r2.put(r0, r7)
        L_0x04a9:
            java.lang.String r1 = X.DbX.A0t(r1)
            java.lang.String r0 = "m_t"
            if (r1 == 0) goto L_0x04b5
            r2.put(r0, r1)
        L_0x04b5:
            r0 = 608(0x260, float:8.52E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            com.google.common.collect.ImmutableMap r1 = X.Pxe.A0Z(r2, r0, r5)
            X.0qQ.A07(r1)
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r2.<init>((X.0lg) r6)
            r0 = 3386(0xd3a, float:4.745E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0R = r0
            java.lang.String r0 = "com.bloks.www.fam.native.ads.bloks.main.controller"
            X.DiU r1 = X.C46649DiU.A06(r0, r4, r1)
            r0 = 719983200(0x2aea1260, float:4.15795E-13)
            r1.A00 = r0
            X.3M3 r0 = X.C49891FBs.A02(r2, r1)
            X.6Yo r1 = X.DbU.A0Q(r3, r6)
        L_0x04e2:
            r1.A0B(r9, r0)
            goto L_0x0df0
        L_0x04e7:
            r7 = r9
            goto L_0x048a
        L_0x04e9:
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            int r4 = r1.nextInt()
            X.02m r2 = X.02m.A0p
            r1 = 373302739(0x164025d3, float:1.5521572E-25)
            r2.markerStart(r1, r4)
            java.lang.Class<com.instagram.canvas.CanvasActivity> r1 = com.instagram.canvas.CanvasActivity.class
            android.content.Intent r5 = X.C66580MXl.A0A(r3, r1)
            java.lang.String r2 = r6.A05
            java.lang.String r1 = "IgSessionManager.SESSION_TOKEN_KEY"
            android.content.Intent r5 = r5.putExtra(r1, r2)
            java.lang.String r2 = r15.AlB()
            java.lang.String r1 = "CanvasFragment.ARGUMENTS_CANVAS_ID"
            android.content.Intent r5 = r5.putExtra(r1, r2)
            java.lang.String r2 = r15.AlA()
            java.lang.String r1 = "CanvasFragment.ARGUMENTS_CANVAS_DATA"
            android.content.Intent r2 = r5.putExtra(r1, r2)
            java.lang.String r1 = "CanvasFragment.ARGUMENTS_CANVAS_ANIMATE"
            android.content.Intent r5 = r2.putExtra(r1, r7)
            X.4DU r7 = r0.A12
            java.lang.String r2 = r7.getModuleName()
            java.lang.String r1 = "CanvasFragment.ARGUMENTS_CANVAS_PARENT_MODULE_NAME"
            android.content.Intent r5 = r5.putExtra(r1, r2)
            boolean r2 = r7.isSponsoredEligible()
            java.lang.String r1 = "CanvasFragment.ARGUMENTS_CANVAS_PARENT_MODULE_SPONSORED_ELIGIBLE"
            android.content.Intent r5 = r5.putExtra(r1, r2)
            X.3OA r1 = r0.A0O
            if (r1 == 0) goto L_0x05ba
            com.google.common.collect.ImmutableList r1 = r1.A00
            if (r1 == 0) goto L_0x05ba
        L_0x0540:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r1)
            java.lang.String r1 = "CanvasFragment.ARGUMENTS_KEY_EXTRA_AD_COOKIES"
            android.content.Intent r2 = r5.putStringArrayListExtra(r1, r2)
            java.lang.String r1 = "CanvasFragment.ARGUMENTS_CANVAS_QPL_INSTANCE_KEY"
            android.content.Intent r5 = r2.putExtra(r1, r4)
            X.0qQ.A07(r5)
            com.instagram.model.reels.Reel r1 = r0.A0M
            java.lang.String r4 = "CanvasFragment.ARGUMENTS_CANVAS_FIXED_MEDIA_HEADER_LAST_PAUSE_POSITION"
            java.lang.String r6 = "CanvasFragment.ARGUMENTS_CANVAS_FIXED_MEDIA_HEADER_SCREEN_POSITION"
            java.lang.String r9 = "CanvasFragment.ARGUMENTS_CANVAS_MEDIA_ID"
            if (r1 == 0) goto L_0x05a7
            java.lang.String r2 = r1.getId()
            java.lang.String r1 = "CanvasFragment.ARGUMENTS_KEY_EXTRA_REEL_ID"
            android.content.Intent r7 = r5.putExtra(r1, r2)
            java.lang.String r2 = r0.A0j
            java.lang.String r1 = "CanvasFragment.ARGUMENTS_KEY_EXTRA_VIEWER_SESSION_ID"
            android.content.Intent r7 = r7.putExtra(r1, r2)
            int r2 = r0.A0C
            r1 = 500(0x1f4, float:7.0E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            android.content.Intent r7 = r7.putExtra(r1, r2)
            java.lang.String r2 = r0.A0i
            r1 = 499(0x1f3, float:6.99E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            android.content.Intent r7 = r7.putExtra(r1, r2)
            int r2 = r0.A0D
            java.lang.String r1 = "CanvasFragment.ARGUMENTS_KEY_EXTRA_TRAY_POSITION"
            android.content.Intent r2 = r7.putExtra(r1, r2)
            java.lang.String r1 = r8.getId()
            android.content.Intent r2 = r2.putExtra(r9, r1)
            int[] r1 = r0.A0w
        L_0x0599:
            android.content.Intent r1 = r2.putExtra(r6, r1)
            int r0 = r0.A0A
            r1.putExtra(r4, r0)
            X.0kR.A0B(r3, r5)
            goto L_0x16b7
        L_0x05a7:
            java.lang.String r1 = r8.getId()
            android.content.Intent r2 = r5.putExtra(r9, r1)
            int[] r1 = r0.A0w
            android.content.Intent r2 = r2.putExtra(r6, r1)
            int[] r1 = r0.A0x
            java.lang.String r6 = "CanvasFragment.ARGUMENTS_CANVAS_FIXED_MEDIA_HEADER_MEDIA_WIDTH_HEIGHT"
            goto L_0x0599
        L_0x05ba:
            java.util.List r1 = X.C231122qu.A0K(r6, r8)
            if (r1 == 0) goto L_0x05c6
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r1)
            goto L_0x0540
        L_0x05c6:
            X.0sn r1 = X.0sn.A00
            goto L_0x0540
        L_0x05ca:
            if (r74 == 0) goto L_0x1703
            r8 = 36329238571270014(0x81114000003f7e, double:3.0380949863485884E-306)
            boolean r1 = X.182.A06(r1, r6, r8)
            if (r1 == 0) goto L_0x06ff
            java.lang.Integer r1 = r15.BMu()
            if (r1 != 0) goto L_0x06f9
            java.lang.String r1 = "leadads"
        L_0x05df:
            r8 = 0
            X.SUD.A06(r2, r0, r1, r8)
            X.1WM r1 = X.1WM.getInstance()
            X.TmU r9 = r1.getPerformanceLogger(r6)
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            java.lang.String r1 = "lead_gen"
            r9.EwT(r3, r8, r1)
            boolean r1 = r5.A5W()
            if (r1 != 0) goto L_0x08de
            androidx.fragment.app.FragmentActivity r3 = r0.A0z
            int r9 = r0.A09
            int r12 = r0.A0B
            X.2EG r1 = r0.A13
            java.lang.String r11 = r1.toString()
            X.DbW.A1O(r3, r4, r11)
            r23 = r8
            r24 = r8
            r19 = r8
            r20 = r8
            r33 = 0
            java.lang.String r10 = X.C231122qu.A07(r6, r5)
            java.lang.String r26 = r5.A33(r9)
            java.lang.String r31 = r5.getId()
            java.lang.String r30 = r15.BM9()
            java.lang.String r32 = r5.C9L()
            java.lang.String r21 = X.C231122qu.A09(r6, r5)
            com.instagram.user.model.User r1 = r5.A2A(r6)
            r41 = 0
            if (r1 == 0) goto L_0x066b
            java.lang.String r8 = r1.getUsername()
            X.4Cl r2 = r1.A03
            java.lang.String r23 = r2.getFbidV2()
            boolean r2 = r1.A2Q()
            if (r2 != 0) goto L_0x0645
            java.lang.String r24 = r1.getId()
        L_0x0645:
            com.instagram.common.typedurl.ImageUrl r19 = r1.Bh3()
            if (r26 == 0) goto L_0x065d
            boolean r2 = r5.A5D()
            if (r2 == 0) goto L_0x065d
            X.1Xj r2 = r5.A1c(r9)
            if (r2 == 0) goto L_0x065d
            com.instagram.model.mediasize.ExtendedImageUrl r20 = r2.A1n(r3)
            if (r20 != 0) goto L_0x0661
        L_0x065d:
            com.instagram.model.mediasize.ExtendedImageUrl r20 = r5.A1n(r3)
        L_0x0661:
            X.4Cl r1 = r1.A03
            java.lang.Integer r1 = r1.B6v()
            int r33 = X.AnonymousClass7TG.A0A(r1)
        L_0x066b:
            boolean r38 = X.1sx.A0G(r6, r10)
            boolean r1 = r5.A5n()
            if (r1 != 0) goto L_0x067b
            boolean r1 = r5.A5e()
            if (r1 == 0) goto L_0x067d
        L_0x067b:
            r41 = 1
        L_0x067d:
            boolean r40 = r5.A5o()
            boolean r42 = r5.A6E()
            boolean r39 = r5.A5l()
            boolean r43 = r5.A6G()
            java.lang.String r2 = r0.A0d
            if (r2 != 0) goto L_0x06ab
            com.instagram.model.reels.Reel r1 = r0.A0M
            r2 = 0
            if (r1 == 0) goto L_0x06ab
            java.util.List r5 = r1.A0O(r6)
            X.0qQ.A07(r5)
            boolean r1 = X.AnonymousClass7TE.A1b(r5)
            if (r1 == 0) goto L_0x06ab
            java.lang.Object r1 = X.C66582MXn.A0r(r5)
            X.3uh r1 = (X.C255773uh) r1
            java.lang.String r2 = r1.A0I
        L_0x06ab:
            com.instagram.model.reels.Reel r0 = r0.A0M
            r5 = 0
            if (r0 == 0) goto L_0x06c5
            java.util.List r1 = r0.A0O(r6)
            X.0qQ.A07(r1)
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x06c5
            java.lang.Object r0 = X.C66582MXn.A0r(r1)
            X.3uh r0 = (X.C255773uh) r0
            java.lang.String r5 = r0.A0J
        L_0x06c5:
            if (r2 != 0) goto L_0x06cb
            r37 = 0
            if (r5 == 0) goto L_0x06cd
        L_0x06cb:
            r37 = 1
        L_0x06cd:
            X.6Yo r1 = X.DbS.A0M(r3, r6)
            r1.A0E = r7
            X.Uu6 r0 = new X.Uu6
            r0.<init>()
            r18 = r6
            r22 = r10
            r25 = r8
            r27 = r11
            r28 = r2
            r29 = r5
            r34 = r9
            r35 = r12
            r36 = r4
            android.os.Bundle r2 = X.QOk.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r1.A0B(r2, r0)
            java.lang.String r0 = "lead_ad_post_click_entry_fragment_backstack"
            r1.A0A = r0
            r1.A0C = r0
            goto L_0x0df0
        L_0x06f9:
            java.lang.String r1 = X.C9855RiU.A00(r15)
            goto L_0x05df
        L_0x06ff:
            com.instagram.user.model.User r11 = r5.A2A(r6)
            if (r11 == 0) goto L_0x16fe
            java.lang.Integer r1 = r15.BMu()
            if (r1 != 0) goto L_0x08d8
            java.lang.String r1 = "leadads"
        L_0x070d:
            r9 = 0
            X.SUD.A06(r2, r0, r1, r9)
            X.1WM r1 = X.1WM.getInstance()
            X.TmU r8 = r1.getPerformanceLogger(r6)
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            java.lang.String r1 = "lead_gen"
            r8.EwT(r3, r9, r1)
            int r1 = r0.A09
            java.lang.String r8 = r5.A33(r1)
            android.os.Bundle r10 = X.AnonymousClass7TE.A0a()
            java.lang.String r3 = r15.BM9()
            java.lang.String r1 = "formID"
            r10.putString(r1, r3)
            if (r8 == 0) goto L_0x08d0
            boolean r1 = r5.A5D()
            if (r1 == 0) goto L_0x08d0
            int r1 = r0.A09
            X.1Xj r1 = r5.A1c(r1)
            if (r1 == 0) goto L_0x16f9
            androidx.fragment.app.FragmentActivity r9 = r0.A0z
            com.instagram.model.mediasize.ExtendedImageUrl r3 = r1.A1n(r9)
        L_0x0749:
            java.lang.String r1 = "brandingImageURI"
            r10.putParcelable(r1, r3)
            java.lang.String r3 = r11.getUsername()
            java.lang.String r1 = "igUserName"
            r10.putString(r1, r3)
            X.4Cl r1 = r11.A03
            java.lang.String r3 = r1.getFbidV2()
            java.lang.String r1 = "advertiser_fbidv2"
            r10.putString(r1, r3)
            boolean r1 = r11.A2Q()
            if (r1 != 0) goto L_0x0771
            java.lang.String r3 = r11.getId()
            java.lang.String r1 = "igUserId"
            r10.putString(r1, r3)
        L_0x0771:
            X.4Cl r1 = r11.A03
            java.lang.Integer r12 = r1.B6v()
            com.instagram.user.model.User r1 = r5.A2A(r6)
            r3 = 0
            if (r1 == 0) goto L_0x08cd
            if (r12 == 0) goto L_0x08cd
            int r12 = r12.intValue()
        L_0x0784:
            java.lang.String r1 = "advertiserFollowerCount"
            r10.putInt(r1, r12)
            com.instagram.common.typedurl.ImageUrl r11 = r11.Bh3()
            java.lang.String r1 = "profilePicURI"
            r10.putParcelable(r1, r11)
            java.lang.String r11 = r5.getId()
            java.lang.String r1 = "mediaID"
            r10.putString(r1, r11)
            java.lang.String r11 = X.C231122qu.A07(r6, r5)
            java.lang.String r1 = "adID"
            r10.putString(r1, r11)
            java.lang.String r11 = "app"
            java.lang.String r1 = "instagram"
            r10.putString(r11, r1)
            java.lang.String r11 = r5.C9L()
            java.lang.String r1 = "trackingToken"
            r10.putString(r1, r11)
            int r11 = r0.A09
            java.lang.String r1 = "carouselIndex"
            r10.putInt(r1, r11)
            int r11 = r0.A0B
            java.lang.String r1 = "mediaPosition"
            r10.putInt(r1, r11)
            java.lang.String r1 = X.C231122qu.A07(r6, r5)
            boolean r11 = X.1sx.A0G(r6, r1)
            java.lang.String r1 = "submitted"
            r10.putBoolean(r1, r11)
            java.lang.String r11 = X.C231122qu.A09(r6, r5)
            java.lang.String r1 = "ad_creation_source"
            r10.putString(r1, r11)
            boolean r1 = r5.A5n()
            if (r1 != 0) goto L_0x07e9
            boolean r1 = r5.A5e()
            if (r1 == 0) goto L_0x07ea
        L_0x07e9:
            r3 = 1
        L_0x07ea:
            r1 = 3459(0xd83, float:4.847E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r10.putBoolean(r1, r3)
            boolean r3 = r5.A5o()
            java.lang.String r1 = "is_pharma_vertical_ad"
            r10.putBoolean(r1, r3)
            java.lang.String r1 = "dynamicItemID"
            r10.putString(r1, r8)
            X.2EG r1 = r0.A13
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "entry_point"
            r10.putString(r1, r3)
            boolean r3 = r5.A6E()
            java.lang.String r1 = "should_always_allow_phone_zip_ui"
            r10.putBoolean(r1, r3)
            boolean r3 = r5.A5l()
            java.lang.String r1 = "is_partnership_ad"
            r10.putBoolean(r1, r3)
            boolean r3 = r5.A6G()
            java.lang.String r1 = "should_force_full_page_context_card"
            r10.putBoolean(r1, r3)
            java.lang.String r1 = r0.A0d
            if (r1 != 0) goto L_0x0847
            com.instagram.model.reels.Reel r3 = r0.A0M
            r1 = 0
            if (r3 == 0) goto L_0x0847
            java.util.List r8 = r3.A0O(r6)
            X.0qQ.A07(r8)
            boolean r3 = X.AnonymousClass7TE.A1b(r8)
            if (r3 == 0) goto L_0x0847
            java.lang.Object r1 = X.C66582MXn.A0r(r8)
            X.3uh r1 = (X.C255773uh) r1
            java.lang.String r1 = r1.A0I
        L_0x0847:
            java.lang.String r8 = "is_first_question_sticker"
            if (r1 == 0) goto L_0x0853
            r10.putBoolean(r8, r7)
            java.lang.String r3 = "first_question_sticker_mcq_answer_value"
            r10.putString(r3, r1)
        L_0x0853:
            com.instagram.model.reels.Reel r1 = r0.A0M
            if (r1 == 0) goto L_0x0876
            java.util.List r3 = r1.A0O(r6)
            X.0qQ.A07(r3)
            boolean r1 = X.AnonymousClass7TE.A1b(r3)
            if (r1 == 0) goto L_0x0876
            java.lang.Object r1 = X.C66582MXn.A0r(r3)
            X.3uh r1 = (X.C255773uh) r1
            java.lang.String r3 = r1.A0J
            if (r3 == 0) goto L_0x0876
            r10.putBoolean(r8, r7)
            java.lang.String r1 = "first_question_sticker_saq_answer_value"
            r10.putString(r1, r3)
        L_0x0876:
            com.instagram.model.reels.Reel r1 = r0.A0M
            if (r1 == 0) goto L_0x088e
            java.util.List r3 = r1.A0O(r6)
            X.0qQ.A07(r3)
            boolean r1 = X.AnonymousClass7TE.A1b(r3)
            if (r1 == 0) goto L_0x088e
            int r1 = X.C51966G9m.A06(r3)
            r3.get(r1)
        L_0x088e:
            com.instagram.model.reels.Reel r1 = r0.A0M
            if (r1 == 0) goto L_0x08a6
            java.util.List r3 = r1.A0O(r6)
            X.0qQ.A07(r3)
            boolean r1 = X.AnonymousClass7TE.A1b(r3)
            if (r1 == 0) goto L_0x08a6
            int r1 = X.C51966G9m.A06(r3)
            r3.get(r1)
        L_0x08a6:
            java.lang.String r1 = "is_from_lead_ad_activity"
            r10.putBoolean(r1, r7)
            java.lang.Class<com.instagram.leadads.activity.LeadAdsActivity> r1 = com.instagram.leadads.activity.LeadAdsActivity.class
            android.content.Intent r7 = X.C66580MXl.A0A(r9, r1)
            r7.putExtras(r10)
            java.lang.String r3 = r6.A05
            java.lang.String r1 = "IgSessionManager.SESSION_TOKEN_KEY"
            r7.putExtra(r1, r3)
            boolean r1 = r5.A5W()
            if (r1 != 0) goto L_0x08de
            X.2cc r0 = X.C71342cb.A00(r6)
            r0.A06(r9)
            X.0kR.A0B(r9, r7)
            goto L_0x16b7
        L_0x08cd:
            r12 = 0
            goto L_0x0784
        L_0x08d0:
            androidx.fragment.app.FragmentActivity r9 = r0.A0z
            com.instagram.model.mediasize.ExtendedImageUrl r3 = r5.A1n(r9)
            goto L_0x0749
        L_0x08d8:
            java.lang.String r1 = X.C9855RiU.A00(r15)
            goto L_0x070d
        L_0x08de:
            r6 = r2
            r7 = r5
            r8 = r15
            r9 = r0
            r10 = r4
            r11 = r4
            X.SUD.A05(r6, r7, r8, r9, r10, r11)
            goto L_0x16b7
        L_0x08e9:
            if (r74 == 0) goto L_0x1712
            java.lang.String r3 = r15.BFh()
            if (r3 == 0) goto L_0x170d
            java.lang.String r1 = X.C9855RiU.A00(r15)
            X.SUD.A06(r2, r0, r1, r3)
            boolean r1 = r0.A0m
            if (r1 != 0) goto L_0x16b7
            java.lang.Class<com.instagram.modal.ModalActivity> r11 = com.instagram.modal.ModalActivity.class
            X.1a0 r1 = X.C46447Df9.A03()
            X.1a1 r8 = r1.A01
            X.4DU r1 = r0.A12
            java.lang.String r2 = r1.getModuleName()
            java.lang.String r1 = "ad_cta_profile_link"
            X.Dfc r7 = X.C46548Dgp.A01(r6, r3, r1, r2)
            java.lang.String r5 = r5.getId()
            if (r5 == 0) goto L_0x1708
            int r3 = r0.A0B
            int r2 = r0.A09
            com.instagram.sponsored.analytics.SourceModelInfoParams r1 = new com.instagram.sponsored.analytics.SourceModelInfoParams
            r1.<init>(r5, r3, r2)
            r7.A04 = r1
            boolean r1 = r0.A0n
            r7.A0Y = r1
            com.instagram.profile.intf.UserDetailLaunchConfig r1 = r7.A04()
            android.os.Bundle r9 = r8.A01(r6, r1)
            androidx.fragment.app.FragmentActivity r2 = r0.A0z
            java.lang.String r12 = "profile"
            X.6W8 r1 = new X.6W8
            r7 = r1
            r8 = r2
            r10 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            boolean r0 = r0.A0n
            if (r0 == 0) goto L_0x094c
            r0 = 2130772097(0x7f010081, float:1.7147303E38)
            int[] r0 = new int[]{r4, r4, r4, r0}
            r1.A0J = r0
        L_0x0947:
            r1.A0C(r2)
            goto L_0x16b7
        L_0x094c:
            r1.A07()
            goto L_0x0947
        L_0x0950:
            if (r74 == 0) goto L_0x1717
            X.SUD.A04(r2, r5, r15, r0, r7)
            goto L_0x16b7
        L_0x0957:
            if (r74 == 0) goto L_0x1749
            A00(r2, r15, r0)
            com.instagram.user.model.User r14 = r5.A2A(r6)
            if (r14 == 0) goto L_0x173e
            java.lang.String r1 = r15.Avj()
            if (r1 == 0) goto L_0x1737
            r12 = 0
            android.net.Uri r8 = X.DbT.A09(r1)
            java.lang.String r3 = X.AnonymousClass595.A01(r15)
            java.lang.String r2 = r15.Avj()
            r1 = 0
            if (r2 == 0) goto L_0x09a2
            java.lang.String r9 = X.AnonymousClass595.A01(r15)
            if (r9 == 0) goto L_0x09a2
            java.util.ArrayList r2 = r5.A3K(r7)
            if (r2 == 0) goto L_0x0b80
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0b80
            java.util.Iterator r10 = X.AnonymousClass7TE.A1G(r2)
        L_0x098e:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0b80
            java.lang.Object r1 = X.AnonymousClass7TF.A0a(r10)
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            java.lang.String r2 = r1.A0H
            boolean r2 = X.0qQ.A0K(r2, r9)
            if (r2 == 0) goto L_0x098e
        L_0x09a2:
            java.lang.String r2 = r15.Avj()
            if (r2 == 0) goto L_0x0b7d
            android.net.Uri r9 = X.DbT.A09(r2)
            java.lang.String r2 = "cpdp_disabled"
            java.lang.String r9 = r9.getQueryParameter(r2)
            java.lang.String r2 = "1"
            boolean r10 = r2.equals(r9)
        L_0x09b8:
            java.lang.String r2 = r15.Avj()
            if (r2 == 0) goto L_0x09cb
            android.net.Uri r9 = X.DbT.A09(r2)
            r2 = 45
            java.lang.String r2 = X.C273654mx.A00(r2)
            r9.getQueryParameter(r2)
        L_0x09cb:
            if (r1 != 0) goto L_0x0aff
            if (r3 == 0) goto L_0x0aff
            boolean r1 = r5.A5D()
            if (r1 == 0) goto L_0x0a06
            X.1Xy r1 = r5.A0C
            java.util.List r1 = r1.Alu()
            if (r1 == 0) goto L_0x0a06
            java.util.Iterator r11 = r1.iterator()
        L_0x09e1:
            boolean r1 = r11.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0a02
            java.lang.Object r9 = r11.next()
            r1 = r9
            X.1Xj r1 = (X.1Xj) r1
            X.1Xy r1 = r1.A0C
            X.4yz r1 = r1.Bek()
            if (r1 == 0) goto L_0x09fb
            java.lang.String r2 = r1.getProductId()
        L_0x09fb:
            boolean r1 = X.0qQ.A0K(r2, r3)
            if (r1 == 0) goto L_0x09e1
            r2 = r9
        L_0x0a02:
            X.1Xj r2 = (X.1Xj) r2
            if (r2 != 0) goto L_0x0a07
        L_0x0a06:
            r2 = r5
        L_0x0a07:
            X.1Xy r1 = r2.A0C
            X.4yz r13 = r1.Bek()
            r1 = 0
            if (r13 == 0) goto L_0x0aff
            java.lang.String r64 = r13.getProductId()
            java.lang.String r61 = r13.getName()
            java.lang.String r11 = r13.An9()
            java.lang.String r50 = r13.getCurrentPrice()
            java.lang.String r55 = r13.getExternalUrl()
            java.lang.String r56 = r13.getFullPrice()
            com.instagram.model.mediasize.ImageInfo r9 = r2.A1p()
            if (r9 == 0) goto L_0x0b7a
            com.instagram.model.mediasize.ImageInfoImpl r2 = r9.FEa()
            java.util.List r9 = r9.Al9()
            if (r9 == 0) goto L_0x0b77
            java.lang.Object r4 = X.00k.A0O(r9, r4)
            com.instagram.model.mediasize.ExtendedImageUrl r4 = (com.instagram.model.mediasize.ExtendedImageUrl) r4
            if (r4 == 0) goto L_0x0b77
            java.lang.String r9 = r4.A0A
        L_0x0a42:
            com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl r4 = new com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl
            r4.<init>(r2, r9)
        L_0x0a47:
            com.instagram.user.model.User r2 = r13.BRo()
            if (r2 == 0) goto L_0x0a85
            android.os.Parcelable$Creator r1 = com.instagram.user.model.User.CREATOR
            X.4Cl r1 = r2.A03
            java.lang.Boolean r23 = r1.Axg()
            boolean r1 = r2.isVerified()
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r1)
            X.4Cl r1 = r2.A03
            com.instagram.api.schemas.MerchantCheckoutStyle r20 = r1.BRp()
            java.lang.String r26 = r2.getId()
            com.instagram.common.typedurl.ImageUrl r22 = r2.Bh3()
            X.4Cl r1 = r2.A03
            com.instagram.api.schemas.SellerShoppableFeedType r21 = r1.BsB()
            X.4Cl r1 = r2.A03
            java.lang.Boolean r25 = r1.Bvx()
            X.4Cl r1 = r2.A03
            java.lang.String r27 = r1.getStorefrontAttributionUsername()
            java.lang.String r28 = r2.getUsername()
            com.instagram.user.model.User r1 = X.1aC.A02(r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x0a85:
            java.util.Map r2 = com.instagram.api.schemas.CheckoutStyle.A01
            java.lang.Object r2 = r2.get(r11)
            com.instagram.api.schemas.CheckoutStyle r2 = (com.instagram.api.schemas.CheckoutStyle) r2
            if (r2 != 0) goto L_0x0a91
            com.instagram.api.schemas.CheckoutStyle r2 = com.instagram.api.schemas.CheckoutStyle.UNRECOGNIZED
        L_0x0a91:
            java.lang.String r59 = X.AnonymousClass7TF.A0b()
            java.lang.Long r48 = X.C51968G9o.A0u()
            if (r4 == 0) goto L_0x0b73
            com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl r34 = r4.FFc()
        L_0x0a9f:
            com.instagram.user.model.ProductDetailsProductItemDict r4 = new com.instagram.user.model.ProductDetailsProductItemDict
            r20 = r4
            r21 = r2
            r22 = r12
            r23 = r12
            r24 = r12
            r25 = r12
            r26 = r12
            r27 = r12
            r28 = r12
            r29 = r12
            r30 = r12
            r31 = r12
            r32 = r12
            r33 = r12
            r35 = r12
            r36 = r12
            r37 = r1
            r38 = r12
            r39 = r12
            r40 = r12
            r41 = r12
            r42 = r12
            r43 = r12
            r44 = r12
            r45 = r12
            r46 = r12
            r47 = r12
            r49 = r12
            r51 = r12
            r52 = r12
            r53 = r12
            r54 = r12
            r57 = r12
            r58 = r12
            r60 = r12
            r62 = r12
            r63 = r12
            r65 = r12
            r66 = r12
            r67 = r12
            r68 = r12
            r69 = r12
            r70 = r12
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)
            com.instagram.user.model.Product r1 = new com.instagram.user.model.Product
            r1.<init>(r12, r4)
        L_0x0aff:
            java.lang.String r2 = "entry_point"
            if (r1 == 0) goto L_0x0b3e
            java.lang.String r3 = r1.A0H
            r0.A0f = r3
            X.3kF r18 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r4 = r0.A0z
            X.4DU r3 = r0.A12
            java.lang.String r23 = r8.getQueryParameter(r2)
            if (r23 == 0) goto L_0x1721
            r19 = r4
            r20 = r6
            r21 = r3
            r22 = r1
            r24 = r12
            X.WNN r2 = r18.A0L(r19, r20, r21, r22, r23, r24)
        L_0x0b21:
            r2.A0W = r10
            r1 = -1
            int r0 = r0.A09
            if (r1 == r0) goto L_0x0b3c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0b2c:
            r2.A02(r5, r0)
            r2.A0X = r7
            r2.A0Z = r7
            X.1Xj r0 = r2.A04
            if (r0 == 0) goto L_0x171c
            X.WNN.A01(r2)
            goto L_0x16b7
        L_0x0b3c:
            r0 = 0
            goto L_0x0b2c
        L_0x0b3e:
            if (r3 == 0) goto L_0x1730
            int r1 = r3.length()
            if (r1 == 0) goto L_0x1730
            X.3kF r18 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r4 = r0.A0z
            com.instagram.api.schemas.ProductReviewStatus r20 = com.instagram.api.schemas.ProductReviewStatus.APPROVED
            java.lang.String r24 = X.AnonymousClass595.A00(r15)
            if (r24 == 0) goto L_0x172b
            java.lang.String r25 = r14.getUsername()
            X.4DU r1 = r0.A12
            java.lang.String r26 = r8.getQueryParameter(r2)
            if (r26 == 0) goto L_0x1726
            r19 = r4
            r21 = r6
            r22 = r1
            r23 = r3
            r27 = r12
            X.WNN r2 = r18.A0K(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r1 = X.AnonymousClass595.A04(r15)
            r2.A0V = r1
            goto L_0x0b21
        L_0x0b73:
            r34 = r12
            goto L_0x0a9f
        L_0x0b77:
            r9 = r12
            goto L_0x0a42
        L_0x0b7a:
            r4 = r12
            goto L_0x0a47
        L_0x0b7d:
            r10 = 0
            goto L_0x09b8
        L_0x0b80:
            r1 = 0
            goto L_0x09a2
        L_0x0b83:
            if (r74 == 0) goto L_0x1762
            A00(r2, r15, r0)
            java.lang.String r1 = r15.Avj()
            if (r1 == 0) goto L_0x175d
            r14 = 0
            android.net.Uri r2 = X.DbT.A09(r1)
            r1 = 4613(0x1205, float:6.464E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r4 = r2.getQueryParameter(r1)
            if (r4 == 0) goto L_0x0bfb
            int r1 = r4.length()
            if (r1 == 0) goto L_0x0bfb
            X.UzB r3 = X.C16675UzB.PRODUCT_COLLECTION
        L_0x0ba7:
            r1 = 1150(0x47e, float:1.611E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r9 = r2.getQueryParameter(r1)
            if (r9 == 0) goto L_0x1758
            java.lang.String r1 = "business_username"
            java.lang.String r8 = r2.getQueryParameter(r1)
            if (r8 == 0) goto L_0x1753
            r1 = 72
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r1 = r2.getQueryParameter(r1)
            X.57K r2 = X.C17025VEz.A00(r1)
            X.3kF r10 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r1 = r0.A0z
            X.4DU r0 = r0.A12
            java.lang.String r15 = r0.getModuleName()
            r11 = r1
            r12 = r6
            r13 = r3
            X.Vk1 r1 = r10.A0J(r11, r12, r13, r14, r15)
            r1.A09 = r8
            r1.A08 = r9
            r1.A0D = r8
            java.lang.String r0 = r5.getId()
            r1.A07 = r0
            r1.A0F = r7
            X.UzB r0 = X.C16675UzB.PRODUCT_COLLECTION
            if (r3 != r0) goto L_0x0bf1
            if (r4 == 0) goto L_0x174e
            r1.A01(r2, r4)
        L_0x0bf1:
            X.UzB r0 = X.C16675UzB.PRODUCT_INSTANT_COLLECTION
            if (r3 != r0) goto L_0x120a
            java.lang.String r0 = "instant_collection"
            r1.A0A = r0
            goto L_0x1202
        L_0x0bfb:
            X.UzB r3 = X.C16675UzB.PRODUCT_INSTANT_COLLECTION
            goto L_0x0ba7
        L_0x0bfe:
            if (r74 == 0) goto L_0x17fd
            java.lang.String r8 = r15.Avj()
            if (r8 == 0) goto L_0x17f8
            r3 = 0
            android.net.Uri r9 = X.DbT.A09(r8)
            java.lang.String r31 = "app_id"
            r8 = r31
            java.lang.String r8 = r9.getQueryParameter(r8)
            if (r8 == 0) goto L_0x17f3
            int r9 = r8.hashCode()
            switch(r9) {
                case -1772578244: goto L_0x11c0;
                case -713377845: goto L_0x1126;
                case -451350420: goto L_0x10b2;
                case -344245188: goto L_0x0ec2;
                case 897070470: goto L_0x0e8c;
                case 966834417: goto L_0x0df5;
                case 1937695241: goto L_0x0d29;
                case 2046366777: goto L_0x0c23;
                default: goto L_0x0c1c;
            }
        L_0x0c1c:
            java.lang.String r0 = "Unexpected destination: "
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r8)
            throw r0
        L_0x0c23:
            r1 = 130(0x82, float:1.82E-43)
            java.lang.String r10 = X.C273654mx.A00(r1)
            boolean r1 = r8.equals(r10)
            if (r1 == 0) goto L_0x0c1c
            java.lang.String r8 = r15.Avj()
            java.lang.String r1 = "organic_shop_collection"
            X.SUD.A06(r2, r0, r1, r8)
            java.lang.String r1 = r15.Avj()
            if (r1 == 0) goto L_0x1771
            android.net.Uri r1 = X.DbT.A09(r1)
            java.lang.String r2 = "title"
            java.lang.String r2 = r1.getQueryParameter(r2)
            r8 = 77
            java.lang.String r13 = X.C273654mx.A00(r8)
            java.lang.String r11 = r1.getQueryParameter(r13)
            if (r11 == 0) goto L_0x176c
            X.3kF r9 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r8 = r0.A0z
            X.S54 r12 = r9.A0S(r8, r6, r11)
            java.lang.String r11 = "ad_id"
            java.lang.String r6 = r1.getQueryParameter(r11)
            r12.A00 = r6
            r6 = 44
            java.lang.String r9 = X.C273654mx.A00(r6)
            java.lang.String r6 = r1.getQueryParameter(r9)
            r12.A01 = r6
            java.lang.String r5 = r5.getId()
            r12.A02 = r5
            r5 = 346(0x15a, float:4.85E-43)
            java.lang.String r14 = X.AnonymousClass000.A00(r5)
            java.lang.String r5 = r1.getQueryParameter(r14)
            r12.A01(r5)
            X.4DU r0 = r0.A12
            java.lang.String r0 = r0.getModuleName()
            r12.A03 = r0
            java.lang.String r15 = "shopping_session_id"
            java.lang.String r0 = r1.getQueryParameter(r15)
            r12.A04 = r0
            r12.A05 = r2
            java.lang.String r8 = "tracking_token"
            java.lang.String r0 = r1.getQueryParameter(r8)
            r12.A06 = r0
            androidx.fragment.app.FragmentActivity r0 = r12.A08
            r6 = 465769516(0x1bc3142c, float:3.227308E-22)
            X.Ry8 r5 = new X.Ry8
            r5.<init>(r0)
            com.instagram.common.session.UserSession r0 = r12.A09
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r2.<init>((X.0lg) r0)
            java.lang.String r0 = r12.A05
            r2.A0U = r0
            r0 = 2131627865(0x7f0e0f59, float:1.8883006E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0N = r0
            java.lang.String r0 = "instagram_shopping_product_collection"
            r2.A0R = r0
            java.lang.String r0 = r12.A0A
            java.util.Map r1 = r5.A05
            r1.put(r13, r0)
            java.util.BitSet r13 = r5.A02
            r13.set(r4)
            java.lang.String r0 = r12.A00
            r1.put(r11, r0)
            java.lang.String r0 = r12.A01
            r1.put(r9, r0)
            java.lang.String r9 = r12.A02
            java.lang.String r0 = "media_id"
            r1.put(r0, r9)
            java.util.List r0 = r12.A07
            if (r0 == 0) goto L_0x0cee
            boolean r9 = r0.isEmpty()
            if (r9 != 0) goto L_0x0cee
            r1.put(r14, r0)
        L_0x0cee:
            java.lang.String r9 = r12.A03
            java.lang.String r0 = "prior_module"
            r1.put(r0, r9)
            java.lang.String r0 = r12.A04
            r1.put(r15, r0)
            java.lang.String r0 = r12.A06
            r1.put(r8, r0)
            java.lang.String r8 = "MOBILE"
            java.lang.String r0 = "layout_format"
            r1.put(r0, r8)
            int r0 = r13.nextClearBit(r4)
            if (r0 < r7) goto L_0x1767
            java.util.HashMap r1 = X.C359608dC.A01(r1)
            java.util.Map r0 = r5.A04
            X.DiU r1 = X.C46649DiU.A06(r10, r1, r0)
            X.C46649DiU.A0B(r1, r6)
            r1.A03 = r3
            r1.A02 = r3
            r1.A04 = r3
            java.util.Map r0 = r5.A03
            r1.A0H(r0)
            android.content.Context r0 = r5.A01
            goto L_0x0f9c
        L_0x0d29:
            java.lang.String r1 = "com.bloks.www.minishops.ad.dynamic.shop.collection"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0c1c
            java.lang.String r7 = r15.Avj()
            java.lang.String r1 = "mini_shop_collection"
            X.SUD.A06(r2, r0, r1, r7)
            java.lang.String r1 = r15.Avj()
            if (r1 == 0) goto L_0x177d
            android.net.Uri r2 = X.DbT.A09(r1)
            java.lang.String r1 = "title"
            java.lang.String r7 = r2.getQueryParameter(r1)
            java.lang.String r1 = "shopping_session_id"
            java.lang.String r13 = r2.getQueryParameter(r1)
            X.3kF r8 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r2 = r0.A0z
            r9 = r2
            r10 = r6
            r11 = r5
            r12 = r15
            X.RyO r5 = r8.A0H(r9, r10, r11, r12, r13)
            r5.A01 = r7
            X.4DU r0 = r0.A12
            java.lang.String r0 = r0.getModuleName()
            X.0qQ.A0B(r0, r4)
            r5.A00 = r0
            com.instagram.common.session.UserSession r7 = r5.A03
            java.lang.String r9 = "mini_shop_dynamic_collection"
            X.0wc r2 = X.DbW.A0J(r7, r9)
            java.lang.String r0 = "shops_dynamic_collection_page_entry"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r2, r0)
            boolean r0 = r6.isSampled()
            if (r0 == 0) goto L_0x0dc9
            r0 = 4647(0x1227, float:6.512E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.AAJ(r0, r9)
            X.327 r2 = new X.327
            r2.<init>()
            java.lang.String r0 = r5.A06
            r2.A06(r1, r0)
            java.lang.String r1 = r5.A00
            java.lang.String r0 = "prior_module"
            r2.A06(r0, r1)
            r0 = 3053(0xbed, float:4.278E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.AAK(r2, r0)
            X.UFq r4 = new X.UFq
            r4.<init>()
            X.1Xj r2 = r5.A04
            java.lang.String r1 = r2.getId()
            java.lang.String r0 = "m_pk"
            r4.A06(r0, r1)
            java.lang.String r1 = r2.A2v()
            java.lang.String r0 = "tracking_token"
            r4.A06(r0, r1)
            java.lang.String r0 = "ig_media_info"
            r6.AAK(r4, r0)
            r6.Cgf()
        L_0x0dc9:
            X.1Xj r2 = r5.A04
            com.instagram.model.androidlink.AndroidLink r1 = r5.A05
            java.lang.String r0 = r5.A00
            X.JwE r1 = X.SAZ.A01(r7, r2, r1, r0)
            if (r1 == 0) goto L_0x1776
            X.3kF r0 = X.C249713kF.A00
            X.W3Y r6 = r0.A0T()
            java.lang.String r8 = r1.A01
            java.lang.Object r11 = r1.A00
            java.util.HashMap r11 = (java.util.HashMap) r11
            java.lang.String r10 = r5.A01
            X.3M3 r2 = r6.A0C(r7, r8, r9, r10, r11)
            androidx.fragment.app.FragmentActivity r0 = r5.A02
            X.6Yo r1 = X.DbU.A0Q(r0, r7)
            r1.A0B(r3, r2)
        L_0x0df0:
            r1.A04()
            goto L_0x16b7
        L_0x0df5:
            r1 = 551(0x227, float:7.72E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r1)
            boolean r1 = r8.equals(r3)
            if (r1 == 0) goto L_0x0c1c
            java.lang.String r1 = r15.Avj()
            if (r1 == 0) goto L_0x1782
            android.net.Uri r4 = X.DbT.A09(r1)
            java.lang.String r1 = "merchant_id"
            java.lang.String r12 = r4.getQueryParameter(r1)
            java.lang.String r11 = "ad_id"
            java.lang.String r10 = r4.getQueryParameter(r11)
            java.lang.String r1 = "ad_tracking_token"
            java.lang.String r9 = r4.getQueryParameter(r1)
            if (r12 == 0) goto L_0x16b7
            if (r10 == 0) goto L_0x16b7
            if (r9 == 0) goto L_0x16b7
            X.4DU r1 = r0.A12
            java.lang.String r8 = r1.getModuleName()
            androidx.fragment.app.FragmentActivity r5 = r0.A0z
            r1 = 2584(0xa18, float:3.621E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r1)
            X.AnonymousClass7TG.A1R(r8, r5)
            java.util.LinkedHashMap r7 = X.AnonymousClass7TE.A1H()
            r1 = 5152(0x1420, float:7.22E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r7.put(r1, r12)
            r7.put(r11, r10)
            java.lang.String r1 = "ad_tracking_token_client_param"
            r7.put(r1, r9)
            java.lang.String r1 = "prop_prior_module_name"
            r7.put(r1, r8)
            java.lang.String r1 = "prop_entry_point"
            r7.put(r1, r4)
            com.instagram.bloks.hosting.IgBloksScreenConfig r4 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r4.<init>((X.0lg) r6)
            r4.A0R = r3
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            X.DiU r3 = X.C46649DiU.A06(r3, r1, r7)
            r1 = 1030(0x406, float:1.443E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.A05 = r1
            java.lang.Class<com.instagram.modal.ModalActivity> r11 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r9 = X.C49891FBs.A00(r4, r3)
            java.lang.String r12 = "bloks"
            X.6W8 r3 = new X.6W8
            r7 = r3
            r8 = r5
            r10 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            android.content.Context r1 = r5.getApplicationContext()
            r3.A0C(r1)
            java.lang.String r3 = r15.Avj()
            java.lang.String r1 = "deeplink"
            goto L_0x1674
        L_0x0e8c:
            r1 = 258(0x102, float:3.62E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0c1c
            java.lang.String r3 = r15.Avj()
            java.lang.String r1 = "mini_shop_collection"
            X.SUD.A06(r2, r0, r1, r3)
            java.lang.String r1 = r15.Avj()
            if (r1 == 0) goto L_0x1787
            android.net.Uri r8 = X.DbT.A09(r1)
            X.3kF r7 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r2 = r0.A0z
            X.4DU r1 = r0.A12
            com.instagram.model.reels.Reel r0 = r0.A0M
            boolean r13 = X.AnonymousClass7TF.A1V(r0)
            r9 = r2
            r10 = r6
            r11 = r5
            r12 = r1
            X.W2P r1 = r7.A0M(r8, r9, r10, r11, r12, r13)
            goto L_0x150b
        L_0x0ec2:
            java.lang.String r10 = "com.bloks.www.showcase_page"
            boolean r9 = r8.equals(r10)
            if (r9 == 0) goto L_0x0c1c
            java.lang.String r9 = r15.Avj()
            java.lang.String r8 = "dpa_showcase"
            X.SUD.A06(r2, r0, r8, r9)
            com.instagram.user.model.User r2 = r5.A2A(r6)
            if (r2 == 0) goto L_0x17d2
            java.lang.String r9 = r2.B8Q()
            androidx.fragment.app.FragmentActivity r11 = r0.A0z
            android.content.res.Resources r8 = r11.getResources()
            r2 = 2131961026(0x7f1324c2, float:1.9558737E38)
            java.lang.String r9 = X.AnonymousClass7TF.A0e(r8, r9, r2)
            X.0qQ.A07(r9)
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r2.<init>((X.0lg) r6)
            r2.A0k = r7
            X.2EG r8 = X.2EG.A1W
            java.lang.String r8 = r8.toString()
            r2.A0R = r8
            X.TzU r8 = new X.TzU
            r8.<init>(r9)
            r2.A04 = r8
            com.instagram.model.reels.Reel r8 = r0.A0M
            if (r8 == 0) goto L_0x0fa1
            r9 = 719983200(0x2aea1260, float:4.15795E-13)
            X.S4s r8 = new X.S4s
            r8.<init>(r11)
            java.lang.String r1 = X.C231122qu.A07(r6, r5)
            if (r1 == 0) goto L_0x17aa
            r8.A00(r1)
            java.lang.String r1 = r5.C9L()
            if (r1 == 0) goto L_0x17a5
            r8.A01(r1)
            java.lang.String r5 = r5.getId()
            if (r5 == 0) goto L_0x17a0
            java.util.Map r6 = r8.A04
            java.lang.String r1 = "media_id"
            r6.put(r1, r5)
            java.util.BitSet r1 = r8.A01
            r1.set(r7)
            com.instagram.model.reels.Reel r1 = r0.A0M
            if (r1 == 0) goto L_0x179b
            java.lang.String r5 = r1.getId()
            r1 = 3854(0xf0e, float:5.4E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.put(r1, r5)
            int r1 = r0.A0C
            java.lang.Long r5 = X.DbS.A0j(r1)
            r1 = 385(0x181, float:5.4E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r6.put(r1, r5)
            int r1 = r0.A0D
            java.lang.Long r5 = X.DbS.A0j(r1)
            r1 = 810(0x32a, float:1.135E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.put(r1, r5)
            java.lang.String r5 = r0.A0i
            if (r5 == 0) goto L_0x1796
            java.lang.String r1 = "tray_session_id"
            r6.put(r1, r5)
            java.lang.String r1 = r0.A0j
            if (r1 == 0) goto L_0x1791
            java.lang.String r0 = "viewer_session_id"
            r6.put(r0, r1)
        L_0x0f77:
            java.util.BitSet r0 = r8.A01
            int r1 = r0.nextClearBit(r4)
            r0 = 3
            if (r1 < r0) goto L_0x178c
            java.util.Map r0 = r8.A04
            java.util.HashMap r1 = X.C359608dC.A01(r0)
            java.util.Map r0 = r8.A03
            X.DiU r1 = X.C46649DiU.A06(r10, r1, r0)
            X.C46649DiU.A0B(r1, r9)
            r1.A03 = r3
            r1.A02 = r3
            r1.A04 = r3
            java.util.Map r0 = r8.A02
            r1.A0H(r0)
            android.content.Context r0 = r8.A00
        L_0x0f9c:
            r1.A0D(r0, r2)
            goto L_0x16b7
        L_0x0fa1:
            boolean r8 = r0.A03()
            if (r8 == 0) goto L_0x0feb
            X.3OA r1 = r0.A0O
            if (r1 == 0) goto L_0x16b7
            X.6zi r8 = X.C324676zi.A00
            java.lang.Class<X.6zj> r0 = X.C324686zj.class
            java.lang.Object r0 = r6.A01(r0, r8)
            X.6zj r0 = (X.C324686zj) r0
            java.lang.String r12 = X.AnonymousClass7TG.A0j()
            java.util.Map r0 = r0.A00
            r0.put(r12, r1)
            r9 = 719983200(0x2aea1260, float:4.15795E-13)
            X.S4s r8 = new X.S4s
            r8.<init>(r11)
            java.lang.String r0 = X.C231122qu.A07(r6, r5)
            if (r0 == 0) goto L_0x17b4
            r8.A00(r0)
            java.lang.String r0 = r5.C9L()
            if (r0 == 0) goto L_0x17af
            r8.A01(r0)
            java.util.Map r1 = r8.A04
            java.lang.String r0 = "tray_session_id"
            r1.put(r0, r12)
            java.lang.String r5 = r5.getId()
            if (r5 != 0) goto L_0x10a3
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x0feb:
            X.1Xy r8 = r5.A0C
            java.util.List r9 = r8.Alu()
            if (r9 == 0) goto L_0x104e
            int r8 = r0.A09
            java.lang.Object r8 = r9.get(r8)
            X.1Xj r8 = (X.1Xj) r8
            if (r8 == 0) goto L_0x104e
            X.1iA r9 = r8.BR7()
        L_0x1001:
            X.1iA r8 = X.1iA.A0U
            if (r9 != r8) goto L_0x1050
            X.1E8 r0 = X.1E7.A00(r6)
            r0.A01(r5, r7, r4)
            X.37D r0 = X.DbT.A0i(r11)
            if (r0 == 0) goto L_0x1015
            r0.A0B()
        L_0x1015:
            r9 = 719983200(0x2aea1260, float:4.15795E-13)
            X.S4s r8 = new X.S4s
            r8.<init>(r11)
            java.lang.String r0 = X.C231122qu.A07(r6, r5)
            if (r0 == 0) goto L_0x17c3
            r8.A00(r0)
            java.lang.String r0 = r5.C9L()
            if (r0 == 0) goto L_0x17be
            r8.A01(r0)
            java.lang.String r1 = r5.getId()
            if (r1 == 0) goto L_0x17b9
            java.util.Map r6 = r8.A04
            java.lang.String r0 = "media_id"
            r6.put(r0, r1)
            java.util.BitSet r0 = r8.A01
            r0.set(r7)
            java.lang.String r1 = r5.getId()
            java.lang.String r0 = "viewer_session_id"
            r6.put(r0, r1)
            goto L_0x0f77
        L_0x104e:
            r9 = r3
            goto L_0x1001
        L_0x1050:
            X.3OA r0 = r0.A0O
            if (r0 == 0) goto L_0x16b7
            java.util.List r8 = r0.A0l
            if (r8 == 0) goto L_0x16b7
            r8 = 36316216230416485(0x81056800001065, double:3.029859605556059E-306)
            boolean r1 = X.182.A06(r1, r6, r8)
            if (r1 == 0) goto L_0x16b7
            X.6zi r8 = X.C324676zi.A00
            java.lang.Class<X.6zj> r1 = X.C324686zj.class
            java.lang.Object r1 = r6.A01(r1, r8)
            X.6zj r1 = (X.C324686zj) r1
            java.lang.String r12 = X.AnonymousClass7TG.A0j()
            java.util.Map r1 = r1.A00
            r1.put(r12, r0)
            r9 = 719983200(0x2aea1260, float:4.15795E-13)
            X.S4s r8 = new X.S4s
            r8.<init>(r11)
            java.lang.String r0 = X.C231122qu.A07(r6, r5)
            if (r0 == 0) goto L_0x17cd
            r8.A00(r0)
            java.lang.String r0 = r5.C9L()
            if (r0 == 0) goto L_0x17c8
            r8.A01(r0)
            java.util.Map r1 = r8.A04
            java.lang.String r0 = "tray_session_id"
            r1.put(r0, r12)
            java.lang.String r5 = r5.getId()
            if (r5 != 0) goto L_0x10a3
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x10a3:
            java.util.Map r1 = r8.A04
            java.lang.String r0 = "media_id"
            r1.put(r0, r5)
            java.util.BitSet r0 = r8.A01
            r0.set(r7)
            goto L_0x0f77
        L_0x10b2:
            java.lang.String r1 = "bio.product.details.variants.page.controller"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0c1c
            java.lang.String r8 = r15.Avj()
            java.lang.String r1 = "clicktodirect"
            X.SUD.A06(r2, r0, r1, r8)
            com.instagram.bloks.hosting.IgBloksScreenConfig r9 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r9.<init>((X.0lg) r6)
            r1 = 57
            java.lang.String r11 = X.C66579MXk.A00(r1)
            r9.A0R = r11
            androidx.fragment.app.FragmentActivity r10 = r0.A0z
            java.util.HashMap r12 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.util.BitSet r13 = X.DbS.A0w(r7)
            java.lang.String r1 = r5.A2q()
            if (r1 != 0) goto L_0x10ea
            java.lang.String r1 = ""
        L_0x10ea:
            r0 = 332(0x14c, float:4.65E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r12.put(r0, r1)
            r13.set(r4)
            java.lang.String r1 = X.C231122qu.A07(r6, r5)
            java.lang.String r0 = "ad_id"
            r12.put(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "is_boosted"
            r12.put(r0, r1)
            int r0 = r13.nextClearBit(r4)
            if (r0 < r7) goto L_0x17d7
            X.DiU r1 = X.Pxf.A0T(r11, r12, r8)
            r0 = 719983200(0x2aea1260, float:4.15795E-13)
            X.C46649DiU.A0B(r1, r0)
            r1.A03 = r3
            r1.A02 = r3
            r1.A04 = r3
            r1.A0H(r2)
            r1.A0D(r10, r9)
            goto L_0x16b7
        L_0x1126:
            java.lang.String r9 = "com.bloks.www.bloks_application_direct_install"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x0c1c
            X.Rw5 r8 = X.C9263RVo.A00(r6)
            r8.A00 = r4
            java.lang.String r9 = r15.Avj()
            if (r9 == 0) goto L_0x17e9
            android.net.Uri r10 = X.DbT.A09(r9)
            androidx.fragment.app.FragmentActivity r9 = r0.A0z
            r41 = r9
            android.content.Context r30 = X.DbT.A05(r41)
            androidx.fragment.app.Fragment r12 = r0.A0y
            X.0xa r14 = r8.A02
            java.lang.String r13 = "AIS_AUTO_OPEN_KEY"
            X.RoX r8 = r8.A01
            com.instagram.common.session.UserSession r11 = r8.A00
            r8 = 36317131058516774(0x81063d00011326, double:3.030438146530399E-306)
            boolean r8 = X.182.A06(r1, r11, r8)
            boolean r29 = r14.getBoolean(r13, r8)
            java.lang.String r8 = "referrer_data"
            java.lang.String r40 = r10.getQueryParameter(r8)
            java.lang.String r28 = "dso_id"
            r8 = r28
            java.lang.String r27 = r10.getQueryParameter(r8)
            java.lang.String r8 = "application_id"
            java.lang.String r26 = r10.getQueryParameter(r8)
            java.lang.String r8 = "ais_surface"
            java.lang.String r25 = r10.getQueryParameter(r8)
            java.lang.String r8 = "package_name"
            java.lang.String r24 = r10.getQueryParameter(r8)
            java.lang.String r8 = "store_id"
            java.lang.String r8 = r10.getQueryParameter(r8)
            java.lang.String r23 = "tracking_token"
            r9 = r23
            java.lang.String r22 = r10.getQueryParameter(r9)
            if (r26 == 0) goto L_0x14b1
            if (r27 == 0) goto L_0x14b1
            if (r24 == 0) goto L_0x14b1
            if (r40 == 0) goto L_0x14b1
            if (r8 == 0) goto L_0x14b1
            if (r22 == 0) goto L_0x14b1
            X.QP5 r11 = new X.QP5
            r14 = r27
            r13 = r26
            r9 = r22
            r11.<init>(r14, r13, r9)
            java.lang.String r9 = "null cannot be cast to non-null type com.instagram.common.analytics.intf.AnalyticsModule"
            X.0qQ.A0C(r12, r9)
            X.0iw r12 = (X.AnonymousClass0iw) r12
            X.0wc r13 = X.AnonymousClass0kN.A01(r12, r6)
            X.02m r12 = X.C51965G9l.A0l()
            r12.markerStart(r4)
            java.lang.String r9 = r11.A00
            r33 = 0
            if (r9 == 0) goto L_0x1213
            goto L_0x120f
        L_0x11c0:
            java.lang.String r1 = "com.bloks.www.minishops.ad.collection"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0c1c
            java.lang.String r4 = r15.Avj()
            java.lang.String r1 = "mini_shop_collection"
            X.SUD.A06(r2, r0, r1, r4)
            java.lang.String r1 = r15.Avj()
            if (r1 == 0) goto L_0x17ee
            android.net.Uri r2 = X.DbT.A09(r1)
            java.lang.String r1 = "title"
            java.lang.String r2 = r2.getQueryParameter(r1)
            X.3kF r8 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r1 = r0.A0z
            X.4DU r0 = r0.A12
            java.lang.String r13 = r0.getModuleName()
            X.UzB r11 = X.C16675UzB.PRODUCT_INSTANT_COLLECTION
            r9 = r1
            r10 = r6
            r12 = r3
            X.Vk1 r1 = r8.A0J(r9, r10, r11, r12, r13)
            java.lang.String r0 = r5.getId()
            r1.A07 = r0
            r1.A0F = r7
            r1.A0H = r7
            r1.A0D = r2
        L_0x1202:
            boolean r0 = r5.A5H()
            if (r0 == 0) goto L_0x120a
            r1.A0E = r7
        L_0x120a:
            r1.A00()
            goto L_0x16b7
        L_0x120f:
            java.lang.Long r33 = X.DbV.A0q(r9)     // Catch:{ NumberFormatException -> 0x1213 }
        L_0x1213:
            java.lang.String r9 = r11.A01
            r34 = 0
            if (r9 == 0) goto L_0x121d
            java.lang.Long r34 = X.DbV.A0q(r9)     // Catch:{ NumberFormatException -> 0x121d }
        L_0x121d:
            java.lang.String r14 = r11.A03
            java.lang.String r9 = r11.A02
            X.Jw0 r11 = new X.Jw0
            r32 = r11
            r35 = r3
            r36 = r14
            r37 = r9
            r38 = r7
            r32.<init>(r33, r34, r35, r36, r37, r38)
            X.SOJ r9 = new X.SOJ
            r9.<init>(r13, r11, r12)
            com.facebook.quicklog.QuickPerformanceLogger r12 = r9.A04
            r11 = 279584123(0x10aa1d7b, float:6.70986E-29)
            r12.markerStart(r11, r4)
            r11 = 36316731626492531(0x8105e000001273, double:3.030185544109884E-306)
            X.182.A06(r1, r6, r11)
            java.util.concurrent.atomic.AtomicBoolean r11 = X.C10072Rm9.A00
            boolean r11 = r11.get()
            if (r11 != 0) goto L_0x1337
            boolean r11 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r11 != 0) goto L_0x1337
            java.lang.String r11 = "xiaomi"
            boolean r11 = r8.equals(r11)
            if (r11 == 0) goto L_0x12d8
            java.lang.String r11 = "market_package_name"
            java.lang.String r10 = r10.getQueryParameter(r11)
            if (r10 == 0) goto L_0x12d2
            java.lang.String r13 = "com.xiaomi.mipicks"
            boolean r10 = r10.equals(r13)
            if (r10 == 0) goto L_0x12d2
            android.content.pm.PackageManager r12 = r30.getPackageManager()
            X.0qQ.A0A(r12)
            java.lang.String r11 = "com.xiaomi.discover"
            java.lang.String r10 = "22.11.09.732"
            X.QP1 r11 = X.SMG.A00(r12, r11, r10)
            X.QP1 r10 = new X.QP1
            r10.<init>(r3, r4)
            boolean r10 = X.0qQ.A0K(r11, r10)
            if (r10 != 0) goto L_0x12d2
            java.lang.String r10 = "18.6.0"
            X.QP1 r11 = X.SMG.A00(r12, r13, r10)
            X.QP1 r10 = new X.QP1
            r10.<init>(r3, r4)
            boolean r10 = X.0qQ.A0K(r11, r10)
            if (r10 != 0) goto L_0x12d2
        L_0x1298:
            boolean r10 = r11.A00
            if (r10 == 0) goto L_0x1337
        L_0x129c:
            java.util.List r1 = r5.A3P()
            int r6 = r1.size()
            r1 = r17
            if (r6 >= r1) goto L_0x12c2
            X.RIq r6 = X.C8951RIq.OEM_FALLBACK_OEM_STORE_NOT_FOUND
            java.lang.String r1 = "FALLBACK_TO_OEM_LAYOUT"
            X.SOJ.A00(r6, r9, r3, r1, r3)
            r6 = 2131969037(0x7f13440d, float:1.9574986E38)
            r1 = r41
            X.C59689JTv.A01(r1, r3, r6, r4)
            r1 = r3
        L_0x12b8:
            X.Q02 r4 = new X.Q02
            r4.<init>(r0)
            r4.A03(r2, r5, r1, r3)
            goto L_0x16b7
        L_0x12c2:
            java.lang.String r1 = "FALLBACK_TO_OEM_LAYOUT"
            X.SOJ.A00(r3, r9, r3, r1, r3)
            java.util.List r1 = r5.A3P()
            java.lang.Object r1 = r1.get(r7)
            com.instagram.model.androidlink.AndroidLink r1 = (com.instagram.model.androidlink.AndroidLink) r1
            goto L_0x12b8
        L_0x12d2:
            X.QP1 r11 = new X.QP1
            r11.<init>(r3, r4)
            goto L_0x1298
        L_0x12d8:
            java.lang.String r11 = "galaxy_store"
            boolean r11 = r8.equals(r11)
            if (r11 == 0) goto L_0x1337
            java.lang.String r11 = "market_package_name"
            java.lang.String r10 = r10.getQueryParameter(r11)
            if (r10 == 0) goto L_0x1337
            java.lang.String r12 = "com.sec.android.app.samsungapps"
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto L_0x1337
            r14 = 0
            r13 = 0
            android.content.pm.PackageManager r10 = r30.getPackageManager()     // Catch:{ NameNotFoundException -> 0x1320 }
            if (r10 != 0) goto L_0x1303
            X.RIq r12 = X.C8951RIq.OEM_FALLBACK_INVALID_CONTEXT     // Catch:{ NameNotFoundException -> 0x1320 }
            X.JwA r11 = new X.JwA     // Catch:{ NameNotFoundException -> 0x1320 }
            r10 = r17
            r11.<init>((int) r4, (int) r10, (java.lang.Object) r12)     // Catch:{ NameNotFoundException -> 0x1320 }
            goto L_0x1331
        L_0x1303:
            android.content.pm.PackageManager r11 = r30.getPackageManager()     // Catch:{ NameNotFoundException -> 0x1320 }
            r10 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r10 = r11.getApplicationInfo(r12, r10)     // Catch:{ NameNotFoundException -> 0x1320 }
            X.0qQ.A07(r10)     // Catch:{ NameNotFoundException -> 0x1320 }
            android.os.Bundle r12 = r10.metaData     // Catch:{ NameNotFoundException -> 0x1320 }
            if (r12 == 0) goto L_0x132a
            java.lang.String r11 = "com.sec.android.app.samsungapps.GalaxyStoreDownloadService.vesrion"
            r10 = -1
            int r13 = r12.getInt(r11, r10)     // Catch:{ NameNotFoundException -> 0x1320 }
            if (r13 >= r7) goto L_0x132a
            X.RIq r14 = X.C8951RIq.OEM_FALLBACK_UNSUPPORTED_OEM_STORE_VERSION     // Catch:{ NameNotFoundException -> 0x1320 }
            goto L_0x132a
        L_0x1320:
            r12 = move-exception
            java.lang.String r11 = "DirectInstallSamsungUtil"
            java.lang.String r10 = "Fallback to old Samsung install API"
            X.0KC.A0F(r11, r10, r12)
            X.RIq r14 = X.C8951RIq.OEM_FALLBACK_OEM_STORE_NOT_FOUND
        L_0x132a:
            X.JwA r11 = new X.JwA
            r10 = r17
            r11.<init>((int) r13, (int) r10, (java.lang.Object) r14)
        L_0x1331:
            int r10 = r11.A01
            if (r10 >= r7) goto L_0x1337
            goto L_0x129c
        L_0x1337:
            r2 = 207(0xcf, float:2.9E-43)
            java.lang.String r2 = X.C273654mx.A00(r2)
            X.SOJ.A00(r3, r9, r3, r2, r3)
            X.SOL r11 = X.SBL.A00(r27)
            X.RqE r21 = new X.RqE
            r2 = r21
            r2.<init>(r6)
            X.RqF r20 = new X.RqF
            r2 = r20
            r2.<init>(r6)
            X.Rpv r14 = new X.Rpv
            r2 = r30
            r14.<init>(r2)
            r12 = 6
            java.lang.Object r13 = r11.A04
            monitor-enter(r13)
            X.QP0 r2 = r11.A02     // Catch:{ all -> 0x17e6 }
            int r10 = r2.A02     // Catch:{ all -> 0x17e6 }
            r2 = 12
            r18 = 1
            if (r10 == r2) goto L_0x1368
            goto L_0x13cd
        L_0x1368:
            monitor-exit(r13)
            android.content.pm.PackageManager r13 = r30.getPackageManager()
            r10 = 0
            if (r13 == 0) goto L_0x1379
            r2 = r24
            android.content.Intent r2 = r13.getLaunchIntentForPackage(r2)
            if (r2 == 0) goto L_0x1379
            r10 = 1
        L_0x1379:
            if (r18 == 0) goto L_0x137e
            if (r10 == 0) goto L_0x137e
            goto L_0x13d4
        L_0x137e:
            java.lang.String r37 = X.C9123RPv.A00
            if (r37 == 0) goto L_0x1388
            int r2 = r37.length()
            if (r2 != 0) goto L_0x139e
        L_0x1388:
            X.S2y r13 = new X.S2y     // Catch:{ Exception -> 0x139a }
            r2 = r30
            r13.<init>(r2)     // Catch:{ Exception -> 0x139a }
            java.lang.String r2 = r13.A00(r12)     // Catch:{ Exception -> 0x139a }
            java.lang.String r37 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x139a }
            X.C9123RPv.A00 = r37     // Catch:{ Exception -> 0x139a }
            goto L_0x139e
        L_0x139a:
            X.C9123RPv.A00 = r3
            r37 = r3
        L_0x139e:
            X.QP5 r33 = new X.QP5
            r34 = r27
            r35 = r26
            r36 = r22
            r33.<init>(r34, r35, r36, r37, r38)
            X.S3r r7 = new X.S3r
            r7.<init>(r11)
            X.RyS r2 = new X.RyS
            r32 = r2
            r34 = r7
            r35 = r9
            r36 = r14
            r37 = r21
            r38 = r20
            r39 = r24
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40)
            android.content.Context r12 = X.DbT.A05(r30)
            X.Jw2 r7 = new X.Jw2
            r7.<init>((android.content.Context) r12, (X.C10806RyS) r2, (java.lang.String) r8, (boolean) r10)
            r11.A00 = r7
            goto L_0x13d4
        L_0x13cd:
            r18 = 0
            r2 = 10
            if (r10 == r2) goto L_0x1368
            monitor-exit(r13)
        L_0x13d4:
            com.instagram.bloks.hosting.IgBloksScreenConfig r11 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r11.<init>((X.0lg) r6)
            java.lang.String r12 = "com.bloks.www.bloks_unified_application_direct_install"
            r11.A0R = r12
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r7 = X.AnonymousClass7TE.A1E()
            java.util.BitSet r2 = new java.util.BitSet
            r2.<init>(r4)
            r4 = r23
            r2 = r22
            r10.put(r4, r2)
            r4 = r28
            r2 = r27
            r10.put(r4, r2)
            r4 = r31
            r2 = r26
            r10.put(r4, r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r29)
            java.lang.String r2 = "auto_open_enabled"
            r10.put(r2, r4)
            if (r25 == 0) goto L_0x1415
            java.lang.String r4 = "app_surface"
            r2 = r25
            r10.put(r4, r2)
        L_0x1415:
            java.lang.String r2 = "NAVIGATION_FROM_NATIVE"
            r9.A01(r2)
            X.DiU r4 = X.Pxf.A0T(r12, r10, r8)
            r2 = 719983200(0x2aea1260, float:4.15795E-13)
            X.C46649DiU.A0B(r4, r2)
            r4.A03 = r3
            r4.A02 = r3
            r4.A04 = r3
            r4.A0H(r7)
            r2 = r41
            r4.A0E(r2, r11)
            r7 = 36316954964792021(0x810614000012d5, double:3.0303267841497924E-306)
            boolean r2 = X.182.A06(r1, r6, r7)
            java.lang.String r4 = ""
            if (r2 == 0) goto L_0x1469
            r7 = 36316954964857558(0x810614000112d6, double:3.030326784191238E-306)
            boolean r2 = X.182.A06(r1, r6, r7)
            if (r2 == 0) goto L_0x1469
            java.lang.String r10 = X.C231122qu.A07(r6, r5)
            if (r10 != 0) goto L_0x1451
            r10 = r4
        L_0x1451:
            android.content.Context r2 = X.DbT.A05(r41)
            X.215 r7 = X.213.A00(r2, r6)
            java.lang.String r9 = r15.CHl()
            if (r9 == 0) goto L_0x17e1
            java.lang.String r11 = r15.Avj()
            java.lang.String r12 = "direct_install"
            r8 = r3
            r7.A05(r8, r9, r10, r11, r12)
        L_0x1469:
            r2 = 36318166145570772(0x81072e000017d4, double:3.031092739751308E-306)
            boolean r2 = X.182.A06(r1, r6, r2)
            if (r2 == 0) goto L_0x16b7
            r2 = 36318166145636309(0x81072e000117d5, double:3.031092739792754E-306)
            boolean r1 = X.182.A06(r1, r6, r2)
            if (r1 == 0) goto L_0x16b7
            java.lang.String r3 = X.C231122qu.A07(r6, r5)
            com.instagram.model.reels.Reel r1 = r0.A0M
            if (r1 == 0) goto L_0x14a5
            java.lang.String r0 = r1.ByO(r6)
        L_0x148b:
            if (r0 == 0) goto L_0x148e
            r4 = r0
        L_0x148e:
            if (r3 == 0) goto L_0x16b7
            android.content.Context r0 = X.DbT.A05(r41)
            X.2I2 r2 = X.2I0.A00(r0, r6)
            java.lang.String r1 = r15.CHl()
            if (r1 == 0) goto L_0x17dc
            java.lang.String r0 = "direct_install"
            r2.A01(r1, r3, r4, r0)
            goto L_0x16b7
        L_0x14a5:
            X.3OA r0 = r0.A0O
            if (r0 == 0) goto L_0x14ac
            java.lang.String r0 = r0.A0j
            goto L_0x148b
        L_0x14ac:
            java.lang.String r0 = X.C231122qu.A0F(r6, r5)
            goto L_0x148b
        L_0x14b1:
            X.0wb r2 = X.0wb.A01
            java.lang.String r1 = "directInstall"
            java.lang.String r0 = "DirectInstallModel null due to missing direct install data"
            r2.Ew0(r1, r0)
            r2 = 2131969037(0x7f13440d, float:1.9574986E38)
            java.lang.String r1 = "open_link_generic_error"
            r0 = r41
            X.C59689JTv.A01(r0, r1, r2, r4)
            goto L_0x16b7
        L_0x14c7:
            if (r74 == 0) goto L_0x1811
            A00(r2, r15, r0)
            java.lang.String r1 = r15.Avj()
            if (r1 == 0) goto L_0x180c
            r23 = 0
            android.net.Uri r2 = X.DbT.A09(r1)
            java.lang.String r1 = "merchant_id"
            java.lang.String r26 = r2.getQueryParameter(r1)
            if (r26 == 0) goto L_0x1807
            java.lang.String r1 = "business_username"
            java.lang.String r27 = r2.getQueryParameter(r1)
            if (r27 == 0) goto L_0x1802
            X.3kF r18 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r2 = r0.A0z
            X.4DU r1 = r0.A12
            java.lang.String r24 = r1.getModuleName()
            com.instagram.api.schemas.SellerShoppableFeedType r20 = com.instagram.api.schemas.SellerShoppableFeedType.A06
            java.lang.String r25 = "ad_feed"
            r19 = r2
            r21 = r6
            r22 = r1
            X.W2P r1 = r18.A0N(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1.A03 = r5
            com.instagram.model.reels.Reel r0 = r0.A0M
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            r1.A0J = r0
        L_0x150b:
            r1.A05()
            goto L_0x16b7
        L_0x1510:
            if (r74 == 0) goto L_0x1816
            X.1Xy r1 = r5.A0C
            java.util.List r2 = r1.C0M()
            if (r2 == 0) goto L_0x1563
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x1563
            boolean r1 = r0.A0p
            if (r1 == 0) goto L_0x1563
            java.lang.Object r1 = r2.get(r4)
            com.instagram.feed.media.ReelCTAIntf r1 = (com.instagram.feed.media.ReelCTAIntf) r1
            java.util.List r2 = r1.Bfy()
            androidx.fragment.app.FragmentActivity r1 = r0.A0z
            com.instagram.model.androidlink.AndroidLink r1 = X.AnonymousClass47K.A01(r1, r6, r5, r2, r4)
        L_0x1534:
            X.6a7 r2 = r0.A0W
            if (r2 == 0) goto L_0x153b
            r2.A01()
        L_0x153b:
            X.3kF r4 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r3 = r0.A0z
            X.4DU r2 = r0.A12
            X.HrK r3 = r4.A0P(r3, r6, r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            r3.A07 = r2
            X.3W1 r2 = r0.A0K
            r3.A01 = r5
            r3.A02 = r2
            X.4gz r2 = r0.A11
            r3.A03 = r1
            r3.A00 = r2
            r2 = 13
            X.FmG r1 = new X.FmG
            r1.<init>(r0, r2)
            r3.A05 = r1
            r3.A00()
            goto L_0x16b7
        L_0x1563:
            r1 = 0
            goto L_0x1534
        L_0x1565:
            if (r74 == 0) goto L_0x182a
            X.47L r3 = X.C271714jT.A01(r15)
            X.47L r1 = X.AnonymousClass47L.AD_DESTINATION_AR_CAMERA
            boolean r1 = X.AnonymousClass7TF.A1W(r3, r1)
            X.17k.A0E(r1)
            com.instagram.user.model.User r8 = r5.A2A(r6)
            if (r8 == 0) goto L_0x1825
            java.lang.String r7 = r15.Avj()
            if (r7 == 0) goto L_0x1607
            r24 = 0
            android.net.Uri r1 = X.0cp.A03(r7)     // Catch:{ SecurityException -> 0x160c }
            java.lang.String r4 = r1.getHost()
            java.lang.String r3 = "ar_commerce"
            boolean r3 = X.0qQ.A0K(r4, r3)
            if (r3 == 0) goto L_0x1604
            java.lang.Integer r22 = X.AnonymousClass05K.A00
        L_0x1594:
            java.lang.String r3 = X.C9855RiU.A00(r15)
            X.SUD.A06(r2, r0, r3, r7)
            X.1ZN r18 = X.C297725sE.A00()
            androidx.fragment.app.FragmentActivity r2 = r0.A0z
            X.28D r20 = X.28D.A0P
            java.lang.String r0 = "effect_id"
            java.lang.String r23 = r1.getQueryParameter(r0)
            if (r23 == 0) goto L_0x1820
            java.lang.String r0 = "encoded_token"
            java.lang.String r25 = r1.getQueryParameter(r0)
            if (r25 == 0) goto L_0x181b
            r19 = r2
            r21 = r6
            X.ViY r2 = r18.A01(r19, r20, r21, r22, r23, r24, r25)
            r0 = 12
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.String r0 = r1.getQueryParameter(r0)
            r2.A02 = r0
            java.lang.String r0 = "mode"
            java.lang.String r0 = r1.getQueryParameter(r0)
            r2.A04 = r0
            java.lang.String r0 = r8.getUsername()
            r2.A07 = r0
            com.instagram.common.typedurl.ImageUrl r0 = r8.Bh3()
            java.lang.String r0 = r0.getUrl()
            r2.A06 = r0
            java.lang.String r0 = r5.getId()
            r2.A03 = r0
            java.lang.String r0 = "ad_impression_client_token"
            java.lang.String r0 = r1.getQueryParameter(r0)
            r2.A01 = r0
            java.lang.String r0 = "adgroup_id"
            java.lang.String r0 = r1.getQueryParameter(r0)
            r2.A00 = r0
            java.lang.String r0 = "product_id"
            java.lang.String r0 = r1.getQueryParameter(r0)
            r2.A05 = r0
            r2.A00()
            goto L_0x16b7
        L_0x1604:
            java.lang.Integer r22 = X.AnonymousClass05K.A01
            goto L_0x1594
        L_0x1607:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)     // Catch:{ SecurityException -> 0x160c }
            throw r0     // Catch:{ SecurityException -> 0x160c }
        L_0x160c:
            r1 = move-exception
            java.lang.String r0 = "arads_camera_url_handler"
            X.0wb.A07(r0, r1)
            goto L_0x16b7
        L_0x1614:
            if (r74 == 0) goto L_0x182f
            r10 = 10
            r9 = 7
            r8 = 126(0x7e, float:1.77E-43)
            X.1Xy r1 = r5.A0C
            X.3lZ r1 = r1.getInjected()
            if (r1 == 0) goto L_0x16b7
            X.3l8 r4 = r1.Ata()
            if (r4 == 0) goto L_0x16b7
            X.2EG r1 = r0.A13
            int r3 = r1.ordinal()
            if (r3 == r10) goto L_0x1684
            if (r3 == r9) goto L_0x1681
            if (r3 == r8) goto L_0x167e
            r1 = 118(0x76, float:1.65E-43)
            if (r3 == r1) goto L_0x167b
            r1 = 154(0x9a, float:2.16E-43)
            if (r3 == r1) goto L_0x1678
            r1 = 2254(0x8ce, float:3.159E-42)
        L_0x163f:
            java.lang.String r25 = X.C273654mx.A00(r1)
            X.1as r18 = X.1as.A04
            androidx.fragment.app.FragmentActivity r3 = r0.A0z
            java.lang.String r22 = r4.BEx()
            java.lang.String r23 = r4.BIn()
            r24 = 0
            java.lang.String r26 = X.C231122qu.A07(r6, r5)
            if (r26 != 0) goto L_0x1659
            java.lang.String r26 = ""
        L_0x1659:
            androidx.fragment.app.Fragment r4 = r0.A0y
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.common.analytics.intf.AnalyticsModule"
            X.0qQ.A0C(r4, r1)
            X.0iw r4 = (X.AnonymousClass0iw) r4
            r19 = r3
            r20 = r4
            r21 = r6
            r27 = r7
            r18.A04(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.String r3 = r15.Avj()
            java.lang.String r1 = "join_channel"
        L_0x1674:
            X.SUD.A06(r2, r0, r1, r3)
            goto L_0x16b7
        L_0x1678:
            r1 = 3251(0xcb3, float:4.556E-42)
            goto L_0x163f
        L_0x167b:
            r1 = 969(0x3c9, float:1.358E-42)
            goto L_0x163f
        L_0x167e:
            r1 = 3373(0xd2d, float:4.727E-42)
            goto L_0x163f
        L_0x1681:
            r1 = 2366(0x93e, float:3.315E-42)
            goto L_0x163f
        L_0x1684:
            r1 = 3468(0xd8c, float:4.86E-42)
            goto L_0x163f
        L_0x1687:
            A00(r2, r15, r0)
            java.lang.String r1 = r15.Avj()
            if (r1 == 0) goto L_0x1839
            android.net.Uri r2 = X.DbT.A09(r1)
            java.lang.String r1 = "user_id"
            java.lang.String r3 = r2.getQueryParameter(r1)
            if (r3 == 0) goto L_0x1834
            X.4DU r1 = r0.A12
            java.lang.String r1 = r1.getModuleName()
            X.Hq6 r2 = new X.Hq6
            r2.<init>(r6, r1)
            androidx.fragment.app.FragmentActivity r1 = r0.A0z
            java.lang.String r0 = "ad_cta_igtv_channel_link"
            r2.A00(r1, r3, r0)
            goto L_0x16b7
        L_0x16b0:
            java.lang.String r1 = X.C9855RiU.A00(r15)
            X.SUD.A09(r2, r15, r0, r1)
        L_0x16b7:
            r4 = 1
        L_0x16b8:
            X.Q4A r1 = X.Q4A.A00
            r0 = r71
            r0.A01(r1)
            if (r16 == 0) goto L_0x001b
            r2 = 1056313521(0x3ef610b1, float:0.4805961)
            r1 = r16
            r0 = r17
            r1.markerEnd(r2, r0)
            return r4
        L_0x16cc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x16d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x16d6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x16db:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x16e0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x16e5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x16ea:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x16ef:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x16f4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x16f9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x16fe:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1703:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1708:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x170d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1712:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1717:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x171c:
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        L_0x1721:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1726:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x172b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1730:
            java.lang.String r0 = "Product or product ID is not found"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x1737:
            java.lang.String r0 = "DeeplinkUri is null"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x173e:
            r0 = 487(0x1e7, float:6.82E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x1749:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x174e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1753:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1758:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x175d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1762:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1767:
            java.lang.IllegalStateException r0 = X.DbU.A0i()
            throw r0
        L_0x176c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1771:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1776:
            java.lang.String r0 = "bloksRequestInput cannot be null to be navigated"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x177d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1782:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1787:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x178c:
            java.lang.IllegalStateException r0 = X.DbU.A0i()
            throw r0
        L_0x1791:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1796:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x179b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x17a0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x17a5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x17aa:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x17af:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x17b4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x17b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x17be:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x17c3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x17c8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x17cd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x17d2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x17d7:
            java.lang.IllegalStateException r0 = X.DbU.A0i()
            throw r0
        L_0x17dc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x17e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x17e6:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x17e9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x17ee:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x17f3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x17f8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x17fd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1802:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1807:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x180c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1811:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1816:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x181b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1820:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1825:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x182a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x182f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1834:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x1839:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x183e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q02.A03(X.1Nv, X.1Xj, com.instagram.model.androidlink.AndroidLink, com.instagram.model.androidlink.AndroidLink):boolean");
    }
}
