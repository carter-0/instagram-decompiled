package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: X.46l  reason: invalid class name and case insensitive filesystem */
public final class C2606346l extends ImageSpan {
    public int A00 = 0;
    public int A01 = 0;
    public Integer A02 = AnonymousClass05K.A00;
    public final Paint.FontMetrics A03 = new Paint.FontMetrics();

    public C2606346l(Drawable drawable) {
        super(drawable);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2;
        Drawable drawable = getDrawable();
        Paint.FontMetrics fontMetrics = this.A03;
        paint.getFontMetrics(fontMetrics);
        int intValue = this.A02.intValue();
        float f3 = 0.0f;
        if (intValue == 0) {
            f2 = fontMetrics.ascent;
            f3 = fontMetrics.descent;
        } else if (intValue == 1) {
            f2 = fontMetrics.top;
            f3 = fontMetrics.bottom;
        } else if (intValue == 2) {
            f2 = fontMetrics.ascent;
        } else if (intValue == 3) {
            f2 = fontMetrics.top / 2.0f;
        } else {
            throw new UnsupportedOperationException("Unknown alignment type");
        }
        canvas.save();
        drawable.getClass();
        canvas.translate(f + ((float) this.A00), (((f2 + f3) / 2.0f) + ((float) i4)) - drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Drawable drawable = getDrawable();
        drawable.getClass();
        return drawable.getBounds().right + this.A00 + this.A01;
    }
}
