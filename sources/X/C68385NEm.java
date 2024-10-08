package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import com.instagram.android.R;

/* renamed from: X.NEm  reason: case insensitive filesystem */
public final class C68385NEm extends C67649Mrc {
    public float A00;
    public float A01;
    public ValueAnimator A02 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    public final GradientDrawable A03;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        GradientDrawable gradientDrawable = this.A03;
        gradientDrawable.setBounds(getBounds().left, getBounds().bottom - 100, getBounds().right, getBounds().bottom);
        float f = ((float) getBounds().bottom) - (100.0f * 0.5f);
        int save = canvas.save();
        canvas.rotate(this.A01, ((float) AnonymousClass7TF.A04(this)) + 0.0f, f);
        try {
            float f2 = this.A00;
            save = canvas.save();
            canvas.translate(0.0f, f2);
            gradientDrawable.draw(canvas);
            canvas.restoreToCount(save);
            invalidateSelf();
        } catch (Throwable th) {
            throw th;
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        ValueAnimator valueAnimator = this.A02;
        valueAnimator.cancel();
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        valueAnimator.setDuration(300);
        C71170Oej.A00(valueAnimator, this, 1);
        valueAnimator.start();
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C68385NEm(Context context, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.A03 = gradientDrawable;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(context.getColor(R.color.avatar_powerups_angry_bubble_to));
    }
}
