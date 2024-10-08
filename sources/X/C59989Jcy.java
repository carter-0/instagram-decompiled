package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jcy  reason: case insensitive filesystem */
public final class C59989Jcy extends Drawable {
    public float A00 = 0.0f;
    public int A01 = 0;
    public int A02 = 0;
    public final float A03;
    public final float A04;
    public final Paint A05;
    public final C59970Jcf A06;

    public final int getOpacity() {
        return -3;
    }

    public final Drawable.ConstantState getConstantState() {
        return this.A06;
    }

    public final int getIntrinsicHeight() {
        return this.A06.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A06.A00;
    }

    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
    }

    public C59989Jcy(Typeface typeface, String str, int i) {
        Paint A0C = JTO.A0C();
        this.A05 = A0C;
        this.A06 = new C59970Jcf(typeface, str, i);
        A0C.setTypeface(typeface);
        A0C.setTextAlign(Paint.Align.CENTER);
        A0C.setTextSize(64.0f);
        Paint.FontMetrics fontMetrics = A0C.getFontMetrics();
        float f = fontMetrics.descent;
        float f2 = fontMetrics.ascent;
        this.A03 = 64.0f / ((f - f2) * 1.0625f);
        this.A04 = (-f2) / 64.0f;
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawText(this.A06.A01, (float) ((bounds.left + bounds.right) / 2), ((float) bounds.top) + this.A00, this.A05);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != this.A02 || i6 != this.A01) {
            this.A02 = i5;
            this.A01 = i6;
            float min = ((float) Math.min(i5, i6)) * this.A03;
            this.A05.setTextSize(min);
            this.A00 = min * this.A04;
        }
    }
}
