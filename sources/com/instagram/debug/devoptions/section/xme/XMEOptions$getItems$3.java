package com.instagram.debug.devoptions.section.xme;

import X.0xY;
import X.1Au;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.DbU;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class XMEOptions$getItems$3 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public XMEOptions$getItems$3(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-148374145);
        0xY A0p = AnonymousClass7TE.A0p(1Au.A00(this.$userSession));
        A0p.E5Z("meta_gallery_recents_nux_impression_count", 0);
        A0p.apply();
        DbU.A0z(this.$activity, 2131958388);
        AnonymousClass0fD.A0C(-1894194202, A05);
    }
}
