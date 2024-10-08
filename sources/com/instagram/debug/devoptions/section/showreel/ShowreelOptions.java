package com.instagram.debug.devoptions.section.showreel;

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

public final class ShowreelOptions implements DeveloperOptionsSection {
    public static final ShowreelOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r12, AnonymousClass07i r13) {
        C63040xi r8 = 0tS.A4E;
        PR9 A0f = DbS.A0f(ShowreelOptions$getItems$1.INSTANCE, 2131958330, r8.A00().A0d());
        PR9 A0f2 = DbS.A0f(ShowreelOptions$getItems$2.INSTANCE, 2131958327, r8.A00().A0c());
        0tS A00 = r8.A00();
        0s0 r1 = A00.A1l;
        AnonymousClass0YZ[] r5 = 0tS.A4G;
        PR9 A0f3 = DbS.A0f(ShowreelOptions$getItems$3.INSTANCE, 2131958326, AnonymousClass7TG.A1a(A00, r1, r5, 37));
        0tS A002 = r8.A00();
        return 0sr.A1P(new PR9[]{A0f, A0f2, A0f3, DbS.A0f(ShowreelOptions$getItems$4.INSTANCE, 2131958329, AnonymousClass7TG.A1a(A002, A002.A1n, r5, 38))});
    }

    public int getTitleRes() {
        return 2131958328;
    }
}
