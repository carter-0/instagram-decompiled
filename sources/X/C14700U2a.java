package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

/* renamed from: X.U2a  reason: case insensitive filesystem */
public final class C14700U2a extends ReplacementSpan {
    public final PointF A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Paint.FontMetrics A06 = new Paint.FontMetrics();
    public final RectF A07 = new RectF();

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Canvas canvas2 = canvas;
        CharSequence charSequence2 = charSequence;
        boolean A1Z = AnonymousClass7TG.A1Z(canvas2, charSequence2);
        Paint paint2 = paint;
        0qQ.A0B(paint2, 8);
        Paint.FontMetrics fontMetrics = this.A06;
        paint2.getFontMetrics(fontMetrics);
        paint2.setAntiAlias(A1Z);
        int i6 = i4 + this.A02;
        float f2 = f + ((float) this.A04);
        float f3 = fontMetrics.descent;
        PointF pointF = this.A00;
        float f4 = pointF.y;
        float f5 = (f3 - fontMetrics.ascent) + (f4 * 2.0f);
        float f6 = (float) i6;
        float f7 = f6 - f5;
        float f8 = (f6 - f3) - f4;
        int i7 = i;
        int i8 = i2;
        float measureText = paint2.measureText(charSequence2, i7, i8) + (pointF.x * 2.0f);
        RectF rectF = this.A07;
        rectF.set(f2, f7, f2 + measureText, f5 + f7);
        paint2.setColor(this.A03);
        JTO.A1N(paint2);
        paint2.setStrokeWidth(this.A01);
        float f9 = measureText / 2.0f;
        canvas2.drawRoundRect(rectF, f9, f9, paint2);
        AnonymousClass7TE.A1Q(paint2);
        paint2.setColor(this.A05);
        canvas2.drawText(charSequence2, i7, i8, pointF.x + f2, f8, paint2);
    }

    public C14700U2a(PointF pointF, float f, int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A05 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A01 = f;
        this.A00 = pointF;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        AnonymousClass7TG.A1N(paint, charSequence);
        return AnonymousClass1GB.A01(paint.measureText(charSequence, i, i2) + (2.0f * this.A00.x));
    }
}
