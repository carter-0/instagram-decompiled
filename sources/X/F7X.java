package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

public abstract class F7X {
    public static 1OC A00(UserSession userSession, String str) {
        1NY A0O = DbU.A0O(userSession);
        A0O.A0A("notifications/get_notification_settings/");
        A0O.A9m(TraceFieldType.ContentType, str);
        return DbT.A0S(A0O, DwO.class, F7U.class);
    }

    public static 1OC A01(UserSession userSession, String str, String str2) {
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("notifications/change_notification_settings/");
        A0N.A9m(TraceFieldType.ContentType, str);
        A0N.A9m("setting_value", str2);
        return DbY.A0N(A0N, 1XP.class, 1XY.class);
    }
}
