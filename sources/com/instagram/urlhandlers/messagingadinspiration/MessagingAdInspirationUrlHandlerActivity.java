package com.instagram.urlhandlers.messagingadinspiration;

import android.os.Bundle;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class MessagingAdInspirationUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.urlhandlers.messagingadinspiration.MessagingAdInspirationUrlHandlerActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onBackPressed() {
        super.onBackPressed();
        if (getSupportFragmentManager().A0U.A04().isEmpty()) {
            finish();
        }
    }
}
