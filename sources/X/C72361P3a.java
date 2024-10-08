package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.P3a  reason: case insensitive filesystem */
public final class C72361P3a implements C74471PvR {
    public final /* synthetic */ NJF A00;

    public final void Cyg() {
    }

    public C72361P3a(NJF njf) {
        this.A00 = njf;
    }

    public final void D8J(long j) {
        NdA ndA = (NdA) this.A00.A0G.getValue();
        if (j != 0) {
            ndA.A01.A07(j);
        }
    }

    public final void DwM(String str) {
        ((NdA) this.A00.A0G.getValue()).A01.A0A(str);
    }

    public final void Euw() {
        NJF njf = this.A00;
        C69312NjD njD = C69312NjD.MUTE_NOTE;
        FragmentActivity activity = njf.getActivity();
        if (activity != null) {
            C71054OaW.A01(activity, njD);
        }
    }
}
