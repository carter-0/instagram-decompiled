package X;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* renamed from: X.Mej  reason: case insensitive filesystem */
public abstract class C66901Mej {
    public static float A00(Context context) {
        return Settings.System.getFloat(context.getContentResolver(), "font_scale", 1.0f);
    }

    public static boolean A01(Context context, String str) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getApplicationContext().getSystemService("accessibility");
        if (accessibilityManager == null || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo id : enabledAccessibilityServiceList) {
            if (id.getId().contains(str)) {
                return true;
            }
        }
        return false;
    }
}
