package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.M4m  reason: case insensitive filesystem */
public final class C65923M4m implements Runnable {
    public final /* synthetic */ K7b A00;

    public C65923M4m(K7b k7b) {
        this.A00 = k7b;
    }

    public final void run() {
        AnonymousClass37D A0i;
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null && (A0i = DbT.A0i(activity)) != null) {
            A0i.A0V(false);
        }
    }
}
