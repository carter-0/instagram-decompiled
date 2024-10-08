package X;

import android.graphics.Matrix;
import android.graphics.PointF;

public final class S7O {
    public C11388SRb A00;
    public C11388SRb A01;
    public C11388SRb A02;
    public C11388SRb A03;
    public C11388SRb A04;
    public C11388SRb A05;
    public C11388SRb A06;
    public QGR A07;
    public QGR A08;
    public final float[] A09;
    public final Matrix A0A = AnonymousClass7TE.A0U();
    public final Matrix A0B;
    public final Matrix A0C;
    public final Matrix A0D;
    public final boolean A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0138, code lost:
        if (r1 != 0.0f) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Matrix A00() {
        /*
            r17 = this;
            r6 = r17
            android.graphics.Matrix r3 = r6.A0A
            r3.reset()
            X.SRb r5 = r6.A03
            r16 = 0
            if (r5 == 0) goto L_0x0024
            android.graphics.PointF r2 = X.C11388SRb.A03(r5)
            if (r2 == 0) goto L_0x0024
            float r1 = r2.x
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x001f
            float r0 = r2.y
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0024
        L_0x001f:
            float r0 = r2.y
            r3.preTranslate(r1, r0)
        L_0x0024:
            boolean r0 = r6.A0E
            if (r0 == 0) goto L_0x012a
            if (r5 == 0) goto L_0x0056
            float r4 = r5.A02
            android.graphics.PointF r0 = X.C11388SRb.A03(r5)
            float r7 = r0.x
            float r2 = r0.y
            r0 = 953267991(0x38d1b717, float:1.0E-4)
            float r0 = r0 + r4
            r5.A08(r0)
            android.graphics.PointF r1 = X.C11388SRb.A03(r5)
            r5.A08(r4)
            float r0 = r1.y
            float r0 = r0 - r2
            double r4 = (double) r0
            float r0 = r1.x
            float r0 = r0 - r7
            double r0 = (double) r0
            double r0 = java.lang.Math.atan2(r4, r0)
            double r4 = java.lang.Math.toDegrees(r0)
            float r1 = (float) r4
        L_0x0053:
            r3.preRotate(r1)
        L_0x0056:
            X.QGR r2 = r6.A07
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x00cb
            X.QGR r0 = r6.A08
            r4 = 1119092736(0x42b40000, float:90.0)
            if (r0 != 0) goto L_0x0118
            r11 = 0
        L_0x0063:
            X.QGR r0 = r6.A08
            if (r0 != 0) goto L_0x0106
            r12 = 1065353216(0x3f800000, float:1.0)
        L_0x0069:
            float r0 = r2.A0B()
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            double r4 = java.lang.Math.tan(r0)
            float r1 = (float) r4
            r0 = 0
        L_0x0078:
            float[] r13 = r6.A09
            r13[r0] = r16
            int r0 = r0 + 1
            r14 = 9
            if (r0 < r14) goto L_0x0078
            r10 = 0
            r13[r10] = r11
            r9 = 1
            r13[r9] = r12
            float r8 = -r12
            r7 = 3
            r13[r7] = r8
            r5 = 4
            r13[r5] = r11
            r4 = 8
            r13[r4] = r15
            android.graphics.Matrix r2 = r6.A0B
            r2.setValues(r13)
            r0 = 0
        L_0x0099:
            r13[r0] = r16
            int r0 = r0 + 1
            if (r0 < r14) goto L_0x0099
            r13[r10] = r15
            r13[r7] = r1
            r13[r5] = r15
            r13[r4] = r15
            android.graphics.Matrix r1 = r6.A0C
            r1.setValues(r13)
            r0 = 0
        L_0x00ad:
            r13[r0] = r16
            int r0 = r0 + 1
            if (r0 < r14) goto L_0x00ad
            r13[r10] = r11
            r13[r9] = r8
            r13[r7] = r12
            r13[r5] = r11
            r13[r4] = r15
            android.graphics.Matrix r0 = r6.A0D
            r0.setValues(r13)
            r1.preConcat(r2)
            r0.preConcat(r1)
            r3.preConcat(r0)
        L_0x00cb:
            X.SRb r0 = r6.A05
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r2 = r0.A06()
            X.S0z r2 = (X.S0z) r2
            if (r2 == 0) goto L_0x00e8
            float r1 = r2.A00
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x00e3
            float r0 = r2.A01
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00e8
        L_0x00e3:
            float r0 = r2.A01
            r3.preScale(r1, r0)
        L_0x00e8:
            X.SRb r0 = r6.A00
            if (r0 == 0) goto L_0x0105
            android.graphics.PointF r2 = X.C11388SRb.A03(r0)
            if (r2 == 0) goto L_0x0105
            float r1 = r2.x
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00fe
            float r0 = r2.y
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0105
        L_0x00fe:
            float r1 = -r1
            float r0 = r2.y
            float r0 = -r0
            r3.preTranslate(r1, r0)
        L_0x0105:
            return r3
        L_0x0106:
            float r0 = r0.A0B()
            float r0 = -r0
            float r0 = r0 + r4
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.sin(r0)
            float r12 = (float) r0
            goto L_0x0069
        L_0x0118:
            float r0 = r0.A0B()
            float r0 = -r0
            float r0 = r0 + r4
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.cos(r0)
            float r11 = (float) r0
            goto L_0x0063
        L_0x012a:
            X.SRb r1 = r6.A04
            if (r1 == 0) goto L_0x0056
            boolean r0 = r1 instanceof X.QGN
            if (r0 == 0) goto L_0x013c
            float r1 = X.C11388SRb.A01(r1)
        L_0x0136:
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0056
            goto L_0x0053
        L_0x013c:
            X.QGR r1 = (X.QGR) r1
            float r1 = r1.A0B()
            goto L_0x0136
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S7O.A00():android.graphics.Matrix");
    }

    public final Matrix A01(float f) {
        PointF A032;
        S0z s0z;
        float f2;
        C11388SRb sRb = this.A03;
        PointF pointF = null;
        if (sRb == null) {
            A032 = null;
        } else {
            A032 = C11388SRb.A03(sRb);
        }
        C11388SRb sRb2 = this.A05;
        if (sRb2 == null) {
            s0z = null;
        } else {
            s0z = (S0z) sRb2.A06();
        }
        Matrix matrix = this.A0A;
        matrix.reset();
        if (A032 != null) {
            matrix.preTranslate(A032.x * f, A032.y * f);
        }
        if (s0z != null) {
            double d = (double) f;
            matrix.preScale((float) Math.pow((double) s0z.A00, d), (float) Math.pow((double) s0z.A01, d));
        }
        C11388SRb sRb3 = this.A04;
        if (sRb3 != null) {
            float A012 = C11388SRb.A01(sRb3);
            C11388SRb sRb4 = this.A00;
            if (sRb4 != null) {
                pointF = C11388SRb.A03(sRb4);
            }
            float f3 = A012 * f;
            float f4 = 0.0f;
            if (pointF == null) {
                f2 = 0.0f;
            } else {
                f2 = pointF.x;
                f4 = pointF.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return matrix;
    }

    public final void A02(C13518Tbn tbn) {
        C11388SRb sRb = this.A02;
        if (sRb != null) {
            sRb.A09(tbn);
        }
        C11388SRb sRb2 = this.A06;
        if (sRb2 != null) {
            sRb2.A09(tbn);
        }
        C11388SRb sRb3 = this.A01;
        if (sRb3 != null) {
            sRb3.A09(tbn);
        }
        C11388SRb sRb4 = this.A00;
        if (sRb4 != null) {
            sRb4.A09(tbn);
        }
        C11388SRb sRb5 = this.A03;
        if (sRb5 != null) {
            sRb5.A09(tbn);
        }
        C11388SRb sRb6 = this.A05;
        if (sRb6 != null) {
            sRb6.A09(tbn);
        }
        C11388SRb sRb7 = this.A04;
        if (sRb7 != null) {
            sRb7.A09(tbn);
        }
        QGR qgr = this.A07;
        if (qgr != null) {
            qgr.A09(tbn);
        }
        QGR qgr2 = this.A08;
        if (qgr2 != null) {
            qgr2.A09(tbn);
        }
    }

    public final void A03(C11796Sgi sgi) {
        sgi.A0C(this.A02);
        sgi.A0C(this.A06);
        sgi.A0C(this.A01);
        sgi.A0C(this.A00);
        sgi.A0C(this.A03);
        sgi.A0C(this.A05);
        sgi.A0C(this.A04);
        sgi.A0C(this.A07);
        sgi.A0C(this.A08);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.QGR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: X.QGR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: X.QGR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: X.QGR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: X.QGR} */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.SRb, X.QGR] */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.SRb, X.QGR] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(X.SIR r5, java.lang.Object r6) {
        /*
            r4 = this;
            android.graphics.PointF r0 = X.C13881Tj4.A06
            if (r6 != r0) goto L_0x0016
            X.SRb r3 = r4.A00
            if (r3 != 0) goto L_0x00e4
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            X.QGN r0 = new X.QGN
            r0.<init>(r5, r1)
            r4.A00 = r0
        L_0x0014:
            r0 = 1
            return r0
        L_0x0016:
            android.graphics.PointF r0 = X.C13881Tj4.A07
            if (r6 != r0) goto L_0x002b
            X.SRb r3 = r4.A03
            if (r3 != 0) goto L_0x00e4
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            X.QGN r0 = new X.QGN
            r0.<init>(r5, r1)
            r4.A03 = r0
            goto L_0x0014
        L_0x002b:
            java.lang.Float r0 = X.C13881Tj4.A0U
            if (r6 != r0) goto L_0x0045
            X.SRb r2 = r4.A03
            boolean r0 = r2 instanceof X.QGM
            if (r0 == 0) goto L_0x0045
            X.QGM r2 = (X.QGM) r2
            X.SIR r1 = r2.A00
            if (r1 == 0) goto L_0x003e
            r0 = 0
            r1.A00 = r0
        L_0x003e:
            r2.A00 = r5
        L_0x0040:
            if (r5 == 0) goto L_0x0014
            r5.A00 = r2
            goto L_0x0014
        L_0x0045:
            java.lang.Float r0 = X.C13881Tj4.A0V
            if (r6 != r0) goto L_0x005b
            X.SRb r2 = r4.A03
            boolean r0 = r2 instanceof X.QGM
            if (r0 == 0) goto L_0x005b
            X.QGM r2 = (X.QGM) r2
            X.SIR r1 = r2.A01
            if (r1 == 0) goto L_0x0058
            r0 = 0
            r1.A00 = r0
        L_0x0058:
            r2.A01 = r5
            goto L_0x0040
        L_0x005b:
            X.S0z r0 = X.C13881Tj4.A09
            if (r6 != r0) goto L_0x0070
            X.SRb r3 = r4.A05
            if (r3 != 0) goto L_0x00e4
            X.S0z r1 = new X.S0z
            r1.<init>()
            X.QGN r0 = new X.QGN
            r0.<init>(r5, r1)
            r4.A05 = r0
            goto L_0x0014
        L_0x0070:
            java.lang.Float r0 = X.C13881Tj4.A0W
            r2 = 0
            if (r6 != r0) goto L_0x0085
            X.SRb r3 = r4.A04
            if (r3 != 0) goto L_0x00e4
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            X.QGN r0 = new X.QGN
            r0.<init>(r5, r1)
            r4.A04 = r0
            goto L_0x0014
        L_0x0085:
            java.lang.Integer r0 = X.C13881Tj4.A0e
            if (r6 != r0) goto L_0x009c
            X.SRb r3 = r4.A02
            if (r3 != 0) goto L_0x00e4
            r0 = 100
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.QGN r0 = new X.QGN
            r0.<init>(r5, r1)
            r4.A02 = r0
            goto L_0x0014
        L_0x009c:
            java.lang.Float r0 = X.C13881Tj4.A0Z
            r1 = 1120403456(0x42c80000, float:100.0)
            if (r6 != r0) goto L_0x00b3
            X.SRb r3 = r4.A06
            if (r3 != 0) goto L_0x00e4
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            X.QGN r0 = new X.QGN
            r0.<init>(r5, r1)
            r4.A06 = r0
            goto L_0x0014
        L_0x00b3:
            java.lang.Float r0 = X.C13881Tj4.A0T
            if (r6 != r0) goto L_0x00c8
            X.SRb r3 = r4.A01
            if (r3 != 0) goto L_0x00e4
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            X.QGN r0 = new X.QGN
            r0.<init>(r5, r1)
            r4.A01 = r0
            goto L_0x0014
        L_0x00c8:
            java.lang.Float r0 = X.C13881Tj4.A0X
            if (r6 != r0) goto L_0x00e9
            X.QGR r3 = r4.A07
            if (r3 != 0) goto L_0x00e4
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            X.ST4 r0 = new X.ST4
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.QGR r3 = new X.QGR
            r3.<init>(r0)
            r4.A07 = r3
        L_0x00e4:
            r3.A0A(r5)
            goto L_0x0014
        L_0x00e9:
            java.lang.Float r0 = X.C13881Tj4.A0Y
            if (r6 != r0) goto L_0x0106
            X.QGR r3 = r4.A08
            if (r3 != 0) goto L_0x00e4
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            X.ST4 r0 = new X.ST4
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.QGR r3 = new X.QGR
            r3.<init>(r0)
            r4.A08 = r3
            goto L_0x00e4
        L_0x0106:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S7O.A04(X.SIR, java.lang.Object):boolean");
    }

    public S7O(C11816Sh2 sh2) {
        C11388SRb ALS;
        C11388SRb ALS2;
        QGT qgt;
        QGR A002;
        QGR A003;
        QGR A004;
        C11800Sgm sgm = sh2.A07;
        if (sgm == null) {
            ALS = null;
        } else {
            ALS = sgm.ALS();
        }
        this.A00 = ALS;
        C13765Tgd tgd = sh2.A09;
        if (tgd == null) {
            ALS2 = null;
        } else {
            ALS2 = tgd.ALS();
        }
        this.A03 = ALS2;
        QGc qGc = sh2.A08;
        if (qGc == null) {
            qgt = null;
        } else {
            qgt = new QGT(qGc.A00);
        }
        this.A05 = qgt;
        QGY qgy = sh2.A02;
        if (qgy == null) {
            A002 = null;
        } else {
            A002 = C11802Sgo.A00(qgy);
        }
        this.A04 = A002;
        QGY qgy2 = sh2.A03;
        if (qgy2 == null) {
            A003 = null;
        } else {
            A003 = C11802Sgo.A00(qgy2);
        }
        this.A07 = A003;
        this.A0E = sh2.A00;
        if (A003 != null) {
            this.A0B = AnonymousClass7TE.A0U();
            this.A0C = AnonymousClass7TE.A0U();
            this.A0D = AnonymousClass7TE.A0U();
            this.A09 = new float[9];
        }
        QGY qgy3 = sh2.A04;
        if (qgy3 == null) {
            A004 = null;
        } else {
            A004 = C11802Sgo.A00(qgy3);
        }
        this.A08 = A004;
        C7487QGa qGa = sh2.A06;
        if (qGa != null) {
            this.A02 = new C11388SRb(qGa.A00);
        }
        QGY qgy4 = sh2.A05;
        if (qgy4 != null) {
            this.A06 = C11802Sgo.A00(qgy4);
        } else {
            this.A06 = null;
        }
        QGY qgy5 = sh2.A01;
        if (qgy5 != null) {
            this.A01 = C11802Sgo.A00(qgy5);
        } else {
            this.A01 = null;
        }
    }
}
