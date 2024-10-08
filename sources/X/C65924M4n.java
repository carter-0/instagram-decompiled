package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.M4n  reason: case insensitive filesystem */
public final class C65924M4n implements Runnable {
    public final /* synthetic */ C61427K7c A00;

    public C65924M4n(C61427K7c k7c) {
        this.A00 = k7c;
    }

    public final void run() {
        AnonymousClass37D A0i;
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null && (A0i = DbT.A0i(activity)) != null) {
            A0i.A0V(false);
        }
    }
}
