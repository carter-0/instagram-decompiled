package com.instagram.debug.devoptions.section.igdprivacy;

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

public final class IGDPrivacyOptions implements DeveloperOptionsSection {
    public static final IGDPrivacyOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r8, AnonymousClass07i r9) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        return 0sr.A1P(new C50989Fmc[]{new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new IGDPrivacyOptions$getItems$1(fragmentActivity, userSession), (CharSequence) "Privacy Bundle NUX"), C50989Fmc.A00(fragmentActivity, new IGDPrivacyOptions$getItems$2(userSession, fragmentActivity), 2131957926), C50989Fmc.A00(fragmentActivity, new IGDPrivacyOptions$getItems$3(userSession, fragmentActivity), 2131957732), C50989Fmc.A00(fragmentActivity, new IGDPrivacyOptions$getItems$4(userSession, fragmentActivity), 2131957730)});
    }

    public int getTitleRes() {
        return 2131958292;
    }
}
