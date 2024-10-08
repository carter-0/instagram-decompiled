package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.8Pv  reason: invalid class name and case insensitive filesystem */
public class C355398Pv extends Drawable {
    public float A00;
    public int A01;
    public int A02;
    public final Paint A03;
    public final RectF A04 = new RectF();
    public final RectF A05 = new RectF();

    public void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        RectF rectF = this.A04;
        float f = this.A00;
        Paint paint = this.A03;
        canvas.drawRoundRect(rectF, f, f, paint);
        RectF rectF2 = this.A05;
        float f2 = this.A00;
        canvas.drawRoundRect(rectF2, f2, f2, paint);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        A00(this);
    }

    public static final void A00(C355398Pv r5) {
        r5.A04.set((float) r5.getBounds().left, (float) r5.getBounds().top, (float) (r5.getBounds().left + r5.A01), (float) r5.getBounds().bottom);
        r5.A05.set((float) (r5.getBounds().right - r5.A02), (float) r5.getBounds().top, (float) r5.getBounds().right, (float) r5.getBounds().bottom);
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C355398Pv(int i, int i2) {
        Paint paint = new Paint(1);
        this.A03 = paint;
        this.A00 = (float) i2;
        paint.setColor(i);
    }
}
