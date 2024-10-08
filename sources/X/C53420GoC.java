package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.GoC  reason: case insensitive filesystem */
public final class C53420GoC extends AnonymousClass0T0 implements C59666JSl {
    public final float A00;
    public final long A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53420GoC) {
                C53420GoC goC = (C53420GoC) obj;
                long j = this.A02;
                long j2 = goC.A02;
                long j3 = C55305HfY.A00;
                if (!(j == j2 && this.A01 == goC.A01 && Float.compare(this.A00, goC.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void AQJ(Canvas canvas, Paint paint) {
        long j = this.A02;
        long j2 = C55305HfY.A00;
        RectF A012 = I4V.A01(C51968G9o.A00(j), C51972G9s.A00(j), this.A01);
        float f = this.A00;
        canvas.drawRoundRect(A012, f, f, paint);
    }

    public final int hashCode() {
        long j = this.A02;
        long j2 = C55305HfY.A00;
        return C51966G9m.A02(AnonymousClass7TF.A01(this.A01, C51967G9n.A02(j)), this.A00);
    }

    public C53420GoC(float f, long j, long j2) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = f;
    }
}
