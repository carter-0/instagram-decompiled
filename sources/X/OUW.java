package X;

import android.content.Context;
import android.os.Build;

public final class OUW {
    public static final OUW A00 = new Object();

    public final boolean A00(Context context) {
        if (Build.VERSION.SDK_INT < 33 || 1DL.A07(context, "android.permission.POST_NOTIFICATIONS") || context.getSharedPreferences("BARCELONA_DEVICE_PREFERENCE", 0).getBoolean("has_notification_permission_dialog_shown", false)) {
            return false;
        }
        return true;
    }
}
