package com.instagram.debug.devoptions.section.xdms;

import X.0qQ;
import X.0sr;
import X.AnonymousClass07i;
import X.AnonymousClass4DH;
import X.C50989Fmc;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

public final class XDMSOptions implements DeveloperOptionsSection {
    public static final XDMSOptions INSTANCE = new Object();

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r16, AnonymousClass07i r17) {
        0qQ.A0B(fragmentActivity, 1);
        return 0sr.A1P(new C50989Fmc[]{C50989Fmc.A00(fragmentActivity, new XDMSOptions$getItems$1(fragmentActivity), 2131958370), C50989Fmc.A00(fragmentActivity, new XDMSOptions$getItems$2(fragmentActivity), 2131958376), C50989Fmc.A00(fragmentActivity, new XDMSOptions$getItems$3(fragmentActivity), 2131958368), C50989Fmc.A00(fragmentActivity, new XDMSOptions$getItems$4(fragmentActivity), 2131958382), C50989Fmc.A00(fragmentActivity, new XDMSOptions$getItems$5(fragmentActivity), 2131958378), C50989Fmc.A00(fragmentActivity, new XDMSOptions$getItems$6(fragmentActivity), 2131958381), C50989Fmc.A00(fragmentActivity, new XDMSOptions$getItems$7(fragmentActivity), 2131958372), C50989Fmc.A00(fragmentActivity, new XDMSOptions$getItems$8(fragmentActivity), 2131958374), C50989Fmc.A00(fragmentActivity, new XDMSOptions$getItems$9(fragmentActivity), 2131958380), C50989Fmc.A00(fragmentActivity, new XDMSOptions$getItems$10(fragmentActivity), 2131958364), C50989Fmc.A00(fragmentActivity, new XDMSOptions$getItems$11(fragmentActivity), 2131958366)});
    }

    public int getTitleRes() {
        return 2131958301;
    }
}
