package X;

import java.util.List;

/* renamed from: X.Sd2  reason: case insensitive filesystem */
public final class C11602Sd2 implements AnonymousClass5RD {
    public final /* synthetic */ C284945Oz A00;
    public final /* synthetic */ C56864IFl A01;
    public final /* synthetic */ Sd5 A02;

    public C11602Sd2(C284945Oz r1, C56864IFl iFl, Sd5 sd5) {
        this.A02 = sd5;
        this.A01 = iFl;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r11v19, types: [java.lang.Object, X.RR9] */
    /* JADX WARNING: type inference failed for: r11v22, types: [java.lang.Object, X.RR9] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x043f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C289145d6 Cnx(X.C268004cb r26, java.util.List r27, long r28) {
        /*
            r25 = this;
            r3 = r26
            r2 = r27
            boolean r5 = X.AnonymousClass7TG.A1Z(r3, r2)
            r24 = r25
            r0 = r24
            X.Sd5 r4 = r0.A02
            X.5Q8 r7 = r3.getLayoutDirection()
            X.IFl r11 = r0.A01
            r19 = 257(0x101, float:3.6E-43)
            X.AnonymousClass7TF.A1B(r7, r5, r11)
            r4.A01 = r3
            r4.A00 = r3
            X.0eM r9 = r4.A07
            java.lang.Object r8 = r9.getValue()
            X.SOO r8 = (X.SOO) r8
            r22 = r28
            boolean r0 = androidx.compose.ui.unit.Constraints.A09(r22)
            if (r0 == 0) goto L_0x00ca
            int r6 = androidx.compose.ui.unit.Constraints.A01(r22)
            java.lang.Object r0 = X.SR7.A04
            X.SR7 r1 = new X.SR7
            r1.<init>(r0)
            r0 = 0
            r1.A02 = r0
            r1.A01 = r6
        L_0x003d:
            X.Sd4 r0 = r8.A07
            r0.A0G = r1
            java.lang.Object r8 = r9.getValue()
            X.SOO r8 = (X.SOO) r8
            boolean r0 = androidx.compose.ui.unit.Constraints.A08(r22)
            if (r0 == 0) goto L_0x00ba
            int r6 = androidx.compose.ui.unit.Constraints.A00(r22)
            java.lang.Object r0 = X.SR7.A04
            X.SR7 r1 = new X.SR7
            r1.<init>(r0)
            r0 = 0
            r1.A02 = r0
            r1.A01 = r6
        L_0x005d:
            X.Sd4 r0 = r8.A07
            r0.A0H = r1
            java.lang.Object r6 = r9.getValue()
            X.SOO r6 = (X.SOO) r6
            r0 = r22
            r6.A00 = r0
            java.lang.Object r0 = r9.getValue()
            X.SOO r0 = (X.SOO) r0
            r0.A01 = r7
            java.util.Map r0 = r4.A06
            r21 = r0
            r21.clear()
            java.util.Map r0 = r4.A05
            r0.clear()
            java.util.Map r0 = r4.A04
            r0.clear()
            boolean r0 = r11.A01
            if (r0 != 0) goto L_0x00db
            int r1 = r2.size()
            java.util.List r10 = r11.A04
            int r0 = r10.size()
            if (r1 != r0) goto L_0x00db
            int r8 = X.C51966G9m.A06(r2)
            if (r8 < 0) goto L_0x00dd
            r7 = 0
        L_0x009b:
            int r6 = r7 + 1
            java.lang.Object r0 = r2.get(r7)
            X.4cj r0 = (X.C268084cj) r0
            java.lang.Object r1 = r0.BaX()
            boolean r0 = r1 instanceof X.IGB
            if (r0 != 0) goto L_0x00ac
            r1 = 0
        L_0x00ac:
            java.lang.Object r0 = r10.get(r7)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00db
            if (r6 > r8) goto L_0x00dd
            r7 = r6
            goto L_0x009b
        L_0x00ba:
            java.lang.Object r0 = X.SR7.A08
            X.SR7 r1 = new X.SR7
            r1.<init>(r0)
            int r0 = androidx.compose.ui.unit.Constraints.A02(r22)
            if (r0 < 0) goto L_0x005d
            r1.A00 = r0
            goto L_0x005d
        L_0x00ca:
            java.lang.Object r0 = X.SR7.A08
            X.SR7 r1 = new X.SR7
            r1.<init>(r0)
            int r0 = androidx.compose.ui.unit.Constraints.A03(r22)
            if (r0 < 0) goto L_0x003d
            r1.A00 = r0
            goto L_0x003d
        L_0x00db:
            r0 = 1
            goto L_0x00de
        L_0x00dd:
            r0 = 0
        L_0x00de:
            java.lang.Object r7 = r9.getValue()
            X.SOO r7 = (X.SOO) r7
            if (r0 == 0) goto L_0x0407
            java.util.HashMap r6 = r7.A03
            X.0qQ.A06(r6)
            java.util.Iterator r1 = X.AnonymousClass7TF.A0s(r6)
        L_0x00ef:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = X.C51971G9r.A0p(r1)
            X.TbV r0 = (X.C13504TbV) r0
            if (r0 == 0) goto L_0x00ef
            X.2d3 r0 = r0.Aq5()
            r0.A0B()
            goto L_0x00ef
        L_0x0105:
            r6.clear()
            java.lang.Integer r1 = X.SOO.A0A
            X.Sd4 r0 = r7.A07
            r6.put(r1, r0)
            java.util.List r0 = r7.A08
            r0.clear()
            r7.A05 = r5
            java.util.HashMap r0 = r7.A02
            r0.clear()
            java.util.HashMap r0 = r7.A04
            r0.clear()
            java.lang.Object r12 = r9.getValue()
            r10 = 0
            X.0qQ.A0B(r12, r10)
            X.HqS r0 = r11.A03
            java.util.List r0 = r0.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x0130:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0140
            java.lang.Object r0 = r1.next()
            X.0sP r0 = (X.0sP) r0
            r0.invoke(r12)
            goto L_0x0130
        L_0x0140:
            java.util.List r0 = r11.A04
            r0.clear()
            X.5TE r8 = r11.A02
            X.0gF r7 = X.C60340gF.A00
            X.0sP r6 = r11.A05
            r1 = 6
            X.Iw5 r0 = new X.Iw5
            r0.<init>(r1, r2, r12, r11)
            r8.A02(r7, r0, r6)
            r11.A01 = r10
            java.lang.Object r0 = r9.getValue()
            X.SOO r0 = (X.SOO) r0
            X.C56174Hu3.A01(r0, r2)
            java.lang.Object r9 = r9.getValue()
            X.SOO r9 = (X.SOO) r9
            X.2d1 r7 = r4.A03
            java.util.ArrayList r0 = r7.A00
            r0.clear()
            X.Sd4 r1 = r9.A07
            X.SR7 r0 = r1.A0G
            r0.A01(r7, r10)
            X.SR7 r0 = r1.A0H
            r0.A01(r7, r5)
            java.util.HashMap r6 = r9.A02
            java.util.Iterator r8 = X.Pxf.A0u(r6)
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0192
            java.lang.Object r0 = r8.next()
            r6.get(r0)
            java.lang.String r0 = "getHelperWidget"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0192:
            java.util.HashMap r9 = r9.A03
            java.util.Iterator r8 = X.Pxf.A0u(r9)
        L_0x0198:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01a6
            java.lang.Object r0 = r8.next()
            r9.get(r0)
            goto L_0x0198
        L_0x01a6:
            java.util.Iterator r11 = X.Pxf.A0u(r9)
        L_0x01aa:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r0 = r11.next()
            java.lang.Object r0 = r9.get(r0)
            X.TbV r0 = (X.C13504TbV) r0
            if (r0 == r1) goto L_0x01e3
            X.2d3 r8 = r0.Aq5()
            X.Sd4 r0 = (X.Sd4) r0
            java.lang.Object r0 = r0.A0K
            java.lang.String r0 = r0.toString()
            r8.A0n = r0
            r0 = 0
            r8.A0h = r0
            java.util.ArrayList r0 = r7.A00
            r0.add(r8)
            X.2d3 r0 = r8.A0h
            if (r0 == 0) goto L_0x01e0
            X.2d2 r0 = (X.AnonymousClass2d2) r0
            java.util.ArrayList r0 = r0.A00
            r0.remove(r8)
            r8.A0B()
        L_0x01e0:
            r8.A0h = r7
            goto L_0x01aa
        L_0x01e3:
            X.Sd4 r0 = (X.Sd4) r0
            r0.A0I = r7
            java.lang.Object r0 = r0.A0a
            r7.A0m = r0
            goto L_0x01aa
        L_0x01ec:
            java.util.Iterator r1 = X.Pxf.A0u(r6)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0204
            java.lang.Object r0 = r1.next()
            r6.get(r0)
            java.lang.String r0 = "getHelperWidget"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0204:
            java.util.Iterator r1 = X.Pxf.A0u(r9)
        L_0x0208:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0216
            java.lang.Object r0 = r1.next()
            r9.get(r0)
            goto L_0x0208
        L_0x0216:
            java.util.Iterator r18 = X.Pxf.A0u(r9)
        L_0x021a:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x040a
            java.lang.Object r8 = r18.next()
            java.lang.Object r7 = r9.get(r8)
            X.TbV r7 = (X.C13504TbV) r7
            r6 = r7
            X.Sd4 r6 = (X.Sd4) r6
            X.2d3 r1 = r6.A0I
            if (r1 == 0) goto L_0x03f9
            X.SR7 r0 = r6.A0G
            r0.A01(r1, r10)
            X.SR7 r0 = r6.A0H
            r0.A01(r1, r5)
            java.lang.Object r0 = r6.A0S
            java.lang.Object r0 = X.Sd4.A00(r6, r0)
            r6.A0S = r0
            java.lang.Object r0 = r6.A0T
            java.lang.Object r0 = X.Sd4.A00(r6, r0)
            r6.A0T = r0
            java.lang.Object r0 = r6.A0U
            java.lang.Object r0 = X.Sd4.A00(r6, r0)
            r6.A0U = r0
            java.lang.Object r0 = r6.A0V
            java.lang.Object r0 = X.Sd4.A00(r6, r0)
            r6.A0V = r0
            java.lang.Object r0 = r6.A0X
            java.lang.Object r0 = X.Sd4.A00(r6, r0)
            r6.A0X = r0
            java.lang.Object r0 = r6.A0W
            java.lang.Object r0 = X.Sd4.A00(r6, r0)
            r6.A0W = r0
            java.lang.Object r0 = r6.A0R
            java.lang.Object r0 = X.Sd4.A00(r6, r0)
            r6.A0R = r0
            java.lang.Object r0 = r6.A0Q
            java.lang.Object r0 = X.Sd4.A00(r6, r0)
            r6.A0Q = r0
            java.lang.Object r0 = r6.A0Z
            java.lang.Object r0 = X.Sd4.A00(r6, r0)
            r6.A0Z = r0
            java.lang.Object r0 = r6.A0Y
            java.lang.Object r0 = X.Sd4.A00(r6, r0)
            r6.A0Y = r0
            java.lang.Object r0 = r6.A0P
            java.lang.Object r0 = X.Sd4.A00(r6, r0)
            r6.A0P = r0
            java.lang.Object r0 = r6.A0O
            java.lang.Object r0 = X.Sd4.A00(r6, r0)
            r6.A0O = r0
            java.lang.Object r0 = r6.A0L
            java.lang.Object r0 = X.Sd4.A00(r6, r0)
            r6.A0L = r0
            java.lang.Object r0 = r6.A0N
            java.lang.Object r0 = X.Sd4.A00(r6, r0)
            r6.A0N = r0
            java.lang.Object r0 = r6.A0M
            java.lang.Object r0 = X.Sd4.A00(r6, r0)
            r6.A0M = r0
            X.2d3 r11 = r6.A0I
            java.lang.Object r1 = r6.A0S
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.Sd4.A01(r6, r11, r0, r1)
            X.2d3 r11 = r6.A0I
            java.lang.Object r1 = r6.A0T
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.Sd4.A01(r6, r11, r0, r1)
            X.2d3 r11 = r6.A0I
            java.lang.Object r1 = r6.A0U
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.Sd4.A01(r6, r11, r0, r1)
            X.2d3 r11 = r6.A0I
            java.lang.Object r1 = r6.A0V
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.Sd4.A01(r6, r11, r0, r1)
            X.2d3 r11 = r6.A0I
            java.lang.Object r1 = r6.A0X
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            X.Sd4.A01(r6, r11, r0, r1)
            X.2d3 r11 = r6.A0I
            java.lang.Object r1 = r6.A0W
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.Sd4.A01(r6, r11, r0, r1)
            X.2d3 r11 = r6.A0I
            java.lang.Object r1 = r6.A0R
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            X.Sd4.A01(r6, r11, r0, r1)
            X.2d3 r11 = r6.A0I
            java.lang.Object r1 = r6.A0Q
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            X.Sd4.A01(r6, r11, r0, r1)
            X.2d3 r11 = r6.A0I
            java.lang.Object r1 = r6.A0Z
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            X.Sd4.A01(r6, r11, r0, r1)
            X.2d3 r11 = r6.A0I
            java.lang.Object r1 = r6.A0Y
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            X.Sd4.A01(r6, r11, r0, r1)
            X.2d3 r11 = r6.A0I
            java.lang.Object r1 = r6.A0P
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            X.Sd4.A01(r6, r11, r0, r1)
            X.2d3 r11 = r6.A0I
            java.lang.Object r1 = r6.A0O
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            X.Sd4.A01(r6, r11, r0, r1)
            X.2d3 r11 = r6.A0I
            java.lang.Object r1 = r6.A0L
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            X.Sd4.A01(r6, r11, r0, r1)
            X.2d3 r11 = r6.A0I
            java.lang.Object r1 = r6.A0N
            java.lang.Integer r0 = X.AnonymousClass05K.A05
            X.Sd4.A01(r6, r11, r0, r1)
            X.2d3 r11 = r6.A0I
            java.lang.Object r1 = r6.A0M
            java.lang.Integer r0 = X.AnonymousClass05K.A06
            X.Sd4.A01(r6, r11, r0, r1)
            X.2d3 r11 = r6.A0I
            r1 = 0
            float r0 = r6.A00
            r11.A02 = r0
            float r0 = r6.A01
            r11.A06 = r0
            X.2d4 r0 = r11.A0Y
            r13 = 2143289344(0x7fc00000, float:NaN)
            r0.A01 = r13
            r0.A02 = r13
            r0.A03 = r13
            r0.A04 = r13
            r0.A05 = r13
            r0.A08 = r13
            r0.A09 = r13
            r0.A0A = r13
            r0.A06 = r13
            r0.A07 = r13
            r0.A00 = r13
            r0.A0F = r10
            r11.A0R = r10
            java.util.HashMap r0 = r6.A0b
            r20 = r0
            java.util.Iterator r17 = X.Pxf.A0u(r20)
        L_0x036b:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x03b1
            java.lang.String r14 = X.AnonymousClass7TE.A18(r17)
            r0 = r20
            java.lang.Object r11 = r0.get(r14)
            java.lang.Number r11 = (java.lang.Number) r11
            X.2d3 r0 = r6.A0I
            X.2d4 r0 = r0.A0Y
            int r15 = r11.intValue()
            r16 = 902(0x386, float:1.264E-42)
            java.util.HashMap r12 = r0.A0H
            boolean r0 = r12.containsKey(r14)
            if (r0 == 0) goto L_0x0398
            java.lang.Object r0 = r12.get(r14)
            X.RR9 r0 = (X.RR9) r0
            r0.A01 = r15
            goto L_0x036b
        L_0x0398:
            X.RR9 r11 = new X.RR9
            r11.<init>()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r11.A01 = r0
            r11.A00 = r13
            r11.A04 = r1
            r11.A03 = r14
            r0 = r16
            r11.A02 = r0
            r11.A01 = r15
            r12.put(r14, r11)
            goto L_0x036b
        L_0x03b1:
            java.util.HashMap r0 = r6.A0c
            r17 = r0
            java.util.Iterator r16 = X.Pxf.A0u(r17)
        L_0x03b9:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x03f9
            java.lang.String r14 = X.AnonymousClass7TE.A18(r16)
            r0 = r17
            java.lang.Object r0 = r0.get(r14)
            float r13 = X.AnonymousClass7TE.A04(r0)
            X.2d3 r0 = r6.A0I
            X.2d4 r0 = r0.A0Y
            r15 = 901(0x385, float:1.263E-42)
            java.util.HashMap r12 = r0.A0H
            boolean r0 = r12.containsKey(r14)
            if (r0 == 0) goto L_0x03e4
            java.lang.Object r0 = r12.get(r14)
            X.RR9 r0 = (X.RR9) r0
            r0.A00 = r13
            goto L_0x03b9
        L_0x03e4:
            X.RR9 r11 = new X.RR9
            r11.<init>()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r11.A01 = r0
            r11.A04 = r1
            r11.A03 = r14
            r11.A02 = r15
            r11.A00 = r13
            r12.put(r14, r11)
            goto L_0x03b9
        L_0x03f9:
            X.2d3 r1 = r7.Aq5()
            if (r8 == 0) goto L_0x021a
            java.lang.String r0 = r8.toString()
            r1.A0o = r0
            goto L_0x021a
        L_0x0407:
            X.C56174Hu3.A01(r7, r2)
        L_0x040a:
            X.2d1 r11 = r4.A03
            int r0 = androidx.compose.ui.unit.Constraints.A01(r22)
            r11.A0I(r0)
            int r0 = androidx.compose.ui.unit.Constraints.A00(r22)
            r11.A0H(r0)
            X.2d7 r0 = r11.A09
            r0.A01(r11)
            r10 = 0
            r0 = r19
            r11.A0d(r0)
            int r12 = r11.A01
            r13 = 0
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r11.A0e(r12, r13, r14, r15, r16, r17, r18)
            java.util.ArrayList r0 = r11.A00
            java.util.Iterator r9 = r0.iterator()
        L_0x0439:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0491
            java.lang.Object r8 = r9.next()
            X.2d3 r8 = (X.2d3) r8
            java.lang.Object r5 = r8.A0m
            boolean r0 = r5 instanceof X.C268074ci
            if (r0 == 0) goto L_0x0439
            r0 = r21
            java.lang.Object r6 = r0.get(r5)
            X.4cY r6 = (X.C267974cY) r6
            if (r6 != 0) goto L_0x0484
            r1 = r10
            r6 = r10
        L_0x0457:
            int r7 = r8.A07()
            if (r1 == 0) goto L_0x046f
            int r0 = r1.intValue()
            if (r7 != r0) goto L_0x046f
            int r1 = r8.A06()
            if (r6 == 0) goto L_0x046f
            int r0 = r6.intValue()
            if (r1 == r0) goto L_0x0439
        L_0x046f:
            r6 = r5
            X.4ci r6 = (X.C268074ci) r6
            int r0 = r8.A06()
            long r0 = X.C288985co.A02(r7, r0)
            X.4cY r1 = r6.Cnz(r0)
            r0 = r21
            r0.put(r5, r1)
            goto L_0x0439
        L_0x0484:
            int r0 = r6.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r6.A00
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            goto L_0x0457
        L_0x0491:
            int r1 = r11.A07()
            int r0 = r11.A06()
            long r7 = X.C289155d7.A00(r1, r0)
            r0 = r24
            X.5Oz r0 = r0.A00
            r0.getValue()
            r0 = 32
            long r0 = r7 >> r0
            int r6 = (int) r0
            int r5 = X.C289005cr.A00(r7)
            r0 = 10
            X.TYA r1 = new X.TYA
            r1.<init>((int) r0, (java.lang.Object) r4, (java.lang.Object) r2)
            X.0sm r0 = X.0Yt.A0E()
            X.5d6 r0 = r3.Cfi(r0, r1, r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11602Sd2.Cnx(X.4cb, java.util.List, long):X.5d6");
    }

    public final int CmW(C268014cc r2, List list, int i) {
        return C52407GRi.A00(r2, this, list, i);
    }

    public final int CmZ(C268014cc r2, List list, int i) {
        return C52407GRi.A01(r2, this, list, i);
    }

    public final int CoP(C268014cc r2, List list, int i) {
        return C52407GRi.A02(r2, this, list, i);
    }

    public final int CoS(C268014cc r2, List list, int i) {
        return C52407GRi.A03(r2, this, list, i);
    }
}
