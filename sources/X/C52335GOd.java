package X;

import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* renamed from: X.GOd  reason: case insensitive filesystem */
public final class C52335GOd extends C251253mo {
    @Prop(optional = true, resType = C54606HKp.A03)
    @Comparable(type = 0)
    public float A00 = -1.0f;
    @Prop(optional = true, resType = C54606HKp.A03)
    @Comparable(type = 0)
    public float A01 = -1.0f;
    @Prop(optional = true, resType = C54606HKp.A02)
    @Comparable(type = 3)
    public int A02 = -1;
    @Prop(optional = true, resType = C54606HKp.A02)
    @Comparable(type = 3)
    public int A03 = AnonymousClass972.MUTABLE_FLAG_MASK;
    @Prop(optional = true, resType = C54606HKp.A03)
    @Comparable(type = 3)
    public int A04 = -1;
    @Prop(optional = true, resType = C54606HKp.A02)
    @Comparable(type = 3)
    public int A05 = 50331648;
    @Prop(optional = true, resType = C54606HKp.A02)
    @Comparable(type = 3)
    public int A06 = 922746880;
    @Prop(optional = false, resType = C54606HKp.A0A)
    @Comparable(type = 10)
    public C251263mp A07;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A08;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A09;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A0A;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A0B;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A0C = false;

    public C52335GOd() {
        super("Card");
    }

    public final Object[] A0W() {
        Integer valueOf = Integer.valueOf(this.A02);
        Integer valueOf2 = Integer.valueOf(this.A03);
        C251263mp r6 = this.A07;
        Float valueOf3 = Float.valueOf(this.A00);
        Boolean valueOf4 = Boolean.valueOf(this.A08);
        Boolean valueOf5 = Boolean.valueOf(this.A09);
        Boolean valueOf6 = Boolean.valueOf(this.A0A);
        Boolean valueOf7 = Boolean.valueOf(this.A0B);
        Float valueOf8 = Float.valueOf(this.A01);
        Integer valueOf9 = Integer.valueOf(this.A04);
        Integer valueOf10 = Integer.valueOf(this.A05);
        Float valueOf11 = Float.valueOf(-1.0f);
        return new Object[]{valueOf, null, null, valueOf2, r6, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf11, Integer.valueOf(this.A06), C51967G9n.A0j(), Boolean.valueOf(this.A0C)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: X.Gxe} */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.GrM, X.3af] */
    /* JADX WARNING: type inference failed for: r3v5, types: [X.GrN, X.3af] */
    /* JADX WARNING: type inference failed for: r15v6, types: [X.GrQ, X.3af] */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0176, code lost:
        if (r9 == false) goto L_0x0178;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0b(X.2V1 r29) {
        /*
            r28 = this;
            r1 = r28
            X.3mp r0 = r1.A07
            r27 = r0
            r20 = 0
            int r0 = r1.A02
            r26 = r0
            int r12 = r1.A03
            int r0 = r1.A06
            r25 = r0
            int r0 = r1.A05
            r24 = r0
            float r6 = r1.A00
            float r5 = r1.A01
            int r11 = r1.A04
            boolean r0 = r1.A0C
            r19 = r0
            boolean r10 = r1.A0A
            boolean r9 = r1.A0B
            boolean r8 = r1.A08
            boolean r7 = r1.A09
            r18 = -1082130432(0xffffffffbf800000, float:-1.0)
            r13 = r29
            android.content.Context r0 = r13.A0C
            android.content.res.Resources r1 = r0.getResources()
            int r0 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x0042
            android.util.DisplayMetrics r0 = r1.getDisplayMetrics()
            float r0 = r0.density
            r6 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r0
        L_0x0042:
            int r0 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x0052
            android.util.DisplayMetrics r0 = r1.getDisplayMetrics()
            float r0 = r0.density
            r5 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 + r0
        L_0x0052:
            r16 = -1
            r15 = 1056964608(0x3f000000, float:0.5)
            float r0 = r5 + r15
            int r0 = (int) r0
            r14 = r0
            int r4 = r0 % 2
            r3 = 1
            if (r4 != r3) goto L_0x0060
            int r0 = r0 - r3
        L_0x0060:
            float r1 = (float) r0
            float r1 = r1 * r15
            r0 = r14
            if (r4 != r3) goto L_0x0067
            int r0 = r14 - r3
        L_0x0067:
            float r0 = (float) r0
            float r0 = r0 - r1
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r2 = (int) r0
            r17 = r2
            r0 = r16
            if (r11 != r0) goto L_0x0089
            r0 = r14
            if (r4 != r3) goto L_0x007a
            int r0 = r14 - r3
        L_0x007a:
            float r1 = (float) r0
            float r1 = r1 * r15
            r0 = r14
            if (r4 != r3) goto L_0x0081
            int r0 = r14 - r3
        L_0x0081:
            float r0 = (float) r0
            float r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r11 = (int) r0
        L_0x0089:
            r2 = 0
            r0 = r14
            if (r4 != r3) goto L_0x008f
            int r0 = r14 - r3
        L_0x008f:
            float r0 = (float) r0
            float r0 = r0 - r2
            double r0 = (double) r0
            double r15 = java.lang.Math.ceil(r0)
            int r15 = (int) r15
            r23 = r15
            if (r4 != r3) goto L_0x009c
            int r14 = r14 - r3
        L_0x009c:
            float r0 = (float) r14
            float r0 = r0 + r2
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r4 = (int) r0
            r22 = r4
            r14 = 0
            X.GOI r4 = X.GOJ.A00(r13)
            X.3ai r16 = X.C244143ai.LEFT
            X.3mo r0 = r4.A00
            r21 = r0
            X.2TC r15 = r21.A0Z()
            r1 = r23
            r0 = r16
            r15.A0T(r0, r1)
            X.3ai r15 = X.C244143ai.RIGHT
            X.2TC r1 = r21.A0Z()
            r0 = r22
            r1.A0T(r15, r0)
            X.3ai r0 = X.C244143ai.TOP
            if (r10 == 0) goto L_0x00cf
            if (r9 == 0) goto L_0x00cf
            r17 = 0
        L_0x00cf:
            X.2TC r15 = r21.A0Z()
            r1 = r17
            r15.A0T(r0, r1)
            X.3ai r1 = X.C244143ai.BOTTOM
            if (r8 == 0) goto L_0x00df
            if (r7 == 0) goto L_0x00df
            r11 = 0
        L_0x00df:
            X.2TC r0 = r21.A0Z()
            r0.A0T(r1, r11)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r19 == 0) goto L_0x01a7
            if (r12 != r0) goto L_0x00ed
            r12 = 0
        L_0x00ed:
            X.7gD r0 = X.C51965G9l.A0Y(r12)
            r4.A04(r0)
            X.GO4 r1 = new X.GO4
            r1.<init>()
            X.GrQ r15 = new X.GrQ
            r15.<init>(r1, r13, r14)
            r15.A01 = r1
            r15.A00 = r13
            r0 = r26
            r1.A01 = r0
            r1.A02 = r12
            r1.A00 = r6
            r1.A03 = r8
            r1.A04 = r7
            r1.A05 = r10
            r1.A06 = r9
            X.3b9 r11 = X.C244413b9.ABSOLUTE
            r15.A08(r11)
            X.3ai r1 = X.C244143ai.ALL
            r15.A07(r1, r14)
            r0 = r20
            r15.A09(r0)
            X.3Zd r0 = X.C243533Zd.GLOBAL
            r15.A06(r0)
            if (r8 != 0) goto L_0x012e
            if (r7 != 0) goto L_0x012e
            if (r10 != 0) goto L_0x012e
            if (r9 == 0) goto L_0x0140
        L_0x012e:
            if (r12 != 0) goto L_0x0140
            X.3mo r0 = r15.A00
            X.2TC r0 = r0.A0Z()
            X.3Zj r12 = X.2TC.A01(r0)
            r12.A01 = r3
            r0 = r20
            r12.A04 = r0
        L_0x0140:
            X.GO4 r12 = r15.A01
            X.2V5[] r0 = new X.2V5[r3]
            r12.A07 = r0
            r0[r14] = r20
            r15.A02()
            r4.A0A(r12)
        L_0x014e:
            r0 = r27
            r4.A0A(r0)
            r3 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x018f
            X.Gxd r2 = new X.Gxd
            r2.<init>()
            X.GrN r3 = new X.GrN
            r3.<init>(r2, r13, r14)
            r3.A01 = r2
            r3.A00 = r13
            r0 = r25
            r2.A05 = r0
            r0 = r24
            r2.A04 = r0
            r2.A00 = r6
            r2.A03 = r5
            r5 = 1
            if (r10 == 0) goto L_0x0178
            r0 = 1
            if (r9 != 0) goto L_0x0179
        L_0x0178:
            r0 = 0
        L_0x0179:
            r2.A07 = r0
            if (r8 == 0) goto L_0x01a5
            if (r7 == 0) goto L_0x01a5
        L_0x017f:
            r2.A06 = r5
            r3.A08(r11)
            r3.A07(r1, r14)
            X.Gxd r1 = r3.A01
            r0 = r18
            r1.A01 = r0
            r1.A02 = r0
        L_0x018f:
            X.GOI r1 = X.GOJ.A00(r13)
            X.2Tl r0 = r4.A00
            r1.A0A(r0)
            if (r3 == 0) goto L_0x01a2
            r3.A02()
            X.Gxd r0 = r3.A01
            r1.A0A(r0)
        L_0x01a2:
            X.2Tl r0 = r1.A00
            return r0
        L_0x01a5:
            r5 = 0
            goto L_0x017f
        L_0x01a7:
            if (r12 != r0) goto L_0x01aa
            r12 = -1
        L_0x01aa:
            X.GOI r3 = X.GOJ.A00(r13)
            X.7gD r0 = X.C51965G9l.A0Y(r26)
            r3.A04(r0)
            r11 = 1065353216(0x3f800000, float:1.0)
            X.3mo r1 = r3.A00
            X.2TC r0 = r1.A0Z()
            r0.A06(r11)
            X.2TC r0 = r1.A0Z()
            r0.A07(r2)
            X.3b9 r11 = X.C244413b9.ABSOLUTE
            r3.A08(r11)
            X.3ai r1 = X.C244143ai.ALL
            r3.A07(r1, r14)
            r0 = r20
            r3.A09(r0)
            X.3Zd r0 = X.C243533Zd.GLOBAL
            r3.A06(r0)
            X.2Tl r0 = r3.A00
            r4.A0A(r0)
            r0 = r27
            r4.A0A(r0)
            X.Gxe r0 = new X.Gxe
            r0.<init>()
            X.GrM r3 = new X.GrM
            r3.<init>(r0, r13, r14)
            r3.A01 = r0
            r3.A00 = r13
            r0.A01 = r12
            r0.A00 = r6
            r3.A08(r11)
            r3.A07(r1, r14)
            X.Gxe r0 = r3.A01
            r0.A04 = r10
            r0.A05 = r9
            r0.A02 = r8
            r0.A03 = r7
            r3.A02()
            X.Gxe r0 = r3.A01
            r27 = r0
            goto L_0x014e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52335GOd.A0b(X.2V1):X.3mp");
    }

    public final /* bridge */ /* synthetic */ C251263mp A0E() {
        C251263mp r0;
        C52335GOd gOd = (C52335GOd) super.A0E();
        C251263mp r02 = gOd.A07;
        if (r02 != null) {
            r0 = r02.A0E();
        } else {
            r0 = null;
        }
        gOd.A07 = r0;
        return gOd;
    }
}
