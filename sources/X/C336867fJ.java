package X;

import android.view.GestureDetector;
import com.instagram.common.session.UserSession;

/* renamed from: X.7fJ  reason: invalid class name and case insensitive filesystem */
public final class C336867fJ extends C251343mx {
    public static final 2WX A0F;
    public final C335907dj A00;
    public final C333777a7 A01;
    public final C52971GgO A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final C300835xz A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final GestureDetector A09;
    public final 2WX A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    static {
        AnonymousClass3XV r0 = 2WX.A02;
        long doubleToRawLongBits = Double.doubleToRawLongBits(4.0d);
        long doubleToRawLongBits2 = Double.doubleToRawLongBits(12.0d);
        A0F = new 2WX(new 2WX(new 2WX(new 2WX((2WX) null, new AnonymousClass9JR(AnonymousClass05K.A15, 0, doubleToRawLongBits)), new AnonymousClass9JR(AnonymousClass05K.A1F, 0, Double.doubleToRawLongBits(16.0d))), new AnonymousClass9JR(AnonymousClass05K.A1I, 0, doubleToRawLongBits2)), new AnonymousClass9JS(AnonymousClass05K.A01, "android.widget.Button", 0));
    }

    public C336867fJ(GestureDetector gestureDetector, 2WX r3, C335907dj r4, C333777a7 r5, C52971GgO ggO, UserSession userSession, AnonymousClass4DU r8, C300835xz r9, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        0qQ.A0B(userSession, 3);
        0qQ.A0B(ggO, 5);
        0qQ.A0B(gestureDetector, 7);
        0qQ.A0B(r9, 10);
        this.A00 = r4;
        this.A01 = r5;
        this.A03 = userSession;
        this.A0A = r3;
        this.A02 = ggO;
        this.A04 = r8;
        this.A09 = gestureDetector;
        this.A06 = z;
        this.A0B = str;
        this.A05 = r9;
        this.A0E = z2;
        this.A07 = z3;
        this.A0C = z4;
        this.A0D = z5;
        this.A08 = z6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0388, code lost:
        if (r4.A08 != false) goto L_0x038a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x03a8, code lost:
        if (r4.A08 != false) goto L_0x03aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00dd, code lost:
        if (r19.A0U != true) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0054, code lost:
        if (X.182.A06(X.0Tu.A05, r4.A03, 36321073838433343L) == false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r75) {
        /*
            r74 = this;
            r7 = 0
            r73 = r75
            r0 = r73
            X.0qQ.A0B(r0, r7)
            r4 = r74
            X.2WX r0 = r4.A0A
            r72 = r0
            r0 = r73
            X.2V1 r1 = r0.A05
            r17 = 0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.2Wb r6 = new X.2Wb
            r6.<init>(r1, r0)
            X.7dj r1 = r4.A00
            java.lang.Long r14 = r1.A0I
            com.instagram.user.model.User r0 = r1.A0C
            r21 = r0
            java.lang.String r0 = r1.A0K
            r35 = r0
            boolean r13 = r1.A0k
            X.7df r0 = r1.A00
            r71 = r0
            X.7df r20 = X.C335867df.APPROVED
            r0 = 1
            r57 = 0
            r3 = r20
            r2 = r71
            if (r2 != r3) goto L_0x003d
            r57 = 1
        L_0x003d:
            boolean r12 = r1.A0b
            boolean r11 = r1.A0g
            boolean r9 = r1.A0X
            if (r9 == 0) goto L_0x0056
            com.instagram.common.session.UserSession r8 = r4.A03
            X.0Tu r5 = X.0Tu.A05
            r2 = 36321073838433343(0x8109d30000243f, double:3.0329315764259374E-306)
            boolean r2 = X.182.A06(r5, r8, r2)
            r61 = 1
            if (r2 != 0) goto L_0x0058
        L_0x0056:
            r61 = 0
        L_0x0058:
            com.instagram.common.session.UserSession r8 = r4.A03
            boolean r62 = r1.A05(r8)
            boolean r2 = r1.A0W
            r18 = r2
            r44 = 0
            boolean r2 = r4.A0C
            r66 = r2 ^ 1
            X.7a7 r2 = r4.A01
            r19 = r2
            X.GgO r2 = r4.A02
            r70 = r2
            X.4DU r2 = r4.A04
            r69 = r2
            android.view.GestureDetector r5 = r4.A09
            X.7cA r10 = new X.7cA
            r10.<init>(r8, r5)
            boolean r2 = r4.A0E
            r16 = r2
            X.5xz r2 = r4.A05
            r52 = r2
            boolean r3 = r4.A0D
            X.7fH r2 = new X.7fH
            r45 = r2
            r46 = r1
            r47 = r19
            r48 = r70
            r49 = r8
            r50 = r69
            r51 = r10
            r53 = r21
            r54 = r14
            r55 = r35
            r56 = r13
            r58 = r12
            r59 = r11
            r60 = r9
            r63 = r18
            r64 = r7
            r65 = r7
            r67 = r16
            r68 = r3
            r45.<init>(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68)
            r6.A00(r2)
            X.7aK r2 = r1.A06
            r50 = r2
            X.7aK r3 = X.C333897aK.SHOW_TRANSLATION
            if (r2 != r3) goto L_0x05a3
            java.lang.String r12 = r1.A0O
        L_0x00bd:
            boolean r15 = r1.A0Y
            java.util.List r14 = r1.A0P
            java.lang.String r13 = r4.A0B
            X.7fs r2 = r1.A03
            r22 = r2
            X.571 r11 = r1.A08
            X.572 r10 = r1.A0A
            boolean r9 = r1.A0V
            if (r19 == 0) goto L_0x00df
            r2 = r19
            boolean r2 = r2.A0d
            if (r2 != r0) goto L_0x00d7
            r44 = 1
        L_0x00d7:
            r2 = r19
            boolean r2 = r2.A0U
            r45 = 1
            if (r2 == r0) goto L_0x00e1
        L_0x00df:
            r45 = 0
        L_0x00e1:
            X.7dd r3 = r1.A07
            java.lang.String r37 = ""
            X.7fI r2 = new X.7fI
            r26 = r22
            r27 = r3
            r28 = r70
            r29 = r69
            r30 = r8
            r31 = r11
            r32 = r10
            r33 = r21
            r34 = r12
            r36 = r13
            r38 = r14
            r39 = r17
            r40 = r7
            r41 = r15
            r42 = r9
            r43 = r18
            r46 = r7
            r47 = r7
            r48 = r7
            r49 = r16
            r23 = r2
            r24 = r5
            r25 = r71
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            r6.A00(r2)
            if (r19 == 0) goto L_0x051b
            r2 = r19
            boolean r2 = r2.A0Y
            if (r2 == 0) goto L_0x0129
            r2 = r19
            boolean r2 = r2.A0f
            if (r2 != r0) goto L_0x051b
        L_0x0129:
            X.2V1 r3 = r6.Aqq()
            r21 = 2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.2Wb r5 = new X.2Wb
            r5.<init>(r3, r2)
            X.7fv r9 = r1.A02
            if (r9 == 0) goto L_0x0288
            java.lang.Integer r3 = r9.A03
            boolean r2 = r9.A0A
            if (r2 != r0) goto L_0x021a
            r2 = 2131968768(0x7f134300, float:1.957444E38)
            java.lang.String r10 = X.C244013aV.A0E(r5, r2)
            X.2WX r9 = A0F
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            boolean r2 = r4.A06
            X.2WW r2 = X.C336877fK.A00(r5, r9, r10, r3, r2)
        L_0x0154:
            r5.A00(r2)
        L_0x0157:
            X.7di r3 = r1.A01
            X.7di r2 = X.C335897di.BOTTOM_ACTION_LINE
            if (r3 != r2) goto L_0x01dd
            java.lang.Integer r3 = r1.A0H
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            if (r3 != r2) goto L_0x01dd
            r3 = r20
            r2 = r71
            if (r2 != r3) goto L_0x01dd
            X.3XV r2 = X.2WX.A02
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.9JQ r3 = new X.9JQ
            r3.<init>(r2, r4, r0)
            X.2WX r11 = new X.2WX
            r2 = r17
            r11.<init>(r2, r3)
            X.2V1 r3 = r5.A00
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.2Wb r4 = new X.2Wb
            r4.<init>(r3, r2)
            long r2 = X.C53910GwG.A09
            java.lang.String r28 = r69.getModuleName()
            X.0Tu r9 = X.0Tu.A05
            r2 = 36324685905998065(0x810d1c000130f1, double:3.035215862498496E-306)
            boolean r30 = X.182.A06(r9, r8, r2)
            r2 = 4616189618054758400(0x4010000000000000, double:4.0)
            long r9 = java.lang.Double.doubleToRawLongBits(r2)
            r2 = 4622945017495814144(0x4028000000000000, double:12.0)
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            java.lang.Integer r13 = X.AnonymousClass05K.A15
            X.9JR r12 = new X.9JR
            r12.<init>(r13, r7, r9)
            X.2WX r10 = new X.2WX
            r9 = r17
            r10.<init>(r9, r12)
            java.lang.Integer r12 = X.AnonymousClass05K.A1I
            X.9JR r9 = new X.9JR
            r9.<init>(r12, r7, r2)
            X.2WX r2 = new X.2WX
            r2.<init>(r10, r9)
            X.GwG r3 = new X.GwG
            r21 = r3
            r22 = r2
            r23 = r1
            r24 = r19
            r25 = r70
            r26 = r8
            r27 = r52
            r29 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r4.A00(r3)
            X.2Tp r0 = X.C243563Zg.A0C(r4, r5, r11)
            r5.A00(r0)
        L_0x01dd:
            java.util.List r2 = r5.A01
            X.2Tp r0 = new X.2Tp
            r9 = r0
            r10 = r17
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r2
            r15 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r6.A00(r0)
            boolean r0 = r1.A0j
            if (r0 == 0) goto L_0x020b
            r2 = r20
            r0 = r71
            if (r0 != r2) goto L_0x020b
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r4 = r0.A01(r8)
            X.GtI r3 = new X.GtI
            r2 = r70
            r0 = r69
            r3.<init>(r1, r2, r0, r4)
            r6.A00(r3)
        L_0x020b:
            r0 = r6
            r1 = r73
            r2 = r72
            r3 = r17
            r4 = r3
            r5 = r3
            r6 = r7
            X.2Tl r0 = X.C243563Zg.A06(r0, r1, r2, r3, r4, r5, r6)
            return r0
        L_0x021a:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            if (r3 == r2) goto L_0x0269
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            if (r3 == r2) goto L_0x0269
            java.lang.String r12 = r9.A07
            if (r12 == 0) goto L_0x024a
            X.2WX r11 = A0F
            boolean r10 = r4.A06
            r2 = 47
            X.J6O r9 = new X.J6O
            r9.<init>(r4, r2)
            java.lang.Integer r3 = X.AnonymousClass05K.A1F
            if (r10 != 0) goto L_0x0237
            r9 = r17
        L_0x0237:
            r2 = 4
            X.9JS r4 = new X.9JS
            r4.<init>(r3, r9, r2)
        L_0x023d:
            X.2WX r3 = new X.2WX
            r3.<init>(r11, r4)
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            X.2WW r2 = X.C336877fK.A00(r5, r3, r12, r2, r10)
            goto L_0x0154
        L_0x024a:
            r2 = 2131961761(0x7f1327a1, float:1.9560228E38)
            java.lang.String r12 = X.C244013aV.A0E(r5, r2)
            X.2WX r11 = A0F
            boolean r10 = r4.A06
            r2 = 48
            X.J6O r9 = new X.J6O
            r9.<init>(r4, r2)
            java.lang.Integer r3 = X.AnonymousClass05K.A1F
            if (r10 != 0) goto L_0x0262
            r9 = r17
        L_0x0262:
            r2 = 4
            X.9JS r4 = new X.9JS
            r4.<init>(r3, r9, r2)
            goto L_0x023d
        L_0x0269:
            r2 = 2131968493(0x7f1341ed, float:1.9573882E38)
            java.lang.String r12 = X.C244013aV.A0E(r5, r2)
            X.2WX r11 = A0F
            boolean r10 = r4.A06
            r2 = 46
            X.J6O r3 = new X.J6O
            r3.<init>(r4, r2)
            java.lang.Integer r9 = X.AnonymousClass05K.A1F
            if (r10 != 0) goto L_0x0281
            r3 = r17
        L_0x0281:
            r2 = 4
            X.9JS r4 = new X.9JS
            r4.<init>(r9, r3, r2)
            goto L_0x023d
        L_0x0288:
            java.lang.Integer r2 = r1.A0H
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            if (r2 != r9) goto L_0x02ae
            r2 = 2131969676(0x7f13468c, float:1.9576282E38)
            java.lang.String r13 = X.C244013aV.A0E(r5, r2)
            X.2WX r12 = A0F
            java.lang.Integer r10 = X.AnonymousClass05K.A08
            java.lang.String r3 = "row_comment_posting_status"
            r2 = 4
            X.9JS r11 = new X.9JS
            r11.<init>(r10, r3, r2)
        L_0x02a1:
            X.2WX r3 = new X.2WX
            r3.<init>(r12, r11)
            boolean r2 = r4.A06
            X.2WW r2 = X.C336877fK.A00(r5, r3, r13, r9, r2)
            goto L_0x0154
        L_0x02ae:
            int r3 = r71.ordinal()
            if (r3 == r0) goto L_0x049d
            r2 = r21
            if (r3 == r2) goto L_0x04d3
            if (r3 != r7) goto L_0x05ad
            boolean r2 = r4.A07
            if (r2 != 0) goto L_0x03b2
            r2 = 2131972162(0x7f135042, float:1.9581324E38)
            java.lang.String r13 = X.C244013aV.A0E(r5, r2)
            X.2WX r18 = A0F
            java.lang.Integer r10 = X.AnonymousClass05K.A08
            java.lang.String r2 = "row_comment_textview_reply_button"
            r11 = 4
            X.9JS r3 = new X.9JS
            r3.<init>(r10, r2, r11)
            X.2WX r12 = new X.2WX
            r2 = r18
            r12.<init>(r2, r3)
            boolean r10 = r4.A06
            r2 = 5
            X.9LG r14 = new X.9LG
            r14.<init>(r4, r2)
            java.lang.Integer r16 = X.AnonymousClass05K.A1F
            if (r10 != 0) goto L_0x02e6
            r14 = r17
        L_0x02e6:
            X.9JS r3 = new X.9JS
            r2 = r16
            r3.<init>(r2, r14, r11)
            X.2WX r2 = new X.2WX
            r2.<init>(r12, r3)
            X.2WW r2 = X.C336877fK.A00(r5, r2, r13, r9, r10)
            r5.A00(r2)
            boolean r2 = r1.A0S
            if (r2 == 0) goto L_0x03b2
            boolean r2 = r1.A0U
            if (r2 != 0) goto L_0x03b2
            java.lang.String r12 = r1.A0N
            r2 = r70
            com.instagram.comments.mvvm.data.MediaCommentListRepository r2 = r2.A0A
            X.0Ud r2 = r2.A0L
            java.lang.Object r3 = r2.getValue()
            X.7aH r3 = (X.C333867aH) r3
            r2 = r35
            X.7dj r3 = X.C335067cK.A01(r3, r2, r12)
            if (r3 == 0) goto L_0x048d
            java.lang.String r13 = r3.A0N
            if (r13 != 0) goto L_0x031d
            java.lang.String r13 = r3.A0K
        L_0x031d:
            r2 = r70
            X.7a5 r12 = r2.A0B
            r2 = 12
            X.J6I r15 = new X.J6I
            r14 = r70
            r15.<init>(r14, r2)
            r12.A00(r15)
            java.lang.String r2 = r3.A0J
            r27 = r2
            com.instagram.user.model.User r2 = r3.A0C
            r24 = r2
            java.lang.Long r2 = r3.A0I
            r15 = r2
            boolean r2 = r3.A0i
            X.7fs r14 = r3.A03
            r30 = 0
            if (r14 == 0) goto L_0x0342
            r30 = 1
        L_0x0342:
            X.571 r3 = r3.A08
            r31 = 0
            if (r3 == 0) goto L_0x034a
            r31 = 1
        L_0x034a:
            X.7cr r3 = new X.7cr
            r23 = r3
            r25 = r15
            r26 = r35
            r28 = r13
            r29 = r2
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)
            r2 = r70
            com.instagram.common.session.UserSession r13 = r2.A0E
            X.0Ud r2 = r12.A03
            java.lang.Object r2 = r2.getValue()
            X.7a7 r2 = (X.C333777a7) r2
            boolean r2 = X.C393889xC.A00(r3, r2, r13)
            if (r2 == 0) goto L_0x03b2
            r2 = r70
            r2.A01 = r3
            X.0Tu r12 = X.0Tu.A05
            r2 = 36329960125776265(0x8111e800004189, double:3.038551300323808E-306)
            boolean r2 = X.182.A06(r12, r8, r2)
            if (r2 == 0) goto L_0x03b2
            r2 = 2131972169(0x7f135049, float:1.9581338E38)
            java.lang.String r12 = X.C244013aV.A0E(r5, r2)
            if (r10 == 0) goto L_0x038a
            boolean r2 = r4.A08
            r3 = 1
            if (r2 == 0) goto L_0x038b
        L_0x038a:
            r3 = 0
        L_0x038b:
            X.J6I r13 = new X.J6I
            r2 = r21
            r13.<init>(r4, r2)
            if (r3 != 0) goto L_0x0395
            r13 = 0
        L_0x0395:
            X.9JS r3 = new X.9JS
            r2 = r16
            r3.<init>(r2, r13, r11)
            X.2WX r11 = new X.2WX
            r2 = r18
            r11.<init>(r2, r3)
            if (r10 == 0) goto L_0x03aa
            boolean r3 = r4.A08
            r2 = 1
            if (r3 == 0) goto L_0x03ab
        L_0x03aa:
            r2 = 0
        L_0x03ab:
            X.2WW r2 = X.C336877fK.A00(r5, r11, r12, r9, r2)
            r5.A00(r2)
        L_0x03b2:
            boolean r2 = r1.A0Z
            if (r2 == 0) goto L_0x03de
            r2 = 2131963370(0x7f132dea, float:1.9563491E38)
            java.lang.String r14 = X.C244013aV.A0E(r5, r2)
            X.2WX r13 = A0F
            boolean r12 = r4.A06
            r2 = 3
            X.9LG r11 = new X.9LG
            r11.<init>(r4, r2)
            java.lang.Integer r10 = X.AnonymousClass05K.A1F
            if (r12 != 0) goto L_0x03cc
            r11 = 0
        L_0x03cc:
            r2 = 4
            X.9JS r3 = new X.9JS
            r3.<init>(r10, r11, r2)
            X.2WX r2 = new X.2WX
            r2.<init>(r13, r3)
            X.2WW r2 = X.C336877fK.A00(r5, r2, r14, r9, r12)
            r5.A00(r2)
        L_0x03de:
            X.7de r3 = r1.A05
            X.7de r2 = X.C335857de.HIDDEN_COMMENT
            if (r3 == r2) goto L_0x03e8
            X.7de r2 = X.C335857de.COVERED_COMMENT
            if (r3 != r2) goto L_0x0415
        L_0x03e8:
            boolean r2 = r1.A0R
            if (r2 == 0) goto L_0x0415
            r2 = 2131956405(0x7f1312b5, float:1.9549365E38)
            java.lang.String r14 = X.C244013aV.A0E(r5, r2)
            X.2WX r13 = A0F
            boolean r12 = r4.A06
            r2 = 45
            X.J6O r11 = new X.J6O
            r11.<init>(r4, r2)
            java.lang.Integer r10 = X.AnonymousClass05K.A1F
            if (r12 != 0) goto L_0x0403
            r11 = 0
        L_0x0403:
            r2 = 4
            X.9JS r3 = new X.9JS
            r3.<init>(r10, r11, r2)
            X.2WX r2 = new X.2WX
            r2.<init>(r13, r3)
            X.2WW r2 = X.C336877fK.A00(r5, r2, r14, r9, r12)
            r5.A00(r2)
        L_0x0415:
            if (r22 == 0) goto L_0x045d
            r2 = r22
            java.lang.String r10 = r2.A04
            if (r10 == 0) goto L_0x045d
            int r2 = r10.length()
            if (r2 == 0) goto L_0x045d
            X.0Tu r11 = X.0Tu.A05
            r2 = 36323032344177408(0x810b9b000a2b00, double:3.034170143344754E-306)
            java.lang.Boolean r2 = X.AnonymousClass7TF.A0R(r11, r8, r2)
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x045d
            r2 = 2131966723(0x7f133b03, float:1.9570292E38)
            java.lang.String r14 = X.C244013aV.A0E(r5, r2)
            X.2WX r13 = A0F
            boolean r12 = r4.A06
            r2 = 16
            X.PmT r11 = new X.PmT
            r11.<init>(r4, r5, r10, r2)
            java.lang.Integer r10 = X.AnonymousClass05K.A1F
            if (r12 != 0) goto L_0x044b
            r11 = 0
        L_0x044b:
            r2 = 4
            X.9JS r3 = new X.9JS
            r3.<init>(r10, r11, r2)
            X.2WX r2 = new X.2WX
            r2.<init>(r13, r3)
            X.2WW r2 = X.C336877fK.A00(r5, r2, r14, r9, r12)
            r5.A00(r2)
        L_0x045d:
            boolean r2 = r1.A0U
            if (r2 == 0) goto L_0x0157
            int r3 = r50.ordinal()
            if (r3 == r7) goto L_0x0489
            if (r3 == r0) goto L_0x0485
            r2 = r21
            if (r3 != r2) goto L_0x05a7
            r2 = 2131973006(0x7f13538e, float:1.9583036E38)
        L_0x0470:
            java.lang.String r13 = X.C244013aV.A0E(r5, r2)
            X.2WX r12 = A0F
            r10 = 4
            X.9LG r3 = new X.9LG
            r3.<init>(r4, r10)
            java.lang.Integer r2 = X.AnonymousClass05K.A1F
            X.9JS r11 = new X.9JS
            r11.<init>(r2, r3, r10)
            goto L_0x02a1
        L_0x0485:
            r2 = 2131965491(0x7f133633, float:1.9567793E38)
            goto L_0x0470
        L_0x0489:
            r2 = 2131973013(0x7f135395, float:1.958305E38)
            goto L_0x0470
        L_0x048d:
            X.0wj r10 = X.0wj.A01
            r3 = 817892914(0x30c00e32, float:1.3973873E-9)
            java.lang.String r2 = "CommentListViewModel: target comment row to reply is null."
            X.0f9 r2 = r10.AEf(r2, r3)
            r2.report()
            goto L_0x03b2
        L_0x049d:
            r2 = 2131972339(0x7f1350f3, float:1.9581683E38)
            java.lang.String r14 = X.C244013aV.A0E(r5, r2)
            X.2WX r12 = A0F
            boolean r11 = r4.A06
            r3 = 49
            X.J6O r2 = new X.J6O
            r2.<init>(r4, r3)
            java.lang.Integer r13 = X.AnonymousClass05K.A1F
            if (r11 != 0) goto L_0x04b4
            r2 = 0
        L_0x04b4:
            r10 = 4
            X.9JS r3 = new X.9JS
            r3.<init>(r13, r2, r10)
            X.2WX r2 = new X.2WX
            r2.<init>(r12, r3)
            X.2WW r2 = X.C336877fK.A00(r5, r2, r14, r9, r11)
            r5.A00(r2)
            r2 = 2131972338(0x7f1350f2, float:1.958168E38)
            java.lang.String r14 = X.C244013aV.A0E(r5, r2)
            X.J6I r2 = new X.J6I
            r2.<init>(r4, r7)
            goto L_0x0508
        L_0x04d3:
            r2 = 2131972337(0x7f1350f1, float:1.9581679E38)
            java.lang.String r14 = X.C244013aV.A0E(r5, r2)
            X.2WX r12 = A0F
            boolean r11 = r4.A06
            r3 = 32
            X.J6j r2 = new X.J6j
            r2.<init>((int) r3, (java.lang.Object) r4, (java.lang.Object) r5)
            java.lang.Integer r13 = X.AnonymousClass05K.A1F
            if (r11 != 0) goto L_0x04ea
            r2 = 0
        L_0x04ea:
            r10 = 4
            X.9JS r3 = new X.9JS
            r3.<init>(r13, r2, r10)
            X.2WX r2 = new X.2WX
            r2.<init>(r12, r3)
            X.2WW r2 = X.C336877fK.A00(r5, r2, r14, r9, r11)
            r5.A00(r2)
            r2 = 2131972338(0x7f1350f2, float:1.958168E38)
            java.lang.String r14 = X.C244013aV.A0E(r5, r2)
            X.J6I r2 = new X.J6I
            r2.<init>(r4, r0)
        L_0x0508:
            if (r11 != 0) goto L_0x050b
            r2 = 0
        L_0x050b:
            X.9JS r3 = new X.9JS
            r3.<init>(r13, r2, r10)
            X.2WX r2 = new X.2WX
            r2.<init>(r12, r3)
            X.2WW r2 = X.C336877fK.A00(r5, r2, r14, r9, r11)
            goto L_0x0154
        L_0x051b:
            X.7di r3 = r1.A01
            X.7di r2 = X.C335897di.BOTTOM_ACTION_LINE
            if (r3 != r2) goto L_0x020b
            java.lang.Integer r3 = r1.A0H
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            if (r3 != r2) goto L_0x020b
            r3 = r20
            r2 = r71
            if (r2 != r3) goto L_0x020b
            X.3XV r2 = X.2WX.A02
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.9JQ r3 = new X.9JQ
            r3.<init>(r2, r4, r0)
            X.2WX r9 = new X.2WX
            r2 = r17
            r9.<init>(r2, r3)
            X.2V1 r3 = r6.A00
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.2Wb r10 = new X.2Wb
            r10.<init>(r3, r2)
            long r2 = X.C53910GwG.A09
            java.lang.String r25 = r69.getModuleName()
            X.0Tu r4 = X.0Tu.A05
            r2 = 36324685905998065(0x810d1c000130f1, double:3.035215862498496E-306)
            boolean r27 = X.182.A06(r4, r8, r2)
            r2 = 4616189618054758400(0x4010000000000000, double:4.0)
            long r4 = java.lang.Double.doubleToRawLongBits(r2)
            r2 = 4622945017495814144(0x4028000000000000, double:12.0)
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            java.lang.Integer r11 = X.AnonymousClass05K.A15
            X.9JR r12 = new X.9JR
            r12.<init>(r11, r7, r4)
            X.2WX r11 = new X.2WX
            r4 = r17
            r11.<init>(r4, r12)
            java.lang.Integer r5 = X.AnonymousClass05K.A1I
            X.9JR r4 = new X.9JR
            r4.<init>(r5, r7, r2)
            X.2WX r3 = new X.2WX
            r3.<init>(r11, r4)
            X.GwG r2 = new X.GwG
            r20 = r1
            r21 = r19
            r22 = r70
            r23 = r8
            r24 = r52
            r26 = r0
            r18 = r2
            r19 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r10.A00(r2)
            X.2Tp r0 = X.C243563Zg.A0C(r10, r6, r9)
            r6.A00(r0)
            goto L_0x020b
        L_0x05a3:
            java.lang.String r12 = r1.A0J
            goto L_0x00bd
        L_0x05a7:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x05ad:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C336867fJ.A0X(X.3Y5):X.3mp");
    }
}
