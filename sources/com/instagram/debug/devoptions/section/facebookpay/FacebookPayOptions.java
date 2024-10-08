package com.instagram.debug.devoptions.section.facebookpay;

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

public final class FacebookPayOptions implements DeveloperOptionsSection {
    public static final FacebookPayOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r7, AnonymousClass07i r8) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        return 0sr.A1P(new C50989Fmc[]{new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new FacebookPayOptions$getItems$1(fragmentActivity), (CharSequence) fragmentActivity.getString(2131957648)), new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new FacebookPayOptions$getItems$2(fragmentActivity, userSession), (CharSequence) fragmentActivity.getString(2131957646))});
    }

    public int getTitleRes() {
        return 2131957658;
    }
}
