package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.WKx  reason: case insensitive filesystem */
public final class C19090WKx implements C20972X7c {
    public final int A00;
    public final Drawable A01;

    public final void AQN(Canvas canvas, Paint paint, Rect rect, int i) {
        0qQ.A0B(paint, 3);
        Drawable drawable = this.A01;
        drawable.setColorFilter(paint.getColorFilter());
        drawable.setAlpha(paint.getAlpha());
        float width = ((float) rect.width()) / BIf();
        float height = ((float) rect.height()) / BIe();
        int i2 = this.A00;
        int i3 = i % i2;
        float BIf = ((float) rect.left) + (((float) (-i3)) * BIf());
        float BIe = ((float) rect.top) + (((float) (-(i / i2))) * BIe());
        int save = canvas.save();
        try {
            canvas.clipRect(rect);
            canvas.scale(width, height, (float) rect.left, (float) rect.top);
            canvas.translate(BIf, BIe);
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final float BIe() {
        return ((float) this.A01.getIntrinsicHeight()) / 1.0f;
    }

    public final float BIf() {
        return ((float) this.A01.getIntrinsicWidth()) / ((float) this.A00);
    }

    public C19090WKx(Drawable drawable, int i) {
        this.A01 = drawable;
        this.A00 = i;
        drawable.mutate();
        C13989Tnp.A13(drawable);
    }
}
