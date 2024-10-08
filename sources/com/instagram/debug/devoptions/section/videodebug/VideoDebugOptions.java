package com.instagram.debug.devoptions.section.videodebug;

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

public final class VideoDebugOptions implements DeveloperOptionsSection {
    public static final VideoDebugOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r6, AnonymousClass07i r7) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        return AnonymousClass7TE.A1I(new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new VideoDebugOptions$getItems$1(fragmentActivity, userSession), (CharSequence) fragmentActivity.getString(2131958351)));
    }

    public int getTitleRes() {
        return 2131958350;
    }
}
