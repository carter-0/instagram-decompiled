package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.Mau  reason: case insensitive filesystem */
public final class C66687Mau {
    public C74548Pwh A00;
    public C74564PxD A01;
    public C67584MqI A02 = null;
    public C67107MiR A03;
    public final Context A04;
    public final UserSession A05;
    public final Capabilities A06;
    public final Mi5 A07;
    public final AnonymousClass4AN A08;
    public final C66649MaI A09;
    public final C251033mS A0A;
    public final C250993mO A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02a7, code lost:
        if (X.00k.A0u(r3.AZs(), r4) == false) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0381, code lost:
        if (r5 != false) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0392, code lost:
        if (X.C308556Us.A04(r0) == false) goto L_0x0394;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        if (r5 > r12) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0465, code lost:
        if (X.O4L.A00.contains(r2) != false) goto L_0x04a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d8, code lost:
        if (r0.AxI().isEmpty() != false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0113, code lost:
        if (r5.CL5(r3) != false) goto L_0x0115;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C66702Mb9 A00(X.2EM r98, X.AnonymousClass2Ep r99, X.2Dm r100, int r101, boolean r102, boolean r103, boolean r104, boolean r105, boolean r106) {
        /*
            r97 = this;
            r3 = r99
            X.3su r14 = X.AnonymousClass48N.A01(r3)
            r1 = r97
            X.MqI r0 = r1.A02
            if (r0 == 0) goto L_0x0054
            com.instagram.common.session.UserSession r0 = r1.A05
            boolean r0 = X.C308556Us.A0Q(r0, r3)
            if (r0 == 0) goto L_0x0054
            X.MqI r6 = r1.A02
            r11 = 0
            X.0qQ.A0B(r3, r11)
            X.4li r2 = r3.Axk()
            r9 = 0
            if (r2 == 0) goto L_0x0054
            java.lang.Long r0 = r2.A05
            if (r0 == 0) goto L_0x0054
            long r4 = r0.longValue()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r12 = r0.toMicros(r4)
            com.instagram.common.session.UserSession r0 = r6.A01
            X.0Tu r8 = X.0Tu.A05
            r4 = 36320317928513829(0x81092300422125, double:3.032453535949032E-306)
            boolean r4 = X.182.A06(r8, r0, r4)
            if (r4 == 0) goto L_0x01f2
            android.content.Context r7 = r6.A00
            X.3su r4 = r3.BKv()
            if (r4 == 0) goto L_0x0468
            long r5 = r4.A0D()
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            if (r4 == 0) goto L_0x0468
            int r4 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x0468
        L_0x0054:
            com.instagram.common.session.UserSession r2 = r1.A05
            X.MaI r4 = r1.A09
            X.Mar r0 = new X.Mar
            r0.<init>(r2, r14, r3, r4)
            r11 = 0
            if (r14 == 0) goto L_0x01ee
            X.MbE r24 = new X.MbE
            android.content.Context r4 = r1.A04
            X.48T r10 = X.C66708MbF.A00(r2, r3)
            r5 = r24
            r6 = r4
            r7 = r2
            r8 = r14
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x0071:
            X.1Av r4 = X.1Au.A00(r2)
            boolean r4 = r4.A21()
            X.3mS r5 = r1.A0A
            java.util.List r8 = X.C66688Mav.A00(r0, r5, r4)
            X.2Ep r5 = r0.A01
            com.instagram.model.direct.DirectThreadKey r6 = r5.BJy()
            com.instagram.model.direct.DirectThreadKey r6 = X.C66647MaG.A03(r6)
            java.lang.String r9 = r6.A00
            if (r9 == 0) goto L_0x01eb
            X.1Av r6 = X.1Au.A00(r2)
            X.0xa r7 = r6.A01
            java.lang.String r6 = "direct_thread_draft_"
            java.lang.String r6 = X.002.A0R(r6, r9)
            java.lang.String r7 = r7.getString(r6, r11)
            if (r7 == 0) goto L_0x01eb
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L_0x01eb
            android.text.SpannableString r12 = new android.text.SpannableString
            r12.<init>(r7)
        L_0x00aa:
            boolean r6 = X.2El.A03(r2)
            r36 = 1
            if (r6 == 0) goto L_0x01e7
            boolean r6 = r5.isPending()
            if (r6 == 0) goto L_0x01e7
            com.instagram.user.model.User r7 = r5.BIt()
            android.content.Context r13 = r1.A04
            if (r7 != 0) goto L_0x01d9
            r14 = r11
            r15 = r11
        L_0x00c2:
            boolean r6 = X.C66700Mb7.A02(r2)
            if (r6 == 0) goto L_0x00da
            java.util.List r6 = r0.AxI()
            if (r6 == 0) goto L_0x00da
            java.util.List r6 = r0.AxI()
            boolean r6 = r6.isEmpty()
            r18 = 1
            if (r6 == 0) goto L_0x00dc
        L_0x00da:
            r18 = 0
        L_0x00dc:
            r16 = r36
            r17 = r36
            java.lang.String r30 = X.C70270O0a.A00(r13, r14, r15, r16, r17, r18)
        L_0x00e4:
            boolean r5 = r5.isPending()
            r14 = r98
            if (r5 == 0) goto L_0x00ff
            X.5y8 r5 = X.C300895y8.A00
            if (r14 == r5) goto L_0x00ff
            boolean r5 = X.2El.A0E(r2)
            if (r5 == 0) goto L_0x00ff
            android.content.Context r6 = r1.A04
            r5 = 2131972241(0x7f135091, float:1.9581484E38)
            java.lang.String r30 = r6.getString(r5)
        L_0x00ff:
            X.PxD r5 = r1.A01
            if (r5 == 0) goto L_0x01d3
            boolean r5 = r5.CK0(r3)
            if (r5 == 0) goto L_0x01d3
            r35 = 1
            X.PxD r5 = r1.A01
            if (r5 == 0) goto L_0x01d5
            boolean r5 = r5.CL5(r3)
            if (r5 == 0) goto L_0x01d5
        L_0x0115:
            android.content.Context r13 = r1.A04
            com.instagram.direct.capabilities.Capabilities r5 = r1.A06
            X.Mi5 r6 = r1.A07
            r33 = r4
            r7 = 1
            X.0qQ.A0B(r5, r7)
            X.9Gx r10 = X.C376179Gx.SECRET_CHATS
            boolean r7 = r5.A00(r10)
            if (r7 == 0) goto L_0x0139
            X.0eM r7 = r6.A02
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x0139
            r33 = 0
        L_0x0139:
            X.3mO r9 = r1.A0B
            r7 = 0
            X.0qQ.A0B(r0, r7)
            r7 = 3
            X.0qQ.A0B(r8, r7)
            r7 = 5
            X.0qQ.A0B(r9, r7)
            boolean r7 = r5.A00(r10)
            r34 = 0
            if (r7 == 0) goto L_0x01c2
            X.0eM r7 = r6.A02
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x01c2
        L_0x015d:
            X.PxD r7 = r1.A01
            if (r7 != 0) goto L_0x01b9
            r17 = r11
        L_0x0163:
            X.PxD r7 = r1.A01
            if (r7 != 0) goto L_0x01b0
            r29 = r11
        L_0x0169:
            X.PxD r7 = r1.A01
            if (r7 != 0) goto L_0x01a7
            r28 = r11
        L_0x016f:
            boolean r41 = r0.CdF()
            X.PxD r4 = r1.A01
            if (r4 == 0) goto L_0x017b
            X.MlR r11 = r4.C63(r3)
        L_0x017b:
            X.Pwh r3 = r1.A00
            X.4AN r1 = r1.A08
            r27 = r100
            r32 = r101
            r37 = r102
            r38 = r103
            r39 = r104
            r40 = r105
            r42 = r106
            r15 = r13
            r16 = r12
            r18 = r2
            r19 = r5
            r20 = r3
            r21 = r6
            r22 = r1
            r23 = r14
            r25 = r0
            r26 = r11
            r31 = r8
            X.Mb9 r0 = X.C66690Max.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return r0
        L_0x01a7:
            X.MaQ r4 = X.C66650MaJ.A00(r2, r3)
            com.instagram.model.reels.Reel r28 = r7.Bkv(r4)
            goto L_0x016f
        L_0x01b0:
            java.lang.String r4 = r3.C6C()
            X.3Pi r29 = r7.CFu(r4)
            goto L_0x0169
        L_0x01b9:
            java.lang.String r4 = r3.C6C()
            X.9IV r17 = r7.C0v(r4)
            goto L_0x0163
        L_0x01c2:
            if (r4 == 0) goto L_0x015d
            boolean r4 = r9.A0D(r8)
            if (r4 != 0) goto L_0x01d0
            boolean r4 = r0.COe()
            if (r4 == 0) goto L_0x015d
        L_0x01d0:
            r34 = 1
            goto L_0x015d
        L_0x01d3:
            r35 = 0
        L_0x01d5:
            r36 = 0
            goto L_0x0115
        L_0x01d9:
            X.4Cl r6 = r7.A03
            java.lang.Integer r14 = r6.B6v()
            X.4Cl r6 = r7.A03
            java.lang.String r15 = r6.Bgn()
            goto L_0x00c2
        L_0x01e7:
            r30 = r11
            goto L_0x00e4
        L_0x01eb:
            r12 = r11
            goto L_0x00aa
        L_0x01ee:
            r24 = r11
            goto L_0x0071
        L_0x01f2:
            X.0eM r4 = r6.A04
            java.lang.Object r8 = r4.getValue()
            X.7Qa r8 = (X.C331217Qa) r8
            if (r8 == 0) goto L_0x0054
            long r15 = r3.BKd()
            int r4 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r4 > 0) goto L_0x0054
            r7 = 1
            java.lang.String r4 = r3.C6C()
            if (r4 == 0) goto L_0x0054
            X.3t0 r15 = new X.3t0
            r15.<init>(r4)
            boolean r5 = r3.CUG()
            r4 = 0
            if (r5 != 0) goto L_0x0218
            r4 = 1
        L_0x0218:
            r63 = r4 ^ 1
            boolean r64 = r3.isPending()
            java.lang.String r36 = r3.CDs()
            java.lang.String r37 = r3.C6f()
            boolean r65 = r3.CY7()
            java.util.List r4 = r3.BRZ()
            int r52 = r4.size()
            boolean r67 = r3.CVE()
            boolean r68 = r3.Cbs()
            java.lang.String r38 = r3.Btb()
            boolean r69 = r3.CVr()
            boolean r70 = X.C66641MaA.A00(r3)
            boolean r5 = r3.CUG()
            java.util.List r4 = r3.BRZ()
            boolean r71 = X.C66640Ma9.A05(r4, r5)
            java.util.List r42 = r3.AZs()
            java.util.List r43 = X.AnonymousClass7S6.A01(r3)
            X.0qQ.A07(r43)
            java.util.List r44 = r3.BRZ()
            X.2EN r31 = r3.C3d()
            boolean r72 = r3.AqP()
            boolean r73 = r3.CdY()
            java.util.HashMap r47 = r3.C6h()
            boolean r74 = r3.CR4()
            java.lang.String r40 = r3.Ayt(r0)
            X.JwJ r19 = r3.B7g(r0)
            int r53 = r3.C6a()
            int r54 = r3.AdN()
            int r55 = r3.BHS()
            int r56 = r3.BrE()
            int r57 = r3.AYf()
            boolean r75 = r3.Ca9()
            java.lang.String r4 = r0.A06
            boolean r5 = r3.CUG()
            if (r5 == 0) goto L_0x02a9
            java.util.List r5 = r3.AZs()
            boolean r5 = X.00k.A0u(r5, r4)
            r76 = 1
            if (r5 != 0) goto L_0x02ab
        L_0x02a9:
            r76 = 0
        L_0x02ab:
            int r10 = r3.C6a()
            r77 = 1
            r5 = 29
            if (r10 != r5) goto L_0x041f
            java.util.List r5 = r3.BJl()
            if (r5 == 0) goto L_0x041f
            boolean r5 = r5.contains(r4)
            if (r5 != r7) goto L_0x041f
        L_0x02c1:
            int r10 = r3.C6a()
            r78 = 1
            r5 = 29
            if (r10 != r5) goto L_0x041b
            java.util.List r5 = r3.BIq()
            if (r5 == 0) goto L_0x041b
            boolean r5 = r5.contains(r4)
            if (r5 != r7) goto L_0x041b
        L_0x02d7:
            int r10 = r3.C6a()
            r79 = 1
            r5 = 29
            if (r10 != r5) goto L_0x0417
            java.util.List r5 = r3.BJk()
            if (r5 == 0) goto L_0x0417
            boolean r5 = r5.contains(r4)
            if (r5 != r7) goto L_0x0417
        L_0x02ed:
            int r10 = r3.C6a()
            r80 = 1
            r5 = 29
            if (r10 != r5) goto L_0x0413
            java.util.List r5 = r3.BIp()
            if (r5 == 0) goto L_0x0413
            boolean r4 = r5.contains(r4)
            if (r4 != r7) goto L_0x0413
        L_0x0303:
            boolean r81 = r3.COP()
            java.lang.String r41 = r3.AsX()
            java.lang.Boolean r4 = r3.BIx()
            X.0qQ.A07(r4)
            boolean r82 = r4.booleanValue()
            X.4zr r25 = r3.AYx()
            X.9In r18 = r3.Bgc()
            X.7LW r4 = X.AnonymousClass7LV.A00
            boolean r84 = r4.A02(r0, r3)
            int r16 = r3.Btc()
            X.4li r30 = r3.Axk()
            if (r30 != 0) goto L_0x0345
            X.4li r30 = new X.4li
            r85 = r30
            r86 = r9
            r87 = r9
            r88 = r9
            r89 = r9
            r90 = r9
            r91 = r9
            r92 = r9
            r93 = r11
            r85.<init>(r86, r87, r88, r89, r90, r91, r92, r93)
        L_0x0345:
            r4 = r3
            X.3U9 r4 = (X.AnonymousClass3U9) r4
            X.3S9 r5 = r4.A01
            java.lang.Boolean r10 = r5.A1f
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
            boolean r85 = X.0qQ.A0K(r10, r4)
            java.lang.Boolean r5 = r5.A1c
            boolean r86 = X.0qQ.A0K(r5, r4)
            int r58 = r3.Bjw()
            boolean r88 = r3.CQo()
            boolean r89 = r3.COb()
            X.3Tu r24 = r3.AiM()
            X.A5N r28 = r3.BHu()
            java.lang.Boolean r5 = r3.CSS()
            boolean r90 = X.0qQ.A0K(r5, r4)
            java.util.List r4 = r3.CHP()
            if (r4 == 0) goto L_0x0383
            boolean r5 = r4.isEmpty()
            r4 = 0
            if (r5 == 0) goto L_0x0384
        L_0x0383:
            r4 = 1
        L_0x0384:
            r91 = r4 ^ 1
            boolean r4 = r3.CMN()
            if (r4 == 0) goto L_0x0394
            boolean r4 = X.C308556Us.A04(r0)
            r93 = 1
            if (r4 != 0) goto L_0x0396
        L_0x0394:
            r93 = 0
        L_0x0396:
            boolean r94 = r3.CXW()
            X.0sm r48 = X.0Yt.A0E()
            int r61 = r3.BlL()
            X.9IM r17 = r3.BWj()
            java.lang.Integer r34 = java.lang.Integer.valueOf(r16)
            java.lang.Integer r33 = java.lang.Integer.valueOf(r11)
            X.7SD r4 = new X.7SD
            r21 = r9
            r22 = r9
            r23 = r9
            r26 = r9
            r27 = r3
            r29 = r9
            r32 = r15
            r35 = r9
            r39 = r9
            r45 = r9
            r46 = r9
            r49 = r9
            r50 = r9
            r51 = r9
            r59 = r11
            r60 = r11
            r62 = r11
            r66 = r11
            r83 = r11
            r87 = r11
            r92 = r11
            r95 = r11
            r96 = r11
            r20 = r9
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96)
            X.3su r10 = r3.BKv()
            if (r10 == 0) goto L_0x03f1
            X.46n r5 = r10.A0N
            if (r5 == 0) goto L_0x03f1
            java.lang.String r9 = r5.A02
        L_0x03f1:
            java.lang.String r15 = "disappearing_mode_toggle_off_action_log"
            boolean r5 = X.0qQ.A0K(r9, r15)
            if (r5 == 0) goto L_0x0423
            java.lang.String r5 = r2.A06
            boolean r5 = X.0qQ.A0K(r5, r15)
            if (r5 != 0) goto L_0x0405
            boolean r5 = r2.A08
            if (r5 != 0) goto L_0x0423
        L_0x0405:
            java.lang.String r2 = r2.A07
            if (r2 == 0) goto L_0x0054
            android.content.Context r6 = r6.A00
            java.util.List r5 = r4.A0b
            X.NaW r0 = X.C71124OdI.A01(r6, r0, r4, r2, r5)
            goto L_0x04a5
        L_0x0413:
            r80 = 0
            goto L_0x0303
        L_0x0417:
            r79 = 0
            goto L_0x02ed
        L_0x041b:
            r78 = 0
            goto L_0x02d7
        L_0x041f:
            r77 = 0
            goto L_0x02c1
        L_0x0423:
            X.7LL r5 = r6.A03
            X.0mm r2 = r6.A02
            X.7LN r6 = new X.7LN
            r6.<init>(r2, r5)
            if (r10 == 0) goto L_0x043c
            java.lang.String r2 = r10.A1u
            com.instagram.user.model.User r5 = r3.CCf(r2)
            X.7LQ r2 = new X.7LQ
            r2.<init>(r0, r4, r10, r5)
            r6.A03(r2)
        L_0x043c:
            r8.A0C(r6, r4, r7)
            int r0 = r6.A01
            if (r0 <= 0) goto L_0x0054
            java.lang.Object r2 = r6.A05(r11)
            r0 = 26
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r2, r0)
            X.7LQ r2 = (X.AnonymousClass7LQ) r2
            X.3su r4 = r2.A0e
            X.0qQ.A07(r4)
            X.46n r0 = r4.A0N
            if (r0 == 0) goto L_0x0054
            java.lang.String r2 = r0.A02
            if (r2 == 0) goto L_0x0054
            java.util.Set r0 = X.O4L.A00
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0054
            goto L_0x04a9
        L_0x0468:
            java.lang.String r5 = r2.A06
            if (r5 != 0) goto L_0x04f6
            boolean r4 = r2.A08
            if (r4 == 0) goto L_0x04c8
            X.7Kc r4 = X.C329737Ka.A03(r0, r3)
            boolean r9 = r4.COW(r0, r3)
            java.util.List r6 = r3.BRZ()
            java.lang.String r5 = r2.A07
            X.9IV r4 = X.C69880Nti.A00(r2)
            java.lang.String r8 = X.C71124OdI.A02(r7, r4, r0, r9)
            boolean r4 = X.C51966G9m.A1W(r0, r5)
            if (r4 == 0) goto L_0x04ac
            r4 = 2131960887(0x7f132437, float:1.9558455E38)
        L_0x048f:
            X.NXs r6 = new X.NXs
            r6.<init>(r4, r8)
        L_0x0494:
            java.lang.Integer r4 = X.AnonymousClass05K.A00
        L_0x0496:
            X.NXn r5 = new X.NXn
            r5.<init>(r6, r4)
        L_0x049b:
            java.lang.String r2 = r2.A07
            if (r2 != 0) goto L_0x04a1
            java.lang.String r2 = r0.A06
        L_0x04a1:
            X.NaW r0 = X.C70012Nvq.A00(r7, r0, r5)
        L_0x04a5:
            X.3su r4 = X.OZ5.A00(r0, r2, r12)
        L_0x04a9:
            r14 = r4
            goto L_0x0054
        L_0x04ac:
            java.lang.String r5 = X.C71124OdI.A03(r5, r6)
            if (r5 == 0) goto L_0x04bf
            r4 = 2131960888(0x7f132438, float:1.9558457E38)
            java.lang.String r4 = X.DbY.A0c(r7, r5, r4)
            X.NXr r6 = new X.NXr
            r6.<init>(r4, r8)
            goto L_0x0494
        L_0x04bf:
            r4 = 2131960886(0x7f132436, float:1.9558453E38)
            if (r9 == 0) goto L_0x048f
            r4 = 2131960899(0x7f132443, float:1.955848E38)
            goto L_0x048f
        L_0x04c8:
            java.util.List r6 = r3.BRZ()
            java.lang.String r5 = r2.A07
            boolean r4 = X.C51966G9m.A1W(r0, r5)
            if (r4 == 0) goto L_0x04df
            r4 = 2131960884(0x7f132434, float:1.955845E38)
        L_0x04d7:
            X.NXs r6 = new X.NXs
            r6.<init>(r4, r9)
        L_0x04dc:
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            goto L_0x0496
        L_0x04df:
            java.lang.String r5 = X.C71124OdI.A03(r5, r6)
            if (r5 == 0) goto L_0x04f2
            r4 = 2131960885(0x7f132435, float:1.9558451E38)
            java.lang.String r4 = X.DbY.A0c(r7, r5, r4)
            X.NXr r6 = new X.NXr
            r6.<init>(r4, r9)
            goto L_0x04dc
        L_0x04f2:
            r4 = 2131960883(0x7f132433, float:1.9558447E38)
            goto L_0x04d7
        L_0x04f6:
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            java.lang.String r4 = "disappearing_mode_expiry_duration_change_action_log"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x052f
            r4 = 36322890609797785(0x810b7a00032a99, double:3.0340805099523616E-306)
            boolean r4 = X.182.A06(r8, r0, r4)
            if (r4 == 0) goto L_0x0054
            X.7Kc r4 = X.C329737Ka.A03(r0, r3)
            boolean r20 = r4.COW(r0, r3)
            X.OdI r14 = X.C71124OdI.A00
            java.util.List r19 = r3.BRZ()
            java.lang.String r4 = r2.A07
            X.9IV r16 = X.C69880Nti.A00(r2)
            r15 = r7
            r17 = r0
            r18 = r4
            X.Npn r4 = r14.A05(r15, r16, r17, r18, r19, r20)
            X.NXn r5 = new X.NXn
            r5.<init>(r4, r6)
            goto L_0x049b
        L_0x052f:
            java.lang.String r4 = "disappearing_mode_rollback_action_log"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x053b
            X.NXp r5 = X.C68805NXp.A00
            goto L_0x049b
        L_0x053b:
            java.lang.Integer r8 = X.AnonymousClass05K.A0N
            java.lang.String r4 = "vanish_mode_upgrade_to_disappearing_mode_action_log"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0054
            X.7QY r5 = X.AnonymousClass7QX.A00(r0)
            X.3Tu r4 = r3.AiM()
            boolean r4 = r5.A00(r4)
            if (r4 == 0) goto L_0x056a
            X.9IV r4 = X.C69880Nti.A00(r2)
            r6 = 2131960890(0x7f13243a, float:1.9558461E38)
            java.lang.String r5 = X.C71124OdI.A02(r7, r4, r0, r11)
            X.NXs r4 = new X.NXs
            r4.<init>(r6, r5)
            X.NXn r5 = new X.NXn
            r5.<init>(r4, r8)
            goto L_0x049b
        L_0x056a:
            X.NXq r5 = X.C68806NXq.A00
            goto L_0x049b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66687Mau.A00(X.2EM, X.2Ep, X.2Dm, int, boolean, boolean, boolean, boolean, boolean):X.Mb9");
    }

    public C66687Mau(Context context, UserSession userSession, Mi5 mi5, C251033mS r6) {
        this.A04 = context;
        this.A05 = userSession;
        this.A0A = r6;
        this.A0B = C250993mO.A01(userSession);
        this.A07 = mi5;
        this.A09 = C66653MaM.A00(context, userSession);
        C376169Gw r1 = C376169Gw.A00;
        0sn r0 = 0sn.A00;
        this.A06 = r1.createWithAdditionalCapabilities(r0, r0);
        this.A08 = new AnonymousClass4AM(userSession);
    }
}
