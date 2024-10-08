package X;

import android.location.Location;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Vo9  reason: case insensitive filesystem */
public abstract class C18242Vo9 {
    public static final 1OC A00(Location location, UserSession userSession, String str, String str2) {
        0qQ.A0C(userSession, AnonymousClass000.A00(333));
        String str3 = null;
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("fbsearch/account_serp/");
        A0b.A9m("query", str);
        A0b.A0C("count", 30);
        A0b.A9m("timezone_offset", String.valueOf(1G0.A00()));
        A0b.A9m("search_surface", str2);
        A0b.A0G("lat", C13989Tnp.A0n(location));
        if (location != null) {
            str3 = Double.valueOf(location.getLongitude()).toString();
        }
        A0b.A0G("lng", str3);
        return DbU.A0S(A0b, C69154Nfd.class, OR7.class);
    }

    public static final void A01(1NY r4, C17733Vd2 vd2) {
        String str;
        Integer num;
        r4.A05();
        r4.A0A(vd2.A08);
        r4.A9m("query", vd2.A0B);
        C13989Tnp.A1N(r4, "count", String.valueOf(30));
        r4.A9m("search_surface", vd2.A0C);
        r4.A0G("rank_token", vd2.A09);
        String str2 = vd2.A07;
        r4.A0G("next_max_id", str2);
        r4.A0G("page_token", str2);
        Location location = vd2.A05;
        String str3 = null;
        r4.A0G("lat", C13989Tnp.A0n(location));
        if (location != null) {
            str = Double.valueOf(location.getLongitude()).toString();
        } else {
            str = null;
        }
        r4.A0G("lng", str);
        r4.A0G(C66579MXk.A00(386), vd2.A0A);
        String str4 = vd2.A02;
        r4.A0G(AnonymousClass000.A00(3865), str4);
        if (str4 != null) {
            num = 00y.A0l(str4);
        } else {
            num = null;
        }
        r4.A09(num, "page_index");
        r4.A0G(AnonymousClass000.A00(3222), vd2.A01);
        r4.A0G(C66579MXk.A00(1030), vd2.A00);
        List list = vd2.A03;
        if (list != null) {
            str3 = list.toString();
        }
        r4.A0G("displaced_organic_media_ids", str3);
    }
}
