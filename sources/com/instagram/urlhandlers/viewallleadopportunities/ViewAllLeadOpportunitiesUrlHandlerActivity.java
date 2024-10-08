package com.instagram.urlhandlers.viewallleadopportunities;

import X.AnonymousClass7TG;
import X.DbT;
import X.W2F;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class ViewAllLeadOpportunitiesUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.app.Activity, com.instagram.urlhandlers.viewallleadopportunities.ViewAllLeadOpportunitiesUrlHandlerActivity, androidx.fragment.app.FragmentActivity] */
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, bundle2);
        String string = bundle2.getString("original_url");
        if (string == null || string.length() == 0) {
            finish();
        } else {
            W2F.A01(this, userSession, "com.bloks.www.ig.smb.lead_gen.all_lead_opportunities", W2F.A00(DbT.A09(string)));
        }
    }
}
