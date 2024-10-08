package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;

public final class OVP {
    public AnonymousClass1aS A00 = 1aF.A00();
    public 17i A01;
    public Integer A02;
    public C69360Nk0 A03 = C69360Nk0.EVERYONE;
    public final UserSession A04;
    public final VFW A05;

    public static VT5 A00(OVP ovp) {
        return new VT5(ovp.A03, ovp.A02, DbT.A0j(ovp.A04).A1k());
    }

    public final 1aU A01(boolean z) {
        String str;
        UserSession userSession = this.A04;
        User A0j = DbT.A0j(userSession);
        A0j.A03.Ept(Boolean.valueOf(z));
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("usertags/review_preference/");
        A0N.A0R(1XP.class, 1XY.class);
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        A0N.A9m("enabled", str);
        A0N.A0R = true;
        return C69818Nsf.A00(A0N.A0M()).A0L(new C72026Ov0(2, this, z));
    }

    public OVP(UserSession userSession, VFW vfw, 17i r4) {
        this.A04 = userSession;
        this.A05 = vfw;
        this.A01 = r4;
    }
}
