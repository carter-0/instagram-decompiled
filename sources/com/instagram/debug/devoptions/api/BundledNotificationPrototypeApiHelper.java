package com.instagram.debug.devoptions.api;

import X.1NY;
import X.1OC;
import X.1P0;
import X.1XP;
import X.1XY;
import X.DbT;
import X.DbU;
import com.instagram.common.session.UserSession;

public class BundledNotificationPrototypeApiHelper {
    public static 1OC createBundledActivityFeedPrototypeTask(UserSession userSession, String str, 1P0 r4) {
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("commerce/inbox/prototype/");
        A0N.A9m("experience", str);
        1OC A0S = DbT.A0S(A0N, 1XP.class, 1XY.class);
        A0S.A00 = r4;
        return A0S;
    }

    public static 1OC createBundledActivityFeedRetrieveExperienceTask(UserSession userSession, 1P0 r3) {
        1NY A0O = DbU.A0O(userSession);
        A0O.A0A("commerce/inbox/prototype/setting/");
        1OC A0S = DbT.A0S(A0O, BundledActivityFeedExperienceResponse.class, BundledActivityFeedExperienceResponse__JsonHelper.class);
        A0S.A00 = r3;
        return A0S;
    }
}
