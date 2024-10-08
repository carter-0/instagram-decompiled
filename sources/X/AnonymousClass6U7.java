package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.6U7  reason: invalid class name */
public final class AnonymousClass6U7 {
    public final PackageManager A00;
    public final 0la A01;
    public final Context A02;
    public final boolean A03;

    public AnonymousClass6U7(Context context, PackageManager packageManager, 0la r4, boolean z) {
        0qQ.A0B(r4, 4);
        this.A02 = context;
        this.A03 = z;
        this.A00 = packageManager;
        this.A01 = r4;
    }

    public static final AnonymousClass6U7 A00(Context context, UserSession userSession) {
        return AnonymousClass6U6.A00(context, userSession);
    }

    public final void A01() {
        if (this.A03) {
            Context context = this.A02;
            ComponentName componentName = new ComponentName(context, "com.instagram.android.InternalLauncher");
            ComponentName componentName2 = new ComponentName(context, "com.instagram.android.activity.MainTabActivity");
            PackageManager packageManager = this.A00;
            if (packageManager.getComponentEnabledSetting(componentName2) == 2) {
                packageManager.setComponentEnabledSetting(componentName2, 1, 1);
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
            }
        }
    }

    public final void A02() {
        if (this.A03) {
            Context context = this.A02;
            ComponentName componentName = new ComponentName(context, "com.instagram.android.InternalLauncher");
            ComponentName componentName2 = new ComponentName(context, "com.instagram.android.activity.MainTabActivity");
            PackageManager packageManager = this.A00;
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            int componentEnabledSetting2 = packageManager.getComponentEnabledSetting(componentName2);
            0la r1 = this.A01;
            if ((r1 == 0la.A09 || r1 == 0la.A0A) && componentEnabledSetting != 1) {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
                packageManager.setComponentEnabledSetting(componentName2, 2, 1);
            } else if (r1 == 0la.A0C && componentEnabledSetting2 == 2) {
                packageManager.setComponentEnabledSetting(componentName2, 1, 1);
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
            }
        }
    }
}
