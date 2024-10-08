package com.instagram.debug.devoptions.section.alternatetopicnudge;

import X.0sr;
import X.AnonymousClass07i;
import X.AnonymousClass4DH;
import X.AnonymousClass7TG;
import X.C50989Fmc;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

public final class AlternateTopicNudgeOptions implements DeveloperOptionsSection {
    public static final AlternateTopicNudgeOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r8, AnonymousClass07i r9) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        return 0sr.A1P(new C50989Fmc[]{new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new AlternateTopicNudgeOptions$getItems$1(userSession, fragmentActivity), (CharSequence) "Add Alternative Topic Nudge entry to NudgeTracker"), new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new AlternateTopicNudgeOptions$getItems$2(userSession, fragmentActivity), (CharSequence) "Clear All Alternative Topic Nudge entries in NudgeTracker"), new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new AlternateTopicNudgeOptions$getItems$3(userSession, fragmentActivity), (CharSequence) "Add old entries to AlternativeTopicNudge history")});
    }

    public int getTitleRes() {
        return 2131958283;
    }
}
