package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.Sgh  reason: case insensitive filesystem */
public final class C11795Sgh implements C13518Tbn, C13912TlE, C13914TlG {
    public float A00;
    public C11388SRb A01;
    public C11388SRb A02;
    public C11792Sge A03;
    public QGN A04;
    public final 01c A05 = new 01c();
    public final 01c A06 = new 01c();
    public final C11388SRb A07;
    public final C11388SRb A08;
    public final C11388SRb A09;
    public final int A0A;
    public final Paint A0B;
    public final Path A0C;
    public final RectF A0D;
    public final Q6Y A0E;
    public final C11388SRb A0F;
    public final C11796Sgi A0G;
    public final Integer A0H;
    public final String A0I;
    public final List A0J;
    public final boolean A0K;

    public final void ESm(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            Object obj = list2.get(i);
            if (obj instanceof C13913TlF) {
                this.A0J.add(obj);
            }
        }
    }

    private int A00() {
        float f = this.A09.A02;
        float f2 = (float) this.A0A;
        int A052 = AnonymousClass7TE.A05(f, f2);
        int A053 = AnonymousClass7TE.A05(this.A08.A02, f2);
        int A054 = AnonymousClass7TE.A05(this.A07.A02, f2);
        int i = 17;
        if (A052 != 0) {
            i = 527 * A052;
        }
        if (A053 != 0) {
            i = i * 31 * A053;
        }
        if (A054 != 0) {
            return i * 31 * A054;
        }
        return i;
    }

    private int[] A01(int[] iArr) {
        QGN qgn = this.A04;
        if (qgn != null) {
            Integer[] numArr = (Integer[]) qgn.A06();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length != length2) {
                iArr = new int[length2];
                while (i < length2) {
                    iArr[i] = JTO.A0A(numArr, i);
                    i++;
                }
            } else {
                while (i < length) {
                    iArr[i] = JTO.A0A(numArr, i);
                    i++;
                }
            }
        }
        return iArr;
    }

    public final void AAd(SIR sir, Object obj) {
        C11796Sgi sgi;
        C11388SRb sRb;
        C11792Sge sge;
        C11388SRb sRb2;
        C11792Sge sge2;
        C11792Sge sge3;
        C11792Sge sge4;
        C11792Sge sge5;
        if (obj == C13881Tj4.A0c) {
            sRb2 = this.A0F;
        } else {
            if (obj == C13881Tj4.A01) {
                C11388SRb sRb3 = this.A02;
                if (sRb3 != null) {
                    this.A0G.A0M.remove(sRb3);
                }
                if (sir == null) {
                    this.A02 = null;
                    return;
                }
                QGN qgn = new QGN(sir, (Object) null);
                this.A02 = qgn;
                qgn.A09(this);
                sgi = this.A0G;
                sRb = this.A02;
            } else if (obj == C13881Tj4.A0f) {
                QGN qgn2 = this.A04;
                if (qgn2 != null) {
                    this.A0G.A0M.remove(qgn2);
                }
                if (sir == null) {
                    this.A04 = null;
                    return;
                }
                this.A05.A07();
                this.A06.A07();
                QGN qgn3 = new QGN(sir, (Object) null);
                this.A04 = qgn3;
                qgn3.A09(this);
                sgi = this.A0G;
                sRb = this.A04;
            } else if (obj == C13881Tj4.A0B) {
                sRb2 = this.A01;
                if (sRb2 == null) {
                    QGN qgn4 = new QGN(sir, (Object) null);
                    this.A01 = qgn4;
                    qgn4.A09(this);
                    sgi = this.A0G;
                    sRb = this.A01;
                }
            } else if (obj == C13881Tj4.A0b && (sge5 = this.A03) != null) {
                sRb2 = sge5.A01;
            } else if (obj == C13881Tj4.A0F && (sge4 = this.A03) != null) {
                sge4.A01(sir);
                return;
            } else if (obj == C13881Tj4.A0D && (sge3 = this.A03) != null) {
                sRb2 = sge3.A02;
            } else if (obj == C13881Tj4.A0E && (sge2 = this.A03) != null) {
                sRb2 = sge2.A03;
            } else if (obj == C13881Tj4.A0G && (sge = this.A03) != null) {
                sRb2 = sge.A04;
            } else {
                return;
            }
            sgi.A0C(sRb);
            return;
        }
        sRb2.A0A(sir);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AQI(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23) {
        /*
            r20 = this;
            r4 = r20
            boolean r0 = r4.A0K
            if (r0 != 0) goto L_0x0111
            android.graphics.Path r8 = r4.A0C
            r8.reset()
            r9 = 0
            r2 = 0
        L_0x000d:
            java.util.List r1 = r4.A0J
            int r0 = r1.size()
            r10 = r22
            if (r2 >= r0) goto L_0x001d
            X.C13913TlF.A00(r10, r8, r1, r2)
            int r2 = r2 + 1
            goto L_0x000d
        L_0x001d:
            android.graphics.RectF r0 = r4.A0D
            r8.computeBounds(r0, r9)
            java.lang.Integer r2 = r4.A0H
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            int r0 = r4.A00()
            if (r2 != r1) goto L_0x00c6
            X.01c r7 = r4.A05
            long r5 = (long) r0
            java.lang.Object r12 = r7.A05(r5)
            android.graphics.Shader r12 = (android.graphics.Shader) r12
            if (r12 != 0) goto L_0x0069
            X.SRb r0 = r4.A09
            android.graphics.PointF r3 = X.C11388SRb.A03(r0)
            X.SRb r0 = r4.A08
            android.graphics.PointF r2 = X.C11388SRb.A03(r0)
            X.SRb r0 = r4.A07
            java.lang.Object r1 = r0.A06()
            X.S5S r1 = (X.S5S) r1
            int[] r0 = r1.A01
            int[] r17 = r4.A01(r0)
            float[] r1 = r1.A00
            float r13 = r3.x
            float r14 = r3.y
            float r15 = r2.x
            float r0 = r2.y
            android.graphics.Shader$TileMode r19 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.LinearGradient r12 = new android.graphics.LinearGradient
            r18 = r1
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
        L_0x0066:
            r7.A09(r5, r12)
        L_0x0069:
            r12.setLocalMatrix(r10)
            android.graphics.Paint r3 = r4.A0B
            r3.setShader(r12)
            X.SRb r0 = r4.A02
            X.Pxj.A15(r3, r0)
            X.SRb r0 = r4.A01
            if (r0 == 0) goto L_0x0089
            float r2 = X.C11388SRb.A01(r0)
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00b8
            r1 = 0
        L_0x0084:
            r3.setMaskFilter(r1)
        L_0x0087:
            r4.A00 = r2
        L_0x0089:
            X.Sge r0 = r4.A03
            if (r0 == 0) goto L_0x0090
            r0.A00(r3)
        L_0x0090:
            r0 = r23
            float r2 = (float) r0
            r1 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 / r1
            X.SRb r0 = r4.A0F
            java.lang.Object r0 = r0.A06()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            float r0 = (float) r0
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r0
            float r2 = r2 * r1
            int r2 = (int) r2
            r1 = 255(0xff, float:3.57E-43)
            android.graphics.PointF r0 = X.SQL.A00
            int r0 = X.Pxf.A01(r1, r2, r9)
            r3.setAlpha(r0)
            r0 = r21
            r0.drawPath(r8, r3)
            return
        L_0x00b8:
            float r0 = r4.A00
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0087
            android.graphics.BlurMaskFilter$Blur r0 = android.graphics.BlurMaskFilter.Blur.NORMAL
            android.graphics.BlurMaskFilter r1 = new android.graphics.BlurMaskFilter
            r1.<init>(r2, r0)
            goto L_0x0084
        L_0x00c6:
            X.01c r7 = r4.A06
            long r5 = (long) r0
            java.lang.Object r12 = r7.A05(r5)
            android.graphics.Shader r12 = (android.graphics.Shader) r12
            if (r12 != 0) goto L_0x0069
            X.SRb r0 = r4.A09
            android.graphics.PointF r3 = X.C11388SRb.A03(r0)
            X.SRb r0 = r4.A08
            android.graphics.PointF r2 = X.C11388SRb.A03(r0)
            X.SRb r0 = r4.A07
            java.lang.Object r1 = r0.A06()
            X.S5S r1 = (X.S5S) r1
            int[] r0 = r1.A01
            int[] r16 = r4.A01(r0)
            float[] r11 = r1.A00
            float r13 = r3.x
            float r14 = r3.y
            float r1 = r2.x
            float r0 = r2.y
            float r1 = r1 - r13
            double r2 = (double) r1
            float r0 = r0 - r14
            double r0 = (double) r0
            double r0 = java.lang.Math.hypot(r2, r0)
            float r15 = (float) r0
            r0 = 0
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0106
            r15 = 981668463(0x3a83126f, float:0.001)
        L_0x0106:
            android.graphics.Shader$TileMode r18 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.RadialGradient r12 = new android.graphics.RadialGradient
            r17 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18)
            goto L_0x0066
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11795Sgh.AQI(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final void Aha(Matrix matrix, RectF rectF, boolean z) {
        Path path = this.A0C;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.A0J;
            if (i < list.size()) {
                C13913TlF.A00(matrix, path, list, i);
                i++;
            } else {
                path.computeBounds(rectF, false);
                Pxj.A16(rectF, rectF.left, 1.0f);
                return;
            }
        }
    }

    public final void Dwx() {
        this.A0E.invalidateSelf();
    }

    public final String getName() {
        return this.A0I;
    }

    public C11795Sgh(S7N s7n, Q6Y q6y, C11806Sgs sgs, C11796Sgi sgi) {
        Path A0C2 = C51965G9l.A0C();
        this.A0C = A0C2;
        this.A0B = new Paint(1);
        this.A0D = AnonymousClass7TE.A0Y();
        this.A0J = AnonymousClass7TE.A1C();
        this.A00 = 0.0f;
        this.A0G = sgi;
        this.A0I = sgs.A06;
        this.A0K = sgs.A07;
        this.A0E = q6y;
        this.A0H = sgs.A05;
        A0C2.setFillType(sgs.A00);
        this.A0A = (int) (s7n.A00() / 32.0f);
        QGS qgs = new QGS(sgs.A01.A00);
        this.A07 = qgs;
        qgs.A09(this);
        sgi.A0C(qgs);
        C11388SRb sRb = new C11388SRb(sgs.A02.A00);
        this.A0F = sRb;
        sRb.A09(this);
        sgi.A0C(sRb);
        QGV qgv = new QGV(sgs.A04.A00);
        this.A09 = qgv;
        qgv.A09(this);
        sgi.A0C(qgv);
        QGV qgv2 = new QGV(sgs.A03.A00);
        this.A08 = qgv2;
        qgv2.A09(this);
        sgi.A0C(qgv2);
        C10157RnY A082 = sgi.A08();
        if (A082 != null) {
            QGR A002 = C11802Sgo.A00(A082.A00);
            this.A01 = A002;
            A002.A09(this);
            sgi.A0C(this.A01);
        }
        C10723Rx1 A092 = sgi.A09();
        if (A092 != null) {
            this.A03 = new C11792Sge(this, sgi, A092);
        }
    }

    public final void EIb(SPM spm, SPM spm2, List list, int i) {
        SQL.A02(this, spm, spm2, list, i);
    }
}
