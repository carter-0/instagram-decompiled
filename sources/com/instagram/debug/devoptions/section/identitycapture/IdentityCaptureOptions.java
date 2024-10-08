package com.instagram.debug.devoptions.section.identitycapture;

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

public final class IdentityCaptureOptions implements DeveloperOptionsSection {
    public static final IdentityCaptureOptions INSTANCE = new Object();
    public static final String TAG = "IdentityCaptureOptions";

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r8, AnonymousClass07i r9) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        return 0sr.A1P(new C50989Fmc[]{new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new IdentityCaptureOptions$getItems$1(fragmentActivity, userSession), (CharSequence) fragmentActivity.getString(2131957976)), new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new IdentityCaptureOptions$getItems$2(userSession, fragmentActivity), (CharSequence) fragmentActivity.getString(2131957974)), new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new IdentityCaptureOptions$getItems$3(fragmentActivity, userSession), 2131957977)});
    }

    public int getTitleRes() {
        return 2131957975;
    }
}
