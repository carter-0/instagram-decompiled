package com.instagram.urlhandlers.aisubscriptionall;

import X.0qQ;
import X.AnonymousClass0iw;
import X.AnonymousClass6W8;
import X.AnonymousClass7TE;
import X.DbW;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class AiSubscriptionAllUrlHandlerActivity extends UserSessionUrlHandlerActivity implements AnonymousClass0iw {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, android.app.Activity, com.instagram.urlhandlers.aisubscriptionall.AiSubscriptionAllUrlHandlerActivity] */
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        String stringExtra = getIntent().getStringExtra("product_type");
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("bottom_sheet_content_fragment", "ai_subscription_all");
        A0a.putBoolean("finish_host_activity_on_dismissed", true);
        A0a.putString("ai_subscription_product_type", stringExtra);
        AnonymousClass6W8 A0W = DbW.A0W(this, A0a, userSession, TransparentModalActivity.class, "bottom_sheet");
        A0W.A0H = true;
        A0W.A0C(this);
        finish();
    }

    public final String getModuleName() {
        return "ai_subscription_all_fragment";
    }
}
