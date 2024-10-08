package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.3Mh  reason: invalid class name */
public final class AnonymousClass3Mh implements C240763Mg {
    public final void AQw(Canvas canvas, Paint paint, Paint paint2, RectF rectF, float f, float f2, float f3, float f4, int i, int i2, boolean z) {
        float A03 = (float) AnonymousClass37Q.A03((double) (1.0f - f4), 60.0d, 180.0d);
        float f5 = f3 + (((270.0f + (((float) i) * 180.0f)) - (180.0f / 2.0f)) - A03);
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        canvas2.drawArc(rectF2, f5, A03, false, paint);
        Paint paint3 = paint2;
        if (paint3.getAlpha() > 0) {
            canvas2.drawArc(rectF2, f5, A03, false, paint3);
        }
    }
}
