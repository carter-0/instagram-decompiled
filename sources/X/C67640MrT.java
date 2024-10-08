package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.MrT  reason: case insensitive filesystem */
public final class C67640MrT extends Drawable {
    public Paint A00;
    public final Paint A01;
    public final double A02;
    public final RectF A03 = AnonymousClass7TE.A0Y();

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        RectF rectF = this.A03;
        canvas.drawRoundRect(rectF, 999.0f, 999.0f, this.A00);
        canvas.drawRoundRect(rectF, 999.0f, 999.0f, this.A01);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A03;
        rectF.set(rect);
        float f = (float) this.A02;
        rectF.inset(f, f);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C67640MrT(int i, int i2, int i3) {
        Paint A0V = AnonymousClass7TE.A0V(1);
        A0V.setColor(i2);
        A0V.setStyle(Paint.Style.STROKE);
        A0V.setStrokeWidth((float) i);
        this.A01 = A0V;
        this.A02 = ((double) i) / 2.0d;
        Paint A0V2 = AnonymousClass7TE.A0V(1);
        A0V2.setColor(i3);
        this.A00 = A0V2;
    }
}
