package com.instagram.debug.devoptions.section.survey;

import X.AnonymousClass07i;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C50989Fmc;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

public final class SurveyOptions implements DeveloperOptionsSection {
    public static final SurveyOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r5, AnonymousClass07i r6) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        return AnonymousClass7TE.A1I(C50989Fmc.A00(fragmentActivity, new SurveyOptions$getItems$1(userSession, fragmentActivity), 2131958310));
    }

    public int getTitleRes() {
        return 2131958296;
    }
}
