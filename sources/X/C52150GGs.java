package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.GGs  reason: case insensitive filesystem */
public final class C52150GGs extends C251343mx {
    public final ClipsViewerConfig A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final JTB A03;
    public final C54588HJx A04;
    public final H3C A05;
    public final JTH A06;
    public final C59599JPt A07;
    public final C52080GEa A08;
    public final C52046GCs A09;
    public final GF2 A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C52150GGs(ClipsViewerConfig clipsViewerConfig, UserSession userSession, AnonymousClass4DU r4, JTB jtb, C54588HJx hJx, H3C h3c, JTH jth, C59599JPt jPt, C52080GEa gEa, C52046GCs gCs, GF2 gf2, boolean z, boolean z2) {
        0qQ.A0B(gEa, 1);
        C51974G9v.A1S(jth, userSession, r4, clipsViewerConfig, jPt);
        AnonymousClass7TF.A1F(jtb, 7, gCs);
        this.A08 = gEa;
        this.A06 = jth;
        this.A01 = userSession;
        this.A02 = r4;
        this.A00 = clipsViewerConfig;
        this.A07 = jPt;
        this.A03 = jtb;
        this.A09 = gCs;
        this.A0C = z;
        this.A0A = gf2;
        this.A05 = h3c;
        this.A0B = z2;
        this.A04 = hJx;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.0rh} */
    /* JADX WARNING: type inference failed for: r19v1 */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v5, types: [X.3mp] */
    /* JADX WARNING: type inference failed for: r26v5, types: [X.GHR] */
    /* JADX WARNING: type inference failed for: r26v6, types: [X.GId] */
    /* JADX WARNING: type inference failed for: r26v7, types: [X.GOt] */
    /* JADX WARNING: type inference failed for: r52v4, types: [X.GwR] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x007d, code lost:
        if (X.182.A06(X.DbS.A0J(r7, 0), r7, 36328495541927290L) == false) goto L_0x007f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r74) {
        /*
            r73 = this;
            r8 = 0
            r1 = r74
            X.0qQ.A0B(r1, r8)
            r2 = r73
            X.GEa r0 = r2.A08
            X.4bN r3 = r0.A02
            r65 = r3
            X.GDe r3 = r0.A03
            r70 = r3
            X.GEG r3 = r0.A01
            r49 = r3
            com.instagram.user.model.User r5 = r0.A05
            X.1Xj r15 = r0.A04
            X.4DU r3 = r2.A02
            r72 = r3
            java.lang.String r6 = r72.getModuleName()
            X.0rh r25 = new X.0rh
            r25.<init>()
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = r25
            r3.A00 = r4
            X.0rh r24 = new X.0rh
            r24.<init>()
            r3 = r24
            r3.A00 = r4
            X.JTH r3 = r2.A06
            r48 = r3
            r3 = 34
            X.JGB r4 = new X.JGB
            r4.<init>(r1, r3)
            r3 = r48
            r3.EeP(r4)
            r4 = 46
            X.Iw2 r3 = new X.Iw2
            r3.<init>(r4, r2, r5)
            X.2Wa r9 = X.C243643Zq.A00(r1, r3)
            r23 = 45
            r3 = r23
            X.Iw6 r3 = X.C58697Iw6.A00(r5, r9, r2, r3)
            X.0sa r61 = X.AnonymousClass3j0.A00(r1, r3)
            X.JPt r4 = r2.A07
            r3 = r65
            android.view.View$OnTouchListener r22 = r4.Da7(r3, r5, r6)
            boolean r3 = r65.CcK()
            r63 = 1
            if (r3 != 0) goto L_0x007f
            com.instagram.common.session.UserSession r7 = r2.A01
            X.0Tu r6 = X.DbS.A0J(r7, r8)
            r3 = 36328495541927290(0x81109300003d7a, double:3.037625091600311E-306)
            boolean r3 = X.182.A06(r6, r7, r3)
            r4 = 1
            if (r3 != 0) goto L_0x0080
        L_0x007f:
            r4 = 0
        L_0x0080:
            r21 = 0
            X.JwF r16 = new X.JwF
            r3 = r16
            r3.<init>(r4)
            X.JBg r51 = new X.JBg
            r52 = r15
            r53 = r5
            r54 = r2
            r55 = r1
            r56 = r65
            r57 = r24
            r58 = r70
            r59 = r3
            r60 = r25
            r62 = r8
            r51.<init>(r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)
            r20 = 1
            X.Iy3 r13 = new X.Iy3
            r62 = r13
            r64 = r2
            r66 = r25
            r67 = r24
            r68 = r5
            r69 = r1
            r71 = r61
            r62.<init>(r63, r64, r65, r66, r67, r68, r69, r70, r71)
            com.instagram.common.session.UserSession r3 = r2.A01
            X.0Tu r4 = X.0Tu.A05
            r6 = 36327877066701570(0x81100300013b02, double:3.0372339653771655E-306)
            boolean r11 = X.182.A06(r4, r3, r6)
            r41 = 3
            if (r11 == 0) goto L_0x0389
            java.lang.Object r6 = new java.lang.Object
            r6.<init>()
        L_0x00cd:
            r12 = 2
            java.lang.Object[] r10 = new java.lang.Object[]{r3, r5, r6}
            r7 = 35
            X.GL3 r6 = new X.GL3
            r6.<init>(r7, r5, r2, r11)
            java.lang.Object r6 = X.AnonymousClass3Zw.A00(r1, r6, r10)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r39 = r6.booleanValue()
            r10 = 36327877066767107(0x81100300023b03, double:3.0372339654186114E-306)
            boolean r10 = X.182.A06(r4, r3, r10)
            boolean r14 = r0.A0F
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r14)
            boolean r7 = r0.A0G
            java.lang.Boolean r29 = java.lang.Boolean.valueOf(r7)
            com.instagram.clips.intf.ClipsViewerConfig r7 = r2.A00
            r46 = r7
            r35 = 8
            if (r10 == 0) goto L_0x0385
            java.lang.Object r34 = new java.lang.Object
            r34.<init>()
        L_0x0105:
            r26 = r65
            r27 = r3
            r30 = r5
            r31 = r6
            r32 = r7
            r33 = r49
            java.lang.Object[] r7 = new java.lang.Object[]{r26, r27, r28, r29, r30, r31, r32, r33, r34}
            X.IoA r6 = new X.IoA
            r34 = r6
            r36 = r5
            r37 = r15
            r38 = r2
            r34.<init>(r35, r36, r37, r38, r39)
            java.lang.Object r6 = X.AnonymousClass3Zw.A00(r1, r6, r7)
            boolean r15 = X.AnonymousClass7TE.A1a(r6)
            X.H7j r10 = new X.H7j
            r6 = r65
            r10.<init>(r12, r13, r6, r2)
            r6 = 36327877066832644(0x81100300033b04, double:3.037233965460057E-306)
            boolean r6 = X.182.A06(r4, r3, r6)
            if (r6 == 0) goto L_0x0350
            X.GnL r7 = r0.A00
            X.GCs r11 = r2.A09
            java.lang.Object r10 = r9.A03
            com.instagram.model.reels.Reel r10 = (com.instagram.model.reels.Reel) r10
            boolean r6 = r2.A0B
            r62 = r6
            X.HJx r9 = r2.A04
            X.GwR r19 = new X.GwR
            r52 = r19
            r53 = r7
            r54 = r3
            r55 = r72
            r56 = r10
            r57 = r5
            r58 = r9
            r59 = r48
            r60 = r11
            r52.<init>(r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)
        L_0x0161:
            r10 = 0
            if (r15 == 0) goto L_0x018e
            r6 = 36327877066636033(0x81100300003b01, double:3.0372339653357197E-306)
            boolean r6 = X.182.A06(r4, r3, r6)
            if (r6 == 0) goto L_0x032d
            X.JMp r12 = r0.A08
            boolean r6 = r12 instanceof X.GEM
            if (r6 == 0) goto L_0x0324
            X.GEM r12 = (X.GEM) r12
            X.GF2 r7 = r2.A0A
            boolean r6 = r2.A0C
            X.GOt r10 = new X.GOt
            r26 = r10
            r27 = r72
            r28 = r3
            r29 = r48
            r30 = r12
            r31 = r7
            r32 = r6
            r26.<init>(r27, r28, r29, r30, r31, r32)
        L_0x018e:
            X.H7k r34 = new X.H7k
            r40 = r34
            r42 = r65
            r43 = r51
            r44 = r5
            r45 = r2
            r40.<init>(r41, r42, r43, r44, r45)
            X.JMu r6 = r0.A0C
            r47 = r6
            X.JMo r6 = r0.A07
            r17 = r6
            X.JMq r15 = r0.A09
            X.JMr r14 = r0.A0A
            X.JTB r13 = r2.A03
            X.JMw r12 = r0.A0D
            X.JMn r7 = r0.A06
            boolean r6 = r2.A0C
            X.GHT r18 = new X.GHT
            r26 = r18
            r27 = r22
            r28 = r16
            r29 = r10
            r30 = r49
            r31 = r46
            r32 = r70
            r33 = r3
            r35 = r72
            r36 = r13
            r37 = r9
            r38 = r48
            r39 = r7
            r40 = r48
            r41 = r17
            r42 = r48
            r43 = r15
            r44 = r48
            r45 = r14
            r46 = r48
            r49 = r12
            r50 = r11
            r52 = r62
            r53 = r6
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            X.JMs r9 = r0.A0B
            java.lang.String r6 = "null cannot be cast to non-null type instagram.features.clips.viewer.feature.clipsitem.feature.mediainfo.feature.authorinfo.feature.subscription.domain.SubscriptionUiState.UiState"
            X.0qQ.A0C(r9, r6)
            X.GER r9 = (X.GER) r9
            X.GHS r17 = new X.GHS
            r7 = r17
            r6 = r48
            r7.<init>(r6, r9)
            boolean r9 = r0.A0E
            if (r9 == 0) goto L_0x0321
            X.3XV r12 = X.2WX.A02
            X.3Ds r11 = X.C238863Ds.TITLE
            r13 = r65
            r14 = r3
            r15 = r72
            r16 = r62
            X.2WX r11 = X.GFM.A02(r11, r12, r13, r14, r15, r16)
        L_0x020b:
            r6 = r70
            X.3W1 r12 = r6.A0E
            if (r12 == 0) goto L_0x031d
            boolean r6 = r12.A2z
            if (r6 != 0) goto L_0x031d
            X.0Tu r13 = X.C51965G9l.A0Z(r3, r8)
            r6 = 36321584942360127(0x810a4a002b263f, double:3.033254800607286E-306)
            boolean r6 = X.182.A06(r13, r3, r6)
            if (r6 != 0) goto L_0x022a
            X.GJF r7 = r12.A0n
            X.GJF r6 = X.GJF.CLOSED
            if (r7 == r6) goto L_0x031d
        L_0x022a:
            X.3XV r6 = X.2WX.A02
            X.2V1 r7 = r1.A05
            if (r63 == 0) goto L_0x031a
            java.lang.String r13 = "userinfo"
        L_0x0232:
            X.3Zd r12 = X.C243533Zd.GLOBAL
            r6 = r21
            X.2WX r14 = X.C51971G9r.A0V(r7, r6, r12, r13)
            r13 = 0
            java.lang.Integer r16 = X.AnonymousClass05K.A0C
            r12 = r20
            r6 = r16
            X.2WX r14 = X.C51971G9r.A0X(r14, r6, r13, r12)
            java.lang.Integer r13 = X.AnonymousClass05K.A0D
            java.lang.String r12 = "clips_author_info_component"
            r6 = 4
            X.2WX r14 = X.C51971G9r.A0Y(r14, r13, r12, r6)
            r12 = 2131430044(0x7f0b0a9c, float:1.8481778E38)
            java.lang.Integer r13 = X.AnonymousClass05K.A0B
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            X.2WX r13 = X.C51971G9r.A0Y(r14, r13, r12, r6)
            r48 = 37
            X.IxF r12 = new X.IxF
            r47 = r12
            r49 = r65
            r50 = r2
            r52 = r5
            r47.<init>(r48, r49, r50, r51, r52)
            java.lang.Integer r2 = X.AnonymousClass05K.A1F
            if (r9 != 0) goto L_0x026f
            r12 = 0
        L_0x026f:
            X.2WX r12 = X.C51971G9r.A0Y(r13, r2, r12, r6)
            r5 = 23
            r2 = r22
            X.J6F r5 = X.J6F.A00(r2, r5)
            java.lang.Integer r2 = X.AnonymousClass05K.A04
            if (r9 != 0) goto L_0x0280
            r5 = 0
        L_0x0280:
            X.2WX r12 = X.C51971G9r.A0Y(r12, r2, r5, r6)
            r9 = r24
            r5 = r25
            r2 = r23
            X.J6R r5 = X.J6R.A00(r9, r5, r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A02
            X.2WX r2 = X.C51971G9r.A0Y(r12, r2, r5, r6)
            X.2WX r11 = r2.A00(r11)
            r5 = r19
            r2 = r18
            X.2Wb r9 = X.C51973G9u.A0J(r5, r2, r7)
            boolean r2 = r65.CcK()
            if (r2 != 0) goto L_0x0306
            r5 = 36330900723614539(0x8112c30000434b, double:3.039146138184216E-306)
            boolean r2 = X.182.A06(r4, r3, r5)
            if (r2 == 0) goto L_0x0306
            r2 = r65
            X.1Xj r2 = r2.A02
            if (r2 == 0) goto L_0x0318
            X.3gp r2 = r2.A1T()
            if (r2 == 0) goto L_0x0318
            android.content.Context r4 = X.C243803a8.A00(r1)
            long r2 = r2.A03
            java.lang.String r15 = X.1G0.A07(r4, r2)
            if (r15 == 0) goto L_0x0318
            android.content.Context r3 = r7.A0C
            r2 = 2130970311(0x7f0406c7, float:1.7549329E38)
            int r14 = X.C51972G9s.A0A(r3, r1, r2)
            long r4 = X.C244013aV.A04(r1)
            android.graphics.Typeface r13 = android.graphics.Typeface.DEFAULT
            long r2 = X.C51969G9p.A0D()
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            r6 = r21
            X.3ae r6 = X.C51971G9r.A0b(r7, r6, r15, r8)
            X.C51973G9u.A16(r1, r6, r14, r4)
            r6.A0R(r8)
            X.G9w.A11(r13, r1, r6, r2)
            r2 = r16
            r6.A0W(r2)
            r2 = r20
            X.C51974G9v.A15(r6, r12, r8, r2)
            X.C51969G9p.A1J(r6)
            r2 = r21
            r6.A05(r2)
            X.2WW r2 = r6.A0A()
        L_0x0303:
            r9.A00(r2)
        L_0x0306:
            boolean r0 = r0.A0L
            if (r0 != 0) goto L_0x0312
            r9.A00(r10)
        L_0x030d:
            X.2Tp r0 = X.C243563Zg.A0G(r9, r1, r11)
            return r0
        L_0x0312:
            r0 = r17
            r9.A00(r0)
            goto L_0x030d
        L_0x0318:
            r2 = 0
            goto L_0x0303
        L_0x031a:
            r13 = 0
            goto L_0x0232
        L_0x031d:
            r63 = 0
            goto L_0x022a
        L_0x0321:
            r11 = 0
            goto L_0x020b
        L_0x0324:
            boolean r6 = r12 instanceof X.C57644Ie9
            if (r6 != 0) goto L_0x018e
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x032d:
            X.JTB r13 = r2.A03
            X.GF2 r12 = r2.A0A
            X.H3C r7 = r2.A05
            boolean r6 = r2.A0C
            X.GId r10 = new X.GId
            r26 = r10
            r27 = r46
            r28 = r65
            r29 = r70
            r30 = r72
            r31 = r3
            r32 = r13
            r33 = r7
            r34 = r12
            r35 = r6
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x018e
        L_0x0350:
            X.GHR r19 = new X.GHR
            X.JTB r7 = r2.A03
            X.GCs r11 = r2.A09
            boolean r6 = r2.A0C
            java.lang.Object r12 = r9.A03
            com.instagram.model.reels.Reel r12 = (com.instagram.model.reels.Reel) r12
            boolean r9 = r2.A0B
            r62 = r9
            X.HJx r9 = r2.A04
            r26 = r19
            r27 = r22
            r28 = r46
            r29 = r65
            r30 = r3
            r31 = r10
            r32 = r72
            r33 = r12
            r34 = r5
            r35 = r7
            r36 = r9
            r37 = r11
            r38 = r14
            r39 = r6
            r40 = r62
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            goto L_0x0161
        L_0x0385:
            X.0gF r34 = X.C60340gF.A00
            goto L_0x0105
        L_0x0389:
            X.0gF r6 = X.C60340gF.A00
            goto L_0x00cd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52150GGs.A0X(X.3Y5):X.3mp");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (X.182.A06(X.AnonymousClass7TF.A0H(r3), r3, 36326584281479012L) == false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.0eP A00(android.view.View r7, X.2V1 r8, X.C267324bN r9, X.C52150GGs r10, float r11, float r12) {
        /*
            boolean r0 = r9.CcK()
            if (r0 == 0) goto L_0x0018
            com.instagram.common.session.UserSession r3 = r10.A01
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36326584281479012(0x810ed600003764, double:3.0364164027967916E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r2 = 1
            if (r0 != 0) goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            r3 = 0
            if (r2 == 0) goto L_0x008d
            if (r7 == 0) goto L_0x0099
            android.view.View r1 = r7.getRootView()
            if (r1 == 0) goto L_0x0099
            r0 = 2131430104(0x7f0b0ad8, float:1.84819E38)
        L_0x0027:
            android.view.View r7 = r1.findViewById(r0)
        L_0x002b:
            if (r2 == 0) goto L_0x005a
            com.instagram.common.session.UserSession r6 = r10.A01
            r5 = 0
            X.0Tu r4 = X.DbS.A0J(r6, r5)
            r0 = 37171009211662874(0x840ed60001021a, double:3.570434128871338E-306)
            long r0 = X.C51969G9p.A0I(r4, r6, r0)
            X.2V4 r2 = r8.A0D
            X.0qQ.A07(r2)
            int r0 = X.2Wd.A00(r2, r0)
            float r0 = (float) r0
            float r11 = r11 + r0
            X.0qQ.A0B(r6, r5)
            r0 = 37171009211793948(0x840ed60003021c, double:3.5704341289542296E-306)
            long r0 = X.C51969G9p.A0I(r4, r6, r0)
            int r0 = X.2Wd.A00(r2, r0)
            float r0 = (float) r0
            float r12 = r12 + r0
        L_0x005a:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x008b
            if (r7 == 0) goto L_0x008b
            int r0 = r7.getWidth()
            if (r0 == 0) goto L_0x008b
            float r0 = X.AnonymousClass7TE.A02(r7)
            float r11 = r11 / r0
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
        L_0x0071:
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0086
            if (r7 == 0) goto L_0x0086
            int r0 = r7.getHeight()
            if (r0 == 0) goto L_0x0086
            float r0 = X.AnonymousClass7TE.A03(r7)
            float r12 = r12 / r0
            java.lang.Float r3 = java.lang.Float.valueOf(r12)
        L_0x0086:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r3)
            return r0
        L_0x008b:
            r1 = r3
            goto L_0x0071
        L_0x008d:
            if (r7 == 0) goto L_0x0099
            android.view.View r1 = r7.getRootView()
            if (r1 == 0) goto L_0x0099
            r0 = 2131430044(0x7f0b0a9c, float:1.8481778E38)
            goto L_0x0027
        L_0x0099:
            r7 = r3
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52150GGs.A00(android.view.View, X.2V1, X.4bN, X.GGs, float, float):X.0eP");
    }
}
