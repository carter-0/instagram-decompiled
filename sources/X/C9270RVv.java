package X;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* renamed from: X.RVv  reason: case insensitive filesystem */
public abstract class C9270RVv {
    public static void A00(Intent intent, Context context) {
        if (intent != null && "com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IS_MANAGED_APP_CHANGED".equals(intent.getAction())) {
            try {
                SP0.A00(context).A02();
            } catch (IllegalStateException | SecurityException e) {
                Log.e("IsManagedAppCacheService", "onHandleIntent() isManagedForceQuery failed", e);
            }
        }
    }
}
