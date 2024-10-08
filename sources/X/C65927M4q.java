package X;

import android.view.View;

/* renamed from: X.M4q  reason: case insensitive filesystem */
public final class C65927M4q implements Runnable {
    public final /* synthetic */ C315496jz A00;

    public C65927M4q(C315496jz r1) {
        this.A00 = r1;
    }

    public final void run() {
        C315496jz r3 = this.A00;
        View view = r3.A08;
        if (view != null) {
            view.setAlpha(0.0f);
            View view2 = r3.A08;
            0qQ.A0A(view2);
            view2.setVisibility(0);
            View view3 = r3.A08;
            0qQ.A0A(view3);
            view3.animate().withLayer().setStartDelay(200).setDuration(200).alpha(0.5f).setListener(new C64194LTc(r3, 8));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
