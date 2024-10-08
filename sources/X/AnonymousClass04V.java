package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.04V  reason: invalid class name */
public final class AnonymousClass04V extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass04X A01;
    public final /* synthetic */ 04a A02;

    public AnonymousClass04V(View view, AnonymousClass04X r2, 04a r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = view;
    }

    public final void onAnimationEnd(Animator animator) {
        04a r2 = this.A02;
        r2.A00.A08(1.0f);
        0uT.A03(this.A00, r2);
    }
}
