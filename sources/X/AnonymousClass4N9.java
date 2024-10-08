package X;

import android.view.View;

/* renamed from: X.4N9  reason: invalid class name */
public final class AnonymousClass4N9 implements Runnable {
    public final /* synthetic */ C263624Ms A00;

    public AnonymousClass4N9(C263624Ms r1) {
        this.A00 = r1;
    }

    public final void run() {
        C263624Ms r0 = this.A00;
        View view = r0.A04;
        if (view != null && r0.A09.B9s() == null) {
            view.getParent();
        }
    }
}
