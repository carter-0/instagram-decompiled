package com.facebook.pushlite;

import X.C71540Omb;
import X.N1P;
import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.android.R;

public final class PushLiteFallbackJobService extends IntentService {
    public PushLiteFallbackJobService() {
        super("PushLiteFallbackJobService");
    }

    public final void onHandleIntent(Intent intent) {
        N1P.A03.A01((Bundle) null, C71540Omb.A00, R.id.jobscheduler_pushlist_refresh_token_job);
    }
}
