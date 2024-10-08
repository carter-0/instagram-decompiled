package com.instagram.debug.devoptions.section.creator.agents;

import X.0sr;
import X.AnonymousClass07i;
import X.AnonymousClass4DH;
import X.AnonymousClass7TG;
import X.C50989Fmc;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

public final class CreatorAgentsDeveloperOptions implements DeveloperOptionsSection {
    public static final CreatorAgentsDeveloperOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r11, AnonymousClass07i r12) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        return 0sr.A1P(new C50989Fmc[]{C50989Fmc.A00(fragmentActivity, new CreatorAgentsDeveloperOptions$getItems$1(userSession), 2131957821), C50989Fmc.A00(fragmentActivity, new CreatorAgentsDeveloperOptions$getItems$2(userSession), 2131957825), C50989Fmc.A00(fragmentActivity, new CreatorAgentsDeveloperOptions$getItems$3(userSession), 2131957826), C50989Fmc.A00(fragmentActivity, new CreatorAgentsDeveloperOptions$getItems$4(userSession), 2131957822), C50989Fmc.A00(fragmentActivity, new CreatorAgentsDeveloperOptions$getItems$5(fragmentActivity, userSession), 2131957823), C50989Fmc.A00(fragmentActivity, new CreatorAgentsDeveloperOptions$getItems$6(userSession, fragmentActivity), 2131957824)});
    }

    public int getTitleRes() {
        return 2131957820;
    }
}
