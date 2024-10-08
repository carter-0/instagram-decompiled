package X;

import java.util.List;

/* renamed from: X.GNs  reason: case insensitive filesystem */
public final class C52325GNs extends C251343mx {
    public static final List A06 = 0sr.A1P(new List[]{0sr.A1P(new GOD[]{new GOD(5.497787143782138d, false), new GOD(4.71238898038469d, true), new GOD(3.9269908169872414d, true)}), 0sr.A1P(new GOD[]{new GOD(0.0d, false), new GOD(1.5707963267948966d, false), new GOD(3.141592653589793d, true)})});
    public final C52058GDe A00;
    public final C52038GCk A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x03a1 A[LOOP:1: B:53:0x039b->B:55:0x03a1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x03b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r41) {
        /*
            r40 = this;
            r8 = 0
            r9 = r41
            X.0qQ.A0B(r9, r8)
            r12 = r40
            X.GDe r3 = r12.A00
            boolean r1 = r3.A0Q
            int r0 = r3.A07
            r7 = 0
            if (r1 == 0) goto L_0x03c5
            boolean r4 = r12.A05
            X.HN1 r37 = X.I5H.A01(r3, r0, r4)
            X.2V1 r0 = r9.A05
            r39 = r0
            android.content.Context r36 = X.C51965G9l.A0B(r39)
            X.0eP r0 = r3.A0L
            r38 = r0
            r1 = r36
            X.GOD r2 = X.I5H.A00(r1, r0)
            r11 = 1
            if (r4 == 0) goto L_0x0288
            X.HN1 r0 = X.HN1.A0A
        L_0x002e:
            X.HN1[] r0 = new X.HN1[]{r0}
            java.util.ArrayList r35 = X.0sr.A1M(r0)
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x0278
            X.HN1 r1 = X.HN1.A05
        L_0x003c:
            r0 = r35
            r0.add(r8, r1)
        L_0x0041:
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x004c
            X.HN1 r1 = X.HN1.A09
            r0 = r35
            r0.add(r8, r1)
        L_0x004c:
            int r0 = r35.size()
            java.util.List r34 = X.I5H.A02(r2, r0)
            java.util.ArrayList r33 = X.AnonymousClass7TG.A0r(r35)
            java.util.Iterator r32 = r35.iterator()
            r1 = 0
        L_0x005d:
            boolean r0 = r32.hasNext()
            if (r0 == 0) goto L_0x028c
            java.lang.Object r5 = r32.next()
            int r31 = r1 + 1
            if (r1 >= 0) goto L_0x0073
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0073:
            X.HN1 r5 = (X.HN1) r5
            r0 = r34
            java.lang.Object r0 = X.00k.A0O(r0, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0276
            double r0 = r0.doubleValue()
            r18 = 0
            r3 = r36
            r2 = r38
            X.0eP r1 = X.I5H.A03(r3, r2, r0, r8)
            int r0 = r5.A01
            android.graphics.drawable.Drawable r4 = X.C244013aV.A0D(r9, r0)
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            double r29 = r0.doubleValue()
            java.lang.Object r0 = r1.A01
            java.lang.Number r0 = (java.lang.Number) r0
            double r27 = r0.doubleValue()
            r0 = r37
            if (r0 != r5) goto L_0x00a9
            r18 = 1
        L_0x00a9:
            android.graphics.drawable.shapes.OvalShape r1 = new android.graphics.drawable.shapes.OvalShape
            r1.<init>()
            android.graphics.drawable.ShapeDrawable r17 = new android.graphics.drawable.ShapeDrawable
            r0 = r17
            r0.<init>(r1)
            android.graphics.Paint r3 = r17.getPaint()
            android.content.Context r2 = X.C243803a8.A00(r9)
            android.content.Context r1 = X.C243803a8.A00(r9)
            r0 = 2130970299(0x7f0406bb, float:1.7549304E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r0 = r2.getColor(r0)
            r3.setColor(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r3.setStyle(r0)
            r3.setAntiAlias(r11)
            android.content.Context r2 = X.C243803a8.A00(r9)
            android.content.Context r1 = X.C243803a8.A00(r9)
            r0 = 2130970241(0x7f040681, float:1.7549187E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r0 = r2.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r4.setColorFilter(r0)
            if (r18 == 0) goto L_0x0266
            r0 = 2131165287(0x7f070067, float:1.7944787E38)
            long r2 = X.C244013aV.A0C(r9, r0)
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            long r0 = X.C244013aV.A0C(r9, r0)
            r5 = 2131165228(0x7f07002c, float:1.7944667E38)
        L_0x0103:
            long r15 = X.C244013aV.A0C(r9, r5)
            X.3XV r5 = X.2WX.A02
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            X.9JR r5 = new X.9JR
            r5.<init>(r10, r8, r2)
            X.2WX r14 = new X.2WX
            r14.<init>(r7, r5)
            java.lang.Integer r26 = X.AnonymousClass05K.A01
            X.9JR r6 = new X.9JR
            r5 = r26
            r6.<init>(r5, r8, r2)
            X.2WX r13 = new X.2WX
            r13.<init>(r14, r6)
            X.3b9 r25 = X.C244413b9.ABSOLUTE
            java.lang.Integer r24 = X.AnonymousClass05K.A0Y
            r6 = 3
            X.9JS r5 = new X.9JS
            r3 = r24
            r2 = r25
            r5.<init>(r3, r2, r6)
            X.2WX r3 = new X.2WX
            r3.<init>(r13, r5)
            X.3Zh r14 = X.C243573Zh.CENTER
            X.9JS r2 = new X.9JS
            r2.<init>(r10, r14, r6)
            X.2WX r13 = new X.2WX
            r13.<init>(r3, r2)
            java.lang.Integer r23 = X.AnonymousClass05K.A0C
            X.9JR r3 = new X.9JR
            r2 = r23
            r3.<init>(r2, r11, r0)
            X.2WX r5 = new X.2WX
            r5.<init>(r13, r3)
            java.lang.Integer r22 = X.AnonymousClass05K.A0j
            X.9JR r3 = new X.9JR
            r2 = r22
            r0 = r15
            r3.<init>(r2, r11, r0)
            X.2WX r1 = new X.2WX
            r1.<init>(r5, r3)
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_CENTER
            X.2V1 r21 = r9.Aqq()
            X.3gG r0 = X.C247373gE.A00(r21)
            r0.A0D(r4)
            r0.A0E(r2)
            r0.A0C()
            X.C244123ag.A00(r0, r1)
            X.3gE r20 = r0.A0A()
            r13 = 2131165270(0x7f070056, float:1.7944752E38)
            if (r18 == 0) goto L_0x0260
            r0 = 2131165405(0x7f0700dd, float:1.7945026E38)
            long r0 = X.C244013aV.A0C(r9, r0)
        L_0x0185:
            X.9JR r3 = new X.9JR
            r3.<init>(r10, r8, r0)
            X.2WX r15 = new X.2WX
            r15.<init>(r7, r3)
            X.9JR r5 = new X.9JR
            r3 = r26
            r5.<init>(r3, r8, r0)
            X.2WX r4 = new X.2WX
            r4.<init>(r15, r5)
            X.9JS r3 = new X.9JS
            r1 = r24
            r0 = r25
            r3.<init>(r1, r0, r6)
            X.2WX r1 = new X.2WX
            r1.<init>(r4, r3)
            X.9JS r0 = new X.9JS
            r0.<init>(r10, r14, r6)
            X.2WX r3 = new X.2WX
            r3.<init>(r1, r0)
            X.3gG r1 = X.C247373gE.A00(r21)
            r0 = r17
            r1.A0D(r0)
            r1.A0E(r2)
            r1.A0C()
            X.C244123ag.A00(r1, r3)
            X.3gE r19 = r1.A0A()
            if (r18 == 0) goto L_0x0256
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r29 = r29 - r0
            long r4 = java.lang.Double.doubleToRawLongBits(r29)
            double r27 = r27 + r0
            long r2 = java.lang.Double.doubleToRawLongBits(r27)
        L_0x01d9:
            long r16 = X.C244013aV.A0C(r9, r13)
            X.9JR r15 = new X.9JR
            r0 = r16
            r15.<init>(r10, r8, r0)
            X.2WX r18 = new X.2WX
            r0 = r18
            r0.<init>(r7, r15)
            long r16 = X.C244013aV.A0C(r9, r13)
            X.9JR r15 = new X.9JR
            r13 = r26
            r0 = r16
            r15.<init>(r13, r8, r0)
            X.2WX r13 = new X.2WX
            r0 = r18
            r13.<init>(r0, r15)
            X.9JS r15 = new X.9JS
            r1 = r24
            r0 = r25
            r15.<init>(r1, r0, r6)
            X.2WX r0 = new X.2WX
            r0.<init>(r13, r15)
            X.9JS r1 = new X.9JS
            r1.<init>(r10, r14, r6)
            X.2WX r6 = new X.2WX
            r6.<init>(r0, r1)
            X.9JR r1 = new X.9JR
            r0 = r23
            r1.<init>(r0, r11, r4)
            X.2WX r4 = new X.2WX
            r4.<init>(r6, r1)
            X.9JR r1 = new X.9JR
            r0 = r22
            r1.<init>(r0, r11, r2)
            X.2WX r3 = new X.2WX
            r3.<init>(r4, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.2Wb r1 = new X.2Wb
            r0 = r21
            r1.<init>(r0, r2)
            r0 = r19
            r1.A00(r0)
            r0 = r20
            r1.A00(r0)
            r2 = r9
            r4 = r7
            r5 = r7
            r6 = r7
            X.2Tp r1 = X.C243563Zg.A0H(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x024d:
            r0 = r33
            r0.add(r1)
            r1 = r31
            goto L_0x005d
        L_0x0256:
            long r4 = java.lang.Double.doubleToRawLongBits(r29)
            long r2 = java.lang.Double.doubleToRawLongBits(r27)
            goto L_0x01d9
        L_0x0260:
            long r0 = X.C244013aV.A0C(r9, r13)
            goto L_0x0185
        L_0x0266:
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            long r2 = X.C244013aV.A0C(r9, r0)
            r5 = 2131165231(0x7f07002f, float:1.7944673E38)
            long r0 = X.C244013aV.A0C(r9, r5)
            goto L_0x0103
        L_0x0276:
            r1 = r7
            goto L_0x024d
        L_0x0278:
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x0041
            boolean r0 = r3.A0R
            if (r0 == 0) goto L_0x0284
            X.HN1 r1 = X.HN1.A07
            goto L_0x003c
        L_0x0284:
            X.HN1 r1 = X.HN1.A06
            goto L_0x003c
        L_0x0288:
            X.HN1 r0 = X.HN1.A08
            goto L_0x002e
        L_0x028c:
            java.util.List r24 = X.00k.A0X(r33)
            X.3XV r0 = X.2WX.A02
            r5 = 1120403456(0x42c80000, float:100.0)
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            X.2WX r2 = X.C51971G9r.A0X(r7, r3, r5, r8)
            r1 = 26
            r0 = r35
            X.J6R r0 = X.J6R.A00(r12, r0, r1)
            java.lang.Integer r4 = X.AnonymousClass05K.A0Y
            X.2WX r23 = X.C51971G9r.A0Z(r2, r4, r0, r7)
            X.2Wb r2 = X.AnonymousClass7TG.A0S(r39)
            if (r37 == 0) goto L_0x03b6
            r0 = r37
            int r0 = r0.A00
            java.lang.String r22 = X.C244013aV.A0E(r2, r0)
        L_0x02b6:
            X.2WX r1 = X.C51971G9r.A0X(r7, r3, r5, r8)
            X.3b9 r0 = X.C244413b9.RELATIVE
            r14 = 3
            X.2WX r5 = X.C51971G9r.A0Y(r1, r4, r0, r14)
            r0 = r38
            java.lang.Object r0 = r0.A01
            r21 = r0
            r0 = r21
            java.lang.Number r0 = (java.lang.Number) r0
            r21 = r0
            float r6 = r21.floatValue()
            r0 = 4639763147354275840(0x4063c00000000000, double:158.0)
            int r0 = X.C51972G9s.A0C(r2, r0)
            float r0 = (float) r0
            r12 = 1104150528(0x41d00000, float:26.0)
            r10 = 1116733440(0x42900000, float:72.0)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            android.content.Context r1 = X.C243803a8.A00(r2)
            float r0 = r21.floatValue()
            float r1 = X.0nA.A01(r1, r0)
            if (r6 <= 0) goto L_0x03ab
            float r1 = r1 - r10
            float r1 = r1 - r12
            r0 = 1109393408(0x42200000, float:40.0)
            float r1 = r1 - r0
            long r0 = X.C51965G9l.A06(r1)
        L_0x02f8:
            java.lang.Integer r6 = X.AnonymousClass05K.A1I
            X.2WX r20 = X.AnonymousClass9JR.A00(r5, r6, r11, r0)
            X.2Wb r13 = X.C51973G9u.A0L(r2)
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            long r18 = X.C244013aV.A05(r13)
            X.2V1 r15 = r13.A00
            int r17 = X.C51971G9r.A0C(r15, r13)
            r0 = 2131165220(0x7f070024, float:1.794465E38)
            long r0 = X.C244013aV.A0C(r13, r0)
            android.graphics.Typeface r16 = android.graphics.Typeface.DEFAULT
            long r5 = X.C51969G9p.A0D()
            r12 = r22
            X.3ae r12 = X.C51971G9r.A0b(r15, r7, r12, r8)
            r15 = r17
            X.C51973G9u.A17(r13, r12, r15, r0)
            r12.A0R(r11)
            r0 = r16
            r12.A0S(r0)
            r12.A0F()
            r0 = r18
            int r0 = X.C51968G9o.A09(r13, r0)
            X.G9w.A1F(r13, r12, r0, r5)
            r12.A0W(r10)
            X.C51974G9v.A15(r12, r3, r11, r8)
            X.C51974G9v.A0y(r13, r12, r8)
            r0 = r20
            X.C51967G9n.A1D(r13, r2, r0)
            r1 = 2131165385(0x7f0700c9, float:1.7944986E38)
            X.9JR r0 = X.C51970G9q.A0c(r2, r3, r1, r8)
            X.2WX r1 = X.C51974G9v.A0I(r7, r0, r2, r1)
            X.3b9 r0 = X.C244413b9.ABSOLUTE
            X.2WX r6 = X.C51971G9r.A0Y(r1, r4, r0, r14)
            android.content.Context r1 = X.C243803a8.A00(r2)
            r0 = r38
            java.lang.Object r0 = r0.A00
            float r0 = X.AnonymousClass7TE.A04(r0)
            float r1 = X.0nA.A01(r1, r0)
            r0 = 1121189888(0x42d40000, float:106.0)
            float r1 = r1 - r0
            long r4 = X.C51965G9l.A06(r1)
            android.content.Context r1 = X.C243803a8.A00(r2)
            float r0 = r21.floatValue()
            float r1 = X.0nA.A01(r1, r0)
            r0 = 1126170624(0x43200000, float:160.0)
            float r1 = r1 - r0
            long r0 = X.C51965G9l.A06(r1)
            X.2WX r5 = X.AnonymousClass9JR.A00(r6, r10, r11, r4)
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            X.9JR r0 = X.C51965G9l.A0c(r4, r11, r0)
            X.2WX r5 = X.C51974G9v.A0K(r5, r0, r3)
            X.3Zi r4 = X.C243583Zi.FLEX_START
            X.2Wb r3 = X.G9t.A0w(r2)
            java.util.Iterator r1 = r24.iterator()
        L_0x039b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03ba
            java.lang.Object r0 = r1.next()
            X.3mp r0 = (X.C251263mp) r0
            r3.A00(r0)
            goto L_0x039b
        L_0x03ab:
            float r1 = r1 + r10
            float r1 = r1 + r12
            r0 = 1109393408(0x42200000, float:40.0)
            float r1 = r1 + r0
            long r0 = X.C51965G9l.A06(r1)
            goto L_0x02f8
        L_0x03b6:
            r22 = r7
            goto L_0x02b6
        L_0x03ba:
            X.2Tp r1 = X.C243563Zg.A0J(r3, r2, r5, r4)
            r0 = r23
            X.2Tl r0 = X.C51967G9n.A0N(r1, r2, r9, r0)
            return r0
        L_0x03c5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52325GNs.A0X(X.3Y5):X.3mp");
    }

    public C52325GNs(C52058GDe gDe, C52038GCk gCk, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = gDe;
        this.A03 = z;
        this.A02 = z2;
        this.A04 = z3;
        this.A01 = gCk;
        this.A05 = z4;
    }
}
