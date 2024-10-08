package com.instagram.debug.devoptions.section.zerorating;

import X.AnonymousClass0fD;
import X.DbS;
import X.Dba;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class ZeroRatingOptions$getItems$2 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public ZeroRatingOptions$getItems$2(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1360978618);
        Dba.A12(new ZeroE2ETestFragment(), DbS.A0M(this.$activity, this.$userSession));
        AnonymousClass0fD.A0C(895621093, A05);
    }
}
