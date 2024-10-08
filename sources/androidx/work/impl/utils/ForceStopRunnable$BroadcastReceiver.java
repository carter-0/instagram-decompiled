package androidx.work.impl.utils;

import X.AnonymousClass0fD;
import X.AnonymousClass0fQ;
import X.AnonymousClass389;
import X.AnonymousClass39r;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    static {
        AnonymousClass389.A01("ForceStopRunnable$Rcvr");
    }

    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0fD.A01(10042950);
        AnonymousClass0fQ.A01(this, context, intent);
        if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            AnonymousClass389.A00();
            AnonymousClass39r.A00(context);
        }
        AnonymousClass0fD.A0E(2044285295, A01, intent);
    }
}
