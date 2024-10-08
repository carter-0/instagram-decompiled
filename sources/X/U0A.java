package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class U0A extends AnimatorListenerAdapter {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ View A02;

    public U0A(View view, float f, float f2) {
        this.A02 = view;
        this.A00 = f;
        this.A01 = f2;
    }

    public final void onAnimationEnd(Animator animator) {
        View view = this.A02;
        view.setScaleX(this.A00);
        view.setScaleY(this.A01);
    }
}
