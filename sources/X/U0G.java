package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

public final class U0G extends AnimatorListenerAdapter {
    public final /* synthetic */ AlphaAnimation A00;
    public final /* synthetic */ C14880UDi A01;
    public final /* synthetic */ C309426Yf A02;

    public final void onAnimationStart(Animator animator) {
    }

    public U0G(AlphaAnimation alphaAnimation, C14880UDi uDi, C309426Yf r3) {
        this.A01 = uDi;
        this.A00 = alphaAnimation;
        this.A02 = r3;
    }

    public final void onAnimationEnd(Animator animator) {
        TextView textView = this.A01.A01;
        textView.setVisibility(0);
        textView.startAnimation(this.A00);
        this.A02.A0e = true;
    }
}
