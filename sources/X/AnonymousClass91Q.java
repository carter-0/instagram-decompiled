package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LineBackgroundSpan;

/* renamed from: X.91Q  reason: invalid class name */
public class AnonymousClass91Q implements LineBackgroundSpan {
    public Integer A00 = AnonymousClass05K.A01;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public final TextPaint A06 = new TextPaint();

    public void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        float f;
        float f2;
        int i9 = i7;
        0qQ.A0B(paint, 1);
        CharSequence charSequence2 = charSequence;
        0qQ.A0B(charSequence2, 7);
        Spanned spanned = (Spanned) charSequence2;
        TextPaint textPaint = this.A06;
        textPaint.set(paint);
        int i10 = i6;
        CharSequence subSequence = spanned.subSequence(i10, i9);
        0qQ.A0C(subSequence, "null cannot be cast to non-null type android.text.Spanned");
        for (AnonymousClass91V updateMeasureState : (AnonymousClass91V[]) C263324Kh.A06((Spanned) subSequence, AnonymousClass91V.class)) {
            updateMeasureState.updateMeasureState(textPaint);
        }
        int i11 = i7 - 1;
        if (charSequence2.charAt(i11) == 10) {
            i9 = i11;
        }
        this.A05 = spanned.getSpanStart(this);
        this.A04 = Math.max(spanned.getSpanStart(this), i10);
        this.A03 = Math.min(spanned.getSpanEnd(this), i9);
        float measureText = textPaint.measureText(charSequence2, i10, i9);
        float measureText2 = textPaint.measureText(charSequence2, i10, this.A04);
        Integer num = this.A00;
        if (num == AnonymousClass05K.A01) {
            f = ((float) (i + i2)) / 2.0f;
            measureText /= 2.0f;
        } else if (num == AnonymousClass05K.A00) {
            f2 = (float) i;
            this.A01 = f2 + measureText2;
            this.A02 = textPaint.measureText(charSequence2, this.A04, this.A03);
        } else {
            f = (float) i2;
        }
        f2 = f - measureText;
        this.A01 = f2 + measureText2;
        this.A02 = textPaint.measureText(charSequence2, this.A04, this.A03);
    }
}
