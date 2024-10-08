package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.GcQ  reason: case insensitive filesystem */
public final class C52773GcQ extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C258323yp A01;

    public C52773GcQ(View view, C258323yp r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void onAnimationEnd(Animator animator) {
        C258323yp.A03(this.A00, this.A01);
    }
}
