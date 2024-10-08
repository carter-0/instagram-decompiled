package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.7Jr  reason: invalid class name and case insensitive filesystem */
public final class C329647Jr {
    public C329667Jt A00;
    public final AnonymousClass9IV A01;
    public final UserSession A02;
    public final C329667Jt A03;
    public final C329667Jt A04;
    public final C329667Jt A05;
    public final C329667Jt A06;
    public final C329667Jt A07;
    public final C329667Jt A08;
    public final C329667Jt A09;
    public final C329667Jt A0A;
    public final C329667Jt A0B;
    public final C329667Jt A0C;
    public final C329667Jt A0D;
    public final C329667Jt A0E;
    public final C329667Jt A0F;
    public final C254783t2 A0G;
    public final List A0H;
    public final C62320sa A0I;
    public final C62320sa A0J;
    public final C62320sa A0K;
    public final boolean A0L;
    public final AnonymousClass7I3 A0M;
    public final C329667Jt A0N;
    public final C329667Jt A0O;
    public final C329667Jt A0P;
    public final C329667Jt A0Q;
    public final C329667Jt A0R;
    public final C329667Jt A0S;
    public final C329667Jt A0T;
    public final C329667Jt A0U;
    public final C329667Jt A0V;
    public final C329667Jt A0W;
    public final C329667Jt A0X;
    public final C329667Jt A0Y;
    public final C329667Jt A0Z;
    public final C329667Jt A0a;
    public final C329667Jt A0b;
    public final AnonymousClass7KF A0c;
    public final List A0d;
    public final List A0e;
    public final Map A0f;
    public final C62320sa A0g;

    public final void A00(C331617Rr r19, 2FW r20, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        C331617Rr r7 = r19;
        0qQ.A0B(r7, 0);
        String str2 = str;
        0qQ.A0B(str2, 6);
        List<C329667Jt> list = this.A0e;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C329667Jt r6 : list) {
                C254783t2 r9 = this.A0G;
                2Er r3 = (2Er) this.A0K.invoke();
                boolean z5 = false;
                if (r3 != null) {
                    AnonymousClass7LW r2 = AnonymousClass7LV.A00;
                    UserSession userSession = this.A02;
                    if (r2.A02(userSession, r3) || r2.A03(userSession, r3)) {
                        z5 = true;
                    }
                }
                if (r6.Cnn(str2, r6.A03(r7, r20, r9, this.A0I, z, z5), z3, z2, z4)) {
                    this.A00 = r6;
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v13, types: [X.7Jt] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C329647Jr(android.app.Activity r77, android.content.Context r78, X.AnonymousClass9IV r79, X.AnonymousClass0iw r80, com.instagram.common.session.UserSession r81, X.AnonymousClass7I3 r82, X.AnonymousClass7IR r83, X.C331697Sa r84, X.C329307Ij r85, X.AnonymousClass7IM r86, X.AnonymousClass7IO r87, X.C329247Id r88, X.C254783t2 r89, X.C62320sa r90, X.C62320sa r91, X.C62320sa r92, X.C62320sa r93, X.C62320sa r94, X.C62320sa r95, X.C62320sa r96, X.C62320sa r97, X.C62320sa r98, X.C62320sa r99, X.C62320sa r100, X.C62320sa r101, X.C62320sa r102, X.C62320sa r103, X.C62320sa r104, X.C62320sa r105, X.0sP r106, boolean r107, boolean r108) {
        /*
            r76 = this;
            r48 = 1
            r5 = r81
            r0 = r48
            X.0qQ.A0B(r5, r0)
            r47 = 2
            r46 = 3
            r45 = 4
            r10 = r78
            r0 = r45
            X.0qQ.A0B(r10, r0)
            r44 = 6
            r43 = 7
            r42 = 8
            r0 = 9
            r14 = r83
            X.0qQ.A0B(r14, r0)
            r0 = 10
            r1 = r87
            X.0qQ.A0B(r1, r0)
            r0 = 16
            r12 = r89
            X.0qQ.A0B(r12, r0)
            r1 = 18
            r75 = r80
            r0 = r75
            X.0qQ.A0B(r0, r1)
            r0 = 19
            r4 = r85
            X.0qQ.A0B(r4, r0)
            r1 = 27
            r59 = r86
            r0 = r59
            X.0qQ.A0B(r0, r1)
            r1 = 29
            r61 = r82
            r0 = r61
            X.0qQ.A0B(r0, r1)
            r0 = r76
            r0.<init>()
            r0.A02 = r5
            r3 = r90
            r0.A0K = r3
            r1 = r107
            r0.A0L = r1
            r0.A0G = r12
            r1 = r102
            r0.A0I = r1
            r1 = r61
            r0.A0M = r1
            r58 = r104
            r1 = r58
            r0.A0g = r1
            r1 = r105
            r0.A0J = r1
            r9 = r79
            r0.A01 = r9
            java.util.UUID r1 = X.AnonymousClass0HM.A00()
            java.lang.String r55 = r1.toString()
            X.0qQ.A07(r55)
            X.7JU r29 = X.AnonymousClass7JU.OVERFLOW
            X.7Js r41 = new X.7Js
            r19 = r88
            r35 = r108
            r15 = r41
            r16 = r5
            r17 = r29
            r18 = r4
            r20 = r3
            r21 = r35
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r0.A0P = r15
            X.7JU r2 = X.AnonymousClass7JU.RIGHT_INSET
            X.7Js r1 = new X.7Js
            r15 = r1
            r17 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r0.A06 = r1
            X.7Jx r1 = new X.7Jx
            r1.<init>(r5, r4, r3)
            r0.A0E = r1
            X.7Jy r19 = new X.7Jy
            r11 = r77
            r1 = r19
            r1.<init>(r11, r5, r3)
            r0.A0Q = r1
            r25 = 0
            X.7Jz r18 = new X.7Jz
            r54 = r94
            r49 = r18
            r50 = r11
            r51 = r5
            r52 = r4
            r53 = r3
            r49.<init>(r50, r51, r52, r53, r54)
            r1 = r18
            r0.A0A = r1
            X.7K1 r17 = new X.7K1
            r1 = r17
            r1.<init>(r11, r5, r3)
            r0.A0Y = r1
            X.7K2 r8 = new X.7K2
            r7 = r95
            r8.<init>(r3, r5, r7)
            r0.A0N = r8
            X.7K3 r6 = new X.7K3
            r6.<init>(r3, r5, r7)
            r0.A0O = r6
            X.7K5 r1 = new X.7K5
            r1.<init>(r3, r5, r7)
            r0.A0X = r1
            X.7K6 r40 = new X.7K6
            r57 = r91
            r49 = r40
            r51 = r10
            r52 = r75
            r53 = r5
            r54 = r12
            r56 = r3
            r49.<init>(r50, r51, r52, r53, r54, r55, r56, r57)
            r7 = r40
            r0.A07 = r7
            X.7K8 r39 = new X.7K8
            r13 = r93
            r7 = r39
            r7.<init>(r3, r5, r13)
            r0.A0V = r7
            X.7K9 r38 = new X.7K9
            r54 = r84
            r49 = r38
            r52 = r5
            r53 = r14
            r55 = r3
            r49.<init>(r50, r51, r52, r53, r54, r55)
            r7 = r38
            r0.A0R = r7
            X.7KA r37 = new X.7KA
            r33 = r92
            r60 = r98
            r26 = r37
            r27 = r5
            r28 = r14
            r30 = r4
            r31 = r12
            r32 = r3
            r34 = r60
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r7 = r37
            r0.A0C = r7
            X.7KA r7 = new X.7KA
            r26 = r7
            r29 = r2
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r0.A0D = r7
            X.7KB r7 = new X.7KB
            r12 = r75
            r7.<init>(r10, r12, r5, r3)
            r0.A0S = r7
            X.7KC r16 = new X.7KC
            r15 = r96
            r10 = r16
            r13 = r5
            r14 = r3
            r10.<init>(r11, r12, r13, r14, r15)
            r0.A0W = r10
            X.7KD r10 = new X.7KD
            r11 = r106
            r10.<init>(r5, r4, r3, r11)
            r0.A0a = r10
            java.lang.Object r10 = r9.A01
            X.7JZ r10 = (X.AnonymousClass7JZ) r10
            if (r10 == 0) goto L_0x0366
            X.75i r13 = r10.A01
        L_0x0175:
            r10 = 21
            X.9La r12 = new X.9La
            r12.<init>(r0, r10)
            X.7KF r10 = new X.7KF
            r26 = r10
            r28 = r4
            r29 = r13
            r30 = r3
            r31 = r12
            r26.<init>(r27, r28, r29, r30, r31)
            r0.A0c = r10
            java.lang.Object r10 = r9.A00
            X.7JZ r10 = (X.AnonymousClass7JZ) r10
            X.7KH r9 = new X.7KH
            r33 = r103
            r26 = r9
            r28 = r61
            r29 = r4
            r30 = r4
            r31 = r10
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            r0.A0F = r9
            X.7KJ r9 = new X.7KJ
            r9.<init>(r5, r4, r4, r3)
            r0.A05 = r9
            X.7JT r23 = X.AnonymousClass7JT.NONE
            X.7JU r22 = X.AnonymousClass7JU.LEFT_INSET
            X.7KL r10 = new X.7KL
            r10.<init>(r4)
            r27 = -1
            r30 = 64
            X.7KM r9 = new X.7KM
            r20 = r9
            r21 = r5
            r24 = r10
            r26 = r3
            r28 = r27
            r29 = r27
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r0.A0Z = r9
            X.7KN r9 = new X.7KN
            r35 = r97
            r31 = r9
            r32 = r5
            r33 = r4
            r34 = r3
            r36 = r11
            r31.<init>(r32, r33, r34, r35, r36)
            r0.A0b = r9
            r27 = 2131973082(0x7f1353da, float:1.958319E38)
            X.7JT r23 = X.AnonymousClass7JT.SEND
            r28 = 2131238208(0x7f081d40, float:1.8092688E38)
            X.7KP r10 = new X.7KP
            r9 = r100
            r10.<init>(r4, r9)
            X.7KQ r9 = new X.7KQ
            r20 = r9
            r22 = r2
            r24 = r10
            r29 = r27
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r0.A0B = r9
            X.7KR r9 = new X.7KR
            r9.<init>(r5, r4, r3)
            r0.A03 = r9
            X.7KS r9 = new X.7KS
            r9.<init>(r5, r4, r3)
            r0.A04 = r9
            X.7KT r13 = new X.7KT
            r20 = r13
            r22 = r61
            r23 = r4
            r24 = r58
            r25 = r3
            r20.<init>(r21, r22, r23, r24, r25)
            r0.A08 = r13
            X.7J1 r12 = X.AnonymousClass7J1.A00
            com.instagram.common.session.UserSession r9 = r0.A02
            java.lang.Integer r9 = r12.A00(r9)
            int r9 = r9.intValue()
            r11 = 0
            r36 = 0
            if (r9 == r11) goto L_0x0360
            X.7Jt r9 = r0.A0A
            X.7JU r9 = r9.A03
            if (r9 == r2) goto L_0x0238
            X.7Jt r9 = r0.A08
            X.7JU r9 = r9.A03
            if (r9 != r2) goto L_0x023c
        L_0x0238:
            X.7Jt r9 = r0.A0C
            r36 = r9
        L_0x023c:
            r9 = r36
            r0.A0U = r9
            com.instagram.common.session.UserSession r9 = r0.A02
            java.lang.Integer r9 = r12.A00(r9)
            int r9 = r9.intValue()
            r10 = 0
            if (r9 == r11) goto L_0x0259
            X.7Jt r9 = r0.A0A
            X.7JU r9 = r9.A03
            if (r9 == r2) goto L_0x0259
            X.7Jt r9 = r0.A08
            X.7JU r9 = r9.A03
            if (r9 != r2) goto L_0x025b
        L_0x0259:
            X.7Jt r10 = r0.A0D
        L_0x025b:
            r0.A0T = r10
            X.7JT r35 = X.AnonymousClass7JT.LIVE
            X.0eP r34 = new X.0eP
            r15 = r34
            r14 = r35
            r9 = r19
            r15.<init>(r14, r9)
            X.7JT r33 = X.AnonymousClass7JT.CHALLENGES
            X.0eP r32 = new X.0eP
            r14 = r32
            r9 = r33
            r14.<init>(r9, r8)
            X.7JT r31 = X.AnonymousClass7JT.DAILY_PROMPT
            X.0eP r30 = new X.0eP
            r9 = r30
            r8 = r31
            r9.<init>(r8, r6)
            X.7JT r29 = X.AnonymousClass7JT.QUESTION
            X.0eP r28 = new X.0eP
            r8 = r28
            r6 = r29
            r8.<init>(r6, r1)
            X.7JT r27 = X.AnonymousClass7JT.QUICK_REPLY
            X.0eP r26 = new X.0eP
            r8 = r26
            r6 = r27
            r1 = r18
            r8.<init>(r6, r1)
            X.7JT r25 = X.AnonymousClass7JT.SEND_FILE
            X.0eP r24 = new X.0eP
            r8 = r24
            r6 = r25
            r1 = r17
            r8.<init>(r6, r1)
            r23 = 5
            X.7JT r22 = X.AnonymousClass7JT.ORDER_MANAGEMENT
            X.0eP r21 = new X.0eP
            r6 = r21
            r1 = r22
            r6.<init>(r1, r7)
            X.7JT r20 = X.AnonymousClass7JT.PRODUCT_PICKER
            X.0eP r19 = new X.0eP
            r7 = r19
            r6 = r20
            r1 = r16
            r7.<init>(r6, r1)
            X.7JT r18 = X.AnonymousClass7JT.IMAGINE
            X.0eP r17 = new X.0eP
            r7 = r17
            r6 = r18
            r1 = r40
            r7.<init>(r6, r1)
            X.7JT r16 = X.AnonymousClass7JT.LOCATION
            X.0eP r7 = new X.0eP
            r6 = r16
            r1 = r38
            r7.<init>(r6, r1)
            X.7JT r6 = X.AnonymousClass7JT.POLL
            X.0eP r9 = new X.0eP
            r1 = r39
            r9.<init>(r6, r1)
            X.7JT r8 = X.AnonymousClass7JT.STICKER
            X.0eP r14 = new X.0eP
            r1 = r37
            r14.<init>(r8, r1)
            X.7JT r8 = X.AnonymousClass7JT.GALLERY
            X.0eP r15 = new X.0eP
            r1 = r41
            r15.<init>(r8, r1)
            X.7JT r8 = X.AnonymousClass7JT.META_AI_INVOCATION
            X.0eP r1 = new X.0eP
            r1.<init>(r8, r13)
            r61 = r34
            r62 = r32
            r63 = r30
            r64 = r28
            r65 = r26
            r66 = r24
            r67 = r21
            r68 = r19
            r69 = r17
            r70 = r7
            r71 = r9
            r72 = r14
            r73 = r15
            r74 = r1
            X.0eP[] r1 = new X.0eP[]{r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74}
            java.util.LinkedHashMap r1 = X.0Yt.A06(r1)
            r0.A0f = r1
            r61 = r25
            r62 = r22
            r63 = r20
            r64 = r35
            r65 = r33
            r66 = r31
            r67 = r29
            r68 = r16
            r69 = r6
            r70 = r27
            r71 = r18
            r72 = r8
            X.7JT[] r1 = new X.AnonymousClass7JT[]{r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72}
            java.util.List r1 = X.0sr.A1P(r1)
            r0.A0d = r1
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r1.iterator()
        L_0x034a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0369
            java.lang.Object r6 = r7.next()
            java.util.Map r1 = r0.A0f
            java.lang.Object r1 = r1.get(r6)
            if (r1 == 0) goto L_0x034a
            r8.add(r1)
            goto L_0x034a
        L_0x0360:
            boolean r9 = r0.A0L
            if (r9 == 0) goto L_0x023c
            goto L_0x0238
        L_0x0366:
            r13 = 0
            goto L_0x0175
        L_0x0369:
            X.3t2 r7 = r0.A0G
            X.0sa r1 = r0.A0I
            X.7KU r6 = new X.7KU
            r62 = r101
            r61 = r99
            r49 = r6
            r50 = r75
            r51 = r5
            r52 = r10
            r53 = r36
            r54 = r4
            r55 = r4
            r56 = r59
            r57 = r7
            r58 = r8
            r59 = r3
            r63 = r1
            r49.<init>(r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63)
            r0.A09 = r6
            X.7KF r8 = r0.A0c
            X.7Jt r7 = r0.A0F
            X.7Jt r5 = r0.A0b
            X.7Jt r4 = r0.A0a
            com.instagram.common.session.UserSession r1 = r0.A02
            java.lang.Integer r1 = r12.A00(r1)
            int r3 = r1.intValue()
            r1 = r47
            if (r3 == r1) goto L_0x03a8
            X.7Jt r6 = r0.A05
        L_0x03a8:
            X.7Jt r1 = r0.A0Z
            r13 = r8
            r14 = r7
            r15 = r5
            r16 = r4
            r17 = r6
            r18 = r1
            X.7Jt[] r1 = new X.C329667Jt[]{r13, r14, r15, r16, r17, r18}
            java.util.List r1 = X.0sr.A1P(r1)
            r0.A0e = r1
            com.instagram.common.session.UserSession r1 = r0.A02
            java.lang.Integer r1 = r12.A00(r1)
            int r6 = r1.intValue()
            if (r6 == r11) goto L_0x0418
            r4 = 0
            r1 = r42
            X.7Jt[] r3 = new X.C329667Jt[r1]
            X.7Jt r5 = r0.A0A
            r3[r11] = r5
            r1 = r48
            if (r6 == r1) goto L_0x03fd
            X.7Jt r1 = r0.A03
            r3[r48] = r1
            X.7Jt r1 = r0.A04
            r3[r47] = r1
            X.7Jt r1 = r0.A0E
            r3[r46] = r1
            X.7Jt r1 = r0.A06
            r3[r45] = r1
            X.7JU r1 = r5.A03
            if (r1 == r2) goto L_0x03ec
            X.7Jt r4 = r0.A0D
        L_0x03ec:
            r3[r23] = r4
            X.7Jt r1 = r0.A05
        L_0x03f0:
            r3[r44] = r1
            X.7Jt r1 = r0.A08
            r3[r43] = r1
            java.util.List r1 = X.0sr.A1Q(r3)
        L_0x03fa:
            r0.A0H = r1
            return
        L_0x03fd:
            X.7Jt r1 = r0.A03
            r3[r48] = r1
            X.7Jt r1 = r0.A04
            r3[r47] = r1
            X.7Jt r1 = r0.A0E
            r3[r46] = r1
            X.7Jt r1 = r0.A06
            r3[r45] = r1
            X.7JU r1 = r5.A03
            if (r1 == r2) goto L_0x0413
            X.7Jt r4 = r0.A0D
        L_0x0413:
            r3[r23] = r4
            X.7Jt r1 = r0.A09
            goto L_0x03f0
        L_0x0418:
            X.7Jt r2 = r0.A0A
            X.7Jt r3 = r0.A03
            X.7Jt r4 = r0.A04
            X.7Jt r5 = r0.A0E
            X.7Jt r6 = r0.A06
            boolean r1 = r0.A0L
            if (r1 == 0) goto L_0x0435
            X.7Jt r7 = r0.A09
        L_0x0428:
            X.7Jt r8 = r0.A08
            X.7Jt r9 = r0.A0F
            X.7Jt[] r1 = new X.C329667Jt[]{r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r1 = X.0sr.A1P(r1)
            goto L_0x03fa
        L_0x0435:
            X.7Jt r7 = r0.A0D
            goto L_0x0428
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329647Jr.<init>(android.app.Activity, android.content.Context, X.9IV, X.0iw, com.instagram.common.session.UserSession, X.7I3, X.7IR, X.7Sa, X.7Ij, X.7IM, X.7IO, X.7Id, X.3t2, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sP, boolean, boolean):void");
    }
}
