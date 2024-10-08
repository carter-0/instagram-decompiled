package X;

import androidx.fragment.app.FragmentActivity;

public final class TFZ implements Runnable {
    public final /* synthetic */ QL1 A00;
    public final /* synthetic */ C340027ka A01;

    public TFZ(QL1 ql1, C340027ka r2) {
        this.A00 = ql1;
        this.A01 = r2;
    }

    public final void run() {
        QL1 ql1 = this.A00;
        AnonymousClass2Fj r2 = C11364SPc.A02(ql1).A0O;
        FragmentActivity activity = this.A01.getActivity();
        if (activity != null) {
            r2.A06(activity, ql1.A0A);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
