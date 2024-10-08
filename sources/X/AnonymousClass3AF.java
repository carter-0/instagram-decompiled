package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.instagram.android.R;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.3AF  reason: invalid class name */
public final class AnonymousClass3AF implements AnonymousClass3AG {
    public Paint A00;
    public final AlphaAnimation A01;
    public final AlphaAnimation A02;
    public final RefreshableNestedScrollingParent A03;
    public final Drawable A04;
    public final LayerDrawable A05;
    public final Transformation A06 = new Transformation();
    public final AnonymousClass3AH A07;

    public AnonymousClass3AF(RefreshableNestedScrollingParent refreshableNestedScrollingParent, boolean z) {
        0qQ.A0B(refreshableNestedScrollingParent, 1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.A01 = alphaAnimation;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(-0.2f, 0.2f);
        this.A02 = alphaAnimation2;
        Context context = refreshableNestedScrollingParent.getContext();
        this.A03 = refreshableNestedScrollingParent;
        this.A07 = new AnonymousClass3AH(String.valueOf(refreshableNestedScrollingParent.hashCode()));
        if (z) {
            Paint paint = new Paint();
            this.A00 = paint;
            paint.setColor(2Yu.A0F(context, R.attr.dividerColor));
            this.A00.setStrokeWidth(1.0f);
        }
        Drawable drawable = context.getDrawable(R.drawable.refreshable_progress_drawable);
        0qQ.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        this.A05 = (LayerDrawable) drawable;
        Drawable drawable2 = context.getDrawable(R.drawable.refreshable_spinner_drawable);
        if (drawable2 != null) {
            this.A04 = drawable2;
            alphaAnimation2.setDuration(300);
            alphaAnimation.setDuration(700);
            alphaAnimation.setInterpolator(new LinearInterpolator());
            alphaAnimation.setRepeatCount(-1);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void EEy(Canvas canvas, View view, RefreshableNestedScrollingParent refreshableNestedScrollingParent, float f, int i, boolean z) {
        float f2 = f;
        RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.A03;
        this.A07.A00((double) f2, refreshableNestedScrollingParent2.A0B);
        if (f <= 0.0f) {
            this.A01.cancel();
            this.A02.cancel();
            return;
        }
        Canvas canvas2 = canvas;
        canvas.save();
        try {
            canvas.translate(0.0f, (float) (view.getTop() + view.getPaddingTop()));
            float width = (float) canvas.getWidth();
            int i2 = i;
            float f3 = (float) i2;
            float f4 = f * f3;
            canvas.clipRect(0.0f, 0.0f, width, 1.0f + f4);
            Paint paint = this.A00;
            if (paint != null) {
                canvas2.drawLine(0.0f, f4, width, f4, paint);
            }
            int i3 = (int) ((width - f3) / 2.0f);
            if (!refreshableNestedScrollingParent2.A0B) {
                LayerDrawable layerDrawable = this.A05;
                layerDrawable.setBounds(i3, 0, i3 + i, i2);
                layerDrawable.setLevel((int) (Math.max(0.0f, f2) * 10000.0f));
                layerDrawable.draw(canvas);
            } else {
                AlphaAnimation alphaAnimation = this.A02;
                long drawingTime = refreshableNestedScrollingParent.getDrawingTime();
                Transformation transformation = this.A06;
                if (alphaAnimation.getTransformation(drawingTime, transformation)) {
                    float abs = 1.2f - Math.abs(transformation.getAlpha());
                    canvas.scale(abs, abs, width / 2.0f, (float) (i / 2));
                }
                if (this.A01.getTransformation(refreshableNestedScrollingParent.getDrawingTime(), transformation)) {
                    float alpha = transformation.getAlpha();
                    Drawable drawable = this.A04;
                    drawable.setBounds(i3, 0, i3 + i, i2);
                    drawable.setLevel((int) (alpha * 10000.0f));
                    drawable.draw(canvas);
                    refreshableNestedScrollingParent.postInvalidateOnAnimation();
                }
            }
        } finally {
            canvas.restore();
        }
    }

    public final void D8Z(RefreshableNestedScrollingParent refreshableNestedScrollingParent) {
        AnonymousClass3AH r5 = this.A07;
        if (r5.A00 > 0.0d || r5.A01) {
            r5.A00 = 0.0d;
            r5.A01 = false;
            1Jk.A08(r5.A03);
        }
        this.A01.cancel();
        this.A02.cancel();
    }

    public final void EaP(boolean z) {
        if (z) {
            AlphaAnimation alphaAnimation = this.A02;
            alphaAnimation.reset();
            alphaAnimation.setStartTime(-1);
            alphaAnimation.start();
            AlphaAnimation alphaAnimation2 = this.A01;
            alphaAnimation2.reset();
            alphaAnimation2.setStartTime(-1);
            alphaAnimation2.start();
            this.A03.invalidate();
            return;
        }
        this.A01.cancel();
        this.A02.cancel();
    }
}
