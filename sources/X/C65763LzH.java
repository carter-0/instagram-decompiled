package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.LzH  reason: case insensitive filesystem */
public final class C65763LzH implements MT0 {
    public Paint A00;
    public Paint A01;
    public final int A02;
    public final int A03;

    public final void AQH(Canvas canvas, int i, int i2) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = 0;
            while (i4 < i2) {
                int i5 = this.A03;
                float f = (float) (i3 + i5);
                float f2 = (float) (i5 + i4);
                canvas.drawRect((float) i3, (float) i4, f, f2, this.A00);
                int i6 = this.A02;
                int i7 = i6 + i4;
                canvas.drawRect(f, f2, (float) (i3 + i6), (float) i7, this.A01);
                i4 = i7;
            }
            i3 += this.A02;
        }
    }

    public C65763LzH(int i) {
        this.A02 = i;
        this.A03 = i / 2;
        Paint A0C = JTO.A0C();
        this.A00 = A0C;
        A0C.setColor(587137024);
        Paint A0C2 = JTO.A0C();
        this.A01 = A0C2;
        A0C2.setColor(570425344);
    }
}
