package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* renamed from: X.I9q  reason: case insensitive filesystem */
public final class C56730I9q implements LeadingMarginSpan {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Context A03;

    public final int getLeadingMargin(boolean z) {
        return (this.A00 * 2) + this.A02;
    }

    public /* synthetic */ C56730I9q(Context context, int i, int i2) {
        int A07 = 2Yu.A07(context);
        this.A03 = context;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = A07;
    }

    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        float f;
        AnonymousClass7TG.A1N(canvas, paint);
        0qQ.A0B(charSequence, 7);
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            AnonymousClass7TE.A1Q(paint);
            int i8 = this.A01;
            if (i8 != 2Yu.A07(this.A03)) {
                paint.setColor(i8);
            }
            int i9 = this.A00;
            float f2 = (float) (i + (i2 * i9));
            Layout layout2 = layout;
            if (layout != null) {
                f = ((float) layout2.getLineBaseline(layout2.getLineForOffset(i6))) - ((float) i9);
            } else {
                f = ((float) (i3 + i5)) / 2.0f;
            }
            canvas.drawCircle(f2, f, (float) i9, paint);
            paint.setStyle(style);
            paint.setColor(color);
        }
    }
}
