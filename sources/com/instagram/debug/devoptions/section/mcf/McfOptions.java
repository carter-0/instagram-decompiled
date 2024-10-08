package com.instagram.debug.devoptions.section.mcf;

import X.0tS;
import X.AnonymousClass07i;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C355538Qj;
import X.DbS;
import X.DbT;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

public final class McfOptions implements DeveloperOptionsSection {
    public static final McfOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r8, AnonymousClass07i r9) {
        0tS A0h = DbT.A0h();
        return AnonymousClass7TE.A1I(DbS.A0f(McfOptions$getItems$1.INSTANCE, 2131958101, AnonymousClass7TG.A1a(A0h, A0h.A1e, 0tS.A4G, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION)));
    }

    public int getTitleRes() {
        return 2131958102;
    }
}
