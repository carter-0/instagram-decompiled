package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Gcm  reason: case insensitive filesystem */
public final class C52795Gcm extends Drawable {
    public final float A00;
    public final float A01;
    public final int A02;
    public final RectF A03 = AnonymousClass7TE.A0Y();
    public final boolean A04;
    public final boolean A05;
    public final Paint A06;

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        Paint paint = this.A06;
        RectF rectF = this.A03;
        float f = rectF.left;
        boolean z = this.A05;
        float f2 = rectF.top;
        if (z) {
            f2 += this.A01;
        }
        boolean z2 = this.A04;
        float f3 = rectF.bottom;
        if (z2) {
            f3 -= this.A01;
        }
        canvas2.drawLine(f, f2, f, f3, paint);
        float f4 = rectF.right;
        float f5 = rectF.top;
        if (z) {
            f5 += this.A01;
        }
        float f6 = rectF.bottom;
        if (z2) {
            f6 -= this.A01;
        }
        canvas2.drawLine(f4, f5, f4, f6, paint);
        if (z) {
            float f7 = rectF.left;
            float f8 = this.A01;
            float f9 = rectF.top;
            canvas2.drawLine(f7 + f8, f9, rectF.right - f8, f9, paint);
        }
        if (z2) {
            float f10 = rectF.left;
            float f11 = this.A01;
            float f12 = rectF.bottom;
            canvas2.drawLine(f10 + f11, f12, rectF.right - f11, f12, paint);
        }
        if (z) {
            float f13 = rectF.left;
            float f14 = rectF.top;
            float f15 = this.A01 * 2.0f;
            canvas2.drawArc(new RectF(f13, f14, f13 + f15, f14 + f15), 180.0f, 90.0f, false, paint);
            float f16 = rectF.right;
            float f17 = rectF.top;
            canvas2.drawArc(new RectF(f16 - f15, f17, f16, f17 + f15), 270.0f, 90.0f, false, paint);
        }
        if (z2) {
            float f18 = rectF.left;
            float f19 = rectF.bottom;
            float f20 = this.A01 * 2.0f;
            canvas2.drawArc(new RectF(f18, f19 - f20, f18 + f20, f19), 90.0f, 90.0f, false, paint);
            float f21 = rectF.right;
            float f22 = rectF.bottom;
            canvas2.drawArc(new RectF(f21 - f20, f22 - f20, f21, f22), 0.0f, 90.0f, false, paint);
        }
    }

    public final int getOpacity() {
        return -1;
    }

    public final boolean getPadding(Rect rect) {
        0qQ.A0B(rect, 0);
        float f = this.A01;
        float f2 = f - 0.0f;
        int i = (int) f2;
        float f3 = 0.0f;
        if (this.A05) {
            f3 = f2;
        }
        int i2 = (int) f3;
        float f4 = 0.0f + f;
        int i3 = (int) f4;
        float f5 = 0.0f;
        if (this.A04) {
            f5 = f4;
        }
        rect.set(i, i2, i3, (int) f5);
        return true;
    }

    public final void onBoundsChange(Rect rect) {
        Object valueOf;
        Object valueOf2;
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A03;
        float f = this.A01;
        float f2 = ((float) rect.left) + f;
        boolean z = this.A05;
        int i = rect.top;
        if (z) {
            valueOf = Float.valueOf(((float) i) + f);
        } else {
            valueOf = Integer.valueOf(i);
        }
        float A042 = AnonymousClass7TE.A04(valueOf);
        float f3 = ((float) rect.right) - f;
        boolean z2 = this.A04;
        int i2 = rect.bottom;
        if (z2) {
            valueOf2 = Float.valueOf(((float) i2) - f);
        } else {
            valueOf2 = Integer.valueOf(i2);
        }
        rectF.set(f2, A042, f3, AnonymousClass7TE.A04(valueOf2));
    }

    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
    }

    public C52795Gcm(float f, float f2, int i, boolean z, boolean z2) {
        this.A01 = f;
        this.A00 = f2;
        this.A02 = i;
        this.A05 = z;
        this.A04 = z2;
        Paint paint = new Paint();
        paint.setColor(this.A02);
        paint.setStrokeWidth(this.A00);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.A06 = paint;
    }
}
