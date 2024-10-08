package com.instagram.debug.devoptions.section.xme;

import X.0sn;
import X.AnonymousClass0fD;
import X.C361588gT;
import X.C361618gW;
import X.C59689JTv;
import X.C62320sa;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class XMEOptions$getItems$2 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public XMEOptions$getItems$2(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(657644683);
        C361618gW.A00(this.$userSession, 0sn.A00);
        final UserSession userSession = this.$userSession;
        C361588gT r0 = (C361588gT) userSession.A01(C361588gT.class, new C62320sa() {
            public final C361588gT invoke() {
                return new C361588gT(userSession);
            }
        });
        r0.A04.Epw(C361588gT.A00(r0));
        FragmentActivity fragmentActivity = this.$activity;
        C59689JTv.A09(fragmentActivity, fragmentActivity.getString(2131958387));
        AnonymousClass0fD.A0C(-1791129496, A05);
    }
}
