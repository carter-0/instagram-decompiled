package com.instagram.api.useragent;

import X.1Ch;
import X.AnonymousClass0fD;
import X.AnonymousClass1C8;
import X.AnonymousClass7TG;
import X.C66580MXl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class LocationChangeReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int A03 = C66580MXl.A03(this, context, intent, -529250968);
        AnonymousClass7TG.A1N(context, intent);
        synchronized (1Ch.class) {
            1Ch.A00 = null;
        }
        synchronized (AnonymousClass1C8.class) {
            AnonymousClass1C8.A01 = null;
        }
        AnonymousClass0fD.A0E(-865659131, A03, intent);
    }
}
