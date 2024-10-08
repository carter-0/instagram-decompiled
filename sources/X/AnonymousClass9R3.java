package X;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.9R3  reason: invalid class name */
public final class AnonymousClass9R3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ Drawable A04;
    public final /* synthetic */ TextView A05;
    public final /* synthetic */ TextView A06;
    public final /* synthetic */ C339917kN A07;
    public final /* synthetic */ boolean A08;

    public AnonymousClass9R3(Drawable drawable, TextView textView, TextView textView2, C339917kN r4, float f, float f2, float f3, float f4, boolean z) {
        this.A04 = drawable;
        this.A07 = r4;
        this.A00 = f;
        this.A08 = z;
        this.A06 = textView;
        this.A03 = f2;
        this.A05 = textView2;
        this.A02 = f3;
        this.A01 = f4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        GradientDrawable gradientDrawable;
        0qQ.A0B(valueAnimator, 0);
        Drawable drawable = this.A04;
        ImageView imageView = this.A07.A07;
        float f = this.A00;
        boolean z = this.A08;
        TextView textView = this.A06;
        float f2 = this.A03;
        TextView textView2 = this.A05;
        float f3 = this.A02;
        float f4 = this.A01;
        Object animatedValue = valueAnimator.getAnimatedValue();
        0qQ.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float A042 = AnonymousClass7TE.A04(animatedValue);
        0qQ.A0B(drawable, 0);
        AnonymousClass9SA.A00(drawable, imageView, A042, f, z);
        if (textView != null) {
            textView.setTextSize(0, A042 * f2);
        }
        if (textView2 != null) {
            textView2.setTextSize(0, f3 * A042);
            Drawable background = textView2.getBackground();
            Drawable drawable2 = null;
            if (background != null) {
                drawable2 = background.mutate();
            }
            if ((drawable2 instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable2) != null) {
                float f5 = (1.0f - A042) * 0.5f;
                int measuredWidth = (int) (((float) textView2.getMeasuredWidth()) * f5);
                int measuredHeight = (int) (f5 * ((float) textView2.getMeasuredHeight()));
                gradientDrawable.setBounds(new Rect(measuredWidth, measuredHeight, textView2.getMeasuredWidth() - measuredWidth, textView2.getMeasuredHeight() - measuredHeight));
                gradientDrawable.setCornerRadius(A042 * f4);
            }
        }
    }
}
