package com.instagram.debug.devoptions.section.facebookpay;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C46649DiU;
import X.DbS;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;

public final class FacebookPayOptions$getItems$2 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public FacebookPayOptions$getItems$2(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(648592298);
        C46649DiU A04 = C46649DiU.A04("com.bloks.www.fbpay.ecp.playground", AnonymousClass7TE.A1E());
        FragmentActivity fragmentActivity = this.$activity;
        IgBloksScreenConfig A0N = DbS.A0N(this.$userSession);
        A0N.A0R = "";
        A0N.A0U = fragmentActivity.getResources().getString(2131957646);
        C46649DiU.A07(fragmentActivity, A0N, A04);
        AnonymousClass0fD.A0C(-1709450148, A05);
    }
}
