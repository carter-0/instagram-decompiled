package X;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.List;

/* renamed from: X.Sgb  reason: case insensitive filesystem */
public final class C11789Sgb implements C13913TlF, C13518Tbn, C13914TlG {
    public boolean A00;
    public final Path A01 = C51965G9l.A0C();
    public final Path A02 = C51965G9l.A0C();
    public final PathMeasure A03 = new PathMeasure();
    public final Q6Y A04;
    public final C11388SRb A05;
    public final C11388SRb A06;
    public final C11388SRb A07;
    public final C11388SRb A08;
    public final C11388SRb A09;
    public final C11388SRb A0A;
    public final C11388SRb A0B;
    public final boolean A0C;
    public final float[] A0D = new float[2];
    public final S05 A0E = new S05();
    public final Integer A0F;
    public final String A0G;
    public final boolean A0H;

    public final void Dwx() {
        this.A00 = false;
        this.A04.invalidateSelf();
    }

    public final void ESm(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            C13687Tf4 tf4 = (C13687Tf4) list.get(i);
            if (tf4 instanceof C11783SgV) {
                C11783SgV sgV = (C11783SgV) tf4;
                if (sgV.A03 == AnonymousClass05K.A00) {
                    this.A0E.A00.add(sgV);
                    sgV.A04.add(this);
                }
            }
        }
    }

    public final void AAd(SIR sir, Object obj) {
        C11388SRb sRb;
        if (obj == C13881Tj4.A0L) {
            sRb = this.A09;
        } else if (obj == C13881Tj4.A0M) {
            sRb = this.A0B;
        } else if (obj == C13881Tj4.A04) {
            sRb = this.A0A;
        } else if (obj != C13881Tj4.A0H || (sRb = this.A05) == null) {
            if (obj == C13881Tj4.A0J) {
                sRb = this.A07;
            } else if (obj != C13881Tj4.A0I || (sRb = this.A06) == null) {
                if (obj == C13881Tj4.A0K) {
                    sRb = this.A08;
                } else {
                    return;
                }
            }
        }
        sRb.A0A(sir);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01e4, code lost:
        if (r4 != (r26 - 1.0d)) goto L_0x01e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Path Bar() {
        /*
            r44 = this;
            r7 = r44
            boolean r1 = r7.A00
            android.graphics.Path r0 = r7.A02
            r37 = r0
            if (r1 != 0) goto L_0x02ce
            r37.reset()
            boolean r0 = r7.A0H
            r36 = 1
            r28 = 0
            if (r0 != 0) goto L_0x02ca
            java.lang.Integer r0 = r7.A0F
            int r1 = r0.intValue()
            r0 = r28
            if (r1 == r0) goto L_0x0135
            r0 = r36
            if (r1 != r0) goto L_0x02c0
            X.SRb r0 = r7.A09
            float r0 = X.C11388SRb.A01(r0)
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r4 = (int) r0
            X.SRb r0 = r7.A0B
            float r0 = X.C11388SRb.A01(r0)
            double r2 = (double) r0
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r2 = r2 - r0
            double r26 = java.lang.Math.toRadians(r2)
            r0 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r2 = (double) r4
            double r0 = r0 / r2
            float r9 = (float) r0
            X.SRb r0 = r7.A08
            float r25 = X.C11388SRb.A01(r0)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r25 = r25 / r0
            X.SRb r0 = r7.A07
            float r24 = X.C11388SRb.A01(r0)
            r0 = r24
            double r0 = (double) r0
            double r4 = java.lang.Math.cos(r26)
            double r4 = r4 * r0
            float r8 = (float) r4
            double r4 = java.lang.Math.sin(r26)
            double r4 = r4 * r0
            float r6 = (float) r4
            r4 = r37
            r4.moveTo(r8, r6)
            double r15 = (double) r9
            double r26 = r26 + r15
            double r22 = java.lang.Math.ceil(r2)
            r17 = 0
        L_0x0075:
            r2 = r17
            double r4 = (double) r2
            int r2 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
            if (r2 >= 0) goto L_0x02ae
            double r9 = java.lang.Math.cos(r26)
            double r2 = r0 * r9
            float r14 = (float) r2
            double r9 = java.lang.Math.sin(r26)
            double r2 = r0 * r9
            float r13 = (float) r2
            r2 = 0
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r25 > r2 ? 1 : (r25 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0129
            double r9 = (double) r6
            double r2 = (double) r8
            double r2 = java.lang.Math.atan2(r9, r2)
            r18 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r2 = r2 - r18
            float r9 = (float) r2
            double r9 = (double) r9
            double r2 = java.lang.Math.cos(r9)
            float r12 = (float) r2
            double r2 = java.lang.Math.sin(r9)
            float r11 = (float) r2
            double r9 = (double) r13
            double r2 = (double) r14
            double r2 = java.lang.Math.atan2(r9, r2)
            double r2 = r2 - r18
            float r9 = (float) r2
            double r2 = (double) r9
            r18 = r2
            double r2 = java.lang.Math.cos(r18)
            float r9 = (float) r2
            double r2 = java.lang.Math.sin(r18)
            float r10 = (float) r2
            float r33 = r24 * r25
            r2 = 1048576000(0x3e800000, float:0.25)
            float r33 = r33 * r2
            float r12 = r12 * r33
            float r11 = r11 * r33
            float r9 = r9 * r33
            float r33 = r33 * r10
            double r18 = r22 - r20
            int r2 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r2 != 0) goto L_0x0115
            android.graphics.Path r3 = r7.A01
            r3.reset()
            r3.moveTo(r8, r6)
            float r8 = r8 - r12
            float r6 = r6 - r11
            float r32 = r14 + r9
            float r33 = r33 + r13
            r29 = r3
            r30 = r8
            r31 = r6
            r34 = r14
            r35 = r13
            r29.cubicTo(r30, r31, r32, r33, r34, r35)
            android.graphics.PathMeasure r4 = r7.A03
            r2 = r28
            r4.setPath(r3, r2)
            float r5 = r4.getLength()
            r2 = 1065351538(0x3f7ff972, float:0.9999)
            float r5 = r5 * r2
            float[] r3 = r7.A0D
            r2 = 0
            r4.getPosTan(r5, r3, r2)
            r34 = r3[r28]
            r35 = r3[r36]
            r29 = r37
            r29.cubicTo(r30, r31, r32, r33, r34, r35)
        L_0x010d:
            double r26 = r26 + r15
        L_0x010f:
            int r17 = r17 + 1
            r6 = r13
            r8 = r14
            goto L_0x0075
        L_0x0115:
            float r8 = r8 - r12
            float r6 = r6 - r11
            float r32 = r14 + r9
            float r33 = r13 + r33
            r29 = r37
            r30 = r8
            r31 = r6
            r34 = r14
            r35 = r13
            r29.cubicTo(r30, r31, r32, r33, r34, r35)
            goto L_0x010d
        L_0x0129:
            double r8 = r22 - r20
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x010f
            r2 = r37
            r2.lineTo(r14, r13)
            goto L_0x010d
        L_0x0135:
            X.SRb r0 = r7.A09
            float r8 = X.C11388SRb.A01(r0)
            X.SRb r0 = r7.A0B
            float r0 = X.C11388SRb.A01(r0)
            double r2 = (double) r0
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r2 = r2 - r0
            double r29 = java.lang.Math.toRadians(r2)
            r0 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r2 = (double) r8
            double r0 = r0 / r2
            float r13 = (float) r0
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x015b
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r13 = r13 * r0
        L_0x015b:
            r0 = 1073741824(0x40000000, float:2.0)
            float r35 = r13 / r0
            int r0 = (int) r8
            float r0 = (float) r0
            float r8 = r8 - r0
            r34 = 0
            int r0 = (r8 > r34 ? 1 : (r8 == r34 ? 0 : -1))
            if (r0 == 0) goto L_0x0170
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r8
            float r0 = r0 * r35
            double r0 = (double) r0
            double r29 = r29 + r0
        L_0x0170:
            X.SRb r0 = r7.A07
            float r33 = X.C11388SRb.A01(r0)
            X.SRb r0 = r7.A05
            float r32 = X.C11388SRb.A01(r0)
            X.SRb r0 = r7.A06
            r1 = 1120403456(0x42c80000, float:100.0)
            if (r0 == 0) goto L_0x02aa
            float r31 = X.C11388SRb.A01(r0)
            float r31 = r31 / r1
        L_0x0188:
            X.SRb r0 = r7.A08
            float r28 = X.C11388SRb.A01(r0)
            float r28 = r28 / r1
            int r0 = (r8 > r34 ? 1 : (r8 == r34 ? 0 : -1))
            if (r0 == 0) goto L_0x028d
            float r6 = r33 - r32
            float r6 = r6 * r8
            float r6 = r6 + r32
            double r0 = (double) r6
            double r9 = java.lang.Math.cos(r29)
            double r4 = r0 * r9
            float r11 = (float) r4
            double r4 = java.lang.Math.sin(r29)
            double r0 = r0 * r4
            float r10 = (float) r0
            r0 = r37
            r0.moveTo(r11, r10)
            float r1 = r13 * r8
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            double r0 = (double) r1
            double r29 = r29 + r0
        L_0x01b4:
            double r26 = java.lang.Math.ceil(r2)
            r24 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r26 = r26 * r24
            r12 = 0
            r23 = 0
        L_0x01bf:
            double r4 = (double) r12
            int r0 = (r4 > r26 ? 1 : (r4 == r26 ? 0 : -1))
            if (r0 >= 0) goto L_0x02ae
            r9 = r32
            if (r23 == 0) goto L_0x01ca
            r9 = r33
        L_0x01ca:
            int r0 = (r6 > r34 ? 1 : (r6 == r34 ? 0 : -1))
            if (r0 == 0) goto L_0x0289
            double r1 = r26 - r24
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0289
            float r15 = r13 * r8
            r0 = 1073741824(0x40000000, float:2.0)
            float r15 = r15 / r0
        L_0x01d9:
            r21 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r6 > r34 ? 1 : (r6 == r34 ? 0 : -1))
            if (r0 == 0) goto L_0x01e6
            double r2 = r26 - r21
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = r6
            if (r1 == 0) goto L_0x01e7
        L_0x01e6:
            r0 = r9
        L_0x01e7:
            double r2 = (double) r0
            double r16 = java.lang.Math.cos(r29)
            double r0 = r2 * r16
            float r9 = (float) r0
            r20 = r9
            double r0 = java.lang.Math.sin(r29)
            double r2 = r2 * r0
            float r14 = (float) r2
            int r0 = (r31 > r34 ? 1 : (r31 == r34 ? 0 : -1))
            if (r0 != 0) goto L_0x020f
            int r0 = (r28 > r34 ? 1 : (r28 == r34 ? 0 : -1))
            if (r0 != 0) goto L_0x020f
            r1 = r37
            r1.lineTo(r9, r14)
        L_0x0204:
            double r0 = (double) r15
            double r29 = r29 + r0
            r23 = r23 ^ 1
            int r12 = r12 + 1
            r10 = r14
            r11 = r20
            goto L_0x01bf
        L_0x020f:
            double r2 = (double) r10
            double r0 = (double) r11
            double r0 = java.lang.Math.atan2(r2, r0)
            r18 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r0 = r0 - r18
            float r2 = (float) r0
            double r2 = (double) r2
            double r0 = java.lang.Math.cos(r2)
            float r9 = (float) r0
            double r0 = java.lang.Math.sin(r2)
            float r2 = (float) r0
            r17 = r2
            double r2 = (double) r14
            r0 = r20
            double r0 = (double) r0
            double r0 = java.lang.Math.atan2(r2, r0)
            double r0 = r0 - r18
            float r2 = (float) r0
            double r0 = (double) r2
            r18 = r0
            double r0 = java.lang.Math.cos(r18)
            float r2 = (float) r0
            double r0 = java.lang.Math.sin(r18)
            float r3 = (float) r0
            r0 = r28
            r16 = r31
            r18 = r33
            r1 = r32
            if (r23 == 0) goto L_0x0254
            r0 = r31
            r16 = r28
            r18 = r1
            r1 = r33
        L_0x0254:
            float r18 = r18 * r0
            r0 = 1056236141(0x3ef4e26d, float:0.47829)
            float r18 = r18 * r0
            float r9 = r9 * r18
            float r18 = r18 * r17
            float r1 = r1 * r16
            float r1 = r1 * r0
            float r2 = r2 * r1
            float r1 = r1 * r3
            int r0 = (r8 > r34 ? 1 : (r8 == r34 ? 0 : -1))
            if (r0 == 0) goto L_0x026d
            if (r12 != 0) goto L_0x0280
            float r9 = r9 * r8
            float r18 = r18 * r8
        L_0x026d:
            float r11 = r11 - r9
            float r10 = r10 - r18
            float r40 = r20 + r2
            float r41 = r14 + r1
            r38 = r11
            r39 = r10
            r42 = r20
            r43 = r14
            r37.cubicTo(r38, r39, r40, r41, r42, r43)
            goto L_0x0204
        L_0x0280:
            double r16 = r26 - r21
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x026d
            float r2 = r2 * r8
            float r1 = r1 * r8
            goto L_0x026d
        L_0x0289:
            r15 = r35
            goto L_0x01d9
        L_0x028d:
            r0 = r33
            double r0 = (double) r0
            double r9 = java.lang.Math.cos(r29)
            double r4 = r0 * r9
            float r11 = (float) r4
            double r4 = java.lang.Math.sin(r29)
            double r0 = r0 * r4
            float r10 = (float) r0
            r0 = r37
            r0.moveTo(r11, r10)
            r0 = r35
            double r0 = (double) r0
            double r29 = r29 + r0
            r6 = 0
            goto L_0x01b4
        L_0x02aa:
            r31 = 0
            goto L_0x0188
        L_0x02ae:
            X.SRb r0 = r7.A0A
            android.graphics.PointF r0 = X.C11388SRb.A03(r0)
            float r2 = r0.x
            float r1 = r0.y
            r0 = r37
            r0.offset(r2, r1)
            r37.close()
        L_0x02c0:
            r37.close()
            X.S05 r1 = r7.A0E
            r0 = r37
            r1.A00(r0)
        L_0x02ca:
            r0 = r36
            r7.A00 = r0
        L_0x02ce:
            return r37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11789Sgb.Bar():android.graphics.Path");
    }

    public final String getName() {
        return this.A0G;
    }

    public C11789Sgb(Q6Y q6y, C11808Sgu sgu, C11796Sgi sgi) {
        QGR qgr;
        this.A04 = q6y;
        this.A0G = sgu.A08;
        Integer num = sgu.A07;
        this.A0F = num;
        this.A0H = sgu.A09;
        this.A0C = sgu.A0A;
        QGR A002 = C11802Sgo.A00(sgu.A04);
        this.A09 = A002;
        C11388SRb ALS = sgu.A06.ALS();
        this.A0A = ALS;
        QGR A003 = C11802Sgo.A00(sgu.A05);
        this.A0B = A003;
        QGR A004 = C11802Sgo.A00(sgu.A02);
        this.A07 = A004;
        QGR A005 = C11802Sgo.A00(sgu.A03);
        this.A08 = A005;
        Integer num2 = AnonymousClass05K.A00;
        if (num == num2) {
            this.A05 = C11802Sgo.A00(sgu.A00);
            qgr = C11802Sgo.A00(sgu.A01);
        } else {
            qgr = null;
            this.A05 = null;
        }
        this.A06 = qgr;
        sgi.A0C(A002);
        sgi.A0C(ALS);
        sgi.A0C(A003);
        sgi.A0C(A004);
        sgi.A0C(A005);
        if (num == num2) {
            sgi.A0C(this.A05);
            sgi.A0C(this.A06);
        }
        A002.A09(this);
        ALS.A09(this);
        A003.A09(this);
        A004.A09(this);
        A005.A09(this);
        if (num == num2) {
            this.A05.A09(this);
            this.A06.A09(this);
        }
    }

    public final void EIb(SPM spm, SPM spm2, List list, int i) {
        SQL.A02(this, spm, spm2, list, i);
    }
}
