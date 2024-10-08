package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.List;

/* renamed from: X.I6p  reason: case insensitive filesystem */
public final class C56660I6p {
    public static final C56660I6p A00 = new C56660I6p();
    public static final AnonymousClass1PB A01;
    public static final 1PJ A02 = new IZ5(2);

    static {
        AnonymousClass1PA r5 = AnonymousClass1PA.A00;
        A01 = r5;
        C57330IXn iXn = new C57330IXn(1);
        1PG.A07.put(r5, new 1PH(new AnonymousClass1PF(C59096J6e.A00), iXn, "stories_surface"));
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [X.3kU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x01e3, code lost:
        if (X.C228342lQ.A0A(r2, X.1Au.A00(r2)) != false) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0224, code lost:
        if (X.AnonymousClass1PP.A00(r2).booleanValue() != false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0251, code lost:
        if (X.182.A06(X.0Tu.A06, r2, 2342160827467961925L) != false) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0049, code lost:
        if (X.C55094Hc3.A00(r2).booleanValue() != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0301, code lost:
        if (r21 != false) goto L_0x0303;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0338  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C308756Vm A00(android.content.Context r53, X.AnonymousClass07i r54, com.instagram.common.session.UserSession r55, X.AnonymousClass4DU r56, X.AnonymousClass3BQ r57, X.C309996aG r58, X.C310006aH r59, X.C270414gh r60, X.C233782wS r61, X.C228232l0 r62, X.AnonymousClass2lD r63, X.C249763kK r64, instagram.features.stories.fragment.ReelViewerFragment r65, java.lang.String r66, java.util.List r67, int r68, boolean r69) {
        /*
            r52 = this;
            r2 = r55
            X.1PG r6 = X.1PG.A00(r2)
            X.0qQ.A07(r6)
            X.1PB r4 = A01
            X.1An r23 = X.1An.A2y
            r0 = r23
            X.2vA r7 = r6.A02(r0, r4)
            r48 = r66
            r0 = r48
            r7.A0d = r0
            r47 = r64
            java.lang.String r0 = r47.getSessionId()
            r7.A0f = r0
            r1 = r65
            r51 = r53
            r5 = r60
            r0 = r51
            X.2ve r22 = X.AnonymousClass6VN.A00(r0, r2, r5, r1)
            java.lang.Boolean r0 = X.AnonymousClass1PP.A00(r2)
            boolean r21 = r0.booleanValue()
            java.lang.Boolean r0 = X.AnonymousClass1PV.A00(r2)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x004b
            java.lang.Boolean r0 = X.C55094Hc3.A00(r2)
            boolean r0 = r0.booleanValue()
            r20 = 0
            if (r0 == 0) goto L_0x004d
        L_0x004b:
            r20 = 1
        L_0x004d:
            X.0Tu r3 = X.0Tu.A05
            r0 = 36310542579007614(0x81003f0006007e, double:3.0262715655591284E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x02f6
            X.3kU r8 = r6.A05(r4)
            X.0qQ.A0A(r8)
            r1 = 1
        L_0x0062:
            r0 = r5
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            java.util.List r0 = r0.A02
            r9 = r68
            r10 = r67
            X.2w4 r0 = X.AnonymousClass414.A01(r0, r10, r9)
            X.3C3 r11 = new X.3C3
            r11.<init>(r2)
            X.2vs r10 = new X.2vs
            r10.<init>(r1)
            X.2vq r9 = new X.2vq
            r9.<init>(r11)
            X.1PM r1 = r6.A00
            X.0qQ.A07(r1)
            r39 = r69
            r15 = r59
            r24 = r2
            r25 = r7
            r26 = r15
            r27 = r5
            r28 = r22
            r29 = r1
            r30 = r0
            r31 = r11
            r32 = r8
            r33 = r9
            r34 = r10
            r35 = r39
            X.2vi r19 = X.AnonymousClass6VP.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.1PX r32 = r6.A04(r4)
            X.0qQ.A07(r32)
            r25 = r5
            r26 = r0
            r27 = r22
            r28 = r8
            r29 = r19
            X.6VS r18 = A01(r24, r25, r26, r27, r28, r29)
            r14 = 0
            X.IWj r1 = new X.IWj
            r1.<init>(r8, r14)
            java.lang.String r49 = r47.getSessionId()
            r28 = r56
            r29 = r57
            r40 = r2
            r41 = r7
            r42 = r28
            r43 = r29
            r44 = r1
            r45 = r5
            r46 = r11
            r50 = r39
            X.2vG r17 = X.AnonymousClass3CB.A00(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            X.2v6 r13 = new X.2v6
            r13.<init>()
            X.3CH r12 = new X.3CH
            r25 = r54
            r5 = r51
            r1 = r25
            r12.<init>(r5, r1, r2)
            r9 = 0
            X.1Pg r1 = X.1Pg.A02
            X.1Ph r16 = r1.A00(r4)
            if (r59 == 0) goto L_0x00fe
            X.6VU r9 = new X.6VU
            r5 = r16
            r1 = r51
            r9.<init>(r1, r2, r15, r5)
        L_0x00fe:
            X.2w5 r5 = new X.2w5
            r5.<init>(r0)
            r0 = r17
            r5.A0K = r0
            X.0tS r0 = X.DbT.A0h()
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x02ef
            r0 = 36312879040890204(0x81025f0001055c, double:3.027749153461855E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 != 0) goto L_0x02ef
            X.1PJ r38 = A02
            r33 = r2
            r34 = r11
            r35 = r22
            r36 = r17
            r37 = r8
            X.2wO r0 = X.AnonymousClass6VY.A00(r33, r34, r35, r36, r37, r38)
        L_0x012c:
            r5.A0J = r0
            r0 = r22
            r5.A0H = r0
            r36 = r62
            r30 = r9
            r31 = r18
            r33 = r11
            r34 = r17
            r35 = r8
            r37 = r47
            r38 = r48
            r24 = r51
            r26 = r2
            r27 = r7
            X.6Ve r0 = X.AnonymousClass3CJ.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r5.A0G = r0
            r5.A0L = r8
            r5.A0E = r11
            r0 = r19
            r5.A0N = r0
            r0 = r63
            r5.A0P = r0
            r0 = r61
            r5.A02(r0)
            r5.A02(r12)
            r0 = r58
            r5.A0F = r0
            r5.A0B = r13
            r5.A0Q = r10
            r7 = r28
            r1 = r18
            r0 = r47
            X.2y6 r0 = X.C309976aE.A01(r2, r7, r1, r0)
            r5.A0R = r0
            r0 = 36310542580252814(0x81003f0019008e, double:3.026271566346598E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            r5.A0h = r0
            r0 = 36310542581170326(0x81003f00270096, double:3.026271566926836E-306)
            boolean r7 = X.182.A06(r3, r2, r0)
            if (r21 == 0) goto L_0x02e8
            r0 = 36602943952393050(0x820a2f0004135a, double:3.2111873714939033E-306)
        L_0x0191:
            int r0 = X.DbS.A04(r3, r2, r0)
            r5.A0f = r7
            r5.A02 = r0
            r0 = 36310542581432473(0x81003f002b0099, double:3.026271567092619E-306)
            boolean r9 = X.182.A06(r3, r2, r0)
            if (r21 == 0) goto L_0x02e2
            java.lang.Long r0 = X.AnonymousClass54K.A00(r2)
        L_0x01a8:
            long r0 = r0.longValue()
            int r7 = (int) r0
            r5.A0e = r9
            r5.A01 = r7
            X.2wC r7 = A02(r2)
            r0 = 36592017558208636(0x82003f002c007c, double:3.204277475814622E-306)
            int r0 = X.DbS.A04(r3, r2, r0)
            r5.A09 = r7
            r5.A00 = r0
            r0 = 36310542581563546(0x81003f002d009a, double:3.02627156717551E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            r5.A0k = r0
            r7 = 0
            r5.A0p = r14
            java.lang.Boolean r0 = X.AnonymousClass1PZ.A00(r2)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01e5
            X.1Av r0 = X.1Au.A00(r2)
            boolean r0 = X.C228342lQ.A0A(r2, r0)
            r9 = 1
            if (r0 == 0) goto L_0x01e6
        L_0x01e5:
            r9 = 0
        L_0x01e6:
            r0 = 36310542582481059(0x81003f003b00a3, double:3.026271567755749E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            r5.A01(r6, r4, r9, r0)
            X.1Av r0 = X.1Au.A00(r2)
            boolean r0 = X.C228342lQ.A09(r2, r0)
            r5.A0i = r0
            java.lang.String r0 = r28.getModuleName()
            r5.A0S = r0
            r0 = 36310542582743207(0x81003f003f00a7, double:3.0262715679215324E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            r5.A0c = r0
            r0 = r23
            r5.A07 = r0
            java.lang.Boolean r0 = X.AnonymousClass1PQ.A00(r2)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0226
            java.lang.Boolean r0 = X.AnonymousClass1PP.A00(r2)
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x0227
        L_0x0226:
            r0 = 1
        L_0x0227:
            r5.A0Z = r0
            X.2lS r0 = X.AnonymousClass2lR.A00(r2)
            r5.A06 = r0
            r0 = 36310542583398575(0x81003f004900af, double:3.02627156833599E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            r5.A0X = r0
            r0 = 36310542583660720(0x81003f004d00b0, double:3.0262715685017714E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 != 0) goto L_0x0253
            X.0Tu r6 = X.0Tu.A06
            r0 = 2342160827467961925(0x208106dd00101645, double:4.06373594492892E-152)
            boolean r1 = X.182.A06(r6, r2, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0254
        L_0x0253:
            r0 = 1
        L_0x0254:
            r5.A0W = r0
            r5.A0C = r4
            r0 = 36310542583791794(0x81003f004f00b2, double:3.026271568584663E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 != 0) goto L_0x026e
            r0 = 36321468975424908(0x810a2f0000258c, double:3.033181462650492E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x026f
        L_0x026e:
            r7 = 1
        L_0x026f:
            r0 = 36310542583857331(0x81003f005000b3, double:3.026271568626109E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            r5.A0T = r7
            r5.A0U = r0
            r5.A03 = r2
            r0 = r20
            r5.A0d = r0
            if (r20 == 0) goto L_0x02df
            X.2wI r6 = X.AnonymousClass2wI.A03
        L_0x0286:
            r0 = 36321718083659419(0x810a690002269b, double:3.033338999701075E-306)
            boolean r9 = X.182.A06(r3, r2, r0)
            r0 = 36321718083724956(0x810a690003269c, double:3.033338999742521E-306)
            boolean r7 = X.182.A06(r3, r2, r0)
            r0 = 36321718083790493(0x810a690004269d, double:3.033338999783967E-306)
            boolean r4 = X.182.A06(r3, r2, r0)
            r0 = 36321718083856030(0x810a690005269e, double:3.033338999825413E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            r5.A0A = r6
            r5.A0m = r9
            r5.A0b = r7
            r5.A0a = r4
            r5.A0V = r0
            if (r59 == 0) goto L_0x02be
            X.6Vi r0 = new X.6Vi
            r0.<init>(r15, r8)
            r5.A02(r0)
        L_0x02be:
            java.lang.String r1 = r28.getModuleName()
            r0 = r51
            java.util.ArrayList r0 = X.C308726Vj.A00(r0, r2, r8, r1)
            X.2wV r4 = r5.A00()
            java.util.ArrayList r9 = X.00k.A0U(r0)
            X.6Vm r1 = new X.6Vm
            r3 = r18
            r5 = r16
            r6 = r17
            r7 = r8
            r8 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        L_0x02df:
            X.2wI r6 = X.AnonymousClass2wI.A02
            goto L_0x0286
        L_0x02e2:
            java.lang.Long r0 = X.AnonymousClass1PS.A00(r2)
            goto L_0x01a8
        L_0x02e8:
            r0 = 36592017557815418(0x82003f0026007a, double:3.2042774755659493E-306)
            goto L_0x0191
        L_0x02ef:
            X.3CI r0 = new X.3CI
            r0.<init>()
            goto L_0x012c
        L_0x02f6:
            java.lang.Boolean r0 = X.AnonymousClass1PQ.A00(r2)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0303
            r15 = 0
            if (r21 == 0) goto L_0x033d
        L_0x0303:
            r15 = 1
            if (r21 == 0) goto L_0x033d
            java.lang.Long r0 = X.AnonymousClass54J.A00(r2)
        L_0x030a:
            long r0 = r0.longValue()
            int r9 = (int) r0
            if (r21 == 0) goto L_0x0338
            java.lang.Long r0 = X.AnonymousClass54K.A00(r2)
        L_0x0315:
            long r0 = r0.longValue()
            int r10 = (int) r0
            java.lang.Boolean r0 = X.AnonymousClass1PT.A00(r2)
            boolean r16 = r0.booleanValue()
            java.lang.Boolean r0 = X.AnonymousClass1PU.A00(r2)
            boolean r17 = r0.booleanValue()
            r1 = 1
            X.3kT r8 = new X.3kT
            r11 = r8
            r12 = r2
            r13 = r9
            r14 = r10
            r18 = r20
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0062
        L_0x0338:
            java.lang.Long r0 = X.AnonymousClass1PS.A00(r2)
            goto L_0x0315
        L_0x033d:
            java.lang.Long r0 = X.AnonymousClass1PR.A00(r2)
            goto L_0x030a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56660I6p.A00(android.content.Context, X.07i, com.instagram.common.session.UserSession, X.4DU, X.3BQ, X.6aG, X.6aH, X.4gh, X.2wS, X.2l0, X.2lD, X.3kK, instagram.features.stories.fragment.ReelViewerFragment, java.lang.String, java.util.List, int, boolean):X.6Vm");
    }

    public static final AnonymousClass6VS A01(UserSession userSession, C270414gh r2, C233632w4 r3, C233402vf r4, C249863kU r5, C233432vi r6) {
        return new AnonymousClass6VS(userSession, r2, r3, r4, r5, r6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (X.182.A06(r2, r3, 36321468975949201L) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C233682wC A02(com.instagram.common.session.UserSession r3) {
        /*
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321468975883664(0x810a2f00072590, double:3.033181462940611E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x001b
            r0 = 36321468975949201(0x810a2f00082591, double:3.033181462982057E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0034
        L_0x0018:
            X.2wC r0 = X.C233682wC.A03
            return r0
        L_0x001b:
            r0 = 36310542581825694(0x81003f0031009e, double:3.0262715673412935E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0018
            r0 = 36310542581235863(0x81003f00280097, double:3.026271566968282E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0034
            X.2wC r0 = X.C233682wC.A04
            return r0
        L_0x0034:
            X.2wC r0 = X.C233682wC.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56660I6p.A02(com.instagram.common.session.UserSession):X.2wC");
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object, X.1L1] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00f8, code lost:
        if (X.C228342lQ.A0A(r5, X.1Au.A00(r5)) != false) goto L_0x00fa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C233812wV A03(android.content.Context r35, X.AnonymousClass07i r36, com.instagram.common.session.UserSession r37, X.AnonymousClass4DU r38, X.AnonymousClass3BQ r39, X.C233782wS r40, java.lang.String r41) {
        /*
            r34 = 0
            X.1L1 r11 = new X.1L1
            r11.<init>()
            r15 = r41
            r11.A00 = r15
            X.3Bn r10 = new X.3Bn
            r10.<init>()
            r5 = r37
            X.1PG r4 = X.1PG.A00(r5)
            X.0qQ.A07(r4)
            X.1PB r3 = A01
            X.1An r2 = X.1An.A2y
            X.2vA r20 = r4.A02(r2, r3)
            X.3kU r9 = r4.A05(r3)
            X.0qQ.A07(r9)
            X.1PX r23 = r4.A04(r3)
            X.0qQ.A07(r23)
            X.2w4 r8 = X.C233632w4.A05
            X.3C3 r7 = new X.3C3
            r7.<init>(r5)
            r1 = 1
            X.IWj r0 = new X.IWj
            r0.<init>(r9, r1)
            r29 = 0
            r21 = r38
            r22 = r39
            r24 = r5
            r25 = r20
            r26 = r21
            r27 = r22
            r28 = r0
            r30 = r7
            r31 = r11
            r32 = r15
            r33 = r15
            X.2vG r12 = X.AnonymousClass3CB.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r13 = r35
            X.3CG r1 = X.AnonymousClass3CE.A00(r13, r5, r9)
            X.3CH r0 = new X.3CH
            r14 = r36
            r0.<init>(r13, r14, r5)
            java.lang.Boolean r6 = X.AnonymousClass1PP.A00(r5)
            boolean r16 = r6.booleanValue()
            X.2w5 r6 = new X.2w5
            r6.<init>(r8)
            r6.A0K = r12
            X.3CI r8 = new X.3CI
            r8.<init>()
            r6.A0J = r8
            r6.A0H = r10
            r24 = r7
            r25 = r12
            r26 = r9
            r27 = r11
            r28 = r15
            r19 = r5
            r18 = r14
            r17 = r13
            X.3CO r8 = X.AnonymousClass3CJ.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r6.A0G = r8
            r6.A0L = r9
            r6.A0E = r7
            X.2vw r7 = new X.2vw
            r7.<init>()
            r6.A0N = r7
            X.3Ck r7 = new X.3Ck
            r7.<init>()
            r6.A0P = r7
            r7 = r40
            r6.A02(r7)
            r6.A02(r0)
            java.util.List r0 = r6.A0u
            r0.add(r1)
            X.0Tu r7 = X.0Tu.A05
            r0 = 36310542581170326(0x81003f00270096, double:3.026271566926836E-306)
            boolean r8 = X.182.A06(r7, r5, r0)
            if (r16 == 0) goto L_0x0143
            r0 = 36602943952393050(0x820a2f0004135a, double:3.2111873714939033E-306)
        L_0x00c4:
            int r0 = X.DbS.A04(r7, r5, r0)
            r6.A0f = r8
            r6.A02 = r0
            r0 = 36310542581432473(0x81003f002b0099, double:3.026271567092619E-306)
            boolean r9 = X.182.A06(r7, r5, r0)
            if (r16 == 0) goto L_0x013e
            java.lang.Long r0 = X.AnonymousClass54K.A00(r5)
        L_0x00db:
            long r0 = r0.longValue()
            int r8 = (int) r0
            r6.A0e = r9
            r6.A01 = r8
            java.lang.Boolean r0 = X.AnonymousClass1PZ.A00(r5)
            boolean r0 = r0.booleanValue()
            r8 = 1
            if (r0 == 0) goto L_0x00fa
            X.1Av r0 = X.1Au.A00(r5)
            boolean r0 = X.C228342lQ.A0A(r5, r0)
            r9 = 1
            if (r0 == 0) goto L_0x00fb
        L_0x00fa:
            r9 = 0
        L_0x00fb:
            r0 = 36310542582481059(0x81003f003b00a3, double:3.026271567755749E-306)
            boolean r0 = X.182.A06(r7, r5, r0)
            r6.A01(r4, r3, r9, r0)
            X.1Av r0 = X.1Au.A00(r5)
            boolean r0 = X.C228342lQ.A09(r5, r0)
            r6.A0i = r0
            r6.A07 = r2
            java.lang.Boolean r0 = X.AnonymousClass1PQ.A00(r5)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0128
            java.lang.Boolean r0 = X.AnonymousClass1PP.A00(r5)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0128
            r8 = 0
        L_0x0128:
            r6.A0Z = r8
            r6.A0C = r3
            r0 = 36310542583660720(0x81003f004d00b0, double:3.0262715685017714E-306)
            boolean r0 = X.182.A06(r7, r5, r0)
            r6.A0W = r0
            r6.A03 = r5
            X.2wV r0 = r6.A00()
            return r0
        L_0x013e:
            java.lang.Long r0 = X.AnonymousClass1PS.A00(r5)
            goto L_0x00db
        L_0x0143:
            r0 = 36592017557815418(0x82003f0026007a, double:3.2042774755659493E-306)
            goto L_0x00c4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56660I6p.A03(android.content.Context, X.07i, com.instagram.common.session.UserSession, X.4DU, X.3BQ, X.2wS, java.lang.String):X.2wV");
    }

    public static final void A04(UserSession userSession) {
        if (182.A06(0Tu.A05, userSession, 36310542579007614L)) {
            0qQ.A0A(1PG.A00(userSession).A05(A01));
            return;
        }
        boolean booleanValue = AnonymousClass1PP.A00(userSession).booleanValue();
        AnonymousClass1PQ.A00(userSession);
        if (booleanValue) {
            AnonymousClass54J.A00(userSession);
            AnonymousClass54K.A00(userSession);
        } else {
            AnonymousClass1PR.A00(userSession);
            AnonymousClass1PS.A00(userSession);
        }
        AnonymousClass1PT.A00(userSession);
        AnonymousClass1PU.A00(userSession);
        if (!AnonymousClass1PV.A00(userSession).booleanValue()) {
            C55094Hc3.A00(userSession);
        }
    }

    public final C308756Vm A05(Context context, AnonymousClass07i r3, UserSession userSession, AnonymousClass4DU r5, AnonymousClass3BQ r6, C309996aG r7, C310006aH r8, C270414gh r9, C233782wS r10, C228232l0 r11, AnonymousClass2lD r12, C249763kK r13, ReelViewerFragment reelViewerFragment, String str, List list, int i, boolean z) {
        return A00(context, r3, userSession, r5, r6, r7, r8, r9, r10, r11, r12, r13, reelViewerFragment, str, list, i, z);
    }
}
