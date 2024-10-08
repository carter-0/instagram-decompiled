package X;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: X.5wK  reason: invalid class name and case insensitive filesystem */
public abstract class C299975wK extends ReplacementSpan {
    public short A00 = -1;
    public float A01 = 1.0f;
    public final C69862Ca A02;
    public final Paint.FontMetricsInt A03 = new Paint.FontMetricsInt();

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        short s;
        short s2;
        Paint.FontMetricsInt fontMetricsInt2 = this.A03;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = ((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f;
        C69862Ca r5 = this.A02;
        AnonymousClass2Cc A002 = C69862Ca.A00(r5);
        int A003 = A002.A00(14);
        if (A003 != 0) {
            s = A002.A04.getShort(A003 + A002.A00);
        } else {
            s = 0;
        }
        this.A01 = abs / ((float) s);
        AnonymousClass2Cc A004 = C69862Ca.A00(r5);
        int A005 = A004.A00(14);
        if (A005 != 0) {
            A004.A04.getShort(A005 + A004.A00);
        }
        AnonymousClass2Cc A006 = C69862Ca.A00(r5);
        int A007 = A006.A00(12);
        if (A007 != 0) {
            s2 = A006.A04.getShort(A007 + A006.A00);
        } else {
            s2 = 0;
        }
        short s3 = (short) ((int) (((float) s2) * this.A01));
        this.A00 = s3;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }

    public C299975wK(C69862Ca r2) {
        this.A02 = r2;
    }
}
