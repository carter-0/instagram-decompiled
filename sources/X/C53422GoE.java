package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.GoE  reason: case insensitive filesystem */
public final class C53422GoE extends AnonymousClass0T0 implements C59666JSl, JLY {
    public final int A00;
    public final long A01;
    public final long A02;

    public C53422GoE(long j, long j2, int i) {
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    public final void AQJ(Canvas canvas, Paint paint) {
        int i = this.A00;
        long j = this.A02;
        long j2 = C55305HfY.A00;
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        if (i != 0) {
            float A002 = C51968G9o.A00(j);
            float A003 = C51972G9s.A00(j);
            long j3 = this.A01;
            canvas2.drawLine(A002, A003, C51968G9o.A00(j3), C51972G9s.A00(j3), paint2);
            return;
        }
        canvas.drawOval(I4V.A01(C51968G9o.A00(j), C51972G9s.A00(j), this.A01), paint);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof C53422GoE)) {
            return false;
        }
        C53422GoE goE = (C53422GoE) obj;
        if (goE.A00 != i) {
            return false;
        }
        long j = this.A02;
        long j2 = goE.A02;
        long j3 = C55305HfY.A00;
        if (j == j2 && this.A01 == goE.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.A02;
        long j2 = C55305HfY.A00;
        int A022 = C51967G9n.A02(j);
        long j3 = this.A01;
        return A022 + ((int) (j3 ^ (j3 >>> 32)));
    }
}
