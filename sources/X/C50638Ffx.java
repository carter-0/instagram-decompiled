package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Ffx  reason: case insensitive filesystem */
public final class C50638Ffx implements C51913G7h {
    public boolean A00 = true;
    public final /* synthetic */ EO2 A01;

    public C50638Ffx(EO2 eo2) {
        this.A01 = eo2;
    }

    public final void Ctz() {
        EO2 eo2 = this.A01;
        FragmentActivity activity = eo2.getActivity();
        if (activity != null) {
            this.A00 = false;
            DbX.A10(activity, AnonymousClass37D.A00);
            eo2.A09 = false;
            DbU.A0d().A03(eo2.requireActivity(), eo2, AnonymousClass7TE.A0l(eo2.A00), "opal_nux", false);
            eo2.A0A = true;
        }
    }

    public final void DUs() {
        if (this.A00) {
            EO2.A02(this.A01);
        }
    }

    public final void DlL() {
        EO2 eo2 = this.A01;
        DbZ.A17(eo2);
        String str = eo2.A05;
        if (str == null) {
            str = "";
        }
        C49049EoT.A00(eo2, AnonymousClass7TE.A0l(eo2.A00), "tap", "skip", "opal_self_profile", str, (String) null);
    }
}
