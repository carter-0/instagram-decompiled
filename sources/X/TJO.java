package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;

public final class TJO implements Runnable {
    public final /* synthetic */ BroadcastReceiver.PendingResult A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Intent A02;
    public final /* synthetic */ ConstraintProxyUpdateReceiver A03;

    public TJO(BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent, ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver) {
        this.A03 = constraintProxyUpdateReceiver;
        this.A02 = intent;
        this.A01 = context;
        this.A00 = pendingResult;
    }

    public final void run() {
        try {
            Intent intent = this.A02;
            boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
            boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
            AnonymousClass389.A00();
            Context context = this.A01;
            AnonymousClass39T.A00(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
            AnonymousClass39T.A00(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
            AnonymousClass39T.A00(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
            AnonymousClass39T.A00(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
        } finally {
            this.A00.finish();
        }
    }
}
