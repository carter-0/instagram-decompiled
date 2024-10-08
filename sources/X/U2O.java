package X;

import android.graphics.Paint;
import android.text.style.ImageSpan;

public final class U2O extends ImageSpan {
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        0qQ.A0B(paint, 0);
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        getDrawable().setBounds(0, fontMetricsInt2.ascent, AnonymousClass7TE.A06((float) (fontMetricsInt2.bottom - fontMetricsInt2.ascent), ((float) getDrawable().getIntrinsicWidth()) / ((float) getDrawable().getIntrinsicHeight())), fontMetricsInt2.bottom);
        return super.getSize(paint, charSequence, i, i2, fontMetricsInt);
    }
}
