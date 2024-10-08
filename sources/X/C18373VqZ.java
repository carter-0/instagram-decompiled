package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.VqZ  reason: case insensitive filesystem */
public abstract class C18373VqZ {
    public static final Map A00 = DbY.A0q(6, "CATEGORY", new 0eP(C13988Tno.A0R(), "HASHTAG"), new 0eP(C66580MXl.A0q(), "LOCATION"));

    public static final void A00(UserSession userSession, C66942Mfb mfb) {
        1NY A0L = DbZ.A0L(userSession);
        A0L.A0A("map/register_recent_search/");
        A0L.A9m("target_id", mfb.A01());
        A0L.A9m("target_type", (String) C51968G9o.A10(A00, mfb.A01));
        A0L.A0Q(C43775CCt.class, C45542CyG.class);
        1ES.A03(DbW.A0K(A0L));
    }
}
