package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class U07 extends AnimatorListenerAdapter {
    public final /* synthetic */ C309346Xx A00;

    public U07(C309346Xx r1) {
        this.A00 = r1;
    }

    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        C309346Xx r2 = this.A00;
        r2.A02 = (r2.A02 + 4) % r2.A07.A05.length;
    }
}
