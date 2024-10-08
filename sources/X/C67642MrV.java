package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.instagram.android.R;

/* renamed from: X.MrV  reason: case insensitive filesystem */
public final class C67642MrV extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public Path A03 = C51965G9l.A0C();
    public RectF A04 = AnonymousClass7TE.A0Y();
    public final ValueAnimator A05;
    public final ValueAnimator A06;
    public final Context A07;
    public final Paint A08;
    public final Paint A09;
    public final Paint A0A;

    public C67642MrV(Context context) {
        this.A07 = context;
        Paint A0C = JTO.A0C();
        this.A09 = A0C;
        Paint A0C2 = JTO.A0C();
        this.A0A = A0C2;
        Paint A0C3 = JTO.A0C();
        this.A08 = A0C3;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f});
        0qQ.A07(ofFloat);
        this.A06 = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f});
        0qQ.A07(ofFloat2);
        this.A05 = ofFloat2;
        int A032 = AnonymousClass7TF.A03(context, R.attr.igds_color_controls);
        A0C.setColor(A032);
        A0C2.setColor(A032);
        A0C2.setStrokeWidth(6.0f);
        Paint.Style style = Paint.Style.STROKE;
        A0C2.setStyle(style);
        A0C3.setColor(A032);
        A0C3.setStrokeWidth(6.0f);
        A0C3.setStyle(style);
        A0C3.setStrokeCap(Paint.Cap.ROUND);
        A0C3.setStrokeJoin(Paint.Join.ROUND);
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        C71170Oej.A00(ofFloat, this, 6);
        ofFloat.addListener(new U0N(this, 17));
        ofFloat2.setDuration(200);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        C71170Oej.A00(ofFloat2, this, 7);
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        float height = this.A04.height();
        int i = (this.A02 > 0.0f ? 1 : (this.A02 == 0.0f ? 0 : -1));
        RectF rectF = this.A04;
        if (i == 0) {
            canvas.drawRoundRect(rectF, height, height, this.A09);
            return;
        }
        RectF rectF2 = this.A04;
        float width = ((rectF.width() - this.A04.height()) * this.A02) / 2.0f;
        float f = rectF2.left + width;
        float f2 = rectF2.top;
        float f3 = rectF2.right - width;
        float f4 = rectF2.bottom;
        float f5 = height;
        canvas2.drawRoundRect(f, f2, f3, f4, height, f5, this.A09);
        canvas2.drawRoundRect(f + 6.0f, f2 + 6.0f, f3 - 6.0f, f4 - 6.0f, height, f5, this.A0A);
        if (this.A00 > 0.0f) {
            canvas.drawPath(this.A03, this.A08);
        }
    }

    public final int getOpacity() {
        return -1;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        RectF rectF = new RectF(rect);
        this.A04 = rectF;
        RectF rectF2 = this.A04;
        float width = ((rectF.width() - this.A04.height()) * 1.0f) / 2.0f;
        float f = rectF2.left + width + 6.0f;
        float f2 = rectF2.top + 6.0f;
        float f3 = ((rectF2.right - width) - 6.0f) - f;
        float f4 = (rectF2.bottom - 6.0f) - f2;
        super.onBoundsChange(rect);
        Path A0C = C51965G9l.A0C();
        this.A03 = A0C;
        A0C.moveTo((0.25f * f3) + f, (0.5f * f4) + f2);
        this.A03.lineTo((0.425f * f3) + f, (0.675f * f4) + f2);
        this.A03.lineTo(f + (f3 * 0.75f), f2 + (f4 * 0.35f));
        this.A01 = new PathMeasure(this.A03, false).getLength();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setAlpha(int i) {
        this.A09.setAlpha(i);
        invalidateSelf();
    }
}
