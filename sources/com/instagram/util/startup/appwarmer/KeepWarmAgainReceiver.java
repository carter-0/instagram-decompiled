package com.instagram.util.startup.appwarmer;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass0fQ;
import X.AnonymousClass9NC;
import X.C377169Ku;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class KeepWarmAgainReceiver extends BroadcastReceiver {
    public BroadcastReceiver.PendingResult A00;

    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0fD.A01(-786625331);
        AnonymousClass0fQ.A01(this, context, intent);
        0qQ.A0B(context, 0);
        0qQ.A0B(intent, 1);
        try {
            BroadcastReceiver.PendingResult pendingResult = this.A00;
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (IllegalStateException unused) {
        }
        this.A00 = goAsync();
        new AnonymousClass9NC(new C377169Ku(this, 0)).start();
        AnonymousClass0fD.A0E(-528187735, A01, intent);
    }
}
