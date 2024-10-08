package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineBackgroundSpan;

/* renamed from: X.9UW  reason: invalid class name */
public final class AnonymousClass9UW implements AnonymousClass6MR, LineBackgroundSpan {
    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.X6W] */
    public final X6W By4() {
        return new Object();
    }

    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        CharSequence charSequence2 = charSequence;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        Paint paint2 = paint;
        0qQ.A0B(paint, 1);
        0qQ.A0B(charSequence2, 7);
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            int i9 = i6;
            int i10 = i7;
            0sC A00 = 0pe.A00(spanned.getSpans(i9, i10, AnonymousClass6MP.class));
            while (A00.hasNext()) {
                ((AnonymousClass6MP) A00.next()).AQO(canvas2, paint2, spanned, i8, i9, i10, i, i4);
            }
        }
    }
}
