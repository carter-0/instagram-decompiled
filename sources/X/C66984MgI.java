package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.MgI  reason: case insensitive filesystem */
public final class C66984MgI extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C226462gr A01;
    public final /* synthetic */ C67301Mlb A02;

    public C66984MgI(C226462gr r1, C67301Mlb mlb, int i) {
        this.A02 = mlb;
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onAnimationEnd(Animator animator) {
        C67301Mlb mlb = this.A02;
        C226462gr r5 = this.A01;
        long j = (long) this.A00;
        mlb.A05.setImageDrawable(r5);
        if (j > 0) {
            r5.EFJ((int) j);
        } else {
            r5.EFK();
        }
        r5.E2p();
    }
}
