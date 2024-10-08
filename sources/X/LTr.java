package X;

import android.animation.ValueAnimator;
import com.instagram.common.ui.base.IgTextView;

public final class LTr implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ IgTextView A03;
    public final /* synthetic */ C65048LmS A04;

    public LTr(IgTextView igTextView, C65048LmS lmS, float f, float f2, int i) {
        this.A03 = igTextView;
        this.A04 = lmS;
        this.A01 = f;
        this.A02 = i;
        this.A00 = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        0qQ.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
            float floatValue = number.floatValue();
            IgTextView igTextView = this.A03;
            C65048LmS lmS = this.A04;
            AnonymousClass0eM r4 = lmS.A0G;
            igTextView.setTextSize(0, ((float) DbX.A07(r4)) + (((float) (DbX.A07(lmS.A0F) - DbX.A07(r4))) * floatValue));
            igTextView.setTranslationX(this.A01 * floatValue);
            int i = this.A02;
            igTextView.setTranslationY(((((float) (i * 3)) * floatValue) * floatValue) - (((float) (i * 2)) * floatValue));
            igTextView.setRotation(this.A00 + (360.0f * floatValue));
        }
    }
}
