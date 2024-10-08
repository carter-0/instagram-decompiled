package X;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* renamed from: X.3O0  reason: invalid class name */
public final class AnonymousClass3O0 extends Drawable {
    public float A00;
    public ValueAnimator A01;
    public AnonymousClass3O5 A02;
    public final ValueAnimator.AnimatorUpdateListener A03 = new AnonymousClass3O1(this);
    public final Matrix A04;
    public final Paint A05;
    public final Rect A06;

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void A01() {
        AnonymousClass3O5 r0;
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null && !valueAnimator.isStarted() && (r0 = this.A02) != null && r0.A0H && getCallback() != null) {
            this.A01.start();
        }
    }

    public final void A02() {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null && !valueAnimator.isStarted() && getCallback() != null) {
            this.A01.start();
        }
    }

    public final void A03(AnonymousClass3O5 r9) {
        boolean z;
        PorterDuff.Mode mode;
        this.A02 = r9;
        if (r9 != null) {
            Paint paint = this.A05;
            if (r9.A0G) {
                mode = PorterDuff.Mode.DST_IN;
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        A00();
        if (this.A02 != null) {
            ValueAnimator valueAnimator = this.A01;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                this.A01.cancel();
                this.A01.removeAllUpdateListeners();
            } else {
                z = false;
            }
            AnonymousClass3O5 r0 = this.A02;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, ((float) (r0.A0E / r0.A0D)) + 1.0f});
            this.A01 = ofFloat;
            ofFloat.setInterpolator(new LinearInterpolator());
            this.A01.setRepeatMode(this.A02.A0B);
            this.A01.setStartDelay(this.A02.A0F);
            this.A01.setRepeatCount(this.A02.A0A);
            ValueAnimator valueAnimator2 = this.A01;
            AnonymousClass3O5 r02 = this.A02;
            valueAnimator2.setDuration(r02.A0D + r02.A0E);
            this.A01.addUpdateListener(this.A03);
            if (z) {
                this.A01.start();
            }
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        float f;
        if (this.A02 != null) {
            Paint paint = this.A05;
            if (paint.getShader() != null) {
                float tan = (float) Math.tan(Math.toRadians((double) this.A02.A03));
                Rect rect = this.A06;
                float height = ((float) rect.height()) + (((float) rect.width()) * tan);
                float width = ((float) rect.width()) + (tan * ((float) rect.height()));
                float f2 = this.A00;
                float f3 = 0.0f;
                if (f2 < 0.0f) {
                    ValueAnimator valueAnimator = this.A01;
                    if (valueAnimator != null) {
                        f2 = ((Number) valueAnimator.getAnimatedValue()).floatValue();
                    } else {
                        f2 = 0.0f;
                    }
                }
                int i = this.A02.A06;
                if (i != 1) {
                    if (i == 2) {
                        f3 = width + (((-width) - width) * f2);
                    } else if (i != 3) {
                        float f4 = -width;
                        f3 = f4 + ((width - f4) * f2);
                    } else {
                        f = (((-height) - height) * f2) + height;
                    }
                    f = 0.0f;
                } else {
                    float f5 = -height;
                    f = f5 + ((height - f5) * f2);
                }
                Matrix matrix = this.A04;
                matrix.reset();
                matrix.setRotate(this.A02.A03, ((float) rect.width()) / 2.0f, ((float) rect.height()) / 2.0f);
                matrix.preTranslate(f3, f);
                paint.getShader().setLocalMatrix(matrix);
                canvas.drawRect(rect, paint);
            }
        }
    }

    public final int getOpacity() {
        AnonymousClass3O5 r1 = this.A02;
        if (r1 == null) {
            return -1;
        }
        if (r1.A0I || r1.A0G) {
            return -3;
        }
        return -1;
    }

    public AnonymousClass3O0() {
        Paint paint = new Paint();
        this.A05 = paint;
        this.A06 = new Rect();
        this.A04 = new Matrix();
        this.A00 = -1.0f;
        paint.setAntiAlias(true);
    }

    private void A00() {
        AnonymousClass3O5 r2;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width != 0 && height != 0 && (r2 = this.A02) != null) {
            int i = r2.A08;
            if (i <= 0) {
                i = Math.round(r2.A04 * ((float) width));
            }
            int i2 = r2.A07;
            if (i2 <= 0) {
                i2 = Math.round(r2.A01 * ((float) height));
            }
            if (r2.A0C != 1) {
                int i3 = r2.A06;
                if (i3 == 1 || i3 == 3) {
                    i = 0;
                } else {
                    i2 = 0;
                }
                radialGradient = new LinearGradient(0.0f, 0.0f, (float) i, (float) i2, r2.A0L, r2.A0K, Shader.TileMode.CLAMP);
            } else {
                radialGradient = new RadialGradient(((float) i) / 2.0f, ((float) i2) / 2.0f, (float) (((double) Math.max(i, i2)) / Math.sqrt(2.0d)), r2.A0L, r2.A0K, Shader.TileMode.CLAMP);
            }
            this.A05.setShader(radialGradient);
        }
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A06.set(rect);
        A00();
        A01();
    }
}
