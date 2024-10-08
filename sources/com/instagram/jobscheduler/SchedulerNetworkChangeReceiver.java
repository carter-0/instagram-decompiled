package com.instagram.jobscheduler;

import X.AnonymousClass0fD;
import X.C61970qY;
import X.C66580MXl;
import X.DbS;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.instagram.common.session.UserSession;

public class SchedulerNetworkChangeReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A03 = C66580MXl.A03(this, context, intent, 2051876086);
        if (!(DbS.A0S(this) instanceof UserSession)) {
            ComponentName componentName = new ComponentName(context, SchedulerNetworkChangeReceiver.class);
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
            i = 799911547;
        } else {
            if (C61970qY.A0G(context)) {
                ComponentName componentName2 = new ComponentName(context, SchedulerNetworkChangeReceiver.class);
                PackageManager packageManager2 = context.getPackageManager();
                packageManager2.getClass();
                packageManager2.setComponentEnabledSetting(componentName2, 2, 1);
            }
            i = 15233489;
        }
        AnonymousClass0fD.A0E(i, A03, intent);
    }
}
