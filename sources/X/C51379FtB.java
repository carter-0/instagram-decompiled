package X;

import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;

/* renamed from: X.FtB  reason: case insensitive filesystem */
public final class C51379FtB implements Runnable {
    public final /* synthetic */ Scene A00;
    public final /* synthetic */ Transition A01;

    public C51379FtB(Scene scene, Transition transition) {
        this.A00 = scene;
        this.A01 = transition;
    }

    public final void run() {
        TransitionManager.go(this.A00, this.A01);
    }
}
