package com.instagram.debug.devoptions.section.creationgenai;

import X.1Au;
import X.1Av;
import X.AnonymousClass07i;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C50989Fmc;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.ArrayList;
import java.util.List;

public final class CreationGenAIOptions implements DeveloperOptionsSection {
    public static final CreationGenAIOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r7, AnonymousClass07i r8) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        ArrayList A1C = AnonymousClass7TE.A1C();
        1Av A00 = 1Au.A00(userSession);
        C50989Fmc.A02(fragmentActivity, new CreationGenAIOptions$getItems$1(A00), A1C, 2131958093);
        C50989Fmc.A02(fragmentActivity, new CreationGenAIOptions$getItems$2(fragmentActivity, userSession), A1C, 2131958094);
        C50989Fmc.A02(fragmentActivity, new CreationGenAIOptions$getItems$3(fragmentActivity, A00, userSession), A1C, 2131958125);
        C50989Fmc.A02(fragmentActivity, new CreationGenAIOptions$getItems$4(A00), A1C, 2131958092);
        C50989Fmc.A02(fragmentActivity, new CreationGenAIOptions$getItems$5(A00), A1C, 2131958127);
        C50989Fmc.A02(fragmentActivity, new CreationGenAIOptions$getItems$6(A00), A1C, 2131958126);
        return A1C;
    }

    public int getTitleRes() {
        return 2131957819;
    }
}
