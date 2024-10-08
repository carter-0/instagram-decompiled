package X;

import android.animation.AnimatorSet;
import android.view.View;

/* renamed from: X.M8l  reason: case insensitive filesystem */
public final class C66026M8l implements Runnable {
    public final /* synthetic */ AnimatorSet A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;

    public C66026M8l(AnimatorSet animatorSet, View view, View view2) {
        this.A00 = animatorSet;
        this.A01 = view;
        this.A02 = view2;
    }

    public final void run() {
        this.A00.end();
        this.A01.setVisibility(8);
        this.A02.setVisibility(8);
    }
}
