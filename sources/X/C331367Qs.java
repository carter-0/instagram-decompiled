package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.7Qs  reason: invalid class name and case insensitive filesystem */
public final class C331367Qs implements C328057Dg {
    public static final RectF A02 = new RectF();
    public final RectF A00 = new RectF();
    public final C242553Us A01 = new C242553Us();

    public final void AQJ(Canvas canvas, Paint paint) {
        C242553Us r0 = this.A01;
        float[] fArr = r0.A01;
        0qQ.A07(fArr);
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        switch (r0.A00.intValue()) {
            case 0:
            case 1:
                canvas.drawRoundRect(this.A00, fArr[0], fArr[1], paint);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
                canvas2.drawDoubleRoundRect(this.A00, fArr, A02, fArr, paint2);
                return;
            default:
                throw new RuntimeException();
        }
    }

    public final void EPz(RectF rectF) {
        this.A00.set(rectF);
    }

    public final void ESv(C242553Us r3) {
        this.A01.A08(r3, AnonymousClass05K.A00);
    }
}
