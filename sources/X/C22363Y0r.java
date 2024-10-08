package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.Y0r  reason: case insensitive filesystem */
public final class C22363Y0r implements MT0 {
    public final int A00;
    public final int A01;
    public final Paint A02;

    public final void AQH(Canvas canvas, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            canvas.drawRect(0.0f, (float) i3, (float) i, (float) (this.A01 + i3), this.A02);
            i3 += this.A00;
        }
    }

    public C22363Y0r(int i, Paint paint) {
        this.A02 = paint;
        this.A01 = i;
        this.A00 = i * 2;
    }
}
