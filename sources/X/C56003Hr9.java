package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.TypedValue;

/* renamed from: X.Hr9  reason: case insensitive filesystem */
public final class C56003Hr9 {
    public int A00 = -16776961;
    public String A01;
    public boolean A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final Paint A07;
    public final TextPaint A08;

    public C56003Hr9(Context context) {
        this.A03 = TypedValue.applyDimension(1, 5.0f, AnonymousClass7TF.A0E(context));
        this.A04 = TypedValue.applyDimension(1, 7.0f, AnonymousClass7TF.A0E(context));
        this.A05 = TypedValue.applyDimension(1, 8.0f, AnonymousClass7TF.A0E(context));
        this.A06 = TypedValue.applyDimension(1, 60.0f, AnonymousClass7TF.A0E(context));
        float applyDimension = TypedValue.applyDimension(2, 14.0f, AnonymousClass7TF.A0E(context));
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A07 = A0V;
        A0V.setStyle(Paint.Style.STROKE);
        TextPaint textPaint = new TextPaint(1);
        this.A08 = textPaint;
        AnonymousClass7TE.A1Q(textPaint);
        textPaint.setTextSize(applyDimension);
    }

    public final void A00(Canvas canvas, int i, int i2) {
        String str = this.A01;
        Canvas canvas2 = canvas;
        int i3 = i2;
        int i4 = i;
        if (str != null) {
            TextPaint textPaint = this.A08;
            textPaint.setColor(-1431655766);
            canvas2.drawRect(0.0f, 0.0f, (float) i4, (float) i3, textPaint);
            textPaint.setColor(-16777216);
            float f = this.A05;
            float f2 = this.A06;
            if (00l.A0d(str, "\n", false)) {
                for (String drawText : DbU.A1b(DbW.A0o(str, "\n"), 0)) {
                    canvas2.drawText(drawText, f, f2, textPaint);
                    f2 += textPaint.getTextSize() + 10.0f;
                }
            } else {
                canvas2.drawText(str, f, f2, textPaint);
            }
        }
        if (this.A02) {
            Paint paint = this.A07;
            paint.setColor(-1);
            paint.setStrokeWidth(this.A04);
            float f3 = (float) i4;
            float f4 = (float) i3;
            canvas2.drawRect(0.0f, 0.0f, f3, f4, paint);
            paint.setColor(this.A00);
            paint.setStrokeWidth(this.A03);
            canvas2.drawRect(0.0f, 0.0f, f3, f4, paint);
        }
    }
}
