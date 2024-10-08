package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FiP  reason: case insensitive filesystem */
public final class C50783FiP implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        String str;
        0qQ.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("origin");
        if (queryParameter == null) {
            queryParameter = "qp";
        }
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
        A0M.A0E = true;
        FC8.A00();
        if (182.A06(0Tu.A05, userSession, 36318986484390695L)) {
            str = "com.bloks.www.ig_subscriptions.creator_experience.special_deals";
        } else {
            str = "com.instagram.user_pay.fan_club.screens.creator_onboarding.special_deals";
        }
        A0M.A0D(C46649DiU.A02(userSession, str, DbY.A0m("origin", queryParameter)));
        A0M.A04();
    }

    public C50783FiP(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
