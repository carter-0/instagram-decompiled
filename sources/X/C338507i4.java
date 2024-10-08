package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.7i4  reason: invalid class name and case insensitive filesystem */
public final class C338507i4 extends Drawable implements Animatable {
    public static final Interpolator A06 = new LinearInterpolator();
    public static final Interpolator A07 = new C3020561i();
    public static final int[] A08 = {-16777216};
    public float A00;
    public float A01;
    public Animator A02;
    public Resources A03;
    public boolean A04;
    public final C338517i5 A05;

    public final int getOpacity() {
        return -3;
    }

    public final void A00(float f) {
        C338517i5 r0 = this.A05;
        r0.A08 = f;
        r0.A0J.setStrokeWidth(f);
        invalidateSelf();
    }

    public final void A01(int i) {
        float f = 7.5f;
        float f2 = 2.5f;
        float f3 = 10.0f;
        float f4 = 5.0f;
        if (i == 0) {
            f = 11.0f;
            f2 = 3.0f;
            f3 = 12.0f;
            f4 = 6.0f;
        }
        C338517i5 r3 = this.A05;
        float f5 = this.A03.getDisplayMetrics().density;
        float f6 = f2 * f5;
        r3.A08 = f6;
        r3.A0J.setStrokeWidth(f6);
        r3.A02 = f * f5;
        r3.A0C = 0;
        r3.A0D = r3.A0G[0];
        r3.A0B = (int) (f3 * f5);
        r3.A0A = (int) (f4 * f5);
        invalidateSelf();
    }

    public final void A02(Paint.Cap cap) {
        this.A05.A0J.setStrokeCap(cap);
        invalidateSelf();
    }

    public final void A03(C338517i5 r10, float f) {
        int i;
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = r10.A0G;
            int i2 = r10.A0C;
            int i3 = iArr[i2];
            int i4 = iArr[(i2 + 1) % iArr.length];
            int i5 = (i3 >> 24) & 255;
            int i6 = (i3 >> 16) & 255;
            int i7 = (i3 >> 8) & 255;
            int i8 = i3 & 255;
            i = ((i5 + ((int) (((float) (((i4 >> 24) & 255) - i5)) * f2))) << 24) | ((i6 + ((int) (((float) (((i4 >> 16) & 255) - i6)) * f2))) << 16) | ((i7 + ((int) (((float) (((i4 >> 8) & 255) - i7)) * f2))) << 8) | (i8 + ((int) (f2 * ((float) ((i4 & 255) - i8)))));
        } else {
            i = r10.A0G[r10.A0C];
        }
        r10.A0D = i;
    }

    public final void A04(C338517i5 r8, float f, boolean z) {
        float f2;
        float interpolation;
        if (this.A04) {
            A03(r8, f);
            float f3 = r8.A06;
            float f4 = r8.A07;
            float f5 = r8.A05;
            r8.A04 = f4 + (((f5 - 0.01f) - f4) * f);
            r8.A01 = f5;
            r8.A03 = f3 + ((((float) (Math.floor((double) (f3 / 0.8f)) + 1.0d)) - f3) * f);
        } else if (f != 1.0f || z) {
            float f6 = r8.A06;
            if (f < 0.5f) {
                interpolation = r8.A07;
                f2 = (A07.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                f2 = r8.A07 + 0.79f;
                interpolation = f2 - (((1.0f - A07.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            r8.A04 = interpolation;
            r8.A01 = f2;
            r8.A03 = f6 + (0.20999998f * f);
            this.A00 = (f + this.A01) * 216.0f;
        }
    }

    public final void A05(int... iArr) {
        C338517i5 r2 = this.A05;
        r2.A0G = iArr;
        r2.A0C = 0;
        int i = iArr[0];
        r2.A0D = i;
        r2.A0C = 0;
        r2.A0D = i;
        invalidateSelf();
    }

    public final int getAlpha() {
        return this.A05.A09;
    }

    public final boolean isRunning() {
        return this.A02.isRunning();
    }

    public final void setAlpha(int i) {
        this.A05.A09 = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.A0J.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void start() {
        long j;
        Animator animator = this.A02;
        animator.cancel();
        C338517i5 r3 = this.A05;
        float f = r3.A04;
        r3.A07 = f;
        float f2 = r3.A01;
        r3.A05 = f2;
        r3.A06 = r3.A03;
        if (f2 != f) {
            this.A04 = true;
            j = 666;
        } else {
            r3.A0C = 0;
            r3.A0D = r3.A0G[0];
            r3.A07 = 0.0f;
            r3.A05 = 0.0f;
            r3.A06 = 0.0f;
            r3.A04 = 0.0f;
            r3.A01 = 0.0f;
            r3.A03 = 0.0f;
            j = 1332;
        }
        animator.setDuration(j);
        animator.start();
    }

    public final void stop() {
        this.A02.cancel();
        this.A00 = 0.0f;
        C338517i5 r2 = this.A05;
        if (r2.A0F) {
            r2.A0F = false;
        }
        r2.A0C = 0;
        r2.A0D = r2.A0G[0];
        r2.A07 = 0.0f;
        r2.A05 = 0.0f;
        r2.A06 = 0.0f;
        r2.A04 = 0.0f;
        r2.A01 = 0.0f;
        r2.A03 = 0.0f;
        invalidateSelf();
    }

    public C338507i4(Context context) {
        context.getClass();
        this.A03 = context.getResources();
        C338517i5 r2 = new C338517i5();
        this.A05 = r2;
        int[] iArr = A08;
        r2.A0G = iArr;
        r2.A0C = 0;
        r2.A0D = iArr[0];
        A00(2.5f);
        C338517i5 r22 = this.A05;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C338527i6(r22, this));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(A06);
        ofFloat.addListener(new C338537i7(r22, this));
        this.A02 = ofFloat;
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.rotate(this.A00, bounds.exactCenterX(), bounds.exactCenterY());
        C338517i5 r3 = this.A05;
        RectF rectF = r3.A0K;
        float f = r3.A02;
        float f2 = (r3.A08 / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) r3.A0B) * r3.A00) / 2.0f, r3.A08 / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f2, ((float) bounds.centerY()) - f2, ((float) bounds.centerX()) + f2, ((float) bounds.centerY()) + f2);
        float f3 = r3.A04;
        float f4 = r3.A03;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((r3.A01 + f4) * 360.0f) - f5;
        Paint paint = r3.A0J;
        paint.setColor(r3.A0D);
        paint.setAlpha(r3.A09);
        float f7 = r3.A08 / 2.0f;
        rectF.inset(f7, f7);
        canvas2.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, r3.A0I);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas2.drawArc(rectF, f5, f6, false, paint);
        if (r3.A0F) {
            Path path = r3.A0E;
            if (path == null) {
                Path path2 = new Path();
                r3.A0E = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            r3.A0E.moveTo(0.0f, 0.0f);
            r3.A0E.lineTo(((float) r3.A0B) * r3.A00, 0.0f);
            Path path3 = r3.A0E;
            float f9 = r3.A00;
            path3.lineTo((((float) r3.A0B) * f9) / 2.0f, ((float) r3.A0A) * f9);
            r3.A0E.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) r3.A0B) * r3.A00) / 2.0f), rectF.centerY() + (r3.A08 / 2.0f));
            r3.A0E.close();
            Paint paint2 = r3.A0H;
            paint2.setColor(r3.A0D);
            paint2.setAlpha(r3.A09);
            canvas2.save();
            canvas2.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas2.drawPath(r3.A0E, paint2);
            canvas2.restore();
        }
        canvas2.restore();
    }
}
