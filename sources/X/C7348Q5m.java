package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: X.Q5m  reason: case insensitive filesystem */
public abstract class C7348Q5m extends BroadcastReceiver {
    static {
        AnonymousClass389.A01("ConstraintProxy");
    }

    public void onReceive(Context context, Intent intent) {
        int A03 = C66580MXl.A03(this, context, intent, -760694811);
        AnonymousClass389.A00();
        Intent A0A = C66580MXl.A0A(context, SystemAlarmService.class);
        A0A.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(A0A);
        AnonymousClass0fD.A0E(46434577, A03, intent);
    }
}
