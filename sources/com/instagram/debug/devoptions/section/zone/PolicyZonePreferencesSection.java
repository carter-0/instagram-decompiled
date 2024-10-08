package com.instagram.debug.devoptions.section.zone;

import X.0qQ;
import X.AnonymousClass07i;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.C50989Fmc;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

public final class PolicyZonePreferencesSection implements DeveloperOptionsSection {
    public static final PolicyZonePreferencesSection INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r6, AnonymousClass07i r7) {
        0qQ.A0B(fragmentActivity, 1);
        return AnonymousClass7TE.A1I(new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new PolicyZonePreferencesSection$getItems$1(fragmentActivity), 2131958071));
    }

    public int getTitleRes() {
        return 2131958155;
    }
}
