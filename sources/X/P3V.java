package X;

import android.view.View;
import java.util.Set;

public final class P3V implements C74491Pvl {
    public 2EM A00 = AnonymousClass4iZ.A00;
    public final /* synthetic */ C71153OeR A01;

    public final C67237MkX Brv() {
        return null;
    }

    public final void DGH(View view, C67331Mm7 mm7, int i) {
    }

    public final void DU1() {
    }

    public final void Eji(2EM r1) {
    }

    public P3V(C71153OeR oeR) {
        this.A01 = oeR;
    }

    public final 2EM Brn() {
        return this.A00;
    }

    public final void DGG(C67331Mm7 mm7, int i) {
        C71153OeR oeR = this.A01;
        C68497NKq nKq = oeR.A06;
        C67331Mm7 mm72 = mm7;
        if (nKq != null) {
            oeR.A03.A03(mm72.A00, "CHANGE_FOLDER", (Set) nKq.A04.getValue());
        }
        AnonymousClass43H r5 = mm72.A00;
        this.A00 = r5;
        AnonymousClass43H r1 = AnonymousClass43H.A00;
        if (r5 == r1) {
            oeR.A0O = true;
            oeR.A0p.A00();
            C71153OeR.A0F(oeR);
            OTI.A00(oeR.A0m, "filtered_folder_clicked", oeR.A02.A02.A00, (String) null, (String) null, oeR.A0j.A05());
            if (nKq != null) {
                oeR.A02 = C70889OQh.A01(r1, (C2611948q) nKq.A06.getValue());
            }
            oeR.A0m(false, false);
            oeR.A0j();
        } else {
            oeR.A0o.A04("open_pending", (String) null);
            oeR.A0O = false;
            oeR.A0p.A01(oeR.A0a);
            if (nKq != null) {
                C71153OeR.A0D(C70889OQh.A01(r5, (C2611948q) nKq.A06.getValue()), oeR);
            }
            C71153OeR.A0J(oeR);
            C71153OeR.A0F(oeR);
        }
        if (C272094k5.A0C(oeR.A0h, true)) {
            C71153OeR.A0N(oeR, "direct_requests_select_folder", (String) null, this.A00.A04, AnonymousClass7TE.A1C(), -1);
        }
    }
}
