package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

public final class U1F extends Drawable implements Animatable, Drawable.Callback {
    public int A00;
    public boolean A01 = true;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AnimationDrawable A05;
    public final AnimationDrawable A06;

    public U1F(Context context) {
        Drawable drawable = context.getDrawable(R.drawable.ig_msgr_power_ups_fire);
        0qQ.A0A(drawable);
        C20972X7c A002 = C16808V6p.A00(AnonymousClass7TF.A0A(context), drawable, 18);
        int A052 = 2SP.A01.A05(18);
        int[] iArr = new int[18];
        int i = 0;
        do {
            iArr[i] = (A052 + i) % 18;
            i++;
        } while (i < 18);
        AnimationDrawable animationDrawable = new AnimationDrawable();
        int i2 = 0;
        do {
            int i3 = iArr[i2];
            C14670U0q u0q = new C14670U0q(A002);
            if (u0q.A00 != i3) {
                u0q.A00 = i3;
                u0q.invalidateSelf();
            }
            animationDrawable.addFrame(u0q, 42);
            i2++;
        } while (i2 < 18);
        AnonymousClass7TG.A13(animationDrawable);
        animationDrawable.setCallback(this);
        this.A05 = animationDrawable;
        int[] iArr2 = new int[18];
        int i4 = 0;
        do {
            iArr2[i4] = ((A052 + 9) + i4) % 18;
            i4++;
        } while (i4 < 18);
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        int i5 = 0;
        do {
            int i6 = iArr2[i5];
            C14670U0q u0q2 = new C14670U0q(A002);
            if (u0q2.A00 != i6) {
                u0q2.A00 = i6;
                u0q2.invalidateSelf();
            }
            animationDrawable2.addFrame(u0q2, 42);
            i5++;
        } while (i5 < 18);
        AnonymousClass7TG.A13(animationDrawable2);
        animationDrawable2.setCallback(this);
        this.A06 = animationDrawable2;
    }

    public final void draw(Canvas canvas) {
        int i;
        0qQ.A0B(canvas, 0);
        if (this.A01) {
            this.A01 = false;
            int i2 = (this.A00 * 9) / 10;
            AnimationDrawable animationDrawable = this.A05;
            int A062 = (getBounds().left + i2) - AnonymousClass7TF.A06(animationDrawable);
            int i3 = getBounds().bottom;
            animationDrawable.setBounds(A062, i3 - JTP.A06(animationDrawable), AnonymousClass7TF.A06(animationDrawable) + A062, i3);
            AnimationDrawable animationDrawable2 = this.A06;
            int i4 = getBounds().right - i2;
            int i5 = getBounds().bottom;
            animationDrawable2.setBounds(i4, i5 - JTP.A06(animationDrawable2), AnonymousClass7TF.A06(animationDrawable2) + i4, i5);
        }
        if (!this.A02) {
            i = canvas.save();
            try {
                AnimationDrawable animationDrawable3 = this.A05;
                Rect A0X = AnonymousClass7TE.A0X(animationDrawable3);
                canvas.scale(0.95f, 0.95f, (float) A0X.right, (float) A0X.bottom);
                animationDrawable3.draw(canvas);
            } finally {
                canvas.restoreToCount(i);
            }
        }
        if (!this.A04) {
            i = canvas.save();
            AnimationDrawable animationDrawable4 = this.A06;
            Rect A0X2 = AnonymousClass7TE.A0X(animationDrawable4);
            canvas.scale(0.85f, 0.85f, (float) A0X2.left, (float) A0X2.bottom);
            canvas.scale(-1.0f, 1.0f, (float) A0X2.centerX(), (float) A0X2.bottom);
            animationDrawable4.draw(canvas);
            canvas.restoreToCount(i);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void invalidateDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        if (A00(drawable)) {
            invalidateSelf();
        }
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A01 = true;
    }

    public final void start() {
        this.A03 = true;
        if (!this.A02) {
            this.A05.start();
        }
        if (!this.A04) {
            this.A06.start();
        }
    }

    public final void stop() {
        this.A03 = false;
        this.A05.stop();
        this.A06.stop();
    }

    private final boolean A00(Drawable drawable) {
        if (!this.A02 && drawable.equals(this.A05)) {
            return true;
        }
        if (this.A04 || !drawable.equals(this.A06)) {
            return false;
        }
        return true;
    }

    public final void A01(boolean z) {
        if (this.A04 != z) {
            this.A04 = z;
            if (z || !this.A03) {
                this.A06.stop();
                invalidateSelf();
                return;
            }
            this.A06.start();
        }
    }

    public final boolean isRunning() {
        return this.A03;
    }

    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
        this.A06.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
        this.A06.setColorFilter(colorFilter);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AnonymousClass7TG.A1N(drawable, runnable);
        if (A00(drawable)) {
            scheduleSelf(runnable, j);
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AnonymousClass7TG.A1N(drawable, runnable);
        if (A00(drawable)) {
            unscheduleSelf(runnable);
        }
    }
}
