package X;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.DynamicDrawableSpan;
import android.text.style.ImageSpan;
import android.text.style.LineBackgroundSpan;

/* renamed from: X.9Uc  reason: invalid class name and case insensitive filesystem */
public class C379489Uc implements LineBackgroundSpan {
    public float A00;
    public float A01;
    public int A02;
    public Paint A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Paint A08;
    public final RectF A09 = AnonymousClass7TE.A0Y();
    public final boolean A0A;
    public final Rect A0B = AnonymousClass7TE.A0W();

    public void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        int i9;
        Paint paint2;
        CharSequence charSequence2 = charSequence;
        0qQ.A0B(canvas, 0);
        0qQ.A0B(paint, 1);
        0qQ.A0B(charSequence2, 7);
        String A032 = 0mp.A03(charSequence2.toString());
        Rect rect = this.A0B;
        int i10 = i6;
        int i11 = i7;
        paint.getTextBounds(A032, i10, i11, rect);
        if (charSequence2 instanceof Spannable) {
            0sC A002 = 0pe.A00(((Spanned) charSequence2).getSpans(i10, i11, ImageSpan.class));
            i9 = 0;
            while (A002.hasNext()) {
                DynamicDrawableSpan dynamicDrawableSpan = (DynamicDrawableSpan) A002.next();
                if (dynamicDrawableSpan.getDrawable() != null) {
                    i9 += dynamicDrawableSpan.getDrawable().getBounds().width();
                }
            }
        } else {
            i9 = 0;
        }
        int i12 = (i + i2) / 2;
        RectF rectF = this.A09;
        int width = (rect.width() + i9) / 2;
        int i13 = this.A06;
        rectF.set((float) ((i12 - width) - i13), (float) ((rect.top + i4) - this.A05), (float) (i12 + width + i13), (float) (i4 + rect.bottom + this.A04));
        float f = (float) this.A07;
        canvas.drawRoundRect(rectF, f, f, this.A08);
        if (this.A0A && (paint2 = this.A03) != null) {
            paint2.setColor(this.A02);
            float f2 = this.A00;
            paint2.setPathEffect(new DashPathEffect(new float[]{f2, f2 / 1.5f}, 0.0f));
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(this.A01);
            paint2.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawRoundRect(rectF, f, f, paint2);
        }
    }

    public C379489Uc(int i, int i2, int i3, boolean z, int i4, int i5) {
        this.A07 = i2;
        this.A06 = i3;
        this.A05 = i4;
        this.A04 = i5;
        this.A0A = z;
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A08 = A0V;
        A0V.setColor(i);
        AnonymousClass7TE.A1Q(A0V);
        if (z) {
            this.A03 = AnonymousClass7TE.A0V(1);
        }
    }
}
