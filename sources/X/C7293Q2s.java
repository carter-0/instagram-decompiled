package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import kotlin.Deprecated;

/* renamed from: X.Q2s  reason: case insensitive filesystem */
public final class C7293Q2s extends Drawable implements Animatable {
    public static final Interpolator A09 = new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
    public static final Interpolator A0A = new LinearInterpolator();
    public static final float[] A0B = {0.8f, 0.8f, 1.0f, 0.8f, 0.8f};
    public static final float[] A0C = {0.0f, 180.0f, 360.0f, 540.0f, 1080.0f};
    public static final float[] A0D = {0.0f, 0.7f, 0.45f, 0.7f, 0.0f};
    public float A00;
    public float A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final ValueAnimator.AnimatorUpdateListener A05;
    public final ValueAnimator A06;
    public final Paint A07;
    public final RectF A08 = AnonymousClass7TE.A0Y();

    public C7293Q2s(Context context, float f, int i, int i2) {
        this.A03 = i;
        this.A04 = i2;
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A07 = A0V;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A06 = valueAnimator;
        this.A01 = -90.0f;
        C11435SUp sUp = new C11435SUp((Object) this, 9);
        this.A05 = sUp;
        valueAnimator.setInterpolator(A0A);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        valueAnimator.addUpdateListener(sUp);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setDuration(2000);
        JTO.A1N(A0V);
        A0V.setStrokeWidth(TypedValue.applyDimension(1, f, AnonymousClass7TF.A0E(context)));
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Paint paint = this.A07;
        paint.setColor(this.A03);
        canvas.drawArc(this.A08, this.A01, this.A00, false, paint);
    }

    @Deprecated(message = "Deprecated in Java")
    public final int getOpacity() {
        return -1;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        float strokeWidth = this.A07.getStrokeWidth() / 2.0f;
        RectF rectF = this.A08;
        rectF.set(rect);
        rectF.offset(strokeWidth, strokeWidth);
        int i = rect.left;
        int i2 = this.A04;
        rectF.right = ((float) (i + i2)) - strokeWidth;
        rectF.bottom = ((float) (rect.top + i2)) - strokeWidth;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getIntrinsicHeight() {
        return this.A04;
    }

    public final int getIntrinsicWidth() {
        return this.A04;
    }

    public final boolean isRunning() {
        return this.A06.isRunning();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = this.A02;
        if (!z) {
            if (z3) {
                this.A06.cancel();
            }
        } else if (z3) {
            this.A06.start();
        }
        return super.setVisible(z, z2);
    }

    public final void start() {
        this.A06.start();
        this.A02 = true;
    }

    public final void stop() {
        this.A06.cancel();
        this.A02 = false;
    }
}
