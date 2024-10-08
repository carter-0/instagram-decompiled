package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* renamed from: X.U7p  reason: case insensitive filesystem */
public final class C14758U7p extends U2Y {
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        W0M.A00();
        C18749Vzk vzk = this.A01;
        C18470VsM vsM = vzk.A01;
        Typeface typeface = vsM.A00;
        Paint paint2 = paint;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        char[] cArr = vsM.A03;
        Canvas canvas2 = canvas;
        canvas2.drawText(cArr, vzk.A00 * 2, 2, f, (float) i4, paint2);
        paint2.setTypeface(typeface2);
    }
}
