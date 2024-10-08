package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.2rk  reason: invalid class name and case insensitive filesystem */
public abstract class C231482rk {
    public static boolean A00() {
        SharedPreferences sharedPreferences;
        Context context = C60960kU.A00;
        if (context != null) {
            sharedPreferences = context.getSharedPreferences("BinderGroupDebugUtil_Prefs", 0);
        } else {
            sharedPreferences = null;
        }
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("binder_group_name_overlay_enabled", false);
        }
        return false;
    }

    public static boolean A01() {
        SharedPreferences sharedPreferences;
        Context context = C60960kU.A00;
        if (context != null) {
            sharedPreferences = context.getSharedPreferences("BinderGroupDebugUtil_Prefs", 0);
        } else {
            sharedPreferences = null;
        }
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("recyclerview_bind_debug_enabled", false);
        }
        return false;
    }
}
