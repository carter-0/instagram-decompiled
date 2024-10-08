package com.facebook.appcomponentmanager.testreceivers;

import X.0KC;
import X.AnonymousClass0fD;
import X.C51968G9o;
import X.C66580MXl;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class AppComponentManagerTestingReceiver extends BroadcastReceiver {
    public static void A00(PackageManager packageManager, ComponentInfo[] componentInfoArr) {
        for (ComponentInfo componentInfo : componentInfoArr) {
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name));
            if (!(componentEnabledSetting == 0 || componentEnabledSetting == 1 || componentEnabledSetting == 2)) {
                0KC.A0P("AppComponentManagerTestingReceiver", "%s is marked as currently in state %d, which is not an expected state. Conservatively assuming it's disabled.", C51968G9o.A1Z(componentInfo.name, componentEnabledSetting));
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        int i;
        int A03 = C66580MXl.A03(this, context, intent, 1663029907);
        String action = intent.getAction();
        if (action == null) {
            0KC.A0D("AppComponentManagerTestingReceiver", "Intent Action was null. Please supply an action.");
            i = -1666263287;
        } else {
            if (action.equals("com.facebook.appcomponentmanager.ACTION_GET_CURRENT_ENABLE_STAGE")) {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    0KC.A0C("AppComponentManagerTestingReceiver", "PackageManager received from context was null. Aborting.");
                } else {
                    if (packageManager.getComponentEnabledSetting(new ComponentName(context.getPackageName(), SecondEnableStageTestReceiver.class.getCanonicalName())) == 1) {
                        str = "Enable Stage: Warm Pre-TOS.";
                    } else {
                        str = "Enable Stage: Cold Pre-TOS.";
                    }
                    0KC.A0D("AppComponentManagerTestingReceiver", str);
                }
            } else if (!action.equals("com.facebook.appcomponentmanager.ACTION_PRINT_COMPONENTS")) {
                0KC.A0P("AppComponentManagerTestingReceiver", "Intent Action %s is not a known action.", new Object[]{action});
            } else {
                PackageManager packageManager2 = context.getPackageManager();
                try {
                    PackageInfo packageInfo = packageManager2.getPackageInfo(context.getPackageName(), 33423);
                    A00(packageManager2, packageInfo.activities);
                    A00(packageManager2, packageInfo.receivers);
                    A00(packageManager2, packageInfo.services);
                    A00(packageManager2, packageInfo.providers);
                } catch (PackageManager.NameNotFoundException e) {
                    0KC.A0G("AppComponentManagerTestingReceiver", "Ran into NameNotFoundException", e);
                }
            }
            i = 1835159994;
        }
        AnonymousClass0fD.A0E(i, A03, intent);
    }
}
