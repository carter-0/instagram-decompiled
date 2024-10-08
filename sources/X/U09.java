package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class U09 extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;

    public U09(View view) {
        this.A00 = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A00.setVisibility(8);
    }
}
