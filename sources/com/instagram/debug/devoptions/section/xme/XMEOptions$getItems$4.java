package com.instagram.debug.devoptions.section.xme;

import X.0xY;
import X.1Au;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.DbU;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class XMEOptions$getItems$4 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public XMEOptions$getItems$4(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(614273533);
        0xY A0p = AnonymousClass7TE.A0p(1Au.A00(this.$userSession));
        A0p.E5Z(AnonymousClass000.A00(1848), 0);
        A0p.apply();
        DbU.A0z(this.$activity, 2131958393);
        AnonymousClass0fD.A0C(1169213798, A05);
    }
}
