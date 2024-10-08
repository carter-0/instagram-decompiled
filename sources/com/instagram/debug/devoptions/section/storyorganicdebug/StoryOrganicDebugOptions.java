package com.instagram.debug.devoptions.section.storyorganicdebug;

import X.0s0;
import X.0sr;
import X.0tS;
import X.AnonymousClass07i;
import X.AnonymousClass0YZ;
import X.AnonymousClass4DH;
import X.AnonymousClass7TG;
import X.C63040xi;
import X.DbS;
import X.PR9;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

public final class StoryOrganicDebugOptions implements DeveloperOptionsSection {
    public static final StoryOrganicDebugOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r11, AnonymousClass07i r12) {
        C63040xi r7 = 0tS.A4E;
        0tS A00 = r7.A00();
        0s0 r1 = A00.A2I;
        AnonymousClass0YZ[] r6 = 0tS.A4G;
        PR9 A0f = DbS.A0f(StoryOrganicDebugOptions$getItems$1.INSTANCE, 2131958438, AnonymousClass7TG.A1a(A00, r1, r6, 41));
        0tS A002 = r7.A00();
        PR9 A0f2 = DbS.A0f(StoryOrganicDebugOptions$getItems$2.INSTANCE, 2131958437, AnonymousClass7TG.A1a(A002, A002.A2H, r6, 42));
        0tS A003 = r7.A00();
        return 0sr.A1P(new PR9[]{A0f, A0f2, DbS.A0f(StoryOrganicDebugOptions$getItems$3.INSTANCE, 2131958436, AnonymousClass7TG.A1a(A003, A003.A2G, r6, 43))});
    }

    public int getTitleRes() {
        return 2131958403;
    }
}
