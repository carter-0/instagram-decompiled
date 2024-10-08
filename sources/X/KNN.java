package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedList;
import java.util.List;

public final class KNN extends LET {
    public Boolean A00;
    public String A01;
    public String A02;
    public List A03;
    public final long A04;
    public final C62657KkJ A05;
    public final AnonymousClass0JR A06;
    public final 0wc A07;
    public final String A08 = AnonymousClass7TG.A0j();
    public final boolean A09;

    public final void A03() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A07, "place_picker_started");
        if (A0e.isSampled()) {
            A0e.AAJ("place_picker_session_id", this.A08);
            C51965G9l.A1A(this.A05, A0e);
            A0e.AAJ("search_type", "ig_default");
            Boolean bool = this.A00;
            if (bool != null) {
                A0e.A7p("has_location_services", bool);
            }
            A0e.Cgf();
        }
    }

    public KNN(AnonymousClass0JR r3, AnonymousClass0iw r4, UserSession userSession, Integer num, boolean z) {
        C62657KkJ kkJ;
        this.A06 = r3;
        this.A09 = z;
        this.A04 = r3.now();
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue == 0) {
                kkJ = C62657KkJ.IG_STORY;
            } else if (intValue == 2) {
                kkJ = C62657KkJ.IG_POST_SKITTLES;
            }
            this.A05 = kkJ;
            this.A01 = "";
            this.A02 = "";
            this.A03 = new LinkedList();
            this.A07 = AnonymousClass0kN.A01(r4, userSession);
        }
        kkJ = C62657KkJ.IG_POST;
        this.A05 = kkJ;
        this.A01 = "";
        this.A02 = "";
        this.A03 = new LinkedList();
        this.A07 = AnonymousClass0kN.A01(r4, userSession);
    }
}
