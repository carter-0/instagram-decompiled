package X;

import android.content.ComponentName;
import android.content.Context;

public abstract class RV0 {
    public static void A00(ComponentName componentName, Context context, IllegalArgumentException illegalArgumentException) {
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(componentName);
        if (componentEnabledSetting == 1 || componentEnabledSetting == 0) {
            throw illegalArgumentException;
        }
    }
}
