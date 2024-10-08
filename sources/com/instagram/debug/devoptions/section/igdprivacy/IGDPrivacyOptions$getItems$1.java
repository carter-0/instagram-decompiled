package com.instagram.debug.devoptions.section.igdprivacy;

import X.AnonymousClass0fD;
import X.DbS;
import X.Dba;
import X.E2B;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class IGDPrivacyOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public IGDPrivacyOptions$getItems$1(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(281485074);
        Dba.A12(new E2B(), DbS.A0M(this.$activity, this.$userSession));
        AnonymousClass0fD.A0C(1822858803, A05);
    }
}
