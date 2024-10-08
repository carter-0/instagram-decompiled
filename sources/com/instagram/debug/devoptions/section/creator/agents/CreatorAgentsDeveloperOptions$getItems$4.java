package com.instagram.debug.devoptions.section.creator.agents;

import X.0sl;
import X.0xY;
import X.AnonymousClass0fD;
import X.C333357Yq;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class CreatorAgentsDeveloperOptions$getItems$4 implements View.OnClickListener {
    public final /* synthetic */ UserSession $userSession;

    public CreatorAgentsDeveloperOptions$getItems$4(UserSession userSession) {
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-608134035);
        C333357Yq r0 = new C333357Yq(this.$userSession);
        0sl r2 = 0sl.A00;
        0xY AR4 = r0.A01.AR4();
        AR4.E5h("creators_banner_shown_on", r2);
        AR4.apply();
        AnonymousClass0fD.A0C(-532216953, A05);
    }
}
