package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.47K  reason: invalid class name */
public abstract class AnonymousClass47K {
    public static final AndroidLink A00(Context context, UserSession userSession, 1Xj r4, String str, boolean z) {
        1Xj A1g;
        0qQ.A0B(context, 2);
        if (!r4.A5J() || str == null || (A1g = r4.A1g(str)) == null) {
            return A01(context, userSession, r4, r4.A3h(), z);
        }
        return A01(context, userSession, A1g, A1g.A3h(), z);
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [com.facebook.pando.TreeJNI, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.model.androidlink.AndroidLink A01(android.content.Context r51, com.instagram.common.session.UserSession r52, X.1Xj r53, java.util.List r54, boolean r55) {
        /*
            r0 = 0
            r2 = r53
            X.0qQ.A0B(r2, r0)
            r0 = 2
            r5 = r51
            X.0qQ.A0B(r5, r0)
            r0 = 3
            r3 = r52
            X.0qQ.A0B(r3, r0)
            r1 = r54
            r0 = r55
            com.instagram.model.androidlink.AndroidLink r4 = A03(r5, r3, r1, r0)
            r1 = 0
            if (r4 != 0) goto L_0x001e
            return r1
        L_0x001e:
            boolean r0 = X.1sx.A0T(r4)
            if (r0 == 0) goto L_0x0266
            boolean r0 = X.0oI.A0G(r5)
            if (r0 != 0) goto L_0x0266
            X.1Xy r0 = r2.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x0046
            X.3xm r0 = r0.Atd()
            if (r0 == 0) goto L_0x0046
            java.lang.Integer r1 = r0.B3r()
            java.util.Map r0 = X.C16590Uxk.A01
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L_0x0046
            X.Uxk r1 = X.C16590Uxk.UNDEFINED
        L_0x0046:
            X.Uxk r0 = X.C16590Uxk.INSTAGRAM_DIRECT
            if (r1 != r0) goto L_0x0266
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322216299735047(0x810add00002807, double:3.0336540735534574E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0266
            X.0wc r2 = X.AnonymousClass0kN.A02(r3)
            java.lang.String r3 = "ig_click_to_direct"
            java.lang.String r1 = "wa_cta_softmatching_deprecation_fallback_used"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            r0 = 413(0x19d, float:5.79E-43)
            X.1Ln r1 = new X.1Ln
            r1.<init>(r2, r0)
            X.0Aj r0 = r1.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = "fallback_destination"
            r1.A0R(r0, r3)
            r1.Cgf()
        L_0x007c:
            X.CwI r3 = r4.AKb()
            java.lang.String r4 = ""
            r3.A0F = r4
            java.lang.String r2 = "com.instagram.android"
            r3.A07 = r2
            X.47L r0 = X.AnonymousClass47L.AD_DESTINATION_DIRECT_MESSAGE
            int r0 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r3.A06 = r1
            com.instagram.model.androidlink.AndroidLink r5 = r3.A0R
            boolean r0 = r5 instanceof com.instagram.model.androidlink.ImmutablePandoAndroidLink
            if (r0 == 0) goto L_0x01f0
            com.facebook.pando.TreeUpdaterJNI r0 = com.facebook.pando.TreeUpdaterJNI.$redex_init_class
            java.lang.String r7 = r3.A08
            java.lang.String r6 = "androidClass"
            X.0eP r29 = new X.0eP
            r0 = r29
            r0.<init>(r6, r7)
            java.lang.String r7 = r3.A09
            java.lang.String r6 = "appId"
            X.0eP r28 = new X.0eP
            r0 = r28
            r0.<init>(r6, r7)
            java.lang.Integer r7 = r3.A04
            java.lang.String r6 = "appInstallObjectiveInvalidationBehavior"
            X.0eP r27 = new X.0eP
            r0 = r27
            r0.<init>(r6, r7)
            java.lang.String r7 = r3.A0A
            java.lang.String r6 = "appName"
            X.0eP r26 = new X.0eP
            r0 = r26
            r0.<init>(r6, r7)
            java.lang.String r7 = r3.A0B
            java.lang.String r6 = "callToActionTitle"
            X.0eP r25 = new X.0eP
            r0 = r25
            r0.<init>(r6, r7)
            java.lang.String r7 = r3.A0C
            java.lang.String r6 = "canvasData"
            X.0eP r24 = new X.0eP
            r0 = r24
            r0.<init>(r6, r7)
            java.lang.String r7 = r3.A0D
            java.lang.String r6 = "canvasDocId"
            X.0eP r23 = new X.0eP
            r0 = r23
            r0.<init>(r6, r7)
            java.lang.String r7 = r3.A0E
            java.lang.String r6 = "contentId"
            X.0eP r22 = new X.0eP
            r0 = r22
            r0.<init>(r6, r7)
            java.lang.String r6 = "deeplinkUri"
            X.0eP r21 = new X.0eP
            r0 = r21
            r0.<init>(r6, r4)
            java.lang.String r6 = r3.A0G
            java.lang.String r4 = "destinationContext"
            X.0eP r20 = new X.0eP
            r0 = r20
            r0.<init>(r4, r6)
            java.lang.String r6 = r3.A0H
            java.lang.String r4 = "funnelId"
            X.0eP r19 = new X.0eP
            r0 = r19
            r0.<init>(r4, r6)
            java.lang.Integer r6 = r3.A05
            java.lang.String r4 = "funnelPurpose"
            X.0eP r18 = new X.0eP
            r0 = r18
            r0.<init>(r4, r6)
            java.lang.String r6 = r3.A0I
            java.lang.String r4 = "igUserId"
            X.0eP r17 = new X.0eP
            r0 = r17
            r0.<init>(r4, r6)
            java.lang.Boolean r6 = r3.A00
            java.lang.String r4 = "isAndroidAppLink"
            X.0eP r16 = new X.0eP
            r0 = r16
            r0.<init>(r4, r6)
            java.lang.Boolean r4 = r3.A01
            java.lang.String r0 = "isSKOverlayEnabled"
            X.0eP r13 = new X.0eP
            r13.<init>(r0, r4)
            java.lang.Boolean r4 = r3.A02
            java.lang.String r0 = "isUniversalLink"
            X.0eP r12 = new X.0eP
            r12.<init>(r0, r4)
            java.lang.Boolean r4 = r3.A03
            java.lang.String r0 = "isVtOdirEligible"
            X.0eP r11 = new X.0eP
            r11.<init>(r0, r4)
            java.lang.String r4 = r3.A0J
            java.lang.String r0 = "leadGenFormId"
            X.0eP r10 = new X.0eP
            r10.<init>(r0, r4)
            java.lang.String r0 = "linkType"
            X.0eP r9 = new X.0eP
            r9.<init>(r0, r1)
            java.lang.String r0 = "package"
            X.0eP r14 = new X.0eP
            r14.<init>(r0, r2)
            java.lang.String r1 = r3.A0K
            java.lang.String r0 = "playableUri"
            X.0eP r15 = new X.0eP
            r15.<init>(r0, r1)
            java.lang.String r1 = r3.A0L
            java.lang.String r0 = "productPageId"
            X.0eP r8 = new X.0eP
            r8.<init>(r0, r1)
            java.lang.String r1 = r3.A0M
            java.lang.String r0 = "rawWebUri"
            X.0eP r7 = new X.0eP
            r7.<init>(r0, r1)
            java.lang.String r1 = r3.A0N
            java.lang.String r0 = "redirectUri"
            X.0eP r6 = new X.0eP
            r6.<init>(r0, r1)
            java.lang.String r1 = r3.A0O
            java.lang.String r0 = "referrerData"
            X.0eP r4 = new X.0eP
            r4.<init>(r0, r1)
            java.lang.String r1 = r3.A0P
            java.lang.String r0 = "tapAndHoldContext"
            X.0eP r2 = new X.0eP
            r2.<init>(r0, r1)
            java.lang.String r3 = r3.A0Q
            java.lang.String r1 = "webUri"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r3)
            r30 = r28
            r31 = r27
            r32 = r26
            r33 = r25
            r34 = r24
            r35 = r23
            r36 = r22
            r37 = r21
            r38 = r20
            r39 = r19
            r40 = r18
            r41 = r17
            r42 = r16
            r43 = r13
            r44 = r12
            r45 = r11
            r46 = r10
            r47 = r9
            r48 = r14
            r49 = r15
            r50 = r8
            r51 = r7
            r52 = r6
            r53 = r4
            r54 = r2
            r55 = r0
            X.0eP[] r0 = new X.0eP[]{r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55}
            java.util.LinkedHashMap r1 = X.0Yt.A06(r0)
            com.facebook.pando.TreeJNI r5 = (com.facebook.pando.TreeJNI) r5
            com.facebook.pando.TreeUpdaterJNI r0 = new com.facebook.pando.TreeUpdaterJNI
            r0.<init>(r1, r5)
            com.facebook.pando.TreeJNI r3 = r0.applyToTree(r5)
            X.0qQ.A07(r3)
        L_0x01ed:
            com.instagram.model.androidlink.AndroidLink r3 = (com.instagram.model.androidlink.AndroidLink) r3
            return r3
        L_0x01f0:
            java.lang.String r0 = r3.A08
            r24 = r0
            java.lang.String r0 = r3.A09
            r25 = r0
            java.lang.Integer r0 = r3.A04
            r21 = r0
            java.lang.String r0 = r3.A0A
            r26 = r0
            java.lang.String r0 = r3.A0B
            r27 = r0
            java.lang.String r0 = r3.A0C
            r28 = r0
            java.lang.String r0 = r3.A0D
            r29 = r0
            java.lang.String r0 = r3.A0E
            r30 = r0
            java.lang.String r0 = r3.A0G
            r19 = r0
            java.lang.String r0 = r3.A0H
            r18 = r0
            java.lang.Integer r0 = r3.A05
            r17 = r0
            java.lang.String r0 = r3.A0I
            r16 = r0
            java.lang.Boolean r15 = r3.A00
            java.lang.Boolean r14 = r3.A01
            java.lang.Boolean r13 = r3.A02
            java.lang.Boolean r12 = r3.A03
            java.lang.String r11 = r3.A0J
            java.lang.String r10 = r3.A0K
            java.lang.String r9 = r3.A0L
            java.lang.String r8 = r3.A0M
            java.lang.String r7 = r3.A0N
            java.lang.String r6 = r3.A0O
            java.lang.String r5 = r3.A0P
            java.lang.String r0 = r3.A0Q
            com.instagram.model.androidlink.AndroidLinkImpl r3 = new com.instagram.model.androidlink.AndroidLinkImpl
            r32 = r19
            r33 = r18
            r34 = r16
            r35 = r11
            r36 = r2
            r37 = r10
            r38 = r9
            r39 = r8
            r40 = r7
            r41 = r6
            r42 = r5
            r43 = r0
            r20 = r12
            r22 = r17
            r23 = r1
            r31 = r4
            r16 = r3
            r17 = r15
            r18 = r14
            r19 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            goto L_0x01ed
        L_0x0266:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass47K.A01(android.content.Context, com.instagram.common.session.UserSession, X.1Xj, java.util.List, boolean):com.instagram.model.androidlink.AndroidLink");
    }

    public static final AndroidLink A02(Context context, UserSession userSession, 1Xl r6, int i, boolean z) {
        List A3P;
        List A04;
        ImmutableList A01;
        1Xj r0;
        0qQ.A0B(context, 2);
        0qQ.A0B(userSession, 3);
        if (r6 != null) {
            if (r6 instanceof AnonymousClass3OA) {
                AnonymousClass3OA r1 = (AnonymousClass3OA) r6;
                if (!r1.A05()) {
                    r6 = null;
                }
                AnonymousClass3OA r62 = (AnonymousClass3OA) r6;
                if (r62 == null || (A01 = r62.A01()) == null || (r0 = (1Xj) 00k.A0O(A01, i)) == null) {
                    A04 = r1.A04();
                } else {
                    A04 = r0.A3P();
                }
                return A03(context, userSession, A04, z);
            }
            1Xj BPf = r6.BPf();
            if (BPf.CcK()) {
                if (BPf.A5v()) {
                    A3P = BPf.A3h();
                } else {
                    1Xj A1c = BPf.A1c(i);
                    if (!BPf.A5D() || A1c == null) {
                        A3P = BPf.A3P();
                    } else {
                        A3P = A1c.A3P();
                    }
                }
                return A01(context, userSession, BPf, A3P, z);
            }
        }
        return null;
    }

    public static final AndroidLink A03(Context context, UserSession userSession, List list, boolean z) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 3);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AndroidLink androidLink = (AndroidLink) it.next();
                if (AnonymousClass47L.AD_DESTINATION_DEEPLINK == C271714jT.A01(androidLink)) {
                    String CHl = androidLink.CHl();
                    if (!z) {
                        if (AnonymousClass5FF.A01(context, userSession, androidLink.Avj(), CHl, 0qQ.A0K(androidLink.COj(), true))) {
                        }
                    }
                }
                return androidLink;
            }
        }
        return null;
    }
}
