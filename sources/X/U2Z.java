package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

public final class U2Z extends ReplacementSpan {
    public final String A00;

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence.subSequence(i, i2));
        canvas.drawText(AnonymousClass7TF.A0l(this.A00, sb), f, (float) i4, paint);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (paint.measureText(this.A00, 0, 1) + paint.measureText(charSequence, i, i2));
    }

    public U2Z(String str) {
        this.A00 = str;
    }
}
