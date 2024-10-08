package com.instagram.debug.devoptions.section.takeabreak;

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

public final class TakeABreakOptions implements DeveloperOptionsSection {
    public static final TakeABreakOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r7, AnonymousClass07i r8) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        return 0sr.A1P(new C50989Fmc[]{new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new TakeABreakOptions$getItems$1(userSession, fragmentActivity), (CharSequence) "Clear has seen Take a Break"), new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new TakeABreakOptions$getItems$2(userSession, fragmentActivity), (CharSequence) "Set Take a Break upsell last seen time to two days ago")});
    }

    public int getTitleRes() {
        return 2131958298;
    }
}
