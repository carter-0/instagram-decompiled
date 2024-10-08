package X;

import androidx.fragment.app.FragmentActivity;

public final class HFX extends C262934Go {
    public final /* synthetic */ C246323eP A00;
    public final /* synthetic */ 1Av A01;

    public HFX(C246323eP r1, 1Av r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void D9d() {
        this.A01.A0P();
        C246323eP r1 = this.A00;
        FragmentActivity activity = r1.A00.getActivity();
        if (activity != null) {
            C71342cb.A00(r1.A02).A0A(activity, "back");
        }
    }
}
