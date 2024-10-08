package com.instagram.notifications.actions;

import X.0kR;
import X.AnonymousClass0fD;
import X.AnonymousClass7TG;
import X.C59910bu;
import X.C66580MXl;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public final class NotificationActionReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A03 = C66580MXl.A03(this, context, intent, 1216520724);
        AnonymousClass7TG.A1N(context, intent);
        if (!C59910bu.A02().A00(context, intent, this)) {
            i = -1972662098;
        } else {
            intent.setComponent(new ComponentName(context, ActionHandlerIntentService.class));
            0kR.A00.A07().A05(context, intent);
            i = 332143916;
        }
        AnonymousClass0fD.A0E(i, A03, intent);
    }
}
