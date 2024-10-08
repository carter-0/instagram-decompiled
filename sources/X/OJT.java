package X;

import java.util.HashMap;

public final class OJT {
    public final /* synthetic */ NVN A00;

    public OJT(NVN nvn) {
        this.A00 = nvn;
    }

    public final void A00(C69374NkE nkE) {
        NVN nvn = this.A00;
        nvn.getAdapter().A08(0sn.A00);
        nvn.getAdapter().notifyDataSetChanged();
        ((NVR) nvn.A01.getValue()).A0F(nkE);
        C71140Odl odl = (C71140Odl) nvn.A04.getValue();
        0Aj A002 = C71140Odl.A00(odl);
        if (A002.isSampled()) {
            C71140Odl.A04(A002, odl);
            DbS.A1I(A002, "filter_suggested_channels");
            DbS.A1M(A002, "inbox_directory_sheet");
            Dba.A1B(A002, "source", "pill_button");
            C66584MXp.A0u(A002, odl.A00);
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("chosen_filter", nkE.A03);
            C66583MXo.A18(A002, A1E);
        }
    }
}
