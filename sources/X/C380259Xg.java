package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* renamed from: X.9Xg  reason: invalid class name and case insensitive filesystem */
public final class C380259Xg extends ReplacementSpan {
    public int A00;
    public C306576Mr A01 = C306576Mr.DISABLED;
    public final C358848bZ A02;
    public final C358928bh A03;

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int color;
        float f2;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        CharSequence charSequence2 = charSequence;
        Paint paint2 = paint;
        AnonymousClass7TF.A1F(charSequence, 1, paint2);
        C358848bZ r1 = this.A02;
        if (r1 != null) {
            if (paint2 instanceof TextPaint) {
                r1.updateDrawState((TextPaint) paint2);
            } else {
                paint2.setColor(r1.A05);
            }
        }
        canvas.save();
        int i6 = i;
        int i7 = i2;
        float measureText = paint2.measureText(charSequence.subSequence(i6, i7).toString()) / 2.0f;
        canvas.translate(f + measureText, (float) i4);
        canvas.rotate((float) this.A00);
        if (r1 != null) {
            color = r1.A05;
        } else {
            color = paint2.getColor();
        }
        int A04 = 0nH.A04(color);
        int ordinal = this.A01.ordinal();
        if (ordinal == 3 || ordinal == 4) {
            paint2.setColor(A04);
            paint2.setStyle(Paint.Style.STROKE);
            float textSize = paint2.getTextSize();
            C358928bh r0 = this.A03;
            if (r0 != null) {
                f2 = r0.A02;
            } else {
                f2 = 0.0f;
            }
            paint2.setStrokeWidth(textSize * f2);
            paint2.setStrokeJoin(Paint.Join.ROUND);
            f3 = -measureText;
            f4 = 0.0f;
            canvas2.drawText(charSequence2, i6, i7, f3, 0.0f, paint2);
            paint2.setColor(color);
            AnonymousClass7TE.A1Q(paint2);
        } else {
            f3 = -measureText;
            f4 = 0.0f;
        }
        canvas2.drawText(charSequence2, i6, i7, f3, f4, paint2);
        canvas.restore();
    }

    public C380259Xg(C358848bZ r2, C358928bh r3) {
        this.A02 = r2;
        this.A03 = r3;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        AnonymousClass7TG.A1N(paint, charSequence);
        return (int) paint.measureText(charSequence, i, i2);
    }
}
