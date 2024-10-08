package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.Y0s  reason: case insensitive filesystem */
public final class C22364Y0s implements MT0 {
    public final int A00;
    public final int A01;
    public final Paint A02;

    public final void AQH(Canvas canvas, int i, int i2) {
        int i3 = 0;
        while (i3 < i) {
            canvas.drawRect((float) i3, 0.0f, (float) (this.A01 + i3), (float) i2, this.A02);
            i3 += this.A00;
        }
    }

    public C22364Y0s(int i, Paint paint) {
        this.A02 = paint;
        this.A01 = i;
        this.A00 = i * 2;
    }
}
