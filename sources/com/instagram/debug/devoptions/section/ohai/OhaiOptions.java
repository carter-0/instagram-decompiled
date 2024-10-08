package com.instagram.debug.devoptions.section.ohai;

import X.0tS;
import X.AnonymousClass07i;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.DbS;
import X.DbT;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

public final class OhaiOptions implements DeveloperOptionsSection {
    public static final OhaiOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r8, AnonymousClass07i r9) {
        0tS A0h = DbT.A0h();
        return AnonymousClass7TE.A1I(DbS.A0f(OhaiOptions$getItems$1.INSTANCE, 2131957866, AnonymousClass7TG.A1a(A0h, A0h.A0t, 0tS.A4G, 44)));
    }

    public int getTitleRes() {
        return 2131958144;
    }
}
