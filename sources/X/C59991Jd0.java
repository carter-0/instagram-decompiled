package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jd0  reason: case insensitive filesystem */
public final class C59991Jd0 extends Drawable {
    public int A00;
    public int A01;
    public int A02;
    public final Paint A03;
    public final RectF A04 = AnonymousClass7TE.A0Y();
    public final RectF A05 = AnonymousClass7TE.A0Y();

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        RectF rectF = this.A04;
        Paint paint = this.A03;
        canvas.drawRect(rectF, paint);
        canvas.drawRect(this.A05, paint);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        A00(this);
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C59991Jd0(int i) {
        Paint A0D = JTP.A0D();
        this.A03 = A0D;
        A0D.setColor(i);
    }

    public static final void A00(C59991Jd0 jd0) {
        Rect A0X = AnonymousClass7TE.A0X(jd0);
        RectF rectF = jd0.A04;
        float f = (float) A0X.left;
        rectF.set(f, (float) A0X.top, f + ((float) jd0.A00), (float) A0X.bottom);
        RectF rectF2 = jd0.A05;
        float f2 = (float) jd0.A02;
        rectF2.set(f2, (float) A0X.top, f2 + ((float) jd0.A01), (float) A0X.bottom);
    }
}
