package X;

import android.location.Location;
import com.instagram.common.session.UserSession;

public abstract class FFZ {
    public static final Location A00(UserSession userSession) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        1Wr r0 = 1Wr.A00;
        if (r0 != null) {
            return r0.getLastLocation(userSession2, 10800000, 50000.0f, true, "UserSearchApi");
        }
        return null;
    }

    public static final 1OC A02(UserSession userSession, C47165Drg drg) {
        0qQ.A0B(userSession, 0);
        return DbU.A0S(A01(userSession, drg), C334247ax.class, C334257ay.class);
    }

    public static final 1OC A03(UserSession userSession, C47165Drg drg) {
        15p r0;
        0qQ.A0B(userSession, 0);
        1NY A01 = A01(userSession, drg);
        Class<C69148NfX> cls = C69148NfX.class;
        Class<ORN> cls2 = ORN.class;
        if (drg.A02 != null) {
            C375889Fq r02 = C375889Fq.A00;
            r0 = AnonymousClass15o.A00;
            0qQ.A08(r0);
        } else {
            r0 = null;
        }
        return DbT.A0R(r0, A01, cls, cls2, false);
    }

    public static final 1NY A01(UserSession userSession, C47165Drg drg) {
        String str;
        Location A00 = A00(userSession);
        String str2 = null;
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("users/search/");
        A0b.A9m("q", drg.A04);
        A0b.A9m("count", Integer.toString(drg.A00));
        if (A00 != null) {
            str = Double.valueOf(A00.getLatitude()).toString();
        } else {
            str = null;
        }
        A0b.A9m("lat", str);
        if (A00 != null) {
            str2 = Double.valueOf(A00.getLongitude()).toString();
        }
        A0b.A9m("lng", str2);
        A0b.A9m("timezone_offset", Long.toString(1G0.A00()));
        A0b.A9m("search_surface", drg.A06);
        A0b.A0G("rank_token", drg.A05);
        A0b.A0G(C66579MXk.A00(378), drg.A03);
        A0b.A0G("audio_cluster_id_for_coauthoring_check", drg.A01);
        A0b.A0G(AnonymousClass000.A00(3146), drg.A02);
        A0b.A9m("return_unconnected_private", "true");
        if (drg.A09) {
            A0b.A9m("sponsor_profile_only", "true");
        }
        if (drg.A07) {
            A0b.A9m("branded_content_creator_only", "true");
        }
        if (drg.A0A) {
            A0b.A9m("support_professional_sticker_search", "true");
        }
        return A0b;
    }
}
