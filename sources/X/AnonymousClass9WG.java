package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.9WG  reason: invalid class name */
public final class AnonymousClass9WG extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass8ZI A00;

    public AnonymousClass9WG(AnonymousClass8ZI r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        C66504MUi mUi;
        AnonymousClass8ZI r1 = this.A00;
        r1.A00 = AnonymousClass8ZH.STOP;
        AnonymousClass8ZK r0 = r1.A08;
        if (r0 != null && (mUi = r0.A00.A08) != null) {
            mUi.DXO();
        }
    }
}
