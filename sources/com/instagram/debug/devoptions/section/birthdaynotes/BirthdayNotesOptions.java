package com.instagram.debug.devoptions.section.birthdaynotes;

import X.AnonymousClass07i;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C50989Fmc;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

public final class BirthdayNotesOptions implements DeveloperOptionsSection {
    public static final BirthdayNotesOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r5, AnonymousClass07i r6) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        return AnonymousClass7TE.A1I(C50989Fmc.A00(fragmentActivity, new BirthdayNotesOptions$getItems$1(userSession), 2131957726));
    }

    public int getTitleRes() {
        return 2131957725;
    }
}
