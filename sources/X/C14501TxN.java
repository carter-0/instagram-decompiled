package X;

import android.location.Location;
import com.instagram.common.session.UserSession;

/* renamed from: X.TxN  reason: case insensitive filesystem */
public abstract class C14501TxN {
    public static final 1OC A00(UserSession userSession, String str, String str2, String str3, String str4, String str5, int i) {
        0qQ.A0B(userSession, 0);
        Location performIntegrityChecks = 1Wr.performIntegrityChecks((Location) null);
        String str6 = null;
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        if (str5 != null) {
            A0b.A0E = str5;
            A0b.A0O((15p) null, C67449Mo4.class, C67448Mo3.class, false);
            A0b.A06 = 1CE.A04;
            A0b.A0V = true;
            A0b.A9m("query", str);
            A0b.A9m("count", String.valueOf(i));
            A0b.A9m("context", "blended");
            A0b.A9m("lat", C13989Tnp.A0n(performIntegrityChecks));
            if (performIntegrityChecks != null) {
                str6 = Double.valueOf(performIntegrityChecks.getLongitude()).toString();
            }
            C13989Tnp.A1N(A0b, "lng", str6);
            A0b.A9m("search_surface", str2);
            A0b.A0G("rank_token", str4);
            A0b.A0G("page_token", str3);
            return A0b.A0M();
        }
        throw AnonymousClass7TE.A0y();
    }
}
