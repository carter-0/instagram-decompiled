package X;

import android.animation.ArgbEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* renamed from: X.Gb1  reason: case insensitive filesystem */
public final class C52689Gb1 extends Drawable implements Animatable {
    public static final ArgbEvaluator A08 = new ArgbEvaluator();
    public static final TimeInterpolator A09 = new C52690Gb2();
    public boolean A00;
    public final float A01;
    public final int A02;
    public final ValueAnimator.AnimatorUpdateListener A03;
    public final ValueAnimator A04;
    public final Paint A05;
    public final RectF A06 = AnonymousClass7TE.A0Y();
    public final C52733Gbk A07;

    public final int getOpacity() {
        return -1;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C52689Gb1(C52692Gb4 gb4, C52692Gb4 gb42, C52733Gbk gbk, float f, int i, int i2, boolean z) {
        float f2;
        float f3;
        I84 i84 = new I84((Object) this, 23);
        this.A03 = i84;
        this.A07 = gbk;
        Paint paint = new Paint();
        this.A05 = paint;
        AnonymousClass7TE.A1Q(paint);
        paint.setAntiAlias(true);
        this.A02 = i2;
        this.A01 = f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A04 = valueAnimator;
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(i84);
        valueAnimator.setStartDelay(((long) (i % 10)) * 200);
        valueAnimator.setDuration(2000);
        valueAnimator.setInterpolator(A09);
        valueAnimator.setEvaluator(A08);
        if (z) {
            f2 = gb42.A00;
            f3 = gb42.A01;
        } else {
            f2 = gb4.A00;
            f3 = gb4.A01;
        }
        float[] A1b = C51965G9l.A1b();
        A1b[0] = f2;
        A1b[1] = f3;
        valueAnimator.setFloatValues(A1b);
        paint.setColor(C52686Gay.A00(i2, f2));
    }

    public final void draw(Canvas canvas) {
        int ordinal = this.A07.ordinal();
        RectF rectF = this.A06;
        if (ordinal != 0) {
            float f = this.A01;
            canvas.drawRoundRect(rectF, f, f, this.A05);
            return;
        }
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, this.A05);
    }

    public final boolean isRunning() {
        return this.A04.isStarted();
    }

    public final void setAlpha(int i) {
        Paint paint = this.A05;
        if (paint.getAlpha() != i) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (!z) {
            this.A04.cancel();
        } else if (this.A00) {
            this.A04.start();
        }
        return super.setVisible(z, z2);
    }

    public final void start() {
        this.A04.start();
        this.A00 = true;
    }

    public final void stop() {
        this.A04.cancel();
        this.A00 = false;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A06.set(rect);
    }
}
