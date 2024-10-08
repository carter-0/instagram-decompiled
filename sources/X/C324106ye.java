package X;

import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.transition.TransitionSet;

/* renamed from: X.6ye  reason: invalid class name and case insensitive filesystem */
public abstract class C324106ye {
    public static final void A00(Scene scene) {
        0qQ.A0B(scene, 0);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addTransition(new Fade(2));
        transitionSet.addTransition(new Fade(1));
        transitionSet.setDuration(300);
        TransitionManager.go(scene, transitionSet);
    }
}
