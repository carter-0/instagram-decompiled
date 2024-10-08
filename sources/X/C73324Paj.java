package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: X.Paj  reason: case insensitive filesystem */
public final class C73324Paj implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;

    public C73324Paj(View view, View view2, float f) {
        this.A02 = view;
        this.A00 = f;
        this.A01 = view2;
    }

    public final void run() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.A02;
        float f = this.A00;
        View view2 = this.A01;
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f}).setDuration(500), ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f, f}).setDuration(500), ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.0f, 1.0f}).setDuration(500), ObjectAnimator.ofFloat(view2, "translationY", new float[]{-f, 0.0f}).setDuration(500)});
        animatorSet.start();
    }
}
