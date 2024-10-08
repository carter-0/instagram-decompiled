package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.3dW  reason: invalid class name and case insensitive filesystem */
public final class C245813dW {
    public final UserSession A00;
    public final C243033Xd A01;
    public final 0Pl A02;
    public final C249763kK A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 33));
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 34));
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 35));
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 40));
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LN(this, 41));
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 42));
    public final C231672s5 A0A;

    public C245813dW(UserSession userSession, C231672s5 r5, C243033Xd r6, 0Pl r7, C249763kK r8) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r6, 2);
        this.A00 = userSession;
        this.A01 = r6;
        this.A02 = r7;
        this.A0A = r5;
        this.A03 = r8;
    }

    public final C246613et A00(Context context, 1Xj r9, AnonymousClass4DU r10, AnonymousClass3W1 r11, AnonymousClass2xS r12) {
        0qQ.A0B(r9, 0);
        0qQ.A0B(r11, 1);
        0qQ.A0B(r12, 2);
        Context context2 = context;
        0qQ.A0B(context, 3);
        AnonymousClass4DU r3 = r10;
        0qQ.A0B(r10, 4);
        return A01(context2, r9, r3, r11, r12.A01(r9), r12.A02(r9));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0040, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36320652937667325L) == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0159, code lost:
        if (r5.A0l.A00() == false) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01d4, code lost:
        if (X.0rQ.A01(r8) == false) goto L_0x01d6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C246613et A01(android.content.Context r126, X.1Xj r127, X.AnonymousClass4DU r128, X.AnonymousClass3W1 r129, X.C245853da r130, X.AnonymousClass3TO r131) {
        /*
            r125 = this;
            r8 = 0
            r2 = r127
            X.0qQ.A0B(r2, r8)
            r0 = 1
            r5 = r129
            X.0qQ.A0B(r5, r0)
            r10 = 2
            r34 = 3
            r21 = 4
            r43 = 5
            r6 = r128
            r0 = r43
            X.0qQ.A0B(r6, r0)
            r3 = r125
            com.instagram.common.session.UserSession r4 = r3.A00
            java.lang.Integer r27 = X.AnonymousClass05K.A00
            X.3de r7 = new X.3de
            r7.<init>(r2, r5)
            int r29 = r5.getPosition()
            java.util.List r28 = r2.A3b()
            boolean r0 = r2.A5K()
            if (r0 == 0) goto L_0x0042
            X.0Tu r9 = X.0Tu.A05
            r0 = 36320652937667325(0x810971005c22fd, double:3.032665397086676E-306)
            boolean r0 = X.182.A06(r9, r4, r0)
            r31 = 1
            if (r0 != 0) goto L_0x0044
        L_0x0042:
            r31 = 0
        L_0x0044:
            boolean r0 = r2.A5K()
            r30 = 2131956650(0x7f1313aa, float:1.9549862E38)
            if (r0 == 0) goto L_0x0050
            r30 = 2131956658(0x7f1313b2, float:1.9549878E38)
        L_0x0050:
            r119 = 0
            r9 = 0
            r23 = r9
            r24 = r6
            r25 = r4
            r26 = r7
            r32 = r8
            r33 = r8
            r22 = r9
            X.3ex r42 = X.C245933di.A00(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.String r105 = r2.getId()
            if (r105 == 0) goto L_0x046c
            com.instagram.user.model.User r104 = r2.A2A(r4)
            boolean r110 = r2.CeS()
            boolean r111 = r2.A5v()
            boolean r112 = r2.A5G()
            boolean r113 = r2.A5Y()
            boolean r114 = r2.A55()
            boolean r115 = r2.A6W(r4)
            boolean r116 = r2.A5f()
            boolean r117 = r2.CcK()
            X.1Xy r0 = r2.A0C
            java.lang.Boolean r0 = r0.BAe()
            if (r0 == 0) goto L_0x0468
            boolean r118 = r0.booleanValue()
        L_0x009b:
            com.instagram.user.model.UpcomingEvent r0 = r2.A27(r4)
            if (r0 == 0) goto L_0x00a5
            boolean r119 = r0.getReminderEnabled()
        L_0x00a5:
            boolean r120 = r2.A4s()
            java.util.ArrayList r0 = r2.A3A()
            if (r0 == 0) goto L_0x0464
            boolean r0 = r0.isEmpty()
            r121 = r0 ^ 1
        L_0x00b5:
            boolean r122 = r2.A4u()
            X.1Xy r0 = r2.A0C
            X.1qt r0 = r0.BPu()
            r123 = 0
            if (r0 == 0) goto L_0x00c5
            r123 = 1
        L_0x00c5:
            float r108 = r2.A0l()
            X.3eu r94 = r2.A1S()
            boolean r0 = r2.A5G()
            if (r0 != 0) goto L_0x00d9
            boolean r0 = r2.A5I()
            if (r0 == 0) goto L_0x045e
        L_0x00d9:
            X.3eu r0 = r2.A1S()
            if (r0 == 0) goto L_0x045e
            int r1 = r0.A01
            float r11 = (float) r1
            int r0 = r0.A00
            float r0 = (float) r0
            float r11 = r11 / r0
        L_0x00e6:
            X.1Xy r0 = r2.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x045b
            X.3xt r0 = r0.BF6()
            if (r0 == 0) goto L_0x045b
            com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum r0 = r0.B7T()
        L_0x00f8:
            com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum r1 = com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum.PRODUCT_EXTENSION_SINGLE_MEDIA_9X16_LEARNING
            if (r0 != r1) goto L_0x044f
            X.0Tu r7 = X.0Tu.A05
            r0 = 36329985895580051(0x8111ee00004193, double:3.038567597251489E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            if (r0 == 0) goto L_0x044f
            r11 = 1059145646(0x3f2147ae, float:0.63)
        L_0x010c:
            boolean r124 = r2.A6U(r4)
            X.1Xy r0 = r2.A0C
            X.1sQ r90 = r0.getClipsMetadata()
            java.lang.String r106 = r2.A2a()
            java.lang.String r107 = r2.A2w()
            X.0eM r0 = r3.A09
            java.lang.Object r0 = r0.getValue()
            X.3eL r0 = (X.C246293eL) r0
            r54 = r126
            r12 = r0
            r13 = r54
            r14 = r2
            r15 = r2
            r16 = r6
            r17 = r5
            X.9IZ r88 = r12.A00(r13, r14, r15, r16, r17)
            X.3Xd r0 = r3.A01
            X.3ed r1 = r0.BQd()
            r91 = 0
            r0 = -1
            X.3ev r100 = X.C246473ef.A00(r2, r9, r1, r0, r8)
            X.0rQ r0 = new X.0rQ
            r0.<init>(r4)
            java.lang.String r1 = r6.getModuleName()
            boolean r0 = r0.A06(r2, r1)
            if (r0 == 0) goto L_0x015b
            X.3WB r0 = r5.A0l
            boolean r0 = r0.A00()
            r18 = 1
            if (r0 != 0) goto L_0x015d
        L_0x015b:
            r18 = 0
        L_0x015d:
            long r14 = r2.A1B()
            X.0Tu r0 = X.0Tu.A06
            r7 = 36601951814816128(0x82094800021180, double:3.2105599396952405E-306)
            long r16 = X.182.A01(r0, r4, r7)
            X.3WR r13 = r2.CEL()
            r7 = 2342163486051738091(0x20810948000121eb, double:4.065990198449775E-152)
            boolean r19 = X.182.A06(r0, r4, r7)
            X.3eg r99 = new X.3eg
            r12 = r99
            r12.<init>(r13, r14, r16, r18, r19)
            X.3Ye r0 = new X.3Ye
            r0.<init>(r4)
            java.lang.String r1 = "cta_extension_tap_on_media"
            X.9J3 r89 = r0.A00(r2, r6, r5, r1)
            boolean r7 = r2.A5v()
            X.1Xy r0 = r2.A0C
            java.lang.Boolean r0 = r0.BAe()
            if (r0 == 0) goto L_0x044c
            boolean r0 = r0.booleanValue()
        L_0x019b:
            com.instagram.user.model.User r1 = r2.A2A(r4)
            X.9IE r87 = X.C246493eh.A00(r1, r7, r0)
            X.1Xy r0 = r2.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x0449
            X.3yH r1 = r0.C5I()
        L_0x01af:
            X.3ek r41 = new X.3ek
            r0 = r41
            r0.<init>(r1)
            X.3el r9 = new X.3el
            r9.<init>(r4)
            com.instagram.common.session.UserSession r8 = r9.A00
            X.0rQ r1 = X.C231512rn.A00(r8)
            java.lang.String r0 = r6.getModuleName()
            X.0qQ.A0B(r0, r10)
            boolean r0 = X.0rQ.A02(r2, r1, r0)
            if (r0 == 0) goto L_0x01d6
            boolean r0 = X.0rQ.A01(r8)
            r33 = 1
            if (r0 != 0) goto L_0x01d8
        L_0x01d6:
            r33 = 0
        L_0x01d8:
            X.3em r28 = X.0rQ.A00(r8)
            X.0Tu r7 = X.0Tu.A05
            r0 = 37173757991125600(0x84115600070260, double:3.572172468072012E-306)
            double r0 = X.182.A00(r7, r8, r0)
            r19 = 0
            int r10 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r10 != 0) goto L_0x01f4
            double r0 = r2.A0k()
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = r0 / r12
        L_0x01f4:
            r17 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 * r17
            long r15 = (long) r0
            r0 = 37173757991191137(0x84115600080261, double:3.572172468113458E-306)
            double r0 = X.182.A00(r7, r8, r0)
            int r8 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r8 != 0) goto L_0x0210
            double r0 = r2.A0k()
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = r0 / r12
        L_0x0210:
            double r0 = r0 * r17
            long r13 = (long) r0
            r1 = 25
            X.9Lv r0 = new X.9Lv
            r0.<init>(r1, r2, r5)
            r12 = 16
            X.9MT r10 = new X.9MT
            r22 = r10
            r23 = r12
            r24 = r9
            r25 = r2
            r26 = r6
            r27 = r5
            r22.<init>(r23, r24, r25, r26, r27)
            r1 = 26
            X.9IV r8 = new X.9IV
            r8.<init>((int) r1, (java.lang.Object) r10, (java.lang.Object) r0)
            X.3en r98 = new X.3en
            r26 = r98
            r27 = r8
            r29 = r15
            r31 = r13
            r26.<init>(r27, r28, r29, r31, r33)
            X.2s5 r0 = r3.A0A
            r92 = r0
            X.3ZH r95 = r2.A1Y()
            r0 = 36326150489781819(0x810e710000363b, double:3.036142071180748E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            if (r0 == 0) goto L_0x025e
            X.4g6 r0 = r2.A07
            if (r0 == 0) goto L_0x025e
            X.4hR r0 = r0.A01
            X.3ew r91 = r0.A01()
        L_0x025e:
            X.9MS r84 = new X.9MS
            r33 = r84
            r35 = r3
            r36 = r5
            r37 = r2
            r38 = r6
            r33.<init>(r34, r35, r36, r37, r38)
            r1 = 21
            X.9Lv r40 = new X.9Lv
            r0 = r40
            r0.<init>(r1, r2, r3)
            r4 = 11
            X.9MF r39 = new X.9MF
            r0 = r39
            r0.<init>(r4, r6, r3, r2)
            r8 = 36
            X.9MR r45 = new X.9MR
            r13 = r45
            r14 = r8
            r15 = r5
            r16 = r3
            r17 = r2
            r18 = r6
            r13.<init>(r14, r15, r16, r17, r18)
            r9 = 37
            X.9MR r46 = new X.9MR
            r13 = r46
            r14 = r9
            r13.<init>(r14, r15, r16, r17, r18)
            r38 = 38
            X.9MR r47 = new X.9MR
            r13 = r47
            r14 = r38
            r13.<init>(r14, r15, r16, r17, r18)
            r1 = 34
            X.9MC r37 = new X.9MC
            r0 = r37
            r0.<init>(r1, r3, r2, r5)
            r10 = 13
            X.9MG r36 = new X.9MG
            r0 = r36
            r0.<init>(r10, r5, r3, r2)
            r35 = 14
            X.9MG r34 = new X.9MG
            r1 = r34
            r0 = r35
            r1.<init>(r0, r5, r3, r2)
            r7 = 10
            X.9MG r33 = new X.9MG
            r0 = r33
            r0.<init>(r7, r5, r3, r2)
            r1 = 19
            X.9Lv r32 = new X.9Lv
            r0 = r32
            r0.<init>(r1, r2, r3)
            r1 = 31
            X.9MC r31 = new X.9MC
            r0 = r31
            r0.<init>(r1, r3, r2, r5)
            X.9MG r30 = new X.9MG
            r0 = r30
            r0.<init>(r4, r5, r3, r2)
            X.9Lw r29 = new X.9Lw
            r0 = r29
            r0.<init>(r12, r2, r3)
            r1 = 32
            X.9MC r28 = new X.9MC
            r0 = r28
            r0.<init>(r1, r3, r2, r5)
            r1 = 33
            X.9MC r27 = new X.9MC
            r0 = r27
            r0.<init>(r1, r3, r2, r5)
            X.9MF r26 = new X.9MF
            r1 = r21
            r0 = r26
            r0.<init>(r1, r6, r3, r2)
            X.9LN r25 = new X.9LN
            r1 = r42
            r0 = r25
            r0.<init>(r1, r8)
            X.9LN r24 = new X.9LN
            r0 = r24
            r0.<init>(r1, r9)
            X.9MF r23 = new X.9MF
            r1 = r43
            r0 = r23
            r0.<init>(r1, r6, r3, r2)
            r1 = 6
            X.9MF r22 = new X.9MF
            r0 = r22
            r0.<init>(r1, r6, r3, r2)
            r21 = 7
            X.9MF r20 = new X.9MF
            r1 = r20
            r0 = r21
            r1.<init>(r0, r2, r3, r5)
            r1 = 43
            X.9Ls r19 = new X.9Ls
            r0 = r19
            r0.<init>(r1, r2, r3)
            r1 = 8
            X.9MF r18 = new X.9MF
            r0 = r18
            r0.<init>(r1, r2, r3, r5)
            r1 = 44
            X.9Ls r17 = new X.9Ls
            r0 = r17
            r0.<init>(r1, r2, r3)
            r1 = 17
            X.9Lw r16 = new X.9Lw
            r0 = r16
            r0.<init>(r1, r2, r3)
            X.9MT r82 = new X.9MT
            r48 = r82
            r49 = r10
            r50 = r3
            r51 = r2
            r52 = r6
            r53 = r5
            r48.<init>(r49, r50, r51, r52, r53)
            X.B0B r15 = new X.B0B
            r15.<init>(r2, r6, r3, r5)
            r0 = 20
            X.9Lv r14 = new X.9Lv
            r14.<init>(r0, r2, r5)
            r0 = 12
            X.9MG r13 = new X.9MG
            r13.<init>(r0, r2, r3, r6)
            X.9MQ r70 = new X.9MQ
            r48 = r70
            r49 = r35
            r50 = r6
            r51 = r3
            r52 = r5
            r53 = r2
            r48.<init>(r49, r50, r51, r52, r53)
            r0 = 22
            X.9Lv r12 = new X.9Lv
            r12.<init>(r0, r6, r2)
            r49 = 15
            X.9MQ r72 = new X.9MQ
            r48 = r72
            r50 = r54
            r52 = r2
            r53 = r6
            r48.<init>(r49, r50, r51, r52, r53)
            X.9M2 r10 = new X.9M2
            r0 = r43
            r10.<init>(r0, r3, r2)
            X.9MZ r73 = new X.9MZ
            r48 = r73
            r49 = r7
            r50 = r5
            r48.<init>(r49, r50, r51, r52, r53, r54)
            X.3er r74 = X.C246593er.A00
            r0 = 9
            X.9MF r9 = new X.9MF
            r9.<init>(r0, r2, r3, r5)
            X.9MF r8 = new X.9MF
            r8.<init>(r7, r6, r3, r2)
            r0 = 23
            X.9Lv r7 = new X.9Lv
            r7.<init>(r0, r2, r5)
            X.9LN r4 = new X.9LN
            r0 = r38
            r4.<init>(r3, r0)
            r0 = 39
            X.9LN r1 = new X.9LN
            r1.<init>(r3, r0)
            r49 = 35
            X.9MR r61 = new X.9MR
            r48 = r61
            r48.<init>(r49, r50, r51, r52, r53)
            X.9Ma r62 = new X.9Ma
            r63 = r21
            r64 = r54
            r65 = r5
            r66 = r3
            r67 = r6
            r68 = r2
            r62.<init>(r63, r64, r65, r66, r67, r68)
            X.3es r43 = new X.3es
            r53 = r20
            r54 = r19
            r55 = r18
            r56 = r17
            r57 = r9
            r58 = r8
            r59 = r4
            r60 = r1
            r63 = r40
            r64 = r37
            r65 = r32
            r66 = r31
            r67 = r28
            r68 = r27
            r69 = r14
            r71 = r12
            r75 = r7
            r76 = r36
            r77 = r34
            r78 = r33
            r79 = r30
            r80 = r29
            r81 = r16
            r83 = r13
            r85 = r10
            r86 = r15
            r44 = r39
            r48 = r26
            r49 = r25
            r50 = r24
            r51 = r23
            r52 = r22
            r43.<init>(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86)
            X.3et r86 = new X.3et
            r102 = r130
            r103 = r131
            r93 = r42
            r96 = r41
            r97 = r43
            r101 = r5
            r109 = r11
            r86.<init>(r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124)
            return r86
        L_0x0449:
            r1 = 0
            goto L_0x01af
        L_0x044c:
            r0 = 0
            goto L_0x019b
        L_0x044f:
            r0 = 1061830001(0x3f4a3d71, float:0.79)
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x010c
            r11 = 1061997773(0x3f4ccccd, float:0.8)
            goto L_0x010c
        L_0x045b:
            r0 = 0
            goto L_0x00f8
        L_0x045e:
            float r11 = r2.A0l()
            goto L_0x00e6
        L_0x0464:
            r121 = 0
            goto L_0x00b5
        L_0x0468:
            r118 = 0
            goto L_0x009b
        L_0x046c:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C245813dW.A01(android.content.Context, X.1Xj, X.4DU, X.3W1, X.3da, X.3TO):X.3et");
    }
}
