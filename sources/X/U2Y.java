package X;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

public abstract class U2Y extends ReplacementSpan {
    public float A00 = 1.0f;
    public final C18749Vzk A01;
    public final Paint.FontMetricsInt A02 = new Paint.FontMetricsInt();

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        short s;
        short s2;
        Paint.FontMetricsInt fontMetricsInt2 = this.A02;
        paint.getFontMetricsInt(fontMetricsInt2);
        float A06 = ((float) C13988Tno.A06(fontMetricsInt2.descent, fontMetricsInt2.ascent)) * 1.0f;
        C18749Vzk vzk = this.A01;
        C14914UEx A002 = C18749Vzk.A00(vzk);
        int A003 = A002.A00(14);
        if (A003 != 0) {
            s = A002.A01.getShort(A003 + A002.A00);
        } else {
            s = 0;
        }
        this.A00 = A06 / ((float) s);
        C14914UEx A004 = C18749Vzk.A00(vzk);
        int A005 = A004.A00(14);
        if (A005 != 0) {
            A004.A01.getShort(A005 + A004.A00);
        }
        C14914UEx A006 = C18749Vzk.A00(vzk);
        int A007 = A006.A00(12);
        if (A007 != 0) {
            s2 = A006.A01.getShort(A007 + A006.A00);
        } else {
            s2 = 0;
        }
        short s3 = (short) ((int) (((float) s2) * this.A00));
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }

    public U2Y(C18749Vzk vzk) {
        02V.A03(vzk, "metadata cannot be null");
        this.A01 = vzk;
    }
}
