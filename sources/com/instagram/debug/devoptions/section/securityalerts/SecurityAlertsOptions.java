package com.instagram.debug.devoptions.section.securityalerts;

import X.0sr;
import X.AnonymousClass07i;
import X.AnonymousClass4DH;
import X.AnonymousClass7TG;
import X.C50989Fmc;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

public final class SecurityAlertsOptions implements DeveloperOptionsSection {
    public static final SecurityAlertsOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r9, AnonymousClass07i r10) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        return 0sr.A1P(new C50989Fmc[]{C50989Fmc.A00(fragmentActivity, new SecurityAlertsOptions$getItems$1(userSession, fragmentActivity), 2131958306), C50989Fmc.A00(fragmentActivity, new SecurityAlertsOptions$getItems$2(userSession, fragmentActivity), 2131958304), C50989Fmc.A00(fragmentActivity, new SecurityAlertsOptions$getItems$3(userSession, fragmentActivity), 2131958305), C50989Fmc.A00(fragmentActivity, new SecurityAlertsOptions$getItems$4(userSession, fragmentActivity), 2131958303), C50989Fmc.A00(fragmentActivity, new SecurityAlertsOptions$getItems$5(userSession, fragmentActivity), 2131958302)});
    }

    public int getTitleRes() {
        return 2131958307;
    }
}
