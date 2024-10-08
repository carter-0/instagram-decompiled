package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.widget.TextView;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;
import java.util.List;

/* renamed from: X.61f  reason: invalid class name and case insensitive filesystem */
public final class C3020261f extends AnimatorListenerAdapter {
    public final /* synthetic */ AnimatedHintsTextLayout A00;

    public C3020261f(AnimatedHintsTextLayout animatedHintsTextLayout) {
        this.A00 = animatedHintsTextLayout;
    }

    public final void onAnimationEnd(Animator animator) {
        AnimatedHintsTextLayout animatedHintsTextLayout = this.A00;
        ValueAnimator valueAnimator = animatedHintsTextLayout.A04;
        String str = "fadeInAnimator";
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = animatedHintsTextLayout.A04;
                if (valueAnimator2 != null) {
                    valueAnimator2.end();
                }
            }
            ValueAnimator valueAnimator3 = animatedHintsTextLayout.A05;
            str = "fadeOutAnimator";
            if (valueAnimator3 != null) {
                if (valueAnimator3.isRunning()) {
                    ValueAnimator valueAnimator4 = animatedHintsTextLayout.A05;
                    if (valueAnimator4 != null) {
                        valueAnimator4.end();
                    }
                }
                List list = animatedHintsTextLayout.A0G;
                int size = (animatedHintsTextLayout.A02 + 1) % list.size();
                animatedHintsTextLayout.A02 = size;
                CharSequence charSequence = (CharSequence) list.get(size);
                TextView textView = animatedHintsTextLayout.A08;
                if (textView == null) {
                    str = "currentHintTextView";
                } else {
                    textView.setAlpha(1.0f);
                    textView.setHint(charSequence);
                    TextView textView2 = animatedHintsTextLayout.A09;
                    if (textView2 == null) {
                        str = "nextHintTextView";
                    } else {
                        textView2.setHint((CharSequence) list.get((animatedHintsTextLayout.A02 + 1) % list.size()));
                        textView2.setAlpha(0.0f);
                        animatedHintsTextLayout.A00 = 0.0f;
                        animatedHintsTextLayout.A01 = 1.0f;
                        AnimatedHintsTextLayout.A02(animatedHintsTextLayout);
                        animatedHintsTextLayout.A0F.sendEmptyMessageDelayed(2, animatedHintsTextLayout.A03);
                        X5C x5c = animatedHintsTextLayout.A0A;
                        if (x5c != null) {
                            x5c.DJU(charSequence);
                        }
                        C20857X1j x1j = animatedHintsTextLayout.A0B;
                        if (x1j != null) {
                            ((C14402TvV) x1j).A00.A00 = animatedHintsTextLayout.A02;
                            return;
                        }
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
