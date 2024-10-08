package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

public final class GCT {
    public long A00;
    public C2357330z A01;
    public final C59544JNq A02;
    public final ClipsViewerConfig A03;
    public final UserSession A04;
    public final AnonymousClass4DU A05;
    public final AnonymousClass93T A06;
    public final C55684Hlh A07;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0086, code lost:
        if (X.182.A06(r7, r4, 36328246433823871L) == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
        if (X.182.A06(r7, r4, 36328246433954945L) == false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c0, code lost:
        if (X.182.A06(r7, r4, 36330870658843452L) != false) goto L_0x00c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(androidx.fragment.app.FragmentActivity r60, X.AnonymousClass5OB r61, X.C267324bN r62, X.C52058GDe r63, X.C273414mX r64, java.lang.Integer r65, java.lang.String r66, boolean r67, boolean r68, boolean r69) {
        /*
            r59 = this;
            r22 = r66
            r9 = 1
            r10 = r60
            X.0qQ.A0B(r10, r9)
            r6 = r62
            X.1Xj r8 = r6.A02
            if (r8 == 0) goto L_0x002a
            java.lang.String r19 = r8.getId()
            r5 = r59
            if (r19 != 0) goto L_0x002b
            X.0wj r3 = X.0wj.A01
            r2 = 817896325(0x30c01b85, float:1.397766E-9)
            X.4DU r0 = r5.A05
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "clips mediaId is null"
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.DbT.A1Q(r3, r0, r2)
        L_0x002a:
            return
        L_0x002b:
            com.instagram.common.session.UserSession r4 = r5.A04
            boolean r33 = X.2R8.A02(r4, r8)
            X.0Tu r7 = X.0Tu.A05
            r0 = 36323049523391265(0x810b9f00002b21, double:3.034181007548772E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            if (r0 == 0) goto L_0x004e
            long r2 = android.os.SystemClock.uptimeMillis()
            long r0 = r5.A00
            long r13 = r2 - r0
            r11 = 250(0xfa, double:1.235E-321)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x002a
            r5.A00 = r2
        L_0x004e:
            X.1Z0 r0 = X.AnonymousClass2BF.A00()
            X.4kW r3 = r0.A03()
            X.1Xj r2 = r6.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            r13 = 0
            r24 = 0
            X.GKD r0 = X.GKD.UNRECOGNIZED
            r37 = 0
            boolean r49 = r3.A01(r0, r4, r2, r1)
            boolean r0 = r6.CcK()
            if (r0 == 0) goto L_0x0088
            boolean r0 = r6.A0H()
            if (r0 != 0) goto L_0x0088
            com.instagram.user.model.User r0 = r6.A0K
            if (r0 == 0) goto L_0x0088
            boolean r0 = r0.A2Q()
            if (r0 != 0) goto L_0x0088
            r0 = 36328246433823871(0x81105900003c7f, double:3.037467554632631E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            r48 = 1
            if (r0 != 0) goto L_0x008a
        L_0x0088:
            r48 = 0
        L_0x008a:
            boolean r0 = r6.CcK()
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r6.A0H()
            if (r0 != 0) goto L_0x00ad
            com.instagram.user.model.User r0 = r6.A0K
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r0.A2Q()
            if (r0 != 0) goto L_0x00ad
            r0 = 36328246433954945(0x81105900023c81, double:3.0374675547155224E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            r58 = 1
            if (r0 != 0) goto L_0x00af
        L_0x00ad:
            r58 = 0
        L_0x00af:
            boolean r0 = r8.CcK()
            if (r0 == 0) goto L_0x00c2
            r0 = 36330870658843452(0x8112bc0000433c, double:3.03912712510192E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            r51 = 1
            if (r0 == 0) goto L_0x00c4
        L_0x00c2:
            r51 = 0
        L_0x00c4:
            X.Hlh r0 = r5.A07
            java.lang.String r2 = r0.A00
            X.4DU r0 = r5.A05
            java.lang.String r21 = r0.getModuleName()
            if (r66 == 0) goto L_0x00d6
            int r1 = r22.length()
            if (r1 != 0) goto L_0x00d8
        L_0x00d6:
            r22 = r13
        L_0x00d8:
            boolean r1 = r6.CcK()
            if (r1 == 0) goto L_0x00e6
            X.3OA r1 = r6.A06()
            java.lang.String r24 = X.C324666zh.A01(r4, r1)
        L_0x00e6:
            boolean r34 = r0.isOrganicEligible()
            boolean r35 = r0.isSponsoredEligible()
            r12 = r61
            if (r67 != 0) goto L_0x0101
            X.5OB r0 = X.AnonymousClass5OB.NOTIFICATIONS
            if (r12 != r0) goto L_0x01cb
            r0 = 36323032344505092(0x810b9b000f2b04, double:3.0341701435519824E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            if (r0 == 0) goto L_0x01cb
        L_0x0101:
            r36 = 1
        L_0x0103:
            X.93T r1 = r5.A06
            java.lang.String r25 = X.HWY.A00(r1)
            boolean r0 = r1 instanceof X.AnonymousClass93U
            if (r0 == 0) goto L_0x01c7
            java.lang.String r26 = r1.AmZ()
        L_0x0111:
            r0 = r63
            if (r63 == 0) goto L_0x01c4
            X.3W1 r1 = r0.A0E
            if (r1 == 0) goto L_0x01c4
            int r1 = r1.A03
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
        L_0x011f:
            X.5OB r1 = X.AnonymousClass5OB.REELS_PREVIEW_COMMENT
            boolean r40 = X.AnonymousClass7TF.A1W(r12, r1)
            boolean r41 = r8.A5v()
            int r32 = r8.A0r()
            boolean r50 = r8.A4l()
            if (r63 == 0) goto L_0x01c1
            X.JwJ r0 = r0.A0A
            if (r0 == 0) goto L_0x01c1
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x01c1
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3gp r0 = (X.C247733gp) r0
            if (r0 == 0) goto L_0x01c1
            boolean r1 = r0.A0N
            if (r1 == 0) goto L_0x01c1
            java.lang.String r0 = r0.A0G
            if (r0 == 0) goto L_0x01c1
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x01c1
            java.lang.Long r0 = X.C51968G9o.A0v(r0)
            java.util.List r31 = X.AnonymousClass7TE.A1I(r0)
        L_0x015b:
            com.instagram.clips.intf.ClipsViewerConfig r0 = r5.A03
            java.lang.Long r1 = r0.A0g
            if (r1 == 0) goto L_0x01be
            java.lang.String r28 = r1.toString()
        L_0x0165:
            java.lang.String r0 = r0.A0p
            java.lang.String r30 = X.AnonymousClass4LK.A03(r8)
            X.GmL r11 = new X.GmL
            r16 = r65
            r52 = r68
            r55 = r69
            r15 = r13
            r17 = r13
            r18 = r13
            r20 = r2
            r23 = r13
            r27 = r13
            r29 = r0
            r38 = r37
            r39 = r37
            r42 = r9
            r43 = r37
            r44 = r37
            r45 = r37
            r46 = r37
            r47 = r37
            r53 = r37
            r54 = r37
            r56 = r37
            r57 = r48
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            r0 = 36318771736287670(0x8107bb000519b6, double:3.0314757177591925E-306)
            boolean r14 = X.182.A06(r7, r4, r0)
            X.1Y4 r0 = X.C3018960m.A00()
            X.Hs6 r7 = r0.A00()
            X.JNq r0 = r5.A02
            boolean r16 = r8.CcK()
            r12 = r64
            r8 = r10
            r9 = r0
            r10 = r11
            r11 = r4
            r15 = r37
            r7.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x01be:
            r28 = r13
            goto L_0x0165
        L_0x01c1:
            r31 = r13
            goto L_0x015b
        L_0x01c4:
            r14 = r13
            goto L_0x011f
        L_0x01c7:
            r26 = 0
            goto L_0x0111
        L_0x01cb:
            r36 = 0
            goto L_0x0103
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCT.A00(androidx.fragment.app.FragmentActivity, X.5OB, X.4bN, X.GDe, X.4mX, java.lang.Integer, java.lang.String, boolean, boolean, boolean):void");
    }

    public GCT(C59544JNq jNq, ClipsViewerConfig clipsViewerConfig, UserSession userSession, AnonymousClass4DU r5, AnonymousClass93T r6, C55684Hlh hlh) {
        C51974G9v.A1P(userSession, hlh, r5, r6);
        0qQ.A0B(clipsViewerConfig, 5);
        this.A04 = userSession;
        this.A07 = hlh;
        this.A05 = r5;
        this.A06 = r6;
        this.A03 = clipsViewerConfig;
        this.A02 = jNq;
    }
}
