package X;

/* renamed from: X.ViE  reason: case insensitive filesystem */
public final class C17923ViE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C307786Rm A03;
    public final /* synthetic */ C276544tV A04;
    public final /* synthetic */ C276544tV A05;
    public final /* synthetic */ C276544tV A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public C17923ViE(C307786Rm r1, C276544tV r2, C276544tV r3, C276544tV r4, int i, int i2, int i3, boolean z, boolean z2) {
        this.A07 = z;
        this.A03 = r1;
        this.A06 = r2;
        this.A02 = i;
        this.A08 = z2;
        this.A05 = r3;
        this.A04 = r4;
        this.A01 = i2;
        this.A00 = i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:158:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x04be  */
    /* JADX WARNING: Removed duplicated region for block: B:273:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.text.Layout r39, android.text.Spannable r40, X.VXV r41, int r42, int r43) {
        /*
            r38 = this;
            r15 = 1
            r5 = r40
            X.0qQ.A0B(r5, r15)
            r1 = r38
            boolean r0 = r1.A07
            r3 = r41
            if (r0 == 0) goto L_0x0066
            X.6Rm r4 = r1.A03
            X.4tV r1 = r1.A06
            int r6 = r3.A01
            int r3 = r3.A00
            java.lang.String r11 = r1.A0G()
            java.lang.String r12 = r1.A0E()
            r0 = 38
            X.4tV r9 = r1.A07(r0)
            java.lang.String r13 = r1.A0F()
            r7 = 41
            X.4tV r10 = r1.A07(r7)
            r0 = 43
            java.util.List r0 = r1.A0N(r0)
            X.0qQ.A07(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x003b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r2 = r8.next()
            X.4tV r2 = (X.C276544tV) r2
            int r1 = r2.A04
            r0 = 16870(0x41e6, float:2.364E-41)
            if (r1 != r0) goto L_0x003b
            java.lang.String r1 = r2.A0K(r7)
            java.lang.String r0 = r2.A0D()
            if (r1 == 0) goto L_0x003b
            if (r0 == 0) goto L_0x003b
            r16 = 1
        L_0x005b:
            r7 = r5
            r8 = r4
            r14 = r6
            r15 = r3
            X.AnonymousClass6TV.A06(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0062:
            return
        L_0x0063:
            r16 = 0
            goto L_0x005b
        L_0x0066:
            int r4 = r1.A02
            r0 = 16870(0x41e6, float:2.364E-41)
            if (r4 == r0) goto L_0x035c
            r0 = 16871(0x41e7, float:2.3641E-41)
            if (r4 == r0) goto L_0x035c
            r0 = 16917(0x4215, float:2.3706E-41)
            if (r4 == r0) goto L_0x035c
            r0 = 16958(0x423e, float:2.3763E-41)
            if (r4 == r0) goto L_0x035c
            switch(r4) {
                case 16873: goto L_0x035c;
                case 16874: goto L_0x035c;
                case 16875: goto L_0x035c;
                case 16876: goto L_0x035c;
                default: goto L_0x007b;
            }
        L_0x007b:
            r0 = 0
        L_0x007c:
            r12 = 0
            if (r0 != 0) goto L_0x008d
            boolean r0 = r1.A08
            if (r0 != 0) goto L_0x0340
            X.6Rm r2 = r1.A03
            java.lang.String r1 = "TextNodeUtils:Span:unsupported-style"
            java.lang.String r0 = "Span style is not supported"
        L_0x0089:
            X.1Kn.A00(r2, r1, r0, r12)
            return
        L_0x008d:
            X.6Rm r6 = r1.A03
            X.4tV r9 = r1.A05
            X.4tV r8 = r1.A06
            X.4tV r0 = r1.A04
            int r2 = r3.A01
            int r3 = r3.A00
            r7 = 16870(0x41e6, float:2.364E-41)
            if (r4 == r7) goto L_0x02da
            r7 = 16871(0x41e7, float:2.3641E-41)
            if (r4 == r7) goto L_0x02ab
            r7 = 16917(0x4215, float:2.3706E-41)
            if (r4 == r7) goto L_0x01cc
            r7 = 16958(0x423e, float:2.3763E-41)
            if (r4 == r7) goto L_0x0104
            switch(r4) {
                case 16873: goto L_0x0313;
                case 16874: goto L_0x00eb;
                case 16875: goto L_0x00ce;
                case 16876: goto L_0x00b5;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.IllegalArgumentException r0 = X.DbZ.A0Z(r0)
            throw r0
        L_0x00b5:
            r7 = 35
            r6 = 0
            boolean r0 = r0.A0R(r7, r6)
            if (r0 == 0) goto L_0x00c8
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
        L_0x00c3:
            r5.setSpan(r0, r2, r3, r6)
            goto L_0x0340
        L_0x00c8:
            X.U27 r0 = new X.U27
            r0.<init>()
            goto L_0x00c3
        L_0x00ce:
            r7 = 35
            X.4tV r0 = r0.A07(r7)
            if (r0 == 0) goto L_0x0340
            r7 = 0
            int r6 = X.AnonymousClass6TP.A00(r6, r0, r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            if (r0 == 0) goto L_0x0340
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r6)
            r5.setSpan(r0, r2, r3, r7)
            goto L_0x0340
        L_0x00eb:
            r7 = 35
            r6 = 0
            boolean r0 = r0.A0R(r7, r6)
            if (r0 == 0) goto L_0x00fe
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
        L_0x00f9:
            r5.setSpan(r0, r2, r3, r6)
            goto L_0x0340
        L_0x00fe:
            X.U26 r0 = new X.U26
            r0.<init>()
            goto L_0x00f9
        L_0x0104:
            r7 = 0
            java.lang.String r8 = r0.A0D()
            java.lang.String r9 = "none"
            if (r8 != 0) goto L_0x010e
            r8 = r9
        L_0x010e:
            r10 = 36
            X.4tV r11 = r0.A07(r10)
            java.lang.String r14 = r0.A0I()
            boolean r13 = r8.equals(r9)
            r10 = 0
            java.lang.String r17 = "center"
            java.lang.String r16 = "0px"
            if (r13 != 0) goto L_0x01ca
            if (r11 == 0) goto L_0x01ca
            if (r14 == 0) goto L_0x01ca
            int r25 = X.AnonymousClass6TP.A00(r6, r11, r7)
            float r22 = X.AnonymousClass6Su.A01(r14)
            java.lang.String r11 = r0.A0E()
            if (r11 != 0) goto L_0x0137
            r11 = r16
        L_0x0137:
            float r23 = X.AnonymousClass6Su.A01(r11)
            java.lang.String r11 = r0.A0J()
            if (r11 != 0) goto L_0x0143
            r11 = r16
        L_0x0143:
            float r24 = X.AnonymousClass6Su.A01(r11)
            java.lang.String r20 = r0.A0H()
            if (r20 != 0) goto L_0x014f
            r20 = r17
        L_0x014f:
            java.lang.String r21 = r0.A0G()
            if (r21 != 0) goto L_0x0157
            r21 = r17
        L_0x0157:
            X.Vaz r11 = new X.Vaz
            r18 = r11
            r19 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
        L_0x0160:
            r8 = 44
            java.lang.String r8 = r0.A0K(r8)
            if (r8 != 0) goto L_0x0169
            r8 = r9
        L_0x0169:
            r13 = 45
            X.4tV r13 = r0.A07(r13)
            r14 = 49
            java.lang.String r14 = r0.A0K(r14)
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto L_0x01c0
            if (r13 == 0) goto L_0x01c0
            if (r14 == 0) goto L_0x01c0
            int r23 = X.AnonymousClass6TP.A00(r6, r13, r7)
            float r20 = X.AnonymousClass6Su.A01(r14)
            r6 = 48
            java.lang.String r6 = r0.A0K(r6)
            if (r6 != 0) goto L_0x0191
            r6 = r16
        L_0x0191:
            float r21 = X.AnonymousClass6Su.A01(r6)
            r6 = 51
            java.lang.String r6 = r0.A0K(r6)
            if (r6 == 0) goto L_0x019f
            r16 = r6
        L_0x019f:
            float r22 = X.AnonymousClass6Su.A01(r16)
            r6 = 46
            java.lang.String r18 = r0.A0K(r6)
            if (r18 != 0) goto L_0x01ad
            r18 = r17
        L_0x01ad:
            r6 = 50
            java.lang.String r19 = r0.A0K(r6)
            if (r19 != 0) goto L_0x01b7
            r19 = r17
        L_0x01b7:
            X.Vaz r10 = new X.Vaz
            r16 = r10
            r17 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
        L_0x01c0:
            X.WK7 r0 = new X.WK7
            r0.<init>(r11, r10)
            r5.setSpan(r0, r2, r3, r7)
            goto L_0x0340
        L_0x01ca:
            r11 = r12
            goto L_0x0160
        L_0x01cc:
            r6 = 36
            r7 = 0
            float r6 = r0.A02(r6, r7)
            java.lang.String r9 = r0.A0E()
            java.lang.String r10 = "AllTextShown"
            if (r9 != 0) goto L_0x01dc
            r9 = r10
        L_0x01dc:
            int r8 = r9.hashCode()
            r0 = -726803703(0xffffffffd4addb09, float:-5.9736331E12)
            if (r8 == r0) goto L_0x026f
            r0 = 2702122(0x293b2a, float:3.78648E-39)
            if (r8 == r0) goto L_0x020e
            r0 = 209568611(0xc7dc363, float:1.9549208E-31)
            if (r8 != r0) goto L_0x0340
            boolean r0 = r9.equals(r10)
            if (r0 == 0) goto L_0x0340
            float r6 = java.lang.Math.max(r6, r7)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r6 = java.lang.Math.min(r6, r0)
            r0 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r6
            int r0 = (int) r0
            X.U28 r6 = new X.U28
            r6.<init>(r0)
            r0 = 0
            r5.setSpan(r6, r2, r3, r0)
            goto L_0x0340
        L_0x020e:
            java.lang.String r0 = "Word"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0340
            float r0 = java.lang.Math.max(r6, r7)
            r11 = 1065353216(0x3f800000, float:1.0)
            float r14 = java.lang.Math.min(r0, r11)
            java.lang.CharSequence r6 = r5.subSequence(r2, r3)
            java.lang.String r3 = "\\s+"
            X.11S r0 = new X.11S
            r0.<init>(r3)
            r13 = 0
            java.util.List r10 = r0.A03(r6)
            int r0 = r10.size()
            float r0 = (float) r0
            float r11 = r11 / r0
            int r9 = r10.size()
            r8 = 0
            r3 = 0
        L_0x023c:
            if (r8 >= r9) goto L_0x0340
            java.lang.String r0 = X.AnonymousClass7TE.A19(r10, r8)
            int r7 = r0.length()
            int r6 = r3 + 1
            if (r3 != 0) goto L_0x024b
            r6 = r2
        L_0x024b:
            int r7 = r7 + r6
            int r8 = r8 + 1
            float r3 = (float) r8
            float r3 = r3 * r11
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0261
            r3 = 1132396544(0x437f0000, float:255.0)
        L_0x0256:
            int r3 = (int) r3
            X.U28 r0 = new X.U28
            r0.<init>(r3)
            r5.setSpan(r0, r6, r7, r13)
            r3 = r7
            goto L_0x023c
        L_0x0261:
            float r3 = r3 - r11
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x026d
            float r3 = r14 % r11
            r0 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r0
            float r3 = r3 / r11
            goto L_0x0256
        L_0x026d:
            r3 = 0
            goto L_0x0256
        L_0x026f:
            java.lang.String r0 = "Character"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0340
            float r0 = java.lang.Math.max(r6, r7)
            r9 = 1065353216(0x3f800000, float:1.0)
            float r10 = java.lang.Math.min(r0, r9)
            int r0 = r3 - r2
            float r0 = (float) r0
            float r9 = r9 / r0
        L_0x0285:
            if (r2 >= r3) goto L_0x0340
            int r8 = r2 + 1
            float r6 = (float) r8
            float r6 = r6 * r9
            r7 = 0
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x029d
            r6 = 1132396544(0x437f0000, float:255.0)
        L_0x0292:
            int r6 = (int) r6
            X.U28 r0 = new X.U28
            r0.<init>(r6)
            r5.setSpan(r0, r2, r8, r7)
            r2 = r8
            goto L_0x0285
        L_0x029d:
            float r6 = r6 - r9
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x02a9
            float r6 = r10 % r9
            r0 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 * r0
            float r6 = r6 / r9
            goto L_0x0292
        L_0x02a9:
            r6 = 0
            goto L_0x0292
        L_0x02ab:
            r7 = 40
            r13 = 0
            float r10 = r0.A02(r7, r13)
            r7 = 36
            float r9 = r0.A02(r7, r13)
            r7 = 38
            float r8 = r0.A02(r7, r13)
            r7 = 35
            X.4tV r11 = r0.A07(r7)
            r7 = 0
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0340
            if (r11 == 0) goto L_0x02d8
            int r6 = X.AnonymousClass6TP.A00(r6, r11, r7)
        L_0x02cf:
            X.U2B r0 = new X.U2B
            r0.<init>(r10, r9, r8, r6)
            r5.setSpan(r0, r2, r3, r7)
            goto L_0x0340
        L_0x02d8:
            r6 = 0
            goto L_0x02cf
        L_0x02da:
            java.lang.String r7 = r0.A0I()
            X.AnonymousClass6TV.A04(r5, r6, r7, r2, r3)
            java.lang.String r8 = r0.A0G()
            java.lang.String r7 = r0.A0D()
            r9 = r2
            r10 = r3
            X.AnonymousClass6TV.A05(r5, r6, r7, r8, r9, r10)
            r7 = 44
            r6 = 1
            float r7 = r0.A02(r7, r6)
            int r0 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0340
            X.1Kj r0 = X.C64361Kj.A00()
            android.content.Context r0 = r0.A00
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.scaledDensity
            X.TyH r6 = new X.TyH
            r6.<init>(r7, r0)
            r0 = 0
            r5.setSpan(r6, r2, r3, r0)
            goto L_0x0340
        L_0x0313:
            int r10 = r8.A04
            r7 = 16880(0x41f0, float:2.3654E-41)
            if (r10 == r7) goto L_0x0357
            r7 = 16887(0x41f7, float:2.3664E-41)
            if (r10 == r7) goto L_0x0357
            r7 = 16898(0x4202, float:2.3679E-41)
            if (r10 == r7) goto L_0x0350
            r21 = 0
        L_0x0323:
            java.lang.String r22 = r0.A0D()
            X.4uI r20 = r0.A08()
            r7 = 0
            if (r20 == 0) goto L_0x0340
            X.6TX r0 = new X.6TX
            r16 = r0
            r17 = r6
            r18 = r9
            r19 = r8
            r23 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r5.setSpan(r0, r2, r3, r7)
        L_0x0340:
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0062
            r2 = r39
            if (r39 != 0) goto L_0x035f
            X.6Rm r2 = r1.A03
            java.lang.String r1 = "TextNodeUtils:Span:null-layout"
            java.lang.String r0 = "Trying to apply layoutAffectingStyle with null layout!"
            goto L_0x0089
        L_0x0350:
            r7 = 44
            java.lang.String r21 = r8.A0K(r7)
            goto L_0x0323
        L_0x0357:
            java.lang.String r21 = r8.A0D()
            goto L_0x0323
        L_0x035c:
            r0 = 1
            goto L_0x007c
        L_0x035f:
            X.6Rm r10 = r1.A03
            X.4tV r9 = r1.A05
            X.4tV r8 = r1.A04
            int r0 = r1.A01
            int r1 = r1.A00
            r3 = 16891(0x41fb, float:2.367E-41)
            if (r4 == r3) goto L_0x03d8
            r3 = 16917(0x4215, float:2.3706E-41)
            if (r4 != r3) goto L_0x0520
            r3 = 36
            r7 = 0
            float r6 = r8.A02(r3, r7)
            java.lang.String r4 = r8.A0E()
            java.lang.String r3 = "Line"
            boolean r3 = X.0qQ.A0K(r4, r3)
            if (r3 == 0) goto L_0x0062
            float r3 = java.lang.Math.max(r6, r7)
            r13 = 1065353216(0x3f800000, float:1.0)
            float r15 = java.lang.Math.min(r3, r13)
            int r12 = r2.getLineForOffset(r0)
            int r11 = r2.getLineForOffset(r1)
            int r3 = r11 - r12
            int r3 = r3 + 1
            float r3 = (float) r3
            float r13 = r13 / r3
            if (r12 > r11) goto L_0x0062
            r10 = r12
        L_0x039f:
            int r9 = r2.getLineStart(r10)
            int r8 = r2.getLineEnd(r10)
            if (r10 != r12) goto L_0x03ad
            int r9 = java.lang.Math.max(r9, r0)
        L_0x03ad:
            if (r10 != r11) goto L_0x03b3
            int r8 = java.lang.Math.min(r8, r1)
        L_0x03b3:
            int r7 = r10 + 1
            float r14 = (float) r7
            float r14 = r14 * r13
            r6 = 0
            r4 = 255(0xff, float:3.57E-43)
            int r3 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r3 >= 0) goto L_0x03ca
            float r14 = r14 - r13
            int r3 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x03d6
            float r4 = r15 % r13
            r3 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 * r3
            float r4 = r4 / r13
            int r4 = (int) r4
        L_0x03ca:
            X.U28 r3 = new X.U28
            r3.<init>(r4)
            r5.setSpan(r3, r9, r8, r6)
            if (r10 == r11) goto L_0x0062
            r10 = r7
            goto L_0x039f
        L_0x03d6:
            r4 = 0
            goto L_0x03ca
        L_0x03d8:
            r7 = 0
            java.lang.String r3 = r8.A0F()
            if (r3 != 0) goto L_0x03e1
            java.lang.String r3 = "1.sp"
        L_0x03e1:
            java.lang.String r6 = r8.A0D()
            if (r6 != 0) goto L_0x03e9
            java.lang.String r6 = "100.sp"
        L_0x03e9:
            int r4 = X.C18772W0u.A01(r10, r3, r15)
            r3 = 100
            int r3 = X.C18772W0u.A01(r10, r6, r3)
            if (r4 <= r3) goto L_0x03fd
            java.lang.String r6 = "ResizeToFitSpanStyle"
            java.lang.String r3 = "Min text size cannot be larger than max text size."
            X.1Kn.A02(r6, r3)
            r3 = r4
        L_0x03fd:
            android.text.TextPaint r11 = r2.getPaint()
            android.text.TextPaint r19 = new android.text.TextPaint
            r6 = r19
            r6.<init>(r11)
            r6 = 40
            int r23 = r9.A03(r6, r7)
            java.lang.String r9 = r8.A0K(r6)
            if (r9 != 0) goto L_0x0416
            java.lang.String r9 = "uniform"
        L_0x0416:
            android.text.SpannableString r6 = new android.text.SpannableString
            r6.<init>(r5)
            java.lang.String r8 = "scaled"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x0529
            android.graphics.RectF r18 = new android.graphics.RectF
            r18.<init>()
            int r9 = android.view.View.MeasureSpec.getMode(r42)
            int r8 = android.view.View.MeasureSpec.getMode(r43)
            r17 = 1
            boolean r35 = X.AnonymousClass7TF.A1Q(r9)
            boolean r36 = X.AnonymousClass7TF.A1Q(r8)
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r35 == 0) goto L_0x048d
            r8 = 2147483647(0x7fffffff, float:NaN)
        L_0x0442:
            if (r36 != 0) goto L_0x0448
            int r11 = android.view.View.MeasureSpec.getSize(r43)
        L_0x0448:
            float r9 = (float) r8
            r8 = r18
            X.C13990Tnq.A0q(r8, r9, r11)
            java.lang.Class<android.text.style.AbsoluteSizeSpan> r8 = android.text.style.AbsoluteSizeSpan.class
            java.lang.Object[] r8 = r6.getSpans(r0, r1, r8)
            X.0sC r16 = X.0pe.A00(r8)
            r14 = 2147483647(0x7fffffff, float:NaN)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 2147483647(0x7fffffff, float:NaN)
        L_0x0462:
            boolean r8 = r16.hasNext()
            if (r8 == 0) goto L_0x0492
            java.lang.Object r9 = r16.next()
            android.text.style.AbsoluteSizeSpan r9 = (android.text.style.AbsoluteSizeSpan) r9
            int r8 = r9.getSize()
            boolean r9 = r9.getDip()
            if (r9 == 0) goto L_0x0484
            float r9 = (float) r8
            android.content.Context r8 = r10.A00
            android.util.DisplayMetrics r8 = X.AnonymousClass7TF.A0E(r8)
            float r8 = android.util.TypedValue.applyDimension(r15, r9, r8)
            int r8 = (int) r8
        L_0x0484:
            int r12 = java.lang.Math.max(r12, r8)
            int r11 = java.lang.Math.min(r11, r8)
            goto L_0x0462
        L_0x048d:
            int r8 = android.view.View.MeasureSpec.getSize(r42)
            goto L_0x0442
        L_0x0492:
            if (r12 != r13) goto L_0x0506
            if (r11 != r14) goto L_0x0506
        L_0x0496:
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r10 = java.lang.Float.valueOf(r8)
            float r8 = (float) r12
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            X.59G r9 = new X.59G
            r9.<init>(r10, r10, r8)
        L_0x04a7:
            if (r23 <= 0) goto L_0x04ab
            r17 = 0
        L_0x04ab:
            if (r35 == 0) goto L_0x04cb
            if (r36 == 0) goto L_0x04cb
            if (r17 == 0) goto L_0x04cb
            java.lang.Object r11 = r9.A01
        L_0x04b3:
            float r9 = X.AnonymousClass7TE.A04(r11)
        L_0x04b7:
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x0529
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0062
            android.text.style.RelativeSizeSpan r2 = new android.text.style.RelativeSizeSpan
            r2.<init>(r9)
            goto L_0x0562
        L_0x04cb:
            java.lang.Object r11 = r9.A00
            r10 = r11
            java.lang.Number r10 = (java.lang.Number) r10
            float r13 = r10.floatValue()
            java.lang.Object r8 = r9.A01
            java.lang.Number r8 = (java.lang.Number) r8
            float r12 = r8.floatValue()
            int r12 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r12 >= 0) goto L_0x04b3
            float r28 = r10.floatValue()
            float r29 = r8.floatValue()
            java.lang.Object r8 = r9.A02
            float r30 = X.AnonymousClass7TE.A04(r8)
            r31 = 1036831949(0x3dcccccd, float:0.1)
            r33 = r0
            r34 = r1
            r37 = r15
            r24 = r18
            r25 = r2
            r26 = r6
            r27 = r19
            r32 = r23
            float r9 = X.C18772W0u.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x04b7
        L_0x0506:
            if (r12 == r11) goto L_0x0496
            float r8 = (float) r4
            float r9 = (float) r11
            float r8 = r8 / r9
            float r9 = (float) r3
            float r10 = (float) r12
            float r9 = r9 / r10
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            java.lang.Float r11 = java.lang.Float.valueOf(r9)
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            X.59G r9 = new X.59G
            r9.<init>(r8, r11, r10)
            goto L_0x04a7
        L_0x0520:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.IllegalArgumentException r0 = X.DbZ.A0Z(r0)
            throw r0
        L_0x0529:
            if (r3 == r4) goto L_0x055d
            android.graphics.RectF r15 = new android.graphics.RectF
            r15.<init>()
            int r9 = android.view.View.MeasureSpec.getMode(r42)
            int r8 = android.view.View.MeasureSpec.getMode(r43)
            r10 = 1
            boolean r26 = X.AnonymousClass7TF.A1Q(r9)
            boolean r27 = X.AnonymousClass7TF.A1Q(r8)
            r9 = 2147483647(0x7fffffff, float:NaN)
            if (r26 == 0) goto L_0x0582
            r8 = 2147483647(0x7fffffff, float:NaN)
        L_0x0549:
            if (r27 != 0) goto L_0x054f
            int r9 = android.view.View.MeasureSpec.getSize(r43)
        L_0x054f:
            float r8 = (float) r8
            X.C13990Tnq.A0q(r15, r8, r9)
            if (r23 <= 0) goto L_0x0556
            r10 = 0
        L_0x0556:
            if (r26 == 0) goto L_0x0566
            if (r27 == 0) goto L_0x0566
            if (r10 == 0) goto L_0x0566
            r4 = r3
        L_0x055d:
            android.text.style.AbsoluteSizeSpan r2 = new android.text.style.AbsoluteSizeSpan
            r2.<init>(r4)
        L_0x0562:
            r5.setSpan(r2, r0, r1, r7)
            return
        L_0x0566:
            float r4 = (float) r4
            float r3 = (float) r3
            r22 = 1065353216(0x3f800000, float:1.0)
            r20 = r3
            r21 = r3
            r24 = r0
            r25 = r1
            r28 = r7
            r16 = r2
            r17 = r6
            r18 = r19
            r19 = r4
            float r2 = X.C18772W0u.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            int r4 = (int) r2
            goto L_0x055d
        L_0x0582:
            int r8 = android.view.View.MeasureSpec.getSize(r42)
            goto L_0x0549
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17923ViE.A00(android.text.Layout, android.text.Spannable, X.VXV, int, int):void");
    }
}
