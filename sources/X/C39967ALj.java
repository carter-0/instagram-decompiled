package X;

import android.transition.Transition;
import android.transition.TransitionSet;

/* renamed from: X.ALj  reason: case insensitive filesystem */
public final class C39967ALj implements Transition.TransitionListener {
    public final /* synthetic */ TransitionSet A00;
    public final /* synthetic */ C362868ic A01;

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
    }

    public C39967ALj(TransitionSet transitionSet, C362868ic r2) {
        this.A00 = transitionSet;
        this.A01 = r2;
    }

    public final void onTransitionEnd(Transition transition) {
        this.A00.removeListener(this);
        AnonymousClass85O r2 = this.A01.A0F;
        AnonymousClass7TF.A1K(r2, C318116oQ.A00(r2), 6);
    }
}
