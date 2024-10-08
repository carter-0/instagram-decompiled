package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.9qT  reason: invalid class name and case insensitive filesystem */
public final class C389939qT extends AnonymousClass91Q {
    public final int A00;
    public final RectF A01 = AnonymousClass7TE.A0Y();

    public C389939qT(int i, Integer num) {
        this.A00 = i;
        0qQ.A0B(num, 0);
        this.A00 = num;
    }

    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        AnonymousClass7TG.A1N(canvas, paint);
        0qQ.A0B(charSequence, 7);
        super.drawBackground(canvas, paint, i, i2, i3, i4, i5, charSequence, i6, i7, i8);
        float f = ((float) (i5 - i3)) * 0.02f;
        paint.setColor(this.A00);
        RectF rectF = this.A01;
        float f2 = this.A01;
        float f3 = ((float) i4) + f;
        rectF.set(f2, f3, f2 + this.A02, f3 + f);
        canvas.drawRoundRect(rectF, f, f, this.A06);
    }
}
