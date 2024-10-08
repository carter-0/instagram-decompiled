package com.facebook.react.modules.i18nmanager;

import X.0qQ;
import android.content.Context;
import android.text.TextUtils;
import java.util.Locale;

public final class I18nUtil {
    public static final I18nUtil A00 = new Object();

    public final boolean A00(Context context) {
        0qQ.A0B(context, 0);
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    public final boolean A01(Context context) {
        0qQ.A0B(context, 0);
        if ((context.getApplicationInfo().flags & 4194304) == 0) {
            return false;
        }
        if (context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_forceRTL", false)) {
            return true;
        }
        String property = System.getProperty("FORCE_RTL_FOR_TESTING", "false");
        if (property != null && property.equalsIgnoreCase("true")) {
            return true;
        }
        if (!context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_allowRTL", true) || TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
            return false;
        }
        return true;
    }
}
