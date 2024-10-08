package X;

import com.instagram.model.venue.Venue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class LET {
    public final void A01(String str, String str2, List list) {
        KNN knn = (KNN) this;
        AnonymousClass7TG.A1N(str, list);
        knn.A01 = str;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        knn.A02 = str2;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A02 = ((Venue) it.next()).A02();
            0qQ.A07(A02);
            AnonymousClass7TE.A1Y(A0r, Long.parseLong(A02));
        }
        knn.A03 = A0r;
        0Aj A0e = AnonymousClass7TE.A0e(knn.A07, "place_picker_results_loaded");
        if (A0e.isSampled()) {
            A00(A0e, knn);
            if (knn.A09) {
                String str4 = knn.A01;
                if (str4.length() != 0) {
                    str3 = str4;
                }
                A0e.AAJ("query", str3);
                A0e.AAJ("list_type", "TRADITIONAL");
                A0e.AAe("results_fetched", knn.A03);
                String str5 = knn.A02;
                if (str5.length() > 0) {
                    A0e.AAJ("results_list_id", str5);
                }
            }
            A0e.Cgf();
        }
    }

    public final void A02(String str, List list) {
        KNN knn = (KNN) this;
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(knn.A07, "place_picker_place_picked");
        if (A0e.isSampled()) {
            A00(A0e, knn);
            if (knn.A09) {
                String str2 = knn.A01;
                if (str2.length() == 0) {
                    str2 = "";
                }
                A0e.AAJ("query", str2);
                A0e.AAJ("list_type", "TRADITIONAL");
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String A02 = ((Venue) it.next()).A02();
                    0qQ.A07(A02);
                    AnonymousClass7TE.A1Y(A0r, Long.parseLong(A02));
                }
                A0e.AAe("results_fetched", A0r);
                A0e.A9F("selected_page_id", AnonymousClass7TE.A10(str));
                String str3 = knn.A02;
                if (str3.length() > 0) {
                    A0e.AAJ("results_list_id", str3);
                }
            }
            A0e.Cgf();
        }
    }

    public static void A00(0Aj r4, KNN knn) {
        r4.A8M(knn.A05, "surface");
        r4.AAJ("place_picker_session_id", knn.A08);
        r4.A9F("milliseconds_since_start", Long.valueOf(knn.A06.now() - knn.A04));
        r4.AAJ("search_type", "ig_default");
    }
}
