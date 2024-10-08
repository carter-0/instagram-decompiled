package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public final class QGJ extends C11793Sgf {
    public C11388SRb A00;
    public final C11388SRb A01;
    public final C11796Sgi A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public QGJ(X.Q6Y r13, X.C11807Sgt r14, X.C11796Sgi r15) {
        /*
            r12 = this;
            java.lang.Integer r0 = r14.A05
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0056
            r0 = 1
            if (r1 == r0) goto L_0x0053
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.SQUARE
        L_0x000e:
            java.lang.Integer r0 = r14.A06
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L_0x0050
            r0 = 0
            if (r1 == r0) goto L_0x004d
            r0 = 1
            if (r1 == r0) goto L_0x004a
            r4 = 0
        L_0x001e:
            float r11 = r14.A00
            X.QGa r8 = r14.A04
            X.QGY r6 = r14.A03
            java.util.List r10 = r14.A08
            X.QGY r7 = r14.A02
            r2 = r12
            r5 = r13
            r9 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A02 = r15
            java.lang.String r0 = r14.A07
            r12.A03 = r0
            boolean r0 = r14.A09
            r12.A04 = r0
            X.QGX r0 = r14.A01
            java.util.List r1 = r0.A00
            X.QGP r0 = new X.QGP
            r0.<init>(r1)
            r12.A01 = r0
            r0.A09(r12)
            r15.A0C(r0)
            return
        L_0x004a:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.ROUND
            goto L_0x001e
        L_0x004d:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER
            goto L_0x001e
        L_0x0050:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.BEVEL
            goto L_0x001e
        L_0x0053:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            goto L_0x000e
        L_0x0056:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.BUTT
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QGJ.<init>(X.Q6Y, X.Sgt, X.Sgi):void");
    }

    public final void AQI(Canvas canvas, Matrix matrix, int i) {
        if (!this.A04) {
            Paint paint = this.A04;
            QGP qgp = (QGP) this.A01;
            paint.setColor(qgp.A0B(qgp.A06.Au7(), qgp.A04()));
            Pxj.A15(paint, this.A00);
            super.AQI(canvas, matrix, i);
        }
    }

    public final String getName() {
        return this.A03;
    }

    public final void AAd(SIR sir, Object obj) {
        super.AAd(sir, obj);
        if (obj == C13881Tj4.A0d) {
            this.A01.A0A(sir);
        } else if (obj == C13881Tj4.A01) {
            C11388SRb sRb = this.A00;
            if (sRb != null) {
                this.A02.A0M.remove(sRb);
            }
            if (sir == null) {
                this.A00 = null;
                return;
            }
            QGN A002 = QGN.A00(sir);
            this.A00 = A002;
            A002.A09(this);
            this.A02.A0C(this.A01);
        }
    }
}
