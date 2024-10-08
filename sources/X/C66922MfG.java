package X;

import java.util.HashMap;

/* renamed from: X.MfG  reason: case insensitive filesystem */
public final /* synthetic */ class C66922MfG implements Y9W {
    public final /* synthetic */ C67195Mjr A00;
    public final /* synthetic */ HashMap A01;

    public /* synthetic */ C66922MfG(C67195Mjr mjr, HashMap hashMap) {
        this.A00 = mjr;
        this.A01 = hashMap;
    }

    /* JADX WARNING: type inference failed for: r20v25, types: [boolean] */
    /* JADX WARNING: type inference failed for: r15v28, types: [boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x05c4, code lost:
        if (r0.A0G == null) goto L_0x05c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x05ce, code lost:
        if (r0.A01 <= 0) goto L_0x05d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0b17, code lost:
        if (r5.A1V == null) goto L_0x0b19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0b25, code lost:
        if (r6.A00 != r19) goto L_0x0b27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014a, code lost:
        if (r1 < r10) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0173, code lost:
        if (r1 < r17) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0328, code lost:
        if (r6 != 4) goto L_0x032a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r44, java.lang.Object r45) {
        /*
            r43 = this;
            r0 = r43
            r4 = r45
            r5 = r44
            X.Mjr r2 = r0.A00
            java.util.HashMap r1 = r0.A01
            X.PrZ r5 = (X.C74245PrZ) r5
            X.MfF r4 = (X.C66921MfF) r4
            boolean r0 = r5 instanceof X.C67233MkT
            java.lang.String r3 = "ReduxStore"
            if (r0 == 0) goto L_0x002c
            X.MkT r5 = (X.C67233MkT) r5
            java.lang.Object r0 = r5.A00
            if (r0 != 0) goto L_0x001f
            java.lang.String r1 = "initial state is null"
            X.0wb.A03(r3, r1)
        L_0x001f:
            r1 = 1
            r2.A00 = r1
        L_0x0022:
            java.util.List r1 = java.util.Collections.emptyList()
            X.MfH r3 = new X.MfH
            r3.<init>(r0, r1)
            return r3
        L_0x002c:
            java.lang.Class r0 = r5.getClass()
            java.lang.Object r2 = r1.get(r0)
            X.OIu r2 = (X.C70737OIu) r2
            java.lang.Object r0 = r4.A00
            if (r0 != 0) goto L_0x003f
            java.lang.String r1 = "State is null"
            X.0wb.A03(r3, r1)
        L_0x003f:
            if (r2 == 0) goto L_0x0022
            r5.toString()
            X.Prb r0 = (X.C74247Prb) r0
            java.lang.Class r1 = r2.A01()
            java.lang.Object r1 = r1.cast(r5)
            r1.getClass()
            X.PrZ r1 = (X.C74245PrZ) r1
            boolean r3 = r2 instanceof X.C67239MkZ
            if (r3 == 0) goto L_0x00cb
            X.MkZ r2 = (X.C67239MkZ) r2
            X.Mgx r1 = (X.C67024Mgx) r1
            X.MgM r0 = (X.C66988MgM) r0
            r5 = 0
            boolean r15 = X.AnonymousClass7TF.A1U(r5, r1, r0)
            boolean r3 = r0.A08
            if (r3 != 0) goto L_0x00c6
            r3 = 2
            long[] r6 = new long[r3]
            long r3 = r0.A04
            r18 = 0
            r6[r5] = r3
            long r3 = r1.A01
            r6[r15] = r3
            r13 = r6[r5]
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x007a
            r13 = r3
        L_0x007a:
            int r12 = r1.A00
            boolean r3 = r0.A07
            X.Pwi r8 = r0.A06
            int r9 = r0.A01
            int r10 = r0.A02
            com.facebook.msys.mci.AuthData r7 = r0.A05
            int r11 = r0.A00
            X.MgM r6 = new X.MgM
            r17 = r5
            r16 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15, r16, r17)
            r3 = r3 ^ 1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.Mgt r4 = new X.Mgt
            r4.<init>(r0, r5, r3)
            r17 = 2147483647(0x7fffffff, float:NaN)
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x00a3
            r18 = r10
        L_0x00a3:
            boolean r3 = r2.A01
            int r1 = r2.A00
            X.Mgu r0 = new X.Mgu
            r19 = r1
            r20 = r11
            r21 = r12
            r22 = r13
            r24 = r3
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r24)
            X.Pra[] r0 = new X.C74246Pra[]{r4, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            X.MfH r3 = new X.MfH
            r3.<init>(r6, r0)
            return r3
        L_0x00c6:
            X.MfH r3 = X.C70737OIu.A00(r0)
            return r3
        L_0x00cb:
            boolean r3 = r2 instanceof X.C68934NbD
            if (r3 == 0) goto L_0x01a3
            X.Mh0 r1 = (X.C67027Mh0) r1
            X.MgM r0 = (X.C66988MgM) r0
            r5 = 0
            boolean r20 = X.AnonymousClass7TF.A1U(r5, r1, r0)
            X.PrM r3 = r1.A03
            boolean r2 = r3 instanceof X.C66990MgO
            if (r2 == 0) goto L_0x017b
            java.lang.Object r4 = X.C66996MgU.A02(r3)
            X.0qQ.A07(r4)
            X.5s9 r4 = (X.C297675s9) r4
            com.facebook.msys.mci.AuthData r11 = r0.A05
            X.Mf7 r12 = new X.Mf7
            r12.<init>(r4, r11)
            long r2 = r1.A02
            r7 = 0
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x012d
            int r7 = X.C66580MXl.A04(r4)
            int r6 = r1.A00
            if (r7 >= r6) goto L_0x012d
        L_0x00fe:
            r17 = 0
        L_0x0100:
            int r13 = r0.A01
            int r14 = r0.A02
            int r2 = r0.A00
            int r1 = r0.A03
            X.MgM r10 = new X.MgM
            r19 = r5
            r21 = r5
            r15 = r2
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r19, r20, r21)
            boolean r0 = r0.A07
            r3 = r0 ^ 1
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            int r0 = X.C66580MXl.A04(r4)
            X.Mgt r2 = new X.Mgt
            r2.<init>(r1, r0, r3)
        L_0x0123:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r2)
        L_0x0127:
            X.MfH r3 = new X.MfH
            r3.<init>(r10, r0)
            return r3
        L_0x012d:
            int r10 = r1.A01
            if (r10 <= 0) goto L_0x0152
            X.5s9 r9 = r12.A00
            int r8 = X.C66580MXl.A04(r9)
        L_0x0137:
            int r8 = r8 + -1
            if (r8 < 0) goto L_0x014d
            long r6 = r12.BKf(r8)
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0137
            int r1 = X.C66580MXl.A04(r9)
            int r1 = r1 + -1
            int r1 = r1 - r8
        L_0x014a:
            if (r1 >= r10) goto L_0x0152
            goto L_0x00fe
        L_0x014d:
            int r1 = X.C66580MXl.A04(r9)
            goto L_0x014a
        L_0x0152:
            int r1 = X.C66580MXl.A04(r4)
            if (r1 <= 0) goto L_0x0178
            r1 = 2
            long[] r6 = new long[r1]
            long r1 = r0.A04
            r6[r5] = r1
            int r1 = X.C66580MXl.A04(r4)
            int r3 = r1 + -1
            com.facebook.msys.mci.CQLResultSet r2 = r4.mResultSet
            r1 = 20
            long r1 = r2.getLong(r3, r1)
            r6[r20] = r1
            r17 = r6[r5]
            int r3 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r3 >= 0) goto L_0x0100
        L_0x0175:
            r17 = r1
            goto L_0x0100
        L_0x0178:
            long r1 = r0.A04
            goto L_0x0175
        L_0x017b:
            X.Pwi r12 = r0.A06
            int r13 = r0.A01
            int r14 = r0.A02
            long r1 = r0.A04
            com.facebook.msys.mci.AuthData r11 = r0.A05
            int r4 = r0.A00
            int r3 = r0.A03
            X.MgM r10 = new X.MgM
            r17 = r1
            r19 = r5
            r21 = r5
            r15 = r4
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r19, r20, r21)
            boolean r0 = r0.A07
            r1 = r0 ^ 1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.Mgt r2 = new X.Mgt
            r2.<init>(r0, r5, r1)
            goto L_0x0123
        L_0x01a3:
            boolean r3 = r2 instanceof X.C68932NbB
            if (r3 == 0) goto L_0x01c6
            X.N8S r0 = (X.N8S) r0
            r10 = r0
            r2 = 1
            X.0qQ.A0B(r0, r2)
            boolean r1 = r0.A02
            if (r1 != 0) goto L_0x0231
            java.util.Set r1 = r0.A01
            java.util.Map r0 = r0.A00
            X.N8S r10 = new X.N8S
            r10.<init>(r0, r1, r2)
            X.PCt r0 = new X.PCt
            r0.<init>()
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            goto L_0x0127
        L_0x01c6:
            boolean r3 = r2 instanceof X.C68944NbN
            if (r3 == 0) goto L_0x01fc
            X.PCn r1 = (X.C72608PCn) r1
            X.AnonymousClass7TG.A1N(r1, r0)
            X.PrM r1 = r1.A00
            boolean r0 = r1 instanceof X.C66990MgO
            if (r0 == 0) goto L_0x01ed
            java.lang.Object r0 = X.C66996MgU.A02(r1)
            X.0qQ.A07(r0)
            X.N4P r0 = (X.N4P) r0
            X.NcE r1 = new X.NcE
            r1.<init>(r0)
        L_0x01e3:
            X.N8T r0 = new X.N8T
            r0.<init>(r1)
            X.MfH r3 = X.C70737OIu.A00(r0)
            return r3
        L_0x01ed:
            java.lang.Object r0 = X.C66996MgU.A01(r1)
            X.0qQ.A07(r0)
            java.lang.String r0 = (java.lang.String) r0
            X.NcD r1 = new X.NcD
            r1.<init>(r0)
            goto L_0x01e3
        L_0x01fc:
            boolean r3 = r2 instanceof X.C68946NbP
            if (r3 == 0) goto L_0x0235
            X.NbP r2 = (X.C68946NbP) r2
            X.N8T r0 = (X.N8T) r0
            r10 = r0
            r1 = 1
            X.0qQ.A0B(r0, r1)
            X.Noy r0 = r0.A00
            X.NcG r1 = X.C68985NcG.A00
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0231
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.N8T r10 = new X.N8T
            r10.<init>(r1)
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x022b
            X.PCv r0 = new X.PCv
            r0.<init>()
        L_0x0225:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            goto L_0x0127
        L_0x022b:
            X.PCu r0 = new X.PCu
            r0.<init>()
            goto L_0x0225
        L_0x0231:
            X.0sn r0 = X.0sn.A00
            goto L_0x0127
        L_0x0235:
            boolean r3 = r2 instanceof X.C68935NbE
            if (r3 == 0) goto L_0x025b
            X.PCk r1 = (X.C72605PCk) r1
            X.N8V r0 = (X.N8V) r0
            boolean r5 = X.AnonymousClass7TG.A1Z(r1, r0)
            java.lang.String r4 = r1.A00
            r3 = 10
            X.PCw r1 = new X.PCw
            r1.<init>(r4)
            java.util.List r2 = X.AnonymousClass7TE.A1I(r1)
            X.NAg r1 = r0.A01
            X.N8V r0 = new X.N8V
            r0.<init>(r1, r4, r3, r5)
            X.MfH r3 = new X.MfH
            r3.<init>(r0, r2)
            return r3
        L_0x025b:
            boolean r3 = r2 instanceof X.C67241Mkb
            if (r3 == 0) goto L_0x02bd
            X.Mkb r2 = (X.C67241Mkb) r2
            X.MqX r1 = (X.C67599MqX) r1
            X.MgM r0 = (X.C66988MgM) r0
            r3 = 0
            boolean r14 = X.AnonymousClass7TF.A1U(r3, r1, r0)
            boolean r4 = r0.A08
            if (r4 != 0) goto L_0x0725
            long r12 = r0.A04
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x071a
            int r11 = r1.A00
            boolean r15 = r0.A07
            X.Pwi r7 = r0.A06
            int r8 = r0.A01
            int r9 = r0.A02
            com.facebook.msys.mci.AuthData r6 = r0.A05
            int r10 = r0.A00
            X.MgM r5 = new X.MgM
            r16 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
            r1 = r15 ^ 1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.Mgt r4 = new X.Mgt
            r4.<init>(r0, r3, r1)
            r15 = 2147483647(0x7fffffff, float:NaN)
            boolean r1 = r2.A01
            int r0 = r2.A00
            X.Mgu r14 = new X.Mgu
            r17 = r0
            r18 = r10
            r19 = r11
            r20 = r12
            r22 = r1
            r16 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r22)
            X.Pra[] r0 = new X.C74246Pra[]{r4, r14}
            java.util.List r0 = X.0sr.A1P(r0)
            X.MfH r3 = new X.MfH
            r3.<init>(r5, r0)
            return r3
        L_0x02bd:
            boolean r3 = r2 instanceof X.C68940NbJ
            if (r3 == 0) goto L_0x034a
            X.PCl r1 = (X.C72606PCl) r1
            X.N8U r0 = (X.N8U) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            int r9 = r0.A02
            int r2 = r0.A01
            int r13 = r0.A05
            int r31 = java.lang.Math.max(r2, r13)
            r33 = 0
            com.instagram.direct.model.messaginguser.MessagingUser r2 = r0.A0C
            r19 = r2
            com.instagram.model.direct.threadkey.impl.MsysThreadId r2 = r0.A0E
            r21 = r2
            com.facebook.msys.mci.AuthData r2 = r0.A0A
            r17 = r2
            X.9Hs r15 = r0.A0F
            X.9Ie r14 = r0.A06
            X.7LZ r12 = r0.A0B
            X.OKP r11 = r0.A0D
            X.GnR r10 = r0.A07
            java.lang.Long r2 = r0.A0H
            r23 = r2
            java.lang.Long r8 = r0.A0G
            int r7 = r0.A04
            int r6 = r0.A03
            java.util.Set r5 = r0.A0J
            X.Jw4 r4 = r0.A08
            X.N4L r3 = r0.A09
            java.lang.String r2 = r0.A0I
            int r0 = r0.A00
            r27 = r13
            r28 = r7
            r29 = r6
            r30 = r9
            r32 = r0
            r24 = r8
            r25 = r2
            r26 = r5
            r20 = r11
            r22 = r15
            r15 = r4
            r16 = r3
            r18 = r12
            r13 = r14
            r14 = r10
            X.N8U r10 = X.N8U.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            if (r9 <= 0) goto L_0x0347
            if (r31 <= 0) goto L_0x0347
            java.lang.Integer r38 = X.AnonymousClass05K.A0C
        L_0x0323:
            if (r8 == 0) goto L_0x032a
            r0 = 4
            r42 = -1
            if (r6 == r0) goto L_0x032c
        L_0x032a:
            r42 = r31
        L_0x032c:
            X.OFH r0 = r1.A00
            X.N8R r32 = new X.N8R
            r34 = r17
            r35 = r19
            r36 = r0
            r37 = r21
            r39 = r23
            r40 = r8
            r41 = r9
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r32)
            goto L_0x0127
        L_0x0347:
            java.lang.Integer r38 = X.AnonymousClass05K.A01
            goto L_0x0323
        L_0x034a:
            boolean r3 = r2 instanceof X.C68933NbC
            if (r3 == 0) goto L_0x037b
            X.PCh r1 = (X.C72602PCh) r1
            r8 = 0
            boolean r9 = X.AnonymousClass7TF.A1U(r8, r1, r0)
            X.3xP r1 = r1.A00
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x0746
            java.lang.Object r7 = r1.A03()
            X.5z0 r7 = (X.C301345z0) r7
            X.0qQ.A0A(r7)
            java.util.LinkedHashSet r6 = X.DbS.A0y()
            int r2 = X.C66580MXl.A04(r7)
            r1 = 0
        L_0x036f:
            if (r1 >= r2) goto L_0x072a
            java.lang.String r0 = X.C66580MXl.A0v(r7, r1, r9)
            r6.add(r0)
            int r1 = r1 + 1
            goto L_0x036f
        L_0x037b:
            boolean r3 = r2 instanceof X.C67242Mkc
            if (r3 == 0) goto L_0x03a9
            X.Mkc r2 = (X.C67242Mkc) r2
            X.PCi r1 = (X.C72603PCi) r1
            X.MgM r0 = (X.C66988MgM) r0
            r8 = 0
            X.AnonymousClass7TF.A1H(r1, r0)
            boolean r3 = r0.A08
            if (r3 != 0) goto L_0x0756
            long r6 = r0.A04
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x039e
            int r4 = r0.A03
            int r3 = r1.A00
            if (r4 == r3) goto L_0x0756
        L_0x039e:
            boolean r3 = r2.A01
            int r2 = r2.A00
            int r1 = r1.A00
            X.MfH r3 = X.C69975NvF.A00(r0, r2, r1, r8, r3)
            return r3
        L_0x03a9:
            boolean r3 = r2 instanceof X.C67240Mka
            if (r3 == 0) goto L_0x03d0
            X.Mka r2 = (X.C67240Mka) r2
            X.PCj r1 = (X.C72604PCj) r1
            X.MgM r0 = (X.C66988MgM) r0
            r15 = 0
            boolean r13 = X.AnonymousClass7TF.A1U(r15, r1, r0)
            boolean r3 = r0.A08
            if (r3 != 0) goto L_0x07a2
            long r11 = r0.A04
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x075b
            int r2 = r1.A00
            r1 = 20
            X.MfH r3 = X.C69975NvF.A00(r0, r1, r2, r15, r13)
            return r3
        L_0x03d0:
            boolean r3 = r2 instanceof X.C68945NbO
            if (r3 == 0) goto L_0x05b0
            X.PCs r1 = (X.C72613PCs) r1
            X.N8U r0 = (X.N8U) r0
            r3 = 0
            boolean r11 = X.AnonymousClass7TF.A1U(r3, r1, r0)
            int r2 = r1.A01
            r17 = r2
            if (r2 != 0) goto L_0x03e7
            int r2 = r0.A03
            r17 = r2
        L_0x03e7:
            int r5 = r1.A02
            if (r5 != 0) goto L_0x03ed
            int r5 = r0.A04
        L_0x03ed:
            X.3t0 r12 = r1.A09
            if (r12 != 0) goto L_0x057e
            r4 = 0
        L_0x03f2:
            r7 = 2
            if (r4 == 0) goto L_0x0578
            X.N4L r2 = r0.A09
            if (r2 != 0) goto L_0x0578
            r2 = 4
            if (r5 != r2) goto L_0x0578
            java.lang.Object r9 = r4.A03
            X.7SD r9 = (X.AnonymousClass7SD) r9
            java.lang.Object r8 = r4.A02
            X.3t0 r8 = (X.C254763t0) r8
            if (r9 != 0) goto L_0x0568
            X.PCz r2 = new X.PCz
            r2.<init>(r8, r11, r11)
            X.Pra[] r2 = new X.C74246Pra[]{r2}
        L_0x040f:
            java.util.ArrayList r16 = X.0sr.A1M(r2)
        L_0x0413:
            java.lang.Long r10 = r0.A0H
            if (r10 != 0) goto L_0x046f
            java.lang.Long r2 = r0.A0G
            if (r2 != 0) goto L_0x046f
            X.9Hs r2 = r1.A0A
            r26 = r2
            X.9Ie r2 = r1.A03
            r18 = r2
            X.7LZ r14 = r1.A06
            X.OKP r13 = r1.A08
            X.GnR r12 = r1.A04
            java.lang.Long r11 = r1.A0D
            java.lang.Long r10 = r1.A0C
            java.util.Set r9 = r1.A0E
            int r15 = r1.A00
            com.instagram.direct.model.messaginguser.MessagingUser r8 = r0.A0C
            com.instagram.model.direct.threadkey.impl.MsysThreadId r7 = r0.A0E
            com.facebook.msys.mci.AuthData r6 = r0.A0A
            int r2 = r0.A05
            X.Jw4 r1 = r0.A08
            java.lang.String r0 = r0.A0I
            r29 = r0
            r30 = r9
            r31 = r2
            r32 = r5
            r33 = r17
            r34 = r3
            r35 = r3
            r36 = r15
            r17 = r18
            r18 = r12
            r19 = r1
            r20 = r4
            r21 = r6
            r22 = r14
            r23 = r8
            r24 = r13
            r25 = r7
        L_0x045f:
            r27 = r11
            r28 = r10
        L_0x0463:
            X.N8U r1 = X.N8U.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            X.MfH r3 = new X.MfH
            r0 = r16
            r3.<init>(r1, r0)
            return r3
        L_0x046f:
            java.lang.Integer r2 = r1.A0B
            int r2 = r2.intValue()
            if (r2 == r3) goto L_0x051c
            if (r2 == r11) goto L_0x04d0
            if (r2 != r7) goto L_0x07a7
            if (r10 == 0) goto L_0x04d0
            java.lang.Long r11 = r1.A0D
            if (r11 == 0) goto L_0x04d0
            long r8 = r11.longValue()
            long r6 = r10.longValue()
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x04d0
            X.9Hs r2 = r1.A0A
            r26 = r2
            X.9Ie r2 = r1.A03
            r18 = r2
            X.7LZ r14 = r1.A06
            X.OKP r13 = r1.A08
            X.GnR r12 = r1.A04
            java.lang.Long r10 = r1.A0C
            java.util.Set r9 = r1.A0E
            X.Jw4 r8 = r1.A05
            int r15 = r1.A00
            com.instagram.direct.model.messaginguser.MessagingUser r7 = r0.A0C
            com.instagram.model.direct.threadkey.impl.MsysThreadId r6 = r0.A0E
            com.facebook.msys.mci.AuthData r2 = r0.A0A
            int r1 = r0.A05
            java.lang.String r0 = r0.A0I
            r29 = r0
            r30 = r9
            r31 = r1
            r32 = r5
            r33 = r17
            r34 = r3
            r35 = r3
            r36 = r15
            r17 = r18
            r18 = r12
            r19 = r8
            r20 = r4
            r21 = r2
            r22 = r14
            r23 = r7
            r24 = r13
            r25 = r6
            goto L_0x045f
        L_0x04d0:
            X.9Hs r2 = r1.A0A
            r26 = r2
            X.9Ie r2 = r1.A03
            r19 = r2
            X.7LZ r2 = r1.A06
            r18 = r2
            X.OKP r14 = r1.A08
            X.GnR r13 = r1.A04
            java.lang.Long r12 = r1.A0C
            java.util.Set r11 = r1.A0E
            X.Jw4 r9 = r1.A05
            int r15 = r1.A00
            com.instagram.direct.model.messaginguser.MessagingUser r8 = r0.A0C
            com.instagram.model.direct.threadkey.impl.MsysThreadId r7 = r0.A0E
            com.facebook.msys.mci.AuthData r6 = r0.A0A
            int r2 = r0.A05
            int r1 = r0.A02
            java.lang.String r0 = r0.A0I
            r20 = r4
            r21 = r6
            r22 = r18
            r23 = r8
            r24 = r14
            r25 = r7
            r27 = r10
            r28 = r12
            r29 = r0
            r30 = r11
            r31 = r2
            r32 = r5
            r33 = r17
            r34 = r1
            r35 = r3
            r36 = r15
            r17 = r19
            r18 = r13
            r19 = r9
            goto L_0x0463
        L_0x051c:
            X.9Hs r2 = r1.A0A
            r26 = r2
            X.9Ie r2 = r1.A03
            r18 = r2
            X.7LZ r2 = r1.A06
            r22 = r2
            X.OKP r14 = r1.A08
            X.GnR r13 = r1.A04
            java.lang.Long r12 = r1.A0D
            int r15 = r1.A00
            com.instagram.direct.model.messaginguser.MessagingUser r11 = r0.A0C
            com.instagram.model.direct.threadkey.impl.MsysThreadId r10 = r0.A0E
            com.facebook.msys.mci.AuthData r9 = r0.A0A
            int r8 = r0.A05
            java.lang.Long r7 = r0.A0G
            int r6 = r0.A01
            java.util.Set r2 = r0.A0J
            X.Jw4 r1 = r0.A08
            java.lang.String r0 = r0.A0I
            r29 = r0
            r30 = r2
            r31 = r8
            r32 = r5
            r33 = r17
            r34 = r3
            r35 = r6
            r36 = r15
            r17 = r18
            r18 = r13
            r19 = r1
            r20 = r4
            r21 = r9
            r23 = r11
            r24 = r14
            r25 = r10
            r27 = r12
            r28 = r7
            goto L_0x0463
        L_0x0568:
            X.PCz r6 = new X.PCz
            r6.<init>(r8, r11, r3)
            X.PCy r2 = new X.PCy
            r2.<init>(r9, r8)
            X.Pra[] r2 = new X.C74246Pra[]{r6, r2}
            goto L_0x040f
        L_0x0578:
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            goto L_0x0413
        L_0x057e:
            X.N4L r2 = r0.A09
            if (r2 == 0) goto L_0x05a7
            X.7SD r10 = r1.A07
            boolean r9 = r2.A05
            boolean r8 = r2.A04
            boolean r7 = r2.A06
            java.lang.Object r6 = r2.A00
            java.util.List r6 = (java.util.List) r6
            r2 = 4
            X.0qQ.A0B(r6, r2)
            X.N4L r4 = new X.N4L
            r18 = r4
            r19 = r10
            r20 = r12
            r21 = r6
            r22 = r9
            r23 = r8
            r24 = r7
            r18.<init>((X.AnonymousClass7SD) r19, (X.C254763t0) r20, (java.util.List) r21, (boolean) r22, (boolean) r23, (boolean) r24)
            goto L_0x03f2
        L_0x05a7:
            X.7SD r2 = r1.A07
            X.N4L r4 = new X.N4L
            r4.<init>((X.AnonymousClass7SD) r2, (X.C254763t0) r12)
            goto L_0x03f2
        L_0x05b0:
            boolean r3 = r2 instanceof X.C68939NbI
            if (r3 == 0) goto L_0x0602
            X.N8P r1 = (X.N8P) r1
            X.N8U r0 = (X.N8U) r0
            r13 = 0
            boolean r12 = X.AnonymousClass7TF.A1U(r13, r1, r0)
            java.lang.Long r11 = r0.A0H
            if (r11 == 0) goto L_0x05c6
            java.lang.Long r2 = r0.A0G
            r4 = 1
            if (r2 != 0) goto L_0x05d0
        L_0x05c6:
            r4 = 0
            int r2 = r0.A02
            if (r2 <= 0) goto L_0x05d0
            int r2 = r0.A01
            r3 = 1
            if (r2 > 0) goto L_0x05d1
        L_0x05d0:
            r3 = 0
        L_0x05d1:
            int r2 = r0.A02
            r33 = r2
            boolean r6 = X.AnonymousClass7TF.A1R(r33)
            int r2 = r0.A01
            r34 = r2
            boolean r5 = X.AnonymousClass7TF.A1R(r34)
            if (r4 != 0) goto L_0x07bd
            if (r3 != 0) goto L_0x0919
            java.lang.Integer r5 = r1.A02
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r5 == r2) goto L_0x07ac
            X.0wj r4 = X.0wj.A01
            r3 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r2 = "Initial load must be of LoadType BOTH, but it's "
            java.lang.String r1 = X.C70091Nx7.A00(r5)
            java.lang.String r1 = X.002.A0R(r2, r1)
            r4.EFR(r3, r1)
            X.MfH r3 = X.C70737OIu.A00(r0)
            return r3
        L_0x0602:
            boolean r3 = r2 instanceof X.C68936NbF
            if (r3 == 0) goto L_0x061e
            X.PCo r1 = (X.C72609PCo) r1
            X.N8V r0 = (X.N8V) r0
            r4 = 0
            X.AnonymousClass7TF.A1H(r1, r0)
            java.lang.String r3 = r1.A01
            X.NAg r2 = r1.A00
            int r1 = r0.A00
            X.N8V r0 = new X.N8V
            r0.<init>(r2, r3, r1, r4)
            X.MfH r3 = X.C70737OIu.A00(r0)
            return r3
        L_0x061e:
            boolean r3 = r2 instanceof X.C68943NbM
            if (r3 == 0) goto L_0x069c
            X.PCq r1 = (X.C72611PCq) r1
            X.N8U r0 = (X.N8U) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            int r13 = r0.A02
            int r2 = r0.A01
            int r14 = r0.A05
            int r32 = java.lang.Math.max(r2, r14)
            java.lang.String r2 = r1.A01
            r16 = r2
            com.instagram.direct.model.messaginguser.MessagingUser r2 = r0.A0C
            r20 = r2
            com.instagram.model.direct.threadkey.impl.MsysThreadId r2 = r0.A0E
            r22 = r2
            com.facebook.msys.mci.AuthData r2 = r0.A0A
            r18 = r2
            X.9Hs r15 = r0.A0F
            X.9Ie r12 = r0.A06
            X.7LZ r11 = r0.A0B
            X.OKP r10 = r0.A0D
            X.GnR r9 = r0.A07
            java.lang.Long r8 = r0.A0H
            java.lang.Long r7 = r0.A0G
            int r6 = r0.A04
            int r5 = r0.A03
            java.util.Set r4 = r0.A0J
            X.Jw4 r3 = r0.A08
            X.N4L r2 = r0.A09
            int r0 = r0.A00
            r28 = r14
            r29 = r6
            r30 = r5
            r31 = r13
            r33 = r0
            r24 = r8
            r25 = r7
            r26 = r16
            r27 = r4
            r21 = r10
            r23 = r15
            r16 = r3
            r17 = r2
            r19 = r11
            r14 = r12
            r15 = r9
            X.N8U r10 = X.N8U.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            if (r13 <= 0) goto L_0x0699
            if (r32 <= 0) goto L_0x0699
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
        L_0x0685:
            X.OFH r0 = r1.A00
            X.N8Q r1 = new X.N8Q
            r2 = r18
            r3 = r20
            r4 = r0
            r5 = r22
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r1)
            goto L_0x0127
        L_0x0699:
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            goto L_0x0685
        L_0x069c:
            boolean r3 = r2 instanceof X.C68942NbL
            if (r3 == 0) goto L_0x091e
            X.PCm r1 = (X.C72607PCm) r1
            X.N8U r0 = (X.N8U) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            int r13 = r0.A02
            int r2 = r0.A01
            int r14 = r0.A05
            int r32 = java.lang.Math.max(r2, r14)
            com.instagram.direct.model.messaginguser.MessagingUser r2 = r0.A0C
            r20 = r2
            com.instagram.model.direct.threadkey.impl.MsysThreadId r2 = r0.A0E
            r22 = r2
            com.facebook.msys.mci.AuthData r2 = r0.A0A
            r18 = r2
            X.9Hs r2 = r0.A0F
            r16 = r2
            X.9Ie r15 = r0.A06
            X.7LZ r12 = r0.A0B
            X.OKP r11 = r0.A0D
            X.GnR r10 = r0.A07
            java.lang.Long r9 = r0.A0H
            java.lang.Long r8 = r0.A0G
            int r7 = r0.A04
            int r6 = r0.A03
            java.util.Set r5 = r0.A0J
            X.Jw4 r4 = r0.A08
            X.N4L r3 = r0.A09
            java.lang.String r2 = r0.A0I
            int r0 = r0.A00
            r28 = r14
            r29 = r7
            r30 = r6
            r31 = r13
            r33 = r0
            r24 = r9
            r25 = r8
            r26 = r2
            r27 = r5
            r21 = r11
            r23 = r16
            r16 = r4
            r17 = r3
            r19 = r12
            r14 = r15
            r15 = r10
            X.N8U r10 = X.N8U.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            if (r13 <= 0) goto L_0x0717
            if (r32 <= 0) goto L_0x0717
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
        L_0x0703:
            X.OFH r0 = r1.A00
            X.N8Q r1 = new X.N8Q
            r2 = r18
            r3 = r20
            r4 = r0
            r5 = r22
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r1)
            goto L_0x0127
        L_0x0717:
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            goto L_0x0703
        L_0x071a:
            boolean r3 = r2.A01
            int r2 = r2.A00
            int r1 = r1.A00
            X.MfH r3 = X.C69975NvF.A00(r0, r2, r1, r14, r3)
            return r3
        L_0x0725:
            X.MfH r3 = X.C70737OIu.A00(r0)
            return r3
        L_0x072a:
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            int r4 = X.C66580MXl.A04(r7)
            r3 = 0
        L_0x0733:
            if (r3 >= r4) goto L_0x074c
            java.lang.String r2 = X.C66580MXl.A0v(r7, r3, r9)
            com.facebook.msys.mci.CQLResultSet r1 = r7.mResultSet
            r0 = 2
            java.lang.Long r0 = X.C66581MXm.A0q(r1, r3, r0)
            r5.put(r2, r0)
            int r3 = r3 + 1
            goto L_0x0733
        L_0x0746:
            X.0sl r6 = X.0sl.A00
            X.0sm r5 = X.0Yt.A0E()
        L_0x074c:
            X.N8S r0 = new X.N8S
            r0.<init>(r5, r6, r8)
            X.MfH r3 = X.C70737OIu.A00(r0)
            return r3
        L_0x0756:
            X.MfH r3 = X.C70737OIu.A00(r0)
            return r3
        L_0x075b:
            r4 = 0
            int r3 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x07a2
            int r10 = r1.A00
            boolean r14 = r0.A07
            X.Pwi r6 = r0.A06
            int r7 = r0.A01
            int r8 = r0.A02
            com.facebook.msys.mci.AuthData r5 = r0.A05
            int r9 = r0.A00
            X.MgM r4 = new X.MgM
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13, r14, r15)
            r1 = r14 ^ 1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.Mgt r3 = new X.Mgt
            r3.<init>(r0, r15, r1)
            r14 = 2147483647(0x7fffffff, float:NaN)
            boolean r1 = r2.A01
            int r0 = r2.A00
            X.Mgu r13 = new X.Mgu
            r15 = r8
            r16 = r0
            r17 = r9
            r18 = r10
            r19 = r11
            r21 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r21)
            X.Pra[] r0 = new X.C74246Pra[]{r3, r13}
            java.util.List r0 = X.0sr.A1P(r0)
            X.MfH r3 = new X.MfH
            r3.<init>(r4, r0)
            return r3
        L_0x07a2:
            X.MfH r3 = X.C70737OIu.A00(r0)
            return r3
        L_0x07a7:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x07ac:
            X.OFH r3 = r1.A01
            int r2 = r0.A05
            X.JwM r1 = r1.A00
            r6 = r1
            r7 = r0
            r8 = r3
            r9 = r5
            r10 = r2
            r11 = r2
            X.MfH r3 = X.C70090Nx6.A00(r6, r7, r8, r9, r10, r11)
            return r3
        L_0x07bd:
            java.lang.Integer r4 = r1.A02
            int r3 = r4.intValue()
            r2 = 2
            if (r3 == r13) goto L_0x07ee
            if (r3 == r12) goto L_0x07d6
            if (r3 == r2) goto L_0x07cf
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x07cf:
            java.lang.String r0 = "Load type BOTH should only be used for initial load or in response to a sync"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x07d6:
            int r2 = r0.A03
            if (r2 != r12) goto L_0x0919
            if (r5 != 0) goto L_0x0919
            X.OFH r3 = r1.A01
            int r2 = r0.A05
            X.JwM r1 = r1.A00
            r5 = r1
            r6 = r0
            r7 = r3
            r8 = r4
            r9 = r33
            r10 = r2
            X.MfH r3 = X.C70090Nx6.A00(r5, r6, r7, r8, r9, r10)
            return r3
        L_0x07ee:
            int r10 = r0.A04
            if (r10 != r12) goto L_0x0806
            if (r6 != 0) goto L_0x0919
            X.OFH r3 = r1.A01
            int r2 = r0.A05
            X.JwM r1 = r1.A00
            r5 = r1
            r6 = r0
            r7 = r3
            r8 = r4
            r9 = r2
            r10 = r34
            X.MfH r3 = X.C70090Nx6.A00(r5, r6, r7, r8, r9, r10)
            return r3
        L_0x0806:
            if (r10 != r2) goto L_0x0875
            if (r6 != 0) goto L_0x0919
            int r1 = r0.A05
            r17 = r1
            if (r11 != 0) goto L_0x0815
            X.MfH r3 = X.C70737OIu.A00(r0)
            return r3
        L_0x0815:
            com.instagram.direct.model.messaginguser.MessagingUser r1 = r0.A0C
            r16 = r1
            com.instagram.model.direct.threadkey.impl.MsysThreadId r14 = r0.A0E
            com.facebook.msys.mci.AuthData r15 = r0.A0A
            X.9Hs r13 = r0.A0F
            X.9Ie r12 = r0.A06
            X.7LZ r9 = r0.A0B
            X.OKP r8 = r0.A0D
            X.GnR r7 = r0.A07
            java.lang.Long r6 = r0.A0G
            int r5 = r0.A03
            java.util.Set r4 = r0.A0J
            X.Jw4 r3 = r0.A08
            X.N4L r2 = r0.A09
            java.lang.String r1 = r0.A0I
            int r0 = r0.A00
            r31 = r5
            r32 = r17
            r33 = r34
            r34 = r0
            r25 = r11
            r26 = r6
            r27 = r1
            r28 = r4
            r29 = r17
            r30 = r10
            r23 = r14
            r24 = r13
            r21 = r16
            r22 = r8
            r19 = r15
            r20 = r9
            r17 = r3
            r18 = r2
            r15 = r12
            r16 = r7
            X.N8U r5 = X.N8U.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            long r3 = r14.A00
            long r1 = r11.longValue()
            X.PCx r0 = new X.PCx
            r0.<init>(r3, r1)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.MfH r3 = new X.MfH
            r3.<init>(r5, r0)
            return r3
        L_0x0875:
            r4 = 4
            if (r10 != r4) goto L_0x0919
            X.N4L r3 = r0.A09
            if (r3 == 0) goto L_0x0919
            boolean r2 = r3.A06
            if (r2 != 0) goto L_0x0919
            boolean r1 = r3.A05
            if (r1 != 0) goto L_0x0919
            java.lang.Object r14 = r3.A02
            X.3t0 r14 = (X.C254763t0) r14
            boolean r9 = r3.A04
            java.lang.Object r1 = r3.A00
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r8 = r3.A03
            X.7SD r8 = (X.AnonymousClass7SD) r8
            X.0qQ.A0B(r14, r13)
            X.0qQ.A0B(r1, r4)
            X.N4L r19 = new X.N4L
            r20 = r8
            r21 = r14
            r22 = r1
            r23 = r12
            r24 = r9
            r25 = r2
            r19.<init>((X.AnonymousClass7SD) r20, (X.C254763t0) r21, (java.util.List) r22, (boolean) r23, (boolean) r24, (boolean) r25)
            com.instagram.direct.model.messaginguser.MessagingUser r1 = r0.A0C
            r22 = r1
            com.instagram.model.direct.threadkey.impl.MsysThreadId r1 = r0.A0E
            r24 = r1
            com.facebook.msys.mci.AuthData r1 = r0.A0A
            r20 = r1
            X.9Hs r1 = r0.A0F
            r25 = r1
            int r1 = r0.A05
            r30 = r1
            X.9Ie r1 = r0.A06
            r16 = r1
            X.7LZ r15 = r0.A0B
            X.OKP r7 = r0.A0D
            X.GnR r6 = r0.A07
            java.lang.Long r5 = r0.A0G
            int r4 = r0.A03
            java.util.Set r3 = r0.A0J
            X.Jw4 r2 = r0.A08
            java.lang.String r1 = r0.A0I
            int r0 = r0.A00
            r17 = r6
            r18 = r2
            r21 = r15
            r23 = r7
            r26 = r11
            r27 = r5
            r28 = r1
            r29 = r3
            r31 = r10
            r32 = r4
            r35 = r0
            X.N8U r2 = X.N8U.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            if (r9 == 0) goto L_0x08fe
            X.PCz r0 = new X.PCz
            r0.<init>(r14, r13, r13)
        L_0x08f4:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
        L_0x08f8:
            X.MfH r3 = new X.MfH
            r3.<init>(r2, r0)
            return r3
        L_0x08fe:
            if (r8 != 0) goto L_0x0906
            X.PCz r0 = new X.PCz
            r0.<init>(r14, r12, r12)
            goto L_0x08f4
        L_0x0906:
            X.PCz r1 = new X.PCz
            r1.<init>(r14, r12, r13)
            X.PCy r0 = new X.PCy
            r0.<init>(r8, r14)
            X.Pra[] r0 = new X.C74246Pra[]{r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            goto L_0x08f8
        L_0x0919:
            X.MfH r3 = X.C70737OIu.A00(r0)
            return r3
        L_0x091e:
            boolean r3 = r2 instanceof X.C68941NbK
            if (r3 == 0) goto L_0x0984
            X.PCr r1 = (X.C72612PCr) r1
            X.N8U r0 = (X.N8U) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            X.9Hs r2 = r1.A02
            r18 = r2
            X.9Ie r2 = r1.A00
            r30 = r2
            X.7LZ r1 = r1.A01
            r29 = r1
            com.instagram.direct.model.messaginguser.MessagingUser r1 = r0.A0C
            r16 = r1
            com.instagram.model.direct.threadkey.impl.MsysThreadId r15 = r0.A0E
            com.facebook.msys.mci.AuthData r14 = r0.A0A
            int r13 = r0.A05
            X.OKP r12 = r0.A0D
            X.GnR r11 = r0.A07
            java.lang.Long r10 = r0.A0H
            java.lang.Long r9 = r0.A0G
            int r8 = r0.A04
            int r7 = r0.A03
            int r6 = r0.A02
            int r5 = r0.A01
            java.util.Set r4 = r0.A0J
            X.Jw4 r3 = r0.A08
            X.N4L r2 = r0.A09
            java.lang.String r1 = r0.A0I
            int r0 = r0.A00
            r25 = r7
            r26 = r6
            r27 = r5
            r28 = r0
            r21 = r1
            r22 = r4
            r23 = r13
            r24 = r8
            r17 = r15
            r19 = r10
            r20 = r9
            r13 = r14
            r14 = r29
            r15 = r16
            r16 = r12
            r9 = r30
            r10 = r11
            r11 = r3
            r12 = r2
            X.N8U r0 = X.N8U.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.MfH r3 = X.C70737OIu.A00(r0)
            return r3
        L_0x0984:
            boolean r2 = r2 instanceof X.C68938NbH
            if (r2 == 0) goto L_0x0a45
            X.PCp r1 = (X.C72610PCp) r1
            X.N8U r0 = (X.N8U) r0
            r6 = 0
            boolean r21 = X.AnonymousClass7TF.A1U(r6, r1, r0)
            boolean r3 = r1.A01
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L_0x0a12
            X.N4L r5 = r0.A09
            if (r5 == 0) goto L_0x0a3b
            X.7SD r4 = r1.A00
            if (r4 != 0) goto L_0x09a3
            java.lang.Object r4 = r5.A03
            X.7SD r4 = (X.AnonymousClass7SD) r4
        L_0x09a3:
            java.lang.Object r3 = r5.A02
            X.3t0 r3 = (X.C254763t0) r3
            boolean r2 = r5.A06
            java.lang.Object r1 = r5.A00
            java.util.List r1 = (java.util.List) r1
            X.AnonymousClass7TF.A1D(r3, r6, r1)
            X.N4L r16 = new X.N4L
            r22 = r2
            r17 = r4
            r18 = r3
            r19 = r1
            r20 = r6
            r16.<init>((X.AnonymousClass7SD) r17, (X.C254763t0) r18, (java.util.List) r19, (boolean) r20, (boolean) r21, (boolean) r22)
        L_0x09bf:
            com.instagram.direct.model.messaginguser.MessagingUser r1 = r0.A0C
            r19 = r1
            com.instagram.model.direct.threadkey.impl.MsysThreadId r1 = r0.A0E
            r18 = r1
            com.facebook.msys.mci.AuthData r1 = r0.A0A
            r17 = r1
            X.9Hs r15 = r0.A0F
            int r14 = r0.A05
            X.9Ie r13 = r0.A06
            X.7LZ r12 = r0.A0B
            X.OKP r11 = r0.A0D
            X.GnR r10 = r0.A07
            java.lang.Long r9 = r0.A0H
            java.lang.Long r8 = r0.A0G
            int r7 = r0.A04
            int r6 = r0.A03
            int r5 = r0.A02
            int r4 = r0.A01
            java.util.Set r3 = r0.A0J
            X.Jw4 r2 = r0.A08
            java.lang.String r1 = r0.A0I
            int r0 = r0.A00
            r29 = r6
            r30 = r5
            r31 = r4
            r32 = r0
            r25 = r1
            r26 = r3
            r27 = r14
            r28 = r7
            r21 = r18
            r22 = r15
            r23 = r9
            r24 = r8
            r18 = r12
            r20 = r11
            r14 = r10
            r15 = r2
            X.N8U r0 = X.N8U.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.MfH r3 = X.C70737OIu.A00(r0)
            return r3
        L_0x0a12:
            X.N4L r1 = r0.A09
            if (r1 == 0) goto L_0x0a40
            java.lang.Object r5 = r1.A02
            X.3t0 r5 = (X.C254763t0) r5
            boolean r4 = r1.A04
            boolean r3 = r1.A06
            java.lang.Object r2 = r1.A00
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r1.A03
            X.7SD r1 = (X.AnonymousClass7SD) r1
            X.AnonymousClass7TF.A1D(r5, r6, r2)
            X.N4L r16 = new X.N4L
            r21 = r4
            r22 = r3
            r17 = r1
            r18 = r5
            r19 = r2
            r20 = r6
            r16.<init>((X.AnonymousClass7SD) r17, (X.C254763t0) r18, (java.util.List) r19, (boolean) r20, (boolean) r21, (boolean) r22)
            goto L_0x09bf
        L_0x0a3b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0a40:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0a45:
            X.N8O r1 = (X.N8O) r1
            X.N8U r0 = (X.N8U) r0
            r8 = 0
            boolean r19 = X.AnonymousClass7TF.A1U(r8, r1, r0)
            X.OGy r2 = r1.A00
            com.instagram.direct.model.messaginguser.MessagingUser r3 = r0.A0C
            r37 = r3
            X.9Ie r3 = r0.A06
            r18 = r3
            if (r3 == 0) goto L_0x0ba0
            java.lang.Object r3 = r3.A00
            X.7SD r3 = (X.AnonymousClass7SD) r3
            if (r3 == 0) goto L_0x0ba0
            boolean r3 = r3.A0r
            r17 = r3
        L_0x0a64:
            java.util.List r12 = r1.A01
            r3 = r37
            X.AnonymousClass7TF.A1B(r3, r8, r12)
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            int r16 = r12.size()
            r4 = 0
        L_0x0a74:
            r3 = r16
            if (r4 >= r3) goto L_0x0ba9
            int r3 = r4 + -1
            java.lang.Object r11 = X.00k.A0O(r12, r3)
            X.7LQ r11 = (X.AnonymousClass7LQ) r11
            if (r11 == 0) goto L_0x0b9d
            X.3su r14 = r11.A0e
        L_0x0a84:
            java.lang.Object r3 = r12.get(r4)
            X.7LQ r3 = (X.AnonymousClass7LQ) r3
            X.3su r5 = r3.A0e
            X.0qQ.A07(r5)
            if (r11 == 0) goto L_0x0b9a
            if (r14 == 0) goto L_0x0aab
            boolean r13 = r11.A05()
            boolean r10 = r11.A0P
            X.7Bo r7 = r11.A03()
            X.7Bo r6 = X.C327627Bo.NUX_TYPE_NONE
            boolean r6 = X.C51969G9p.A1a(r7, r6)
            boolean r6 = X.AnonymousClass7F2.A06(r5, r14, r13, r10, r6)
            r11.A0V = r6
            r3.A0U = r6
        L_0x0aab:
            X.3su r7 = r11.A0e
        L_0x0aad:
            X.7Bu r6 = X.C66582MXn.A0e(r5)
            boolean r6 = X.AnonymousClass7F0.A00(r5, r7, r6)
            if (r6 == 0) goto L_0x0af3
            java.lang.String r13 = r5.A0h()
            long r6 = r5.C7c()
            android.content.Context r10 = r2.A00
            java.lang.String r25 = X.AnonymousClass7F5.A00(r10, r6)
            r21 = 0
            X.7L2 r10 = r2.A04
            int r15 = r10.A00
            X.7Bp r14 = r3.A0F
            java.lang.Integer r23 = X.AnonymousClass05K.A00
            boolean r30 = r10.A00()
            X.7O6 r10 = new X.7O6
            r20 = r10
            r22 = r14
            r24 = r13
            r26 = r15
            r27 = r6
            r29 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r29, r30)
            java.lang.Integer r14 = X.AnonymousClass05K.A0C
            java.lang.Object[] r7 = new java.lang.Object[]{r13}
            java.lang.String r6 = "timestamp_{0}"
            java.lang.String r6 = java.text.MessageFormat.format(r6, r7)
            X.OTT.A00(r14, r6, r10, r13, r9)
        L_0x0af3:
            if (r11 == 0) goto L_0x0b97
            X.3su r10 = r11.A0e
        L_0x0af7:
            X.7Bu r23 = X.C66582MXn.A0e(r5)
            X.3tI r6 = r5.A0P()
            boolean r25 = X.AnonymousClass7TF.A1V(r6)
            boolean r11 = r5.A2F
            X.2FW r7 = r5.A10
            X.2FW r6 = X.2FW.A1e
            boolean r27 = X.AnonymousClass7TF.A1W(r7, r6)
            X.2FW r7 = r5.A10
            X.2FW r6 = X.2FW.A0y
            if (r7 != r6) goto L_0x0b19
            java.lang.String r6 = r5.A1V
            r28 = 1
            if (r6 != 0) goto L_0x0b1b
        L_0x0b19:
            r28 = 0
        L_0x0b1b:
            X.9I4 r6 = r5.A04
            if (r6 == 0) goto L_0x0b27
            boolean r7 = r6.A00
            r31 = 1
            r6 = r19
            if (r7 == r6) goto L_0x0b29
        L_0x0b27:
            r31 = 0
        L_0x0b29:
            r20 = r37
            r21 = r5
            r22 = r10
            r24 = r17
            r26 = r11
            r29 = r8
            r30 = r8
            boolean r6 = X.AnonymousClass7F1.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            if (r6 == 0) goto L_0x0b93
            java.lang.String r6 = r5.A0h()
            com.instagram.user.model.User r7 = r3.A0K
            if (r7 == 0) goto L_0x0ba4
            java.lang.String r24 = X.AnonymousClass50n.A08(r7)
            X.0qQ.A07(r24)
            long r30 = r5.C7c()
            X.7L2 r5 = r2.A04
            int r11 = r5.A00
            r21 = 0
            X.7Bp r10 = r3.A0F
            X.4Cl r3 = r7.A03
            com.instagram.api.schemas.IGAIAgentType r7 = r3.AaX()
            com.instagram.api.schemas.IGAIAgentType r3 = com.instagram.api.schemas.IGAIAgentType.A04
            boolean r34 = X.AnonymousClass7TF.A1W(r7, r3)
            boolean r35 = r5.A00()
            r29 = 8388611(0x800003, float:1.1754948E-38)
            X.7F4 r3 = new X.7F4
            r22 = r10
            r23 = r21
            r25 = r21
            r26 = r21
            r27 = r11
            r28 = r11
            r32 = r8
            r33 = r8
            r36 = r8
            r20 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r36)
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            java.lang.Object[] r7 = new java.lang.Object[]{r6}
            java.lang.String r5 = "username_{0}"
            java.lang.String r5 = java.text.MessageFormat.format(r5, r7)
            X.OTT.A00(r10, r5, r3, r6, r9)
        L_0x0b93:
            int r4 = r4 + 1
            goto L_0x0a74
        L_0x0b97:
            r10 = 0
            goto L_0x0af7
        L_0x0b9a:
            r7 = 0
            goto L_0x0aad
        L_0x0b9d:
            r14 = 0
            goto L_0x0a84
        L_0x0ba0:
            r17 = 0
            goto L_0x0a64
        L_0x0ba4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0ba9:
            X.ODp r10 = r2.A02
            android.content.Context r7 = r2.A00
            com.instagram.common.session.UserSession r6 = r2.A01
            X.17i r5 = r2.A05
            X.7L2 r3 = r2.A04
            X.9HC r11 = r2.A03
            r4 = 4
            java.util.ArrayList r13 = X.AnonymousClass7TF.A0q(r11, r4)
            java.util.Iterator r16 = r12.iterator()
        L_0x0bbe:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x0bde
            java.lang.Object r14 = r16.next()
            r15 = r14
            X.7LQ r15 = (X.AnonymousClass7LQ) r15
            int r12 = r15.getType()
            r2 = -1
            if (r12 == r2) goto L_0x0bbe
            int r12 = r15.getType()
            r2 = r19
            if (r12 == r2) goto L_0x0bbe
            r13.add(r14)
            goto L_0x0bbe
        L_0x0bde:
            java.util.ArrayList r12 = X.AnonymousClass7TF.A0p(r13)
            java.util.Iterator r15 = r13.iterator()
        L_0x0be6:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x0c27
            java.lang.Object r13 = r15.next()
            X.7LQ r13 = (X.AnonymousClass7LQ) r13
            X.C51974G9v.A1M(r5, r3, r11)
            r2 = 5
            X.0qQ.A0B(r13, r2)
            int r14 = r13.getType()
            X.0eM r2 = r10.A01
            java.lang.Object r2 = r2.getValue()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r2 = X.C51968G9o.A10(r2, r14)
            X.7El r2 = (X.C328347El) r2
            if (r2 != 0) goto L_0x0c0f
            X.P7X r2 = r10.A00
        L_0x0c0f:
            r20 = r7
            r21 = r6
            r22 = r11
            r23 = r13
            r24 = r3
            r25 = r5
            r26 = r8
            r19 = r2
            X.2tL r2 = r19.AWb(r20, r21, r22, r23, r24, r25, r26)
            r12.add(r2)
            goto L_0x0be6
        L_0x0c27:
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0p(r12)
            java.util.Iterator r7 = r12.iterator()
        L_0x0c2f:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0c46
            java.lang.Object r6 = r7.next()
            X.2tL r6 = (X.C232262tL) r6
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            java.lang.Object r3 = r6.getKey()
            r2 = 0
            X.OTT.A00(r5, r3, r6, r2, r10)
            goto L_0x0c2f
        L_0x0c46:
            r9.addAll(r8, r10)
            java.util.List r11 = X.C70094NxA.A00(r9)
            X.N4L r2 = r0.A09
            if (r2 == 0) goto L_0x0cbf
            boolean r14 = r1.A02
            java.lang.Object r10 = r2.A02
            X.3t0 r10 = (X.C254763t0) r10
            boolean r12 = r2.A05
            boolean r13 = r2.A04
            java.lang.Object r9 = r2.A03
            X.7SD r9 = (X.AnonymousClass7SD) r9
            X.0qQ.A0B(r10, r8)
            X.0qQ.A0B(r11, r4)
            X.N4L r20 = new X.N4L
            r8 = r20
            r8.<init>((X.AnonymousClass7SD) r9, (X.C254763t0) r10, (java.util.List) r11, (boolean) r12, (boolean) r13, (boolean) r14)
        L_0x0c6c:
            com.instagram.model.direct.threadkey.impl.MsysThreadId r1 = r0.A0E
            r16 = r1
            com.facebook.msys.mci.AuthData r15 = r0.A0A
            X.9Hs r14 = r0.A0F
            int r13 = r0.A05
            X.7LZ r12 = r0.A0B
            X.OKP r11 = r0.A0D
            X.GnR r10 = r0.A07
            java.lang.Long r9 = r0.A0H
            java.lang.Long r8 = r0.A0G
            int r7 = r0.A04
            int r6 = r0.A03
            int r5 = r0.A02
            int r4 = r0.A01
            java.util.Set r3 = r0.A0J
            X.Jw4 r2 = r0.A08
            java.lang.String r1 = r0.A0I
            int r0 = r0.A00
            r19 = r2
            r21 = r15
            r22 = r12
            r23 = r37
            r24 = r11
            r25 = r16
            r26 = r14
            r27 = r9
            r28 = r8
            r29 = r1
            r30 = r3
            r31 = r13
            r32 = r7
            r33 = r6
            r34 = r5
            r35 = r4
            r36 = r0
            r17 = r18
            r18 = r10
            X.N8U r0 = X.N8U.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            X.MfH r3 = X.C70737OIu.A00(r0)
            return r3
        L_0x0cbf:
            r20 = 0
            goto L_0x0c6c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66922MfG.apply(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
