package X;

import com.instagram.model.venue.Venue;

public final class WNK implements C267664bz {
    public final int A00;
    public final Object A01;

    public WNK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A8T(0xI r6) {
        0jB r0;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r6, 0);
                r0 = ((C15381Ube) this.A01).E4x();
                break;
            case 1:
                Venue venue = ((C15357Ub9) this.A01).A0H;
                if (venue != null) {
                    0qQ.A0B(r6, 0);
                    r0 = C18217Vnh.A01(venue);
                    break;
                } else {
                    return;
                }
            default:
                0qQ.A0B(r6, 0);
                C15286UZq uZq = (C15286UZq) this.A01;
                C13989Tnp.A1O(r6, C13988Tno.A0Y(uZq), C13988Tno.A0X(uZq), C13988Tno.A0a(uZq));
                r6.A0C("search_tab", C67419Mna.A00(uZq.A05().E51()));
                r6.A0C("selected_type", "USER");
                r6.A08(0, "position");
                return;
        }
        r6.A04(r0.A00());
    }
}
