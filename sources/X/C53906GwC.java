package X;

/* renamed from: X.GwC  reason: case insensitive filesystem */
public final class C53906GwC extends C251343mx {
    public final HIE A00;
    public final HMY A01;
    public final 0sP A02;
    public final 0sL A03;
    public final long A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C53906GwC(HIE hie, HMY hmy, 0sP r4, 0sL r5, long j, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TF.A1F(hmy, 5, r4);
        this.A00 = hie;
        this.A05 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A01 = hmy;
        this.A04 = j;
        this.A03 = r5;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r8 == X.AnonymousClass05K.A0C) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r36) {
        /*
            r35 = this;
            r0 = 0
            r13 = r36
            X.0qQ.A0B(r13, r0)
            r1 = r35
            X.HIE r2 = r1.A00
            r34 = r2
            X.HtY r5 = r2.A03
            r6 = 0
            if (r5 == 0) goto L_0x0205
            java.lang.String r2 = r5.A0A
            r15 = r2
            java.lang.String r2 = r5.A04
            r28 = r2
        L_0x0018:
            r2 = r34
            X.JMR r2 = r2.A00
            r27 = r2
            boolean r3 = r2 instanceof X.C57568Icv
            if (r5 == 0) goto L_0x0202
            java.lang.Integer r7 = r5.A02
        L_0x0024:
            java.lang.Integer r19 = X.AnonymousClass05K.A01
            r2 = 1
            r4 = r19
            if (r7 == r4) goto L_0x0034
            if (r5 == 0) goto L_0x01ff
            java.lang.Integer r8 = r5.A02
        L_0x002f:
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            r7 = 0
            if (r8 != r4) goto L_0x0035
        L_0x0034:
            r7 = 1
        L_0x0035:
            X.HNN r21 = X.HNN.A0X
            java.lang.String r22 = "meta_ai_edit_option_more_button"
            r23 = 2131966326(0x7f133976, float:1.9569487E38)
            X.HHX r20 = new X.HHX
            r24 = r0
            r25 = r3
            r26 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26)
            X.HoM[] r4 = new X.C55839HoM[]{r20}
            java.util.ArrayList r10 = X.0sr.A1M(r4)
            boolean r4 = r1.A06
            if (r4 == 0) goto L_0x006a
            if (r7 == 0) goto L_0x006a
            X.HNN r21 = X.HNN.A0U
            r23 = 2131966324(0x7f133974, float:1.9569483E38)
            X.HHW r4 = new X.HHW
            r20 = r4
            r22 = r6
            r24 = r2
            r26 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r10.add(r0, r4)
        L_0x006a:
            boolean r4 = r1.A05
            if (r4 == 0) goto L_0x0085
            if (r7 == 0) goto L_0x0085
            X.HNN r21 = X.HNN.A0B
            r23 = 2131966313(0x7f133969, float:1.956946E38)
            X.HHV r4 = new X.HHV
            r20 = r4
            r22 = r6
            r24 = r2
            r26 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r10.add(r0, r4)
        L_0x0085:
            boolean r4 = r1.A07
            r14 = 3
            r11 = 2
            if (r4 == 0) goto L_0x00a7
            if (r7 == 0) goto L_0x00a7
            X.HHY r8 = new X.HHY
            r8.<init>(r3)
            X.HHa r7 = new X.HHa
            r7.<init>(r3)
            X.HHZ r4 = new X.HHZ
            r4.<init>(r3)
            X.HoM[] r3 = new X.C55839HoM[]{r8, r7, r4}
            java.util.List r3 = X.0sr.A1P(r3)
            r10.addAll(r0, r3)
        L_0x00a7:
            java.lang.String r18 = "edit-buttons-appear-disappear"
            X.3Zd r4 = X.2Vi.A04
            r3 = r18
            X.4Ey r8 = X.C51973G9u.A0a(r4, r3)
            r7 = 150(0x96, float:2.1E-43)
            android.view.animation.LinearInterpolator r4 = new android.view.animation.LinearInterpolator
            r4.<init>()
            X.4Ex r3 = new X.4Ex
            r3.<init>(r4, r7)
            r8.A02 = r3
            X.AnonymousClass4F7.A00(r13, r8)
            X.HMY r9 = r1.A01
            java.lang.Object[] r4 = new java.lang.Object[]{r9}
            r17 = 4
            r3 = r17
            X.Ivx r3 = X.C58688Ivx.A00(r13, r1, r3)
            java.lang.Object r4 = X.AnonymousClass3Zw.A00(r13, r3, r4)
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 == 0) goto L_0x01fc
            X.3XV r3 = X.2WX.A02
            int r3 = r4.intValue()
            long r3 = X.C51969G9p.A0G(r3)
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
            X.2WX r8 = X.AnonymousClass9JR.A00(r6, r7, r0, r3)
        L_0x00e8:
            X.3XV r3 = X.2WX.A02
            r3 = 4620693217682128896(0x4020000000000000, double:8.0)
            X.2WX r3 = X.C51973G9u.A0P(r6, r3)
            X.2WX r3 = r3.A00(r6)
            X.2WX r16 = r3.A00(r8)
            X.2Wb r7 = X.C51972G9s.A0Q(r13)
            if (r5 == 0) goto L_0x01f8
            java.lang.Integer r3 = r5.A02
        L_0x0100:
            int r3 = r3.intValue()
            r12 = 1120403456(0x42c80000, float:100.0)
            if (r3 == r2) goto L_0x0194
            if (r3 == r11) goto L_0x0194
            if (r3 != r14) goto L_0x013a
            X.2Wb r3 = X.G9t.A0w(r7)
            long r4 = r1.A04
            X.2Tl r20 = r1.A00(r3)
            float r11 = r9.A00
            java.lang.Integer r9 = X.AnonymousClass05K.A0Y
            X.9JQ r11 = X.C51965G9l.A0b(r9, r11, r2)
            r9 = r19
            X.2WX r21 = X.C51973G9u.A0S(r6, r11, r9, r12, r0)
            X.IwN r24 = X.C58714IwN.A01(r1, r2)
            X.J5P r25 = X.J5P.A00
            X.Guj r9 = new X.Guj
            r22 = r15
            r23 = r28
            r26 = r4
            r19 = r9
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            X.C51971G9r.A1C(r9, r3, r7, r8)
        L_0x013a:
            r3 = r34
            X.HQ0 r3 = r3.A01
            boolean r3 = r3 instanceof X.C54520HHg
            if (r3 == 0) goto L_0x018d
            long r3 = X.C51970G9q.A0I()
            java.lang.Integer r5 = X.AnonymousClass05K.A15
            X.2WX r6 = X.AnonymousClass9JR.A00(r6, r5, r0, r3)
            X.2V1 r5 = r7.A00
            X.3Zd r4 = X.C243533Zd.LOCAL
            r3 = r18
            X.2WX r6 = X.C51971G9r.A0V(r5, r6, r4, r3)
            X.2Wb r5 = X.AnonymousClass7TG.A0S(r5)
            X.2V1 r8 = r5.A00
            X.Gxj r3 = new X.Gxj
            r3.<init>()
            X.GrT r4 = new X.GrT
            r4.<init>(r8, r3)
            X.0sL r3 = r1.A03
            X.Gvr r1 = new X.Gvr
            r1.<init>(r10, r3)
            X.Gxj r3 = r4.A01
            X.3mp r1 = r1.A0E()
            r3.A01 = r1
            java.util.BitSet r1 = r4.A02
            r1.set(r0)
            r3.A04 = r0
            r3.A02 = r2
            r3.A03 = r0
            r3.A00 = r0
            java.lang.String[] r0 = r4.A03
            X.C244113af.A00(r1, r0, r2)
            r4.A02()
            X.C51971G9r.A1D(r3, r5, r7, r6)
        L_0x018d:
            r0 = r16
            X.2Tl r0 = X.C243563Zg.A05(r7, r13, r0)
            return r0
        L_0x0194:
            if (r15 == 0) goto L_0x01f6
            X.2he r11 = X.AnonymousClass6QK.A01(r15)
        L_0x019a:
            X.2Wb r5 = X.G9t.A0w(r7)
            long r3 = r1.A04
            r32 = r3
            X.Icu r4 = X.C57567Icu.A00
            r3 = r27
            boolean r3 = X.0qQ.A0K(r3, r4)
            if (r3 == 0) goto L_0x01f3
            X.Id3 r3 = X.C57576Id3.A00
        L_0x01ae:
            X.JMT r3 = (X.JMT) r3
            r14 = 7
            X.Iwl r15 = new X.Iwl
            r4 = r28
            r15.<init>(r4, r1, r14)
            X.IHp r14 = new X.IHp
            r14.<init>(r15)
            X.2Tl r21 = r1.A00(r5)
            float r9 = r9.A00
            java.lang.Integer r4 = X.AnonymousClass05K.A0Y
            X.9JQ r9 = X.C51965G9l.A0b(r4, r9, r2)
            r4 = r19
            X.2WX r22 = X.C51973G9u.A0S(r6, r9, r4, r12, r0)
            X.IwN r28 = X.C58714IwN.A01(r1, r0)
            r4 = r17
            X.J6n r29 = X.C59105J6n.A02(r11, r4)
            X.5tc r4 = new X.5tc
            r23 = r3
            r24 = r14
            r25 = r6
            r26 = r6
            r27 = r6
            r30 = r32
            r19 = r4
            r20 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.C51971G9r.A1C(r4, r5, r7, r8)
            goto L_0x013a
        L_0x01f3:
            X.Id4 r3 = X.C57577Id4.A00
            goto L_0x01ae
        L_0x01f6:
            r11 = 0
            goto L_0x019a
        L_0x01f8:
            r3 = r19
            goto L_0x0100
        L_0x01fc:
            r8 = r6
            goto L_0x00e8
        L_0x01ff:
            r8 = r6
            goto L_0x002f
        L_0x0202:
            r7 = r6
            goto L_0x0024
        L_0x0205:
            r15 = r6
            r28 = r6
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53906GwC.A0X(X.3Y5):X.3mp");
    }

    private final 2Tl A00(C70832Wc r33) {
        C70832Wc r30 = r33;
        long A022 = I61.A02(r30, AnonymousClass05K.A0Z);
        AnonymousClass3XV r0 = 2WX.A02;
        Integer num = AnonymousClass05K.A00;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0b(num, 100.0f, 0));
        Integer num2 = AnonymousClass05K.A01;
        2WX A0X2 = C51971G9r.A0X(A0X, num2, 100.0f, 0);
        C244413b9 r11 = C244413b9.ABSOLUTE;
        Integer num3 = AnonymousClass05K.A0Y;
        2WX A0Y = C51971G9r.A0Y(A0X2, num3, r11, 3);
        2Wb A0M = C51973G9u.A0M(r30);
        HIE hie = this.A00;
        if (hie.A07 && (hie.A01 instanceof C54520HHg) && (hie.A00 instanceof C57568Icv)) {
            2WX A0Y2 = C51971G9r.A0Y((2WX) null, num3, r11, 3);
            long A0I = C51970G9q.A0I();
            2WX A002 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(A0Y2, AnonymousClass05K.A0C, 1, A0I), AnonymousClass05K.A0N, 1, A0I);
            2Wb A0w = G9t.A0w(A0M);
            HNN hnn = HNN.A0Y;
            HNO hno = HNO.A0s;
            HNO hno2 = HNO.A0r;
            2WX A003 = AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num2, 0, A022), num, 0, A022);
            long doubleToRawLongBits = Double.doubleToRawLongBits(36.0d);
            C51971G9r.A1C(new C53860GvR(A003, AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num2, 0, doubleToRawLongBits), num, 0, doubleToRawLongBits), hnn, hno, hno2, (String) null, (String) null, C58677Ivm.A00(this, 48), 736, 0, false), A0w, A0M, A002);
        }
        if (hie.A06 && (hie.A01 instanceof C54520HHg) && (hie.A00 instanceof C57568Icv)) {
            2WX A0Y3 = C51971G9r.A0Y((2WX) null, num3, r11, 3);
            long A0I2 = C51970G9q.A0I();
            2WX A004 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(A0Y3, AnonymousClass05K.A0N, 1, A0I2), num3, 1, A0I2);
            2Wb A0w2 = G9t.A0w(A0M);
            HNN hnn2 = HNN.A0T;
            2WX A005 = AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num2, 0, A022), num, 0, A022);
            HNO hno3 = HNO.A0s;
            HNO hno4 = HNO.A0r;
            long doubleToRawLongBits2 = Double.doubleToRawLongBits(36.0d);
            C51971G9r.A1C(new C53860GvR(A005, AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num2, 0, doubleToRawLongBits2), num, 0, doubleToRawLongBits2), hnn2, hno3, hno4, (String) null, (String) null, C58677Ivm.A00(this, 49), 736, 0, false), A0w2, A0M, A004);
        }
        return C243563Zg.A03(A0M, r30, A0Y);
    }
}
