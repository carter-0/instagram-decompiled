package com.instagram.debug.devoptions.section.xme;

import X.0sr;
import X.AnonymousClass07i;
import X.AnonymousClass4DH;
import X.AnonymousClass7TG;
import X.C50989Fmc;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

public final class XMEOptions implements DeveloperOptionsSection {
    public static final XMEOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r13, AnonymousClass07i r14) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        return 0sr.A1P(new C50989Fmc[]{C50989Fmc.A00(fragmentActivity, new XMEOptions$getItems$1(userSession, fragmentActivity), 2131958390), C50989Fmc.A00(fragmentActivity, new XMEOptions$getItems$2(userSession, fragmentActivity), 2131958386), C50989Fmc.A00(fragmentActivity, new XMEOptions$getItems$3(userSession, fragmentActivity), 2131958389), C50989Fmc.A00(fragmentActivity, new XMEOptions$getItems$4(userSession, fragmentActivity), 2131958392), C50989Fmc.A00(fragmentActivity, new XMEOptions$getItems$5(fragmentActivity, userSession), 2131958396), C50989Fmc.A00(fragmentActivity, new XMEOptions$getItems$6(fragmentActivity, userSession), 2131958384), C50989Fmc.A00(fragmentActivity, new XMEOptions$getItems$7(fragmentActivity, userSession), 2131958383), C50989Fmc.A00(fragmentActivity, new XMEOptions$getItems$8(userSession, fragmentActivity), 2131958394)});
    }

    public int getTitleRes() {
        return 2131958385;
    }
}
