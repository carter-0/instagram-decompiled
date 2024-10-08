package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.U0s  reason: case insensitive filesystem */
public final class C14672U0s extends Drawable {
    public final int A00;
    public final Drawable A01;
    public final C244303ay A02;

    public final int getOpacity() {
        return -3;
    }

    public final void draw(Canvas canvas) {
        this.A02.draw(canvas);
        this.A01.draw(canvas);
    }

    public final int getIntrinsicHeight() {
        return this.A02.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A02.A01;
    }

    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
        this.A01.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
        this.A01.setColorFilter(colorFilter);
    }

    public C14672U0s(Drawable drawable, C244303ay r2, int i) {
        this.A02 = r2;
        this.A01 = drawable;
        this.A00 = i;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float intrinsicWidth = ((float) getIntrinsicWidth()) / 2.0f;
        float f3 = f - intrinsicWidth;
        float intrinsicHeight = ((float) getIntrinsicHeight()) / 2.0f;
        float f4 = f2 - intrinsicHeight;
        float f5 = f + intrinsicWidth;
        float f6 = f2 + intrinsicHeight;
        C244303ay r4 = this.A02;
        float f7 = (float) r4.A01;
        r4.setBounds((int) f3, (int) f4, (int) (f3 + f7), (int) (f4 + f7));
        Drawable drawable = this.A01;
        float f8 = (float) this.A00;
        drawable.setBounds((int) (f5 - f8), (int) (f6 - f8), (int) f5, (int) f6);
    }
}
