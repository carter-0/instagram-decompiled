package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: X.45S  reason: invalid class name */
public abstract class AnonymousClass45S {
    public static final boolean A00(Context context) {
        0qQ.A0B(context, 0);
        try {
            Object systemService = context.getSystemService("connectivity");
            0qQ.A0C(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e) {
            0KC.A0F("NetworkUtils", "Unable to check internet", e);
            return false;
        }
    }
}
