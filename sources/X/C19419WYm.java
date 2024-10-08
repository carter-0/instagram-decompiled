package X;

import com.instagram.model.venue.Venue;

/* renamed from: X.WYm  reason: case insensitive filesystem */
public final class C19419WYm implements C20956X6j {
    public final /* synthetic */ C15357Ub9 A00;

    public C19419WYm(C15357Ub9 ub9) {
        this.A00 = ub9;
    }

    public final void DKU(C15260UXv uXv) {
        C15357Ub9 ub9 = this.A00;
        ub9.A0F = uXv;
        C51970G9q.A12(ub9.getActivity());
        W05 w05 = ub9.A0D;
        w05.A04 = "fetch_data";
        w05.A07 = "location_page";
        w05.A01 = "view_information";
        w05.A06 = ub9.A0J;
        Venue venue = ub9.A0H;
        if (venue != null) {
            w05.A05 = venue.A04();
        }
        ub9.A0D.A01();
    }

    public final void DKV(String str) {
        C15357Ub9 ub9 = this.A00;
        W05 w05 = ub9.A0D;
        w05.A04 = C66579MXk.A00(849);
        w05.A07 = "location_page";
        w05.A01 = "view_information";
        w05.A06 = ub9.A0J;
        w05.A03 = str;
        Venue venue = ub9.A0H;
        if (venue != null) {
            w05.A05 = venue.A04();
        }
        ub9.A0D.A01();
    }
}
