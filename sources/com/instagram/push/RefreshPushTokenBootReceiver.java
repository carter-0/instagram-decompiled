package com.instagram.push;

import X.AnonymousClass0fD;
import X.AnonymousClass0fQ;
import X.AnonymousClass7TG;
import X.AnonymousClass9DB;
import X.C49787F6v;
import X.C59910bu;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class RefreshPushTokenBootReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = AnonymousClass0fD.A01(675598072);
        AnonymousClass0fQ.A01(this, context, intent);
        AnonymousClass7TG.A1N(context, intent);
        if (!C59910bu.A02().A00(context, intent, this) || !C49787F6v.A01(intent.getAction())) {
            i = 1073984376;
        } else {
            AnonymousClass9DB.A01.A00(context);
            i = -1588643420;
        }
        AnonymousClass0fD.A0E(i, A01, intent);
    }
}
