package X;

import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Gu2  reason: case insensitive filesystem */
public final class C53773Gu2 extends C251343mx {
    public final FoaUserSession A00;
    public final String A01;
    public final String A02;
    public final AnonymousClass0r6 A03;
    public final AnonymousClass0Ud A04;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: X.Gsl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v36, resolved type: X.7f3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: X.7f3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r6v3, types: [X.3mp] */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x038d, code lost:
        if (r16 != false) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03db, code lost:
        r10 = X.AnonymousClass3EM.A05(18312718348073138L, true);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r63) {
        /*
            r62 = this;
            r9 = 0
            r1 = r63
            X.0qQ.A0B(r1, r9)
            X.2V1 r0 = r1.A05
            r61 = r0
            java.lang.Class<X.F3q> r2 = X.C49726F3q.class
            java.lang.Object r11 = r0.A06(r2)
            if (r11 == 0) goto L_0x063d
            r7 = r62
            X.0r6 r10 = r7.A03
            r2 = 1
            X.0qQ.A0B(r10, r2)
            boolean r0 = r10 instanceof X.AnonymousClass0Ud
            if (r0 == 0) goto L_0x0066
            r0 = r10
            X.0Ud r0 = (X.AnonymousClass0Ud) r0
            java.lang.Object r3 = r0.getValue()
        L_0x0025:
            r0 = 37
            X.Ivv r8 = X.C58686Ivv.A00(r3, r0)
            java.lang.Object[] r6 = new java.lang.Object[]{r10}
            r3 = 0
            r5 = 32
            r4 = 42
            X.MGC r0 = new X.MGC
            r0.<init>((java.lang.Object) r10, (X.AnonymousClass4D7) r3, (int) r5, (int) r4)
            java.lang.Object r0 = X.C247253g2.A00(r1, r8, r0, r6)
            X.HHG r0 = (X.HHG) r0
            java.util.List r10 = r0.A01
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r10.iterator()
        L_0x004d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x006e
            java.lang.Object r5 = r6.next()
            r0 = r5
            com.meta.foa.accountswitcher.UserAccountInfo r0 = (com.meta.foa.accountswitcher.UserAccountInfo) r0
            java.lang.String r4 = r0.A09
            java.lang.String r0 = "LOGGED_OUT"
            boolean r0 = X.C51966G9m.A1a(r4, r0)
            X.C51970G9q.A1Q(r5, r14, r15, r0)
            goto L_0x004d
        L_0x0066:
            X.0sn r0 = X.0sn.A00
            X.HHG r3 = new X.HHG
            r3.<init>(r0, r9)
            goto L_0x0025
        L_0x006e:
            X.0Ud r0 = r7.A04
            java.lang.Object r0 = X.GMJ.A00(r1, r0)
            X.HHF r0 = (X.HHF) r0
            java.util.List r8 = r0.A01
            java.lang.Integer r6 = r0.A00
            com.meta.foa.session.FoaUserSession r0 = r7.A00
            r39 = r0
            X.0qQ.A0B(r0, r9)
            com.instagram.common.session.UserSession r0 = X.C56316HwT.A00(r39)
            boolean r17 = X.FFT.A02(r0)
            X.0gF r26 = X.C60340gF.A00
            java.lang.Object[] r12 = new java.lang.Object[]{r26}
            r5 = 27
            X.GL3 r4 = new X.GL3
            r0 = r17
            r4.<init>(r5, r11, r7, r0)
            X.C243773a4.A00(r1, r4, r12)
            r25 = 2
            java.lang.Object[] r4 = new java.lang.Object[]{r10, r8}
            r0 = 29
            X.Iw8 r0 = X.C58699Iw8.A00(r8, r10, r7, r6, r0)
            X.C243773a4.A00(r1, r0, r4)
            X.Iw6 r0 = X.C58697Iw6.A00(r8, r10, r7, r2)
            X.0sa r4 = X.AnonymousClass3j0.A00(r1, r0)
            r12 = 28
            X.TTN r0 = new X.TTN
            r0.<init>(r4, r12)
            X.2Wa r0 = X.C243643Zq.A00(r1, r0)
            java.lang.Object r0 = r0.A03
            r24 = r0
            r0 = r24
            X.Spj r0 = (X.C12229Spj) r0
            r24 = r0
            r4 = 7
            X.JG0 r0 = new X.JG0
            r0.<init>(r4, r11, r7)
            X.0sL r13 = X.AnonymousClass3j0.A02(r1, r0)
            r0 = r25
            X.Iw6 r0 = X.C58697Iw6.A00(r11, r1, r7, r0)
            X.0sa r50 = X.AnonymousClass3j0.A00(r1, r0)
            r0 = 35
            X.JG3 r0 = X.JG3.A00(r11, r7, r1, r0)
            X.0sL r5 = X.AnonymousClass3j0.A02(r1, r0)
            r4 = 6
            X.JG0 r0 = new X.JG0
            r0.<init>(r4, r5, r13)
            X.0sL r20 = X.AnonymousClass3j0.A02(r1, r0)
            java.util.Iterator r13 = r14.iterator()
        L_0x00f3:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01ad
            java.lang.Object r0 = r13.next()
            r4 = r0
            com.meta.foa.accountswitcher.UserAccountInfo r4 = (com.meta.foa.accountswitcher.UserAccountInfo) r4
            java.lang.String r5 = r4.A09
            java.lang.String r4 = "CURRENT"
            boolean r4 = X.0qQ.A0K(r5, r4)
            if (r4 != 0) goto L_0x011a
            java.lang.String r4 = "CURRENT_AP"
            boolean r4 = X.0qQ.A0K(r5, r4)
            if (r4 != 0) goto L_0x011a
            java.lang.String r4 = "CURRENT_SHARED"
            boolean r4 = X.0qQ.A0K(r5, r4)
            if (r4 == 0) goto L_0x00f3
        L_0x011a:
            com.meta.foa.accountswitcher.UserAccountInfo r0 = (com.meta.foa.accountswitcher.UserAccountInfo) r0
            r4 = 31
            X.Iw8 r4 = X.C58699Iw8.A00(r11, r1, r7, r0, r4)
            X.0sa r40 = X.AnonymousClass3j0.A00(r1, r4)
            X.IxF r4 = new X.IxF
            r27 = r4
            r28 = r12
            r29 = r0
            r30 = r7
            r31 = r1
            r32 = r11
            r27.<init>(r28, r29, r30, r31, r32)
            X.0sP r21 = X.AnonymousClass3j0.A01(r1, r4)
            r4 = 30
            X.Iw8 r4 = X.C58699Iw8.A00(r11, r1, r7, r0, r4)
            X.0sa r23 = X.AnonymousClass3j0.A00(r1, r4)
            r28 = 34
            X.IoM r4 = new X.IoM
            r27 = r4
            r29 = r11
            r30 = r0
            r31 = r7
            r32 = r1
            r33 = r15
            r27.<init>(r28, r29, r30, r31, r32, r33)
            X.AnonymousClass3j0.A00(r1, r4)
            r22 = 4
            r4 = r22
            X.Iw6 r4 = X.C58697Iw6.A00(r11, r1, r7, r4)
            X.0sa r60 = X.AnonymousClass3j0.A00(r1, r4)
            X.HKy r4 = X.C54615HKy.A02
            X.HPu r14 = X.I3H.A01(r1, r4)
            if (r0 == 0) goto L_0x0286
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            if (r6 == r4) goto L_0x0286
            r4 = 26
            X.J6g r11 = X.C59098J6g.A01(r7, r4)
            X.FGe r15 = X.C49949FGe.A00
            r4 = r39
            boolean r4 = r15.A05(r4)
            if (r4 == 0) goto L_0x01e0
            com.instagram.common.session.UserSession r4 = X.C56316HwT.A00(r39)
            X.1wM r6 = X.1wB.A00(r4)
            com.facebook.common.callercontext.CallerContext r5 = X.C46399DeM.A00
            java.lang.String r4 = "INSTAGRAM"
            java.util.List r4 = r6.A02(r5, r4)
            java.util.ArrayList r12 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r5 = r4.iterator()
        L_0x019b:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x01b0
            java.lang.Object r4 = r5.next()
            fxcache.model.FxCalAccountWithSwitcherInfo r4 = (fxcache.model.FxCalAccountWithSwitcherInfo) r4
            java.lang.String r4 = r4.A0B
            r12.add(r4)
            goto L_0x019b
        L_0x01ad:
            r0 = 0
            goto L_0x011a
        L_0x01b0:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r10.iterator()
        L_0x01b8:
            boolean r4 = r16.hasNext()
            if (r4 == 0) goto L_0x01db
            java.lang.Object r6 = r16.next()
            r5 = r6
            com.meta.foa.accountswitcher.UserAccountInfo r5 = (com.meta.foa.accountswitcher.UserAccountInfo) r5
            java.lang.String r13 = r5.A09
            java.lang.String r4 = "CURRENT"
            boolean r4 = X.0qQ.A0K(r13, r4)
            if (r4 != 0) goto L_0x01d7
            java.lang.String r4 = r5.A0A
            boolean r4 = r12.contains(r4)
            if (r4 == 0) goto L_0x01b8
        L_0x01d7:
            r7.add(r6)
            goto L_0x01b8
        L_0x01db:
            java.util.ArrayList r4 = X.00k.A0S(r8, r7)
            goto L_0x01e1
        L_0x01e0:
            r4 = r10
        L_0x01e1:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r4.iterator()
        L_0x01e9:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x0204
            java.lang.Object r5 = r6.next()
            X.0qQ.A0A(r5)
            java.lang.Object r4 = r11.invoke(r5)
            boolean r4 = X.AnonymousClass7TE.A1a(r4)
            if (r4 == 0) goto L_0x01e9
            r7.add(r5)
            goto L_0x01e9
        L_0x0204:
            r4 = r39
            boolean r4 = r15.A05(r4)
            if (r4 == 0) goto L_0x0261
            com.instagram.common.session.UserSession r4 = X.C56316HwT.A00(r39)
            X.1wM r6 = X.1wB.A00(r4)
            com.facebook.common.callercontext.CallerContext r5 = X.C46399DeM.A00
            java.lang.String r4 = "INSTAGRAM"
            java.util.List r4 = r6.A02(r5, r4)
            java.util.ArrayList r12 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r5 = r4.iterator()
        L_0x0224:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x0236
            java.lang.Object r4 = r5.next()
            fxcache.model.FxCalAccountWithSwitcherInfo r4 = (fxcache.model.FxCalAccountWithSwitcherInfo) r4
            java.lang.String r4 = r4.A0B
            r12.add(r4)
            goto L_0x0224
        L_0x0236:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r10.iterator()
        L_0x023e:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x0261
            java.lang.Object r10 = r13.next()
            r6 = r10
            com.meta.foa.accountswitcher.UserAccountInfo r6 = (com.meta.foa.accountswitcher.UserAccountInfo) r6
            java.lang.String r5 = r6.A09
            java.lang.String r4 = "CURRENT"
            boolean r4 = X.0qQ.A0K(r5, r4)
            if (r4 != 0) goto L_0x023e
            java.lang.String r4 = r6.A0A
            boolean r4 = r12.contains(r4)
            if (r4 != 0) goto L_0x023e
            r8.add(r10)
            goto L_0x023e
        L_0x0261:
            java.util.ArrayList r19 = X.DbV.A15(r8)
            java.util.Iterator r6 = r8.iterator()
        L_0x0269:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x02a2
            java.lang.Object r5 = r6.next()
            X.0qQ.A0A(r5)
            java.lang.Object r4 = r11.invoke(r5)
            boolean r4 = X.AnonymousClass7TE.A1a(r4)
            if (r4 == 0) goto L_0x0269
            r4 = r19
            r4.add(r5)
            goto L_0x0269
        L_0x0286:
            X.XRa r7 = X.C21255XRa.A1w
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            X.3Zh r4 = X.C243573Zh.CENTER
            X.2WX r2 = new X.2WX
            r2.<init>(r3, r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.2WX r0 = X.G9t.A0z(r3, r0, r4)
            X.2WX r0 = r2.A00(r0)
            X.Gsl r6 = new X.Gsl
            r6.<init>(r7, r0, r5)
            goto L_0x059d
        L_0x02a2:
            int r6 = r7.size()
            int r10 = r19.size()
            if (r10 <= 0) goto L_0x02d3
            r4 = 18594193325102817(0x420f52000716e1, double:2.0092244468338518E-307)
            X.1AW.A05(r4)
            X.0Tu r8 = X.0Tu.A04
            X.0qQ.A08(r8)
            long r4 = X.1AW.A01(r8, r4)
            int r8 = (int) r4
            int r4 = r6 + r10
            if (r4 <= r8) goto L_0x062a
            r4 = 18312718348269749(0x410f52000538b5, double:1.897970753860108E-307)
            boolean r4 = X.AnonymousClass3EM.A05(r4, r2)
            if (r4 == 0) goto L_0x062a
            int r8 = r8 - r10
            int r8 = r8 - r2
        L_0x02cf:
            int r6 = java.lang.Math.max(r8, r2)
        L_0x02d3:
            java.util.List r31 = X.00k.A0d(r7, r6)
            java.util.List r6 = X.00k.A0c(r7, r6)
            X.C243803a8.A00(r1)
            boolean r4 = r6.isEmpty()
            r32 = 0
            if (r4 != 0) goto L_0x0357
            boolean r4 = X.C49949FGe.A04(r39)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0357
            r4 = 18312718348269749(0x410f52000538b5, double:1.897970753860108E-307)
            boolean r4 = X.AnonymousClass3EM.A05(r4, r2)
            if (r4 != 0) goto L_0x0304
            r4 = 18312718348335286(0x410f52000638b6, double:1.8979707538860117E-307)
            boolean r4 = X.AnonymousClass3EM.A05(r4, r2)
            if (r4 == 0) goto L_0x0357
        L_0x0304:
            int r5 = r6.size()
            java.lang.String r7 = ""
            r4 = r25
            if (r5 >= r4) goto L_0x05fc
            java.lang.Object r4 = r6.get(r9)
            com.meta.foa.accountswitcher.UserAccountInfo r4 = (com.meta.foa.accountswitcher.UserAccountInfo) r4
            java.lang.String r4 = r4.A06
            if (r4 == 0) goto L_0x0319
            r7 = r4
        L_0x0319:
            android.net.Uri r7 = X.DbT.A09(r7)
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            X.IcP r4 = new X.IcP
            r4.<init>(r7, r3, r6, r5)
        L_0x0326:
            android.content.res.Resources r6 = X.C51969G9p.A0M(r1)
            r5 = 2131962814(0x7f132bbe, float:1.9562364E38)
            java.lang.String r56 = r6.getString(r5)
            if (r56 == 0) goto L_0x0357
            X.XSY r33 = X.XSY.CARET_RIGHT
            X.HOw r36 = X.C54691HOw.FILLED
            X.HOv r35 = X.C54690HOv.SIZE_16
            X.XRa r37 = X.C21255XRa.A2A
            X.XSY r34 = X.XSY.CARET_LEFT
            X.IcM r53 = new X.IcM
            r32 = r53
            r32.<init>(r33, r34, r35, r36, r37)
            X.Gv9 r32 = new X.Gv9
            r51 = r32
            r52 = r3
            r54 = r4
            r55 = r3
            r57 = r3
            r58 = r3
            r59 = r3
            r51.<init>(r52, r53, r54, r55, r56, r57, r58, r59, r60)
        L_0x0357:
            java.lang.String r0 = r0.A08
            r27 = r0
            android.content.res.Resources r4 = X.C51969G9p.A0M(r1)
            r0 = 2131952261(0x7f130285, float:1.954096E38)
            java.lang.String r46 = X.AnonymousClass7TF.A0d(r4, r0)
            if (r17 != 0) goto L_0x05d8
            r33 = 0
        L_0x036a:
            boolean r0 = X.C49949FGe.A04(r39)
            if (r0 != 0) goto L_0x05d4
            boolean r0 = X.C49949FGe.A04(r39)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x05c7
            r4 = 18312718348138675(0x410f52000338b3, double:1.8979707538083007E-307)
            boolean r0 = X.AnonymousClass3EM.A05(r4, r2)
            if (r0 == 0) goto L_0x05c7
        L_0x0383:
            r16 = 1
        L_0x0385:
            boolean r0 = X.C49949FGe.A04(r39)
            if (r0 != 0) goto L_0x038f
            r18 = 1
            if (r16 == 0) goto L_0x0391
        L_0x038f:
            r18 = 0
        L_0x0391:
            X.3XV r0 = X.2WX.A02
            r4 = -4602678819172646912(0xc020000000000000, double:-8.0)
            X.2WX r5 = X.C51973G9u.A0P(r3, r4)
            r4 = r24
            r0 = r25
            X.0qQ.A0B(r4, r0)
            java.lang.Integer r17 = X.AnonymousClass05K.A00
            X.3ar r6 = new X.3ar
            r4 = r26
            r0 = r24
            r6.<init>(r0, r4)
            r4 = r17
            r0 = r25
            X.2WX r28 = X.C51971G9r.A0Y(r5, r4, r6, r0)
            long r11 = X.C51969G9p.A0D()
            X.3AS r24 = X.C336767f9.A00
            r0 = r61
            X.3X5 r0 = r0.A02
            X.2Sa r4 = r0.A01
            X.3X7 r0 = r4.A02
            r25 = r0
            boolean r13 = r4.A0W
            X.7en r0 = new X.7en
            r4 = r61
            r0.<init>(r4)
            boolean r4 = X.AnonymousClass7TE.A1b(r31)
            if (r4 == 0) goto L_0x0439
            r10 = 0
            boolean r4 = X.C49949FGe.A04(r39)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x03e6
            r4 = 18312718348073138(0x410f52000238b2, double:1.897970753782397E-307)
            boolean r10 = X.AnonymousClass3EM.A05(r4, r2)
            if (r10 != 0) goto L_0x03e8
        L_0x03e6:
            if (r16 == 0) goto L_0x041a
        L_0x03e8:
            long r4 = X.C51969G9p.A0F()
            X.9JR r6 = X.C51967G9n.A0S(r9, r4)
            X.2WX r8 = X.C51974G9v.A0G(r3, r6, r9, r4)
            X.2V1 r4 = r0.A00
            X.2Wb r7 = X.AnonymousClass7TG.A0S(r4)
            if (r10 == 0) goto L_0x05c4
            android.content.res.Resources r5 = X.C51969G9p.A0M(r0)
            r4 = 2131976942(0x7f1362ee, float:1.9591019E38)
            java.lang.String r6 = X.AnonymousClass7TF.A0d(r5, r4)
        L_0x0407:
            r5 = 0
            if (r16 == 0) goto L_0x040c
            r5 = r23
        L_0x040c:
            X.Gvq r4 = new X.Gvq
            r4.<init>(r6, r5)
            X.2Tp r5 = X.C51967G9n.A0Q(r4, r7, r0, r8)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.A00(r5, r3, r4, r4)
        L_0x041a:
            r6 = r22
            r5 = r20
            r4 = r21
            X.C51973G9u.A0u(r6, r5, r4, r14)
            X.Iy1 r4 = new X.Iy1
            r29 = r4
            r30 = r21
            r34 = r3
            r35 = r5
            r36 = r39
            r37 = r27
            r38 = r2
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            X.I3H.A02(r0, r14, r4)
        L_0x0439:
            boolean r4 = X.DbT.A1b(r19)
            if (r4 != 0) goto L_0x044a
            r4 = 18316656832955265(0x4112e700004381, double:1.8995274498439363E-307)
            boolean r4 = X.AnonymousClass3EM.A05(r4, r2)
            if (r4 == 0) goto L_0x051d
        L_0x044a:
            android.content.res.Resources r5 = X.C51969G9p.A0M(r0)
            r4 = 2131974891(0x7f135aeb, float:1.9586859E38)
            java.lang.String r34 = X.AnonymousClass7TF.A0d(r5, r4)
            com.facebook.common.callercontext.CallerContext r4 = X.FRS.A00
            java.lang.String r35 = "test from getLoggedInFBAccountName"
            X.ItT r38 = X.C58534ItT.A00
            X.XSY r8 = X.XSY.PLUS
            X.HOw r7 = X.C54691HOw.FILLED
            X.XRa r6 = X.C21255XRa.A1o
            X.5ta r5 = X.C298515ta.DP40
            X.IcO r4 = new X.IcO
            r4.<init>(r8, r7, r6, r5)
            X.Gv9 r29 = new X.Gv9
            r30 = r3
            r31 = r3
            r32 = r4
            r33 = r3
            r36 = r34
            r37 = r3
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            long r6 = X.C51969G9p.A0F()
            long r4 = X.C51970G9q.A0H()
            X.9JR r6 = X.C51967G9n.A0S(r9, r6)
            X.2WX r8 = X.C51974G9v.A0G(r3, r6, r9, r4)
            X.2V1 r4 = r0.A00
            X.2Wb r7 = X.AnonymousClass7TG.A0S(r4)
            android.content.Context r16 = X.C243803a8.A00(r0)
            int r6 = r19.size()
            r4 = r39
            boolean r4 = r15.A05(r4)
            if (r4 != 0) goto L_0x04cb
            com.instagram.common.session.UserSession r4 = X.C56316HwT.A00(r39)
            X.1wM r10 = X.1wB.A00(r4)
            com.facebook.common.callercontext.CallerContext r5 = X.C46399DeM.A00
            java.lang.String r4 = "THREADS"
            java.util.List r4 = r10.A02(r5, r4)
            boolean r4 = X.AnonymousClass7TE.A1b(r4)
            if (r4 == 0) goto L_0x05b7
            r4 = 18312718348466359(0x410f52000838b7, double:1.8979707539378186E-307)
            boolean r4 = X.AnonymousClass3EM.A05(r4, r2)
            if (r4 == 0) goto L_0x05b7
            r4 = 18314891601395674(0x41114c00003fda, double:1.8988297376274974E-307)
            boolean r4 = X.AnonymousClass3EM.A05(r4, r2)
            if (r4 == 0) goto L_0x05b7
        L_0x04cb:
            android.content.res.Resources r5 = r16.getResources()
            r4 = 2131821043(0x7f1101f3, float:1.9274818E38)
            java.lang.String r4 = r5.getQuantityString(r4, r6)
            X.0qQ.A0A(r4)
        L_0x04d9:
            X.Gvq r5 = new X.Gvq
            r5.<init>(r4, r3)
            X.2Tp r5 = X.C51967G9n.A0Q(r5, r7, r0, r8)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.A00(r5, r3, r4, r4)
            r4 = 18316656832955265(0x4112e700004381, double:1.8995274498439363E-307)
            boolean r4 = X.AnonymousClass3EM.A05(r4, r2)
            if (r4 == 0) goto L_0x04f8
            boolean r4 = r19.isEmpty()
            if (r4 != 0) goto L_0x04fa
        L_0x04f8:
            r29 = 0
        L_0x04fa:
            r6 = r22
            r5 = r20
            r4 = r21
            X.C51973G9u.A0u(r6, r5, r4, r14)
            X.Iy1 r4 = new X.Iy1
            r30 = r4
            r31 = r21
            r32 = r19
            r34 = r29
            r35 = r3
            r36 = r5
            r37 = r39
            r38 = r27
            r39 = r2
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39)
            X.I3H.A02(r0, r14, r4)
        L_0x051d:
            if (r18 == 0) goto L_0x0560
            long r4 = X.C51969G9p.A0F()
            long r14 = X.C51970G9q.A0D()
            java.lang.Integer r6 = X.AnonymousClass05K.A04
            X.2WX r7 = X.AnonymousClass9JR.A00(r3, r6, r9, r4)
            X.9JR r6 = X.C51967G9n.A0V(r14)
            X.2WX r6 = X.C51974G9v.A0E(r7, r6, r9, r4)
            X.2V1 r4 = r0.A00
            X.2Wb r5 = X.AnonymousClass7TG.A0S(r4)
            r4 = 2131952115(0x7f1301f3, float:1.9540664E38)
            java.lang.String r36 = X.C244013aV.A0E(r0, r4)
            java.lang.Integer r38 = X.AnonymousClass05K.A01
            X.HOw r33 = X.C54691HOw.FILLED
            X.Hyw r35 = X.C56464Hyw.A00
            X.Gv8 r4 = new X.Gv8
            r32 = r4
            r34 = r3
            r37 = r17
            r39 = r17
            r41 = r2
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41)
            X.2Tp r5 = X.C51967G9n.A0Q(r4, r5, r0, r6)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.A00(r5, r3, r4, r4)
        L_0x0560:
            int r6 = X.G9t.A0i(r1, r11)
            r5 = r61
            r4 = r25
            X.7f1 r30 = X.C336677f0.A00(r5, r4, r6, r13)
            X.7eo r0 = r0.A01
            X.7f3 r6 = new X.7f3
            r23 = r6
            r25 = r3
            r26 = r3
            r27 = r3
            r29 = r3
            r31 = r0
            r32 = r3
            r33 = r3
            r34 = r3
            r35 = r3
            r36 = r3
            r37 = r3
            r38 = r3
            r39 = r3
            r40 = r3
            r41 = r3
            r42 = r3
            r43 = r3
            r44 = r3
            r45 = r2
            r46 = r9
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
        L_0x059d:
            r4 = 4640044622330986496(0x4064c00000000000, double:166.0)
            long r4 = java.lang.Double.doubleToRawLongBits(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            X.2WX r2 = X.AnonymousClass9JR.A00(r3, r0, r9, r4)
            r0 = r61
            X.2Wb r0 = X.G9t.A0v(r6, r0)
            X.2Tl r0 = X.C243563Zg.A04(r0, r1, r2)
            return r0
        L_0x05b7:
            android.content.res.Resources r5 = r16.getResources()
            r4 = 2131963490(0x7f132e62, float:1.9563735E38)
            java.lang.String r4 = X.AnonymousClass7TF.A0d(r5, r4)
            goto L_0x04d9
        L_0x05c4:
            r6 = 0
            goto L_0x0407
        L_0x05c7:
            r4 = 18312718348204212(0x410f52000438b4, double:1.8979707538342044E-307)
            boolean r0 = X.AnonymousClass3EM.A05(r4, r2)
            if (r0 == 0) goto L_0x05d4
            goto L_0x0383
        L_0x05d4:
            r16 = 0
            goto L_0x0385
        L_0x05d8:
            X.XSY r7 = X.XSY.PLUS
            X.HOw r6 = X.C54691HOw.FILLED
            X.XRa r5 = X.C21255XRa.A1o
            X.5ta r4 = X.C298515ta.DP40
            X.IcO r0 = new X.IcO
            r0.<init>(r7, r6, r5, r4)
            X.Gv9 r33 = new X.Gv9
            r41 = r33
            r42 = r3
            r43 = r3
            r44 = r0
            r45 = r3
            r47 = r3
            r48 = r46
            r49 = r3
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49, r50)
            goto L_0x036a
        L_0x05fc:
            java.util.List r4 = X.00k.A0d(r6, r4)
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r5 = r4.iterator()
        L_0x0608:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x0621
            java.lang.Object r4 = r5.next()
            com.meta.foa.accountswitcher.UserAccountInfo r4 = (com.meta.foa.accountswitcher.UserAccountInfo) r4
            java.lang.String r4 = r4.A06
            if (r4 != 0) goto L_0x0619
            r4 = r7
        L_0x0619:
            android.net.Uri r4 = X.0cp.A03(r4)
            r6.add(r4)
            goto L_0x0608
        L_0x0621:
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            X.IcN r4 = new X.IcN
            r4.<init>(r5, r6)
            goto L_0x0326
        L_0x062a:
            int r4 = r6 + 1
            if (r4 <= r8) goto L_0x02d3
            r4 = 18312718348335286(0x410f52000638b6, double:1.8979707538860117E-307)
            boolean r4 = X.AnonymousClass3EM.A05(r4, r2)
            if (r4 == 0) goto L_0x02d3
            int r8 = r8 + -2
            goto L_0x02cf
        L_0x063d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53773Gu2.A0X(X.3Y5):X.3mp");
    }

    public C53773Gu2(FoaUserSession foaUserSession, String str, String str2, AnonymousClass0r6 r4, AnonymousClass0Ud r5) {
        AnonymousClass7TG.A1U(r4, r5, foaUserSession);
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = foaUserSession;
        this.A01 = str;
        this.A02 = str2;
    }
}
