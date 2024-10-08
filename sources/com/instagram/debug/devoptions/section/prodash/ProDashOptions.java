package com.instagram.debug.devoptions.section.prodash;

import X.AnonymousClass07i;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C50989Fmc;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

public final class ProDashOptions implements DeveloperOptionsSection {
    public static final ProDashOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r5, AnonymousClass07i r6) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        return AnonymousClass7TE.A1I(C50989Fmc.A00(fragmentActivity, new ProDashOptions$getItems$1(fragmentActivity, userSession), 2131958159));
    }

    public int getTitleRes() {
        return 2131958158;
    }
}
