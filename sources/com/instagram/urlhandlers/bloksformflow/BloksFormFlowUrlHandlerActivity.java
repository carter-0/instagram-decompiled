package com.instagram.urlhandlers.bloksformflow;

import X.AnonymousClass0fD;
import android.os.Bundle;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class BloksFormFlowUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.bloksformflow.BloksFormFlowUrlHandlerActivity, android.app.Activity] */
    public final void onPause() {
        int A00 = AnonymousClass0fD.A00(1393610211);
        super.onPause();
        setRequestedOrientation(10);
        AnonymousClass0fD.A07(911946973, A00);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.bloksformflow.BloksFormFlowUrlHandlerActivity, android.app.Activity] */
    public final void onResume() {
        int A00 = AnonymousClass0fD.A00(-1536160541);
        super.onResume();
        setRequestedOrientation(1);
        AnonymousClass0fD.A07(1902042767, A00);
    }
}
