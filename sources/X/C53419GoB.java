package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.GoB  reason: case insensitive filesystem */
public final class C53419GoB extends AnonymousClass0T0 implements C59666JSl {
    public final float A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53419GoB) {
                C53419GoB goB = (C53419GoB) obj;
                long j = this.A01;
                long j2 = goB.A01;
                long j3 = C55305HfY.A00;
                if (!(j == j2 && Float.compare(this.A00, goB.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void AQJ(Canvas canvas, Paint paint) {
        long j = this.A01;
        long j2 = C55305HfY.A00;
        canvas.drawCircle(C51971G9r.A01(j), C51972G9s.A00(j), this.A00, paint);
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = C55305HfY.A00;
        return C51966G9m.A02(C51975G9x.A03(j), this.A00);
    }

    public C53419GoB(long j, float f) {
        this.A01 = j;
        this.A00 = f;
    }
}
