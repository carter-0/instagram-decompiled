package com.instagram.debug.devoptions.section.activityfeed;

import X.0sr;
import X.AnonymousClass07i;
import X.AnonymousClass4DH;
import X.AnonymousClass7TG;
import X.C50989Fmc;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

public final class ActivityFeedOptions implements DeveloperOptionsSection {
    public static final ActivityFeedOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r7, AnonymousClass07i r8) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        return 0sr.A1P(new C50989Fmc[]{C50989Fmc.A00(fragmentActivity, new ActivityFeedOptions$getItems$1(userSession), 2131958205), C50989Fmc.A00(fragmentActivity, new ActivityFeedOptions$getItems$2(userSession, fragmentActivity), 2131957687), C50989Fmc.A00(fragmentActivity, new ActivityFeedOptions$getItems$3(userSession, fragmentActivity), 2131957686)});
    }

    public int getTitleRes() {
        return 2131957685;
    }
}
