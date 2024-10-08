package com.facebook.oxygen.preloads.sdk.firstparty.managedappcache;

import X.C9270RVv;
import android.app.IntentService;
import android.content.Intent;

public class IsManagedAppCacheService extends IntentService {
    public IsManagedAppCacheService() {
        super("IsManagedAppCacheService");
    }

    public final void onHandleIntent(Intent intent) {
        C9270RVv.A00(intent, this);
    }
}
