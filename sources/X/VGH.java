package X;

import com.instagram.common.session.UserSession;
import java.util.Locale;

public abstract class VGH {
    public static final void A00(1P0 r6, UserSession userSession, C14407Tva tva, String str, String str2, int i) {
        int ordinal;
        String str3;
        1NY A0a;
        String A0k;
        if (tva == null) {
            ordinal = -1;
        } else {
            ordinal = tva.ordinal();
        }
        Locale locale = Locale.getDefault();
        0qQ.A07(locale);
        String lowerCase = str2.toLowerCase(locale);
        if (ordinal == 5) {
            0qQ.A07(lowerCase);
            str3 = "map/remove_recent_search/";
        } else {
            0qQ.A07(lowerCase);
            str3 = "fbsearch/hide_search_entities/";
        }
        0qQ.A0B(str, 4);
        Object A10 = C51968G9o.A10(VKC.A00, i);
        0qQ.A0A(A10);
        String str4 = (String) A10;
        0qQ.A0B(str4, 2);
        if (tva == C14407Tva.MAP) {
            if (str4.equals("place")) {
                A0k = "LOCATION";
            } else {
                A0k = AnonymousClass7TF.A0k(str4);
            }
            A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0E = str3;
            A0a.A9m("target_id", str);
            DbX.A1M(A0a, "target_type", A0k);
            A0a.A0R = true;
        } else {
            A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0E = str3;
            DbX.A1M(A0a, "section", lowerCase);
            String A0k2 = C51970G9q.A0k(AnonymousClass7TE.A1I(str));
            0qQ.A07(A0k2);
            A0a.A9m(str4, A0k2);
        }
        1OC A0M = A0a.A0M();
        if (r6 != null) {
            A0M.A00 = r6;
        }
        1ES.A03(A0M);
    }
}
