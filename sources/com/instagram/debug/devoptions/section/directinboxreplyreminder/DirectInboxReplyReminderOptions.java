package com.instagram.debug.devoptions.section.directinboxreplyreminder;

import X.AnonymousClass07i;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C50989Fmc;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

public final class DirectInboxReplyReminderOptions implements DeveloperOptionsSection {
    public static final DirectInboxReplyReminderOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r6, AnonymousClass07i r7) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        return AnonymousClass7TE.A1I(new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new DirectInboxReplyReminderOptions$getItems$1(userSession), 2131958058));
    }

    public int getTitleRes() {
        return 2131958057;
    }
}
