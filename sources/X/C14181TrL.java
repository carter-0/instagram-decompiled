package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.TrL  reason: case insensitive filesystem */
public final class C14181TrL extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C324466zK A01;

    public C14181TrL(View view, C324466zK r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void onAnimationEnd(Animator animator) {
        C324466zK r2 = this.A01;
        if (r2.A03 == AnonymousClass05K.A01) {
            AnonymousClass7TH.A0R(this.A00);
            r2.A04 = true;
        }
    }

    public final void onAnimationStart(Animator animator) {
        C324466zK r2 = this.A01;
        if (r2.A03 == AnonymousClass05K.A00) {
            View view = this.A00;
            if (view != null) {
                view.setVisibility(0);
            }
            r2.A04 = false;
        }
    }
}
