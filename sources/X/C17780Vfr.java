package X;

import android.os.Bundle;
import com.instagram.model.venue.Venue;
import java.util.Map;

/* renamed from: X.Vfr  reason: case insensitive filesystem */
public final class C17780Vfr {
    public final /* synthetic */ C15357Ub9 A00;

    public C17780Vfr(C15357Ub9 ub9) {
        this.A00 = ub9;
    }

    public final void A00() {
        String str;
        C15357Ub9 ub9 = this.A00;
        if (ub9.A0F != null) {
            1Wr.A00.getFragmentFactory();
            C15387Ubm ubm = new C15387Ubm();
            ubm.A02 = ub9.A0F;
            ubm.A01 = ub9.A0D;
            Bundle bundle = new Bundle();
            bundle.putString("location_id_key", ub9.A0J);
            Venue venue = ub9.A0H;
            if (venue != null) {
                bundle.putString("fb_page_id_key", venue.A04());
            }
            bundle.putString("info_page_logging_entry_point", "location_page");
            C309516Yo A0Q = DbU.A0Q(DbU.A0I(bundle, ubm, ub9), ub9.A02);
            A0Q.A0E(ubm);
            A0Q.A0F(ub9, 0);
            A0Q.A07 = new WNK(ub9, 1);
            A0Q.A04();
            W05 w05 = ub9.A0D;
            String str2 = ub9.A0J;
            Venue venue2 = ub9.A0H;
            if (venue2 != null) {
                str = venue2.A04();
            } else {
                str = null;
            }
            w05.A02((0xF) null, (0xF) null, "location_page", "tap_component", "view_information", str2, str, (String) null, (Map) null);
        }
    }
}
