package X;

import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "This will be deleted after the CTA MVVM migration is completed. During the migration, please maintain the consistency of this legacy component with ClipsCTAComponent")
/* renamed from: X.GaX  reason: case insensitive filesystem */
public final class C52659GaX extends C251343mx {
    public final C267324bN A00;
    public final JTB A01;
    public final C62320sa A02;
    public final 0sK A03;
    public final GEG A04;
    public final C52058GDe A05;
    public final UserSession A06;
    public final AnonymousClass4DU A07;
    public final GZG A08;
    public final C51987GAk A09;
    public final JN6 A0A;
    public final JR2 A0B;
    public final C52046GCs A0C;
    public final Boolean A0D;
    public final Integer A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;

    private final C244023aW A04(float f, float f2, boolean z) {
        Integer num;
        C52046GCs gCs = this.A0C;
        C238863Ds r3 = C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON;
        if (!this.A00.A0E() || (num = this.A0E) == null) {
            num = null;
        }
        C58761Ix8 ix8 = new C58761Ix8(this, f, f2, 1, z);
        return GHY.A00(C56801ICy.A00(ix8, 67), r3, gCs.A00, num);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.0rh] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.0rh] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0062, code lost:
        r1 = r8.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0145, code lost:
        return new X.C53891Gvw(r8.A07, r4, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r26) {
        /*
            r25 = this;
            r4 = 0
            r11 = r26
            X.0qQ.A0B(r11, r4)
            X.0rh r2 = new X.0rh
            r2.<init>()
            X.0rh r6 = new X.0rh
            r6.<init>()
            X.3XV r5 = X.2WX.A02
            r0 = 25
            X.J6R r1 = X.J6R.A00(r6, r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            X.9JS r0 = X.C51968G9o.A0e(r0, r1)
            r10 = 0
            X.2WX r20 = X.C51965G9l.A0X(r10, r0)
            r8 = r25
            X.GEG r0 = r8.A04
            X.GJ5 r3 = r0.A00
            boolean r0 = r8.A0O
            if (r0 == 0) goto L_0x004b
            boolean r0 = r8.A0N
            if (r0 != 0) goto L_0x004b
            boolean r0 = r8.A0S
            if (r0 != 0) goto L_0x0176
            X.GJ5 r0 = X.GJ5.OVERLAY_AD
            if (r3 == r0) goto L_0x0176
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            long r1 = X.C244013aV.A0C(r11, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            X.2WX r0 = X.AnonymousClass9JR.A00(r10, r0, r4, r1)
            X.2Tp r5 = X.C243563Zg.A0L(r11, r0)
            return r5
        L_0x004b:
            float r1 = r2.A00
            float r0 = r6.A00
            X.3aW r9 = r8.A04(r1, r0, r4)
            float r2 = r2.A00
            float r1 = r6.A00
            r0 = 1
            X.3aW r17 = r8.A04(r2, r1, r0)
            X.4bN r0 = r8.A00
            X.1Xj r6 = r0.A02
            if (r6 == 0) goto L_0x0176
            X.GDe r1 = r8.A05
            X.3W1 r14 = r1.A0E
            if (r14 == 0) goto L_0x0176
            if (r3 == 0) goto L_0x0071
            int r2 = r3.ordinal()
            switch(r2) {
                case 0: goto L_0x0146;
                case 1: goto L_0x0146;
                case 2: goto L_0x007f;
                case 3: goto L_0x0071;
                case 4: goto L_0x010f;
                case 5: goto L_0x0071;
                case 6: goto L_0x0071;
                case 7: goto L_0x0071;
                case 8: goto L_0x0071;
                case 9: goto L_0x00e5;
                case 10: goto L_0x00c9;
                case 11: goto L_0x0105;
                case 12: goto L_0x0124;
                case 13: goto L_0x0176;
                case 14: goto L_0x012e;
                default: goto L_0x0071;
            }
        L_0x0071:
            java.lang.String r0 = r8.A0H
            r12 = r10
            r13 = r10
            r15 = r10
            r16 = r0
            r17 = r4
            X.2Tp r5 = r8.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r5
        L_0x007f:
            X.JTB r6 = r8.A01
            r2 = 33
            X.InR r5 = new X.InR
            r5.<init>(r6, r2)
            X.0sa r4 = r8.A02
            r3 = 34
            X.InR r2 = new X.InR
            r2.<init>(r6, r3)
            X.Hmo r7 = new X.Hmo
            r7.<init>(r4, r5, r2)
            com.instagram.common.session.UserSession r6 = r8.A06
            X.GAk r2 = r8.A09
            if (r2 == 0) goto L_0x00b3
            android.content.Context r11 = r2.A01
            com.instagram.common.session.UserSession r12 = r2.A03
            java.lang.String r3 = r2.A0J
            X.4DU r14 = r2.A06
            X.93U r15 = r2.A07
            X.2el r13 = r2.A04
            java.util.List r2 = r2.A0K
            X.ILo r10 = new X.ILo
            r16 = r3
            r17 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
        L_0x00b3:
            X.4DU r4 = r8.A07
            boolean r3 = r8.A0M
            java.lang.String r2 = r8.A0I
            X.GwX r5 = new X.GwX
            r8 = r5
            r9 = r10
            r10 = r0
            r11 = r1
            r12 = r6
            r13 = r4
            r14 = r7
            r15 = r2
            r16 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r5
        L_0x00c9:
            com.instagram.common.session.UserSession r3 = r8.A06
            com.instagram.user.model.UpcomingEvent r11 = r6.A27(r3)
            X.GAk r2 = r8.A09
            if (r2 == 0) goto L_0x00d7
            X.ILn r10 = r2.A00()
        L_0x00d7:
            X.JTB r2 = r8.A01
            X.Gum r5 = new X.Gum
            r6 = r10
            r7 = r0
            r8 = r1
            r9 = r3
            r10 = r14
            r12 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        L_0x00e5:
            boolean r2 = X.AnonymousClass3ZC.A0X(r6)
            if (r2 != 0) goto L_0x0176
            X.GAk r2 = r8.A09
            if (r2 == 0) goto L_0x00f3
            X.ILn r10 = r2.A00()
        L_0x00f3:
            X.JTB r3 = r8.A01
            com.instagram.common.session.UserSession r2 = r8.A06
            r12 = 0
            X.Gv5 r5 = new X.Gv5
            r6 = r10
            r7 = r0
            r8 = r1
            r9 = r2
            r10 = r14
            r11 = r3
            r13 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r5
        L_0x0105:
            X.JTB r1 = r8.A01
            com.instagram.common.session.UserSession r0 = r8.A06
            X.Gt7 r5 = new X.Gt7
            r5.<init>(r0, r6, r1)
            return r5
        L_0x010f:
            X.JTB r3 = r8.A01
            X.GAk r2 = r8.A09
            if (r2 == 0) goto L_0x0117
            X.GBA r10 = r2.A05
        L_0x0117:
            com.instagram.common.session.UserSession r2 = r8.A06
            X.GuB r5 = new X.GuB
            r6 = r10
            r7 = r0
            r8 = r1
            r9 = r2
            r10 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L_0x0124:
            com.instagram.common.session.UserSession r4 = r8.A06
            X.JTB r1 = r8.A01
            X.HK3 r9 = new X.HK3
            r9.<init>(r0, r4, r1)
            goto L_0x013e
        L_0x012e:
            com.instagram.common.session.UserSession r4 = r8.A06
            X.JN6 r3 = r8.A0A
            X.JR2 r2 = r8.A0B
            X.HK2 r9 = new X.HK2
            r10 = r0
            r11 = r1
            r12 = r4
            r13 = r3
            r14 = r2
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x013e:
            X.4DU r0 = r8.A07
            X.Gvw r5 = new X.Gvw
            r5.<init>(r0, r4, r9)
            return r5
        L_0x0146:
            com.instagram.common.session.UserSession r4 = r8.A06
            X.3Ds r3 = X.C51974G9v.A06(r4)
            X.4DU r2 = r8.A07
            X.2WX r19 = X.GFM.A01(r3, r5, r0, r4, r2)
            java.lang.String r3 = r8.A0H
            if (r3 != 0) goto L_0x015c
            X.3OA r0 = r0.A06()
            java.lang.String r3 = r0.A0b
        L_0x015c:
            X.GZG r2 = r8.A08
            X.HMA r1 = r1.A0B
            X.HMA r0 = X.HMA.REMIND_ME_PENDING
            boolean r24 = X.AnonymousClass7TF.A1W(r1, r0)
            r15 = r8
            r16 = r9
            r18 = r11
            r21 = r14
            r22 = r2
            r23 = r3
            X.2Tp r10 = r15.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r10
        L_0x0176:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52659GaX.A0X(X.3Y5):X.3mp");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00de, code lost:
        if (r0.A0N == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0105, code lost:
        if (X.182.A06(r2, r1, 36326240684291733L) == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a7, code lost:
        if (X.182.A06(r3, r1, 36326137606125109L) == false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x009f, code lost:
        if (X.182.A06(X.0Tu.A06, r1, 36321584942294590L) == false) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.2Tp A00(android.view.View.OnClickListener r75, android.view.View.OnClickListener r76, X.C70832Wc r77, X.2WX r78, X.2WX r79, X.AnonymousClass3W1 r80, X.GZG r81, java.lang.String r82, boolean r83) {
        /*
            r74 = this;
            r0 = r74
            boolean r1 = r0.A0S
            r42 = r1
            r5 = 0
            float r4 = X.C51971G9r.A00(r42)
            X.3XV r1 = X.2WX.A02
            X.3Zh r2 = X.C243573Zh.CENTER
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.9JS r1 = X.C51968G9o.A0d(r1, r2)
            r11 = 0
            X.2WX r3 = X.C51965G9l.A0X(r11, r1)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r1 = 1
            X.9JQ r1 = X.C51965G9l.A0b(r2, r4, r1)
            X.2WX r1 = X.C51974G9v.A0C(r3, r1, r5)
            r2 = r78
            X.2WX r10 = r1.A00(r2)
            r73 = r77
            X.2V1 r1 = r73.Aqq()
            X.2Wb r8 = X.AnonymousClass7TG.A0S(r1)
            boolean r1 = r0.A0P
            if (r1 != 0) goto L_0x01f3
            java.lang.String r1 = r0.A0L
            r27 = r1
            java.lang.String r1 = r0.A0K
            r28 = r1
            boolean r1 = r0.A0M
            r37 = r1
            java.lang.Boolean r1 = r0.A0D
            r24 = r1
            java.lang.String r1 = r0.A0G
            r30 = r1
            X.4DU r1 = r0.A07
            r71 = r1
            java.lang.String r1 = r0.A0F
            r31 = r1
            boolean r9 = r0.A0e
            r38 = r9 ^ 1
            boolean r1 = r0.A0V
            r7 = 0
            if (r1 == 0) goto L_0x020d
            r19 = 0
        L_0x0060:
            com.instagram.common.session.UserSession r1 = r0.A06
            X.0Tu r2 = X.DbS.A0J(r1, r7)
            r3 = 36328972283297482(0x81110200003eca, double:3.0379265847625035E-306)
            boolean r68 = X.182.A06(r2, r1, r3)
            r3 = 36328972283363019(0x81110200013ecb, double:3.0379265848039494E-306)
            boolean r69 = X.182.A06(r2, r1, r3)
            boolean r3 = r0.A0Q
            r40 = r3
            boolean r3 = r0.A0d
            r41 = r3
            boolean r3 = r0.A0U
            r44 = r3
            boolean r3 = r0.A0T
            r45 = r3
            r72 = r80
            r3 = r72
            X.GJF r4 = r3.A0n
            X.GJF r3 = X.GJF.CLOSED
            if (r4 != r3) goto L_0x00a1
            X.0Tu r5 = X.0Tu.A06
            r3 = 36321584942294590(0x810a4a002a263e, double:3.03325480056584E-306)
            boolean r3 = X.182.A06(r5, r1, r3)
            r46 = 0
            if (r3 != 0) goto L_0x00a3
        L_0x00a1:
            r46 = 1
        L_0x00a3:
            java.lang.String r3 = r0.A0J
            r33 = r3
            X.4bN r6 = r0.A00
            java.lang.Integer r25 = X.AnonymousClass71K.A00(r6, r1)
            boolean r3 = r0.A0X
            r47 = r3
            boolean r3 = r0.A0b
            r22 = r3
            boolean r3 = r0.A0Y
            r21 = r3
            boolean r3 = r0.A0a
            r20 = r3
            boolean r15 = r0.A0W
            boolean r14 = r0.A0Z
            boolean r13 = r0.A0c
            boolean r12 = r0.A0R
            X.GDe r4 = r0.A05
            com.instagram.clips.intf.ClipsViewerSource r3 = X.AnonymousClass5M0.A01(r71)
            boolean r55 = X.AnonymousClass71K.A02(r3, r4, r1)
            r3 = 36325325856060278(0x810db100003376, double:3.035620569494712E-306)
            boolean r3 = X.182.A06(r2, r1, r3)
            if (r3 == 0) goto L_0x00e0
            boolean r3 = r0.A0N
            r56 = 1
            if (r3 != 0) goto L_0x00e2
        L_0x00e0:
            r56 = 0
        L_0x00e2:
            r3 = 36325940036384135(0x810e4000003587, double:3.0360089796046246E-306)
            boolean r58 = X.182.A06(r2, r1, r3)
            r3 = 36325940036449672(0x810e4000013588, double:3.0360089796460705E-306)
            boolean r59 = X.182.A06(r2, r1, r3)
            boolean r3 = r6.CcK()
            if (r3 == 0) goto L_0x0107
            r3 = 36326240684291733(0x810e8600033695, double:3.0361991105520015E-306)
            boolean r3 = X.182.A06(r2, r1, r3)
            r60 = 1
            if (r3 != 0) goto L_0x0109
        L_0x0107:
            r60 = 0
        L_0x0109:
            r3 = 2342158134524382209(0x2081046a001e0c01, double:4.061452557209314E-152)
            boolean r61 = X.182.A06(r2, r1, r3)
            X.0Tu r3 = X.0Tu.A06
            r4 = 36328053160360866(0x81102c00013ba2, double:3.0373453277163766E-306)
            boolean r62 = X.182.A06(r3, r1, r4)
            boolean r4 = r6.CcK()
            if (r4 == 0) goto L_0x0209
            boolean r4 = r6.A0H()
            if (r4 != 0) goto L_0x0209
            r4 = 36328280793562295(0x81106100003cb7, double:3.0374892838695656E-306)
            boolean r63 = X.182.A06(r2, r1, r4)
        L_0x0132:
            boolean r4 = r6.CcK()
            if (r4 == 0) goto L_0x0205
            boolean r4 = r6.A0H()
            if (r4 != 0) goto L_0x0205
            r4 = 36328280793889978(0x81106100053cba, double:3.0374892840767936E-306)
            boolean r64 = X.182.A06(r2, r1, r4)
        L_0x0147:
            boolean r4 = r6.CcK()
            if (r4 == 0) goto L_0x0201
            boolean r4 = r6.A0H()
            if (r4 != 0) goto L_0x0201
            r4 = 36328280793955515(0x81106100063cbb, double:3.0374892841182395E-306)
            boolean r65 = X.182.A06(r2, r1, r4)
        L_0x015c:
            boolean r4 = r6.CcK()
            if (r4 == 0) goto L_0x01fd
            boolean r4 = r6.A0H()
            if (r4 != 0) goto L_0x01fd
            r4 = 36328280793627832(0x81106100013cb8, double:3.0374892839110115E-306)
            boolean r66 = X.182.A06(r2, r1, r4)
        L_0x0171:
            boolean r4 = r6.CcK()
            if (r4 == 0) goto L_0x01fa
            boolean r4 = r6.A0H()
            if (r4 != 0) goto L_0x01fa
            r4 = 36328280793693369(0x81106100023cb9, double:3.0374892839524573E-306)
            boolean r67 = X.182.A06(r2, r1, r4)
        L_0x0186:
            X.0eP r34 = X.AnonymousClass71K.A01(r6, r1)
            boolean r2 = r6.CcK()
            if (r2 == 0) goto L_0x01a9
            boolean r2 = X.GEK.A00(r6)
            if (r2 != 0) goto L_0x01a9
            boolean r2 = X.GEK.A01(r6)
            if (r2 != 0) goto L_0x01a9
            r4 = 36326137606125109(0x810e6e00133635, double:3.036133923504366E-306)
            boolean r2 = X.182.A06(r3, r1, r4)
            r70 = 1
            if (r2 != 0) goto L_0x01ab
        L_0x01a9:
            r70 = 0
        L_0x01ab:
            r4 = 36607612582893152(0x820e6e00141660, double:3.214139832221234E-306)
            int r2 = X.DbS.A04(r3, r1, r4)
            android.view.animation.OvershootInterpolator r1 = X.C52646GaK.A0u
            r1 = 33
            X.IwE r35 = X.C58705IwE.A01(r0, r1)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r2)
            r36 = 2147483647(0x7fffffff, float:NaN)
            X.GaK r0 = new X.GaK
            r16 = r75
            r17 = r76
            r18 = r79
            r23 = r81
            r29 = r82
            r57 = r83
            r32 = r11
            r39 = r7
            r43 = r9
            r48 = r22
            r49 = r21
            r50 = r20
            r51 = r15
            r52 = r14
            r53 = r13
            r54 = r12
            r14 = r0
            r15 = r11
            r20 = r6
            r21 = r71
            r22 = r72
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)
            r8.A00(r0)
        L_0x01f3:
            r0 = r73
            X.2Tp r0 = X.C243563Zg.A0B(r8, r0, r10)
            return r0
        L_0x01fa:
            r67 = 0
            goto L_0x0186
        L_0x01fd:
            r66 = 0
            goto L_0x0171
        L_0x0201:
            r65 = 0
            goto L_0x015c
        L_0x0205:
            r64 = 0
            goto L_0x0147
        L_0x0209:
            r63 = 0
            goto L_0x0132
        L_0x020d:
            java.lang.String[] r2 = new java.lang.String[r7]
            X.3Zd r1 = X.2Vi.A04
            X.4Ey r19 = X.2Vi.A01(r1, r2)
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52659GaX.A00(android.view.View$OnClickListener, android.view.View$OnClickListener, X.2Wc, X.2WX, X.2WX, X.3W1, X.GZG, java.lang.String, boolean):X.2Tp");
    }

    public C52659GaX(GEG geg, C267324bN r3, C52058GDe gDe, UserSession userSession, AnonymousClass4DU r6, GZG gzg, JTB jtb, C51987GAk gAk, JN6 jn6, JR2 jr2, C52046GCs gCs, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, C62320sa r22, 0sK r23, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.A06 = userSession;
        this.A0L = str;
        this.A0K = str2;
        this.A00 = r3;
        this.A05 = gDe;
        this.A04 = geg;
        this.A09 = gAk;
        this.A0M = z;
        this.A0N = z2;
        this.A0D = bool;
        this.A0H = str3;
        this.A02 = r22;
        this.A07 = r6;
        this.A0C = gCs;
        this.A0G = str4;
        this.A0F = str5;
        this.A0O = z3;
        this.A0P = z4;
        this.A0I = str6;
        this.A0Q = z5;
        this.A0d = z6;
        this.A0S = z7;
        this.A0V = z8;
        this.A0U = z9;
        this.A0T = z10;
        this.A0E = num;
        this.A0J = str7;
        this.A01 = jtb;
        this.A0e = z11;
        this.A08 = gzg;
        this.A0X = z12;
        this.A0b = z13;
        this.A0Y = z14;
        this.A0a = z15;
        this.A0W = z16;
        this.A0Z = z17;
        this.A0c = z18;
        this.A0R = z19;
        this.A03 = r23;
        this.A0A = jn6;
        this.A0B = jr2;
    }
}
