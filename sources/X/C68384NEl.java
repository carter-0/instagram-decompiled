package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: X.NEl  reason: case insensitive filesystem */
public final class C68384NEl extends C71278OhJ {
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final Path A04 = C51965G9l.A0C();
    public final RectF A05 = AnonymousClass7TE.A0Y();

    public C68384NEl(Context context, int i) {
        DisplayMetrics A0E = AnonymousClass7TF.A0E(context);
        0qQ.A07(A0E);
        this.A01 = -16777216;
        this.A00 = TypedValue.applyDimension(2, 20.0f, A0E);
        this.A03 = i;
        this.A01 = TypedValue.applyDimension(1, 4.0f, A0E);
        this.A02 = 4.0f;
    }

    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        AnonymousClass7TF.A1H(canvas, paint);
        A00(paint);
        int i8 = this.A00;
        this.A00 = i8 + 1;
        RectF rectF = this.A05;
        float f = (float) i;
        int i9 = i5;
        int i10 = i3;
        if (i8 == 0) {
            float f2 = (float) i10;
            float f3 = this.A02;
            rectF.set(f, f2 - f3, this.A01 + f, ((float) i9) + f3);
            canvas.drawRoundRect(rectF, f3, f3, this.A02);
        } else {
            rectF.set(f, (float) i10, this.A01 + f, (float) i9);
            Path path = this.A04;
            path.reset();
            path.moveTo(rectF.left, rectF.bottom);
            path.lineTo(rectF.left, rectF.top);
            float f4 = rectF.left;
            float f5 = rectF.top;
            float f6 = this.A02;
            float f7 = f5 + f6;
            float f8 = rectF.right;
            path.cubicTo(f4, f7, f8, f7, f8, f5);
            path.lineTo(rectF.right, rectF.bottom);
            float f9 = rectF.right;
            float f10 = rectF.bottom;
            float f11 = f10 + f6;
            float f12 = rectF.left;
            path.cubicTo(f9, f11, f12, f11, f12, f10);
            path.lineTo(rectF.right, rectF.top);
            path.close();
            canvas.drawPath(path, this.A02);
        }
        if (this.A00 >= this.A03) {
            this.A00 = 0;
        }
    }
}
