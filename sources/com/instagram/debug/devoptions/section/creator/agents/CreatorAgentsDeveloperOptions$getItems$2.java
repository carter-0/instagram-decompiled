package com.instagram.debug.devoptions.section.creator.agents;

import X.00p;
import X.0xY;
import X.0xa;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C273654mx;
import X.C333357Yq;
import X.DbV;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

public final class CreatorAgentsDeveloperOptions$getItems$2 implements View.OnClickListener {
    public final /* synthetic */ UserSession $userSession;

    public CreatorAgentsDeveloperOptions$getItems$2(UserSession userSession) {
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1743316807);
        C333357Yq r6 = new C333357Yq(this.$userSession);
        0xa r5 = r6.A01;
        Iterator A16 = DbV.A16(r5.getAll());
        while (A16.hasNext()) {
            String A18 = AnonymousClass7TE.A18(A16);
            if (A18 != null && 00p.A0k(A18, "has_seen_per_creator_ai_beta_disclosure", false)) {
                0xY AR4 = r5.AR4();
                AR4.ED3(A18);
                AR4.apply();
            }
        }
        0xY AR42 = r5.AR4();
        AR42.ED3(AnonymousClass000.A00(1541));
        AR42.apply();
        r6.A04();
        0xY AR43 = r5.AR4();
        AR43.E5c("ai_call_tooltip_last_seen_timestamp", 0);
        AR43.apply();
        0xY AR44 = r5.AR4();
        AR44.E5Z(C273654mx.A00(534), 0);
        AR44.apply();
        AnonymousClass0fD.A0C(213124722, A05);
    }
}
