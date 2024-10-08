package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

public final class QGK extends C11793Sgf {
    public QGN A00;
    public final 01c A01;
    public final 01c A02;
    public final C11388SRb A03;
    public final C11388SRb A04;
    public final C11388SRb A05;
    public final int A06;
    public final RectF A07;
    public final Integer A08;
    public final String A09;
    public final boolean A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public QGK(X.Q6Y r13, X.C11809Sgv r14, X.C11796Sgi r15) {
        /*
            r12 = this;
            java.lang.Integer r0 = r14.A07
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x009b
            r0 = 1
            if (r1 == r0) goto L_0x0097
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.SQUARE
        L_0x000e:
            java.lang.Integer r0 = r14.A09
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L_0x0094
            r0 = 0
            if (r1 == r0) goto L_0x0091
            r0 = 1
            if (r1 == r0) goto L_0x008e
            r4 = 0
        L_0x001e:
            float r11 = r14.A00
            X.QGa r8 = r14.A04
            X.QGY r6 = r14.A02
            java.util.List r10 = r14.A0B
            X.QGY r7 = r14.A01
            r2 = r12
            r5 = r13
            r9 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.01c r0 = new X.01c
            r0.<init>()
            r12.A01 = r0
            X.01c r0 = new X.01c
            r0.<init>()
            r12.A02 = r0
            android.graphics.RectF r0 = X.AnonymousClass7TE.A0Y()
            r12.A07 = r0
            java.lang.String r0 = r14.A0A
            r12.A09 = r0
            java.lang.Integer r0 = r14.A08
            r12.A08 = r0
            boolean r0 = r14.A0C
            r12.A0A = r0
            X.S7N r0 = r13.A0G
            float r1 = r0.A00()
            r0 = 1107296256(0x42000000, float:32.0)
            float r1 = r1 / r0
            int r0 = (int) r1
            r12.A06 = r0
            X.QGZ r0 = r14.A03
            java.util.List r1 = r0.A00
            X.QGS r0 = new X.QGS
            r0.<init>(r1)
            r12.A03 = r0
            r0.A09(r12)
            r15.A0C(r0)
            X.QGb r0 = r14.A06
            java.util.List r1 = r0.A00
            X.QGV r0 = new X.QGV
            r0.<init>(r1)
            r12.A05 = r0
            r0.A09(r12)
            r15.A0C(r0)
            X.QGb r0 = r14.A05
            java.util.List r1 = r0.A00
            X.QGV r0 = new X.QGV
            r0.<init>(r1)
            r12.A04 = r0
            r0.A09(r12)
            r15.A0C(r0)
            return
        L_0x008e:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.ROUND
            goto L_0x001e
        L_0x0091:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER
            goto L_0x001e
        L_0x0094:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.BEVEL
            goto L_0x001e
        L_0x0097:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            goto L_0x000e
        L_0x009b:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.BUTT
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QGK.<init>(X.Q6Y, X.Sgv, X.Sgi):void");
    }

    private int A00() {
        float f = this.A05.A02;
        float f2 = (float) this.A06;
        int A052 = AnonymousClass7TE.A05(f, f2);
        int A053 = AnonymousClass7TE.A05(this.A04.A02, f2);
        int A054 = AnonymousClass7TE.A05(this.A03.A02, f2);
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
        QGN qgn = this.A00;
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

    public final void AQI(Canvas canvas, Matrix matrix, int i) {
        01c r7;
        long j;
        Shader shader;
        if (!this.A0A) {
            Matrix matrix2 = matrix;
            Aha(matrix2, this.A07, false);
            Integer num = this.A08;
            Integer num2 = AnonymousClass05K.A00;
            int A002 = A00();
            if (num == num2) {
                r7 = this.A01;
                j = (long) A002;
                shader = (Shader) r7.A05(j);
                if (shader == null) {
                    PointF A032 = C11388SRb.A03(this.A05);
                    PointF A033 = C11388SRb.A03(this.A04);
                    S5S s5s = (S5S) this.A03.A06();
                    shader = new LinearGradient(A032.x, A032.y, A033.x, A033.y, A01(s5s.A01), s5s.A00, Shader.TileMode.CLAMP);
                }
                shader.setLocalMatrix(matrix2);
                this.A04.setShader(shader);
                super.AQI(canvas, matrix2, i);
            }
            r7 = this.A02;
            j = (long) A002;
            shader = (Shader) r7.A05(j);
            if (shader == null) {
                PointF A034 = C11388SRb.A03(this.A05);
                PointF A035 = C11388SRb.A03(this.A04);
                S5S s5s2 = (S5S) this.A03.A06();
                int[] A012 = A01(s5s2.A01);
                float[] fArr = s5s2.A00;
                float f = A034.x;
                float f2 = A034.y;
                shader = new RadialGradient(f, f2, (float) Math.hypot((double) (A035.x - f), (double) (A035.y - f2)), A012, fArr, Shader.TileMode.CLAMP);
            }
            shader.setLocalMatrix(matrix2);
            this.A04.setShader(shader);
            super.AQI(canvas, matrix2, i);
            r7.A09(j, shader);
            shader.setLocalMatrix(matrix2);
            this.A04.setShader(shader);
            super.AQI(canvas, matrix2, i);
        }
    }

    public final String getName() {
        return this.A09;
    }

    public final void AAd(SIR sir, Object obj) {
        super.AAd(sir, obj);
        if (obj == C13881Tj4.A0f) {
            QGN qgn = this.A00;
            if (qgn != null) {
                this.A0G.A0M.remove(qgn);
            }
            if (sir == null) {
                this.A00 = null;
                return;
            }
            QGN A002 = QGN.A00(sir);
            this.A00 = A002;
            A002.A09(this);
            this.A0G.A0C(this.A00);
        }
    }
}
