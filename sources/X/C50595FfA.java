package X;

import android.os.Bundle;

/* renamed from: X.FfA  reason: case insensitive filesystem */
public final class C50595FfA implements G7G {
    public final /* synthetic */ C47501E5g A00;
    public final /* synthetic */ String A01;

    public C50595FfA(C47501E5g e5g, String str) {
        this.A00 = e5g;
        this.A01 = str;
    }

    public final void DED() {
        C47501E5g e5g = this.A00;
        EEK eek = e5g.A02;
        if (eek != null) {
            eek.A00();
        }
        C59689JTv.A01(e5g.requireContext(), "cp_acquisition_phone", 2131974093, 1);
    }

    public final void DoT(C8L c8l) {
        C47501E5g e5g = this.A00;
        EEK eek = e5g.A02;
        if (eek != null) {
            eek.A00();
        }
        if (c8l != null) {
            C43417Bxt A0E = c8l.A0E();
            if (A0E == null || !A0E.getRequiredBooleanField(0, AnonymousClass000.A00(1125))) {
                C43417Bxt A0E2 = c8l.A0E();
                if (A0E2 != null && A0E2.getRequiredBooleanField(1, "code_sent")) {
                    String str = this.A01;
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putString("nux_contact_point", str);
                    A0a.putBoolean("nux_contact_point_is_phone", true);
                    DbT.A15();
                    C47502E5h e5h = new C47502E5h();
                    Dbc.A0S(e5h, DbU.A0I(A0a, e5h, e5g), e5g.A06);
                    return;
                }
            } else {
                C51950G8t g8t = e5g.A01;
                if (g8t != null) {
                    g8t.Cm0(1);
                    return;
                }
                return;
            }
        }
        C59689JTv.A01(e5g.requireContext(), "cp_acquisition_phone", 2131974093, 1);
    }
}
