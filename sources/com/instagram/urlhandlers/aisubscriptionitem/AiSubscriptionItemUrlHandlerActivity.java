package com.instagram.urlhandlers.aisubscriptionitem;

import X.0qQ;
import X.AnonymousClass0iw;
import X.AnonymousClass6W8;
import X.AnonymousClass7TE;
import X.DbW;
import android.os.Bundle;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;
import java.net.URLDecoder;

public final class AiSubscriptionItemUrlHandlerActivity extends UserSessionUrlHandlerActivity implements AnonymousClass0iw {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [android.content.Context, com.instagram.urlhandlers.aisubscriptionitem.AiSubscriptionItemUrlHandlerActivity, android.app.Activity] */
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        String str;
        String str2;
        0qQ.A0B(userSession, 1);
        try {
            String stringExtra = getIntent().getStringExtra(DialogModule.KEY_TITLE);
            String str3 = null;
            if (stringExtra != null) {
                str = URLDecoder.decode(stringExtra, ReactWebViewManager.HTML_ENCODING);
            } else {
                str = null;
            }
            String stringExtra2 = getIntent().getStringExtra("time");
            if (stringExtra2 != null) {
                str2 = URLDecoder.decode(stringExtra2, ReactWebViewManager.HTML_ENCODING);
            } else {
                str2 = null;
            }
            String stringExtra3 = getIntent().getStringExtra("frequency");
            if (stringExtra3 != null) {
                str3 = URLDecoder.decode(stringExtra3, ReactWebViewManager.HTML_ENCODING);
            }
            String stringExtra4 = getIntent().getStringExtra("subscription_id");
            String stringExtra5 = getIntent().getStringExtra("product_type");
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("bottom_sheet_content_fragment", "ai_subscription_item");
            A0a.putBoolean("finish_host_activity_on_dismissed", true);
            A0a.putString("ai_subscription_title", str);
            A0a.putString("ai_subscription_time", str2);
            A0a.putString("ai_subscription_frequency", str3);
            A0a.putString("ai_subscription_subscription_id", stringExtra4);
            A0a.putString("ai_subscription_product_type", stringExtra5);
            AnonymousClass6W8 A0W = DbW.A0W(this, A0a, userSession, TransparentModalActivity.class, "bottom_sheet");
            A0W.A0H = true;
            A0W.A0C(this);
        } finally {
            finish();
        }
    }

    public final String getModuleName() {
        return "ai_subscription_item_fragment";
    }
}
