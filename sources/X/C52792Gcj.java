package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Gcj  reason: case insensitive filesystem */
public final class C52792Gcj extends Drawable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Paint A03;
    public final RectF A04 = AnonymousClass7TE.A0Y();
    public final RectF A05 = AnonymousClass7TE.A0Y();
    public final RectF A06 = AnonymousClass7TE.A0Y();

    public final int getOpacity() {
        return -3;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        RectF rectF = this.A06;
        Paint paint = this.A03;
        Canvas canvas2 = canvas;
        canvas2.drawArc(rectF, 298.0f, 215.0f, false, paint);
        canvas2.drawArc(this.A04, 121.0f, 208.0f, false, paint);
    }

    public final void setAlpha(int i) {
        Paint paint = this.A03;
        if (paint.getAlpha() != i) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    public C52792Gcj(int i, int i2, int i3, int i4) {
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A03 = A0V;
        A0V.setColor(i2);
        A0V.setStyle(Paint.Style.STROKE);
        A0V.setStrokeWidth((float) i);
        this.A00 = i3;
        this.A01 = i;
        this.A02 = i4 + i;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int i = rect.right;
        float f = (float) (i / 2);
        int i2 = this.A00;
        float f2 = (float) (i2 / 2);
        float sqrt = (float) (((double) f) - (Math.sqrt(Math.pow((double) (f - f2), 2.0d) / 2.0d) + ((double) f2)));
        int i3 = rect.bottom;
        float f3 = (float) (i - i3);
        RectF rectF = this.A06;
        int i4 = this.A02;
        rectF.set(((float) ((i - i2) - i4)) - sqrt, (((float) ((i3 - i2) - i4)) - sqrt) + f3, ((float) i) - sqrt, (((float) i3) - sqrt) + f3);
        RectF rectF2 = this.A04;
        int i5 = rect.left;
        int i6 = rect.top;
        rectF2.set(((float) i5) + sqrt, ((float) i6) + sqrt, ((float) (i5 + i2 + i4)) + sqrt, ((float) (i6 + i2 + i4)) + sqrt);
        RectF rectF3 = this.A05;
        int i7 = rect.right;
        float f4 = (float) this.A01;
        int i8 = rect.bottom;
        rectF3.set((((float) ((i7 - i2) - i4)) - sqrt) + f4, (((float) ((i8 - i2) - i4)) - sqrt) + f3 + f4, (((float) i7) - sqrt) - f4, ((((float) i8) - sqrt) + f3) - f4);
    }
}
