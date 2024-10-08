package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.3h7  reason: invalid class name and case insensitive filesystem */
public final class C247913h7 extends Drawable implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, C247923h8 {
    public int A00;
    public int A01;
    public Drawable A02;
    public Integer A03 = AnonymousClass05K.A00;
    public final ValueAnimator A04;
    public final Matrix A05 = new Matrix();
    public final Matrix A06 = new Matrix();
    public final Drawable A07;

    public final int getOpacity() {
        return -3;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private void A00() {
        float f;
        float f2;
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            Matrix matrix = this.A05;
            matrix.reset();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.A00;
            int i2 = intrinsicWidth * i;
            int i3 = this.A01;
            float f3 = 0.0f;
            if (i2 > i3 * intrinsicHeight) {
                f = ((float) i) / ((float) intrinsicHeight);
                f3 = (((float) i3) - (((float) intrinsicWidth) * f)) * 0.5f;
                f2 = 0.0f;
            } else {
                f = ((float) i3) / ((float) intrinsicWidth);
                f2 = (((float) i) - (((float) intrinsicHeight) * f)) * 0.5f;
            }
            matrix.setScale(f, f);
            matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f2 + 0.5f)));
        }
        Drawable drawable2 = this.A07;
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        invalidateSelf();
    }

    public static void A01(Drawable drawable, String str, StringBuilder sb) {
        String name;
        if (drawable != null) {
            sb.append(str);
            sb.append(":");
            if (drawable instanceof C247923h8) {
                sb.append(",image:");
                name = ((C247923h8) drawable).BG3();
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (bitmap != null) {
                    sb.append("bmp:");
                    sb.append(bitmap.getWidth());
                    sb.append("x");
                    sb.append(bitmap.getHeight());
                    return;
                }
                return;
            } else {
                sb.append(C66579MXk.A00(451));
                name = drawable.getClass().getName();
            }
            sb.append(name);
        }
    }

    public final String BG3() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[TransitionAnimationDrawable:");
        A01(this.A02, "source", sb);
        sb.append(", src mat:");
        sb.append(this.A05.toShortString());
        A01(this.A07, ", target", sb);
        sb.append(", src mat:");
        sb.append(this.A06.toShortString());
        sb.append(", State:");
        switch (this.A03.intValue()) {
            case 1:
                str = "IN_TRANSITION";
                break;
            case 2:
                str = "POST_TRANSITION";
                break;
            default:
                str = "PRE_TRANSITION";
                break;
        }
        sb.append(str);
        sb.append(", animation:");
        sb.append(this.A04.getAnimatedFraction());
        sb.append("]");
        return sb.toString();
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.A02;
        if (!(this.A03 == AnonymousClass05K.A0C || drawable == null)) {
            int saveCount = canvas.getSaveCount();
            canvas.save();
            canvas.concat(this.A05);
            drawable.draw(canvas);
            canvas.restoreToCount(saveCount);
        }
        if (this.A03 != AnonymousClass05K.A00) {
            this.A07.draw(canvas);
        }
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A03 = AnonymousClass05K.A0C;
        this.A07.setAlpha(255);
        this.A02 = null;
    }

    public final void onAnimationStart(Animator animator) {
        this.A03 = AnonymousClass05K.A01;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A07.setAlpha(((Number) valueAnimator.getAnimatedValue()).intValue());
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        this.A01 = rect.width();
        this.A00 = rect.height();
        A00();
    }

    public C247913h7(Drawable drawable, Drawable drawable2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 255});
        this.A04 = ofInt;
        this.A02 = drawable;
        this.A07 = drawable2;
        drawable2.setAlpha(0);
        this.A01 = drawable2.getIntrinsicWidth();
        this.A00 = drawable2.getIntrinsicHeight();
        ofInt.addListener(this);
        ofInt.addUpdateListener(this);
        A00();
    }
}
