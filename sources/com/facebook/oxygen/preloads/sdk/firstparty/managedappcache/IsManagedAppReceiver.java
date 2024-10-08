package com.facebook.oxygen.preloads.sdk.firstparty.managedappcache;

import X.AnonymousClass0fD;
import X.C66580MXl;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public class IsManagedAppReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A03 = C66580MXl.A03(this, context, intent, -149583057);
        if (intent == null) {
            i = -877942130;
        } else {
            String action = intent.getAction();
            if (!action.equals("com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IS_MANAGED_APP_CHANGED")) {
                i = -1954695994;
            } else {
                Class<IsManagedAppCacheJobService> cls = IsManagedAppCacheJobService.class;
                C66580MXl.A0A(context, cls).setAction(action);
                ((JobScheduler) context.getApplicationContext().getSystemService("jobscheduler")).enqueue(new JobInfo.Builder(1517668458, new ComponentName(context, cls)).setOverrideDeadline(0).build(), new JobWorkItem(intent));
                i = -1000387589;
            }
        }
        AnonymousClass0fD.A0E(i, A03, intent);
    }
}
