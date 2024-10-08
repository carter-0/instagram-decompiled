package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.Gkc  reason: case insensitive filesystem */
public final class C53228Gkc extends AnonymousClass3OI {
    public final float A00;
    public final float A01;
    public final RectF A02;

    public final void A00(Canvas canvas, Paint paint) {
        0qQ.A0B(paint, 1);
        canvas.drawRoundRect(this.A02, this.A00, this.A01, paint);
    }

    public C53228Gkc(RectF rectF, float f, float f2) {
        this.A02 = rectF;
        this.A00 = f;
        this.A01 = f2;
    }
}
