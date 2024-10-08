package androidx.work.impl.background.systemalarm;

import X.AnonymousClass0fD;
import X.AnonymousClass385;
import X.AnonymousClass389;
import X.C66580MXl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class RescheduleReceiver extends BroadcastReceiver {
    public static final String A00 = AnonymousClass389.A01("RescheduleReceiver");

    public final void onReceive(Context context, Intent intent) {
        int A03 = C66580MXl.A03(this, context, intent, 1184958104);
        AnonymousClass389.A00();
        String str = A00;
        try {
            AnonymousClass385 A002 = AnonymousClass385.A00(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (AnonymousClass385.A0C) {
                BroadcastReceiver.PendingResult pendingResult = A002.A00;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                A002.A00 = goAsync;
                if (A002.A08) {
                    goAsync.finish();
                    A002.A00 = null;
                }
            }
        } catch (IllegalStateException e) {
            AnonymousClass389.A00();
            Log.e(str, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
        AnonymousClass0fD.A0E(534565690, A03, intent);
    }
}
