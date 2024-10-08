package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* renamed from: X.I9p  reason: case insensitive filesystem */
public final class C56729I9p implements LeadingMarginSpan {
    public final int A00;
    public final int A01;
    public final int A02;

    public final int getLeadingMargin(boolean z) {
        return (this.A00 * 2) + this.A02;
    }

    public C56729I9p(int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        float f;
        AnonymousClass7TG.A1N(canvas, paint);
        0qQ.A0B(charSequence, 7);
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            AnonymousClass7TE.A1Q(paint);
            paint.setColor(this.A01);
            Layout layout2 = layout;
            if (layout != null) {
                f = ((float) layout2.getLineBaseline(layout2.getLineForOffset(i6))) - (((float) this.A00) * 2.0f);
            } else {
                f = ((float) (i3 + i5)) / 2.0f;
            }
            int i8 = this.A00;
            canvas.drawCircle((float) (i + (i2 * i8)), f, (float) i8, paint);
            paint.setStyle(style);
            paint.setColor(color);
        }
    }
}
