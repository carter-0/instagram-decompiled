package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.6Xv  reason: invalid class name and case insensitive filesystem */
public final class C309326Xv extends C309336Xw {
    public float A00;
    public float A01;
    public float A02;
    public int A03;

    public static void A00(Canvas canvas, Paint paint, RectF rectF, C309326Xv r15, float f, float f2, float f3, boolean z) {
        float f4 = 1.0f;
        if (z) {
            f4 = -1.0f;
        }
        Canvas canvas2 = canvas;
        canvas.save();
        canvas.rotate(f3);
        float f5 = r15.A00;
        float f6 = f / 2.0f;
        float f7 = ((float) r15.A03) * f4 * f2;
        canvas2.drawRect((f5 - f6) + f2, Math.min(0.0f, f7), (f5 + f6) - f2, Math.max(0.0f, f7), paint);
        canvas2.translate((r15.A00 - f6) + f2, 0.0f);
        RectF rectF2 = rectF;
        canvas2.drawArc(rectF2, 180.0f, (-f4) * 90.0f * ((float) r15.A03), true, paint);
        canvas2.translate(f - (f2 * 2.0f), 0.0f);
        canvas2.drawArc(rectF2, 0.0f, f4 * 90.0f * ((float) r15.A03), true, paint);
        canvas2.restore();
    }
}
