package X;

import androidx.fragment.app.FragmentActivity;

public final class PVV implements Runnable {
    public final /* synthetic */ NKN A00;

    public PVV(NKN nkn) {
        this.A00 = nkn;
    }

    public final void run() {
        AnonymousClass37D A0i;
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null && (A0i = DbT.A0i(activity)) != null) {
            A0i.A0V(false);
        }
    }
}
