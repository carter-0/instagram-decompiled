package X;

import android.animation.ValueAnimator;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public final class AJV implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AJV(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(valueAnimator, 0);
                if (((Fragment) this.A02).getContext() != null) {
                    ((ValueAnimator.AnimatorUpdateListener) this.A01).onAnimationUpdate(valueAnimator);
                    return;
                }
                return;
            case 1:
                float A002 = AnonymousClass7TH.A00(valueAnimator);
                C384879i2 r4 = (C384879i2) this.A02;
                TextView textView = r4.A0D;
                if (textView != null) {
                    View view = (View) this.A01;
                    textView.setX(AnonymousClass7TE.A02(view) * A002);
                    TextView textView2 = r4.A0D;
                    if (textView2 != null) {
                        textView2.setY(((float) ((view.getHeight() / 2) + (view.getWidth() / 2))) - (AnonymousClass7TE.A02(view) * A002));
                        return;
                    }
                }
                0qQ.A0F("arrowView");
                throw AnonymousClass00P.createAndThrow();
            default:
                if (0qQ.A0K(((ValueAnimator) this.A01).getAnimatedValue(), 1)) {
                    C307136Oy r0 = (C307136Oy) this.A02;
                    r0.A00();
                    TransitionDrawable transitionDrawable = r0.A02;
                    if (transitionDrawable != null) {
                        transitionDrawable.resetTransition();
                        transitionDrawable.startTransition(300);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
