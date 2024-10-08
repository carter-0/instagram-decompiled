package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.39T  reason: invalid class name */
public abstract class AnonymousClass39T {
    static {
        AnonymousClass389.A01("PackageManagerHelper");
    }

    public static void A00(Context context, Class cls, boolean z) {
        try {
            String name = cls.getName();
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, name));
            boolean z2 = false;
            if (componentEnabledSetting != 0) {
                z2 = true;
                if (componentEnabledSetting != 1) {
                    z2 = false;
                }
            }
            if (z != z2) {
                PackageManager packageManager = context.getPackageManager();
                ComponentName componentName = new ComponentName(context, name);
                int i = 2;
                if (z) {
                    i = 1;
                }
                packageManager.setComponentEnabledSetting(componentName, i, 1);
            }
            AnonymousClass389.A00();
        } catch (Exception unused) {
            AnonymousClass389.A00();
        }
    }
}
