package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: X.91P  reason: invalid class name */
public abstract class AnonymousClass91P extends AnonymousClass91Q {
    public final Rect A00 = new Rect();
    public final int A01;

    public AnonymousClass91P(Resources resources) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        RectF rectF = 0nA.A01;
        this.A01 = (int) TypedValue.applyDimension(1, 15.0f, displayMetrics);
    }

    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        0qQ.A0B(canvas, 0);
        0qQ.A0B(paint, 1);
        0qQ.A0B(charSequence, 7);
        super.drawBackground(canvas, paint, i, i2, i3, i4, i5, charSequence, i6, i7, i8);
        if (this.A04 == this.A05) {
            TextPaint textPaint = this.A06;
            String obj = charSequence.toString();
            int i9 = this.A04;
            int i10 = this.A03;
            Rect rect = this.A00;
            textPaint.getTextBounds(obj, i9, i10, rect);
            float f = this.A01;
            rect.set(Math.round(f), rect.top + i4, Math.round(f + this.A02), i4 + Math.max(rect.bottom, this.A01));
        }
    }

    public AnonymousClass91P(int i) {
        this.A01 = i;
    }
}
