package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.instagram.android.R;

public final class W4J implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C18510Vt7 A00;
    public final /* synthetic */ boolean A01;

    public W4J(C18510Vt7 vt7, boolean z) {
        this.A00 = vt7;
        this.A01 = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C18510Vt7 vt7 = this.A00;
        View view = vt7.A07;
        view.setAlpha(animatedFraction);
        if (this.A01) {
            view.setBackgroundColor(0nH.A02(animatedFraction, 0, vt7.A05.getContext().getColor(R.color.clips_overlay_ads_end_background_color)));
        }
    }
}
