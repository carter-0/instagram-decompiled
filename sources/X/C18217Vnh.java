package X;

import com.instagram.model.venue.Venue;
import java.util.Locale;

/* renamed from: X.Vnh  reason: case insensitive filesystem */
public abstract class C18217Vnh {
    public static final 0jB A00(1Xj r4) {
        0qQ.A0B(r4, 0);
        0jB r3 = new 0jB();
        Venue A23 = r4.A23();
        if (A23 != null) {
            r3.A04(C297705sC.A01, A23.A04());
            r3.A04(C297705sC.A02, A23.A00.getName());
        }
        r3.A04(C297705sC.A06, DbT.A12(Locale.ROOT, "PLACE"));
        return r3;
    }

    public static final 0jB A01(Venue venue) {
        0jB r2 = new 0jB();
        if (venue != null) {
            r2.A04(C297705sC.A03, venue.A04());
            r2.A04(C297705sC.A04, venue.A00.getName());
        }
        return r2;
    }
}
