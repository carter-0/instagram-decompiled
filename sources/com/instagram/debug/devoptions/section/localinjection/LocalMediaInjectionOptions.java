package com.instagram.debug.devoptions.section.localinjection;

import X.AnonymousClass07i;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C50989Fmc;
import X.DbV;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.ArrayList;
import java.util.List;

public final class LocalMediaInjectionOptions implements DeveloperOptionsSection {
    public static final LocalMediaInjectionOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r7, AnonymousClass07i r8) {
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, fragmentActivity);
        ArrayList A1C = AnonymousClass7TE.A1C();
        C50989Fmc.A02(fragmentActivity, new LocalMediaInjectionOptions$getItems$1(fragmentActivity, userSession), A1C, 2131958059);
        DbV.A1W(A1C, A1Z);
        return A1C;
    }

    public int getTitleRes() {
        return 2131958103;
    }
}
