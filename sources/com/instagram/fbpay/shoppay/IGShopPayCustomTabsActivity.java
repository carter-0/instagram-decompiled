package com.instagram.fbpay.shoppay;

import X.0qQ;
import android.content.Intent;
import com.fbpay.customtabs.CustomTabsActivity;

public final class IGShopPayCustomTabsActivity extends CustomTabsActivity {
    public final void onNewIntent(Intent intent) {
        0qQ.A0B(intent, 0);
        intent.setAction("action_custom_tab_redirect");
        super.onNewIntent(intent);
    }
}
