package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

public abstract class I35 {
    public static void A02(0Aj r2, UserSession userSession, SavedCollection savedCollection) {
        r2.AAJ("collection_name", savedCollection.A0G);
        r2.AAJ("user_type", A01(savedCollection.A01(userSession)));
    }

    public static String A00(UserSession userSession, C66121jf r2) {
        return A01(r2.A07().A01(userSession));
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "OWNER";
            case 1:
                return "VIEWER";
            case 2:
                return C66579MXk.A00(490);
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
    }
}
