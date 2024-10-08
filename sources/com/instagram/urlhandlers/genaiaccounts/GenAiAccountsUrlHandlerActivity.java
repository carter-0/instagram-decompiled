package com.instagram.urlhandlers.genaiaccounts;

import X.AnonymousClass0iw;
import X.AnonymousClass6W8;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.DbW;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class GenAiAccountsUrlHandlerActivity extends UserSessionUrlHandlerActivity implements AnonymousClass0iw {
    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "gen_ai_accounts_fragment";
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.urlhandlers.genaiaccounts.GenAiAccountsUrlHandlerActivity, android.content.Context, android.app.Activity] */
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        AnonymousClass7TF.A1B(userSession, 1, bundle2);
        Class<TransparentModalActivity> cls = TransparentModalActivity.class;
        try {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("bottom_sheet_content_fragment", "gen_ai_accounts");
            A0a.putBoolean("finish_host_activity_on_dismissed", true);
            String string = bundle2.getString("external_link_thread_viewer_session_id");
            if (string != null) {
                A0a.putString("external_link_thread_viewer_session_id", string);
            }
            String string2 = bundle2.getString("external_link_thread_session_entry_point");
            if (string2 != null) {
                A0a.putString("external_link_thread_session_entry_point", string2);
            }
            AnonymousClass6W8 A0W = DbW.A0W(this, A0a, userSession, cls, "bottom_sheet");
            A0W.A0H = true;
            A0W.A0C(this);
        } finally {
            finish();
        }
    }
}
