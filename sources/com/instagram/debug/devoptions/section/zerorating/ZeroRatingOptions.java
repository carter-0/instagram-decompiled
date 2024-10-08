package com.instagram.debug.devoptions.section.zerorating;

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

public final class ZeroRatingOptions implements DeveloperOptionsSection {
    public static final ZeroRatingOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r10, AnonymousClass07i r11) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        return 0sr.A1P(new C50989Fmc[]{new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new ZeroRatingOptions$getItems$1(fragmentActivity, userSession), (CharSequence) "Zero Rating Options"), new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new ZeroRatingOptions$getItems$2(fragmentActivity, userSession), (CharSequence) "Zero E2E Test"), new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new ZeroRatingOptions$getItems$3(fragmentActivity, userSession), (CharSequence) "Zero Dogfood Carrier"), new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new ZeroRatingOptions$getItems$4(userSession, fragmentActivity), 2131958211), new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new ZeroRatingOptions$getItems$5(userSession, fragmentActivity), 2131957917)});
    }

    public int getTitleRes() {
        return 2131958402;
    }
}
