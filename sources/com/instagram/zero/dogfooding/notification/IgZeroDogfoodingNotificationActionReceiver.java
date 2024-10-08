package com.instagram.zero.dogfooding.notification;

import X.05G;
import X.1RA;
import X.AnonymousClass0fD;
import X.AnonymousClass1R9;
import X.AnonymousClass7TF;
import X.C59910bu;
import X.C66580MXl;
import X.C70350O3c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public final class IgZeroDogfoodingNotificationActionReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        Object value;
        1RA r5;
        Context context2 = context;
        Intent intent2 = intent;
        int A03 = C66580MXl.A03(this, context2, intent2, 1292909763);
        AnonymousClass7TF.A1H(context2, intent2);
        if (!C59910bu.A02().A00(context2, intent2, this)) {
            i = 648494246;
        } else {
            Bundle extras = intent2.getExtras();
            if (extras == null) {
                i = -1928017738;
            } else {
                Integer A00 = C70350O3c.A00(extras.getString("dogfooding_mode"));
                if (A00 != null) {
                    05G r2 = AnonymousClass1R9.A03.A01;
                    do {
                        value = r2.getValue();
                        r5 = (1RA) value;
                    } while (!r2.AIY(value, 1RA.A02(r5, A00, (String) null, r5.A01 + 1, 0, 499, 0, 0, false, false, false, false, false)));
                }
                i = 1998897917;
            }
        }
        AnonymousClass0fD.A0E(i, A03, intent2);
    }
}
